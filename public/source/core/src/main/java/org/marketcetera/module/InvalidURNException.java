package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * This exception is thrown if an invalid URN is used to identify
 * a module provider or a module instance.
 *
 * @author anshul@marketcetera.com
 * @version $Id: InvalidURNException.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: InvalidURNException.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
public class InvalidURNException extends ModuleException {
    /**
     * Creates an instance.
     *
     * @param message the error message.
     */
    InvalidURNException(I18NBoundMessage message) {
        super(message);
    }

    private static final long serialVersionUID = 4417630626628513614L;
}
