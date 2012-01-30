package org.marketcetera.marketdata;

import org.marketcetera.core.MarketceteraTestSuite;

/**
 * Test suite for Market Data Feed Tests.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MarketDataFeedTestSuite.java 10930 2009-12-04 16:48:36Z colin $
 * @since 0.5.0
 */
public abstract class MarketDataFeedTestSuite
    extends MarketceteraTestSuite
{
    public static MarketDataRequest generateDataRequest() 
        throws Exception
    {
        return MarketDataRequestBuilder.newRequest().withExchange("Exchange").withSymbols("GOOG,MSFT,YGZ9").create();
    }    
}
