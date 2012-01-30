package org.marketcetera.event;

import java.util.List;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Represents the Depth-of-Book for a specific instrument.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: DepthOfBookEvent.java 10836 2009-10-27 00:02:15Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: DepthOfBookEvent.java 10836 2009-10-27 00:02:15Z klim $")
public interface DepthOfBookEvent
        extends AggregateEvent, HasInstrument
{
    /**
     * Get the asks value.
     *
     * @return a <code>List&lt;AskEvent&gt;</code> value
     */
    public List<AskEvent> getAsks();
    /**
     * Get the bids value.
     *
     * @return a <code>List&lt;BidEvent&gt;</code> value
     */
    public List<BidEvent> getBids();
}
