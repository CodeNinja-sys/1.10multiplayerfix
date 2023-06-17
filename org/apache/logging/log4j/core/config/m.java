/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.c.f;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.e.a;
import org.apache.logging.log4j.core.k;

public final class m {
    protected static final org.apache.logging.log4j.d.d a = org.apache.logging.log4j.d.d.k();

    private m() {
    }

    public static k a(String string, ClassLoader classLoader, String string2) {
        return m.a(string, classLoader, string2, null);
    }

    public static k a(String string, ClassLoader classLoader, String string2, Object object) {
        try {
            URI uRI = string2 == null ? null : new URI(string2);
            return m.a(string, classLoader, uRI, object);
        }
        catch (URISyntaxException uRISyntaxException) {
            uRISyntaxException.printStackTrace();
            return null;
        }
    }

    public static k a(String string, String string2) {
        return m.a(string, null, string2);
    }

    public static k a(String string, ClassLoader classLoader, URI uRI) {
        return m.a(string, classLoader, uRI, null);
    }

    public static k a(String string, ClassLoader classLoader, URI uRI, Object object) {
        try {
            f f2 = c.a(classLoader, false, uRI);
            if (f2 instanceof k) {
                k k2 = (k)f2;
                org.apache.logging.log4j.core.e.a.a.set(k2);
                if (object != null) {
                    k2.a(object);
                }
                d d2 = org.apache.logging.log4j.core.config.f.a().a(string, uRI);
                k2.a(d2);
                org.apache.logging.log4j.core.e.a.a.remove();
                return k2;
            }
            a.b("LogManager returned an instance of {} which does not implement {}. Unable to initialize Log4j", f2.getClass().getName(), k.class.getName());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static k a(ClassLoader classLoader, h h2) {
        try {
            URI uRI = null;
            try {
                uRI = h2.b() == null ? null : new URI(h2.b());
            }
            catch (Exception exception) {
                // empty catch block
            }
            f f2 = c.a(classLoader, false, uRI);
            if (f2 instanceof k) {
                k k2 = (k)f2;
                org.apache.logging.log4j.core.e.a.a.set(k2);
                d d2 = org.apache.logging.log4j.core.config.f.a().a(h2);
                k2.a(d2);
                org.apache.logging.log4j.core.e.a.a.remove();
                return k2;
            }
            a.b("LogManager returned an instance of {} which does not implement {}. Unable to initialize Log4j", f2.getClass().getName(), k.class.getName());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static void a(k k2) {
        if (k2 != null) {
            k2.f();
        }
    }
}

