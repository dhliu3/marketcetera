package org.marketcetera.util.ws.stateful;

import org.junit.Test;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: ServiceBaseImplTest.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public class ServiceBaseImplTest
    extends ServiceImplTestBase<Object>
{
    @Test
    public void all()
        throws Exception
    {
        single(new ServiceBaseImpl<Object>(TEST_MANAGER),
               new ServiceBaseImpl<Object>(null));
    }
}
