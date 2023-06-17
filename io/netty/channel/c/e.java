/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.b;

class e
implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ b b;

    e(b b2, b b3) {
        this.b = b2;
        this.a = b3;
    }

    @Override
    public void run() {
        io.netty.channel.c.b.a(this.b, false);
        this.a.c().l();
        io.netty.channel.c.b.b(this.a).b();
    }
}

