package org.marketcetera.client.jms;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: SampleIntegerReplyHandler.java 10407 2009-03-10 12:06:21Z tlerios $
 */

/* $License$ */

public class SampleIntegerReplyHandler
    extends SampleReplyHandler<Integer>
{

    // SampleReplyHandler.

    @Override
    Integer create
        (int i)
    {
        return new Integer(i);
    }

    @Override
    boolean isEqual
        (int i,
         Integer msg)
    {
        return (i==msg);
    }

    @Override
    protected Integer getReply
        (Integer msg)
    {
        return (msg+1);
    }
}
