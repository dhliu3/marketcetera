package org.marketcetera.util.ws.types;

/**
 * @author tlerios@marketcetera.com
 * @since 1.0.0
 * @version $Id: EnumObject.java 10229 2008-12-09 21:48:48Z klim $
 */

/* $License$ */

public enum EnumObject
{
    ONE("One"),
    TWO("Two");


    private final String mName;


    EnumObject(String name)
    {
        mName=name;
    }


    public String getName()
    {
        return mName;
    }
}
