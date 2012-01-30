package org.marketcetera.saclient;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * This interface enables the clients to receive all the data emitted
 * by the strategies running on the strategy agent.
 *
 * @author anshul@marketcetera.com
 * @version $Id: DataReceiver.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: DataReceiver.java 10885 2009-11-17 19:22:56Z klim $")
public interface DataReceiver {
    /**
     * Provides the data received from the remote source.
     *
     * @param inObject the data received from the remote source.
     */
    public void receiveData(Object inObject);
}
