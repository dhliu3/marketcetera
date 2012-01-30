package org.marketcetera.ors.info;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: SystemInfoImplTest.java 10885 2009-11-17 19:22:56Z klim $
 */

/* $License$ */

public class SystemInfoImplTest
    extends InfoTestBase
{
    @Test
    public void all()
        throws Exception
    {
        readWrite(SYSTEM_INFO,SYSTEM_INFO_NAME,
                  SYSTEM_INFO_NAME);

        // Custom name.

        assertEquals(TEST_NAME,
                     (new SystemInfoImpl(TEST_NAME)).getName());
    }
}
