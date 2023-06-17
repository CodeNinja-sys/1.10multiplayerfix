/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.channel.bp;
import io.netty.channel.bw;
import java.net.SocketAddress;

public class aq
extends bf
implements bp {
    @Override
    public void a(bd bd2, SocketAddress socketAddress, bw bw2) {
        bd2.a(socketAddress, bw2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        bd2.a(socketAddress, socketAddress2, bw2);
    }

    @Override
    public void a(bd bd2, bw bw2) {
        bd2.a(bw2);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        bd2.b(bw2);
    }

    @Override
    public void c(bd bd2, bw bw2) {
        bd2.c(bw2);
    }

    @Override
    public void c(bd bd2) {
        bd2.p();
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        bd2.a(object, bw2);
    }

    @Override
    public void d(bd bd2) {
        bd2.q();
    }
}

