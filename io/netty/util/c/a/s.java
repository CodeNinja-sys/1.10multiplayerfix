/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.c;
import io.netty.util.c.a.g;
import io.netty.util.c.a.y;

final class s
extends g {
    final y h;
    final c i;

    s(g g2, int n2, int n3, int n4, av[] arrav, y y2, c c2) {
        super(g2, n2, n3, n4, arrav);
        this.h = y2;
        this.i = c2;
    }

    @Override
    public final void b() {
        c c2;
        y y2 = this.h;
        if (y2 != null && (c2 = this.i) != null) {
            av av2;
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                this.b(1);
                this.e = n3;
                new s(this, this.g >>>= 1, this.e, n2, this.a, y2, c2).r();
            }
            while ((av2 = this.a()) != null) {
                Object object = y2.a(av2);
                if (object == null) continue;
                c2.a(object);
            }
            this.j();
        }
    }
}

