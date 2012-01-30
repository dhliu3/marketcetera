package org.marketcetera.client.jms;

import java.math.BigDecimal;
import org.marketcetera.trade.Factory;
import org.marketcetera.trade.OrderSingle;
import org.marketcetera.util.ws.tags.SessionId;

/**
 * @author tlerios@marketcetera.com
 * @since 1.5.0
 * @version $Id: SampleEnvelopeReplyHandler.java 10492 2009-04-14 00:11:35Z klim $
 */

/* $License$ */

public class SampleEnvelopeReplyHandler
    extends SampleReplyHandler<OrderEnvelope>
{

    // CLASS DATA.

    private static final SessionId SESSION_ID=SessionId.generate();


    // SampleReplyHandler.

    @Override
    OrderEnvelope create
        (int i)
    {
        OrderSingle msg=Factory.getInstance().createOrderSingle();
        msg.setPrice(new BigDecimal(i));
        return new OrderEnvelope(msg,SESSION_ID);
    }

    @Override
    boolean isEqual
        (int i,
         OrderEnvelope msg)
    {
        return (i==((OrderSingle)msg.getOrder()).getPrice().intValue());
    }

    @Override
    protected OrderEnvelope getReply
        (OrderEnvelope msg)
    {
        return create(((OrderSingle)msg.getOrder()).getPrice().intValue()+1);
    }
}
