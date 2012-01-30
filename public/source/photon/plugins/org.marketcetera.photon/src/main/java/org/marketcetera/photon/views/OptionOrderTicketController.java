package org.marketcetera.photon.views;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.photon.ui.OptionPerspectiveFactory;

/* $License$ */

/**
 * The Option Order Ticket View Controller
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: OptionOrderTicketController.java 10875 2009-11-16 15:39:07Z will $
 * @since 1.0.0
 */
@ClassVersion("$Id: OptionOrderTicketController.java 10875 2009-11-16 15:39:07Z will $")
public class OptionOrderTicketController extends
        OrderTicketController<OptionOrderTicketModel> {
    /**
     * Constructor.
     * 
     * @param orderTicketModel
     *            the order ticket model
     */
    public OptionOrderTicketController(OptionOrderTicketModel model) {
        super(model);
    }

    @Override
    public String getViewId() {
        return OptionOrderTicketView.ID;
    }

    @Override
    public String getPerspectiveId() {
        return OptionPerspectiveFactory.ID;
    }
}
