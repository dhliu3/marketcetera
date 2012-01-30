package org.marketcetera.core.instruments;

import org.marketcetera.trade.Instrument;

/* $License$ */

/**
 * {@link UnderlyingSymbolSupport} that just returns the instrument's symbol.
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MockUnderlyingSymbolSupport.java 10886 2009-11-17 19:31:49Z klim $
 * @since 2.0.0
 */
public class MockUnderlyingSymbolSupport implements UnderlyingSymbolSupport {

    @Override
    public String getUnderlying(Instrument instrument) {
        return instrument == null? null : instrument.getSymbol();
    }

}
