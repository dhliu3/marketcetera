package org.marketcetera.photon;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * Tests Photon messages.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MessagesTest.java 9477 2008-08-08 23:38:47Z klim $
 * @since 0.6.0
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
