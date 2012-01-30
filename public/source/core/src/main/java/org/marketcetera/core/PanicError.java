package org.marketcetera.core;

/**
 * Our top-level error that is thrown when things really break
 * @author Toli Kuznets
 * @version $Id: PanicError.java 9456 2008-07-31 22:28:30Z klim $
 */
@ClassVersion("$Id: PanicError.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public class PanicError extends Error
{
    public PanicError(String message)
    {
        super(message);
    }

    public PanicError(Throwable cause)
    {
        super(cause);
    }

    public PanicError(String message, Throwable cause)
    {
        super(message, cause);
    }
}
