package org.marketcetera.ors.history;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.Equity;

/* $License$ */
/**
 * Tests exec report summary persistence for equity.
 *
 * @author anshul@marketcetera.com
 * @version $Id: EquityExecReportSummaryTest.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: EquityExecReportSummaryTest.java 10885 2009-11-17 19:22:56Z klim $")
public class EquityExecReportSummaryTest extends ExecReportSummaryTestBase<Equity> {
    @Override
    protected Equity getInstrument() {
        return new Equity("sym");
    }
}
