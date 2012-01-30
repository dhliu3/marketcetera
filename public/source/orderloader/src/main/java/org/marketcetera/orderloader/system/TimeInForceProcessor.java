package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.TimeInForce;
import org.marketcetera.trade.OrderSingle;
import org.marketcetera.orderloader.Messages;
import org.marketcetera.orderloader.OrderParsingException;

/**
 * Extracts an {@link TimeInForce} value from an order row and sets it
 * on the supplied order.
*
* @author anshul@marketcetera.com
* @version $Id: TimeInForceProcessor.java 10231 2008-12-09 23:33:45Z klim $
* @since 1.0.0
*/
@ClassVersion("$Id: TimeInForceProcessor.java 10231 2008-12-09 23:33:45Z klim $")
final class TimeInForceProcessor extends EnumProcessor<TimeInForce> {
    /**
     * Creates an instance.
     *
     * @param inIndex the column index at which the time in force value
     * can be found in an order row. 
     */
    TimeInForceProcessor(int inIndex) {
        super(TimeInForce.class, TimeInForce.Unknown,
                Messages.INVALID_TIME_IN_FORCE, inIndex);
    }
    @Override
    public void apply(String[] inRow, OrderSingle inOrder)
            throws OrderParsingException {
        inOrder.setTimeInForce(getEnumValue(inRow));
    }
}
