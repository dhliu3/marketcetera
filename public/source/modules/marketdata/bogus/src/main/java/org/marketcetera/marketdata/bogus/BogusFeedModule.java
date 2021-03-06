package org.marketcetera.marketdata.bogus;

import org.marketcetera.core.CoreException;
import org.marketcetera.marketdata.AbstractMarketDataModule;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * StrategyAgent module for {@link BogusFeed}.
 * <p>
 * Module Features
 * <table>
 * <tr><th>Factory:</th><td>{@link BogusFeedModuleFactory}</td></tr>
 * <tr><th colspan="2">See {@link AbstractMarketDataModule parent} for module features.</th></tr>
 * </table>
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: BogusFeedModule.java 10578 2009-05-19 00:29:27Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: BogusFeedModule.java 10578 2009-05-19 00:29:27Z anshul $")  //$NON-NLS-1$
public final class BogusFeedModule
        extends AbstractMarketDataModule<BogusFeedToken,
                                         BogusFeedCredentials>
{
    /**
     * Create a new BogusFeedEmitter instance.
     * 
     * @throws CoreException 
     */
    BogusFeedModule()
        throws CoreException
    {
        super(BogusFeedModuleFactory.INSTANCE_URN,
              BogusFeedFactory.getInstance().getMarketDataFeed());
    }
    /* (non-Javadoc)
     * @see org.marketcetera.marketdata.AbstractMarketDataModule#getCredentials()
     */
    @Override
    protected BogusFeedCredentials getCredentials()
        throws CoreException
    {
        return BogusFeedCredentials.getInstance();
    }
}
