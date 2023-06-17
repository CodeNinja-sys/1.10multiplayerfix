/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.ax;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;
import io.netty.util.c.a.z;

final class ap
extends g {
    final ax h;
    final z i;
    final int j;
    int k;
    ap l;
    ap m;

    ap(g g2, int n2, int n3, int n4, av[] arrav, ap ap2, ax ax2, int n5, z z2) {
        super(g2, n2, n3, n4, arrav);
        this.m = ap2;
        this.h = ax2;
        this.j = n5;
        this.i = z2;
    }

    public final Integer d() {
        return this.k;
    }

    @Override
    public final void b() {
        z z2;
        ax ax2 = this.h;
        if (ax2 != null && (z2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            int n4 = this.j;
            int n5 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n5 >>> 1) > n5) {
                this.b(1);
                this.e = n3;
                this.l = new ap(this, this.g >>>= 1, this.e, n2, this.a, this.l, ax2, n4, z2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                n4 = z2.a(n4, ax2.a(((av)object).c, ((av)object).d));
            }
            this.k = n4;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                ap ap2 = (ap)object;
                ap ap3 = ap2.l;
                while (ap3 != null) {
                    ap2.k = z2.a(ap2.k, ap3.k);
                    ap3 = ap2.l = ap3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

