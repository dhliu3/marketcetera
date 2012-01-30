package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.orderloader.Messages;
import org.marketcetera.orderloader.OrderParsingException;
import org.marketcetera.trade.OrderSingle;

/**
 * Extracts the price value from the order row and sets it on the supplied
 * order.
 *
 * @author anshul@marketcetera.com
 * @version $Id: PriceProcessor.java 10231 2008-12-09 23:33:45Z klim $
 * @since 1.0.0
 */
@ClassVersion("$Id: PriceProcessor.java 10231 2008-12-09 23:33:45Z klim $")
class PriceProcessor extends BigDecimalProcessor {
    /**
     * Creates an instance.
     *
     * @param inIndex the column index at which the price value can
     *                be found in an order row.
     */
    public PriceProcessor(int inIndex) {
        super(Messages.INVALID_PRICE_VALUE, inIndex);
    }

    @Override
    public void apply(String[] inRow, OrderSingle inOrder)
            throws OrderParsingException {
        inOrder.setPrice(getDecimalValue(inRow));
    }
}
