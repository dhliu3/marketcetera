package org.marketcetera.photon.internal.strategy.engine.sa.ui;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.photon.commons.ui.LocalizedLabelContainerClassInfo;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.Messages;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * Tests {@link Messages}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MessagesTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
public class MessagesTest {

    @Test
    public void messagesMatch() throws Exception {
        MessageComparator comparator = new MessageComparator(
                new LocalizedLabelContainerClassInfo(Messages.class));
        assertTrue(comparator.getDifferences(), comparator.isMatch());
    }
}