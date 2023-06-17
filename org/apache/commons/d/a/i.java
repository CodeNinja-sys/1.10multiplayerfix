/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.log.Hierarchy
 *  org.apache.log.Logger
 */
package org.apache.commons.d.a;

import java.io.Serializable;
import org.apache.commons.d.a;
import org.apache.log.Hierarchy;
import org.apache.log.Logger;

public class i
implements Serializable,
a {
    private static final long c = 3768538055836059519L;
    protected volatile transient Logger a = null;
    protected String b = null;

    public i(String string) {
        this.b = string;
        this.a = this.g();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Logger g() {
        Logger logger = this.a;
        if (logger == null) {
            i i2 = this;
            synchronized (i2) {
                logger = this.a;
                if (logger == null) {
                    this.a = logger = Hierarchy.getDefaultHierarchy().getLoggerFor(this.b);
                }
            }
        }
        return logger;
    }

    public void a(Object object) {
        this.b(object);
    }

    public void a(Object object, Throwable throwable) {
        this.b(object, throwable);
    }

    public void b(Object object) {
        if (object != null) {
            this.g().debug(String.valueOf(object));
        }
    }

    public void b(Object object, Throwable throwable) {
        if (object != null) {
            this.g().debug(String.valueOf(object), throwable);
        }
    }

    public void c(Object object) {
        if (object != null) {
            this.g().info(String.valueOf(object));
        }
    }

    public void c(Object object, Throwable throwable) {
        if (object != null) {
            this.g().info(String.valueOf(object), throwable);
        }
    }

    public void d(Object object) {
        if (object != null) {
            this.g().warn(String.valueOf(object));
        }
    }

    public void d(Object object, Throwable throwable) {
        if (object != null) {
            this.g().warn(String.valueOf(object), throwable);
        }
    }

    public void e(Object object) {
        if (object != null) {
            this.g().error(String.valueOf(object));
        }
    }

    public void e(Object object, Throwable throwable) {
        if (object != null) {
            this.g().error(String.valueOf(object), throwable);
        }
    }

    public void f(Object object) {
        if (object != null) {
            this.g().fatalError(String.valueOf(object));
        }
    }

    public void f(Object object, Throwable throwable) {
        if (object != null) {
            this.g().fatalError(String.valueOf(object), throwable);
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
}

