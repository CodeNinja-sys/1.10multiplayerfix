/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.ad;
import io.netty.util.c.a.av;
import io.netty.util.c.a.ay;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;

final class aq
extends g {
    final ay h;
    final ad i;
    final long j;
    long k;
    aq l;
    aq m;

    aq(g g2, int n2, int n3, int n4, av[] arrav, aq aq2, ay ay2, long l2, ad ad2) {
        super(g2, n2, n3, n4, arrav);
        this.m = aq2;
        this.h = ay2;
        this.j = l2;
        this.i = ad2;
    }

    public final Long d() {
        return this.k;
    }

    @Override
    public final void b() {
        ad ad2;
        ay ay2 = this.h;
        if (ay2 != null && (ad2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            long l2 = this.j;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.l = new aq(this, this.g >>>= 1, this.e, n2, this.a, this.l, ay2, l2, ad2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                l2 = ad2.a(l2, ay2.a(((av)object).c, ((av)object).d));
            }
            this.k = l2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                aq aq2 = (aq)object;
                aq aq3 = aq2.l;
                while (aq3 != null) {
                    aq2.k = ad2.a(aq2.k, aq3.k);
                    aq3 = aq2.l = aq3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

