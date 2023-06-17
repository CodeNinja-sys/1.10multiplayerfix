/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.b;
import io.netty.c.f.i;
import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.c;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.concurrent.TimeUnit;

public abstract class a
extends aq {
    private static final g h = io.netty.util.c.b.h.a(a.class);
    public static final long a = 1000L;
    public static final long b = 15000L;
    static final long c = 10L;
    protected i d;
    private long i;
    private long j;
    protected long e = 15000L;
    protected long f = 1000L;
    private static final c k = io.netty.util.c.a(a.class.getName() + ".READ_SUSPENDED");
    private static final c l = io.netty.util.c.a(a.class.getName() + ".REOPEN_TASK");

    void a(i i2) {
        this.d = i2;
    }

    protected a(long l2, long l3, long l4, long l5) {
        this.i = l2;
        this.j = l3;
        this.f = l4;
        this.e = l5;
    }

    protected a(long l2, long l3, long l4) {
        this(l2, l3, l4, 15000L);
    }

    protected a(long l2, long l3) {
        this(l2, l3, 1000L, 15000L);
    }

    protected a() {
        this(0L, 0L, 1000L, 15000L);
    }

    protected a(long l2) {
        this(0L, 0L, l2, 15000L);
    }

    public void a(long l2, long l3, long l4) {
        this.a(l2, l3);
        this.a(l4);
    }

    public void a(long l2, long l3) {
        this.i = l2;
        this.j = l3;
        if (this.d != null) {
            this.d.a(System.currentTimeMillis() + 1L);
        }
    }

    public void a(long l2) {
        this.f = l2;
        if (this.d != null) {
            this.d.b(this.f);
        }
    }

    public long a() {
        return this.i;
    }

    public void b(long l2) {
        this.i = l2;
        if (this.d != null) {
            this.d.a(System.currentTimeMillis() + 1L);
        }
    }

    public long b() {
        return this.j;
    }

    public void c(long l2) {
        this.j = l2;
        if (this.d != null) {
            this.d.a(System.currentTimeMillis() + 1L);
        }
    }

    public long c() {
        return this.f;
    }

    public void d(long l2) {
        this.f = l2;
        if (this.d != null) {
            this.d.b(l2);
        }
    }

    public void e(long l2) {
        this.e = l2;
    }

    public long d() {
        return this.e;
    }

    protected void b(i i2) {
    }

    @Override
    public void a_(bd bd2, Object object) {
        long l2;
        long l3 = this.a(object);
        if (l3 > 0L && this.d != null && (l2 = this.d.a(l3, this.j, this.e)) >= 10L) {
            if (h.d()) {
                h.b("Channel:" + bd2.b().hashCode() + " Read Suspend: " + l2 + ":" + bd2.b().G().g() + ":" + io.netty.c.f.a.k(bd2));
            }
            if (bd2.b().G().g() && io.netty.c.f.a.k(bd2)) {
                bd2.b().G().a(false);
                bd2.a(k).set(true);
                io.netty.util.b b2 = bd2.a(l);
                Runnable runnable = (Runnable)b2.get();
                if (runnable == null) {
                    runnable = new b(bd2);
                    b2.set(runnable);
                }
                bd2.e().a(runnable, l2, TimeUnit.MILLISECONDS);
                if (h.d()) {
                    h.b("Channel:" + bd2.b().hashCode() + " Suspend final status => " + bd2.b().G().g() + ":" + io.netty.c.f.a.k(bd2) + " will reopened at: " + l2);
                }
            }
        }
        bd2.b(object);
    }

    protected static boolean k(bd bd2) {
        Boolean bl2 = (Boolean)bd2.a(k).get();
        return bl2 == null || Boolean.FALSE.equals(bl2);
    }

    @Override
    public void c(bd bd2) {
        if (io.netty.c.f.a.k(bd2)) {
            bd2.p();
        }
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        long l2;
        long l3 = this.a(object);
        if (l3 > 0L && this.d != null && (l2 = this.d.b(l3, this.i, this.e)) >= 10L) {
            if (h.d()) {
                h.b("Channel:" + bd2.b().hashCode() + " Write suspend: " + l2 + ":" + bd2.b().G().g() + ":" + io.netty.c.f.a.k(bd2));
            }
            this.a(bd2, object, l2, bw2);
            return;
        }
        this.a(bd2, object, 0L, bw2);
    }

    protected abstract void a(bd var1, Object var2, long var3, bw var5);

    public i e() {
        return this.d;
    }

    public String toString() {
        return "TrafficShaping with Write Limit: " + this.i + " Read Limit: " + this.j + " and Counter: " + (this.d != null ? this.d.toString() : "none");
    }

    protected long a(Object object) {
        if (object instanceof io.netty.b.g) {
            return ((io.netty.b.g)object).r();
        }
        if (object instanceof io.netty.b.i) {
            return ((io.netty.b.i)object).a().r();
        }
        return -1L;
    }

    static /* synthetic */ g f() {
        return h;
    }

    static /* synthetic */ c g() {
        return k;
    }
}

