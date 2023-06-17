/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.channel.bi;
import io.netty.channel.br;
import io.netty.channel.bw;
import io.netty.channel.dg;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.a;
import io.netty.channel.epoll.c;
import io.netty.channel.epoll.m;
import io.netty.channel.epoll.p;
import io.netty.channel.epoll.q;
import io.netty.channel.epoll.r;
import io.netty.channel.epoll.s;
import io.netty.util.b.ad;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

final class o
extends c {
    private dg f;
    static final /* synthetic */ boolean d;
    final /* synthetic */ m e;

    o(m m2) {
        this.e = m2;
        super(m2);
    }

    private void a(br br2) {
        m.a(this.e, true);
        if (this.e.H()) {
            if (Boolean.TRUE.equals(this.e.P().a(bi.i))) {
                this.m();
                br2.a(io.netty.channel.h.a.a);
            } else {
                this.b(this.h());
            }
        }
    }

    private boolean a(br br2, g g2, Throwable throwable, boolean bl2) {
        if (g2 != null) {
            if (g2.u()) {
                this.b = false;
                br2.b(g2);
            } else {
                g2.ad();
            }
        }
        br2.n();
        br2.a(throwable);
        if (bl2 || throwable instanceof IOException) {
            this.a(br2);
            return true;
        }
        return false;
    }

    @Override
    public void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        if (!bw2.bn_() || !this.d(bw2)) {
            return;
        }
        try {
            if (m.a(this.e) != null) {
                throw new IllegalStateException("connection attempt already made");
            }
            boolean bl2 = this.e.I();
            if (this.a((InetSocketAddress)socketAddress, (InetSocketAddress)socketAddress2)) {
                this.a(bw2, bl2);
            } else {
                m.a(this.e, bw2);
                m.a(this.e, socketAddress);
                int n2 = this.e.P().b();
                if (n2 > 0) {
                    m.a(this.e, this.e.e().a(new p(this, socketAddress), (long)n2, TimeUnit.MILLISECONDS));
                }
                bw2.g((ad)new q(this));
            }
        }
        catch (Throwable throwable) {
            ConnectException connectException;
            if (throwable instanceof ConnectException) {
                ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + socketAddress);
                connectException2.setStackTrace(throwable.getStackTrace());
                connectException = connectException2;
            }
            this.i();
            bw2.b(connectException);
        }
    }

    private void a(bw bw2, boolean bl2) {
        if (bw2 == null) {
            return;
        }
        this.e.d = true;
        boolean bl3 = bw2.c();
        if (!bl2 && this.e.I()) {
            this.e.c().l();
        }
        if (!bl3) {
            this.b(this.h());
        }
    }

    private void b(bw bw2, Throwable throwable) {
        if (bw2 == null) {
            return;
        }
        bw2.b(throwable);
        this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void n() {
        if (!d && !this.e.e().bt_()) {
            throw new AssertionError();
        }
        boolean bl2 = false;
        try {
            boolean bl3 = this.e.I();
            if (!this.o()) {
                bl2 = true;
                return;
            }
            this.a(m.a(this.e), bl3);
        }
        catch (Throwable throwable) {
            ConnectException connectException;
            if (throwable instanceof ConnectException) {
                ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + m.c(this.e));
                connectException2.setStackTrace(throwable.getStackTrace());
                connectException = connectException2;
            }
            this.b(m.a(this.e), connectException);
        }
        finally {
            if (!bl2) {
                if (m.b(this.e) != null) {
                    m.b(this.e).cancel(false);
                }
                m.a(this.e, null);
            }
        }
    }

    @Override
    void l() {
        if (m.a(this.e) != null) {
            this.n();
        } else {
            super.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        if (inetSocketAddress2 != null) {
            a.a(inetSocketAddress2);
            Native.a(this.e.e, inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
        }
        boolean bl2 = false;
        try {
            a.a(inetSocketAddress);
            boolean bl3 = Native.b(this.e.e, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
            m.a(this.e, inetSocketAddress);
            m.b(this.e, Native.localAddress(this.e.e));
            if (!bl3) {
                this.e.M();
            }
            bl2 = true;
            boolean bl4 = bl3;
            return bl4;
        }
        finally {
            if (!bl2) {
                this.e.B();
            }
        }
    }

    private boolean o() {
        if (Native.finishConnect(this.e.e)) {
            this.e.N();
            return true;
        }
        this.e.M();
        return false;
    }

    private int a(g g2) {
        int n2;
        int n3 = g2.q();
        if (g2.Z()) {
            n2 = Native.readAddress(this.e.e, g2.aa(), n3, g2.j());
        } else {
            ByteBuffer byteBuffer = g2.k(n3, g2.s());
            n2 = Native.read(this.e.e, byteBuffer, byteBuffer.position(), byteBuffer.limit());
        }
        if (n2 > 0) {
            g2.h(n3 + n2);
        }
        return n2;
    }

    @Override
    void k() {
        if (this.e.I()) {
            this.j();
        } else {
            this.a(this.e.c());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void j() {
        s s2 = this.e.P();
        br br2 = this.e.c();
        h h2 = s2.e();
        dg dg2 = this.f;
        if (dg2 == null) {
            this.f = dg2 = s2.f().a();
        }
        g g2 = null;
        boolean bl2 = false;
        try {
            int n2;
            int n3;
            int n4 = 0;
            do {
                g2 = dg2.a(h2);
                n2 = g2.s();
                n3 = this.a(g2);
                if (n3 <= 0) {
                    g2.ad();
                    bl2 = n3 < 0;
                    break;
                }
                this.b = false;
                br2.b(g2);
                g2 = null;
                if (n4 >= Integer.MAX_VALUE - n3) {
                    dg2.a(n4);
                    n4 = n3;
                    continue;
                }
                n4 += n3;
            } while (n3 >= n2);
            br2.n();
            dg2.a(n4);
            if (bl2) {
                this.a(br2);
                bl2 = false;
            }
        }
        catch (Throwable throwable) {
            boolean bl3 = this.a(br2, g2, throwable, bl2);
            if (!bl3) {
                this.e.e().execute(new r(this));
            }
        }
        finally {
            if (!s2.g() && !this.b) {
                this.m();
            }
        }
    }

    static {
        d = !m.class.desiredAssertionStatus();
    }
}

