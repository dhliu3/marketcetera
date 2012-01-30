package org.marketcetera.util.ws.sample;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.stateful.SessionHolder;

/**
 * A sample session. It simply counts the number of calls made to the
 * {@link #getCallCount()} method.
 * 
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: SampleSession.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

@ClassVersion("$Id: SampleSession.java 10229 2008-12-09 21:48:48Z klim $") //$NON-NLS-1$
public class SampleSession
{

    // INSTANCE DATA.

    private int mCallCount;


    // INSTANCE METHODS.

    public synchronized int getCallCount()
    {
        return ++mCallCount;
    }


    // CLASS METHODS.

    public static SampleSession getSession
        (SessionHolder<SampleSession> sessionHolder)
    {
        SampleSession s=sessionHolder.getSession();
        if (s==null) {
            s=new SampleSession();
            sessionHolder.setSession(s);
        }
        return s;
    }
}
