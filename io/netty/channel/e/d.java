/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.channel.bw;
import io.netty.channel.e.b;
import io.netty.channel.e.c;
import java.net.ConnectException;
import java.net.SocketAddress;

final class d
extends io.netty.channel.b {
    final /* synthetic */ b b;

    private d(b b2) {
        this.b = b2;
        super(b2);
    }

    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        if (!bw2.bn_() || !this.d(bw2)) {
            return;
        }
        try {
            boolean bl2 = this.b.I();
            this.b.b(socketAddress, socketAddress2);
            this.e(bw2);
            if (!bl2 && this.b.I()) {
                this.b.c().l();
            }
        }
        catch (Throwable throwable) {
            ConnectException connectException;
            if (throwable instanceof ConnectException) {
                ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + socketAddress);
                connectException2.setStackTrace(throwable.getStackTrace());
                connectException = connectException2;
            }
            this.a(bw2, connectException);
            this.i();
        }
    }

    /* synthetic */ d(b b2, c c2) {
        this(b2);
    }
}

