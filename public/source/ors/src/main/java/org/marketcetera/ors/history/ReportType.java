package org.marketcetera.ors.history;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * The type of a persistent report. This class is part of the implementation
 * and is made public for persistence. It's not meant to be used by the
 * clients of this package.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ReportType.java 10231 2008-12-09 23:33:45Z klim $
 * @since 1.0.0
 */
@ClassVersion("$Id: ReportType.java 10231 2008-12-09 23:33:45Z klim $")
public enum ReportType {
    /**
     * Represents an execution report.
     *
     * @see org.marketcetera.trade.ExecutionReport
     */
    ExecutionReport,
    /**
     * Represents an order cancel reject report.
     *
     * @see org.marketcetera.trade.OrderCancelReject
     */
    CancelReject
}
