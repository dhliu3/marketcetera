package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Instances of this exception are thrown when a module
 * operation cannot be carried out because the module
 * is not in the right state to be able to carry out that
 * operation. 
 *
 * @author anshul@marketcetera.com
 * @version $Id: ModuleStateException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: ModuleStateException.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
public class ModuleStateException extends ModuleException {
    /**
     * Creates an instance.
     *
     * @param inMessage the error message.
     */
    public ModuleStateException(I18NBoundMessage inMessage) {
        super(inMessage);
    }

    private static final long serialVersionUID = 3553183128818076950L;
}
