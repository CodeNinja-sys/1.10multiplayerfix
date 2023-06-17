/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.b;
import io.netty.c.e.d;
import io.netty.c.e.e;
import io.netty.c.e.f;
import io.netty.c.e.g;
import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.b.w;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c
extends aq {
    private static final long f = TimeUnit.MILLISECONDS.toNanos(1L);
    private final long h;
    private final long i;
    private final long j;
    volatile ScheduledFuture a;
    volatile long b;
    private boolean k = true;
    volatile ScheduledFuture c;
    volatile long d;
    private boolean l = true;
    volatile ScheduledFuture e;
    private boolean m = true;
    private volatile int n;

    public c(int n2, int n3, int n4) {
        this(n2, n3, n4, TimeUnit.SECONDS);
    }

    public c(long l2, long l3, long l4, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.h = l2 <= 0L ? 0L : Math.max(timeUnit.toNanos(l2), f);
        this.i = l3 <= 0L ? 0L : Math.max(timeUnit.toNanos(l3), f);
        this.j = l4 <= 0L ? 0L : Math.max(timeUnit.toNanos(l4), f);
    }

    public long a() {
        return TimeUnit.NANOSECONDS.toMillis(this.h);
    }

    public long b() {
        return TimeUnit.NANOSECONDS.toMillis(this.i);
    }

    public long c() {
        return TimeUnit.NANOSECONDS.toMillis(this.j);
    }

    @Override
    public void e(bd bd2) {
        if (bd2.b().I() && bd2.b().j()) {
            this.k(bd2);
        }
    }

    @Override
    public void f(bd bd2) {
        this.d();
    }

    @Override
    public void g(bd bd2) {
        if (bd2.b().I()) {
            this.k(bd2);
        }
        super.g(bd2);
    }

    @Override
    public void a(bd bd2) {
        this.k(bd2);
        super.a(bd2);
    }

    @Override
    public void b(bd bd2) {
        this.d();
        super.b(bd2);
    }

    @Override
    public void a_(bd bd2, Object object) {
        this.b = System.nanoTime();
        this.m = true;
        this.k = true;
        bd2.b(object);
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        bw2.g((ad)new d(this));
        bd2.a(object, bw2);
    }

    private void k(bd bd2) {
        switch (this.n) {
            case 1: 
            case 2: {
                return;
            }
        }
        this.n = 1;
        w w2 = bd2.e();
        this.b = this.d = System.nanoTime();
        if (this.h > 0L) {
            this.a = w2.a(new f(this, bd2), this.h, TimeUnit.NANOSECONDS);
        }
        if (this.i > 0L) {
            this.c = w2.a(new g(this, bd2), this.i, TimeUnit.NANOSECONDS);
        }
        if (this.j > 0L) {
            this.e = w2.a(new e(this, bd2), this.j, TimeUnit.NANOSECONDS);
        }
    }

    private void d() {
        this.n = 2;
        if (this.a != null) {
            this.a.cancel(false);
            this.a = null;
        }
        if (this.c != null) {
            this.c.cancel(false);
            this.c = null;
        }
        if (this.e != null) {
            this.e.cancel(false);
            this.e = null;
        }
    }

    protected void a(bd bd2, b b2) {
        bd2.a(b2);
    }

    static /* synthetic */ boolean a(c c2, boolean bl2) {
        c2.l = bl2;
        return c2.l;
    }

    static /* synthetic */ boolean b(c c2, boolean bl2) {
        c2.m = bl2;
        return c2.m;
    }

    static /* synthetic */ long a(c c2) {
        return c2.h;
    }

    static /* synthetic */ boolean b(c c2) {
        return c2.k;
    }

    static /* synthetic */ boolean c(c c2, boolean bl2) {
        c2.k = bl2;
        return c2.k;
    }

    static /* synthetic */ long c(c c2) {
        return c2.i;
    }

    static /* synthetic */ boolean d(c c2) {
        return c2.l;
    }

    static /* synthetic */ long e(c c2) {
        return c2.j;
    }

    static /* synthetic */ boolean f(c c2) {
        return c2.m;
    }
}

