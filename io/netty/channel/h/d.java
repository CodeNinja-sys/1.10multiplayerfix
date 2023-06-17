/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.channel.am;
import io.netty.channel.cc;
import io.netty.util.z;
import java.net.InetSocketAddress;

public final class d
extends cc
implements i {
    public d(g g2, InetSocketAddress inetSocketAddress) {
        super(g2, inetSocketAddress);
    }

    public d(g g2, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        super(g2, inetSocketAddress, inetSocketAddress2);
    }

    public d i() {
        return new d(((g)this.e()).Q(), (InetSocketAddress)this.g(), (InetSocketAddress)this.f());
    }

    public d j() {
        return new d(((g)this.e()).S(), (InetSocketAddress)this.g(), (InetSocketAddress)this.f());
    }

    public d k() {
        super.h();
        return this;
    }

    public d c(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public /* synthetic */ am b(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ am h() {
        return this.k();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.k();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.k();
    }

    @Override
    public /* synthetic */ i c() {
        return this.j();
    }

    @Override
    public /* synthetic */ i b() {
        return this.i();
    }

    @Override
    public /* synthetic */ g a() {
        return (g)super.e();
    }
}

