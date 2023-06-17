/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bw;
import io.netty.channel.k;
import io.netty.util.c.r;
import java.net.SocketAddress;

class n
extends r {
    final /* synthetic */ k a;
    final /* synthetic */ SocketAddress b;
    final /* synthetic */ bw c;
    final /* synthetic */ k d;

    n(k k2, k k3, SocketAddress socketAddress, bw bw2) {
        this.d = k2;
        this.a = k3;
        this.b = socketAddress;
        this.c = bw2;
    }

    @Override
    public void run() {
        k.a(this.a, this.b, this.c);
    }
}

