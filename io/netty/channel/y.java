/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.k;
import io.netty.util.c.r;

class y
extends r {
    final /* synthetic */ k a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ k c;

    y(k k2, k k3, Throwable throwable) {
        this.c = k2;
        this.a = k3;
        this.b = throwable;
    }

    @Override
    public void run() {
        k.a(this.a, this.b);
    }
}

