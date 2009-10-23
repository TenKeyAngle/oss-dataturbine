import com.ziclix.python.sql as sql
import configReader as cr
import time
import java.text.SimpleDateFormat as sdf
import java.sql.Date as date1
import java.sql.SQLException as SQLExcept
import java.sql.SQLWarning as SQLWarn

class DBOperator:
    def __init__ (self, cfg):
        self.dbURL = cfg.paramDict["dbServerName"]
        self.user = cfg.paramDict["dbUserName"]
        self.pw = cfg.paramDict["dbPassword"]
        self.drv = cfg.paramDict['jdbcDriverName']

    def connect (self):
        
        connectToDB = False
        print 'Trying to connect to the DB connection'
        
        while connectToDB:
            connectToDB = self.establishDBConn()
        
        print "DB connection established"
        
    def establishDBConn(self):
        try:
            self.db = sql.zxJDBC.connect(self.dbURL, self.user, self.pw, self.drv)
            return True
        except:
            print 'trying to connect to the DB'
            time.sleep(10)
            return False

    def execQuery (self, qStr):
        try:
            cursor = self.db.cursor()
            cursor.datahandler = sql.handler.MySQLDataHandler(cursor.datahandler)
            cursor.execute(qStr)
            self.db.commit()
            cursor.close()
            
        except SQLExcept, e:
            print 'SQL error' + e.message
        except SQLWarn, e2:
            print 'SQL error' + e2.message
        except:
            print 'SQL error'
            
    def execEAVQuery(self, cfg, chName, tStamp, val):
        queries = cfg.EAVqueries[chName]
        # some queries are multilines
        queries = queries.split(";")
        for q1 in queries:
            q1 = q1.replace ("$$$$$", val)
            q1 = q1.replace ("%%%%%", "'" + (self.convertTime(cfg.paramDict['DBTimeFormat'], tStamp))+"'")
            print q1
            self.execQuery(q1)
    
    def convertTime(self, timeFormatStr, ts):
        # from milliseconds to seconds
        #print ts
        ts = ts * 1000L
        ts = long(ts)
        #print ts
        d1 = date1(ts)
        formatter = sdf(timeFormatStr)
        formattedDate = "'" + formatter.format(d1) +"'"
        #print formattedDate
        return formattedDate
        
    def execRowQuery (self, cfg, oneDataRowQ, chNames, tStamp, vals):

        #print 'execRowQuery'
        # just in case for multi-line queries
        queries = oneDataRowQ.split(";")
        
        #print 'queries', queries
        for q1 in queries:
            # start with the time stamp
            chMapping = cfg.RowQueries[oneDataRowQ]
            colNames = chMapping ["TimeStampForDB"]
            values = str( self.convertTime(cfg.paramDict['DBTimeFormat'], tStamp))
            
            # build a list of column names
            #   and a list of values 
            for chN in chNames:
                colNames = colNames + ", " + chMapping[chN]
                #print colNames
            for v1 in vals:
                values = values + " ," + str(v1)
                #print values
                    
            q1 = q1.replace ("#####", colNames)
            q1 = q1.replace ("$$$$$", values)
        
            print q1
            self.execQuery (q1)
        
       # print 'execRow is finished'

    def close(self):
        print 'DB connection closing'
        self.db.close()

if __name__=='__main__':
    cfg = cr.configReader("eav.xml")
    cfg.parseParams()
    dbop = DBOperator (cfg)
    dbop.connect()
    #dbop.execEAVQuery(cfg, "/FakeDAQ/ch0", 1234, '10000')
    #dbop.execQuery("select * from test;")
    dbop.execRowQuery(cfg, ["FakeDAQ/0", "FakeDAQ/1"],  1211342323.1234, [0,1])
    dbop.close()
    dstr = dbop.convertTime("yyyy-MM-dd HH:mm:ss.SSS", 1211342323.1234)
    print dstr