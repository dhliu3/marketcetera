package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Indicates data flow errors.
 *
 * @author anshul@marketcetera.com
 * @version $Id: DataFlowException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: DataFlowException.java 10280 2009-01-15 21:25:09Z anshul $")   //$NON-NLS-1$
public class DataFlowException extends ModuleException {
    /**
     * Creates an instance.
     *
     * @param inCause the underlying cause
     */
    public DataFlowException(Throwable inCause) {
        super(inCause);
    }

    /**
     * Creates an instance.
     *
     * @param inMessage the error message.
     */
    protected DataFlowException(I18NBoundMessage inMessage) {
        super(inMessage);
    }

    /**
     * Creates an instance.
     *
     * @param inCause the underlying cause
     * @param inMessage the error message
     */
    protected DataFlowException(Throwable inCause, I18NBoundMessage inMessage) {
        super(inCause, inMessage);
    }

    private static final long serialVersionUID = -7224891693493920871L;
}
