/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.e;
import io.netty.util.c.a.g;

final class r
extends g {
    final e h;

    r(g g2, int n2, int n3, int n4, av[] arrav, e e2) {
        super(g2, n2, n3, n4, arrav);
        this.h = e2;
    }

    @Override
    public final void b() {
        e e2 = this.h;
        if (e2 != null) {
            av av2;
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                new r(this, this.g >>>= 1, this.e, n2, this.a, e2).r();
            }
            while ((av2 = this.a()) != null) {
                e2.a(av2.c, av2.d);
            }
            this.j();
        }
    }
}

