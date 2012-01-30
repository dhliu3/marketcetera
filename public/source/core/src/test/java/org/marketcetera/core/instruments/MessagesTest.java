package org.marketcetera.core.instruments;

import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;
import org.marketcetera.util.test.TestCaseBase;

import static org.junit.Assert.*;

/* $License$ */

/**
 * Tests {@link Messages}.
 *
 * @author anshul@marketcetera.com
 * @version $Id: MessagesTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
public class MessagesTest extends TestCaseBase {
    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator = new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(), comparator.isMatch());
    }
}