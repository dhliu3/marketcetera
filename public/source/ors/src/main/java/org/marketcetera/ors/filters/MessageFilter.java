package org.marketcetera.ors.filters;

import org.marketcetera.util.misc.ClassVersion;
import quickfix.Message;

/**
 *
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: MessageFilter.java 10481 2009-04-13 20:32:12Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: MessageFilter.java 10481 2009-04-13 20:32:12Z tlerios $")
public interface MessageFilter
{
    boolean isAccepted
        (Message message);
}
