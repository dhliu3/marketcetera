package org.marketcetera.saclient;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.util.ws.tags.AppId;
import org.marketcetera.core.Util;
import org.marketcetera.core.ApplicationVersion;

/**
 * The SA client version manager.
 *
 * @author anshul@marketcetera.com
 * @version $Id: SAClientVersion.java 15806 2011-01-10 18:46:25Z colin $
 * @since 2.0.0
 */

/* $License$ */

@ClassVersion("$Id: SAClientVersion.java 15806 2011-01-10 18:46:25Z colin $")
public interface SAClientVersion {
    /**
     * The SA client's application ID: the application name.
     */

    static final String APP_ID_NAME = "SAClient"; //$NON-NLS-1$

    /**
     * The SA client's application ID: the version.
     */

    static final String APP_ID_VERSION = ApplicationVersion.VERSION_2_1_4;

    /**
     * The client's application ID: the ID.
     */

    static final AppId APP_ID = Util.getAppId(APP_ID_NAME, APP_ID_VERSION);

}