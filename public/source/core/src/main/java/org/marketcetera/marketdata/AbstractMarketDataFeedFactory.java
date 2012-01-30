package org.marketcetera.marketdata;

import org.marketcetera.core.ClassVersion;

/* $License$ */

/**
 * Base implementation of {@link IMarketDataFeedFactory}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: AbstractMarketDataFeedFactory.java 10006 2008-11-06 15:52:01Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: AbstractMarketDataFeedFactory.java 10006 2008-11-06 15:52:01Z colin $") //$NON-NLS-1$
public abstract class AbstractMarketDataFeedFactory<F extends MarketDataFeed<? extends MarketDataFeedToken,C>,
                                                    C extends MarketDataFeedCredentials>
        implements IMarketDataFeedFactory<F,C>
{
}
