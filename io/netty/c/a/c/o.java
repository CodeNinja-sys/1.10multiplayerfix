/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.c.a.c.l;
import io.netty.channel.bd;
import io.netty.channel.bw;

class o
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ bw b;
    final /* synthetic */ l c;

    o(l l2, bd bd2, bw bw2) {
        this.c = l2;
        this.a = bd2;
        this.b = bw2;
    }

    @Override
    public void run() {
        this.a.b(this.b);
    }
}

