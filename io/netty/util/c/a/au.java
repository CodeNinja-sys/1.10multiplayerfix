/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.ad;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bb;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;

final class au
extends g {
    final bb h;
    final ad i;
    final long j;
    long k;
    au l;
    au m;

    au(g g2, int n2, int n3, int n4, av[] arrav, au au2, bb bb2, long l2, ad ad2) {
        super(g2, n2, n3, n4, arrav);
        this.m = au2;
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
                this.l = new au(this, this.g >>>= 1, this.e, n2, this.a, this.l, bb2, l2, ad2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                l2 = ad2.a(l2, bb2.a(((av)object).d));
            }
            this.k = l2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                au au2 = (au)object;
                au au3 = au2.l;
                while (au3 != null) {
                    au2.k = ad2.a(au2.k, au3.k);
                    au3 = au2.l = au3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

