package org.marketcetera.photon.strategy.engine.ui;

import org.junit.Test;
import org.marketcetera.photon.test.OSGITestUtil;

/* $License$ */

/**
 * Tests {@link StrategyEngineUI}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyEngineUITest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
public class StrategyEngineUITest {

    @Test
    public void testPluginId() {
        OSGITestUtil.assertBundle(StrategyEngineUI.PLUGIN_ID);
    }
}
