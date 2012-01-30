package org.marketcetera.quickfix.customfields;

import org.marketcetera.core.ClassVersion;
import quickfix.UtcTimeStampField;

import java.util.Date;

/**
 * Implementation of a custom field 9884: DateTo
 * @author toli
 * @version $Id: DateTo.java 9470 2008-08-02 02:28:47Z anshul $
 */

@ClassVersion("$Id: DateTo.java 9470 2008-08-02 02:28:47Z anshul $") //$NON-NLS-1$
public class DateTo extends UtcTimeStampField {
    public static final int FIELD = 9884;

    public DateTo() {
        super(FIELD, new Date()); //non-i18n
    }

    public DateTo(Date data) {
        super(FIELD, data);
    }
}
