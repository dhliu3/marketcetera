package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * This exception is thrown when the requested
 * module provider as identified by its URN, does not exist.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ProviderNotFoundException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: ProviderNotFoundException.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
public class ProviderNotFoundException extends ModuleException {
    /**
     * Creates a new instance.
     *
     * @param inMessage the error message.
     */
    ProviderNotFoundException(I18NBoundMessage inMessage) {
        super(inMessage);
    }

    private static final long serialVersionUID = 4835970580129669317L;
}
