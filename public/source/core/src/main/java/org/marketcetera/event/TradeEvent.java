package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Represents a Trade for a given security at a specific time.
 *
 * @author gmiller
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: TradeEvent.java 10833 2009-10-26 21:39:40Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: TradeEvent.java 10833 2009-10-26 21:39:40Z colin $")
public interface TradeEvent
        extends MarketDataEvent
{
    /**
     * Gets the time the event occurred. 
     *
     * <p>The format of the returned value is dependent on the
     * originating market data provider.
     * 
     * <p>This is the same as {@link #getExchangeTimestamp()}.
     *
     * @return a <code>String</code> value
     */
    public String getTradeDate();
}
