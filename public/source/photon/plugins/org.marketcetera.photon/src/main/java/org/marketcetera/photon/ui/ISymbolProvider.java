package org.marketcetera.photon.ui;

import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Interface for objects that provide an {@link Equity} symbol.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ISymbolProvider.java 10875 2009-11-16 15:39:07Z will $
 * @since 1.0.0
 */
@ClassVersion("$Id: ISymbolProvider.java 10875 2009-11-16 15:39:07Z will $")//$NON-NLS-1$
public interface ISymbolProvider {

	/**
	 * @return an equity, should not be null
	 */
	Equity getEquity();

}
