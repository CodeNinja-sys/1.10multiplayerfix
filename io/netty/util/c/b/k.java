/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 *  org.apache.log4j.Priority
 */
package io.netty.util.c.b;

import io.netty.util.c.b.a;
import io.netty.util.c.b.e;
import io.netty.util.c.b.m;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

class k
extends a {
    private static final long d = 2851357342488183058L;
    final transient Logger a;
    static final String b = k.class.getName();
    final boolean c;

    k(Logger logger) {
        super(logger.getName());
        this.a = logger;
        this.c = this.h();
    }

    private boolean h() {
        try {
            this.a.isTraceEnabled();
            return true;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            return false;
        }
    }

    @Override
    public boolean c() {
        if (this.c) {
            return this.a.isTraceEnabled();
        }
        return this.a.isDebugEnabled();
    }

    @Override
    public void a(String string) {
        this.a.log(b, (Priority)(this.c ? Level.TRACE : Level.DEBUG), (Object)string, null);
    }

    @Override
    public void a(String string, Object object) {
        if (this.c()) {
            e e2 = m.a(string, object);
            this.a.log(b, (Priority)(this.c ? Level.TRACE : Level.DEBUG), (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Object object, Object object2) {
        if (this.c()) {
            e e2 = m.a(string, object, object2);
            this.a.log(b, (Priority)(this.c ? Level.TRACE : Level.DEBUG), (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Object ... arrobject) {
        if (this.c()) {
            e e2 = m.a(string, arrobject);
            this.a.log(b, (Priority)(this.c ? Level.TRACE : Level.DEBUG), (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.a.log(b, (Priority)(this.c ? Level.TRACE : Level.DEBUG), (Object)string, throwable);
    }

    @Override
    public boolean d() {
        return this.a.isDebugEnabled();
    }

    @Override
    public void b(String string) {
        this.a.log(b, (Priority)Level.DEBUG, (Object)string, null);
    }

    @Override
    public void b(String string, Object object) {
        if (this.a.isDebugEnabled()) {
            e e2 = m.a(string, object);
            this.a.log(b, (Priority)Level.DEBUG, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Object object, Object object2) {
        if (this.a.isDebugEnabled()) {
            e e2 = m.a(string, object, object2);
            this.a.log(b, (Priority)Level.DEBUG, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Object ... arrobject) {
        if (this.a.isDebugEnabled()) {
            e e2 = m.a(string, arrobject);
            this.a.log(b, (Priority)Level.DEBUG, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.a.log(b, (Priority)Level.DEBUG, (Object)string, throwable);
    }

    @Override
    public boolean e() {
        return this.a.isInfoEnabled();
    }

    @Override
    public void c(String string) {
        this.a.log(b, (Priority)Level.INFO, (Object)string, null);
    }

    @Override
    public void c(String string, Object object) {
        if (this.a.isInfoEnabled()) {
            e e2 = m.a(string, object);
            this.a.log(b, (Priority)Level.INFO, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Object object, Object object2) {
        if (this.a.isInfoEnabled()) {
            e e2 = m.a(string, object, object2);
            this.a.log(b, (Priority)Level.INFO, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Object ... arrobject) {
        if (this.a.isInfoEnabled()) {
            e e2 = m.a(string, arrobject);
            this.a.log(b, (Priority)Level.INFO, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Throwable throwable) {
        this.a.log(b, (Priority)Level.INFO, (Object)string, throwable);
    }

    @Override
    public boolean f() {
        return this.a.isEnabledFor((Priority)Level.WARN);
    }

    @Override
    public void d(String string) {
        this.a.log(b, (Priority)Level.WARN, (Object)string, null);
    }

    @Override
    public void d(String string, Object object) {
        if (this.a.isEnabledFor((Priority)Level.WARN)) {
            e e2 = m.a(string, object);
            this.a.log(b, (Priority)Level.WARN, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Object object, Object object2) {
        if (this.a.isEnabledFor((Priority)Level.WARN)) {
            e e2 = m.a(string, object, object2);
            this.a.log(b, (Priority)Level.WARN, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Object ... arrobject) {
        if (this.a.isEnabledFor((Priority)Level.WARN)) {
            e e2 = m.a(string, arrobject);
            this.a.log(b, (Priority)Level.WARN, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Throwable throwable) {
        this.a.log(b, (Priority)Level.WARN, (Object)string, throwable);
    }

    @Override
    public boolean g() {
        return this.a.isEnabledFor((Priority)Level.ERROR);
    }

    @Override
    public void e(String string) {
        this.a.log(b, (Priority)Level.ERROR, (Object)string, null);
    }

    @Override
    public void e(String string, Object object) {
        if (this.a.isEnabledFor((Priority)Level.ERROR)) {
            e e2 = m.a(string, object);
            this.a.log(b, (Priority)Level.ERROR, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Object object, Object object2) {
        if (this.a.isEnabledFor((Priority)Level.ERROR)) {
            e e2 = m.a(string, object, object2);
            this.a.log(b, (Priority)Level.ERROR, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Object ... arrobject) {
        if (this.a.isEnabledFor((Priority)Level.ERROR)) {
            e e2 = m.a(string, arrobject);
            this.a.log(b, (Priority)Level.ERROR, (Object)e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Throwable throwable) {
        this.a.log(b, (Priority)Level.ERROR, (Object)string, throwable);
    }
}

