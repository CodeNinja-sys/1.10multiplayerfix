/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bw;
import io.netty.channel.k;
import io.netty.util.c.r;

class p
extends r {
    final /* synthetic */ k a;
    final /* synthetic */ bw b;
    final /* synthetic */ k c;

    p(k k2, k k3, bw bw2) {
        this.c = k2;
        this.a = k3;
        this.b = bw2;
    }

    @Override
    public void run() {
        if (!this.c.b().F().a()) {
            k.a(this.a, this.b);
        } else {
            k.b(this.a, this.b);
        }
    }
}

