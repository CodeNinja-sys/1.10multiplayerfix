/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.bw;
import io.netty.channel.cb;
import io.netty.channel.d.d;
import io.netty.channel.d.e;
import io.netty.util.c.r;
import java.net.SocketAddress;

class f
extends r {
    final /* synthetic */ SocketAddress a;
    final /* synthetic */ e b;

    f(e e2, SocketAddress socketAddress) {
        this.b = e2;
        this.a = socketAddress;
    }

    @Override
    public void run() {
        bw bw2 = d.a(this.b.d);
        cb cb2 = new cb("connection timed out: " + this.a);
        if (bw2 != null && bw2.b(cb2)) {
            this.b.b(this.b.h());
        }
    }
}

