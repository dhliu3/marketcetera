package org.marketcetera.symbology;

import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;
import org.marketcetera.util.test.TestCaseBase;

import static org.junit.Assert.*;

/* $License$ */

/**
 * @author klim@marketcetera.com
 * @since 0.6.0
 * @version $Id: MessagesTest.java 9477 2008-08-08 23:38:47Z klim $
 */
public class MessagesTest
    extends TestCaseBase
{
    @Test
    public void messagesMatch()
        throws Exception
    {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}
