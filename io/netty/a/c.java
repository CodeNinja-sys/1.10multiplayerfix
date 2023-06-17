/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import java.net.SocketAddress;

final class c
implements Runnable {
    final /* synthetic */ av a;
    final /* synthetic */ an b;
    final /* synthetic */ SocketAddress c;
    final /* synthetic */ bw d;

    c(av av2, an an2, SocketAddress socketAddress, bw bw2) {
        this.a = av2;
        this.b = an2;
        this.c = socketAddress;
        this.d = bw2;
    }

    @Override
    public void run() {
        if (this.a.bo_()) {
            this.b.a(this.c, this.d).a((ad)aw.h);
        } else {
            this.d.a(this.a.bq_());
        }
    }
}

