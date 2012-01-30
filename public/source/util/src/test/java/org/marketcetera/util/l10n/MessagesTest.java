package org.marketcetera.util.l10n;

import org.junit.Test;
import org.marketcetera.util.test.TestCaseBase;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 0.6.0
 * @version $Id: MessagesTest.java 9940 2008-10-29 08:04:53Z tlerios $
 */

/* $License$ */

public class MessagesTest
    extends TestCaseBase
{
    @Test
    public void messagesMatch()
        throws Exception
    {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());

        // Test files not tested because messages are intentionally
        // problematic.
    }
}
