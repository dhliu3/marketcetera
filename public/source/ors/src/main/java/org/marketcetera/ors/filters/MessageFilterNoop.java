package org.marketcetera.ors.filters;

import org.marketcetera.util.misc.ClassVersion;
import quickfix.Message;

/**
 *
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: MessageFilterNoop.java 10481 2009-04-13 20:32:12Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: MessageFilterNoop.java 10481 2009-04-13 20:32:12Z tlerios $")
public class MessageFilterNoop
    implements MessageFilter
{
    @Override
    public boolean isAccepted
        (Message message)
    {
        return true;
    }
}
