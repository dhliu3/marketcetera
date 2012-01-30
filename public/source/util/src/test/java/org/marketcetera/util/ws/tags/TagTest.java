package org.marketcetera.util.ws.tags;

import org.junit.Test;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: TagTest.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public class TagTest
    extends TagTestBase
{
    @Test
    public void all()
    {
        single(new Tag(TEST_VALUE),new Tag(TEST_VALUE),new Tag());
    }
}
