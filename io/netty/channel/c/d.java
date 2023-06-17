/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.b;

class d
implements Runnable {
    final /* synthetic */ b a;

    d(b b2) {
        this.a = b2;
    }

    @Override
    public void run() {
        this.a.t().b(this.a.t().h());
    }
}

