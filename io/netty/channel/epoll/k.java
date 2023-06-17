/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.br;
import io.netty.channel.bw;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.c;
import io.netty.channel.epoll.j;
import io.netty.channel.epoll.m;
import java.net.SocketAddress;

final class k
extends c {
    static final /* synthetic */ boolean d;
    final /* synthetic */ j e;

    k(j j2) {
        this.e = j2;
        super(j2);
    }

    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        bw2.a(new UnsupportedOperationException());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void j() {
        if (!d && !this.e.e().bt_()) {
            throw new AssertionError();
        }
        br br2 = this.e.c();
        Throwable throwable = null;
        try {
            try {
                int n2;
                while ((n2 = Native.accept(this.e.e)) != -1) {
                    try {
                        this.b = false;
                        br2.b(new m(this.e, n2));
                    }
                    catch (Throwable throwable2) {
                        br2.n();
                        br2.a(throwable2);
                    }
                }
            }
            catch (Throwable throwable3) {
                throwable = throwable3;
            }
            br2.n();
            if (throwable == null) return;
            br2.a(throwable);
            return;
        }
        finally {
            if (!j.a(this.e).g() && !this.b) {
                this.m();
            }
        }
    }

    static {
        d = !j.class.desiredAssertionStatus();
    }
}

