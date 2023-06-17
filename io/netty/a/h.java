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

final class h
implements Runnable {
    final /* synthetic */ av a;
    final /* synthetic */ SocketAddress b;
    final /* synthetic */ an c;
    final /* synthetic */ SocketAddress d;
    final /* synthetic */ bw e;

    h(av av2, SocketAddress socketAddress, an an2, SocketAddress socketAddress2, bw bw2) {
        this.a = av2;
        this.b = socketAddress;
        this.c = an2;
        this.d = socketAddress2;
        this.e = bw2;
    }

    @Override
    public void run() {
        if (this.a.bo_()) {
            if (this.b == null) {
                this.c.b(this.d, this.e);
            } else {
                this.c.a(this.d, this.b, this.e);
            }
            this.e.g((ad)aw.h);
        } else {
            this.e.a(this.a.bq_());
        }
    }
}

