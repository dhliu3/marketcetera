package org.marketcetera.ors.security;

import org.marketcetera.core.ClassVersion;
import org.marketcetera.persist.SingleFetchQuery;

/* $License$ */
/**
 * Fetches single instances of users. To retrieve multiple instances
 * use {@link MultiSimpleUserQuery}
 *
 * @author anshul@marketcetera.com
 */
@ClassVersion("$Id: SingleSimpleUserQuery.java 10482 2009-04-13 20:35:35Z tlerios $")
public class SingleSimpleUserQuery extends SingleFetchQuery<SimpleUser,SimpleUser> {
    private static final long serialVersionUID = 681794352575625450L;

    /**
     * Creates a query that will fetch the user given its ID.
     *
     * @param id The user ID.
     */
    public SingleSimpleUserQuery(long id) {
        super(SimpleUser.ENTITY_NAME, id);
    }

    /**
     * Creates a query that will fetch the user given user name.
     *
     * @param name The user name.
     */
    public SingleSimpleUserQuery(String name) {
        super(SimpleUser.ENTITY_NAME,  name);
    }

    protected String[] getFetchJoinAttributeNames() {
        return FETCH_JOIN_ATTRIBUTE_NAMES;
    }
    static final String[] FETCH_JOIN_ATTRIBUTE_NAMES = new String[0];
}
