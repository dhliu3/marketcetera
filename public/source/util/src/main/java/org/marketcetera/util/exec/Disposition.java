package org.marketcetera.util.exec;

import org.marketcetera.util.misc.ClassVersion;

/**
 * The allowed destinations for the interleaved standard output and
 * error streams of a process.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: Disposition.java 10378 2009-03-06 15:00:42Z tlerios $
 */

/* $License$ */

@ClassVersion("$Id: Disposition.java 10378 2009-03-06 15:00:42Z tlerios $")
public enum Disposition
{
    MEMORY,
    STDOUT,
    STDERR;
}
