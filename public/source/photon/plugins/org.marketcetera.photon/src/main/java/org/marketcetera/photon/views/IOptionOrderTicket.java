package org.marketcetera.photon.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The XSWT option order ticket.
 *
 * @version $Id: IOptionOrderTicket.java 10875 2009-11-16 15:39:07Z will $
 * @since 0.5.0
 */
@ClassVersion("$Id: IOptionOrderTicket.java 10875 2009-11-16 15:39:07Z will $")
public interface IOptionOrderTicket extends IOrderTicket {

	Text getOptionExpiryText();
	
	Button getSelectExpiryButton();

    Combo getOpenCloseCombo();

	Combo getOrderCapacityCombo();

	Combo getPutOrCallCombo();
	
	Text getStrikePriceText();

}
