/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.b;
import io.netty.channel.bw;
import io.netty.channel.c.a;
import io.netty.channel.c.c;
import io.netty.channel.c.i;
import io.netty.channel.c.l;
import java.net.SocketAddress;
import java.nio.channels.AlreadyConnectedException;
import java.nio.channels.ConnectionPendingException;

class h
extends b {
    final /* synthetic */ io.netty.channel.c.b b;

    private h(io.netty.channel.c.b b2) {
        this.b = b2;
        super(b2);
    }

    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        an an2;
        if (!bw2.bn_() || !this.d(bw2)) {
            return;
        }
        if (io.netty.channel.c.b.c(this.b) == 2) {
            AlreadyConnectedException alreadyConnectedException = new AlreadyConnectedException();
            this.a(bw2, alreadyConnectedException);
            this.b.c().a(alreadyConnectedException);
            return;
        }
        if (io.netty.channel.c.b.b(this.b) != null) {
            throw new ConnectionPendingException();
        }
        io.netty.channel.c.b.a(this.b, bw2);
        if (io.netty.channel.c.b.c(this.b) != 1 && socketAddress2 == null) {
            socketAddress2 = new a(this.b);
        }
        if (socketAddress2 != null) {
            try {
                this.b.c(socketAddress2);
            }
            catch (Throwable throwable) {
                this.a(bw2, throwable);
                this.b(this.h());
                return;
            }
        }
        if (!((an2 = i.a(socketAddress)) instanceof l)) {
            ar ar2 = new ar("connection refused");
            this.a(bw2, ar2);
            this.b(this.h());
            return;
        }
        l l2 = (l)an2;
        io.netty.channel.c.b.a(this.b, l2.a(this.b));
    }

    /* synthetic */ h(io.netty.channel.c.b b2, c c2) {
        this(b2);
    }
}

