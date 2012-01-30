package org.marketcetera.photon.ui.marketdata;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.marketcetera.photon.PhotonPlugin;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Reconnects the market data feed.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ReconnectMarketData.java 10577 2009-05-18 22:55:59Z will $
 * @since 1.0.0
 */
@ClassVersion("$Id: ReconnectMarketData.java 10577 2009-05-18 22:55:59Z will $")
public class ReconnectMarketData extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		PhotonPlugin.getDefault().reconnectMarketDataFeed();
		return null;
	}

}
