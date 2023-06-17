/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.az;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;
import io.netty.util.c.a.l;

final class ak
extends g {
    final az h;
    final l i;
    final double j;
    double k;
    ak l;
    ak m;

    ak(g g2, int n2, int n3, int n4, av[] arrav, ak ak2, az az2, double d2, l l2) {
        super(g2, n2, n3, n4, arrav);
        this.m = ak2;
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
                this.l = new ak(this, this.g >>>= 1, this.e, n2, this.a, this.l, az2, d2, l2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                d2 = l2.a(d2, az2.a(((av)object).c));
            }
            this.k = d2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                ak ak2 = (ak)object;
                ak ak3 = ak2.l;
                while (ak3 != null) {
                    ak2.k = l2.a(ak2.k, ak3.k);
                    ak3 = ak2.l = ak3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

