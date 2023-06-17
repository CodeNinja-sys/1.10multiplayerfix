/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.eh;
import com.a.a.n.a.ei;
import com.a.a.n.a.ej;
import com.a.a.n.a.el;
import java.util.concurrent.TimeUnit;

public abstract class eg {
    private final ej d;
    private final long e;
    double a;
    double b;
    volatile double c;
    private final Object f = new Object();
    private long g = 0L;

    public static eg a(double d2) {
        return eg.a(ej.a, d2);
    }

    static eg a(ej ej2, double d2) {
        ei ei2 = new ei(ej2, 1.0);
        ei2.b(d2);
        return ei2;
    }

    public static eg a(double d2, long l2, TimeUnit timeUnit) {
        return eg.a(ej.a, d2, l2, timeUnit);
    }

    static eg a(ej ej2, double d2, long l2, TimeUnit timeUnit) {
        el el2 = new el(ej2, l2, timeUnit);
        el2.b(d2);
        return el2;
    }

    static eg b(ej ej2, double d2, long l2, TimeUnit timeUnit) {
        double d3 = (double)timeUnit.toNanos(l2) / 1.0E9;
        ei ei2 = new ei(ej2, d3);
        ei2.b(d2);
        return ei2;
    }

    private eg(ej ej2) {
        this.d = ej2;
        this.e = ej2.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(double d2) {
        cl.a(d2 > 0.0 && !Double.isNaN(d2), (Object)"rate must be positive");
        Object object = this.f;
        synchronized (object) {
            double d3;
            this.a(this.e());
            this.c = d3 = (double)TimeUnit.SECONDS.toMicros(1L) / d2;
            this.a(d2, d3);
        }
    }

    abstract void a(double var1, double var3);

    public final double a() {
        return (double)TimeUnit.SECONDS.toMicros(1L) / this.c;
    }

    public double b() {
        return this.a(1);
    }

    public double a(int n2) {
        long l2 = this.b(n2);
        this.d.a(l2);
        return 1.0 * (double)l2 / (double)TimeUnit.SECONDS.toMicros(1L);
    }

    long c() {
        return this.b(1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    long b(int n2) {
        eg.d(n2);
        Object object = this.f;
        synchronized (object) {
            return this.a((double)n2, this.e());
        }
    }

    public boolean a(long l2, TimeUnit timeUnit) {
        return this.a(1, l2, timeUnit);
    }

    public boolean c(int n2) {
        return this.a(n2, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean d() {
        return this.a(1, 0L, TimeUnit.MICROSECONDS);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(int n2, long l2, TimeUnit timeUnit) {
        long l3;
        long l4 = timeUnit.toMicros(l2);
        eg.d(n2);
        Object object = this.f;
        synchronized (object) {
            long l5 = this.e();
            if (this.g > l5 + l4) {
                return false;
            }
            l3 = this.a((double)n2, l5);
        }
        this.d.a(l3);
        return true;
    }

    private static void d(int n2) {
        cl.a(n2 > 0, (Object)"Requested permits must be positive");
    }

    private long a(double d2, long l2) {
        this.a(l2);
        long l3 = Math.max(0L, this.g - l2);
        double d3 = Math.min(d2, this.a);
        double d4 = d2 - d3;
        long l4 = this.b(this.a, d3) + (long)(d4 * this.c);
        this.g += l4;
        this.a -= d3;
        return l3;
    }

    abstract long b(double var1, double var3);

    private void a(long l2) {
        if (l2 > this.g) {
            this.a = Math.min(this.b, this.a + (double)(l2 - this.g) / this.c);
            this.g = l2;
        }
    }

    private long e() {
        return TimeUnit.NANOSECONDS.toMicros(this.d.a() - this.e);
    }

    public String toString() {
        return String.format("RateLimiter[stableRate=%3.1fqps]", 1000000.0 / this.c);
    }

    /* synthetic */ eg(ej ej2, eh eh2) {
        this(ej2);
    }
}

