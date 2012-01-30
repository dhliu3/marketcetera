package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/**
 * Indicates the frequency of a dividend.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: DividendFrequency.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: DividendFrequency.java 10885 2009-11-17 19:22:56Z klim $")
public enum DividendFrequency
{
    /**
     * once per year
     */
    ANNUALLY,
    /**
     * once per month
     */
    MONTHLY,
    /**
     * once per quarter
     */
    QUARTERLY,
    /**
     * once every six months
     */
    SEMI_ANNUALLY,
    /**
     * an unknown frequency
     */
    OTHER
}