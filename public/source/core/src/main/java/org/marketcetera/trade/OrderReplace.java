package org.marketcetera.trade;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * An order to replace a previously placed order. Instances of this
 * type can be created via {@link Factory#createOrderReplace(ExecutionReport)}.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OrderReplace.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */
@ClassVersion("$Id: OrderReplace.java 10229 2008-12-09 21:48:48Z klim $") //$NON-NLS-1$
public interface OrderReplace extends TradeMessage, RelatedOrder, NewOrReplaceOrder {
}
