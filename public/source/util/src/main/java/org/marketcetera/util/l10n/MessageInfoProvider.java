package org.marketcetera.util.l10n;

import java.util.List;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A provider of meta-information for a message collection.
 *
 * @author tlerios@marketcetera.com
 * @since 0.6.0
 * @version $Id: MessageInfoProvider.java 10690 2009-08-19 22:03:36Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: MessageInfoProvider.java 10690 2009-08-19 22:03:36Z tlerios $")
public interface MessageInfoProvider
{
    /**
     * Returns the receiver's meta-information.
     *
     * @return The meta-information.
     */

    List<MessageInfo> getMessageInfo();
}
