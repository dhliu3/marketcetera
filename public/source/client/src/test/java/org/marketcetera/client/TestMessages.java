package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.log.*;

/* $License$ */
/**
 * Messages used by test code.
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: TestMessages.java 10906 2009-11-28 00:24:41Z tlerios $")
public interface TestMessages {
    /**
     * The message provider
     */
    static final I18NMessageProvider PROVIDER =
            new I18NMessageProvider("client_test");  //$NON-NLS-1$
    /**
     * The message logger.
     */
    static final I18NLoggerProxy LOGGER =
            new I18NLoggerProxy(PROVIDER);
    static final I18NMessage0P MOCK_VERSION_MISMATCH =
            new I18NMessage0P(LOGGER, "mock_version_mismatch");   //$NON-NLS-1$
    static final I18NMessage0P PROVIDER_ORDER_SENDER =
            new I18NMessage0P(LOGGER, "provider_order_sender");   //$NON-NLS-1$
}