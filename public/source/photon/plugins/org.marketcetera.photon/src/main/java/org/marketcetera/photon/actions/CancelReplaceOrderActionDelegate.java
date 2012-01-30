package org.marketcetera.photon.actions;

import org.marketcetera.photon.Messages;
import org.marketcetera.photon.PhotonPlugin;
import org.marketcetera.trade.ExecutionReport;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Initializes the appropriate order ticket with a cancel-replace order for the selected report.
 * 
 * @author gmiller
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: CancelReplaceOrderActionDelegate.java 10516 2009-04-21 17:53:23Z will $
 * @since 1.0.0
 */
@ClassVersion("$Id: CancelReplaceOrderActionDelegate.java 10516 2009-04-21 17:53:23Z will $")
public class CancelReplaceOrderActionDelegate extends CancelOrderActionBase implements Messages {
	public final static String ID = "org.marketcetera.photon.actions.CancelReplaceOrderActionDelegate"; //$NON-NLS-1$

	@Override
	void processReport(ExecutionReport report) throws Exception {
		PhotonPlugin.getDefault().getPhotonController().replaceOrder(report);
	}
}
