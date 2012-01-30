package org.marketcetera.orderloader.system;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */
/**
 * An object instance to encapsulate an array of columns for a row.
 *
 * @author anshul@marketcetera.com
 * @version $Id: Row.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: Row.java 10885 2009-11-17 19:22:56Z klim $")
public class Row {
    /**
     * Creates an instance.
     *
     * @param inRow the row value.
     */
    public Row(String[] inRow) {
        mRow = inRow;
    }

    /**
     * Returns the row value.
     *
     * @return the row value.
     */
    public String[] getRow() {
        return mRow;
    }

    private final String[] mRow;
}
