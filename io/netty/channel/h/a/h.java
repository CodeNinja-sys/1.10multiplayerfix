/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.h.a.f;
import io.netty.channel.h.a.g;
import java.net.Socket;

final class h
extends io.netty.channel.h.g {
    final /* synthetic */ f c;

    private h(f f2, f f3, Socket socket) {
        this.c = f2;
        super(f3, socket);
    }

    @Override
    protected void l() {
        f.a(this.c, false);
    }

    /* synthetic */ h(f f2, f f3, Socket socket, g g2) {
        this(f2, f3, socket);
    }
}

