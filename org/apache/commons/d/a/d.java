/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 *  org.apache.log4j.Priority
 */
package org.apache.commons.d.a;

import java.io.Serializable;
import org.apache.commons.d.a;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class d
implements Serializable,
a {
    private static final long d = 5160705895411730424L;
    private static final String e;
    private volatile transient Logger f = null;
    private final String g;
    private static final Priority h;
    static Class a;
    static Class b;
    static Class c;

    public d() {
        this.g = null;
    }

    public d(String string) {
        this.g = string;
        this.f = this.g();
    }

    public d(Logger logger) {
        if (logger == null) {
            throw new IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
        }
        this.g = logger.getName();
        this.f = logger;
    }

    public void a(Object object) {
        this.g().log(e, h, object, null);
    }

    public void a(Object object, Throwable throwable) {
        this.g().log(e, h, object, throwable);
    }

    public void b(Object object) {
        this.g().log(e, (Priority)Level.DEBUG, object, null);
    }

    public void b(Object object, Throwable throwable) {
        this.g().log(e, (Priority)Level.DEBUG, object, throwable);
    }

    public void c(Object object) {
        this.g().log(e, (Priority)Level.INFO, object, null);
    }

    public void c(Object object, Throwable throwable) {
        this.g().log(e, (Priority)Level.INFO, object, throwable);
    }

    public void d(Object object) {
        this.g().log(e, (Priority)Level.WARN, object, null);
    }

    public void d(Object object, Throwable throwable) {
        this.g().log(e, (Priority)Level.WARN, object, throwable);
    }

    public void e(Object object) {
        this.g().log(e, (Priority)Level.ERROR, object, null);
    }

    public void e(Object object, Throwable throwable) {
        this.g().log(e, (Priority)Level.ERROR, object, throwable);
    }

    public void f(Object object) {
        this.g().log(e, (Priority)Level.FATAL, object, null);
    }

    public void f(Object object, Throwable throwable) {
        this.g().log(e, (Priority)Level.FATAL, object, throwable);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Logger g() {
        Logger logger = this.f;
        if (logger == null) {
            d d2 = this;
            synchronized (d2) {
                logger = this.f;
                if (logger == null) {
                    this.f = logger = Logger.getLogger((String)this.g);
                }
            }
        }
        return logger;
    }

    public boolean a() {
        return this.g().isDebugEnabled();
    }

    public boolean b() {
        return this.g().isEnabledFor((Priority)Level.ERROR);
    }

    public boolean c() {
        return this.g().isEnabledFor((Priority)Level.FATAL);
    }

    public boolean d() {
        return this.g().isInfoEnabled();
    }

    public boolean e() {
        return this.g().isEnabledFor(h);
    }

    public boolean f() {
        return this.g().isEnabledFor((Priority)Level.WARN);
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    static {
        Level level;
        e = (a == null ? (a = org.apache.commons.d.a.d.a("org.apache.commons.d.a.d")) : a).getName();
        if (!(c == null ? (c = org.apache.commons.d.a.d.a("org.apache.log4j.Priority")) : c).isAssignableFrom(b == null ? (b = org.apache.commons.d.a.d.a("org.apache.log4j.Level")) : b)) {
            throw new InstantiationError("Log4J 1.2 not available");
        }
        try {
            level = (Priority)(b == null ? (b = org.apache.commons.d.a.d.a("org.apache.log4j.Level")) : b).getDeclaredField("TRACE").get(null);
        }
        catch (Exception exception) {
            level = Level.DEBUG;
        }
        h = level;
    }
}

