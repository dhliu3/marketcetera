package org.marketcetera.util.misc;

import java.lang.annotation.Annotation;
import org.junit.Test;
import org.marketcetera.util.test.TestCaseBase;

import static org.junit.Assert.*;

/**
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: ClassVersionTest.java 9385 2008-07-19 17:45:41Z tlerios $
 */

/* $License$ */

public class ClassVersionTest
    extends TestCaseBase
{
    private static final String TEST_VERSION="version";

    @ClassVersion(TEST_VERSION)
    private static class TestClass
    {
    }

    @Test
    public void annotationExists()
    {
        Annotation[] annonations=TestClass.class.getAnnotations();
        assertEquals(1,annonations.length);
        assertEquals(ClassVersion.class,annonations[0].annotationType());
        assertEquals(TEST_VERSION,((ClassVersion)annonations[0]).value());
    }
}
