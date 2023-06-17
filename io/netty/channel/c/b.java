/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.a;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.br;
import io.netty.channel.bw;
import io.netty.channel.c.c;
import io.netty.channel.c.d;
import io.netty.channel.c.e;
import io.netty.channel.c.f;
import io.netty.channel.c.g;
import io.netty.channel.c.h;
import io.netty.channel.c.i;
import io.netty.channel.c.l;
import io.netty.channel.cd;
import io.netty.channel.cr;
import io.netty.channel.dj;
import io.netty.util.b.az;
import io.netty.util.x;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.ArrayDeque;
import java.util.Queue;

public class b
extends a {
    private static final bh c = new bh(false);
    private static final int d = 8;
    private final ap e = new cd(this);
    private final Queue f = new ArrayDeque();
    private final Runnable g = new c(this);
    private final Runnable h = new d(this);
    private volatile int i;
    private volatile b j;
    private volatile io.netty.channel.c.a k;
    private volatile io.netty.channel.c.a l;
    private volatile bw m;
    private volatile boolean n;
    private volatile boolean o;

    public b() {
        super(null);
    }

    b(l l2, b b2) {
        super(l2);
        this.j = b2;
        this.k = l2.J();
        this.l = b2.K();
    }

    @Override
    public bh F() {
        return c;
    }

    @Override
    public ap G() {
        return this.e;
    }

    public l J() {
        return (l)super.b();
    }

    public io.netty.channel.c.a K() {
        return (io.netty.channel.c.a)super.f();
    }

    public io.netty.channel.c.a L() {
        return (io.netty.channel.c.a)super.h();
    }

    @Override
    public boolean H() {
        return this.i < 3;
    }

    @Override
    public boolean I() {
        return this.i == 2;
    }

    @Override
    protected io.netty.channel.b bv_() {
        return new h(this, null);
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof dj;
    }

    @Override
    protected SocketAddress x() {
        return this.k;
    }

    @Override
    protected SocketAddress y() {
        return this.l;
    }

    @Override
    protected void bw_() {
        if (this.j != null && this.J() != null) {
            b b2 = this.j;
            this.o = true;
            this.i = 2;
            b2.l = this.J().J();
            b2.i = 2;
            b2.e().execute(new e(this, b2));
        }
        ((az)((Object)this.e())).e(this.h);
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.k = io.netty.channel.c.i.a(this, this.k, socketAddress);
        this.i = 1;
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void B() {
        b b2;
        if (this.i <= 2) {
            if (this.k != null) {
                if (this.J() == null) {
                    io.netty.channel.c.i.a(this.k);
                }
                this.k = null;
            }
            this.i = 3;
        }
        if ((b2 = this.j) != null && b2.I()) {
            cr cr2 = b2.e();
            if (cr2.bt_() && !this.o) {
                b2.t().b(this.t().h());
            } else {
                b2.e().execute(new f(this, b2));
            }
            this.j = null;
        }
    }

    @Override
    protected void bx_() {
        ((az)((Object)this.e())).f(this.h);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void by_() {
        if (this.n) {
            return;
        }
        br br2 = this.c();
        Queue queue = this.f;
        if (queue.isEmpty()) {
            this.n = true;
            return;
        }
        io.netty.util.c.f f2 = io.netty.util.c.f.b();
        Integer n2 = f2.q();
        if (n2 < 8) {
            f2.b(n2 + 1);
            try {
                Object e2;
                while ((e2 = queue.poll()) != null) {
                    br2.b(e2);
                }
                br2.n();
            }
            finally {
                f2.b(n2);
            }
        } else {
            this.e().execute(this.g);
        }
    }

    @Override
    protected void a(bj bj2) {
        if (this.i < 2) {
            throw new NotYetConnectedException();
        }
        if (this.i > 2) {
            throw new ClosedChannelException();
        }
        b b2 = this.j;
        br br2 = b2.c();
        cr cr2 = b2.e();
        if (cr2 == this.e()) {
            Object object;
            while ((object = bj2.b()) != null) {
                b2.f.add(object);
                x.a(object);
                bj2.c();
            }
            b.b(b2, br2);
        } else {
            Object[] arrobject = new Object[bj2.h()];
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                arrobject[i2] = x.a(bj2.b());
                bj2.c();
            }
            cr2.execute(new g(this, b2, arrobject, br2));
        }
    }

    private static void b(b b2, br br2) {
        if (b2.n) {
            Object e2;
            b2.n = false;
            while ((e2 = b2.f.poll()) != null) {
                br2.b(e2);
            }
            br2.n();
        }
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.L();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.K();
    }

    @Override
    public /* synthetic */ an b() {
        return this.J();
    }

    static /* synthetic */ Queue a(b b2) {
        return b2.f;
    }

    static /* synthetic */ boolean a(b b2, boolean bl2) {
        b2.o = bl2;
        return b2.o;
    }

    static /* synthetic */ bw b(b b2) {
        return b2.m;
    }

    static /* synthetic */ void a(b b2, br br2) {
        b.b(b2, br2);
    }

    static /* synthetic */ int c(b b2) {
        return b2.i;
    }

    static /* synthetic */ bw a(b b2, bw bw2) {
        b2.m = bw2;
        return b2.m;
    }

    static /* synthetic */ b a(b b2, b b3) {
        b2.j = b3;
        return b2.j;
    }
}

