package org.marketcetera.event;

import org.marketcetera.trade.Option;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Has an {@link Option} attribute.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: HasOption.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: HasOption.java 10885 2009-11-17 19:22:56Z klim $")
public interface HasOption
        extends HasInstrument
{
    /**
     * Gets the instrument value.
     *
     * @return an <code>Option</code> value
     */
    @Override
    public Option getInstrument();
}
