/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.c;
import io.netty.channel.bd;

class d
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ c b;

    d(c c2, bd bd2) {
        this.b = c2;
        this.a = bd2;
    }

    @Override
    public void run() {
        c.a(this.b, this.a);
    }
}

