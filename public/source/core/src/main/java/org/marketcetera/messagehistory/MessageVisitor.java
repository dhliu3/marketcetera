package org.marketcetera.messagehistory;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.trade.ReportBase;

/**
 * Visitor Patter - visit all the messages and perfrom an operation on them
 * @author toli
 * @version $Id: MessageVisitor.java 10833 2009-10-26 21:39:40Z colin $
 */

@ClassVersion("$Id: MessageVisitor.java 10833 2009-10-26 21:39:40Z colin $")
public interface MessageVisitor {

    /** Visits each Execution Report that we have gathered for all the
     * outstanding open orders
     * @param report a <code>ReportBase</code> value
     */
    public void visitOpenOrderExecutionReports(ReportBase report);

}
