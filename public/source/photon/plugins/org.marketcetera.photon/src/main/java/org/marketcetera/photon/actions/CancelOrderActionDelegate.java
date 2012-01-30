package org.marketcetera.photon.actions;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.photon.PhotonPlugin;
import org.marketcetera.trade.ExecutionReport;

/* $License$ */

/**
 * Cancels the selected report immediately.
 * 
 * @author gmiller
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: CancelOrderActionDelegate.java 10528 2009-04-23 23:04:08Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: CancelOrderActionDelegate.java 10528 2009-04-23 23:04:08Z klim $")
public class CancelOrderActionDelegate extends CancelOrderActionBase {
	public final static String ID = "org.marketcetera.photon.actions.CancelOrderActionDelegate"; //$NON-NLS-1$

	@Override
	void processReport(ExecutionReport report) throws Exception {
		PhotonPlugin.getDefault().getPhotonController().cancelOneOrderByClOrdID(
				report.getOrderID().getValue());
	}
}
