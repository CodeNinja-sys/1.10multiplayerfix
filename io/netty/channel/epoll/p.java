/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.bw;
import io.netty.channel.cb;
import io.netty.channel.epoll.m;
import io.netty.channel.epoll.o;
import java.net.SocketAddress;

class p
implements Runnable {
    final /* synthetic */ SocketAddress a;
    final /* synthetic */ o b;

    p(o o2, SocketAddress socketAddress) {
        this.b = o2;
        this.a = socketAddress;
    }

    @Override
    public void run() {
        bw bw2 = m.a(this.b.e);
        cb cb2 = new cb("connection timed out: " + this.a);
        if (bw2 != null && bw2.b(cb2)) {
            this.b.b(this.b.h());
        }
    }
}

