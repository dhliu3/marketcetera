package org.marketcetera.util.ws.sample;

import java.util.Locale;
import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;
import org.marketcetera.util.test.TestCaseBase;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: MessagesTest.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public class MessagesTest
    extends TestCaseBase
{
    @Test
    public void messagesMatch()
        throws Exception
    {
        MessageComparator comparator=new MessageComparator
            (SampleMessages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());

        comparator=new MessageComparator(SampleMessages.class,Locale.FRENCH);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}
