package org.marketcetera.photon.internal.strategy.engine.ui.workbench.handlers;

import static org.marketcetera.photon.strategy.engine.model.core.test.StrategyEngineCoreTestUtil.buildEngines;
import static org.marketcetera.photon.strategy.engine.model.core.test.StrategyEngineCoreTestUtil.createConnectedEngine;

import java.util.Arrays;
import java.util.List;

import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.runner.RunWith;
import org.marketcetera.photon.strategy.engine.model.core.DeployedStrategy;
import org.marketcetera.photon.strategy.engine.model.core.StrategyEngine;
import org.marketcetera.photon.strategy.engine.model.core.StrategyState;
import org.marketcetera.photon.test.WorkbenchRunner;

/* $License$ */

/**
 * Tests {@link StartAllHandler}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StartAllHandlerTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@RunWith(WorkbenchRunner.class)
public class StartAllHandlerTest extends ChangeStrategyHandlerTestBase {

    private final StrategyEngine mEngine2;

    public StartAllHandlerTest() {
        super("Start All", "Starting");
        mStrategy1.setState(StrategyState.STOPPED);
        mStrategy2.setState(StrategyState.RUNNING);
        mStrategy3.setState(StrategyState.STOPPED);
        mEngine2 = createConnectedEngine("My Engine 2");
        BlockingConnection connection2 = new BlockingConnection();
        mEngine2.setConnection(connection2);
    }

    @Override
    protected List<? extends StrategyEngine> createModel() {
        return buildEngines(mEngine, mStrategy1, mEngine2, mStrategy2,
                mStrategy3);
    }

    @Override
    protected void acceptChange(BlockingConnection connection, Object object)
            throws Exception {
        connection.acceptStart(object);
    }

    @Override
    protected List<DeployedStrategy> getMultipleAffected() {
        return Arrays.asList(mStrategy1, mStrategy3);
    }

    @Override
    protected void selectSingle(SWTBotTree tree) {
        tree.select("My Engine");
    }

    @Override
    protected void selectMultiple(SWTBotTree tree) {
        tree.select("My Engine", "My Engine 2");
    }
}