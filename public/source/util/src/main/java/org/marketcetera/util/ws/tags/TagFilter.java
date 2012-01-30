package org.marketcetera.util.ws.tags;

import org.marketcetera.util.except.I18NException;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A tag filter.
 * 
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: TagFilter.java 10388 2009-03-07 00:29:58Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: TagFilter.java 10388 2009-03-07 00:29:58Z tlerios $")
public interface TagFilter
{

    /**
     * Asserts that the given tag is acceptable to the receiver.
     *
     * @throws I18NException Thrown if the tag is not acceptable.
     */

    void assertMatch
        (Tag tag)
        throws I18NException;
}
