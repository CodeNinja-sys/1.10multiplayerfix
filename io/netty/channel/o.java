/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bw;
import io.netty.channel.k;
import io.netty.util.c.r;
import java.net.SocketAddress;

class o
extends r {
    final /* synthetic */ k a;
    final /* synthetic */ SocketAddress b;
    final /* synthetic */ SocketAddress c;
    final /* synthetic */ bw d;
    final /* synthetic */ k e;

    o(k k2, k k3, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        this.e = k2;
        this.a = k3;
        this.b = socketAddress;
        this.c = socketAddress2;
        this.d = bw2;
    }

    @Override
    public void run() {
        k.a(this.a, this.b, this.c, this.d);
    }
}

