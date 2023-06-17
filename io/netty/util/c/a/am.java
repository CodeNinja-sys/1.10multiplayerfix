/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.ad;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bb;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;

final class am
extends g {
    final bb h;
    final ad i;
    final long j;
    long k;
    am l;
    am m;

    am(g g2, int n2, int n3, int n4, av[] arrav, am am2, bb bb2, long l2, ad ad2) {
        super(g2, n2, n3, n4, arrav);
        this.m = am2;
        this.h = bb2;
        this.j = l2;
        this.i = ad2;
    }

    public final Long d() {
        return this.k;
    }

    @Override
    public final void b() {
        ad ad2;
        bb bb2 = this.h;
        if (bb2 != null && (ad2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            long l2 = this.j;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.l = new am(this, this.g >>>= 1, this.e, n2, this.a, this.l, bb2, l2, ad2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                l2 = ad2.a(l2, bb2.a(((av)object).c));
            }
            this.k = l2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                am am2 = (am)object;
                am am3 = am2.l;
                while (am3 != null) {
                    am2.k = ad2.a(am2.k, am3.k);
                    am3 = am2.l = am3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

