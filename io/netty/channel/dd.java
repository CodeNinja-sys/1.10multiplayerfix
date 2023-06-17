/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bw;
import io.netty.channel.dc;
import io.netty.channel.de;
import io.netty.util.p;
import io.netty.util.t;

final class dd {
    private static final p a = new de();
    private final t b;
    private dd c;
    private long d;
    private bw e;
    private Object f;

    private dd(t t2) {
        this.b = t2;
    }

    static dd a(Object object, int n2, bw bw2) {
        dd dd2 = (dd)a.a();
        dd2.d = n2;
        dd2.f = object;
        dd2.e = bw2;
        return dd2;
    }

    private void a() {
        this.d = 0L;
        this.c = null;
        this.f = null;
        this.e = null;
        a.a(this, this.b);
    }

    static /* synthetic */ dd a(dd dd2, dd dd3) {
        dd2.c = dd3;
        return dd2.c;
    }

    static /* synthetic */ long a(dd dd2) {
        return dd2.d;
    }

    static /* synthetic */ dd b(dd dd2) {
        return dd2.c;
    }

    static /* synthetic */ Object c(dd dd2) {
        return dd2.f;
    }

    static /* synthetic */ bw d(dd dd2) {
        return dd2.e;
    }

    static /* synthetic */ void e(dd dd2) {
        dd2.a();
    }

    /* synthetic */ dd(t t2, dc dc2) {
        this(t2);
    }
}

