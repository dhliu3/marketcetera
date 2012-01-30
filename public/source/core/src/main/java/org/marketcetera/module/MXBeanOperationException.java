package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Indicates errors when executing a module related JMX Operations.
 *
 * @author anshul@marketcetera.com
 * @version $Id: MXBeanOperationException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: MXBeanOperationException.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
public class MXBeanOperationException extends ModuleException {
    /**
     * Creates an instance.
     *
     * @param inCause the underlying cause.
     * @param inMessage the error message
     */
    public MXBeanOperationException(Throwable inCause,
                                    I18NBoundMessage inMessage) {
        super(inCause, inMessage);
    }
    private static final long serialVersionUID = -2634287361311711770L;
}
