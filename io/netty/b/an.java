/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.ak;
import io.netty.b.ao;
import io.netty.b.ap;
import io.netty.b.ar;
import io.netty.b.as;
import io.netty.b.at;
import io.netty.util.ag;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;

final class an {
    private static final g c = io.netty.util.c.b.h.a(an.class);
    final ah a;
    final ah b;
    private final ap[] d;
    private final ap[] e;
    private final ap[] f;
    private final ap[] g;
    private final ap[] h;
    private final ap[] i;
    private final int j;
    private final int k;
    private final int l;
    private int m;
    private final Thread n = Thread.currentThread();
    private final Runnable o = new ao(this);

    an(ah ah2, ah ah3, int n2, int n3, int n4, int n5, int n6) {
        if (n5 < 0) {
            throw new IllegalArgumentException("maxCachedBufferCapacity: " + n5 + " (expected: >= 0)");
        }
        if (n6 < 1) {
            throw new IllegalArgumentException("freeSweepAllocationThreshold: " + n5 + " (expected: > 0)");
        }
        this.l = n6;
        this.a = ah2;
        this.b = ah3;
        if (ah3 != null) {
            this.f = an.a(n2, 32);
            this.g = an.a(n3, ah3.g);
            this.j = an.a(ah3.c);
            this.i = an.a(n4, n5, ah3);
        } else {
            this.f = null;
            this.g = null;
            this.i = null;
            this.j = -1;
        }
        if (ah2 != null) {
            this.d = an.a(n2, 32);
            this.e = an.a(n3, ah2.g);
            this.k = an.a(ah2.c);
            this.h = an.a(n4, n5, ah2);
        } else {
            this.d = null;
            this.e = null;
            this.h = null;
            this.k = -1;
        }
        ag.a(this.n, this.o);
    }

    private static as[] a(int n2, int n3) {
        if (n2 > 0) {
            as[] arras = new as[n3];
            for (int i2 = 0; i2 < arras.length; ++i2) {
                arras[i2] = new as(n2);
            }
            return arras;
        }
        return null;
    }

    private static ar[] a(int n2, int n3, ah ah2) {
        if (n2 > 0) {
            int n4 = Math.min(ah2.e, n3);
            int n5 = Math.max(1, n4 / ah2.c);
            ar[] arrar = new ar[n5];
            for (int i2 = 0; i2 < arrar.length; ++i2) {
                arrar[i2] = new ar(n2);
            }
            return arrar;
        }
        return null;
    }

    private static int a(int n2) {
        int n3 = 0;
        while (n2 > 1) {
            n2 >>= 1;
            ++n3;
        }
        return n3;
    }

    boolean a(ah ah2, at at2, int n2, int n3) {
        return this.a(this.a(ah2, n3), at2, n2);
    }

    boolean b(ah ah2, at at2, int n2, int n3) {
        return this.a(this.b(ah2, n3), at2, n2);
    }

    boolean c(ah ah2, at at2, int n2, int n3) {
        return this.a(this.c(ah2, n3), at2, n2);
    }

    private boolean a(ap ap2, at at2, int n2) {
        if (ap2 == null) {
            return false;
        }
        boolean bl2 = ap2.a(at2, n2);
        if (++this.m >= this.l) {
            this.m = 0;
            this.b();
        }
        return bl2;
    }

    boolean a(ah ah2, ak ak2, long l2, int n2) {
        ap ap2 = ah2.c(n2) ? (ah.d(n2) ? this.a(ah2, n2) : this.b(ah2, n2)) : this.c(ah2, n2);
        if (ap2 == null) {
            return false;
        }
        return ap2.a(ak2, l2);
    }

    void a() {
        ag.b(this.n, this.o);
        this.c();
    }

    private void c() {
        int n2 = an.a(this.f) + an.a(this.g) + an.a(this.i) + an.a(this.d) + an.a(this.e) + an.a(this.h);
        if (n2 > 0 && c.d()) {
            c.b("Freed {} thread-local buffer(s) from thread: {}", (Object)n2, (Object)this.n.getName());
        }
    }

    private static int a(ap[] arrap) {
        if (arrap == null) {
            return 0;
        }
        int n2 = 0;
        for (ap ap2 : arrap) {
            n2 += an.a(ap2);
        }
        return n2;
    }

    private static int a(ap ap2) {
        if (ap2 == null) {
            return 0;
        }
        return ap2.a();
    }

    void b() {
        an.b(this.f);
        an.b(this.g);
        an.b(this.i);
        an.b(this.d);
        an.b(this.e);
        an.b(this.h);
    }

    private static void b(ap[] arrap) {
        if (arrap == null) {
            return;
        }
        for (ap ap2 : arrap) {
            an.b(ap2);
        }
    }

    private static void b(ap ap2) {
        if (ap2 == null) {
            return;
        }
        ap.a(ap2);
    }

    private ap a(ah ah2, int n2) {
        int n3 = ah.a(n2);
        if (ah2.a()) {
            return an.a(this.f, n3);
        }
        return an.a(this.d, n3);
    }

    private ap b(ah ah2, int n2) {
        int n3 = ah.b(n2);
        if (ah2.a()) {
            return an.a(this.g, n3);
        }
        return an.a(this.e, n3);
    }

    private ap c(ah ah2, int n2) {
        if (ah2.a()) {
            int n3 = an.a(n2 >> this.j);
            return an.a(this.i, n3);
        }
        int n4 = an.a(n2 >> this.k);
        return an.a(this.h, n4);
    }

    private static ap a(ap[] arrap, int n2) {
        if (arrap == null || n2 > arrap.length - 1) {
            return null;
        }
        return arrap[n2];
    }

    static /* synthetic */ void a(an an2) {
        an2.c();
    }
}

