/**
 * 
 */
package org.marketcetera.messagehistory;

import org.marketcetera.util.misc.ClassVersion;

import ca.odell.glazedlists.matchers.Matcher;
/* $License$ */
/**
 * Matches all non-null {@link ReportHolder} objects.
 *
 * @author anshul@marketcetera.com
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: NotNullReportMatcher.java 10229 2008-12-09 21:48:48Z klim $
 * @since 1.0.0
 */
@ClassVersion("$Id: NotNullReportMatcher.java 10229 2008-12-09 21:48:48Z klim $")
public final class NotNullReportMatcher implements Matcher<ReportHolder> {
    public boolean matches(ReportHolder arg0) {
        return arg0 != null;
    }
}