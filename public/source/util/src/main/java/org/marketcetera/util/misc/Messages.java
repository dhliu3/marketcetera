package org.marketcetera.util.misc;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessageProvider;

/**
 * The internationalization constants used by this package.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: Messages.java 10382 2009-03-06 18:16:40Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: Messages.java 10382 2009-03-06 18:16:40Z tlerios $")
public interface Messages
{

    /**
     * The message provider.
     */

    static final I18NMessageProvider PROVIDER=
        new I18NMessageProvider("util_misc"); //$NON-NLS-1$

    /**
     * The logger.
     */

    static final I18NLoggerProxy LOGGER=
        new I18NLoggerProxy(PROVIDER);

    /*
     * The messages.
     */
}
