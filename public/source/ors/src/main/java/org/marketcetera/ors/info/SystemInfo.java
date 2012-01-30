package org.marketcetera.ors.info;

import org.marketcetera.ors.history.ReportHistoryServices;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A store for system-wide key-value pairs.
 *
 * @author tlerios@marketcetera.com
 * @since 2.0.0
 * @version $Id: SystemInfo.java 10885 2009-11-17 19:22:56Z klim $
 */

/* $License$ */

@ClassVersion("$Id: SystemInfo.java 10885 2009-11-17 19:22:56Z klim $")
public interface SystemInfo
    extends ReadInfo
{

    /**
     * The {@link ReportHistoryServices} key.
     */

    static final String HISTORY_SERVICES=
        "HISTORY_SERVICES"; //$NON-NLS-1$
}
