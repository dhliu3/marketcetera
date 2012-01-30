package org.marketcetera.photon.internal.marketdata.ui;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * 
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MessagesTest.java 10319 2009-02-13 22:35:32Z klim $
 * @since 1.1.0
 */
public class MessagesTest
{
    @Test
    public void messagesMatch()
        throws Exception
    {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}