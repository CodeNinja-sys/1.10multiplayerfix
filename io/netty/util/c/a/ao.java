/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.aw;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;
import io.netty.util.c.a.l;

final class ao
extends g {
    final aw h;
    final l i;
    final double j;
    double k;
    ao l;
    ao m;

    ao(g g2, int n2, int n3, int n4, av[] arrav, ao ao2, aw aw2, double d2, l l2) {
        super(g2, n2, n3, n4, arrav);
        this.m = ao2;
        this.h = aw2;
        this.j = d2;
        this.i = l2;
    }

    public final Double d() {
        return this.k;
    }

    @Override
    public final void b() {
        l l2;
        aw aw2 = this.h;
        if (aw2 != null && (l2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            double d2 = this.j;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.l = new ao(this, this.g >>>= 1, this.e, n2, this.a, this.l, aw2, d2, l2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                d2 = l2.a(d2, aw2.a(((av)object).c, ((av)object).d));
            }
            this.k = d2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                ao ao2 = (ao)object;
                ao ao3 = ao2.l;
                while (ao3 != null) {
                    ao2.k = l2.a(ao2.k, ao3.k);
                    ao3 = ao2.l = ao3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

