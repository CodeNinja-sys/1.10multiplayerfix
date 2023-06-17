/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.b;
import io.netty.channel.bw;
import io.netty.util.c.r;

class f
extends r {
    final /* synthetic */ bw a;
    final /* synthetic */ b b;

    f(b b2, bw bw2) {
        this.b = b2;
        this.a = bw2;
    }

    @Override
    public void run() {
        this.b.b(this.a);
    }
}

