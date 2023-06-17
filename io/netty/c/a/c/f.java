/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.c.a.c.e;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.by;
import io.netty.util.b.ad;

class f
implements Runnable {
    final /* synthetic */ bw a;
    final /* synthetic */ bw b;
    final /* synthetic */ e c;

    f(e e2, bw bw2, bw bw3) {
        this.c = e2;
        this.a = bw2;
        this.b = bw3;
    }

    @Override
    public void run() {
        av av2 = e.a(this.c, e.a(this.c), this.a);
        av2.a((ad)new by(this.b));
    }
}

