/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cc;
import com.a.a.b.cl;

public final class ai {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public ai(long l2, long l3, long l4, long l5, long l6, long l7) {
        cl.a(l2 >= 0L);
        cl.a(l3 >= 0L);
        cl.a(l4 >= 0L);
        cl.a(l5 >= 0L);
        cl.a(l6 >= 0L);
        cl.a(l7 >= 0L);
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = l5;
        this.e = l6;
        this.f = l7;
    }

    public long a() {
        return this.a + this.b;
    }

    public long b() {
        return this.a;
    }

    public double c() {
        long l2 = this.a();
        return l2 == 0L ? 1.0 : (double)this.a / (double)l2;
    }

    public long d() {
        return this.b;
    }

    public double e() {
        long l2 = this.a();
        return l2 == 0L ? 0.0 : (double)this.b / (double)l2;
    }

    public long f() {
        return this.c + this.d;
    }

    public long g() {
        return this.c;
    }

    public long h() {
        return this.d;
    }

    public double i() {
        long l2 = this.c + this.d;
        return l2 == 0L ? 0.0 : (double)this.d / (double)l2;
    }

    public long j() {
        return this.e;
    }

    public double k() {
        long l2 = this.c + this.d;
        return l2 == 0L ? 0.0 : (double)this.e / (double)l2;
    }

    public long l() {
        return this.f;
    }

    public ai a(ai ai2) {
        return new ai(Math.max(0L, this.a - ai2.a), Math.max(0L, this.b - ai2.b), Math.max(0L, this.c - ai2.c), Math.max(0L, this.d - ai2.d), Math.max(0L, this.e - ai2.e), Math.max(0L, this.f - ai2.f));
    }

    public ai b(ai ai2) {
        return new ai(this.a + ai2.a, this.b + ai2.b, this.c + ai2.c, this.d + ai2.d, this.e + ai2.e, this.f + ai2.f);
    }

    public int hashCode() {
        return cc.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public boolean equals(Object object) {
        if (object instanceof ai) {
            ai ai2 = (ai)object;
            return this.a == ai2.a && this.b == ai2.b && this.c == ai2.c && this.d == ai2.d && this.e == ai2.e && this.f == ai2.f;
        }
        return false;
    }

    public String toString() {
        return cc.a((Object)this).a("hitCount", this.a).a("missCount", this.b).a("loadSuccessCount", this.c).a("loadExceptionCount", this.d).a("totalLoadTime", this.e).a("evictionCount", this.f).toString();
    }
}

