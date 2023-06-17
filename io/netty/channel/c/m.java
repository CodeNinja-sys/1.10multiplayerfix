/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.c.l;

class m
implements Runnable {
    final /* synthetic */ l a;

    m(l l2) {
        this.a = l2;
    }

    @Override
    public void run() {
        this.a.t().b(this.a.t().h());
    }
}

