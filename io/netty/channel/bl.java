/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bj;
import java.nio.channels.ClosedChannelException;

class bl
implements Runnable {
    final /* synthetic */ ClosedChannelException a;
    final /* synthetic */ bj b;

    bl(bj bj2, ClosedChannelException closedChannelException) {
        this.b = bj2;
        this.a = closedChannelException;
    }

    @Override
    public void run() {
        this.b.a(this.a);
    }
}

