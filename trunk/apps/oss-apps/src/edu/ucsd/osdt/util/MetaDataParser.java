/*!
@file MetaDataParser.java
@brief A parser to process instrument metadata to form a dataturbine channel map in conjunction with MDParserInterface.java
@author Lawrence J. Miller 
@date Mon May 19 2008
@note $HeadURL:http://nladr-cvs.sdsc.edu/svn-private/NEON/telepresence/dataturbine/trunk/src/edu/sdsc/cleos/ISOtoRbnbTime.java $
@note $LastChangedRevision:129M $
@author $LastChangedBy:(local) $
@date $LastChangedDate:2007-03-16 15:30:24 -0700 (Fri, 16 Mar 2007) $
*/

package edu.ucsd.osdt.util;
import com.rbnb.sapi.ChannelMap;

public abstract class MetaDataParser {
	protected ChannelMap cmap;
	protected String[] channels;
	protected String[] units;
}