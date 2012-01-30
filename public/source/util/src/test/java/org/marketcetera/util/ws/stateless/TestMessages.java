package org.marketcetera.util.ws.stateless;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage2P;
import org.marketcetera.util.log.I18NMessageProvider;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: TestMessages.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public interface TestMessages
{
    static final I18NMessageProvider PROVIDER=
        new I18NMessageProvider("util_ws_stateless_test");
    static final I18NLoggerProxy LOGGER=
        new I18NLoggerProxy(PROVIDER);

    static final I18NMessage2P MESSAGE=
        new I18NMessage2P(LOGGER,"message");
}