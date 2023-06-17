/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.g.k;
import com.a.a.g.l;
import com.a.a.g.m;
import com.a.a.g.n;
import com.a.a.g.q;
import com.a.a.g.u;
import java.io.Serializable;

public final class j
implements cm,
Serializable {
    private final q b;
    private final int c;
    private final u d;
    private final m e;
    private static final m f = j.d();
    static final String a = "com.google.common.hash.BloomFilter.useMitz32";

    private j(q q2, int n2, u u2, m m2) {
        cl.a(n2 > 0, "numHashFunctions (%s) must be > 0", new Object[]{n2});
        cl.a(n2 <= 255, "numHashFunctions (%s) must be <= 255", new Object[]{n2});
        this.b = (q)cl.a(q2);
        this.c = n2;
        this.d = (u)cl.a(u2);
        this.e = (m)cl.a(m2);
    }

    public j a() {
        return new j(this.b.c(), this.c, this.d, this.e);
    }

    public boolean b(Object object) {
        return this.e.b(object, this.d, this.c, this.b);
    }

    @Override
    public boolean a(Object object) {
        return this.b(object);
    }

    public boolean c(Object object) {
        return this.e.a(object, this.d, this.c, this.b);
    }

    public double b() {
        return Math.pow((double)this.b.b() / (double)this.c(), this.c);
    }

    long c() {
        return this.b.a();
    }

    public boolean a(j j2) {
        cl.a(j2);
        return this != j2 && this.c == j2.c && this.c() == j2.c() && this.e.equals(j2.e) && this.d.equals(j2.d);
    }

    public void b(j j2) {
        cl.a(j2);
        cl.a(this != j2, (Object)"Cannot combine a BloomFilter with itself.");
        cl.a(this.c == j2.c, "BloomFilters must have the same number of hash functions (%s != %s)", new Object[]{this.c, j2.c});
        cl.a(this.c() == j2.c(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", new Object[]{this.c(), j2.c()});
        cl.a(this.e.equals(j2.e), "BloomFilters must have equal strategies (%s != %s)", new Object[]{this.e, j2.e});
        cl.a(this.d.equals(j2.d), "BloomFilters must have equal funnels (%s != %s)", new Object[]{this.d, j2.d});
        this.b.a(j2.b);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j) {
            j j2 = (j)object;
            return this.c == j2.c && this.d.equals(j2.d) && this.b.equals(j2.b) && this.e.equals(j2.e);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(this.c, this.d, this.e, this.b);
    }

    static m d() {
        return Boolean.parseBoolean(System.getProperty(a)) ? n.a : n.b;
    }

    public static j a(u u2, int n2, double d2) {
        return j.a(u2, n2, d2, f);
    }

    static j a(u u2, int n2, double d2, m m2) {
        cl.a(u2);
        cl.a(n2 >= 0, "Expected insertions (%s) must be >= 0", new Object[]{n2});
        cl.a(d2 > 0.0, "False positive probability (%s) must be > 0.0", new Object[]{d2});
        cl.a(d2 < 1.0, "False positive probability (%s) must be < 1.0", new Object[]{d2});
        cl.a(m2);
        if (n2 == 0) {
            n2 = 1;
        }
        long l2 = j.a((long)n2, d2);
        int n3 = j.a((long)n2, l2);
        try {
            return new j(new q(l2), n3, u2, m2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + l2 + " bits", illegalArgumentException);
        }
    }

    public static j a(u u2, int n2) {
        return j.a(u2, n2, 0.03);
    }

    static int a(long l2, long l3) {
        return Math.max(1, (int)Math.round((double)(l3 / l2) * Math.log(2.0)));
    }

    static long a(long l2, double d2) {
        if (d2 == 0.0) {
            d2 = Double.MIN_VALUE;
        }
        return (long)((double)(-l2) * Math.log(d2) / (Math.log(2.0) * Math.log(2.0)));
    }

    private Object e() {
        return new l(this);
    }

    static /* synthetic */ q c(j j2) {
        return j2.b;
    }

    static /* synthetic */ int d(j j2) {
        return j2.c;
    }

    static /* synthetic */ u e(j j2) {
        return j2.d;
    }

    static /* synthetic */ m f(j j2) {
        return j2.e;
    }

    /* synthetic */ j(q q2, int n2, u u2, m m2, k k2) {
        this(q2, n2, u2, m2);
    }
}

