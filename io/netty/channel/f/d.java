/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.f;

import io.netty.channel.b;
import io.netty.channel.bw;
import io.netty.channel.f.c;
import io.netty.channel.f.e;
import io.netty.channel.f.j;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

final class d
extends b {
    final /* synthetic */ io.netty.channel.f.b b;

    private d(io.netty.channel.f.b b2) {
        this.b = b2;
        super(b2);
    }

    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        if (!bw2.bn_() || !this.d(bw2)) {
            return;
        }
        try {
            boolean bl2 = this.b.I();
            this.b.b(socketAddress, socketAddress2);
            int n2 = (Integer)this.b.J().a(j.I);
            if (n2 > 0) {
                this.b.e().a(new e(this, bw2, bl2), (long)n2, TimeUnit.MILLISECONDS);
            } else {
                this.b.K();
                this.e(bw2);
                if (!bl2 && this.b.I()) {
                    this.b.c().l();
                }
            }
        }
        catch (Throwable throwable) {
            this.a(bw2, throwable);
            this.i();
        }
    }

    /* synthetic */ d(io.netty.channel.f.b b2, c c2) {
        this(b2);
    }

    static /* synthetic */ void a(d d2, bw bw2) {
        d2.e(bw2);
    }

    static /* synthetic */ void a(d d2, bw bw2, Throwable throwable) {
        d2.a(bw2, throwable);
    }

    static /* synthetic */ void a(d d2) {
        d2.i();
    }
}

