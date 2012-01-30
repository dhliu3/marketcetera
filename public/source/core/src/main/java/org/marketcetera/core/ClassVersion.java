package org.marketcetera.core;

import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Graham Miller
 * @version $Id: ClassVersion.java 1797 2008-04-24 01:34:08Z tlerios $
 */
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassVersion
{
    String value();
}
