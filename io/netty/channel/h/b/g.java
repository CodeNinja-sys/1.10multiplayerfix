/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.b;

import io.netty.channel.bw;
import io.netty.channel.h.b.f;

class g
implements Runnable {
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

