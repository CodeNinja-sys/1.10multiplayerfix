/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.b;

import io.netty.channel.bw;
import io.netty.channel.g.b.e;
import java.net.InetAddress;

class f
implements Runnable {
    final /* synthetic */ InetAddress a;
    final /* synthetic */ bw b;
    final /* synthetic */ e c;

    f(e e2, InetAddress inetAddress, bw bw2) {
        this.c = e2;
        this.a = inetAddress;
        this.b = bw2;
    }

    @Override
    public void run() {
        this.c.a(this.a, this.b);
    }
}

