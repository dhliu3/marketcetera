/*
 * BasketID.java
 *
 * Created on April 18, 2005, 11:26 AM
 */

package org.marketcetera.core;

/**
 * A simple subclass of InternalID that denotes an id for a basket of orders.
 * @author gmiller
 */
@ClassVersion("$Id: BasketID.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public final class BasketID extends InternalID {
    /**
     * Create a new basket ID with the given identifier.
     * @param basketID The basket identifier
     */
    public BasketID(String basketID) {
        super(basketID);
    }
}
