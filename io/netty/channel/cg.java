/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.cf;
import io.netty.channel.k;

class cg
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ cf b;

    cg(cf cf2, k k2) {
        this.b = cf2;
        this.a = k2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        cf cf2 = this.b;
        synchronized (cf2) {
            this.b.a(this.a);
        }
    }
}

