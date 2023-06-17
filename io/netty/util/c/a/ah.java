/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.ba;
import io.netty.util.c.a.br;
import io.netty.util.c.a.g;
import io.netty.util.c.a.z;

final class ah
extends g {
    final ba h;
    final z i;
    final int j;
    int k;
    ah l;
    ah m;

    ah(g g2, int n2, int n3, int n4, av[] arrav, ah ah2, ba ba2, int n5, z z2) {
        super(g2, n2, n3, n4, arrav);
        this.m = ah2;
        this.h = ba2;
        this.j = n5;
        this.i = z2;
    }

    public final Integer d() {
        return this.k;
    }

    @Override
    public final void b() {
        z z2;
        ba ba2 = this.h;
        if (ba2 != null && (z2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            int n4 = this.j;
            int n5 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n5 >>> 1) > n5) {
                this.b(1);
                this.e = n3;
                this.l = new ah(this, this.g >>>= 1, this.e, n2, this.a, this.l, ba2, n4, z2);
                this.l.r();
            }
            while ((object = this.a()) != null) {
                n4 = z2.a(n4, ba2.a(object));
            }
            this.k = n4;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                ah ah2 = (ah)object;
                ah ah3 = ah2.l;
                while (ah3 != null) {
                    ah2.k = z2.a(ah2.k, ah3.k);
                    ah3 = ah2.l = ah3.m;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

