package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * A singleton module for testing.
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: SingletonModule.java 9860 2008-10-10 22:00:53Z klim $")
public class SingletonModule extends ModuleBase {

    public SingletonModule(ModuleURN inModuleURN) {
        super(inModuleURN);
        sInstance = this;
        sInstances++;
    }

    public static SingletonModule getInstance() {
        return sInstance;
    }

    public static int getInstances() {
        return sInstances;
    }
    public static void clearInstances() {
        sInstance = null;
        sInstances = 0;
    }

    protected static int sInstances = 0;
    protected static SingletonModule sInstance;
}
