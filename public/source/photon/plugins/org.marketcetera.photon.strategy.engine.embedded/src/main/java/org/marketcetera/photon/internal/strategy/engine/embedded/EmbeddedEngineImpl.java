package org.marketcetera.photon.internal.strategy.engine.embedded;

import org.marketcetera.photon.strategy.engine.embedded.EmbeddedEngine;
import org.marketcetera.photon.strategy.engine.model.core.ConnectionState;
import org.marketcetera.photon.strategy.engine.model.core.impl.StrategyEngineImpl;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The embedded engine implementation. See
 * {@link EmbeddedEngine#createEngine(java.util.concurrent.ExecutorService, boolean)}
 * .
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: EmbeddedEngineImpl.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: EmbeddedEngineImpl.java 10885 2009-11-17 19:22:56Z klim $")
public class EmbeddedEngineImpl extends StrategyEngineImpl {

    /**
     * Constructor.
     */
    public EmbeddedEngineImpl() {
        setConnectionState(ConnectionState.CONNECTED);
        setName(Messages.EMBEDDED_ENGINE_IMPL__NAME.getText());
        setDescription(Messages.EMBEDDED_ENGINE_IMPL__DESCRIPTION.getText());
        setReadOnly(true);
    }
}