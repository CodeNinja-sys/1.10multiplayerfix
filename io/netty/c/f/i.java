/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.a;
import io.netty.c.f.j;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class i {
    private static final g d = io.netty.util.c.b.h.a(i.class);
    private final AtomicLong e = new AtomicLong();
    private final AtomicLong f = new AtomicLong();
    private final AtomicLong g = new AtomicLong();
    private final AtomicLong h = new AtomicLong();
    private long i;
    private long j;
    private long k;
    private final AtomicLong l = new AtomicLong();
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    final AtomicLong a = new AtomicLong(1000L);
    final String b;
    private final a s;
    private final ScheduledExecutorService t;
    private Runnable u;
    private volatile ScheduledFuture v;
    final AtomicBoolean c = new AtomicBoolean();

    public synchronized void a() {
        if (this.c.get()) {
            return;
        }
        this.l.set(System.currentTimeMillis());
        if (this.a.get() > 0L) {
            this.c.set(true);
            this.u = new j(this.s, this);
            this.v = this.t.schedule(this.u, this.a.get(), TimeUnit.MILLISECONDS);
        }
    }

    public synchronized void b() {
        if (!this.c.get()) {
            return;
        }
        this.c.set(false);
        this.a(System.currentTimeMillis());
        if (this.s != null) {
            this.s.b(this);
        }
        if (this.v != null) {
            this.v.cancel(true);
        }
    }

    synchronized void a(long l2) {
        long l3 = l2 - this.l.getAndSet(l2);
        if (l3 == 0L) {
            return;
        }
        if (d.d() && l3 > 2L * this.c()) {
            d.b("Acct schedule not ok: " + l3 + " > 2*" + this.c() + " from " + this.b);
        }
        this.n = this.f.getAndSet(0L);
        this.m = this.e.getAndSet(0L);
        this.k = this.n / l3 * 1000L;
        this.j = this.m / l3 * 1000L;
        if (this.m > 0L) {
            this.o = this.m;
            this.p = l2;
        }
        if (this.n > 0L) {
            this.r = this.n;
            this.q = l2;
        }
    }

    public i(a a2, ScheduledExecutorService scheduledExecutorService, String string, long l2) {
        this.s = a2;
        this.t = scheduledExecutorService;
        this.b = string;
        this.i = System.currentTimeMillis();
        this.b(l2);
    }

    public void b(long l2) {
        long l3 = l2 / 10L * 10L;
        if (this.a.get() != l3) {
            this.a.set(l3);
            if (l3 <= 0L) {
                this.b();
                this.l.set(System.currentTimeMillis());
            } else {
                this.a();
            }
        }
    }

    void c(long l2) {
        this.f.addAndGet(l2);
        this.h.addAndGet(l2);
    }

    void d(long l2) {
        this.e.addAndGet(l2);
        this.g.addAndGet(l2);
    }

    public long c() {
        return this.a.get();
    }

    public long d() {
        return this.k;
    }

    public long e() {
        return this.j;
    }

    public long f() {
        return this.n;
    }

    public long g() {
        return this.m;
    }

    public long h() {
        return this.f.get();
    }

    public long i() {
        return this.e.get();
    }

    public long j() {
        return this.l.get();
    }

    public long k() {
        return this.g.get();
    }

    public long l() {
        return this.h.get();
    }

    public long m() {
        return this.i;
    }

    public void n() {
        this.i = System.currentTimeMillis();
        this.h.set(0L);
        this.g.set(0L);
    }

    public String o() {
        return this.b;
    }

    public synchronized long a(long l2, long l3, long l4) {
        long l5 = System.currentTimeMillis();
        this.c(l2);
        if (l3 == 0L) {
            return 0L;
        }
        long l6 = this.f.get();
        long l7 = l5 - this.l.get();
        if (l7 > 10L && l6 > 0L) {
            long l8 = (l6 * 1000L / l3 - l7) / 10L * 10L;
            if (l8 > 10L) {
                if (d.d()) {
                    d.b("Time: " + l8 + ":" + l6 + ":" + l7);
                }
                return l8 > l4 ? l4 : l8;
            }
            return 0L;
        }
        if (this.r > 0L && this.q + 10L < l5) {
            long l9 = l6 + this.r;
            long l10 = l5 - this.q;
            long l11 = (l9 * 1000L / l3 - l10) / 10L * 10L;
            if (l11 > 10L) {
                if (d.d()) {
                    d.b("Time: " + l11 + ":" + l9 + ":" + l10);
                }
                return l11 > l4 ? l4 : l11;
            }
        } else {
            long l12 = 10L;
            long l13 = ((l6 += this.n) * 1000L / l3 - l12) / 10L * 10L;
            if (l13 > 10L) {
                if (d.d()) {
                    d.b("Time: " + l13 + ":" + l6 + ":" + l12);
                }
                return l13 > l4 ? l4 : l13;
            }
        }
        return 0L;
    }

    public synchronized long b(long l2, long l3, long l4) {
        this.d(l2);
        if (l3 == 0L) {
            return 0L;
        }
        long l5 = this.e.get();
        long l6 = System.currentTimeMillis();
        long l7 = l6 - this.l.get();
        if (l7 > 10L && l5 > 0L) {
            long l8 = (l5 * 1000L / l3 - l7) / 10L * 10L;
            if (l8 > 10L) {
                if (d.d()) {
                    d.b("Time: " + l8 + ":" + l5 + ":" + l7);
                }
                return l8 > l4 ? l4 : l8;
            }
            return 0L;
        }
        if (this.o > 0L && this.p + 10L < l6) {
            long l9 = l5 + this.o;
            long l10 = l6 - this.p;
            long l11 = (l9 * 1000L / l3 - l10) / 10L * 10L;
            if (l11 > 10L) {
                if (d.d()) {
                    d.b("Time: " + l11 + ":" + l9 + ":" + l10);
                }
                return l11 > l4 ? l4 : l11;
            }
        } else {
            long l12 = 10L + Math.abs(l7);
            long l13 = ((l5 += this.m) * 1000L / l3 - l12) / 10L * 10L;
            if (l13 > 10L) {
                if (d.d()) {
                    d.b("Time: " + l13 + ":" + l5 + ":" + l12);
                }
                return l13 > l4 ? l4 : l13;
            }
        }
        return 0L;
    }

    public String toString() {
        return "Monitor " + this.b + " Current Speed Read: " + (this.k >> 10) + " KB/s, Write: " + (this.j >> 10) + " KB/s Current Read: " + (this.f.get() >> 10) + " KB Current Write: " + (this.e.get() >> 10) + " KB";
    }

    static /* synthetic */ ScheduledFuture a(i i2, ScheduledFuture scheduledFuture) {
        i2.v = scheduledFuture;
        return i2.v;
    }

    static /* synthetic */ ScheduledExecutorService a(i i2) {
        return i2.t;
    }
}

