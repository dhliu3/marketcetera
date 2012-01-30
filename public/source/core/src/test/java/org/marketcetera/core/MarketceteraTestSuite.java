package org.marketcetera.core;

import junit.framework.TestSuite;
import org.marketcetera.quickfix.FIXDataDictionary;
import org.marketcetera.quickfix.FIXVersion;

import org.marketcetera.util.log.SLF4JLoggerProxy;

/**
 * @author Toli Kuznets
 * @version $Id: MarketceteraTestSuite.java 9483 2008-08-13 07:40:39Z tlerios $
 */
@ClassVersion("$Id: MarketceteraTestSuite.java 9483 2008-08-13 07:40:39Z tlerios $") //$NON-NLS-1$
public class MarketceteraTestSuite extends TestSuite {
    public MarketceteraTestSuite() {
        super();
        init();
    }

    public MarketceteraTestSuite(Class aClass) {
        super(aClass);
        init();
    }

    public void init()
    {
        try {
            FIXDataDictionary.initializeDataDictionary(FIXVersion.FIX42.getDataDictionaryURL());
        } catch (Exception ex) {
            SLF4JLoggerProxy.error(this, ex, "Error initializing suite"); //$NON-NLS-1$
            System.exit(1);
        }
    }
}
