package org.marketcetera.core.position;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * The key elements available for grouping.
 * 
 * @see PositionRow#getGrouping()
 * @see PositionEngine#getGroupedData(Grouping...)
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: Grouping.java 10875 2009-11-16 15:39:07Z will $
 * @since 1.5.0
 */
@ClassVersion("$Id: Grouping.java 10875 2009-11-16 15:39:07Z will $")
public enum Grouping {
    Underlying {
        @Override
        public String get(PositionRow row) {
            return row.getUnderlying();
        }
    },
    Account {
        @Override
        public String get(PositionRow row) {
            return row.getAccount();
        }
    },
    Trader {
        @Override
        public String get(PositionRow row) {
            return row.getTraderId();
        }
    };

    /**
     * Extracts the value of the field represented by this grouping.
     * 
     * @param row
     *            the row to extract from
     * @return the value
     */
    public abstract String get(PositionRow row);
};
