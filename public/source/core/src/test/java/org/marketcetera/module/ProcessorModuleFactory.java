package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * Factory for creating {@link ProcessorModule} instances.
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: ProcessorModuleFactory.java 10239 2008-12-11 01:44:12Z anshul $")
public class ProcessorModuleFactory extends ModuleFactory {
    @Override
    public ProcessorModule create(Object... parameters)
            throws ModuleCreationException {
        return new ProcessorModule((ModuleURN)parameters[0]);
    }
    public ProcessorModuleFactory() {
        super(PROVIDER_URN, TestMessages.PROCESSOR_PROVIDER,
                true, true, ModuleURN.class);
    }

    public static final ModuleURN PROVIDER_URN = new ModuleURN("metc:process:first");
}
