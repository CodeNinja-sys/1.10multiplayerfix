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
import io.netty.channel.epoll.j;
import io.netty.util.o;
import java.util.Map;

public final class l
extends cd
implements io.netty.channel.h.j {
    private final j b;
    private volatile int c = o.e;

    l(j j2) {
        super(j2);
        this.b = j2;
        this.c(true);
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.o, bi.p, bi.r, e.G);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.o) {
            return this.n();
        }
        if (bi2 == bi.p) {
            return this.m();
        }
        if (bi2 == bi.r) {
            return this.o();
        }
        if (bi2 == e.G) {
            return this.p();
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.o) {
            this.f((Integer)object);
        } else if (bi2 == bi.p) {
            this.c((Boolean)object);
        } else if (bi2 == bi.r) {
            this.g((Integer)object);
        } else if (bi2 == e.G) {
            this.e((Boolean)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    @Override
    public boolean m() {
        return Native.isReuseAddress(this.b.e) == 1;
    }

    public l c(boolean bl2) {
        Native.setReuseAddress(this.b.e, bl2 ? 1 : 0);
        return this;
    }

    @Override
    public int n() {
        return Native.getReceiveBufferSize(this.b.e);
    }

    public l f(int n2) {
        Native.setReceiveBufferSize(this.b.e, n2);
        return this;
    }

    public l a(int n2, int n3, int n4) {
        return this;
    }

    @Override
    public int o() {
        return this.c;
    }

    public l g(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("backlog: " + n2);
        }
        this.c = n2;
        return this;
    }

    public l h(int n2) {
        super.a(n2);
        return this;
    }

    public l i(int n2) {
        super.b(n2);
        return this;
    }

    public l j(int n2) {
        super.c(n2);
        return this;
    }

    public l b(h h2) {
        super.a(h2);
        return this;
    }

    public l b(df df2) {
        super.a(df2);
        return this;
    }

    public l d(boolean bl2) {
        super.a(bl2);
        return this;
    }

    public l k(int n2) {
        super.d(n2);
        return this;
    }

    public l l(int n2) {
        super.e(n2);
        return this;
    }

    public l b(cy cy2) {
        super.a(cy2);
        return this;
    }

    public boolean p() {
        return Native.isReusePort(this.b.e) == 1;
    }

    public l e(boolean bl2) {
        Native.setReusePort(this.b.e, bl2 ? 1 : 0);
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
        return this.l(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.k(n2);
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
        return this.j(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j c(cy cy2) {
        return this.b(cy2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j f(boolean bl2) {
        return this.d(bl2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j c(df df2) {
        return this.b(df2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j c(h h2) {
        return this.b(h2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j m(int n2) {
        return this.j(n2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j n(int n2) {
        return this.i(n2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j o(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j b(int n2, int n3, int n4) {
        return this.a(n2, n3, n4);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j p(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j g(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j q(int n2) {
        return this.g(n2);
    }
}

