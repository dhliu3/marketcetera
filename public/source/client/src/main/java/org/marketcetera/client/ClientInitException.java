package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.except.I18NException;
import org.marketcetera.util.log.I18NBoundMessage;

/* $License$ */
/**
 * Instances of this class are thrown if the {@link Client} is already
 * initialized or if it's not initialized.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ClientInitException.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */
@ClassVersion("$Id: ClientInitException.java 10229 2008-12-09 21:48:48Z klim $") //$NON-NLS-1$
public class ClientInitException extends I18NException {
    /**
     * Creates an instance.
     *
     * @param message the exception message.
     */
    public ClientInitException(I18NBoundMessage message) {
        super(message);
    }

    private static final long serialVersionUID = 1L;
}
