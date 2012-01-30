package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.trade.Instrument;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Key for top of book data.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: TopOfBookKey.java 10875 2009-11-16 15:39:07Z will $
 * @since 1.5.0
 */
@ClassVersion("$Id: TopOfBookKey.java 10875 2009-11-16 15:39:07Z will $")
public class TopOfBookKey extends Key {

	/**
	 * Constructor.
	 * 
	 * @param instrument
	 *            the instrument
	 */
	public TopOfBookKey(final Instrument instrument) {
		super(instrument);
	}
}