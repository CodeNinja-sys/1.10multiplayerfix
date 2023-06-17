/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.bw;
import io.netty.channel.h.a.f;
import io.netty.util.c.r;

class g
extends r {
    final /* synthetic */ bw a;
    final /* synthetic */ f b;

    g(f f2, bw bw2) {
        this.b = f2;
        this.a = bw2;
    }

    @Override
    public void run() {
        this.b.d(this.a);
    }
}

