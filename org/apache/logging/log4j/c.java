/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j;

import java.io.Serializable;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.a.w;
import org.apache.logging.log4j.c.f;
import org.apache.logging.log4j.c.g;
import org.apache.logging.log4j.c.i;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.b;

public class c {
    private static g b;
    private static final String c = "log4j2.loggerContextFactory";
    private static final d d;
    public static final String a = "";

    private static String a(int n2) {
        return new Throwable().getStackTrace()[n2].getClassName();
    }

    public static f a() {
        return b.b(c.class.getName(), null, true);
    }

    public static f a(boolean bl2) {
        return b.b(c.class.getName(), null, bl2);
    }

    public static f a(ClassLoader classLoader, boolean bl2) {
        return b.b(c.class.getName(), classLoader, bl2);
    }

    public static f a(ClassLoader classLoader, boolean bl2, URI uRI) {
        return b.b(c.class.getName(), classLoader, bl2, uRI);
    }

    protected static f a(String string, boolean bl2) {
        return b.b(string, null, bl2);
    }

    protected static f a(String string, ClassLoader classLoader, boolean bl2) {
        return b.b(string, classLoader, bl2);
    }

    public static g b() {
        return b;
    }

    public static d a(Class class_) {
        return org.apache.logging.log4j.c.a(class_ != null ? class_.getName() : org.apache.logging.log4j.c.a(2), (n)w.a);
    }

    public static d a(Object object) {
        return org.apache.logging.log4j.c.a(object != null ? object.getClass().getName() : org.apache.logging.log4j.c.a(2), (n)w.a);
    }

    public static d a(String string) {
        return org.apache.logging.log4j.c.a(string != null ? string : org.apache.logging.log4j.c.a(2), (n)w.a);
    }

    public static d c() {
        return org.apache.logging.log4j.c.b(org.apache.logging.log4j.c.a(2));
    }

    public static d b(Class class_) {
        return org.apache.logging.log4j.c.b(class_ != null ? class_.getName() : org.apache.logging.log4j.c.a(2));
    }

    public static d a(Class class_, n n2) {
        return org.apache.logging.log4j.c.a(class_ != null ? class_.getName() : org.apache.logging.log4j.c.a(2), n2);
    }

    public static d a(n n2) {
        return org.apache.logging.log4j.c.a(org.apache.logging.log4j.c.a(2), n2);
    }

    public static d b(Object object) {
        return org.apache.logging.log4j.c.b(object != null ? object.getClass().getName() : org.apache.logging.log4j.c.a(2));
    }

    public static d a(Object object, n n2) {
        return org.apache.logging.log4j.c.a(object != null ? object.getClass().getName() : org.apache.logging.log4j.c.a(2), n2);
    }

    public static d b(String string) {
        String string2 = string != null ? string : org.apache.logging.log4j.c.a(2);
        return b.b(c.class.getName(), null, false).c(string2);
    }

    public static d a(String string, n n2) {
        String string2 = string != null ? string : org.apache.logging.log4j.c.a(2);
        return b.b(c.class.getName(), null, false).b(string2, n2);
    }

    protected static d a(String string, String string2) {
        return b.b(string, null, false).c(string2);
    }

    public static d d() {
        return org.apache.logging.log4j.c.b(a);
    }

    protected c() {
    }

    static {
        Serializable serializable;
        d = org.apache.logging.log4j.d.d.k();
        b b2 = org.apache.logging.log4j.e.b.a();
        String string = b2.a(c);
        ClassLoader classLoader = org.apache.logging.log4j.e.c.c();
        if (string != null) {
            try {
                serializable = classLoader.loadClass(string);
                if (g.class.isAssignableFrom((Class<?>)serializable)) {
                    b = (g)((Class)serializable).newInstance();
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                d.b("Unable to locate configured LoggerContextFactory {}", string);
            }
            catch (Exception exception) {
                d.b("Unable to create configured LoggerContextFactory {}", string, exception);
            }
        }
        if (b == null) {
            serializable = new TreeMap();
            if (org.apache.logging.log4j.e.c.b()) {
                Object object;
                Iterator iterator = org.apache.logging.log4j.e.c.a();
                while (iterator.hasNext()) {
                    object = (i)iterator.next();
                    String string2 = ((i)object).b();
                    if (string2 == null) continue;
                    try {
                        Class<?> classNotFoundException = classLoader.loadClass(string2);
                        if (g.class.isAssignableFrom(classNotFoundException)) {
                            serializable.put(((i)object).a(), (g)classNotFoundException.newInstance());
                            continue;
                        }
                        d.b((String)string2 + " does not implement " + g.class.getName());
                    }
                    catch (ClassNotFoundException illegalAccessException) {
                        d.b("Unable to locate class " + (String)string2 + " specified in " + ((i)object).d().toString(), (Throwable)illegalAccessException);
                    }
                    catch (IllegalAccessException exception) {
                        d.b("Unable to create class " + (String)string2 + " specified in " + ((i)object).d().toString(), (Throwable)exception);
                    }
                    catch (Exception exception) {
                        d.b("Unable to create class " + (String)string2 + " specified in " + ((i)object).d().toString(), (Throwable)exception);
                        exception.printStackTrace();
                    }
                }
                if (serializable.size() == 0) {
                    d.b("Unable to locate a logging implementation, using SimpleLogger");
                    b = new org.apache.logging.log4j.b.c();
                } else {
                    object = new StringBuilder("Multiple logging implementations found: \n");
                    for (Map.Entry entry : serializable.entrySet()) {
                        ((StringBuilder)object).append("Factory: ").append(((g)entry.getValue()).getClass().getName());
                        ((StringBuilder)object).append(", Weighting: ").append(entry.getKey()).append("\n");
                    }
                    b = (g)serializable.get(serializable.lastKey());
                    ((StringBuilder)object).append("Using factory: ").append(b.getClass().getName());
                    d.f(((StringBuilder)object).toString());
                }
            } else {
                d.b("Unable to locate a logging implementation, using SimpleLogger");
                b = new org.apache.logging.log4j.b.c();
            }
        }
    }
}

