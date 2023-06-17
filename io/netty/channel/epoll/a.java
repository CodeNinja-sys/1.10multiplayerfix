/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.w;
import io.netty.channel.an;
import io.netty.channel.b;
import io.netty.channel.bh;
import io.netty.channel.cr;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.c;
import io.netty.channel.epoll.h;
import io.netty.util.x;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.UnresolvedAddressException;

abstract class a
extends io.netty.channel.a {
    private static final bh g = new bh(false);
    private final int h;
    protected int c;
    protected volatile boolean d;
    volatile int e;
    int f;

    a(int n2, int n3) {
        this(null, n2, n3, false);
    }

    a(an an2, int n2, int n3, boolean bl2) {
        super(an2);
        this.e = n2;
        this.h = n3;
        this.c |= n3;
        this.d = bl2;
    }

    @Override
    public boolean I() {
        return this.d;
    }

    @Override
    public bh F() {
        return g;
    }

    @Override
    protected void B() {
        this.d = false;
        this.bx_();
        int n2 = this.e;
        this.e = -1;
        Native.close(n2);
    }

    public InetSocketAddress J() {
        return (InetSocketAddress)super.h();
    }

    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof h;
    }

    @Override
    public boolean H() {
        return this.e != -1;
    }

    @Override
    protected void bx_() {
        ((h)this.e()).c(this);
    }

    @Override
    protected void by_() {
        ((c)this.t()).b = true;
        if ((this.c & this.h) == 0) {
            this.c |= this.h;
            this.P();
        }
    }

    final void L() {
        if (this.j()) {
            cr cr2 = this.e();
            c c2 = (c)this.t();
            if (cr2.bt_()) {
                c2.m();
            } else {
                cr2.execute(new io.netty.channel.epoll.b(this, c2));
            }
        } else {
            this.c &= ~this.h;
        }
    }

    protected final void M() {
        if ((this.c & 2) == 0) {
            this.c |= 2;
            this.P();
        }
    }

    protected final void N() {
        if ((this.c & 2) != 0) {
            this.c &= 0xFFFFFFFD;
            this.P();
        }
    }

    private void P() {
        if (this.H()) {
            ((h)this.e()).b(this);
        }
    }

    @Override
    protected void bw_() {
        h h2 = (h)this.e();
        h2.a(this);
    }

    protected abstract c O();

    protected final g a(g g2) {
        return this.a((Object)g2, g2);
    }

    protected final g a(Object object, g g2) {
        int n2 = g2.r();
        if (n2 == 0) {
            x.c(object);
            return bi.c;
        }
        io.netty.b.h h2 = this.d();
        if (h2.h()) {
            return a.a(object, g2, h2, n2);
        }
        g g3 = w.a();
        if (g3 == null) {
            return a.a(object, g2, h2, n2);
        }
        g3.b(g2, g2.p(), n2);
        x.c(object);
        return g3;
    }

    private static g a(Object object, g g2, io.netty.b.h h2, int n2) {
        g g3 = h2.d(n2);
        g3.b(g2, g2.p(), n2);
        x.c(object);
        return g3;
    }

    protected static void a(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.isUnresolved()) {
            throw new UnresolvedAddressException();
        }
    }

    @Override
    protected /* synthetic */ b bv_() {
        return this.O();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.K();
    }

    static /* synthetic */ int a(a a2) {
        return a2.h;
    }

    static /* synthetic */ void b(a a2) {
        a2.P();
    }
}

