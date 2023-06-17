/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import org.apache.logging.log4j.core.d.q;
import org.apache.logging.log4j.core.d.t;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.b;

public final class p {
    private static boolean a = false;
    private static final d b = org.apache.logging.log4j.d.d.k();
    private static final String c = "Caught Exception while in Loader.getResource. This may be innocuous.";

    public static ClassLoader a() {
        return p.a(p.class, null);
    }

    public static ClassLoader a(Class class_, Class class_2) {
        ClassLoader classLoader;
        ClassLoader classLoader2 = null;
        try {
            classLoader2 = p.b();
        }
        catch (Exception exception) {
            b.f("Caught exception locating thread ClassLoader {}", exception.getMessage());
        }
        ClassLoader classLoader3 = class_ == null ? null : class_.getClassLoader();
        ClassLoader classLoader4 = classLoader = class_2 == null ? null : class_2.getClass().getClassLoader();
        if (p.a(classLoader2, classLoader3)) {
            return p.a(classLoader2, classLoader) ? classLoader2 : classLoader;
        }
        return p.a(classLoader3, classLoader) ? classLoader3 : classLoader;
    }

    public static URL a(String string, ClassLoader classLoader) {
        try {
            URL uRL;
            ClassLoader classLoader2 = p.b();
            if (classLoader2 != null) {
                b.e("Trying to find [" + string + "] using context classloader " + classLoader2 + '.');
                uRL = classLoader2.getResource(string);
                if (uRL != null) {
                    return uRL;
                }
            }
            if ((classLoader2 = p.class.getClassLoader()) != null) {
                b.e("Trying to find [" + string + "] using " + classLoader2 + " class loader.");
                uRL = classLoader2.getResource(string);
                if (uRL != null) {
                    return uRL;
                }
            }
            if (classLoader != null) {
                b.e("Trying to find [" + string + "] using " + classLoader + " class loader.");
                uRL = classLoader.getResource(string);
                if (uRL != null) {
                    return uRL;
                }
            }
        }
        catch (Throwable throwable) {
            b.f(c, throwable);
        }
        b.e("Trying to find [" + string + "] using ClassLoader.getSystemResource().");
        return ClassLoader.getSystemResource(string);
    }

    public static InputStream b(String string, ClassLoader classLoader) {
        try {
            InputStream inputStream;
            ClassLoader classLoader2 = p.b();
            if (classLoader2 != null) {
                b.e("Trying to find [" + string + "] using context classloader " + classLoader2 + '.');
                inputStream = classLoader2.getResourceAsStream(string);
                if (inputStream != null) {
                    return inputStream;
                }
            }
            if ((classLoader2 = p.class.getClassLoader()) != null) {
                b.e("Trying to find [" + string + "] using " + classLoader2 + " class loader.");
                inputStream = classLoader2.getResourceAsStream(string);
                if (inputStream != null) {
                    return inputStream;
                }
            }
            if (classLoader != null) {
                b.e("Trying to find [" + string + "] using " + classLoader + " class loader.");
                inputStream = classLoader.getResourceAsStream(string);
                if (inputStream != null) {
                    return inputStream;
                }
            }
        }
        catch (Throwable throwable) {
            b.f(c, throwable);
        }
        b.e("Trying to find [" + string + "] using ClassLoader.getSystemResource().");
        return ClassLoader.getSystemResourceAsStream(string);
    }

    private static ClassLoader b() {
        ClassLoader classLoader = System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : (ClassLoader)AccessController.doPrivileged(new q());
        return classLoader;
    }

    private static boolean a(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader != null && classLoader2 != null) {
            ClassLoader classLoader3;
            for (classLoader3 = classLoader.getParent(); classLoader3 != null && classLoader3 != classLoader2; classLoader3 = classLoader3.getParent()) {
            }
            return classLoader3 != null;
        }
        return classLoader != null;
    }

    public static Class a(String string) {
        if (a) {
            return Class.forName(string);
        }
        try {
            return p.b().loadClass(string);
        }
        catch (Throwable throwable) {
            return Class.forName(string);
        }
    }

    private p() {
    }

    static {
        String string = org.apache.logging.log4j.e.b.a().a("log4j.ignoreTCL", null);
        if (string != null) {
            a = t.a(string, true);
        }
    }
}

