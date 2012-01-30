package org.marketcetera.persist;

import org.marketcetera.core.ClassVersion;

import java.io.Serializable;

/* $License$ */
/**
 * An abstraction that represents the results of a query.
 * This class only serves as a common type for all query
 * results. Concrete Subclasses of this class carry the
 * actual result 
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: QueryResults.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public abstract class QueryResults<R> implements Serializable {
    private static final long serialVersionUID = 342561755118459113L;

    /**
     * The result of the query
     * @return the query result value
     */
    public abstract R getResult();
}
