package org.marketcetera.event;

import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Has an {@link Equity} attribute.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: HasEquity.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: HasEquity.java 10885 2009-11-17 19:22:56Z klim $")
public interface HasEquity
        extends HasInstrument
{
    /**
     * Gets the instrument value.
     *
     * @return an <code>Equity</code> value
     */
    @Override
    public Equity getInstrument();
}
