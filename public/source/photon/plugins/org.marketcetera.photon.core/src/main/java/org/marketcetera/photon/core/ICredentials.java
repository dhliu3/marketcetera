package org.marketcetera.photon.core;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * An object that represents credentials.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: ICredentials.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: ICredentials.java 10885 2009-11-17 19:22:56Z klim $")
public interface ICredentials {

    /**
     * Return the user name.
     * 
     * @return the user name
     */
    public abstract String getUsername();

    /**
     * Return the password.
     * 
     * @return the password
     */
    public abstract String getPassword();
}