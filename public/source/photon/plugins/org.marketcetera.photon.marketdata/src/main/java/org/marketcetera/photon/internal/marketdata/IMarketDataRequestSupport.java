package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.marketdata.MarketDataRequest;
import org.marketcetera.marketdata.MarketDataRequestBuilder;
import org.marketcetera.trade.Instrument;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Provides {@link MarketDataRequest} related support.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: IMarketDataRequestSupport.java 10930 2009-12-04 16:48:36Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: IMarketDataRequestSupport.java 10930 2009-12-04 16:48:36Z colin $")
@ImplementedBy(MarketDataRequestSupport.class)
public interface IMarketDataRequestSupport {

    /**
     * Initializes a {@link MarketDataRequestBuilder} for the provided instrument.
     * 
     * @param instrument
     *            the instrument
     * @return a {@link MarketDataRequestBuilder} with instrument information
     */
    MarketDataRequestBuilder initializeRequest(Instrument instrument);

    /**
     * Returns whether fine grained market data is supported for options.
     * 
     * @return whether fine grained market data is supported for options
     */
    boolean useFineGrainedMarketDataForOptions();
}
