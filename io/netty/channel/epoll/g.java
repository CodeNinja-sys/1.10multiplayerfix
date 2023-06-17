/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cw;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.epoll.EpollDatagramChannel;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.e;
import io.netty.channel.h.c;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Map;

public final class g
extends cd
implements c {
    private static final df b = new cw(2048);
    private final EpollDatagramChannel c;
    private boolean d;

    g(EpollDatagramChannel epollDatagramChannel) {
        super(epollDatagramChannel);
        this.c = epollDatagramChannel;
        this.b(b);
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.l, bi.o, bi.n, bi.p, bi.x, bi.u, bi.v, bi.w, bi.t, bi.B, e.G);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.l) {
            return this.q();
        }
        if (bi2 == bi.o) {
            return this.n();
        }
        if (bi2 == bi.n) {
            return this.m();
        }
        if (bi2 == bi.p) {
            return this.p();
        }
        if (bi2 == bi.x) {
            return this.r();
        }
        if (bi2 == bi.u) {
            return this.t();
        }
        if (bi2 == bi.v) {
            return this.u();
        }
        if (bi2 == bi.w) {
            return this.s();
        }
        if (bi2 == bi.t) {
            return this.o();
        }
        if (bi2 == bi.B) {
            return this.d;
        }
        if (bi2 == e.G) {
            return this.v();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.l) {
            this.f((Boolean)object);
        } else if (bi2 == bi.o) {
            this.l((Integer)object);
        } else if (bi2 == bi.n) {
            this.k((Integer)object);
        } else if (bi2 == bi.p) {
            this.e((Boolean)object);
        } else if (bi2 == bi.x) {
            this.g((Boolean)object);
        } else if (bi2 == bi.u) {
            this.a((InetAddress)object);
        } else if (bi2 == bi.v) {
            this.a((NetworkInterface)object);
        } else if (bi2 == bi.w) {
            this.n((Integer)object);
        } else if (bi2 == bi.t) {
            this.m((Integer)object);
        } else if (bi2 == bi.B) {
            this.m((Boolean)object);
        } else if (bi2 == e.G) {
            this.h((Boolean)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    private void m(boolean bl2) {
        if (this.a.j()) {
            throw new IllegalStateException("Can only changed before channel was registered");
        }
        this.d = bl2;
    }

    public g b(cy cy2) {
        super.a(cy2);
        return this;
    }

    public g f(int n2) {
        super.e(n2);
        return this;
    }

    public g g(int n2) {
        super.d(n2);
        return this;
    }

    public g c(boolean bl2) {
        super.b(bl2);
        return this;
    }

    public g d(boolean bl2) {
        super.a(bl2);
        return this;
    }

    public g b(df df2) {
        super.a(df2);
        return this;
    }

    public g h(int n2) {
        super.c(n2);
        return this;
    }

    public g b(h h2) {
        super.a(h2);
        return this;
    }

    public g i(int n2) {
        super.a(n2);
        return this;
    }

    public g j(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public int m() {
        return Native.getSendBufferSize(this.c.e);
    }

    public g k(int n2) {
        Native.setSendBufferSize(this.c.e, n2);
        return this;
    }

    @Override
    public int n() {
        return Native.getReceiveBufferSize(this.c.e);
    }

    public g l(int n2) {
        Native.setReceiveBufferSize(this.c.e, n2);
        return this;
    }

    @Override
    public int o() {
        return Native.getTrafficClass(this.c.e);
    }

    public g m(int n2) {
        Native.setTrafficClass(this.c.e, n2);
        return this;
    }

    @Override
    public boolean p() {
        return Native.isReuseAddress(this.c.e) == 1;
    }

    public g e(boolean bl2) {
        Native.setReuseAddress(this.c.e, bl2 ? 1 : 0);
        return this;
    }

    @Override
    public boolean q() {
        return Native.isBroadcast(this.c.e) == 1;
    }

    public g f(boolean bl2) {
        Native.setBroadcast(this.c.e, bl2 ? 1 : 0);
        return this;
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public c g(boolean bl2) {
        throw new UnsupportedOperationException("Multicast not supported");
    }

    @Override
    public int s() {
        return -1;
    }

    public g n(int n2) {
        throw new UnsupportedOperationException("Multicast not supported");
    }

    @Override
    public InetAddress t() {
        return null;
    }

    public g a(InetAddress inetAddress) {
        throw new UnsupportedOperationException("Multicast not supported");
    }

    @Override
    public NetworkInterface u() {
        return null;
    }

    public g a(NetworkInterface networkInterface) {
        throw new UnsupportedOperationException("Multicast not supported");
    }

    public boolean v() {
        return Native.isReusePort(this.c.e) == 1;
    }

    public g h(boolean bl2) {
        Native.setReusePort(this.c.e, bl2 ? 1 : 0);
        return this;
    }

    @Override
    protected void l() {
        this.c.L();
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.g(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ ap a(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ ap a(h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ ap c(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.j(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ c c(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ c i(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ c j(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ c c(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ c c(h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ c o(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ c p(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ c q(int n2) {
        return this.j(n2);
    }

    @Override
    public /* synthetic */ c b(NetworkInterface networkInterface) {
        return this.a(networkInterface);
    }

    @Override
    public /* synthetic */ c b(InetAddress inetAddress) {
        return this.a(inetAddress);
    }

    @Override
    public /* synthetic */ c r(int n2) {
        return this.n(n2);
    }

    @Override
    public /* synthetic */ c k(boolean bl2) {
        return this.f(bl2);
    }

    @Override
    public /* synthetic */ c l(boolean bl2) {
        return this.e(bl2);
    }

    @Override
    public /* synthetic */ c s(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ c t(int n2) {
        return this.l(n2);
    }

    @Override
    public /* synthetic */ c u(int n2) {
        return this.k(n2);
    }
}

