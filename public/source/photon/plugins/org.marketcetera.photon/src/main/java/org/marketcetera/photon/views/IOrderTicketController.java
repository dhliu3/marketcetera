package org.marketcetera.photon.views;

import org.marketcetera.trade.NewOrReplaceOrder;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Base order ticket controller.
 *
 * @version $Id: IOrderTicketController.java 10875 2009-11-16 15:39:07Z will $
 * @since 0.5.0
 */
@ClassVersion("$Id: IOrderTicketController.java 10875 2009-11-16 15:39:07Z will $")
public interface IOrderTicketController {
	void setOrderMessage(NewOrReplaceOrder order);

	NewOrReplaceOrder getOrder();
	
	void clear();
	
	void dispose();
	
	/**
     * Return the id of the perspective that is associated with this controller.
     * 
     * @return the perspective id
     */
    String getPerspectiveId();
    
    /**
     * Return the id of the view that is associated with this controller.
     * 
     * @return the view id
     */
    String getViewId();
}
