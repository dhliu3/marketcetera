package org.marketcetera.ors.info;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: RequestInfoImplTest.java 10885 2009-11-17 19:22:56Z klim $
 */

/* $License$ */

public class RequestInfoImplTest
    extends InfoTestBase
{
    @Test
    public void all()
        throws Exception
    {
        readWrite(REQUEST_INFO,REQUEST_INFO_NAME,
                  SYSTEM_INFO_NAME+NestedInfoImpl.NAME_SEPARATOR+
                  SESSION_INFO_NAME+NestedInfoImpl.NAME_SEPARATOR+
                  REQUEST_INFO_NAME); 
        assertSame(SESSION_INFO,REQUEST_INFO.getSessionInfo());

        // Custom name.

        assertEquals(TEST_NAME,
                     (new RequestInfoImpl(TEST_NAME,SESSION_INFO)).getName());
   }
}
