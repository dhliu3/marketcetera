package org.marketcetera.ors.exchange;

import quickfix.Application;
import quickfix.Message;
import quickfix.SessionID;

/**
 * An event representing a call to {@link
 * Application#fromAdmin(Message,SessionID)}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: FromAdminEvent.java 10885 2009-11-17 19:22:56Z klim $
 */

/* $License$ */

public class FromAdminEvent
    extends MessageEvent
{
    public FromAdminEvent
        (SessionID sessionID,
         Message message)
    {
        super(sessionID,message);
    }
}
