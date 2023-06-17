/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bw;
import io.netty.channel.k;

class r
extends io.netty.util.c.r {
    final /* synthetic */ k a;
    final /* synthetic */ bw b;
    final /* synthetic */ k c;

    r(k k2, k k3, bw bw2) {
        this.c = k2;
        this.a = k3;
        this.b = bw2;
    }

    @Override
    public void run() {
        k.c(this.a, this.b);
    }
}

