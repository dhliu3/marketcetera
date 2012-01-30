package org.marketcetera.event;

import java.math.BigDecimal;

import org.marketcetera.trade.Option;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Represents the set of statistics of a specific {@link Option}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: OptionMarketstatEvent.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: OptionMarketstatEvent.java 10885 2009-11-17 19:22:56Z klim $")
public interface OptionMarketstatEvent
        extends MarketstatEvent, OptionEvent
{
    /**
     * Gets the change in volume since the previous close.
     *
     * @return a <code>BigDecimal</code> value
     */
    public BigDecimal getVolumeChange();
    /**
     * Gets the change in interest since the previous close.
     *
     * @return a <code>BigDecimal</code> value
     */
    public BigDecimal getInterestChange();
}
