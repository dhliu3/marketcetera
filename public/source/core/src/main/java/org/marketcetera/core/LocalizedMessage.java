package org.marketcetera.core;

/**
 * Interface to introduce convenience methods of extracting localized message string
 * @author toli
 * @version $Id: LocalizedMessage.java 9456 2008-07-31 22:28:30Z klim $
 */
public interface LocalizedMessage {
    /** Returns the localized and formatted message for this key.   */
    String getLocalizedMessage();

    /** Returns the localized and formatted message for this key with the specified arguments.   */
    String getLocalizedMessage(Object ... args);

}
