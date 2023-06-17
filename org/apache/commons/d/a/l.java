/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.d.a;
import org.apache.commons.d.a.m;
import org.apache.commons.d.b;

public class l
implements Serializable,
a {
    private static final long u = 136942970684951178L;
    protected static final String a = "org.apache.commons.logging.simplelog.";
    protected static final Properties b = new Properties();
    protected static final String c = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    protected static volatile boolean d = false;
    protected static volatile boolean e = true;
    protected static volatile boolean f = false;
    protected static volatile String g = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    protected static DateFormat h = null;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 0;
    public static final int p = 7;
    protected volatile String q = null;
    protected volatile int r;
    private volatile String v = null;
    static Class s;
    static Class t;

    private static String b(String string) {
        String string2 = null;
        try {
            string2 = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        return string2 == null ? b.getProperty(string) : string2;
    }

    private static String a(String string, String string2) {
        String string3 = org.apache.commons.d.a.l.b(string);
        return string3 == null ? string2 : string3;
    }

    private static boolean a(String string, boolean bl2) {
        String string2 = org.apache.commons.d.a.l.b(string);
        return string2 == null ? bl2 : "true".equalsIgnoreCase(string2);
    }

    public l(String string) {
        this.q = string;
        this.a(3);
        String string2 = org.apache.commons.d.a.l.b("org.apache.commons.logging.simplelog.log." + this.q);
        int n2 = String.valueOf(string).lastIndexOf(".");
        while (null == string2 && n2 > -1) {
            string = string.substring(0, n2);
            string2 = org.apache.commons.d.a.l.b("org.apache.commons.logging.simplelog.log." + string);
            n2 = String.valueOf(string).lastIndexOf(".");
        }
        if (null == string2) {
            string2 = org.apache.commons.d.a.l.b("org.apache.commons.logging.simplelog.defaultlog");
        }
        if ("all".equalsIgnoreCase(string2)) {
            this.a(0);
        } else if ("trace".equalsIgnoreCase(string2)) {
            this.a(1);
        } else if ("debug".equalsIgnoreCase(string2)) {
            this.a(2);
        } else if ("info".equalsIgnoreCase(string2)) {
            this.a(3);
        } else if ("warn".equalsIgnoreCase(string2)) {
            this.a(4);
        } else if ("error".equalsIgnoreCase(string2)) {
            this.a(5);
        } else if ("fatal".equalsIgnoreCase(string2)) {
            this.a(6);
        } else if ("off".equalsIgnoreCase(string2)) {
            this.a(7);
        }
    }

    public void a(int n2) {
        this.r = n2;
    }

    public int g() {
        return this.r;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(int n2, Object object, Throwable throwable) {
        Object object2;
        Object object3;
        StringBuffer stringBuffer = new StringBuffer();
        if (f) {
            object3 = new Date();
            DateFormat dateFormat = h;
            synchronized (dateFormat) {
                object2 = h.format((Date)object3);
            }
            stringBuffer.append((String)object2);
            stringBuffer.append(" ");
        }
        switch (n2) {
            case 1: {
                stringBuffer.append("[TRACE] ");
                break;
            }
            case 2: {
                stringBuffer.append("[DEBUG] ");
                break;
            }
            case 3: {
                stringBuffer.append("[INFO] ");
                break;
            }
            case 4: {
                stringBuffer.append("[WARN] ");
                break;
            }
            case 5: {
                stringBuffer.append("[ERROR] ");
                break;
            }
            case 6: {
                stringBuffer.append("[FATAL] ");
            }
        }
        if (e) {
            if (this.v == null) {
                object3 = this.q.substring(this.q.lastIndexOf(".") + 1);
                this.v = ((String)object3).substring(((String)object3).lastIndexOf("/") + 1);
            }
            stringBuffer.append(String.valueOf(this.v)).append(" - ");
        } else if (d) {
            stringBuffer.append(String.valueOf(this.q)).append(" - ");
        }
        stringBuffer.append(String.valueOf(object));
        if (throwable != null) {
            stringBuffer.append(" <");
            stringBuffer.append(throwable.toString());
            stringBuffer.append(">");
            object3 = new StringWriter(1024);
            object2 = new PrintWriter((Writer)object3);
            throwable.printStackTrace((PrintWriter)object2);
            ((PrintWriter)object2).close();
            stringBuffer.append(((StringWriter)object3).toString());
        }
        this.a(stringBuffer);
    }

    protected void a(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }

    protected boolean b(int n2) {
        return n2 >= this.r;
    }

    public final void b(Object object) {
        if (this.b(2)) {
            this.a(2, object, null);
        }
    }

    public final void b(Object object, Throwable throwable) {
        if (this.b(2)) {
            this.a(2, object, throwable);
        }
    }

    public final void a(Object object) {
        if (this.b(1)) {
            this.a(1, object, null);
        }
    }

    public final void a(Object object, Throwable throwable) {
        if (this.b(1)) {
            this.a(1, object, throwable);
        }
    }

    public final void c(Object object) {
        if (this.b(3)) {
            this.a(3, object, null);
        }
    }

    public final void c(Object object, Throwable throwable) {
        if (this.b(3)) {
            this.a(3, object, throwable);
        }
    }

    public final void d(Object object) {
        if (this.b(4)) {
            this.a(4, object, null);
        }
    }

    public final void d(Object object, Throwable throwable) {
        if (this.b(4)) {
            this.a(4, object, throwable);
        }
    }

    public final void e(Object object) {
        if (this.b(5)) {
            this.a(5, object, null);
        }
    }

    public final void e(Object object, Throwable throwable) {
        if (this.b(5)) {
            this.a(5, object, throwable);
        }
    }

    public final void f(Object object) {
        if (this.b(6)) {
            this.a(6, object, null);
        }
    }

    public final void f(Object object, Throwable throwable) {
        if (this.b(6)) {
            this.a(6, object, throwable);
        }
    }

    public final boolean a() {
        return this.b(2);
    }

    public final boolean b() {
        return this.b(5);
    }

    public final boolean c() {
        return this.b(6);
    }

    public final boolean d() {
        return this.b(3);
    }

    public final boolean e() {
        return this.b(1);
    }

    public final boolean f() {
        return this.b(4);
    }

    private static ClassLoader i() {
        ClassLoader classLoader = null;
        try {
            Method method = (s == null ? (s = org.apache.commons.d.a.l.a("java.lang.Thread")) : s).getMethod("getContextClassLoader", null);
            try {
                classLoader = (ClassLoader)method.invoke(Thread.currentThread(), null);
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                if (!(invocationTargetException.getTargetException() instanceof SecurityException)) {
                    throw new b("Unexpected InvocationTargetException", invocationTargetException.getTargetException());
                }
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        if (classLoader == null) {
            classLoader = (t == null ? (t = org.apache.commons.d.a.l.a("org.apache.commons.d.a.l")) : t).getClassLoader();
        }
        return classLoader;
    }

    private static InputStream c(String string) {
        return (InputStream)AccessController.doPrivileged(new m(string));
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static ClassLoader h() {
        return org.apache.commons.d.a.l.i();
    }

    static {
        InputStream inputStream = org.apache.commons.d.a.l.c("simplelog.properties");
        if (null != inputStream) {
            try {
                b.load(inputStream);
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        d = org.apache.commons.d.a.l.a("org.apache.commons.logging.simplelog.showlogname", d);
        e = org.apache.commons.d.a.l.a("org.apache.commons.logging.simplelog.showShortLogname", e);
        if (f = org.apache.commons.d.a.l.a("org.apache.commons.logging.simplelog.showdatetime", f)) {
            g = org.apache.commons.d.a.l.a("org.apache.commons.logging.simplelog.dateTimeFormat", g);
            try {
                h = new SimpleDateFormat(g);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                g = c;
                h = new SimpleDateFormat(g);
            }
        }
    }
}

