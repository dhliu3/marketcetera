package org.marketcetera.client.jms;

import org.marketcetera.util.misc.ClassVersion;

/**
 * A type-safe message handler.
 *
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: ReceiveOnlyHandler.java 10407 2009-03-10 12:06:21Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: ReceiveOnlyHandler.java 10407 2009-03-10 12:06:21Z tlerios $")
public interface ReceiveOnlyHandler<T>
{
    /**
     * Handles the given message. Changing the name of this method
     * requires changing the implementation of {@link
     * IncomingJmsFactory} as well.
     *
     * @param msg The message.
     */

    void receiveMessage
        (T msg);
}
