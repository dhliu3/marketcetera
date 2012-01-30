package org.someorg.someapp;

import org.marketcetera.strategy.java.Strategy;

/* $License$ */

/**
 * Tests a Java strategy that is not in the default package.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: PackageStrategy.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */
public class PackageStrategy
        extends Strategy
{
    /* (non-Javadoc)
     * @see org.marketcetera.strategy.java.Strategy#onStart()
     */
    @Override
    public void onStart()
    {
        setProperty("onStart",
                    Long.toString(System.currentTimeMillis()));
    }
}
