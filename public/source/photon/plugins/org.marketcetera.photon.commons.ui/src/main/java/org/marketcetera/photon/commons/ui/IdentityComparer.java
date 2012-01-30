package org.marketcetera.photon.commons.ui;

import org.eclipse.jface.viewers.IElementComparer;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * An IElementComparer that compares objects by identity. 
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: IdentityComparer.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: IdentityComparer.java 10885 2009-11-17 19:22:56Z klim $")
public final class IdentityComparer implements IElementComparer {

    @Override
    public boolean equals(Object a, Object b) {
        return a == b;
    }

    @Override
    public int hashCode(Object element) {
        return System.identityHashCode(element);
    }
}
