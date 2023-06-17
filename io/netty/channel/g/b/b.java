/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.b;

import io.netty.channel.bw;
import io.netty.channel.g.b.a;
import java.net.InetAddress;

class b
implements Runnable {
    final /* synthetic */ InetAddress a;
    final /* synthetic */ bw b;
    final /* synthetic */ a c;

    b(a a2, InetAddress inetAddress, bw bw2) {
        this.c = a2;
        this.a = inetAddress;
        this.b = bw2;
    }

    @Override
    public void run() {
        this.c.a(this.a, this.b);
    }
}

