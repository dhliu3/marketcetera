package org.marketcetera.photon.module;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Base class for sink data handlers. Clients should extend this class instead of implementing
 * {@link ISinkDataHandler} directly.
 * 
 * @see ISinkDataManager
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: SinkDataHandler.java 10492 2009-04-14 00:11:35Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: SinkDataHandler.java 10492 2009-04-14 00:11:35Z klim $")
public abstract class SinkDataHandler implements ISinkDataHandler {
}
