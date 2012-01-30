package org.marketcetera.marketdata.bogus;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.util.log.I18NLoggerProxy;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.log.I18NMessage1P;
import org.marketcetera.util.log.I18NMessageProvider;

/* $License$ */

/**
 * Messages for BogusFeed plug-in.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: Messages.java 10904 2009-11-27 23:19:09Z colin $
 * @since 0.6.0
 */
@ClassVersion("$Id: Messages.java 10904 2009-11-27 23:19:09Z colin $") //$NON-NLS-1$
public interface Messages
{
    static final I18NMessageProvider PROVIDER = new I18NMessageProvider("bogus", Messages.class.getClassLoader());  //$NON-NLS-1$

    static final I18NLoggerProxy LOGGER = new I18NLoggerProxy(PROVIDER);
    
    public static final I18NMessage1P UNKNOWN_EVENT_TYPE = new I18NMessage1P(LOGGER,
                                                                             "unknown_event_type"); //$NON-NLS-1$
    public static final I18NMessage1P UNKNOWN_ENTRY_TYPE = new I18NMessage1P(LOGGER,
                                                                             "unknown_entry_type"); //$NON-NLS-1$
    public static final I18NMessage0P PROVIDER_DESCRIPTION = new I18NMessage0P(LOGGER,
                                                                               "provider_description"); //$NON-NLS-1$
    public static final I18NMessage1P UNSUPPORTED_OPTION_SPECIFICATION = new I18NMessage1P(LOGGER,
                                                                                           "unsupported_option_specification"); //$NON-NLS-1$
}