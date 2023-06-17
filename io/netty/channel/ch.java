/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.cf;
import io.netty.channel.k;

class ch
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ k c;
    final /* synthetic */ cf d;

    ch(cf cf2, k k2, String string, k k3) {
        this.d = cf2;
        this.a = k2;
        this.b = string;
        this.c = k3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        cf cf2 = this.d;
        synchronized (cf2) {
            cf.a(this.d, this.a, this.b, this.c);
        }
    }
}

