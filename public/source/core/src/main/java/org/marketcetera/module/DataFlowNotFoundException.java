package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * This exception is thrown when a data flow cannot be found.
 *
 * @author anshul@marketcetera.com
 * @version $Id: DataFlowNotFoundException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: DataFlowNotFoundException.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
public class DataFlowNotFoundException extends DataFlowException {
    /**
     * Creates an instance.
     *
     * @param inMessage the error message.
     */
    DataFlowNotFoundException(I18NBoundMessage inMessage) {
        super(inMessage);
    }

    private static final long serialVersionUID = -6329741564628010597L;
}
