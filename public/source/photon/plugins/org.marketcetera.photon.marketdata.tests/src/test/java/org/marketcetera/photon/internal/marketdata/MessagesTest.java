package org.marketcetera.photon.internal.marketdata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.photon.internal.marketdata.Messages;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * Tests the message file of Photon market data.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MessagesTest.java 10875 2009-11-16 15:39:07Z will $
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
