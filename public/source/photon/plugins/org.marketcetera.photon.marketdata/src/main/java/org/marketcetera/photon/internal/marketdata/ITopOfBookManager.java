package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.photon.model.marketdata.impl.MDTopOfBookImpl;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Interface for a manger of top of book market data flows.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ITopOfBookManager.java 10495 2009-04-15 21:37:09Z will $
 * @since 1.5.0
 */
@ClassVersion("$Id: ITopOfBookManager.java 10495 2009-04-15 21:37:09Z will $")
@ImplementedBy(TopOfBookManager.class)
public interface ITopOfBookManager extends IDataFlowManager<MDTopOfBookImpl, TopOfBookKey> {
}
