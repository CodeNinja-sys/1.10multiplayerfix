/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.ap;
import io.netty.channel.b;
import io.netty.channel.bj;
import io.netty.channel.cr;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.a;
import io.netty.channel.epoll.c;
import io.netty.channel.epoll.h;
import io.netty.channel.epoll.k;
import io.netty.channel.epoll.l;
import io.netty.channel.h.i;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public final class j
extends a
implements i {
    private final l g = new l(this);
    private volatile InetSocketAddress h;

    public j() {
        super(Native.a(), 4);
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof h;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
        j.a(inetSocketAddress);
        Native.a(this.e, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        this.h = Native.localAddress(this.e);
        Native.listen(this.e, this.g.o());
        this.d = true;
    }

    public l P() {
        return this.g;
    }

    protected InetSocketAddress Q() {
        return this.h;
    }

    protected InetSocketAddress R() {
        return null;
    }

    @Override
    protected c O() {
        return new k(this);
    }

    @Override
    protected void a(bj bj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Object c(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ SocketAddress y() {
        return this.R();
    }

    @Override
    protected /* synthetic */ SocketAddress x() {
        return this.Q();
    }

    @Override
    protected /* synthetic */ b bv_() {
        return this.O();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.P();
    }

    @Override
    public /* synthetic */ io.netty.channel.h.j S() {
        return this.P();
    }

    static /* synthetic */ l a(j j2) {
        return j2.g;
    }
}

