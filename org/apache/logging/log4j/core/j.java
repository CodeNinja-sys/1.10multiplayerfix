/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public class j {
    public final v a;
    public final org.apache.logging.log4j.core.config.d b;
    private final b d;
    private final int e;
    private final i f;
    final /* synthetic */ i c;

    public j(i i2, org.apache.logging.log4j.core.config.d d2, i i3) {
        this.c = i2;
        this.b = d2;
        this.a = d2.e(i2.d());
        this.d = this.a.i();
        this.e = this.d.a();
        this.f = i3;
    }

    public j(i i2, j j2, b b2) {
        this.c = i2;
        this.b = j2.b;
        this.a = j2.a;
        this.d = b2;
        this.e = this.d.a();
        this.f = j2.f;
    }

    public j(i i2, j j2, v v2) {
        this.c = i2;
        this.b = j2.b;
        this.a = v2;
        this.d = v2.i();
        this.e = this.d.a();
        this.f = j2.f;
    }

    public void a(h h2) {
        this.b.m().a();
        this.a.d(h2);
    }

    boolean a(b b2, f f2, String string) {
        e e2;
        this.b.m().a();
        d d2 = this.b.aY_();
        if (d2 != null && (e2 = d2.a(this.f, b2, f2, string, new Object[0])) != org.apache.logging.log4j.core.e.b) {
            return e2 == org.apache.logging.log4j.core.e.a;
        }
        return this.e >= b2.a();
    }

    boolean a(b b2, f f2, String string, Throwable throwable) {
        e e2;
        this.b.m().a();
        d d2 = this.b.aY_();
        if (d2 != null && (e2 = d2.a(this.f, b2, f2, (Object)string, throwable)) != org.apache.logging.log4j.core.e.b) {
            return e2 == org.apache.logging.log4j.core.e.a;
        }
        return this.e >= b2.a();
    }

    boolean a(b b2, f f2, String string, Object ... arrobject) {
        e e2;
        this.b.m().a();
        d d2 = this.b.aY_();
        if (d2 != null && (e2 = d2.a(this.f, b2, f2, string, arrobject)) != org.apache.logging.log4j.core.e.b) {
            return e2 == org.apache.logging.log4j.core.e.a;
        }
        return this.e >= b2.a();
    }

    boolean a(b b2, f f2, Object object, Throwable throwable) {
        e e2;
        this.b.m().a();
        d d2 = this.b.aY_();
        if (d2 != null && (e2 = d2.a(this.f, b2, f2, object, throwable)) != org.apache.logging.log4j.core.e.b) {
            return e2 == org.apache.logging.log4j.core.e.a;
        }
        return this.e >= b2.a();
    }

    boolean a(b b2, f f2, m m2, Throwable throwable) {
        e e2;
        this.b.m().a();
        d d2 = this.b.aY_();
        if (d2 != null && (e2 = d2.a(this.f, b2, f2, m2, throwable)) != org.apache.logging.log4j.core.e.b) {
            return e2 == org.apache.logging.log4j.core.e.a;
        }
        return this.e >= b2.a();
    }

    static /* synthetic */ b a(j j2) {
        return j2.d;
    }
}

