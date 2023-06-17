/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ah;
import io.netty.channel.ai;
import io.netty.channel.b;
import io.netty.channel.bw;
import java.net.SocketAddress;

final class aj
extends b {
    final /* synthetic */ ah b;

    private aj(ah ah2) {
        this.b = ah2;
        super(ah2);
    }

    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        this.a(bw2, new UnsupportedOperationException());
    }

    /* synthetic */ aj(ah ah2, ai ai2) {
        this(ah2);
    }
}

