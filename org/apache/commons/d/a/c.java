/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.d.a;

public class c
implements Serializable,
a {
    private static final long d = 4784713551416303804L;
    protected static final Level a = Level.FINE;
    protected transient Logger b = null;
    protected String c = null;

    public c(String string) {
        this.c = string;
        this.b = this.g();
    }

    protected void a(Level level, String string, Throwable throwable) {
        Logger logger = this.g();
        if (logger.isLoggable(level)) {
            Throwable throwable2 = new Throwable();
            StackTraceElement[] arrstackTraceElement = throwable2.getStackTrace();
            String string2 = this.c;
            String string3 = "unknown";
            if (arrstackTraceElement != null && arrstackTraceElement.length > 2) {
                StackTraceElement stackTraceElement = arrstackTraceElement[2];
                string3 = stackTraceElement.getMethodName();
            }
            if (throwable == null) {
                logger.logp(level, string2, string3, string);
            } else {
                logger.logp(level, string2, string3, string, throwable);
            }
        }
    }

    public void b(Object object) {
        this.a(Level.FINE, String.valueOf(object), null);
    }

    public void b(Object object, Throwable throwable) {
        this.a(Level.FINE, String.valueOf(object), throwable);
    }

    public void e(Object object) {
        this.a(Level.SEVERE, String.valueOf(object), null);
    }

    public void e(Object object, Throwable throwable) {
        this.a(Level.SEVERE, String.valueOf(object), throwable);
    }

    public void f(Object object) {
        this.a(Level.SEVERE, String.valueOf(object), null);
    }

    public void f(Object object, Throwable throwable) {
        this.a(Level.SEVERE, String.valueOf(object), throwable);
    }

    public Logger g() {
        if (this.b == null) {
            this.b = Logger.getLogger(this.c);
        }
        return this.b;
    }

    public void c(Object object) {
        this.a(Level.INFO, String.valueOf(object), null);
    }

    public void c(Object object, Throwable throwable) {
        this.a(Level.INFO, String.valueOf(object), throwable);
    }

    public boolean a() {
        return this.g().isLoggable(Level.FINE);
    }

    public boolean b() {
        return this.g().isLoggable(Level.SEVERE);
    }

    public boolean c() {
        return this.g().isLoggable(Level.SEVERE);
    }

    public boolean d() {
        return this.g().isLoggable(Level.INFO);
    }

    public boolean e() {
        return this.g().isLoggable(Level.FINEST);
    }

    public boolean f() {
        return this.g().isLoggable(Level.WARNING);
    }

    public void a(Object object) {
        this.a(Level.FINEST, String.valueOf(object), null);
    }

    public void a(Object object, Throwable throwable) {
        this.a(Level.FINEST, String.valueOf(object), throwable);
    }

    public void d(Object object) {
        this.a(Level.WARNING, String.valueOf(object), null);
    }

    public void d(Object object, Throwable throwable) {
        this.a(Level.WARNING, String.valueOf(object), throwable);
    }
}

