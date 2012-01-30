package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.l10n.MessageComparator;
import org.marketcetera.util.l10n.MessageInfo;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/* $License$ */
/**
 * Verifies that all the messages are correctly specified.
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: MessagesTest.java 9860 2008-10-10 22:00:53Z klim $")
public class MessagesTest {
    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
    @Test
    public void testMessagesMatch() throws Exception {
        MessageComparator comparator=new MessageComparator(TestMessages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}
