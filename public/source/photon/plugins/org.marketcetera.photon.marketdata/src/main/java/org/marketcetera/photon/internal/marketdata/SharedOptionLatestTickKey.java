package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Key for latest tick data for an entire option chain that shares a common
 * underlying equity.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: SharedOptionLatestTickKey.java 10886 2009-11-17 19:31:49Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: SharedOptionLatestTickKey.java 10886 2009-11-17 19:31:49Z klim $")
public class SharedOptionLatestTickKey extends Key {

    /**
     * Constructor.
     * 
     * @param underlying
     *            the underlying equity
     */
    public SharedOptionLatestTickKey(final Equity underlying) {
        super(underlying);
    }
}