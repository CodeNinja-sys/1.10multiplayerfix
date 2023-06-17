/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.f;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.bw;
import java.net.SocketAddress;

class g
implements aw {
    final /* synthetic */ av a;
    final /* synthetic */ an b;
    final /* synthetic */ SocketAddress c;
    final /* synthetic */ SocketAddress d;
    final /* synthetic */ bw e;
    final /* synthetic */ f f;

    g(f f2, av av2, an an2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        this.f = f2;
        this.a = av2;
        this.b = an2;
        this.c = socketAddress;
        this.d = socketAddress2;
        this.e = bw2;
    }

    public void a(av av2) {
        io.netty.a.f.a(this.a, this.b, this.c, this.d, this.e);
    }
}

