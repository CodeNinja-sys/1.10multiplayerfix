/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.k;

class t
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ k b;

    t(k k2, k k3) {
        this.b = k2;
        this.a = k3;
    }

    @Override
    public void run() {
        k.i(this.a);
    }
}

