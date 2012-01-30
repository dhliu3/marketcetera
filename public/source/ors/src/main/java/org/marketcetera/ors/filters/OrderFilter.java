package org.marketcetera.ors.filters;

import org.marketcetera.core.CoreException;
import org.marketcetera.util.misc.ClassVersion;
import quickfix.Message;

/**
 *
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: OrderFilter.java 10481 2009-04-13 20:32:12Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: OrderFilter.java 10481 2009-04-13 20:32:12Z tlerios $")
public interface OrderFilter
{
    void assertAccepted
        (Message message)
        throws CoreException;
}
