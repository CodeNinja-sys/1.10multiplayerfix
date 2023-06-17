/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.k;

class s
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ k b;

    s(k k2, k k3) {
        this.b = k2;
        this.a = k3;
    }

    @Override
    public void run() {
        k.h(this.a);
    }
}

