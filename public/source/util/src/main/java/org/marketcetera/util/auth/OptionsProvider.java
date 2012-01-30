package org.marketcetera.util.auth;

import org.apache.commons.cli.Options;
import org.marketcetera.util.misc.ClassVersion;

/**
 * A provider of extra command line options.
 *
 * @author anshul@marketcetera.com
 * @version $Id: OptionsProvider.java 10376 2009-03-06 14:54:52Z tlerios $
 * @since 1.0.0
 */

/* $License$ */

@ClassVersion("$Id: OptionsProvider.java 10376 2009-03-06 14:54:52Z tlerios $")
public interface OptionsProvider
{

    /**
     * Adds the given options to the receiver's set of options.
     *
     * @param options The options.
     */

    void addOptions
        (Options options);
}
