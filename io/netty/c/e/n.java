/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.e;

import io.netty.c.e.m;
import io.netty.channel.bd;
import io.netty.channel.bw;

class n
implements Runnable {
    final /* synthetic */ bw a;
    final /* synthetic */ bd b;
    final /* synthetic */ m c;

    n(m m2, bw bw2, bd bd2) {
        this.c = m2;
        this.a = bw2;
        this.b = bd2;
    }

    @Override
    public void run() {
        if (!this.a.isDone()) {
            try {
                this.c.a(this.b);
            }
            catch (Throwable throwable) {
                this.b.a(throwable);
            }
        }
    }
}

