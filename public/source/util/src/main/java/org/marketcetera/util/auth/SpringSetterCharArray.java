package org.marketcetera.util.auth;

import org.apache.commons.lang.StringUtils;
import org.marketcetera.util.log.I18NBoundMessage;
import org.marketcetera.util.misc.ClassVersion;
import org.springframework.context.support.GenericApplicationContext;

/**
 * A setter for a character array holder that obtains the data via
 * Spring configuration properties.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: SpringSetterCharArray.java 10376 2009-03-06 14:54:52Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: SpringSetterCharArray.java 10376 2009-03-06 14:54:52Z tlerios $")
public class SpringSetterCharArray
    extends SpringSetter<Holder<char[]>>
{

    // CONSTRUCTORS.

    /**
     * Constructor mirroring superclass constructor.
     *
     * @see SpringSetter#SpringSetter(Holder,I18NBoundMessage,String)
     */

    public SpringSetterCharArray
        (Holder<char[]> holder,
         I18NBoundMessage usage,
         String propertyName)
    {
        super(holder,usage,propertyName);
    }


    // SpringSetter.

    @Override
    public void setValue
        (GenericApplicationContext context)
    {
        String value=(String)getPropertyValue(context);
        Holder<char[]> holder=getHolder();
        if (!StringUtils.EMPTY.equals(value)) {
            holder.setValue(value.toCharArray());
        }
    }
}
