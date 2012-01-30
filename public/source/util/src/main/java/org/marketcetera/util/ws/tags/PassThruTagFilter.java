package org.marketcetera.util.ws.tags;

import org.marketcetera.util.misc.ClassVersion;

/**
 * A tag filter that accepts all tags.
 * 
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: PassThruTagFilter.java 10388 2009-03-07 00:29:58Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: PassThruTagFilter.java 10388 2009-03-07 00:29:58Z tlerios $")
public class PassThruTagFilter
    implements TagFilter
{

    // TagFilter.

    @Override
    public void assertMatch
        (Tag tag) {}
}
