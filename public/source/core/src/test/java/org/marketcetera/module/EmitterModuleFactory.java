package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;


/* $License$ */
/**
 * A singleton module factory for {@link EmitterModule}
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: EmitterModuleFactory.java 10239 2008-12-11 01:44:12Z anshul $")
public class EmitterModuleFactory extends ModuleFactory {
    public EmitterModuleFactory() {
        super(PROVIDER_URN, TestMessages.EMIT_PROVIDER, false, false);
    }
    public EmitterModule create(Object... parameters)
            throws ModuleCreationException {
        return new EmitterModule();
    }
    static final ModuleURN PROVIDER_URN = new ModuleURN("metc:emit:single");
    public static final ModuleURN INSTANCE_URN = new ModuleURN(PROVIDER_URN, "default");
}
