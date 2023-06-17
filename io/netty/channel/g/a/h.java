/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.a;

import com.sun.nio.sctp.SctpServerChannel;
import io.netty.channel.g.a.e;
import io.netty.channel.g.a.f;
import io.netty.channel.g.b;

final class h
extends b {
    final /* synthetic */ e b;

    private h(e e2, e e3, SctpServerChannel sctpServerChannel) {
        this.b = e2;
        super(e3, sctpServerChannel);
    }

    @Override
    protected void l() {
        e.a(this.b, false);
    }

    /* synthetic */ h(e e2, e e3, SctpServerChannel sctpServerChannel, f f2) {
        this(e2, e3, sctpServerChannel);
    }
}

