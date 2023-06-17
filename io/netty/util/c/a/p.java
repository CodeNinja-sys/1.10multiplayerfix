/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.c;
import io.netty.util.c.a.g;

final class p
extends g {
    final c h;

    p(g g2, int n2, int n3, int n4, av[] arrav, c c2) {
        super(g2, n2, n3, n4, arrav);
        this.h = c2;
    }

    @Override
    public final void b() {
        c c2 = this.h;
        if (c2 != null) {
            av av2;
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                new p(this, this.g >>>= 1, this.e, n2, this.a, c2).r();
            }
            while ((av2 = this.a()) != null) {
                c2.a(av2);
            }
            this.j();
        }
    }
}

