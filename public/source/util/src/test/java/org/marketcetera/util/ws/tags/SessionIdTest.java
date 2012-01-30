package org.marketcetera.util.ws.tags;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: SessionIdTest.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public class SessionIdTest
    extends TagTestBase
{
    @Test
    public void all()
    {
        SessionId tag=new SessionId();
        tag.setValue(TEST_VALUE);
        SessionId copy=new SessionId();
        copy.setValue(TEST_VALUE);
        single(tag,copy,new SessionId());

        SessionId generated=SessionId.generate();
        assertNotNull(generated);
        assertNotNull(generated.getValue());
        assertFalse(generated.equals(SessionId.generate()));
    }
}
