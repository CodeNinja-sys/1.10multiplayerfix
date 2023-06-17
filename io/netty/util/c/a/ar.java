/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.br;
import io.netty.util.c.a.f;
import io.netty.util.c.a.g;
import io.netty.util.c.a.y;

final class ar
extends g {
    final y h;
    final f i;
    Object j;
    ar k;
    ar l;

    ar(g g2, int n2, int n3, int n4, av[] arrav, ar ar2, y y2, f f2) {
        super(g2, n2, n3, n4, arrav);
        this.l = ar2;
        this.h = y2;
        this.i = f2;
    }

    @Override
    public final Object c() {
        return this.j;
    }

    @Override
    public final void b() {
        f f2;
        y y2 = this.h;
        if (y2 != null && (f2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.k = new ar(this, this.g >>>= 1, this.e, n2, this.a, this.k, y2, f2);
                this.k.r();
            }
            Object object2 = null;
            while ((object = this.a()) != null) {
                Object object3 = y2.a(((av)object).d);
                if (object3 == null) continue;
                object2 = object2 == null ? object3 : f2.a(object2, object3);
            }
            this.j = object2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                ar ar2 = (ar)object;
                ar ar3 = ar2.k;
                while (ar3 != null) {
                    Object object4 = ar3.j;
                    if (object4 != null) {
                        Object object5 = ar2.j;
                        ar2.j = object5 == null ? object4 : f2.a(object5, object4);
                    }
                    ar3 = ar2.k = ar3.l;
                }
            }
        }
    }
}

