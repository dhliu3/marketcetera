package org.marketcetera.quickfix.messagefactory;

import org.marketcetera.core.ClassVersion;
import quickfix.FieldNotFound;
import quickfix.Message;

/**
 * Dummy noop implementation of the {@link FIXMessageAugmentor}
 * @author toli
 * @version $Id: NoOpFIXMessageAugmentor.java 9456 2008-07-31 22:28:30Z klim $
 */

@ClassVersion("$Id: NoOpFIXMessageAugmentor.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public class NoOpFIXMessageAugmentor implements FIXMessageAugmentor{
    public Message newOrderSingleAugment(Message inMessage) {
        return inMessage;
    }

    public Message executionReportAugment(Message inMessage) throws FieldNotFound {
        return inMessage;
    }

    public Message cancelRejectAugment(Message inMessage) {
        return inMessage;
    }

    public Message cancelReplaceRequestAugment(Message inMessage) {
        return inMessage;
    }

    public Message cancelRequestAugment(Message inMessage) {
        return inMessage;
    }


    public boolean needsTransactTime(Message inMsg)
    {
        return false;
    }


}
