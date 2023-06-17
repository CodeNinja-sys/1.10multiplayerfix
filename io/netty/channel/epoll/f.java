/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.bw;
import io.netty.channel.dg;
import io.netty.channel.epoll.EpollDatagramChannel;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.a;
import io.netty.channel.epoll.c;
import io.netty.channel.h.d;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

final class f
extends c {
    private dg f;
    static final /* synthetic */ boolean d;
    final /* synthetic */ EpollDatagramChannel e;

    f(EpollDatagramChannel epollDatagramChannel) {
        this.e = epollDatagramChannel;
        super(epollDatagramChannel);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        boolean bl2 = false;
        try {
            try {
                InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
                if (socketAddress2 != null) {
                    InetSocketAddress inetSocketAddress2 = (InetSocketAddress)socketAddress2;
                    this.e.c(inetSocketAddress2);
                }
                a.a(inetSocketAddress);
                EpollDatagramChannel.a(this.e, inetSocketAddress);
                EpollDatagramChannel.b(this.e, Native.localAddress(this.e.e));
                bl2 = true;
            }
            finally {
                if (!bl2) {
                    this.e.B();
                } else {
                    bw2.b();
                    EpollDatagramChannel.a(this.e, true);
                }
            }
        }
        catch (Throwable throwable) {
            bw2.a(throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    void j() {
        var1_1 = this.e.S();
        var2_2 = this.f;
        if (var2_2 == null) {
            this.f = var2_2 = var1_1.f().a();
        }
        if (!io.netty.channel.epoll.f.d && !this.e.e().bt_()) {
            throw new AssertionError();
        }
        var3_3 = this.e.c();
        while (true) lbl-1000:
        // 5 sources

        {
            var4_4 = null;
            try {
                var4_4 = var2_2.a(var1_1.e());
                var5_5 = var4_4.q();
                if (var4_4.Z()) {
                    var6_7 = Native.recvFromAddress(this.e.e, var4_4.aa(), var5_5, var4_4.j());
                } else {
                    var7_8 = var4_4.k(var5_5, var4_4.s());
                    var6_7 = Native.recvFrom(this.e.e, var7_8, var7_8.position(), var7_8.limit());
                }
                if (var6_7 == null) {
                    return;
                }
                var7_9 = var6_7.a;
                var4_4.h(var4_4.q() + var7_9);
                var2_2.a(var7_9);
                this.b = false;
                var3_3.b(new d(var4_4, (InetSocketAddress)this.b(), var6_7));
                var4_4 = null;
            }
            catch (Throwable var5_6) {
                var3_3.n();
                var3_3.a(var5_6);
            }
            finally {
                if (var4_4 == null) ** GOTO lbl-1000
                var4_4.ad();
                continue;
            }
            break;
        }
        ** GOTO lbl-1000
        finally {
            if (!this.e.S().g() && !this.b) {
                this.e.L();
            }
        }
    }

    static {
        d = !EpollDatagramChannel.class.desiredAssertionStatus();
    }
}

