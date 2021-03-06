package org.marketcetera.strategy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * Tests messages for the strategy module.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MessagesTest.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */
public class MessagesTest
{
    @Test
    public void messagesMatch()
        throws Exception
    {
        MessageComparator comparator = new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),
                   comparator.isMatch());
    }
}
