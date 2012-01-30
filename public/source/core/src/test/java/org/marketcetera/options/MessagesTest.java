package org.marketcetera.options;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.util.l10n.MessageComparator;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/* $License$ */

/**
 * Tests that all messages in this package are mapped correctly
 *
 * @author anshul@marketcetera.com
 * @version $Id: MessagesTest.java 10893 2009-11-20 01:50:00Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: MessagesTest.java 10893 2009-11-20 01:50:00Z klim $")
public class MessagesTest {
    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}