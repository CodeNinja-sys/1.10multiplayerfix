/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.nio.ChannelUDT
 */
package io.netty.channel.i;

import com.barchart.udt.nio.ChannelUDT;
import io.netty.channel.ap;
import io.netty.channel.bi;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.i.a;
import io.netty.channel.i.c;
import io.netty.channel.i.d;
import io.netty.channel.i.h;
import java.util.Map;

public class b
extends a
implements h {
    private volatile int b = 64;

    public b(c c2, ChannelUDT channelUDT, boolean bl2) {
        super(c2, channelUDT, bl2);
        if (bl2) {
            this.a(channelUDT);
        }
    }

    @Override
    protected void a(ChannelUDT channelUDT) {
    }

    @Override
    public int u() {
        return this.b;
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.r) {
            return this.u();
        }
        return super.a(bi2);
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.r);
    }

    @Override
    public h r(int n2) {
        this.b = n2;
        return this;
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 != bi.r) {
            return super.a(bi2, object);
        }
        this.r((Integer)object);
        return true;
    }

    @Override
    public h s(int n2) {
        super.f(n2);
        return this;
    }

    @Override
    public h t(int n2) {
        super.k(n2);
        return this;
    }

    @Override
    public h u(int n2) {
        super.g(n2);
        return this;
    }

    @Override
    public h f(boolean bl2) {
        super.c(bl2);
        return this;
    }

    @Override
    public h v(int n2) {
        super.h(n2);
        return this;
    }

    @Override
    public h w(int n2) {
        super.i(n2);
        return this;
    }

    @Override
    public h x(int n2) {
        super.l(n2);
        return this;
    }

    @Override
    public h y(int n2) {
        super.j(n2);
        return this;
    }

    @Override
    public h z(int n2) {
        super.m(n2);
        return this;
    }

    @Override
    public h A(int n2) {
        super.n(n2);
        return this;
    }

    @Override
    public h B(int n2) {
        super.o(n2);
        return this;
    }

    @Override
    public h c(io.netty.b.h h2) {
        super.b(h2);
        return this;
    }

    @Override
    public h c(df df2) {
        super.b(df2);
        return this;
    }

    @Override
    public h g(boolean bl2) {
        super.d(bl2);
        return this;
    }

    @Override
    public h h(boolean bl2) {
        super.e(bl2);
        return this;
    }

    @Override
    public h C(int n2) {
        super.p(n2);
        return this;
    }

    @Override
    public h D(int n2) {
        super.q(n2);
        return this;
    }

    @Override
    public h c(cy cy2) {
        super.b(cy2);
        return this;
    }

    @Override
    public /* synthetic */ d b(cy cy2) {
        return this.c(cy2);
    }

    @Override
    public /* synthetic */ d q(int n2) {
        return this.D(n2);
    }

    @Override
    public /* synthetic */ d p(int n2) {
        return this.C(n2);
    }

    @Override
    public /* synthetic */ d e(boolean bl2) {
        return this.h(bl2);
    }

    @Override
    public /* synthetic */ d d(boolean bl2) {
        return this.g(bl2);
    }

    @Override
    public /* synthetic */ d b(df df2) {
        return this.c(df2);
    }

    @Override
    public /* synthetic */ d b(io.netty.b.h h2) {
        return this.c(h2);
    }

    @Override
    public /* synthetic */ d o(int n2) {
        return this.B(n2);
    }

    @Override
    public /* synthetic */ d n(int n2) {
        return this.A(n2);
    }

    @Override
    public /* synthetic */ d m(int n2) {
        return this.z(n2);
    }

    @Override
    public /* synthetic */ d l(int n2) {
        return this.x(n2);
    }

    @Override
    public /* synthetic */ d k(int n2) {
        return this.t(n2);
    }

    @Override
    public /* synthetic */ d j(int n2) {
        return this.y(n2);
    }

    @Override
    public /* synthetic */ d i(int n2) {
        return this.w(n2);
    }

    @Override
    public /* synthetic */ d h(int n2) {
        return this.v(n2);
    }

    @Override
    public /* synthetic */ d c(boolean bl2) {
        return this.f(bl2);
    }

    @Override
    public /* synthetic */ d g(int n2) {
        return this.u(n2);
    }

    @Override
    public /* synthetic */ d f(int n2) {
        return this.s(n2);
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.c(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.C(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.D(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.h(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.g(bl2);
    }

    @Override
    public /* synthetic */ ap a(df df2) {
        return this.c(df2);
    }

    @Override
    public /* synthetic */ ap a(io.netty.b.h h2) {
        return this.c(h2);
    }

    @Override
    public /* synthetic */ ap c(int n2) {
        return this.B(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.A(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.z(n2);
    }
}

