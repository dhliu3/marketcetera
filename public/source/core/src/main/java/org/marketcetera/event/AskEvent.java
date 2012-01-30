package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Represents an Ask for an instrument on an exchange at a particular time.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: AskEvent.java 10833 2009-10-26 21:39:40Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: AskEvent.java 10833 2009-10-26 21:39:40Z colin $")
public interface AskEvent
        extends QuoteEvent
{
}
