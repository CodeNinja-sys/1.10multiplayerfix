/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.a;
import io.netty.c.a.k.am;
import io.netty.c.a.k.aw;
import io.netty.c.a.k.ax;
import io.netty.c.a.k.ay;
import io.netty.c.a.k.az;
import io.netty.c.a.k.b;
import io.netty.c.a.k.ba;
import io.netty.c.a.k.be;
import io.netty.c.a.k.bf;
import io.netty.c.a.k.bg;
import io.netty.c.a.k.bh;
import io.netty.c.a.k.bi;
import io.netty.c.a.k.bj;
import io.netty.c.a.k.bk;
import io.netty.c.a.k.bm;
import io.netty.c.a.k.bn;
import io.netty.c.a.k.bo;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.bq;
import io.netty.c.a.k.i;
import io.netty.c.a.k.o;
import io.netty.c.a.k.p;
import io.netty.c.a.k.q;
import io.netty.c.a.k.r;
import io.netty.c.a.k.z;
import io.netty.channel.aq;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.c.d;
import java.util.concurrent.atomic.AtomicInteger;

public class bd
extends aq {
    private static final ax a = new ax();
    private static final ax b = new ax("Stream closed");
    private static final int c = 65536;
    private int d = 65536;
    private int e = 65536;
    private volatile int f = 65536;
    private final az h = new az(this.d, this.e);
    private int i;
    private static final int j = Integer.MAX_VALUE;
    private int k = Integer.MAX_VALUE;
    private int l = Integer.MAX_VALUE;
    private final AtomicInteger m = new AtomicInteger();
    private boolean n;
    private boolean o;
    private io.netty.channel.aw p;
    private final boolean q;
    private final int r;

    public bd(bp bp2, boolean bl2) {
        if (bp2 == null) {
            throw new NullPointerException("version");
        }
        this.q = bl2;
        this.r = bp2.b();
    }

    public void a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("sessionReceiveWindowSize");
        }
        this.f = n2;
    }

    @Override
    public void a_(io.netty.channel.bd bd2, Object object) {
        if (object instanceof q) {
            r r2;
            int n2;
            q q2 = (q)object;
            int n3 = q2.h();
            int n4 = -1 * q2.a().r();
            int n5 = this.h.b(0, n4);
            if (n5 < 0) {
                this.a(bd2, bj.b);
                return;
            }
            if (n5 <= this.f / 2) {
                n2 = this.f - n5;
                this.h.b(0, n2);
                r2 = new o(0, n2);
                bd2.d(r2);
            }
            if (!this.h.a(n3)) {
                q2.ad();
                if (n3 <= this.i) {
                    this.a(bd2, n3, bm.a);
                } else if (!this.n) {
                    this.a(bd2, n3, bm.b);
                }
                return;
            }
            if (this.h.b(n3)) {
                q2.ad();
                this.a(bd2, n3, bm.i);
                return;
            }
            if (!this.b(n3) && !this.h.d(n3)) {
                q2.ad();
                this.a(bd2, n3, bm.a);
                return;
            }
            n2 = this.h.b(n3, n4);
            if (n2 < this.h.g(n3)) {
                q2.ad();
                this.a(bd2, n3, bm.g);
                return;
            }
            if (n2 < 0) {
                while (q2.a().r() > this.e) {
                    r2 = new a(n3, q2.a().z(this.e).ab());
                    bd2.d(r2);
                }
            }
            if (n2 <= this.e / 2 && !q2.i()) {
                int n6 = this.e - n2;
                this.h.b(n3, n6);
                o o2 = new o(n3, n6);
                bd2.d(o2);
            }
            if (q2.i()) {
                this.a(n3, true, bd2.t());
            }
        } else if (object instanceof bo) {
            boolean bl2;
            boolean bl3;
            bo bo2 = (bo)object;
            int n7 = bo2.h();
            if (bo2.a() || !this.b(n7) || this.h.a(n7)) {
                this.a(bd2, n7, bm.a);
                return;
            }
            if (n7 <= this.i) {
                this.a(bd2, bj.b);
                return;
            }
            byte by2 = bo2.j();
            if (!this.a(n7, by2, bl3 = bo2.i(), bl2 = bo2.k())) {
                this.a(bd2, n7, bm.c);
                return;
            }
        } else if (object instanceof bn) {
            bn bn2 = (bn)object;
            int n8 = bn2.h();
            if (bn2.a() || this.b(n8) || this.h.b(n8)) {
                this.a(bd2, n8, bm.b);
                return;
            }
            if (this.h.d(n8)) {
                this.a(bd2, n8, bm.h);
                return;
            }
            this.h.e(n8);
            if (bn2.i()) {
                this.a(n8, true, bd2.t());
            }
        } else if (object instanceof ay) {
            ay ay2 = (ay)object;
            this.a(ay2.h(), bd2.t());
        } else if (object instanceof bk) {
            bk bk2 = (bk)object;
            int n9 = bk2.b(0);
            if (n9 >= 0 && n9 != this.r) {
                this.a(bd2, bj.b);
                return;
            }
            int n10 = bk2.b(4);
            if (n10 >= 0) {
                this.k = n10;
            }
            if (bk2.e(7)) {
                bk2.c(7);
            }
            bk2.a(7, false);
            int n11 = bk2.b(7);
            if (n11 >= 0) {
                this.c(n11);
            }
        } else if (object instanceof aw) {
            aw aw2 = (aw)object;
            if (this.b(aw2.a())) {
                bd2.d(aw2);
                return;
            }
            if (this.m.get() == 0) {
                return;
            }
            this.m.getAndDecrement();
        } else if (object instanceof z) {
            this.o = true;
        } else if (object instanceof am) {
            am am2 = (am)object;
            int n12 = am2.h();
            if (am2.a()) {
                this.a(bd2, n12, bm.a);
                return;
            }
            if (this.h.b(n12)) {
                this.a(bd2, n12, bm.b);
                return;
            }
            if (am2.i()) {
                this.a(n12, true, bd2.t());
            }
        } else if (object instanceof bq) {
            bq bq2 = (bq)object;
            int n13 = bq2.a();
            int n14 = bq2.b();
            if (n13 != 0 && this.h.c(n13)) {
                return;
            }
            if (this.h.f(n13) > Integer.MAX_VALUE - n14) {
                if (n13 == 0) {
                    this.a(bd2, bj.b);
                } else {
                    this.a(bd2, n13, bm.g);
                }
                return;
            }
            this.a(bd2, n13, n14);
        }
        bd2.b(object);
    }

    @Override
    public void b(io.netty.channel.bd bd2) {
        for (Integer n2 : this.h.b().keySet()) {
            this.a(n2, bd2.t());
        }
        bd2.j();
    }

    @Override
    public void a(io.netty.channel.bd bd2, Throwable throwable) {
        if (throwable instanceof ax) {
            this.a(bd2, bj.b);
        }
        bd2.a(throwable);
    }

    @Override
    public void b(io.netty.channel.bd bd2, bw bw2) {
        this.d(bd2, bw2);
    }

    @Override
    public void a(io.netty.channel.bd bd2, Object object, bw bw2) {
        if (object instanceof q || object instanceof bo || object instanceof bn || object instanceof ay || object instanceof bk || object instanceof aw || object instanceof z || object instanceof am || object instanceof bq) {
            this.b(bd2, object, bw2);
        } else {
            bd2.a(object, bw2);
        }
    }

    private void b(io.netty.channel.bd bd2, Object object, bw bw2) {
        if (object instanceof q) {
            q q2 = (q)object;
            int n2 = q2.h();
            if (this.h.c(n2)) {
                q2.ad();
                bw2.a(a);
                return;
            }
            int n3 = q2.a().r();
            int n4 = this.h.f(n2);
            int n5 = this.h.f(0);
            if ((n4 = Math.min(n4, n5)) <= 0) {
                this.h.a(n2, new ba(q2, bw2));
                return;
            }
            if (n4 < n3) {
                this.h.a(n2, -1 * n4);
                this.h.a(0, -1 * n4);
                a a2 = new a(n2, q2.a().z(n4).ab());
                this.h.a(n2, new ba(q2, bw2));
                io.netty.channel.bd bd3 = bd2;
                bd2.c(a2).a((ad)new be(this, bd3));
                return;
            }
            this.h.a(n2, -1 * n3);
            this.h.a(0, -1 * n3);
            io.netty.channel.bd bd4 = bd2;
            bw2.g((ad)new bf(this, bd4));
            if (q2.i()) {
                this.a(n2, false, (av)bw2);
            }
        } else if (object instanceof bo) {
            boolean bl2;
            boolean bl3;
            bo bo2 = (bo)object;
            int n6 = bo2.h();
            if (this.b(n6)) {
                bw2.a(a);
                return;
            }
            byte by2 = bo2.j();
            if (!this.a(n6, by2, bl3 = bo2.k(), bl2 = bo2.i())) {
                bw2.a(a);
                return;
            }
        } else if (object instanceof bn) {
            bn bn2 = (bn)object;
            int n7 = bn2.h();
            if (!this.b(n7) || this.h.c(n7)) {
                bw2.a(a);
                return;
            }
            if (bn2.i()) {
                this.a(n7, false, (av)bw2);
            }
        } else if (object instanceof ay) {
            ay ay2 = (ay)object;
            this.a(ay2.h(), (av)bw2);
        } else if (object instanceof bk) {
            bk bk2 = (bk)object;
            int n8 = bk2.b(0);
            if (n8 >= 0 && n8 != this.r) {
                bw2.a(a);
                return;
            }
            int n9 = bk2.b(4);
            if (n9 >= 0) {
                this.l = n9;
            }
            if (bk2.e(7)) {
                bk2.c(7);
            }
            bk2.a(7, false);
            int n10 = bk2.b(7);
            if (n10 >= 0) {
                this.d(n10);
            }
        } else if (object instanceof aw) {
            aw aw2 = (aw)object;
            if (this.b(aw2.a())) {
                bd2.a(new IllegalArgumentException("invalid PING ID: " + aw2.a()));
                return;
            }
            this.m.getAndIncrement();
        } else {
            if (object instanceof z) {
                bw2.a(a);
                return;
            }
            if (object instanceof am) {
                am am2 = (am)object;
                int n11 = am2.h();
                if (this.h.c(n11)) {
                    bw2.a(a);
                    return;
                }
                if (am2.i()) {
                    this.a(n11, false, (av)bw2);
                }
            } else if (object instanceof bq) {
                bw2.a(a);
                return;
            }
        }
        bd2.a(object, bw2);
    }

    private void a(io.netty.channel.bd bd2, bj bj2) {
        this.b(bd2, bj2).a((ad)new bi(bd2, bd2.r()));
    }

    private void a(io.netty.channel.bd bd2, int n2, bm bm2) {
        boolean bl2 = !this.h.b(n2);
        bw bw2 = bd2.r();
        this.a(n2, (av)bw2);
        i i2 = new i(n2, bm2);
        bd2.b(i2, bw2);
        if (bl2) {
            bd2.b(i2);
        }
    }

    private boolean b(int n2) {
        boolean bl2 = io.netty.c.a.k.p.a(n2);
        return this.q && !bl2 || !this.q && bl2;
    }

    private synchronized void c(int n2) {
        int n3 = n2 - this.d;
        this.d = n2;
        this.h.h(n3);
    }

    private synchronized void d(int n2) {
        int n3 = n2 - this.e;
        this.e = n2;
        this.h.i(n3);
    }

    private synchronized boolean a(int n2, byte by2, boolean bl2, boolean bl3) {
        int n3;
        if (this.o || this.n) {
            return false;
        }
        boolean bl4 = this.b(n2);
        int n4 = n3 = bl4 ? this.l : this.k;
        if (this.h.a(bl4) >= n3) {
            return false;
        }
        this.h.a(n2, by2, bl2, bl3, this.d, this.e, bl4);
        if (bl4) {
            this.i = n2;
        }
        return true;
    }

    private void a(int n2, boolean bl2, av av2) {
        if (bl2) {
            this.h.a(n2, this.b(n2));
        } else {
            this.h.b(n2, this.b(n2));
        }
        if (this.p != null && this.h.a()) {
            av2.a((ad)this.p);
        }
    }

    private void a(int n2, av av2) {
        this.h.a(n2, b, this.b(n2));
        if (this.p != null && this.h.a()) {
            av2.a((ad)this.p);
        }
    }

    private void a(io.netty.channel.bd bd2, int n2, int n3) {
        this.h.a(n2, n3);
        ba ba2;
        while ((ba2 = this.h.j(n2)) != null) {
            q q2 = ba2.a;
            int n4 = q2.a().r();
            int n5 = q2.h();
            int n6 = this.h.f(n5);
            int n7 = this.h.f(0);
            if ((n6 = Math.min(n6, n7)) <= 0) {
                return;
            }
            if (n6 < n4) {
                this.h.a(n5, -1 * n6);
                this.h.a(0, -1 * n6);
                a a2 = new a(n5, q2.a().z(n6).ab());
                bd2.d(a2).a((ad)new bg(this, bd2));
                continue;
            }
            this.h.k(n5);
            this.h.a(n5, -1 * n4);
            this.h.a(0, -1 * n4);
            if (q2.i()) {
                this.a(n5, false, (av)ba2.b);
            }
            bd2.b(q2, ba2.b).a((ad)new bh(this, bd2));
        }
        return;
    }

    private void d(io.netty.channel.bd bd2, bw bw2) {
        if (!bd2.b().I()) {
            bd2.b(bw2);
            return;
        }
        av av2 = this.b(bd2, bj.a);
        if (this.h.a()) {
            av2.a((ad)new bi(bd2, bw2));
        } else {
            this.p = new bi(bd2, bw2);
        }
    }

    private synchronized av b(io.netty.channel.bd bd2, bj bj2) {
        if (!this.n) {
            this.n = true;
            b b2 = new b(this.i, bj2);
            return bd2.d(b2);
        }
        return bd2.t();
    }

    static /* synthetic */ void a(bd bd2, io.netty.channel.bd bd3, bj bj2) {
        bd2.a(bd3, bj2);
    }

    static {
        a.setStackTrace(io.netty.util.c.d.k);
        b.setStackTrace(io.netty.util.c.d.k);
    }
}

