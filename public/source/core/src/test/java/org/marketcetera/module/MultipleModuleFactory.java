package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * This provider supports multiple module instances that
 * can be auto-instantiated and auto-started
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: MultipleModuleFactory.java 10239 2008-12-11 01:44:12Z anshul $")
public class MultipleModuleFactory extends ModuleFactory {
    @Override
    public MultipleModule create(Object... parameters)
            throws ModuleCreationException {
        return new MultipleModule((ModuleURN) parameters[0], true);
    }
    public MultipleModuleFactory() {
        super(PROVIDER_URN, TestMessages.MULTIPLE_1_PROVIDER,
                true, true, ModuleURN.class);
    }

    static final ModuleURN PROVIDER_URN = new ModuleURN("metc:test:multiple1");
}
