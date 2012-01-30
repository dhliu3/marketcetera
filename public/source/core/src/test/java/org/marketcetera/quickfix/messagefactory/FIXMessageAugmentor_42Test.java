package org.marketcetera.quickfix.messagefactory;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.core.MarketceteraTestSuite;
import junit.framework.TestCase;
import junit.framework.Test;

/**
 * @author toli
 * @version $Id: FIXMessageAugmentor_42Test.java 9456 2008-07-31 22:28:30Z klim $
 */

@ClassVersion("$Id: FIXMessageAugmentor_42Test.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public class FIXMessageAugmentor_42Test extends TestCase {
    public FIXMessageAugmentor_42Test(String inName) {
        super(inName);
    }

    public static Test suite() {
        return new MarketceteraTestSuite(FIXMessageAugmentor_42Test.class);
    }

    public void testCountTT_applicableTypes() throws Exception {
        assertEquals(18, new FIXMessageAugmentor_42().getApplicableMsgTypes().size());
    }

}
