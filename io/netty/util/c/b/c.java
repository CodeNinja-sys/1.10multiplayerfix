/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.b.a;
import io.netty.util.c.b.e;
import io.netty.util.c.b.m;

class c
extends a {
    private static final long a = 8647838678388394885L;
    private final transient org.apache.commons.d.a b;

    c(org.apache.commons.d.a a2, String string) {
        super(string);
        if (a2 == null) {
            throw new NullPointerException("logger");
        }
        this.b = a2;
    }

    @Override
    public boolean c() {
        return this.b.e();
    }

    @Override
    public void a(String string) {
        this.b.a(string);
    }

    @Override
    public void a(String string, Object object) {
        if (this.b.e()) {
            e e2 = m.a(string, object);
            this.b.a(e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Object object, Object object2) {
        if (this.b.e()) {
            e e2 = m.a(string, object, object2);
            this.b.a(e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Object ... arrobject) {
        if (this.b.e()) {
            e e2 = m.a(string, arrobject);
            this.b.a(e2.a(), e2.c());
        }
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.b.a(string, throwable);
    }

    @Override
    public boolean d() {
        return this.b.a();
    }

    @Override
    public void b(String string) {
        this.b.b(string);
    }

    @Override
    public void b(String string, Object object) {
        if (this.b.a()) {
            e e2 = m.a(string, object);
            this.b.b(e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Object object, Object object2) {
        if (this.b.a()) {
            e e2 = m.a(string, object, object2);
            this.b.b(e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Object ... arrobject) {
        if (this.b.a()) {
            e e2 = m.a(string, arrobject);
            this.b.b(e2.a(), e2.c());
        }
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.b.b(string, throwable);
    }

    @Override
    public boolean e() {
        return this.b.d();
    }

    @Override
    public void c(String string) {
        this.b.c(string);
    }

    @Override
    public void c(String string, Object object) {
        if (this.b.d()) {
            e e2 = m.a(string, object);
            this.b.c(e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Object object, Object object2) {
        if (this.b.d()) {
            e e2 = m.a(string, object, object2);
            this.b.c(e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Object ... arrobject) {
        if (this.b.d()) {
            e e2 = m.a(string, arrobject);
            this.b.c(e2.a(), e2.c());
        }
    }

    @Override
    public void c(String string, Throwable throwable) {
        this.b.c(string, throwable);
    }

    @Override
    public boolean f() {
        return this.b.f();
    }

    @Override
    public void d(String string) {
        this.b.d(string);
    }

    @Override
    public void d(String string, Object object) {
        if (this.b.f()) {
            e e2 = m.a(string, object);
            this.b.d(e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Object object, Object object2) {
        if (this.b.f()) {
            e e2 = m.a(string, object, object2);
            this.b.d(e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Object ... arrobject) {
        if (this.b.f()) {
            e e2 = m.a(string, arrobject);
            this.b.d(e2.a(), e2.c());
        }
    }

    @Override
    public void d(String string, Throwable throwable) {
        this.b.d(string, throwable);
    }

    @Override
    public boolean g() {
        return this.b.b();
    }

    @Override
    public void e(String string) {
        this.b.e(string);
    }

    @Override
    public void e(String string, Object object) {
        if (this.b.b()) {
            e e2 = m.a(string, object);
            this.b.e(e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Object object, Object object2) {
        if (this.b.b()) {
            e e2 = m.a(string, object, object2);
            this.b.e(e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Object ... arrobject) {
        if (this.b.b()) {
            e e2 = m.a(string, arrobject);
            this.b.e(e2.a(), e2.c());
        }
    }

    @Override
    public void e(String string, Throwable throwable) {
        this.b.e(string, throwable);
    }
}

