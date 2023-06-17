/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.e;

import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.apache.logging.log4j.c.i;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.b;

public final class c {
    private static final String a = "META-INF/log4j-provider.properties";
    private static final String b = "Log4jAPIVersion";
    private static final String[] c = new String[]{"2.0.0"};
    private static final d d = org.apache.logging.log4j.d.d.k();
    private static final List e = new ArrayList();

    private c() {
    }

    public static Iterator a() {
        return e.iterator();
    }

    public static boolean b() {
        return e.size() > 0;
    }

    public static ClassLoader c() {
        ClassLoader classLoader = System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : (ClassLoader)AccessController.doPrivileged(new org.apache.logging.log4j.e.d());
        if (classLoader == null) {
            classLoader = c.class.getClassLoader();
        }
        return classLoader;
    }

    private static boolean a(String string) {
        for (String string2 : c) {
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return false;
    }

    static {
        ClassLoader classLoader = org.apache.logging.log4j.e.c.c();
        Enumeration<URL> enumeration = null;
        try {
            enumeration = classLoader.getResources(a);
        }
        catch (IOException iOException) {
            d.c("Unable to locate META-INF/log4j-provider.properties", (Throwable)iOException);
        }
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                URL uRL = enumeration.nextElement();
                try {
                    Properties properties = org.apache.logging.log4j.e.b.a(uRL.openStream(), uRL);
                    if (!org.apache.logging.log4j.e.c.a(properties.getProperty(b))) continue;
                    e.add(new i(properties, uRL));
                }
                catch (IOException iOException) {
                    d.b("Unable to open " + uRL.toString(), (Throwable)iOException);
                }
            }
        }
    }
}

