package org.marketcetera.orderloader;


import org.marketcetera.util.l10n.MessageComparator;
import org.marketcetera.util.misc.ClassVersion;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author toli
 * @version $Id: MessagesTest.java 11022 2010-08-20 00:39:48Z colin $
 */

@ClassVersion("$Id: MessagesTest.java 11022 2010-08-20 00:39:48Z colin $")
public class MessagesTest {
    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}
