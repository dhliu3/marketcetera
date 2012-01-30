package org.marketcetera.util.exec;

import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage1P;
import org.marketcetera.util.log.I18NMessageProvider;
import org.marketcetera.util.misc.ClassVersion;

/**
 * The internationalization constants used by this package.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: Messages.java 10378 2009-03-06 15:00:42Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: Messages.java 10378 2009-03-06 15:00:42Z tlerios $")
public interface Messages
{

    /**
     * The message provider.
     */

    static final I18NMessageProvider PROVIDER=
        new I18NMessageProvider("util_exec"); //$NON-NLS-1$

    /**
     * The logger.
     */

    static final I18NLoggerProxy LOGGER=
        new I18NLoggerProxy(PROVIDER);

    /*
     * The messages.
     */

    static final I18NMessage1P CANNOT_COPY_OUTPUT=
        new I18NMessage1P(LOGGER,"cannot_copy_output"); //$NON-NLS-1$
    static final I18NMessage1P CANNOT_EXECUTE=
        new I18NMessage1P(LOGGER,"cannot_execute"); //$NON-NLS-1$
    static final I18NMessage1P UNEXPECTED_TERMINATION=
        new I18NMessage1P(LOGGER,"unexpected_termination"); //$NON-NLS-1$
}
