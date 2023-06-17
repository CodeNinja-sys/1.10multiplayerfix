/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

import io.netty.channel.bw;
import io.netty.channel.f.d;

class e
implements Runnable {
    final /* synthetic */ bw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ d c;

    e(d d2, bw bw2, boolean bl2) {
        this.c = d2;
        this.a = bw2;
        this.b = bl2;
    }

    @Override
    public void run() {
        try {
            this.c.b.K();
            d.a(this.c, this.a);
            if (!this.b && this.c.b.I()) {
                this.c.b.c().l();
            }
        }
        catch (Throwable throwable) {
            d.a(this.c, this.a, throwable);
            d.a(this.c);
        }
    }
}

