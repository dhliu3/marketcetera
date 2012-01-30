package org.marketcetera.photon.commons;

import org.marketcetera.util.log.I18NMessage0P;
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
    
    static I18NMessage0P SIMPLE_EXECUTOR_SERVICE_REJECT_SHUTDOWN;
    static I18NMessage0P SIMPLE_EXECUTOR_SERVICE_ABNORMAL_SHUTDOWN;

    static {
        ReflectiveMessages.init(Messages.class);
    }

    private Messages() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
