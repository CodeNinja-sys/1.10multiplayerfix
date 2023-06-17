/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.c.a.c.l;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.by;
import io.netty.util.b.ad;

class m
implements Runnable {
    final /* synthetic */ bw a;
    final /* synthetic */ bw b;
    final /* synthetic */ l c;

    m(l l2, bw bw2, bw bw3) {
        this.c = l2;
        this.a = bw2;
        this.b = bw3;
    }

    @Override
    public void run() {
        av av2 = l.a(this.c, l.a(this.c), this.a);
        av2.a((ad)new by(this.b));
    }
}

