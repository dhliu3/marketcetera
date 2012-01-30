package org.marketcetera.photon.commons.databinding;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * A strongly typed observable value.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ITypedObservableValue.java 10886 2009-11-17 19:31:49Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: ITypedObservableValue.java 10886 2009-11-17 19:31:49Z klim $")
public interface ITypedObservableValue<T> extends IObservableValue {

    /**
     * Returns the typed value, equivalent to {@link #getValue()}.
     * 
     * @return the typed value
     */
    T getTypedValue();
}