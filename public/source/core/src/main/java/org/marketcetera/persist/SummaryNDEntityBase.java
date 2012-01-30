package org.marketcetera.persist;

import org.marketcetera.core.ClassVersion;

/* $License$ */
/**
 * Presents summary view of the entities that have
 * a name and description
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: SummaryNDEntityBase.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public interface SummaryNDEntityBase extends SummaryEntityBase {
    /**
     * The name of this entity
     * 
     * @return the name of this entity
     */
    String getName();

    /**
     * The description of this entity.
     * @return The description.
     */
    String getDescription();
}
