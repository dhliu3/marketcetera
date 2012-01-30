package org.marketcetera.client.jms;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.l10n.MessageComparator;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/* $License$ */
/**
 * Verifies that all the messages are correctly specified.
 *
 * @author anshul@marketcetera.com
 * @version $Id: MessagesTest.java 10407 2009-03-10 12:06:21Z tlerios $
 * @since 1.0.0
 */
@ClassVersion("$Id: MessagesTest.java 10407 2009-03-10 12:06:21Z tlerios $")
public class MessagesTest {
    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}
