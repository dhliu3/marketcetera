package org.marketcetera.core;

/** Marker interface for all {@link ApplicationBase} subclasses
 * to force them to implement functions for MBean introspection
 */
@ClassVersion("$Id: ApplicationMBeanBase.java 9456 2008-07-31 22:28:30Z klim $") //$NON-NLS-1$
public interface ApplicationMBeanBase
{
    public void shutdown() throws Exception;
}
