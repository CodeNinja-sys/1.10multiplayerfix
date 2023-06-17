/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.d.a;

public class j {
    protected static Hashtable a = new Hashtable();
    protected static boolean b = false;
    protected static boolean c = false;
    protected static Constructor d = null;

    private j() {
    }

    public static void a(String string) {
        try {
            Class<?> class_ = Class.forName(string);
            Class[] arrclass = new Class[]{"".getClass()};
            d = class_.getConstructor(arrclass);
        }
        catch (Throwable throwable) {
            d = null;
        }
    }

    public static void a(Class class_) {
        Class[] arrclass = new Class[]{"".getClass()};
        d = class_.getConstructor(arrclass);
    }

    public static a b(String string) {
        a a2 = (a)a.get(string);
        if (null == a2) {
            a2 = j.c(string);
            a.put(string, a2);
        }
        return a2;
    }

    public static a b(Class class_) {
        return j.b(class_.getName());
    }

    public static a c(String string) {
        a a2;
        try {
            Object[] arrobject = new Object[]{string};
            a2 = (a)d.newInstance(arrobject);
        }
        catch (Throwable throwable) {
            a2 = null;
        }
        if (null == a2) {
            a2 = new org.apache.commons.d.a.j(string);
        }
        return a2;
    }

    public static String[] a() {
        return a.keySet().toArray(new String[a.size()]);
    }

    static {
        try {
            b = null != Class.forName("org.apache.log4j.Logger");
        }
        catch (Throwable throwable) {
            b = false;
        }
        try {
            c = null != Class.forName("java.util.logging.Logger") && null != Class.forName("org.apache.commons.d.a.c");
        }
        catch (Throwable throwable) {
            c = false;
        }
        String string = null;
        try {
            string = System.getProperty("org.apache.commons.logging.log");
            if (string == null) {
                string = System.getProperty("org.apache.commons.logging.Log");
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (string != null) {
            try {
                j.a(string);
            }
            catch (Throwable throwable) {
                try {
                    j.a("org.apache.commons.logging.impl.NoOpLog");
                }
                catch (Throwable throwable2) {}
            }
        } else {
            try {
                if (b) {
                    j.a("org.apache.commons.logging.impl.Log4JLogger");
                } else if (c) {
                    j.a("org.apache.commons.d.a.c");
                } else {
                    j.a("org.apache.commons.logging.impl.NoOpLog");
                }
            }
            catch (Throwable throwable) {
                try {
                    j.a("org.apache.commons.logging.impl.NoOpLog");
                }
                catch (Throwable throwable3) {
                    // empty catch block
                }
            }
        }
    }
}

