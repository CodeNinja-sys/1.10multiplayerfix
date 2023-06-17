/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.k;

class l
implements Runnable {
    final /* synthetic */ k a;

    l(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        k.a(this.a);
    }
}

