/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.br;
import io.netty.util.c.a.f;
import io.netty.util.c.a.g;
import java.util.Map;

final class bc
extends g {
    final f h;
    Map.Entry i;
    bc j;
    bc k;

    bc(g g2, int n2, int n3, int n4, av[] arrav, bc bc2, f f2) {
        super(g2, n2, n3, n4, arrav);
        this.k = bc2;
        this.h = f2;
    }

    public final Map.Entry d() {
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
                this.j = new bc(this, this.g >>>= 1, this.e, n2, this.a, this.j, f2);
                this.j.r();
            }
            av av2 = null;
            while ((object = this.a()) != null) {
                av2 = av2 == null ? object : (Map.Entry)f2.a(av2, object);
            }
            this.i = av2;
            for (object = this.k(); object != null; object = ((br)object).l()) {
                bc bc2 = (bc)object;
                bc bc3 = bc2.j;
                while (bc3 != null) {
                    Map.Entry entry = bc3.i;
                    if (entry != null) {
                        Map.Entry entry2 = bc2.i;
                        bc2.i = entry2 == null ? entry : (Map.Entry)f2.a(entry2, entry);
                    }
                    bc3 = bc2.j = bc3.k;
                }
            }
        }
    }

    @Override
    public /* synthetic */ Object c() {
        return this.d();
    }
}

