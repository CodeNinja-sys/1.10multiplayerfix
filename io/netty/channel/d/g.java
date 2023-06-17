/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.d.d;
import io.netty.channel.d.e;

class g
implements aw {
    final /* synthetic */ e a;

    g(e e2) {
        this.a = e2;
    }

    public void a(av av2) {
        if (av2.isCancelled()) {
            if (d.b(this.a.d) != null) {
                d.b(this.a.d).cancel(false);
            }
            d.a(this.a.d, null);
            this.a.b(this.a.h());
        }
    }
}

