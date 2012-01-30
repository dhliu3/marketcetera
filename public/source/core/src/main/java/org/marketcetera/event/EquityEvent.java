package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Indicates that the implementing class represents an equity event.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: EquityEvent.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: EquityEvent.java 10885 2009-11-17 19:22:56Z klim $")
public interface EquityEvent
        extends HasEquity, Event
{
}
