package org.marketcetera.photon.strategy.engine;
import org.marketcetera.photon.commons.ReflectiveMessages;
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
    
    static I18NMessage0P ABSTRACT_STRATEGY_ENGINE_CONNECTION_MISSING_SCRIPT_PATH;
    static I18NMessage0P ABSTRACT_STRATEGY_ENGINE_CONNECTION_MISSING_CLASS_NAME;
    static I18NMessage0P ABSTRACT_STRATEGY_ENGINE_CONNECTION_MISSING_LANGUAGE;
    static I18NMessage0P ABSTRACT_STRATEGY_ENGINE_CONNECTION_MISSING_INSTANCE_NAME;

    static {
        ReflectiveMessages.init(Messages.class);
    }

    private Messages() {
        throw new AssertionError("non-instantiable"); //$NON-NLS-1$
    }
}
