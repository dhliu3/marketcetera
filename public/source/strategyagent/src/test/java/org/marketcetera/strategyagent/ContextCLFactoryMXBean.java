package org.marketcetera.strategyagent;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.module.DisplayName;

import javax.management.MXBean;

/* $License$ */
/**
 * Management interface of a module factory to verify that the context
 * classloader is correctly setup when the methods are invoked.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ContextCLFactoryMXBean.java 10492 2009-04-14 00:11:35Z klim $
 * @since 1.5.0
 */
@ClassVersion("$Id: ContextCLFactoryMXBean.java 10492 2009-04-14 00:11:35Z klim $")
@DisplayName("Management Interface for factory")
@MXBean(true)
public interface ContextCLFactoryMXBean {
    @DisplayName("An Attribute")
    public String getAttribute();
    @DisplayName("An Attribute")
    public void setAttribute(
            @DisplayName("An Attribute")
            String inValue);
    @DisplayName("An Operation")
    public void operation();
}
