/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.br;
import io.netty.util.c.a.f;
import io.netty.util.c.a.g;

final class an
extends g {
    final f h;
    final f i;
    Object j;
    an k;
    an l;

    an(g g2, int n2, int n3, int n4, av[] arrav, an an2, f f2, f f3) {
        super(g2, n2, n3, n4, arrav);
        this.l = an2;
        this.h = f2;
        this.i = f3;
    }

    @Override
    public final Object c() {
        return this.j;
    }

    @Override
    public final void b() {
        f f2;
        f f3 = this.h;
        if (f3 != null && (f2 = this.i) != null) {
            Object object;
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                this.k = new an(this, this.g >>>= 1, this.e, n2, this.a, this.k, f3, f2);
                this.k.r();
            }
            Object object2 = null;
            while ((object = this.a()) != null) {
                Object object3 = f3.a(((av)object).c, ((av)object).d);
                if (object3 == null) continue;
                object2 = object2 == null ? object3 : f2.a(object2, object3);
            }
            this.j = object2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                an an2 = (an)object;
                an an3 = an2.k;
                while (an3 != null) {
                    Object object4 = an3.j;
                    if (object4 != null) {
                        Object object5 = an2.j;
                        an2.j = object5 == null ? object4 : f2.a(object5, object4);
                    }
                    an3 = an2.k = an3.l;
                }
            }
        }
    }
}

