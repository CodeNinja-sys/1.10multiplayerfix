/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.br;
import io.netty.util.c.a.f;
import io.netty.util.c.a.g;

final class be
extends g {
    final f h;
    Object i;
    be j;
    be k;

    be(g g2, int n2, int n3, int n4, av[] arrav, be be2, f f2) {
        super(g2, n2, n3, n4, arrav);
        this.k = be2;
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
                this.j = new be(this, this.g >>>= 1, this.e, n2, this.a, this.j, f2);
                this.j.r();
            }
            Object object2 = null;
            while ((object = this.a()) != null) {
                Object object3 = ((av)object).d;
                object2 = object2 == null ? object3 : f2.a(object2, object3);
            }
            this.i = object2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                be be2 = (be)object;
                be be3 = be2.j;
                while (be3 != null) {
                    Object object4 = be3.i;
                    if (object4 != null) {
                        Object object5 = be2.i;
                        be2.i = object5 == null ? object4 : f2.a(object5, object4);
                    }
                    be3 = be2.j = be3.k;
                }
            }
        }
    }
}

