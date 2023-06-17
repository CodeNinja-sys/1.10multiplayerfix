/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.bw;
import io.netty.channel.epoll.m;

class n
implements Runnable {
    final /* synthetic */ bw a;
    final /* synthetic */ m b;

    n(m m2, bw bw2) {
        this.b = m2;
        this.a = bw2;
    }

    @Override
    public void run() {
        this.b.d(this.a);
    }
}

