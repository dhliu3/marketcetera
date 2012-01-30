package org.marketcetera.util.log;

import java.io.Serializable;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A bound message, representing the combination of an {@link
 * I18NMessageNP} and its arbitrary number of parameters.
 * 
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: I18NBoundMessageNP.java 10381 2009-03-06 18:14:39Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: I18NBoundMessageNP.java 10381 2009-03-06 18:14:39Z tlerios $")
public class I18NBoundMessageNP
    extends I18NBoundMessageBase<I18NMessageNP>
{

    // CLASS DATA.

    private static final long serialVersionUID=1L;


    // CONSTRUCTORS.

    /**
     * Constructor mirroring superclass constructor.
     *
     * @see I18NBoundMessageBase#I18NBoundMessageBase(I18NMessage,Serializable...)
     */

    public I18NBoundMessageNP
        (I18NMessageNP message,
         Serializable... params)
    {
        super(message,params);
    }
}