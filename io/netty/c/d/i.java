/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.d;

import io.netty.c.d.b;
import io.netty.c.d.f;
import io.netty.c.d.k;
import io.netty.channel.av;
import io.netty.channel.aw;

class i
implements aw {
    final /* synthetic */ Object a;
    final /* synthetic */ k b;
    final /* synthetic */ int c;
    final /* synthetic */ f d;

    i(f f2, Object object, k k2, int n2) {
        this.d = f2;
        this.a = object;
        this.b = k2;
        this.c = n2;
    }

    public void a(av av2) {
        if (!av2.bo_()) {
            f.a((b)this.a);
            this.b.a(av2.bq_());
        } else {
            this.b.a(this.c);
        }
    }
}

