/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.h;
import io.netty.c.e.j;
import io.netty.channel.bd;
import io.netty.channel.bf;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class i
extends bf {
    private static final long a = TimeUnit.MILLISECONDS.toNanos(1L);
    private final long b;
    private volatile ScheduledFuture c;
    private volatile long d;
    private volatile int e;
    private boolean f;

    public i(int n2) {
        this(n2, TimeUnit.SECONDS);
    }

    public i(long l2, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.b = l2 <= 0L ? 0L : Math.max(timeUnit.toNanos(l2), a);
    }

    @Override
    public void e(bd bd2) {
        if (bd2.b().I() && bd2.b().j()) {
            this.d(bd2);
        }
    }

    @Override
    public void f(bd bd2) {
        this.a();
    }

    @Override
    public void g(bd bd2) {
        if (bd2.b().I()) {
            this.d(bd2);
        }
        super.g(bd2);
    }

    @Override
    public void a(bd bd2) {
        this.d(bd2);
        super.a(bd2);
    }

    @Override
    public void b(bd bd2) {
        this.a();
        super.b(bd2);
    }

    @Override
    public void a_(bd bd2, Object object) {
        this.d = System.nanoTime();
        bd2.b(object);
    }

    private void d(bd bd2) {
        switch (this.e) {
            case 1: 
            case 2: {
                return;
            }
        }
        this.e = 1;
        this.d = System.nanoTime();
        if (this.b > 0L) {
            this.c = bd2.e().a(new j(this, bd2), this.b, TimeUnit.NANOSECONDS);
        }
    }

    private void a() {
        this.e = 2;
        if (this.c != null) {
            this.c.cancel(false);
            this.c = null;
        }
    }

    protected void c(bd bd2) {
        if (!this.f) {
            bd2.a(h.a);
            bd2.n();
            this.f = true;
        }
    }

    static /* synthetic */ long a(i i2) {
        return i2.b;
    }

    static /* synthetic */ long b(i i2) {
        return i2.d;
    }

    static /* synthetic */ ScheduledFuture a(i i2, ScheduledFuture scheduledFuture) {
        i2.c = scheduledFuture;
        return i2.c;
    }
}

