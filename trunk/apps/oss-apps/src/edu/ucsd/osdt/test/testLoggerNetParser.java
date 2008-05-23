/*!
 * @file testLoggerNetParser.java
 * @author Lawrence J. Miller <ljmiller@sdsc.edu>
 * @author $LastChangedBy: ljmiller.ucsd $
 * @author Cyberinfrastructure Laboratory for Environmental Observing Systems (CLEOS)
 * @author San Diego Supercomputer Center (SDSC)
 * @date $LastChangedDate: 2008-05-20 08:48:42 -0700 (Tue, 20 May 2008) $
 * @version $LastChangedRevision: 57 $
 * @note $HeadURL: https://oss-dataturbine.googlecode.com/svn/trunk/apps/oss-apps/src/edu/ucsd/osdt/source/numeric/LoggerNetSource.java $
 */
package edu.ucsd.osdt.test;

import com.rbnb.sapi.ChannelMap;
import com.rbnb.sapi.SAPIException;
import edu.ucsd.osdt.source.numeric.LoggerNetParser;
import java.io.IOException;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testLoggerNetParser {
	private Logger logger = Logger.getLogger(getClass().getName());
	private LoggerNetParser aParser = null;
	private static String loggernetHeader1 = "\"TIMESTAMP\",\"RECORD\",\"AirTemp_C_Max\",\"AirTemp_C_TMx\",\"AirTemp_C_Min\",\"AirTemp_C_TMn\",\"AirTemp_C_Avg\",\"RH_Avg\",\"Rain_mm_Tot\",\"WindSp_ms_Max\",\"WindSp_ms_TMx\",\"BP_mbar_Avg\",\"SoilTemp_C_Avg\",\"SoilWVC_Avg\"";
	private static String loggernetHeader2	= "\"TS\",\"RN\",\"Deg C\",\"Deg C\",\"Deg C\",\"Deg C\",\"Deg C\",\"%\",\"mm\",\"meters/second\",\"meters/second\",\"mbar\",\"Deg C\",\"%\"";
	private static String[] channelsArray = {"TIMESTAMP", "RECORD", "AirTemp_C_Max", "AirTemp_C_TMx", "AirTemp_C_Min", "AirTemp_C_TMn", "AirTemp_C_Avg", "RH_Avg", "Rain_mm_Tot", "WindSp_ms_Max", "WindSp_ms_TMx", "BP_mbar_Avg", "SoilTemp_C_Avg", "SoilWVC_Avg"};
	private static String[] unitsArray = {"TS", "RN", "Deg C", "Deg C", "Deg C", "Deg C", "Deg C", "%", "mm", "meters/second", "meters/second", "mbar", "Deg C", "%"};
	
	@Before public void setUp() {
		aParser = new LoggerNetParser();
		try {
			aParser.parse(loggernetHeader1 + "\n" + loggernetHeader2 + "\n");
		} catch(IOException ioe) {
			Assert.fail("Got IO Exception: " + ioe);
		} catch(SAPIException sae) {
			Assert.fail("Got a SAPI Exception: " + sae);
		}
	}
	
	@Test public void testParse() {
		ChannelMap map = aParser.getCmap();
		Assert.assertTrue(map.GetChannelList().length == loggernetHeader1.split(",").length); 
	}
	
	@Test public void testChannels() {
		ChannelMap map = aParser.getCmap();
		String[] cmapChannels = map.GetChannelList();
		boolean channelsSame = true;
		// does a lexigraphic comparison of distinct string objects
		for(int i=0; i<channelsArray.length; i++) {
			logger.finer(channelsArray[i] + " =? " + cmapChannels[i]);
			channelsSame &= ( channelsArray[i].compareTo(cmapChannels[i]) == 0 );
		}
		Assert.assertTrue(channelsSame);
	}

	/* This test does not work because the PutUserInfo call does not work until a successful Flush is performed, which is integration level, not unit
	@Test public void testUnits() {
		ChannelMap map = aParser.getCmap();
		String[] cmapChannels = map.GetChannelList();
		boolean unitsSame = true;
		// does a lexigraphic comparison of distinct string objects
		String cmapUnits = "";
		for(int i=0; i<channelsArray.length; i++) {
			logger.finer(channelsArray[i] + " =? " + cmapChannels[i]);
			cmapUnits = map.GetUserInfo(map.GetIndex(cmapChannels[i]));
			unitsSame &= ( ("units=" + unitsArray[i]).compareTo(cmapUnits) == 0 );
		}
		Assert.assertTrue(unitsSame);
	}
	*/
	
	@After public void tearDown() {
		aParser = null;
	}
}

