package org.marketcetera.photon.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Reconnects to the server.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ReconnectServerHandler.java 10492 2009-04-14 00:11:35Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: ReconnectServerHandler.java 10492 2009-04-14 00:11:35Z klim $")
public class ReconnectServerHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new ReconnectServerJob().schedule();
		return null;
	}

}
