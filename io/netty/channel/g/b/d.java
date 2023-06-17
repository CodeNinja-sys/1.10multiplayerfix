/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.b;

import com.sun.nio.sctp.SctpChannel;
import io.netty.channel.g.a;
import io.netty.channel.g.b.b;

final class d
extends a {
    final /* synthetic */ io.netty.channel.g.b.a b;

    private d(io.netty.channel.g.b.a a2, io.netty.channel.g.b.a a3, SctpChannel sctpChannel) {
        this.b = a2;
        super(a3, sctpChannel);
    }

    @Override
    protected void l() {
        io.netty.channel.g.b.a.a(this.b, false);
    }

    /* synthetic */ d(io.netty.channel.g.b.a a2, io.netty.channel.g.b.a a3, SctpChannel sctpChannel, b b2) {
        this(a2, a3, sctpChannel);
    }
}

