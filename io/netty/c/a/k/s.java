/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.d;
import io.netty.c.a.k.a;
import io.netty.c.a.k.aa;
import io.netty.c.a.k.ab;
import io.netty.c.a.k.am;
import io.netty.c.a.k.aw;
import io.netty.c.a.k.ax;
import io.netty.c.a.k.ay;
import io.netty.c.a.k.b;
import io.netty.c.a.k.bk;
import io.netty.c.a.k.bn;
import io.netty.c.a.k.bo;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.bq;
import io.netty.c.a.k.g;
import io.netty.c.a.k.h;
import io.netty.c.a.k.i;
import io.netty.c.a.k.j;
import io.netty.c.a.k.m;
import io.netty.c.a.k.n;
import io.netty.c.a.k.o;
import io.netty.c.a.k.q;
import io.netty.c.a.k.t;
import io.netty.c.a.k.u;
import io.netty.c.a.k.x;
import io.netty.c.a.k.y;
import io.netty.c.a.k.z;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import java.net.SocketAddress;
import java.util.List;

public class s
extends d
implements x,
io.netty.channel.bp {
    private static final ax a = new ax("Received invalid frame");
    private final u c;
    private final y d;
    private final aa e;
    private final ab f;
    private am h;
    private bk i;
    private bd j;

    public s(bp bp2) {
        this(bp2, 8192, 16384, 6, 15, 8);
    }

    public s(bp bp2, int n2, int n3, int n4, int n5, int n6) {
        this(bp2, n2, aa.a(bp2, n3), ab.a(bp2, n4, n5, n6));
    }

    protected s(bp bp2, int n2, aa aa2, ab ab2) {
        this.c = new u(bp2, this, n2);
        this.d = new y(bp2);
        this.e = aa2;
        this.f = ab2;
    }

    @Override
    public void e(bd bd2) {
        super.e(bd2);
        this.j = bd2;
        bd2.b().s().a((ad)new t(this));
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        this.c.a(g2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, bw bw2) {
        bd2.a(socketAddress, bw2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        bd2.a(socketAddress, socketAddress2, bw2);
    }

    @Override
    public void a(bd bd2, bw bw2) {
        bd2.a(bw2);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        bd2.b(bw2);
    }

    @Override
    public void c(bd bd2, bw bw2) {
        bd2.c(bw2);
    }

    @Override
    public void c(bd bd2) {
        bd2.p();
    }

    @Override
    public void d(bd bd2) {
        bd2.q();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(bd bd2, Object object, bw bw2) {
        if (object instanceof q) {
            q q2 = (q)object;
            io.netty.b.g g2 = this.d.a(bd2.d(), q2.h(), q2.i(), q2.a());
            q2.ad();
            bd2.a(g2, bw2);
        } else if (object instanceof bo) {
            io.netty.b.g g3;
            bo bo2 = (bo)object;
            io.netty.b.g g4 = this.f.a(bo2);
            try {
                g3 = this.d.a(bd2.d(), bo2.h(), bo2.g(), bo2.j(), bo2.i(), bo2.k(), g4);
            }
            finally {
                g4.ad();
            }
            bd2.a(g3, bw2);
        } else if (object instanceof bn) {
            io.netty.b.g g5;
            bn bn2 = (bn)object;
            io.netty.b.g g6 = this.f.a(bn2);
            try {
                g5 = this.d.b(bd2.d(), bn2.h(), bn2.i(), g6);
            }
            finally {
                g6.ad();
            }
            bd2.a(g5, bw2);
        } else if (object instanceof ay) {
            ay ay2 = (ay)object;
            io.netty.b.g g7 = this.d.a(bd2.d(), ay2.h(), ay2.a().a());
            bd2.a(g7, bw2);
        } else if (object instanceof bk) {
            bk bk2 = (bk)object;
            io.netty.b.g g8 = this.d.a(bd2.d(), bk2);
            bd2.a(g8, bw2);
        } else if (object instanceof aw) {
            aw aw2 = (aw)object;
            io.netty.b.g g9 = this.d.a(bd2.d(), aw2.a());
            bd2.a(g9, bw2);
        } else if (object instanceof z) {
            z z2 = (z)object;
            io.netty.b.g g10 = this.d.b(bd2.d(), z2.a(), z2.b().a());
            bd2.a(g10, bw2);
        } else if (object instanceof am) {
            io.netty.b.g g11;
            am am2 = (am)object;
            io.netty.b.g g12 = this.f.a(am2);
            try {
                g11 = this.d.c(bd2.d(), am2.h(), am2.i(), g12);
            }
            finally {
                g12.ad();
            }
            bd2.a(g11, bw2);
        } else if (object instanceof bq) {
            bq bq2 = (bq)object;
            io.netty.b.g g13 = this.d.c(bd2.d(), bq2.a(), bq2.b());
            bd2.a(g13, bw2);
        } else {
            throw new io.netty.c.a.z(object, new Class[0]);
        }
    }

    @Override
    public void a(int n2, boolean bl2, io.netty.b.g g2) {
        a a2 = new a(n2, g2);
        a2.a(bl2);
        this.j.b(a2);
    }

    @Override
    public void a(int n2, int n3, byte by2, boolean bl2, boolean bl3) {
        n n4 = new n(n2, n3, by2);
        n4.c(bl2);
        n4.d(bl3);
        this.h = n4;
    }

    @Override
    public void a(int n2, boolean bl2) {
        m m2 = new m(n2);
        m2.c(bl2);
        this.h = m2;
    }

    @Override
    public void a(int n2, int n3) {
        i i2 = new i(n2, n3);
        this.j.b(i2);
    }

    @Override
    public void b(boolean bl2) {
        this.i = new j();
        this.i.a(bl2);
    }

    @Override
    public void a(int n2, int n3, boolean bl2, boolean bl3) {
        this.i.a(n2, n3, bl2, bl3);
    }

    @Override
    public void d() {
        bk bk2 = this.i;
        this.i = null;
        this.j.b(bk2);
    }

    @Override
    public void a(int n2) {
        h h2 = new h(n2);
        this.j.b(h2);
    }

    @Override
    public void b(int n2, int n3) {
        b b2 = new b(n2, n3);
        this.j.b(b2);
    }

    @Override
    public void b(int n2, boolean bl2) {
        this.h = new g(n2);
        this.h.a(bl2);
    }

    @Override
    public void c(int n2, int n3) {
        o o2 = new o(n2, n3);
        this.j.b(o2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(io.netty.b.g g2) {
        try {
            this.e.a(g2, this.h);
        }
        catch (Exception exception) {
            this.j.a(exception);
        }
        finally {
            g2.ad();
        }
    }

    @Override
    public void e() {
        am am2 = null;
        try {
            this.e.a(this.h);
            am2 = this.h;
            this.h = null;
        }
        catch (Exception exception) {
            this.j.a(exception);
        }
        if (am2 != null) {
            this.j.b(am2);
        }
    }

    @Override
    public void a(String string) {
        this.j.a(a);
    }

    static /* synthetic */ aa a(s s2) {
        return s2.e;
    }

    static /* synthetic */ ab b(s s2) {
        return s2.f;
    }
}

