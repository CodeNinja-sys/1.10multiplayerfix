/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.br;
import io.netty.util.c.a.f;
import io.netty.util.c.a.g;

final class bd
extends g {
    final f h;
    Object i;
    bd j;
    bd k;

    bd(g g2, int n2, int n3, int n4, av[] arrav, bd bd2, f f2) {
        super(g2, n2, n3, n4, arrav);
        this.k = bd2;
        this.h = f2;
    }

    @Override
    public final Object c() {
        return this.i;
    }

    @Override
    public final void b() {
        f f2 = this.h;
        if (f2 != null) {
            Object object;
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.j = new bd(this, this.g >>>= 1, this.e, n2, this.a, this.j, f2);
                this.j.r();
            }
            Object object2 = null;
            while ((object = this.a()) != null) {
                Object object3 = ((av)object).c;
                object2 = object2 == null ? object3 : (object3 == null ? object2 : f2.a(object2, object3));
            }
            this.i = object2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                bd bd2 = (bd)object;
                bd bd3 = bd2.j;
                while (bd3 != null) {
                    Object object4 = bd3.i;
                    if (object4 != null) {
                        Object object5 = bd2.i;
                        bd2.i = object5 == null ? object4 : f2.a(object5, object4);
                    }
                    bd3 = bd2.j = bd3.k;
                }
            }
        }
    }
}

