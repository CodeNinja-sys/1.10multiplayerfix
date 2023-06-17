/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.a;
import io.netty.channel.b;
import io.netty.util.c.r;

class i
extends r {
    final /* synthetic */ Exception a;
    final /* synthetic */ b b;

    i(b b2, Exception exception) {
        this.b = b2;
        this.a = exception;
    }

    @Override
    public void run() {
        io.netty.channel.a.b(this.b.a).a(this.a);
    }
}

