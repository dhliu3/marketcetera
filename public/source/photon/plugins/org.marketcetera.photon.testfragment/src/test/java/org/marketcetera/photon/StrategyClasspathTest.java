package org.marketcetera.photon;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/* $License$ */

/**
 * Verify the strategy classpath is set (requires photon to be running).
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyClasspathTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
public class StrategyClasspathTest {

    @Test
    public void verifyStrategyClasspath() throws Exception {
            assertNotNull(System.getProperty(org.marketcetera.strategy.Strategy.CLASSPATH_PROPERTYNAME));
    }
}
