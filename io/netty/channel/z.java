/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.k;
import io.netty.util.c.r;

class z
extends r {
    final /* synthetic */ k a;
    final /* synthetic */ Object b;
    final /* synthetic */ k c;

    z(k k2, k k3, Object object) {
        this.c = k2;
        this.a = k3;
        this.b = object;
    }

    @Override
    public void run() {
        k.a(this.a, this.b);
    }
}

