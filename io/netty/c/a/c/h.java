/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.c.a.c.e;
import io.netty.channel.bd;
import io.netty.channel.bw;

class h
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ bw b;
    final /* synthetic */ e c;

    h(e e2, bd bd2, bw bw2) {
        this.c = e2;
        this.a = bd2;
        this.b = bw2;
    }

    @Override
    public void run() {
        this.a.b(this.b);
    }
}

