/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.b.au;
import io.netty.util.c.t;
import io.netty.util.p;
import io.netty.util.x;

public final class s {
    private static final p a = new t();
    private final io.netty.util.t b;
    private Object c;
    private au d;

    public static s a(Object object, au au2) {
        s s2 = (s)a.a();
        s2.c = object;
        s2.d = au2;
        return s2;
    }

    private s(io.netty.util.t t2) {
        this.b = t2;
    }

    public boolean a() {
        this.c = null;
        this.d = null;
        return a.a(this, this.b);
    }

    public boolean a(Throwable throwable) {
        x.b(this.c);
        if (this.d != null) {
            this.d.c(throwable);
        }
        return this.a();
    }

    public boolean b() {
        if (this.d != null) {
            this.d.b((Object)null);
        }
        return this.a();
    }

    public Object c() {
        return this.c;
    }

    public au d() {
        return this.d;
    }

    public au e() {
        au au2 = this.d;
        this.a();
        return au2;
    }

    /* synthetic */ s(io.netty.util.t t2, t t3) {
        this(t2);
    }
}

