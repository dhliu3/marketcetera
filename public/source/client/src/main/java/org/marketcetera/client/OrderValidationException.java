package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.except.I18NException;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Indicates errors encountered when validating orders before sending
 * them to the server.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderValidationException.java 10842 2009-11-03 22:35:51Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderValidationException.java 10842 2009-11-03 22:35:51Z anshul $") //$NON-NLS-1$
public class OrderValidationException extends I18NException {
    /**
     * Creates an instance.
     *
     * @param message the localized message.
     */
    public OrderValidationException(I18NBoundMessage message) {
        super(message);
    }

    /**
     * Creates an instance.
     *
     * @param cause the underlying exception
     * @param message the localized message
     */
    public OrderValidationException(Throwable cause, I18NBoundMessage message) {
        super(cause, message);
    }

    private static final long serialVersionUID = 1L;
}
