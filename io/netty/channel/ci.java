/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bd;
import io.netty.channel.cf;

class ci
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ cf b;

    ci(cf cf2, bd bd2) {
        this.b = cf2;
        this.a = bd2;
    }

    @Override
    public void run() {
        cf.a(this.b, this.a);
    }
}

