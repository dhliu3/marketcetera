package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * This exception is thrown if the module as identified by its URN,
 * cannot be found.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ModuleNotFoundException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: ModuleNotFoundException.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
public class ModuleNotFoundException extends ModuleException {
    /**
     * Creates an instance.
     *
     * @param inMessage the error message.
     */
    public ModuleNotFoundException(I18NBoundMessage inMessage) {
        super(inMessage);
    }

    private static final long serialVersionUID = 2311801823968533198L;
}
