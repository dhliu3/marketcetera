package org.marketcetera.photon.internal.marketdata;

import org.marketcetera.photon.model.marketdata.impl.MDLatestTickImpl;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Interface for a manger of latest tick market data flows.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ILatestTickManager.java 10495 2009-04-15 21:37:09Z will $
 * @since 1.5.0
 */
@ClassVersion("$Id: ILatestTickManager.java 10495 2009-04-15 21:37:09Z will $")
@ImplementedBy(LatestTickManager.class)
public interface ILatestTickManager extends IDataFlowManager<MDLatestTickImpl, LatestTickKey> {
}
