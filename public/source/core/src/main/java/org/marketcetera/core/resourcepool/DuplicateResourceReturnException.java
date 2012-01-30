package org.marketcetera.core.resourcepool;

import org.marketcetera.util.log.I18NBoundMessage;

/**
 * Thrown when a {@link Resource} is returned (@see {@link ResourcePool#returnResource(Resource)} twice. 
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: DuplicateResourceReturnException.java 9456 2008-07-31 22:28:30Z klim $
 */
public class DuplicateResourceReturnException
        extends ResourcePoolException
{
    private static final long serialVersionUID = 1418252833897858089L;

    /**
     * Create a new DuplicateResourceReturnException instance.
     */
    public DuplicateResourceReturnException(Throwable inNested)
    {
        super(inNested);
    }

    /**
     * Create a new DuplicateResourceReturnException instance.
     */
    public DuplicateResourceReturnException(I18NBoundMessage inMessage)
    {
        super(inMessage);
    }

    /**
     * Create a new DuplicateResourceReturnException instance.
     */
    public DuplicateResourceReturnException(Throwable inNested,
                                            I18NBoundMessage inMessage)
    {
        super(inNested,
              inMessage);
    }
}
