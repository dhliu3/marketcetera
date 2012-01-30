package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

import javax.management.MXBean;

/* $License$ */
/**
 * ConcurrentTestModuleMXBean
 *
 * @author anshul@marketcetera.com
 * @version $Id: ConcurrentTestModuleMXBean.java 10319 2009-02-13 22:35:32Z klim $
 * @since 1.1.0
 */
@ClassVersion("$Id: ConcurrentTestModuleMXBean.java 10319 2009-02-13 22:35:32Z klim $")
@MXBean(true)
public interface ConcurrentTestModuleMXBean {
    /**
     * Sets the property value.
     *
     * @param inValue the property value.
     */
    void setValue(String inValue);
}
