/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.avalon.framework.logger.Logger
 */
package org.apache.commons.d.a;

import org.apache.avalon.framework.logger.Logger;

public class a
implements org.apache.commons.d.a {
    private static volatile Logger a = null;
    private final transient Logger b;

    public a(Logger logger) {
        this.b = logger;
    }

    public a(String string) {
        if (a == null) {
            throw new NullPointerException("default logger has to be specified if this constructor is used!");
        }
        this.b = a.getChildLogger(string);
    }

    public Logger g() {
        return this.b;
    }

    public static void a(Logger logger) {
        a = logger;
    }

    public void b(Object object, Throwable throwable) {
        if (this.g().isDebugEnabled()) {
            this.g().debug(String.valueOf(object), throwable);
        }
    }

    public void b(Object object) {
        if (this.g().isDebugEnabled()) {
            this.g().debug(String.valueOf(object));
        }
    }

    public void e(Object object, Throwable throwable) {
        if (this.g().isErrorEnabled()) {
            this.g().error(String.valueOf(object), throwable);
        }
    }

    public void e(Object object) {
        if (this.g().isErrorEnabled()) {
            this.g().error(String.valueOf(object));
        }
    }

    public void f(Object object, Throwable throwable) {
        if (this.g().isFatalErrorEnabled()) {
            this.g().fatalError(String.valueOf(object), throwable);
        }
    }

    public void f(Object object) {
        if (this.g().isFatalErrorEnabled()) {
            this.g().fatalError(String.valueOf(object));
        }
    }

    public void c(Object object, Throwable throwable) {
        if (this.g().isInfoEnabled()) {
            this.g().info(String.valueOf(object), throwable);
        }
    }

    public void c(Object object) {
        if (this.g().isInfoEnabled()) {
            this.g().info(String.valueOf(object));
        }
    }

    public boolean a() {
        return this.g().isDebugEnabled();
    }

    public boolean b() {
        return this.g().isErrorEnabled();
    }

    public boolean c() {
        return this.g().isFatalErrorEnabled();
    }

    public boolean d() {
        return this.g().isInfoEnabled();
    }

    public boolean e() {
        return this.g().isDebugEnabled();
    }

    public boolean f() {
        return this.g().isWarnEnabled();
    }

    public void a(Object object, Throwable throwable) {
        if (this.g().isDebugEnabled()) {
            this.g().debug(String.valueOf(object), throwable);
        }
    }

    public void a(Object object) {
        if (this.g().isDebugEnabled()) {
            this.g().debug(String.valueOf(object));
        }
    }

    public void d(Object object, Throwable throwable) {
        if (this.g().isWarnEnabled()) {
            this.g().warn(String.valueOf(object), throwable);
        }
    }

    public void d(Object object) {
        if (this.g().isWarnEnabled()) {
            this.g().warn(String.valueOf(object));
        }
    }
}

