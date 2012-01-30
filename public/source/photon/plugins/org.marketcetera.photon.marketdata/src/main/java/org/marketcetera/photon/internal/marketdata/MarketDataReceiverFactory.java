package org.marketcetera.photon.internal.marketdata;

import java.util.concurrent.atomic.AtomicLong;

import org.marketcetera.module.Module;
import org.marketcetera.module.ModuleCreationException;
import org.marketcetera.module.ModuleFactory;
import org.marketcetera.module.ModuleURN;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Factory for {@link MarketDataReceiverModule}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MarketDataReceiverFactory.java 10577 2009-05-18 22:55:59Z will $
 * @since 1.0.0
 */
@ClassVersion("$Id: MarketDataReceiverFactory.java 10577 2009-05-18 22:55:59Z will $")
public class MarketDataReceiverFactory extends ModuleFactory {

	/**
	 * Provider URN for this factory.
	 */
	public static final ModuleURN PROVIDER_URN = new ModuleURN("metc:mdatasink:photon"); //$NON-NLS-1$

	private static final AtomicLong counter = new AtomicLong();

	/**
	 * Constructor.
	 */
	public MarketDataReceiverFactory() {
		super(PROVIDER_URN, Messages.MARKET_DATA_RECEIVER_FACTORY_DESCRIPTION, true, false,
				IMarketDataSubscriber.class);
	}

	@Override
	public Module create(final Object... inParameters) throws ModuleCreationException {
		ModuleURN urn = new ModuleURN(PROVIDER_URN, "item" + counter.incrementAndGet()); //$NON-NLS-1$
		IMarketDataSubscriber subscriber = (IMarketDataSubscriber) inParameters[0];
		return new MarketDataReceiverModule(urn, subscriber);
	}
}