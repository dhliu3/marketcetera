package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * A coupler that delivers the message to the next module within
 * the context of the same thread. The emitter module's invocation
 * to emit data is blocked until the receiving module's invocation
 * to receive data completes.
 *
 * @author anshul@marketcetera.com
 * @version $Id: SyncCoupler.java 10280 2009-01-15 21:25:09Z anshul $
 * @since 1.0.0
 */
@ClassVersion("$Id: SyncCoupler.java 10280 2009-01-15 21:25:09Z anshul $")  //$NON-NLS-1$
class SyncCoupler extends AbstractDataCoupler {
    /**
     * Creates an instance.
     *
     * @param inManager the module manager instance.
     * @param inEmitter the emitter module instance.
     * @param inReceiver the receiving module instance.
     * @param inFlowID the data flow ID for this data flow.
     */
    SyncCoupler(ModuleManager inManager,
                          Module inEmitter,
                          Module inReceiver,
                          DataFlowID inFlowID) {
        super(inManager, inEmitter, inReceiver, inFlowID);
    }
    
    @Override
    protected void process(Object inData) {
        receive(inData);
    }
}
