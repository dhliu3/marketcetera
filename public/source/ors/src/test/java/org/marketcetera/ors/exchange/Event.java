package org.marketcetera.ors.exchange;

import quickfix.SessionID;

/**
 * A generic event, containing only a {@link SessionID}.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: Event.java 10885 2009-11-17 19:22:56Z klim $
 */

/* $License$ */

public class Event
{
    private SessionID mSessionID;
    
    public Event
        (SessionID sessionID)
    {
        mSessionID=sessionID;
    }

    public SessionID getSessionID()
    {
        return mSessionID;
    }

    @Override
    public String toString()
    {
        return getClass().toString()+':'+getSessionID();
    }
}
