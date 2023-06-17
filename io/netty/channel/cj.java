/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.cf;
import io.netty.channel.k;

class cj
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ cf b;

    cj(cf cf2, k k2) {
        this.b = cf2;
        this.a = k2;
    }

    @Override
    public void run() {
        cf.a(this.b, this.a);
    }
}

