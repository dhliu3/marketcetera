package org.marketcetera.quickfix.messagefactory;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.core.MarketceteraTestSuite;
import junit.framework.TestCase;
import junit.framework.Test;

/**
 * @author toli
 * @version $Id: FIXMessageAugmentor_44Test.java 9456 2008-07-31 22:28:30Z klim $
 */

@ClassVersion("$Id: FIXMessageAugmentor_44Test.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public class FIXMessageAugmentor_44Test extends TestCase {
    public FIXMessageAugmentor_44Test(String inName) {
        super(inName);
    }

    public static Test suite() {
        return new MarketceteraTestSuite(FIXMessageAugmentor_44Test.class);
    }

    public void testCountTT_applicableTypes() throws Exception {
        assertEquals(44, new FIXMessageAugmentor_44().getApplicableMsgTypes().size());
    }

}
