package org.marketcetera.photon.positions.ui;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface to configure the way positions are labeled.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: IPositionLabelProvider.java 10492 2009-04-14 00:11:35Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: IPositionLabelProvider.java 10492 2009-04-14 00:11:35Z klim $")
public interface IPositionLabelProvider {

	/**
	 * Returns the user-friendly/human-readable name for a given trader id.
	 * 
	 * @param traderId the trader id
	 * @return the trader name
	 */
	String getTraderName(String traderId);
}
