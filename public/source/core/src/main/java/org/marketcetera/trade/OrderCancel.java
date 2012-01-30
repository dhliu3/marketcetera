package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * An order to cancel a previously placed order. Instances
 * of this order can be created via
 * {@link Factory#createOrderCancel(ExecutionReport)}.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderCancel.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderCancel.java 10229 2008-12-09 21:48:48Z klim $") //$NON-NLS-1$
public interface OrderCancel extends TradeMessage, RelatedOrder {
}
