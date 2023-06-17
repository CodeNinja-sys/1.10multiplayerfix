/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.b;
import io.netty.channel.bw;
import io.netty.util.c.r;

class c
extends r {
    final /* synthetic */ bw a;
    final /* synthetic */ b b;

    c(b b2, bw bw2) {
        this.b = b2;
        this.a = bw2;
    }

    @Override
    public void run() {
        io.netty.channel.b.a(this.b, this.a);
    }
}

