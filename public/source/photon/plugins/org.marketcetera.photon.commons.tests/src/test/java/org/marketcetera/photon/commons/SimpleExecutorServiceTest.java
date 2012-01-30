package org.marketcetera.photon.commons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.After;
import org.junit.Before;


/* $License$ */

/**
 * Tests {@link SimpleExecutorService}.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: SimpleExecutorServiceTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
public class SimpleExecutorServiceTest extends SimpleExecutorServiceTestBase {
    
    ExecutorService mService;

    @Before
    public void before() {
        mService = Executors.newSingleThreadExecutor();
    }
    
    @After
    public void after() {
        mService.shutdownNow();
    }
    @Override
    protected ExecutorService createFixture() throws Exception {
        return new SimpleExecutorService() {
            @Override
            protected void doExecute(Runnable command) throws Exception {
                mService.execute(command);
            }
        };
    }

}
