/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.e;
import io.netty.channel.epoll.m;
import io.netty.channel.h.l;
import io.netty.util.c.u;
import java.util.Map;

public final class s
extends cd
implements l {
    private final m b;
    private volatile boolean c;

    s(m m2) {
        super(m2);
        this.b = m2;
        if (u.e()) {
            this.e(true);
        }
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.o, bi.n, bi.y, bi.m, bi.p, bi.q, bi.t, bi.i, e.C, e.F, e.D, e.E);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.o) {
            return this.m();
        }
        if (bi2 == bi.n) {
            return this.n();
        }
        if (bi2 == bi.y) {
            return this.s();
        }
        if (bi2 == bi.m) {
            return this.q();
        }
        if (bi2 == bi.p) {
            return this.r();
        }
        if (bi2 == bi.q) {
            return this.o();
        }
        if (bi2 == bi.t) {
            return this.p();
        }
        if (bi2 == bi.i) {
            return this.x();
        }
        if (bi2 == e.C) {
            return this.t();
        }
        if (bi2 == e.D) {
            return this.u();
        }
        if (bi2 == e.E) {
            return this.v();
        }
        if (bi2 == e.F) {
            return this.w();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.o) {
            this.f((Integer)object);
        } else if (bi2 == bi.n) {
            this.g((Integer)object);
        } else if (bi2 == bi.y) {
            this.e((Boolean)object);
        } else if (bi2 == bi.m) {
            this.c((Boolean)object);
        } else if (bi2 == bi.p) {
            this.d((Boolean)object);
        } else if (bi2 == bi.q) {
            this.h((Integer)object);
        } else if (bi2 == bi.t) {
            this.i((Integer)object);
        } else if (bi2 == bi.i) {
            this.g((Boolean)object);
        } else if (bi2 == e.C) {
            this.f((Boolean)object);
        } else if (bi2 == e.D) {
            this.j((Integer)object);
        } else if (bi2 == e.F) {
            this.l((Integer)object);
        } else if (bi2 == e.E) {
            this.k((Integer)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public int m() {
        return Native.getReceiveBufferSize(this.b.e);
    }

    @Override
    public int n() {
        return Native.getSendBufferSize(this.b.e);
    }

    @Override
    public int o() {
        return Native.getSoLinger(this.b.e);
    }

    @Override
    public int p() {
        return Native.getTrafficClass(this.b.e);
    }

    @Override
    public boolean q() {
        return Native.isKeepAlive(this.b.e) == 1;
    }

    @Override
    public boolean r() {
        return Native.isReuseAddress(this.b.e) == 1;
    }

    @Override
    public boolean s() {
        return Native.isTcpNoDelay(this.b.e) == 1;
    }

    public boolean t() {
        return Native.isTcpCork(this.b.e) == 1;
    }

    public int u() {
        return Native.getTcpKeepIdle(this.b.e);
    }

    public int v() {
        return Native.getTcpKeepIntvl(this.b.e);
    }

    public int w() {
        return Native.getTcpKeepCnt(this.b.e);
    }

    public s c(boolean bl2) {
        Native.setKeepAlive(this.b.e, bl2 ? 1 : 0);
        return this;
    }

    public s a(int n2, int n3, int n4) {
        return this;
    }

    public s f(int n2) {
        Native.setReceiveBufferSize(this.b.e, n2);
        return this;
    }

    public s d(boolean bl2) {
        Native.setReuseAddress(this.b.e, bl2 ? 1 : 0);
        return this;
    }

    public s g(int n2) {
        Native.setSendBufferSize(this.b.e, n2);
        return this;
    }

    public s h(int n2) {
        Native.setSoLinger(this.b.e, n2);
        return this;
    }

    public s e(boolean bl2) {
        Native.setTcpNoDelay(this.b.e, bl2 ? 1 : 0);
        return this;
    }

    public s f(boolean bl2) {
        Native.setTcpCork(this.b.e, bl2 ? 1 : 0);
        return this;
    }

    public s i(int n2) {
        Native.setTrafficClass(this.b.e, n2);
        return this;
    }

    public s j(int n2) {
        Native.setTcpKeepIdle(this.b.e, n2);
        return this;
    }

    public s k(int n2) {
        Native.setTcpKeepIntvl(this.b.e, n2);
        return this;
    }

    public s l(int n2) {
        Native.setTcpKeepCnt(this.b.e, n2);
        return this;
    }

    @Override
    public boolean x() {
        return this.c;
    }

    public s g(boolean bl2) {
        this.c = bl2;
        return this;
    }

    public s m(int n2) {
        super.a(n2);
        return this;
    }

    public s n(int n2) {
        super.b(n2);
        return this;
    }

    public s o(int n2) {
        super.c(n2);
        return this;
    }

    public s b(h h2) {
        super.a(h2);
        return this;
    }

    public s b(df df2) {
        super.a(df2);
        return this;
    }

    public s h(boolean bl2) {
        super.a(bl2);
        return this;
    }

    public s i(boolean bl2) {
        super.b(bl2);
        return this;
    }

    public s p(int n2) {
        super.d(n2);
        return this;
    }

    public s q(int n2) {
        super.e(n2);
        return this;
    }

    public s b(cy cy2) {
        super.a(cy2);
        return this;
    }

    @Override
    protected void l() {
        this.b.L();
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.q(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.p(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.i(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.h(bl2);
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
        return this.o(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.n(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ l c(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ l j(boolean bl2) {
        return this.i(bl2);
    }

    @Override
    public /* synthetic */ l k(boolean bl2) {
        return this.h(bl2);
    }

    @Override
    public /* synthetic */ l c(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ l c(h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ l r(int n2) {
        return this.o(n2);
    }

    @Override
    public /* synthetic */ l s(int n2) {
        return this.n(n2);
    }

    @Override
    public /* synthetic */ l t(int n2) {
        return this.m(n2);
    }

    @Override
    public /* synthetic */ l l(boolean bl2) {
        return this.g(bl2);
    }

    @Override
    public /* synthetic */ l b(int n2, int n3, int n4) {
        return this.a(n2, n3, n4);
    }

    @Override
    public /* synthetic */ l m(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ l u(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ l n(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ l v(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ l w(int n2) {
        return this.g(n2);
    }

    @Override
    public /* synthetic */ l x(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ l o(boolean bl2) {
        return this.e(bl2);
    }
}

