package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.core.instruments.InstrumentFunctionHandler;
import org.marketcetera.core.instruments.StaticInstrumentFunctionSelector;
import org.marketcetera.marketdata.MarketDataRequestBuilder;
import org.marketcetera.trade.Instrument;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Initializes market data request for an instrument.
 * <p>
 * A subclass of this class should be created for every instrument type handled
 * by the system.
 * 
 * @param <I>
 *            The type of instrument handled by this function
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: InstrumentRequestAdapter.java 10930 2009-12-04 16:48:36Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: InstrumentRequestAdapter.java 10930 2009-12-04 16:48:36Z colin $")
public abstract class InstrumentRequestAdapter<I extends Instrument> extends
        InstrumentFunctionHandler<I> {

    /**
     * Creates an instance that handles the specified instrument subclass.
     * 
     * @param instrument
     *            the instrument subclass handled by this instance.
     */
    protected InstrumentRequestAdapter(Class<I> instrument) {
        super(instrument);
    }

    /**
     * Initializes a {@link MarketDataRequestBuilder} for the provided instrument.
     * 
     * @param instrument
     *            the instrument
     * @return a {@link MarketDataRequestBuilder} with instrument information
     */
    abstract public MarketDataRequestBuilder initializeRequest(I instrument);

    @SuppressWarnings("unchecked")
    public static final StaticInstrumentFunctionSelector<InstrumentRequestAdapter> SELECTOR = new StaticInstrumentFunctionSelector<InstrumentRequestAdapter>(
            InstrumentRequestAdapter.class);
}