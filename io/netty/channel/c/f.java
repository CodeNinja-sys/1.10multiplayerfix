/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.b;

class f
implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ b b;

    f(b b2, b b3) {
        this.b = b2;
        this.a = b3;
    }

    @Override
    public void run() {
        this.a.t().b(this.b.t().h());
    }
}

