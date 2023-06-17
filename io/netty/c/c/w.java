/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.q;
import io.netty.channel.bd;
import io.netty.channel.bw;

class w
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ bw b;
    final /* synthetic */ q c;

    w(q q2, bd bd2, bw bw2) {
        this.c = q2;
        this.a = bd2;
        this.b = bw2;
    }

    @Override
    public void run() {
        q.j().d(this.a.b() + " last write attempt timed out." + " Force-closing the connection.");
        this.a.b(this.b);
    }
}

