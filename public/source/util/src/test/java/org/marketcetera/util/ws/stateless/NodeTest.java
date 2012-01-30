package org.marketcetera.util.ws.stateless;

import org.junit.Test;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: NodeTest.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public class NodeTest
    extends NodeTestBase
{
    @Test
    public void all()
    {
        singleNode(new Node(TEST_HOST,TEST_PORT),new Node());
    }
}
