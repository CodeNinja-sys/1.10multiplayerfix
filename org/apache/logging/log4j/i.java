/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.a.s;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.c.e;
import org.apache.logging.log4j.c.h;
import org.apache.logging.log4j.c.j;
import org.apache.logging.log4j.c.k;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.b;

public final class i {
    public static final Map a;
    public static final k b;
    private static final String c = "disableThreadContextMap";
    private static final String d = "disableThreadContextStack";
    private static final String e = "disableThreadContext";
    private static final String f = "log4j2.threadContextMap";
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static j j;
    private static k k;
    private static final d l;

    private i() {
    }

    public static void a(String string, String string2) {
        j.a(string, string2);
    }

    public static String a(String string) {
        return j.a(string);
    }

    public static void b(String string) {
        j.b(string);
    }

    public static void a() {
        j.a();
    }

    public static boolean c(String string) {
        return j.c(string);
    }

    public static Map b() {
        return j.b();
    }

    public static Map c() {
        Map map = j.c();
        return map == null ? a : map;
    }

    public static boolean d() {
        return j.d();
    }

    public static void e() {
        k.clear();
    }

    public static org.apache.logging.log4j.j f() {
        return k.e();
    }

    public static org.apache.logging.log4j.j g() {
        return k;
    }

    public static void a(Collection collection) {
        if (collection.size() == 0 || !i) {
            return;
        }
        k.clear();
        k.addAll(collection);
    }

    public static int h() {
        return k.c();
    }

    public static String i() {
        return k.a();
    }

    public static String j() {
        return k.b();
    }

    public static void d(String string) {
        k.a(string);
    }

    public static void a(String string, Object ... arrobject) {
        k.a(s.a(string, arrobject));
    }

    public static void k() {
        k.clear();
    }

    public static void a(int n2) {
        k.a(n2);
    }

    static {
        Object object;
        a = Collections.emptyMap();
        b = new h(new ArrayList());
        l = org.apache.logging.log4j.d.d.k();
        b b2 = org.apache.logging.log4j.e.b.a();
        g = b2.b(e);
        i = !b2.b(d) && !g;
        k = new e(i);
        h = !b2.b(c) && !g;
        String string = b2.a(f);
        ClassLoader classLoader = org.apache.logging.log4j.e.c.c();
        if (string != null) {
            try {
                object = classLoader.loadClass(string);
                if (j.class.isAssignableFrom((Class<?>)object)) {
                    j = (j)((Class)object).newInstance();
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                l.b("Unable to locate configured LoggerContextFactory {}", string);
            }
            catch (Exception exception) {
                l.b("Unable to create configured LoggerContextFactory {}", string, exception);
            }
        }
        if (j == null && org.apache.logging.log4j.e.c.b()) {
            object = org.apache.logging.log4j.c.b();
            Iterator iterator = org.apache.logging.log4j.e.c.a();
            while (iterator.hasNext()) {
                org.apache.logging.log4j.c.i i2 = (org.apache.logging.log4j.c.i)iterator.next();
                string = i2.c();
                String string2 = i2.b();
                if (string == null || !object.getClass().getName().equals(string2)) continue;
                try {
                    Class<?> class_ = classLoader.loadClass(string);
                    if (!j.class.isAssignableFrom(class_)) continue;
                    j = (j)class_.newInstance();
                    break;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    l.b("Unable to locate configured LoggerContextFactory {}", string);
                    j = new org.apache.logging.log4j.c.c(h);
                }
                catch (Exception exception) {
                    l.b("Unable to create configured LoggerContextFactory {}", string, exception);
                    j = new org.apache.logging.log4j.c.c(h);
                }
            }
        }
        if (j == null) {
            j = new org.apache.logging.log4j.c.c(h);
        }
    }
}

