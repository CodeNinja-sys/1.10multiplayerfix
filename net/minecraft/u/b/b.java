/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.u.ad;
import net.minecraft.u.b.c;
import net.minecraft.u.b.e;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.u.b.t;
import org.apache.logging.log4j.d;

public class b
extends t {
    private static final d a = org.apache.logging.log4j.c.c();
    public static final b c = new b(0, 0, 0);
    private static final int b;
    private static final int d;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final long i;
    private static final long j;
    private static final long k;

    static {
        d = b = 1 + n.e(n.c(30000000));
        f = 64 - b - d;
        g = 0 + d;
        h = g + f;
        i = (1L << b) - 1L;
        j = (1L << f) - 1L;
        k = (1L << d) - 1L;
    }

    public b(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public b(double d2, double d3, double d4) {
        super(d2, d3, d4);
    }

    public b(net.minecraft.w.n n2) {
        this(n2.aU, n2.aV, n2.aW);
    }

    public b(s s2) {
        this(s2.b, s2.c, s2.d);
    }

    public b(t t2) {
        this(t2.cy_(), t2.k(), t2.l());
    }

    public b a(double d2, double d3, double d4) {
        return d2 == 0.0 && d3 == 0.0 && d4 == 0.0 ? this : new b((double)this.cy_() + d2, (double)this.k() + d3, (double)this.l() + d4);
    }

    public b a(int n2, int n3, int n4) {
        return n2 == 0 && n3 == 0 && n4 == 0 ? this : new b(this.cy_() + n2, this.k() + n3, this.l() + n4);
    }

    public b a(t t2) {
        return t2.cy_() == 0 && t2.k() == 0 && t2.l() == 0 ? this : new b(this.cy_() + t2.cy_(), this.k() + t2.k(), this.l() + t2.l());
    }

    public b b(t t2) {
        return t2.cy_() == 0 && t2.k() == 0 && t2.l() == 0 ? this : new b(this.cy_() - t2.cy_(), this.k() - t2.k(), this.l() - t2.l());
    }

    public b b() {
        return this.a(1);
    }

    public b a(int n2) {
        return this.a(ad.b, n2);
    }

    public b c() {
        return this.b(1);
    }

    public b b(int n2) {
        return this.a(ad.a, n2);
    }

    public b d() {
        return this.c(1);
    }

    public b c(int n2) {
        return this.a(ad.c, n2);
    }

    public b e() {
        return this.d(1);
    }

    public b d(int n2) {
        return this.a(ad.d, n2);
    }

    public b f() {
        return this.e(1);
    }

    public b e(int n2) {
        return this.a(ad.e, n2);
    }

    public b g() {
        return this.f(1);
    }

    public b f(int n2) {
        return this.a(ad.f, n2);
    }

    public b a(ad ad2) {
        return this.a(ad2, 1);
    }

    public b a(ad ad2, int n2) {
        return n2 == 0 ? this : new b(this.cy_() + ad2.h() * n2, this.k() + ad2.i() * n2, this.l() + ad2.j() * n2);
    }

    public b c(t t2) {
        return new b(this.k() * t2.l() - this.l() * t2.k(), this.l() * t2.cy_() - this.cy_() * t2.l(), this.cy_() * t2.k() - this.k() * t2.cy_());
    }

    public long h() {
        return ((long)this.cy_() & i) << h | ((long)this.k() & j) << g | ((long)this.l() & k) << 0;
    }

    public static b a(long l2) {
        int n2 = (int)(l2 << 64 - h - b >> 64 - b);
        int n3 = (int)(l2 << 64 - g - f >> 64 - f);
        int n4 = (int)(l2 << 64 - d >> 64 - d);
        return new b(n2, n3, n4);
    }

    public static Iterable a(b b2, b b3) {
        b b4 = new b(Math.min(b2.cy_(), b3.cy_()), Math.min(b2.k(), b3.k()), Math.min(b2.l(), b3.l()));
        b b5 = new b(Math.max(b2.cy_(), b3.cy_()), Math.max(b2.k(), b3.k()), Math.max(b2.l(), b3.l()));
        return new c(b4, b5);
    }

    public b i() {
        return this;
    }

    public static Iterable b(b b2, b b3) {
        b b4 = new b(Math.min(b2.cy_(), b3.cy_()), Math.min(b2.k(), b3.k()), Math.min(b2.l(), b3.l()));
        b b5 = new b(Math.max(b2.cy_(), b3.cy_()), Math.max(b2.k(), b3.k()), Math.max(b2.l(), b3.l()));
        return new e(b4, b5);
    }

    @Override
    public /* synthetic */ t d(t t2) {
        return this.c(t2);
    }

    static /* synthetic */ d j() {
        return a;
    }
}

