package org.marketcetera.photon.strategy.engine.ui.workbench.ws.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.marketcetera.photon.internal.strategy.engine.ui.workbench.ws.WorkspaceScriptSelectionButtonTest;
import org.marketcetera.photon.strategy.engine.ui.workbench.ws.StrategyEngineWorkspaceUITest;

/* $License$ */

/**
 * Test suite for this bundle.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: StrategyEngineWorkspaceSuite.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( {
        WorkspaceScriptSelectionButtonTest.class,
        org.marketcetera.photon.internal.strategy.engine.ui.workbench.ws.MessagesTest.class,
        org.marketcetera.photon.strategy.engine.ui.workbench.ws.MessagesTest.class,
        StrategyEngineWorkspaceUITest.class })
public final class StrategyEngineWorkspaceSuite {
}
