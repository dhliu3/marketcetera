package org.marketcetera.module;

import org.marketcetera.util.misc.ClassVersion;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/* $License$ */
/**
 * An XML adapter to serialize ModuleURN into XML and back.
 *
 * @author anshul@marketcetera.com
 * @version $Id: ModuleURNXmlAdapter.java 10885 2009-11-17 19:22:56Z klim $
 * @since 2.0.0
 */
@ClassVersion("$Id: ModuleURNXmlAdapter.java 10885 2009-11-17 19:22:56Z klim $")
class ModuleURNXmlAdapter extends XmlAdapter<String,ModuleURN> {
    @Override
    public ModuleURN unmarshal(String inValue) throws Exception {
        return new ModuleURN(inValue);
    }

    @Override
    public String marshal(ModuleURN inURN) throws Exception {
        return inURN.getValue();
    }
}
