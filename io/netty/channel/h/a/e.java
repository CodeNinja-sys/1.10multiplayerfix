/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.h.a.c;
import io.netty.channel.h.a.d;
import io.netty.channel.h.f;
import java.net.ServerSocket;

final class e
extends f {
    final /* synthetic */ c c;

    private e(c c2, c c3, ServerSocket serverSocket) {
        this.c = c2;
        super(c3, serverSocket);
    }

    @Override
    protected void l() {
        io.netty.channel.h.a.c.a(this.c, false);
    }

    /* synthetic */ e(c c2, c c3, ServerSocket serverSocket, d d2) {
        this(c2, c3, serverSocket);
    }
}

