/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bw;
import io.netty.channel.k;
import io.netty.util.c.r;

class q
extends r {
    final /* synthetic */ k a;
    final /* synthetic */ bw b;
    final /* synthetic */ k c;

    q(k k2, k k3, bw bw2) {
        this.c = k2;
        this.a = k3;
        this.b = bw2;
    }

    @Override
    public void run() {
        k.a(this.a, this.b);
    }
}

