/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.av;
import io.netty.channel.bd;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.bx;
import io.netty.channel.cz;
import io.netty.channel.dd;
import io.netty.channel.dq;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.x;

public final class db {
    private static final g b = io.netty.util.c.b.h.a(db.class);
    private final bd c;
    private final bj d;
    private final cz e;
    private dd f;
    private dd g;
    private int h;

    public db(bd bd2) {
        if (bd2 == null) {
            throw new NullPointerException("ctx");
        }
        this.c = bd2;
        this.d = bd2.b().t().a();
        this.e = bd2.b().G().k().a();
    }

    public boolean a() {
        assert (this.c.e().bt_());
        return this.f == null;
    }

    public int b() {
        assert (this.c.e().bt_());
        return this.h;
    }

    public void a(Object object, bw bw2) {
        assert (this.c.e().bt_());
        if (object == null) {
            throw new NullPointerException("msg");
        }
        if (bw2 == null) {
            throw new NullPointerException("promise");
        }
        int n2 = this.e.a(object);
        if (n2 < 0) {
            n2 = 0;
        }
        dd dd2 = dd.a(object, n2, bw2);
        dd dd3 = this.g;
        if (dd3 == null) {
            this.g = this.f = dd2;
        } else {
            dd.a(dd3, dd2);
            this.g = dd2;
        }
        ++this.h;
        this.d.a(dd.a(dd2));
    }

    public void a(Throwable throwable) {
        assert (this.c.e().bt_());
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        dd dd2 = this.f;
        while (dd2 != null) {
            dd dd3 = dd.b(dd2);
            x.c(dd.c(dd2));
            bw bw2 = dd.d(dd2);
            this.a(dd2);
            db.a(bw2, throwable);
            dd2 = dd3;
        }
        this.g();
    }

    public void b(Throwable throwable) {
        assert (this.c.e().bt_());
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        dd dd2 = this.f;
        if (dd2 == null) {
            return;
        }
        x.c(dd.c(dd2));
        bw bw2 = dd.d(dd2);
        db.a(bw2, throwable);
        this.a(dd2);
    }

    public av c() {
        assert (this.c.e().bt_());
        dd dd2 = this.f;
        if (dd2 == null) {
            return null;
        }
        if (this.h == 1) {
            return this.d();
        }
        bw bw2 = this.c.r();
        bx bx2 = new bx(bw2);
        while (dd2 != null) {
            dd dd3 = dd.b(dd2);
            Object object = dd.c(dd2);
            bw bw3 = dd.d(dd2);
            this.a(dd2);
            this.c.a(object, bw3);
            bx2.a(bw3);
            dd2 = dd3;
        }
        this.g();
        return bw2;
    }

    private void g() {
        assert (this.g == null && this.f == null && this.h == 0);
    }

    public av d() {
        assert (this.c.e().bt_());
        dd dd2 = this.f;
        if (dd2 == null) {
            return null;
        }
        Object object = dd.c(dd2);
        bw bw2 = dd.d(dd2);
        this.a(dd2);
        return this.c.a(object, bw2);
    }

    public bw e() {
        assert (this.c.e().bt_());
        dd dd2 = this.f;
        if (dd2 == null) {
            return null;
        }
        bw bw2 = dd.d(dd2);
        x.c(dd.c(dd2));
        this.a(dd2);
        return bw2;
    }

    public Object f() {
        assert (this.c.e().bt_());
        dd dd2 = this.f;
        if (dd2 == null) {
            return null;
        }
        return dd.c(dd2);
    }

    private void a(dd dd2) {
        dd dd3 = dd.b(dd2);
        this.d.b(dd.a(dd2));
        dd.e(dd2);
        --this.h;
        if (dd3 == null) {
            this.g = null;
            this.f = null;
            assert (this.h == 0);
        } else {
            this.f = dd3;
            assert (this.h > 0);
        }
    }

    private static void a(bw bw2, Throwable throwable) {
        if (!(bw2 instanceof dq) && !bw2.b(throwable)) {
            b.d("Failed to mark a promise as failure because it's done already: {}", (Object)bw2, (Object)throwable);
        }
    }
}

