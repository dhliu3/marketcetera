package org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench;

import org.marketcetera.photon.commons.ReflectiveMessages;
import org.marketcetera.util.log.I18NMessage0P;
import org.marketcetera.util.log.I18NMessage1P;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The internationalization constants used by this package.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: Messages.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: Messages.java 10885 2009-11-17 19:22:56Z klim $")
final class Messages {
    
    static I18NMessage1P CONNECT_HANDLER__TASK_NAME;
    static I18NMessage0P CONNECT_HANDLER_FAILED;
    static I18NMessage1P DISCONNECT_HANDLER__TASK_NAME;
    static I18NMessage0P DISCONNECT_HANDLER_FAILED;
    static I18NMessage0P DELETE_HANDLER_CONFIRMATION__TITLE;
    static I18NMessage1P DELETE_HANDLER_CONFIRMATION_SINGLE;
    static I18NMessage0P DELETE_HANDLER_CONFIRMATION_MULTIPLE;

    static {
        ReflectiveMessages.init(Messages.class);
    }

    private Messages() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
