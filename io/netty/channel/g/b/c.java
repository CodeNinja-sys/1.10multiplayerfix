/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.b;

import io.netty.channel.bw;
import io.netty.channel.g.b.a;
import java.net.InetAddress;

class c
implements Runnable {
    final /* synthetic */ InetAddress a;
    final /* synthetic */ bw b;
    final /* synthetic */ a c;

    c(a a2, InetAddress inetAddress, bw bw2) {
        this.c = a2;
        this.a = inetAddress;
        this.b = bw2;
    }

    @Override
    public void run() {
        this.c.b(this.a, this.b);
    }
}

