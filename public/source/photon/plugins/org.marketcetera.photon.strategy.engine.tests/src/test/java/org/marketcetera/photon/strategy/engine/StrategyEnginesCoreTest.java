package org.marketcetera.photon.strategy.engine;

import org.junit.Test;
import org.marketcetera.photon.test.OSGITestUtil;

/* $License$ */

/**
 * Tests {@link StrategyEnginesCore}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyEnginesCoreTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
public class StrategyEnginesCoreTest {

    @Test
    public void testBundle() {
        OSGITestUtil.assertBundle(StrategyEnginesCore.PLUGIN_ID);
    }
}
