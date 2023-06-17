/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.az;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;
import io.netty.util.c.a.l;

final class as
extends g {
    final az h;
    final l i;
    final double j;
    double k;
    as l;
    as m;

    as(g g2, int n2, int n3, int n4, av[] arrav, as as2, az az2, double d2, l l2) {
        super(g2, n2, n3, n4, arrav);
        this.m = as2;
        this.h = az2;
        this.j = d2;
        this.i = l2;
    }

    public final Double d() {
        return this.k;
    }

    @Override
    public final void b() {
        l l2;
        az az2 = this.h;
        if (az2 != null && (l2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            double d2 = this.j;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.l = new as(this, this.g >>>= 1, this.e, n2, this.a, this.l, az2, d2, l2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                d2 = l2.a(d2, az2.a(((av)object).d));
            }
            this.k = d2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                as as2 = (as)object;
                as as3 = as2.l;
                while (as3 != null) {
                    as2.k = l2.a(as2.k, as3.k);
                    as3 = as2.l = as3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

