package org.marketcetera.marketdata.bogus;

import org.marketcetera.core.CoreException;
import org.marketcetera.core.NoMoreIDsException;
import org.marketcetera.marketdata.AbstractMarketDataFeedFactory;
import org.marketcetera.marketdata.FeedException;
import org.marketcetera.util.misc.ClassVersion;

 /* $License$ */

/**
 * {@link BogusFeed} constructor factory.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: BogusFeedFactory.java 10039 2008-11-18 08:44:26Z klim $
 * @since 0.5.0
 */
@ClassVersion("$Id: BogusFeedFactory.java 10039 2008-11-18 08:44:26Z klim $")  //$NON-NLS-1$
public class BogusFeedFactory 
    extends AbstractMarketDataFeedFactory<BogusFeed,BogusFeedCredentials> 
{
    private final static BogusFeedFactory sInstance = new BogusFeedFactory();
    public static BogusFeedFactory getInstance()
    {
        return sInstance;
    }
	public String getProviderName()
	{
		return "Marketcetera (Bogus)"; //$NON-NLS-1$
	}
    /* (non-Javadoc)
     * @see org.marketcetera.marketdata.IMarketDataFeedFactory#getMarketDataFeed()
     */
    @Override
    public BogusFeed getMarketDataFeed()
            throws CoreException
    {
        try {
            return BogusFeed.getInstance(getProviderName());
        } catch (NoMoreIDsException e) {
            throw new FeedException(e);
        }
    }
}
