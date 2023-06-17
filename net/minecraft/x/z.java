/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.d.ov;
import com.a.a.n.a.ci;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.fr;
import net.minecraft.h.ao;
import net.minecraft.h.ar;
import net.minecraft.h.k;
import net.minecraft.m.bv;
import net.minecraft.m.by;
import net.minecraft.m.ct;
import net.minecraft.m.cu;
import net.minecraft.u.aw;
import net.minecraft.u.ax;
import net.minecraft.u.bi;
import net.minecraft.u.bo;
import net.minecraft.u.bq;
import net.minecraft.u.bw;
import net.minecraft.w.h.al;
import net.minecraft.x.a;
import net.minecraft.x.ak;
import net.minecraft.x.au;
import net.minecraft.x.d.a.aa;
import net.minecraft.x.d.a.ab;
import net.minecraft.x.d.a.ac;
import net.minecraft.x.d.a.ad;
import net.minecraft.x.d.a.ae;
import net.minecraft.x.d.a.af;
import net.minecraft.x.d.a.ag;
import net.minecraft.x.d.a.ah;
import net.minecraft.x.d.a.ai;
import net.minecraft.x.d.a.aj;
import net.minecraft.x.d.a.d;
import net.minecraft.x.d.a.e;
import net.minecraft.x.d.a.g;
import net.minecraft.x.d.a.i;
import net.minecraft.x.d.a.j;
import net.minecraft.x.d.a.n;
import net.minecraft.x.d.a.o;
import net.minecraft.x.d.a.p;
import net.minecraft.x.d.a.q;
import net.minecraft.x.d.a.r;
import net.minecraft.x.d.a.s;
import net.minecraft.x.d.a.t;
import net.minecraft.x.d.a.v;
import net.minecraft.x.d.a.x;
import net.minecraft.x.d.a.y;
import net.minecraft.x.d.b;
import net.minecraft.x.d.b.am;
import net.minecraft.x.d.b.aq;
import net.minecraft.x.d.b.bb;
import net.minecraft.x.d.b.bu;
import net.minecraft.x.d.b.bx;
import net.minecraft.x.d.b.m;
import net.minecraft.x.f;
import net.minecraft.x.l;
import net.minecraft.x.w;
import org.apache.logging.log4j.c;

public class z
implements aw,
b {
    private static final org.apache.logging.log4j.d c = org.apache.logging.log4j.c.c();
    public final ak a;
    private final net.minecraft.c.a d;
    public net.minecraft.w.a.g b;
    private int e;
    private int f;
    private long g;
    private long h;
    private int i;
    private int j;
    private final ax k = new ax();
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private net.minecraft.w.n r;
    private double s;
    private double t;
    private double u;
    private double v;
    private double w;
    private double x;
    private net.minecraft.u.b.s y;
    private int z;
    private int A;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    private int F;
    private int G;

    public z(net.minecraft.c.a a2, ak ak2, net.minecraft.w.a.g g2) {
        this.d = a2;
        this.a = ak2;
        ak2.a(this);
        this.b = g2;
        g2.a = this;
    }

    @Override
    public void a() {
        this.g();
        this.b.i();
        this.b.a(this.l, this.m, this.n, this.b.ba, this.b.bb);
        ++this.e;
        this.G = this.F;
        if (this.B) {
            if (++this.C > 80) {
                c.f("{} was kicked for floating too long!", this.b.X());
                this.a("Flying is not enabled on this server");
                return;
            }
        } else {
            this.B = false;
            this.C = 0;
        }
        this.r = this.b.dd();
        if (this.r != this.b && this.r.da() == this.b) {
            this.s = this.r.aU;
            this.t = this.r.aV;
            this.u = this.r.aW;
            this.v = this.r.aU;
            this.w = this.r.aV;
            this.x = this.r.aW;
            if (this.D && this.b.dd().da() == this.b) {
                if (++this.E > 80) {
                    c.f("{} was kicked for floating a vehicle too long!", this.b.X());
                    this.a("Flying is not enabled on this server");
                    return;
                }
            } else {
                this.D = false;
                this.E = 0;
            }
        } else {
            this.r = null;
            this.D = false;
            this.E = 0;
        }
        this.d.c.a("keepAlive");
        if ((long)this.e - this.h > 40L) {
            this.h = this.e;
            this.g = this.h();
            this.f = (int)this.g;
            this.a(new net.minecraft.x.d.b.ah(this.f));
        }
        this.d.c.b();
        if (this.i > 0) {
            --this.i;
        }
        if (this.j > 0) {
            --this.j;
        }
        if (this.b.aQ() > 0L && this.d.aJ() > 0 && net.minecraft.c.a.aI() - this.b.aQ() > (long)(this.d.aJ() * 1000 * 60)) {
            this.a("You have been idle for too long!");
        }
    }

    private void g() {
        this.l = this.b.aU;
        this.m = this.b.aV;
        this.n = this.b.aW;
        this.o = this.b.aU;
        this.p = this.b.aV;
        this.q = this.b.aW;
    }

    public ak b() {
        return this.a;
    }

    public void a(String string) {
        net.minecraft.u.d.k k2 = new net.minecraft.u.d.k(string);
        this.a.a(new net.minecraft.x.d.b.af(k2), new w(this, k2), new io.netty.util.b.ad[0]);
        this.a.i();
        ci.a((Future)this.d.a(new l(this)));
    }

    @Override
    public void a(net.minecraft.x.d.a.f f2) {
        net.minecraft.x.f.a(f2, this, this.b.y());
        this.b.a(f2.a(), f2.b(), f2.c(), f2.d());
    }

    private static boolean b(net.minecraft.x.d.a.l l2) {
        return com.a.a.l.i.b(l2.a(0.0)) && com.a.a.l.i.b(l2.b(0.0)) && com.a.a.l.i.b(l2.c(0.0)) && com.a.a.l.m.b(l2.b(0.0f)) && com.a.a.l.m.b(l2.a(0.0f)) ? false : Math.abs(l2.a(0.0)) <= 3.0E7 && Math.abs(l2.a(0.0)) <= 3.0E7;
    }

    private static boolean b(d d2) {
        return !com.a.a.l.i.b(d2.a()) || !com.a.a.l.i.b(d2.b()) || !com.a.a.l.i.b(d2.c()) || !com.a.a.l.m.b(d2.e()) || !com.a.a.l.m.b(d2.d());
    }

    @Override
    public void a(d d2) {
        net.minecraft.x.f.a(d2, this, this.b.y());
        if (net.minecraft.x.z.b(d2)) {
            this.a("Invalid move vehicle packet received");
        } else {
            net.minecraft.w.n n2 = this.b.dd();
            if (n2 != this.b && n2.da() == this.b && n2 == this.r) {
                net.minecraft.q.v v2 = this.b.y();
                double d3 = n2.aU;
                double d4 = n2.aV;
                double d5 = n2.aW;
                double d6 = d2.a();
                double d7 = d2.b();
                double d8 = d2.c();
                float f2 = d2.d();
                float f3 = d2.e();
                double d9 = d6 - this.s;
                double d10 = d7 - this.t;
                double d11 = d8 - this.u;
                double d12 = d9 * d9 + d10 * d10 + d11 * d11;
                double d13 = n2.aX * n2.aX + n2.aY * n2.aY + n2.aZ * n2.aZ;
                if (!(!(d12 - d13 > 100.0) || this.d.ab() && this.d.aa().equals(n2.X()))) {
                    c.f("{} (vehicle of {}) moved too quickly! {},{},{}", n2.X(), this.b.X(), d9, d10, d11);
                    this.a.a(new m(n2));
                    return;
                }
                boolean bl2 = v2.a(n2, n2.cT().c(0.0625)).isEmpty();
                d9 = d6 - this.v;
                d10 = d7 - this.w - 1.0E-6;
                d11 = d8 - this.x;
                n2.b(d9, d10, d11);
                double d14 = d10;
                d9 = d6 - n2.aU;
                d10 = d7 - n2.aV;
                if (d10 > -0.5 || d10 < 0.5) {
                    d10 = 0.0;
                }
                d11 = d8 - n2.aW;
                d12 = d9 * d9 + d10 * d10 + d11 * d11;
                boolean bl3 = false;
                if (d12 > 0.0625) {
                    bl3 = true;
                    c.f("{} moved wrongly!", n2.X());
                }
                n2.a(d6, d7, d8, f2, f3);
                boolean bl4 = v2.a(n2, n2.cT().c(0.0625)).isEmpty();
                if (bl2 && (bl3 || !bl4)) {
                    n2.a(d3, d4, d5, f2, f3);
                    this.a.a(new m(n2));
                    return;
                }
                this.d.av().d(this.b);
                this.b.c(this.b.aU - d3, this.b.aV - d4, this.b.aW - d5);
                this.D = d14 >= -0.03125 && !this.d.aq() && !v2.d(n2.cT().b(0.0625).a(0.0, -0.55, 0.0));
                this.v = n2.aU;
                this.w = n2.aV;
                this.x = n2.aW;
            }
        }
    }

    @Override
    public void a(o o2) {
        net.minecraft.x.f.a(o2, this, this.b.y());
        if (o2.a() == this.z) {
            this.b.a(this.y.b, this.y.c, this.y.d, this.b.ba, this.b.bb);
            if (this.b.aU()) {
                this.o = this.y.b;
                this.p = this.y.c;
                this.q = this.y.d;
                this.b.aV();
            }
            this.y = null;
        }
    }

    @Override
    public void a(net.minecraft.x.d.a.l l2) {
        net.minecraft.x.f.a(l2, this, this.b.y());
        if (net.minecraft.x.z.b(l2)) {
            this.a("Invalid move player packet received");
        } else {
            net.minecraft.q.v v2 = this.d.a(this.b.bS);
            if (!this.b.h) {
                if (this.e == 0) {
                    this.g();
                }
                if (this.y != null) {
                    if (this.e - this.A > 20) {
                        this.A = this.e;
                        this.a(this.y.b, this.y.c, this.y.d, this.b.ba, this.b.bb);
                    }
                } else {
                    this.A = this.e;
                    if (this.b.cz()) {
                        this.b.a(this.b.aU, this.b.aV, this.b.aW, l2.a(this.b.ba), l2.b(this.b.bb));
                        this.d.av().d(this.b);
                    } else {
                        double d2 = this.b.aU;
                        double d3 = this.b.aV;
                        double d4 = this.b.aW;
                        double d5 = this.b.aV;
                        double d6 = l2.a(this.b.aU);
                        double d7 = l2.b(this.b.aV);
                        double d8 = l2.c(this.b.aW);
                        float f2 = l2.a(this.b.ba);
                        float f3 = l2.b(this.b.bb);
                        double d9 = d6 - this.l;
                        double d10 = d7 - this.m;
                        double d11 = d8 - this.n;
                        double d12 = this.b.aX * this.b.aX + this.b.aY * this.b.aY + this.b.aZ * this.b.aZ;
                        double d13 = d9 * d9 + d10 * d10 + d11 * d11;
                        ++this.F;
                        int n2 = this.F - this.G;
                        if (n2 > 5) {
                            c.a("{} is sending move packets too frequently ({} packets since last tick)", this.b.X(), n2);
                            n2 = 1;
                        }
                        if (!(this.b.aU() || this.b.y().G().b("disableElytraMovementCheck") && this.b.bW())) {
                            float f4;
                            float f5 = f4 = this.b.bW() ? 300.0f : 100.0f;
                            if (!(!(d13 - d12 > (double)(f4 * (float)n2)) || this.d.ab() && this.d.aa().equals(this.b.X()))) {
                                c.f("{} moved too quickly! {},{},{}", this.b.X(), d9, d10, d11);
                                this.a(this.b.aU, this.b.aV, this.b.aW, this.b.ba, this.b.bb);
                                return;
                            }
                        }
                        boolean bl2 = v2.a((net.minecraft.w.n)this.b, this.b.cT().c(0.0625)).isEmpty();
                        d9 = d6 - this.o;
                        d10 = d7 - this.p;
                        d11 = d8 - this.q;
                        if (this.b.be && !l2.a() && d10 > 0.0) {
                            this.b.aj();
                        }
                        this.b.b(d9, d10, d11);
                        this.b.be = l2.a();
                        double d14 = d10;
                        d9 = d6 - this.b.aU;
                        d10 = d7 - this.b.aV;
                        if (d10 > -0.5 || d10 < 0.5) {
                            d10 = 0.0;
                        }
                        d11 = d8 - this.b.aW;
                        d13 = d9 * d9 + d10 * d10 + d11 * d11;
                        boolean bl3 = false;
                        if (!this.b.aU() && d13 > 0.0625 && !this.b.ae() && !this.b.c.c() && this.b.c.a() != net.minecraft.q.am.e) {
                            bl3 = true;
                            c.f("{} moved wrongly!", this.b.X());
                        }
                        this.b.a(d6, d7, d8, f2, f3);
                        this.b.c(this.b.aU - d2, this.b.aV - d3, this.b.aW - d4);
                        if (!this.b.bv && !this.b.ae()) {
                            boolean bl4 = v2.a((net.minecraft.w.n)this.b, this.b.cT().c(0.0625)).isEmpty();
                            if (bl2 && (bl3 || !bl4)) {
                                this.a(d2, d3, d4, f2, f3);
                                return;
                            }
                        }
                        this.B = d14 >= -0.03125;
                        this.B &= !this.d.aq() && !this.b.J.c;
                        this.B &= !this.b.b(net.minecraft.a.c.y) && !this.b.bW() && !v2.d(this.b.cT().b(0.0625).a(0.0, -0.55, 0.0));
                        this.b.be = l2.a();
                        this.d.av().d(this.b);
                        this.b.a(this.b.aV - d5, l2.a());
                        this.o = this.b.aU;
                        this.p = this.b.aV;
                        this.q = this.b.aW;
                    }
                }
            }
        }
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.a(d2, d3, d4, f2, f3, Collections.emptySet());
    }

    public void a(double d2, double d3, double d4, float f2, float f3, Set set) {
        double d5 = set.contains((Object)bu.a) ? this.b.aU : 0.0;
        double d6 = set.contains((Object)bu.b) ? this.b.aV : 0.0;
        double d7 = set.contains((Object)bu.c) ? this.b.aW : 0.0;
        this.y = new net.minecraft.u.b.s(d2 + d5, d3 + d6, d4 + d7);
        float f4 = f2;
        float f5 = f3;
        if (set.contains((Object)bu.d)) {
            f4 = f2 + this.b.ba;
        }
        if (set.contains((Object)bu.e)) {
            f5 = f3 + this.b.bb;
        }
        if (++this.z == Integer.MAX_VALUE) {
            this.z = 0;
        }
        this.A = this.e;
        this.b.a(this.y.b, this.y.c, this.y.d, f4, f5);
        this.b.a.a(new net.minecraft.x.d.b.aa(d2, d3, d4, f2, f3, set, this.z));
    }

    @Override
    public void a(ab ab2) {
        net.minecraft.x.f.a(ab2, this, this.b.y());
        net.minecraft.q.v v2 = this.d.a(this.b.bS);
        net.minecraft.u.b.b b2 = ab2.a();
        this.b.F();
        switch (ab2.c()) {
            case g: {
                if (!this.b.a()) {
                    cu cu2 = this.b.c(net.minecraft.u.ah.b);
                    this.b.a(net.minecraft.u.ah.b, this.b.c(net.minecraft.u.ah.a));
                    this.b.a(net.minecraft.u.ah.a, cu2);
                }
                return;
            }
            case e: {
                if (!this.b.a()) {
                    this.b.a(false);
                }
                return;
            }
            case d: {
                if (!this.b.a()) {
                    this.b.a(true);
                }
                return;
            }
            case f: {
                this.b.bU();
                cu cu3 = this.b.bC();
                if (cu3 != null && cu3.b == 0) {
                    this.b.a(net.minecraft.u.ah.a, null);
                }
                return;
            }
            case a: 
            case b: 
            case c: {
                double d2 = this.b.aU - ((double)b2.cy_() + 0.5);
                double d3 = this.b.aV - ((double)b2.k() + 0.5) + 1.5;
                double d4 = this.b.aW - ((double)b2.l() + 0.5);
                double d5 = d2 * d2 + d3 * d3 + d4 * d4;
                if (d5 > 36.0) {
                    return;
                }
                if (b2.k() >= this.d.at()) {
                    return;
                }
                if (ab2.c() == ae.a) {
                    if (!this.d.a(v2, b2, this.b) && v2.V().a(b2)) {
                        this.b.c.a(b2, ab2.b());
                    } else {
                        this.b.a.a(new bx(v2, b2));
                    }
                } else {
                    if (ab2.c() == ae.c) {
                        this.b.c.a(b2);
                    } else if (ab2.c() == ae.b) {
                        this.b.c.e();
                    }
                    if (v2.n(b2).d() != net.minecraft.g.a.h.a) {
                        this.b.a.a(new bx(v2, b2));
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid player action");
    }

    @Override
    public void a(ac ac2) {
        net.minecraft.x.f.a(ac2, this, this.b.y());
        net.minecraft.q.v v2 = this.d.a(this.b.bS);
        net.minecraft.u.ah ah2 = ac2.c();
        cu cu2 = this.b.c(ah2);
        net.minecraft.u.b.b b2 = ac2.a();
        net.minecraft.u.ad ad2 = ac2.b();
        this.b.F();
        if (b2.k() < this.d.at() - 1 || ad2 != net.minecraft.u.ad.b && b2.k() < this.d.at()) {
            if (this.y == null && this.b.h((double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5) < 64.0 && !this.d.a(v2, b2, this.b) && v2.V().a(b2)) {
                this.b.c.a(this.b, v2, cu2, ah2, b2, ad2, ac2.d(), ac2.e(), ac2.f());
            }
        } else {
            net.minecraft.u.d.l l2 = new net.minecraft.u.d.l("build.tooHigh", this.d.at());
            l2.a().a(net.minecraft.u.d.o.m);
            this.b.a.a(new net.minecraft.x.d.b.b(l2));
        }
        this.b.a.a(new bx(v2, b2));
        this.b.a.a(new bx(v2, b2.a(ad2)));
        cu2 = this.b.c(ah2);
        if (cu2 != null && cu2.b == 0) {
            this.b.a(ah2, null);
        }
    }

    @Override
    public void a(ag ag2) {
        net.minecraft.x.f.a(ag2, this, this.b.y());
        net.minecraft.q.v v2 = this.d.a(this.b.bS);
        net.minecraft.u.ah ah2 = ag2.a();
        cu cu2 = this.b.c(ah2);
        this.b.F();
        if (cu2 != null) {
            this.b.c.a(this.b, v2, cu2, ah2);
            cu2 = this.b.c(ah2);
            if (cu2 != null && cu2.b == 0) {
                this.b.a(ah2, null);
                cu2 = null;
            }
        }
    }

    @Override
    public void a(i i2) {
        net.minecraft.x.f.a(i2, this, this.b.y());
        if (this.b.a()) {
            net.minecraft.q.v v2;
            net.minecraft.w.n n2 = null;
            net.minecraft.q.v[] arrv = this.d.d;
            int n3 = this.d.d.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                v2 = arrv[i3];
                if (v2 != null && (n2 = i2.a(v2)) != null) break;
            }
            if (n2 != null) {
                this.b.g(this.b);
                this.b.o();
                if (n2.aQ == this.b.aQ) {
                    this.b.d(n2.aU, n2.aV, n2.aW);
                } else {
                    v2 = this.b.y();
                    net.minecraft.q.v v3 = (net.minecraft.q.v)n2.aQ;
                    this.b.bS = n2.bS;
                    this.a(new net.minecraft.x.d.b.f(this.b.bS, v2.R(), v2.F().t(), this.b.c.a()));
                    this.d.av().f(this.b);
                    v2.f(this.b);
                    this.b.bk = false;
                    this.b.b(n2.aU, n2.aV, n2.aW, n2.ba, n2.bb);
                    if (this.b.br()) {
                        v2.a((net.minecraft.w.n)this.b, false);
                        v3.a(this.b);
                        v3.a((net.minecraft.w.n)this.b, false);
                    }
                    this.b.b(v3);
                    this.d.av().a(this.b, v2);
                    this.b.d(n2.aU, n2.aV, n2.aW);
                    this.b.c.a(v3);
                    this.d.av().b(this.b, v3);
                    this.d.av().g(this.b);
                }
            }
        }
    }

    @Override
    public void a(e e2) {
    }

    @Override
    public void a(aj aj2) {
        net.minecraft.x.f.a(aj2, this, this.b.y());
        net.minecraft.w.n n2 = this.b.df();
        if (n2 instanceof net.minecraft.w.f.ab) {
            ((net.minecraft.w.f.ab)n2).a(aj2.a(), aj2.b());
        }
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        c.d("{} lost connection: {}", this.b.X(), a2);
        this.d.aQ();
        net.minecraft.u.d.l l2 = new net.minecraft.u.d.l("multiplayer.player.left", this.b.aK());
        l2.a().a(net.minecraft.u.d.o.o);
        this.d.av().a(l2);
        this.b.v();
        this.d.av().e(this.b);
        if (this.d.ab() && this.b.X().equals(this.d.aa())) {
            c.d("Stopping singleplayer server as player logged out");
            this.d.H();
        }
    }

    public void a(net.minecraft.x.p p2) {
        Object object;
        if (p2 instanceof net.minecraft.x.d.b.b) {
            net.minecraft.x.d.b.b b2 = (net.minecraft.x.d.b.b)p2;
            object = this.b.E();
            if (object == net.minecraft.w.a.i.c) {
                return;
            }
            if (object == net.minecraft.w.a.i.b && !b2.b()) {
                return;
            }
        }
        try {
            this.a.a(p2);
        }
        catch (Throwable throwable) {
            object = net.minecraft.k.a.a(throwable, "Sending packet");
            net.minecraft.k.i i2 = ((net.minecraft.k.a)object).a("Packet being sent");
            i2.a("Packet class", new au(this, p2));
            throw new bo((net.minecraft.k.a)object);
        }
    }

    @Override
    public void a(q q2) {
        net.minecraft.x.f.a(q2, this, this.b.y());
        if (q2.a() >= 0 && q2.a() < net.minecraft.w.a.a.c()) {
            this.b.q.d = q2.a();
            this.b.F();
        } else {
            c.f("{} tried to set an invalid carried item", this.b.X());
        }
    }

    @Override
    public void a(v v2) {
        net.minecraft.x.f.a(v2, this, this.b.y());
        if (this.b.E() == net.minecraft.w.a.i.c) {
            net.minecraft.u.d.l l2 = new net.minecraft.u.d.l("chat.cannotSend", new Object[0]);
            l2.a().a(net.minecraft.u.d.o.m);
            this.a(new net.minecraft.x.d.b.b(l2));
        } else {
            this.b.F();
            String string = v2.a();
            string = org.apache.commons.c.am.v(string);
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (net.minecraft.u.d.a(string.charAt(i2))) continue;
                this.a("Illegal characters in chat");
                return;
            }
            if (string.startsWith("/")) {
                this.b(string);
            } else {
                net.minecraft.u.d.l l3 = new net.minecraft.u.d.l("chat.type.text", this.b.aK(), string);
                this.d.av().a(l3, false);
            }
            this.i += 20;
            if (this.i > 200 && !this.d.av().e(this.b.ac())) {
                this.a("disconnect.spam");
            }
        }
    }

    private void b(String string) {
        this.d.Y().a(this.b, string);
    }

    @Override
    public void a(n n2) {
        net.minecraft.x.f.a(n2, this, this.b.y());
        this.b.F();
        this.b.a(n2.a());
    }

    @Override
    public void a(p p2) {
        net.minecraft.x.f.a(p2, this, this.b.y());
        this.b.F();
        switch (p2.a()) {
            case a: {
                this.b.m(true);
                break;
            }
            case b: {
                this.b.m(false);
                break;
            }
            case d: {
                this.b.b(true);
                break;
            }
            case e: {
                this.b.b(false);
                break;
            }
            case c: {
                this.b.a(false, true, true);
                this.y = new net.minecraft.u.b.s(this.b.aU, this.b.aV, this.b.aW);
                break;
            }
            case f: {
                if (!(this.b.df() instanceof net.minecraft.w.i)) break;
                net.minecraft.w.i i2 = (net.minecraft.w.i)((Object)this.b.df());
                int n2 = p2.b();
                if (!i2.b() || n2 <= 0) break;
                i2.b(n2);
                break;
            }
            case g: {
                if (!(this.b.df() instanceof net.minecraft.w.i)) break;
                net.minecraft.w.i i3 = (net.minecraft.w.i)((Object)this.b.df());
                i3.c();
                break;
            }
            case h: {
                if (!(this.b.df() instanceof al)) break;
                ((al)this.b.df()).e(this.b);
                break;
            }
            case i: {
                if (!this.b.be && this.b.aY < 0.0 && !this.b.bW() && !this.b.cm()) {
                    cu cu2 = this.b.a(net.minecraft.h.k.e);
                    if (cu2 == null || cu2.a() != net.minecraft.a.w.cR || !by.h(cu2)) break;
                    this.b.aW();
                    break;
                }
                this.b.aX();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.a.m m2) {
        net.minecraft.x.f.a(m2, this, this.b.y());
        net.minecraft.q.v v2 = this.d.a(this.b.bS);
        net.minecraft.w.n n2 = m2.a(v2);
        this.b.F();
        if (n2 != null) {
            boolean bl2 = this.b.l(n2);
            double d2 = 36.0;
            if (!bl2) {
                d2 = 9.0;
            }
            if (this.b.n(n2) < d2) {
                if (m2.a() == net.minecraft.x.d.a.b.a) {
                    net.minecraft.u.ah ah2 = m2.b();
                    cu cu2 = this.b.c(ah2);
                    this.b.a(n2, cu2, ah2);
                } else if (m2.a() == net.minecraft.x.d.a.b.c) {
                    net.minecraft.u.ah ah3 = m2.b();
                    cu cu3 = this.b.c(ah3);
                    n2.a(this.b, m2.c(), cu3, ah3);
                } else if (m2.a() == net.minecraft.x.d.a.b.b) {
                    if (n2 instanceof net.minecraft.w.f.ae || n2 instanceof net.minecraft.w.f.e || n2 instanceof net.minecraft.w.c.f || n2 == this.b) {
                        this.a("Attempting to attack an invalid entity");
                        this.d.d("Player " + this.b.X() + " tried to attack an invalid entity");
                        return;
                    }
                    this.b.c(n2);
                }
            }
        }
    }

    @Override
    public void a(x x2) {
        net.minecraft.x.f.a(x2, this, this.b.y());
        this.b.F();
        ah ah2 = x2.a();
        switch (ah2) {
            case a: {
                if (this.b.h) {
                    this.b.h = false;
                    this.b = this.d.av().a(this.b, 0, true);
                    break;
                }
                if (this.b.bo() > 0.0f) {
                    return;
                }
                this.b = this.d.av().a(this.b, 0, false);
                if (!this.d.A()) break;
                this.b.a(net.minecraft.q.am.e);
                this.b.y().G().a("spectatorsGenerateChunks", "false");
                break;
            }
            case b: {
                this.b.I().a(this.b);
                break;
            }
            case c: {
                this.b.a((net.minecraft.r.k)net.minecraft.r.j.f);
            }
        }
    }

    @Override
    public void a(net.minecraft.x.d.a.a a2) {
        net.minecraft.x.f.a(a2, this, this.b.y());
        this.b.s();
    }

    @Override
    public void a(af af2) {
        net.minecraft.x.f.a(af2, this, this.b.y());
        this.b.F();
        if (this.b.s.f == af2.a() && this.b.s.c(this.b)) {
            if (this.b.a()) {
                ArrayList arrayList = ov.a();
                for (int i2 = 0; i2 < this.b.s.e.size(); ++i2) {
                    arrayList.add(((net.minecraft.h.r)this.b.s.e.get(i2)).b());
                }
                this.b.a(this.b.s, arrayList);
            } else {
                cu cu2 = this.b.s.a(af2.b(), af2.c(), af2.f(), (net.minecraft.w.a.b)this.b);
                if (cu.b(af2.e(), cu2)) {
                    this.b.a.a(new aq(af2.a(), af2.d(), true));
                    this.b.f = true;
                    this.b.s.a();
                    this.b.p();
                    this.b.f = false;
                } else {
                    this.k.a(this.b.s.f, af2.d());
                    this.b.a.a(new aq(af2.a(), af2.d(), false));
                    this.b.s.a((net.minecraft.w.a.b)this.b, false);
                    ArrayList arrayList = ov.a();
                    for (int i3 = 0; i3 < this.b.s.e.size(); ++i3) {
                        cu cu3 = ((net.minecraft.h.r)this.b.s.e.get(i3)).b();
                        cu cu4 = cu3 != null && cu3.b > 0 ? cu3 : null;
                        arrayList.add(cu4);
                    }
                    this.b.a(this.b.s, arrayList);
                }
            }
        }
    }

    @Override
    public void a(ai ai2) {
        net.minecraft.x.f.a(ai2, this, this.b.y());
        this.b.F();
        if (this.b.s.f == ai2.a() && this.b.s.c(this.b) && !this.b.a()) {
            this.b.s.b(this.b, ai2.b());
            this.b.s.a();
        }
    }

    @Override
    public void a(r r2) {
        net.minecraft.x.f.a(r2, this, this.b.y());
        if (this.b.c.c()) {
            boolean bl2;
            Object object;
            net.minecraft.u.b.b b2;
            ap ap2;
            net.minecraft.e.e e2;
            boolean bl3 = r2.a() < 0;
            cu cu2 = r2.b();
            if (cu2 != null && cu2.n() && cu2.o().b("BlockEntityTag", 10) && (e2 = cu2.o().o("BlockEntityTag")).e("x") && e2.e("y") && e2.e("z") && (ap2 = this.b.aQ.q(b2 = new net.minecraft.u.b.b(e2.h("x"), e2.h("y"), e2.h("z")))) != null) {
                object = ap2.a(new net.minecraft.e.e());
                ((net.minecraft.e.e)object).q("x");
                ((net.minecraft.e.e)object).q("y");
                ((net.minecraft.e.e)object).q("z");
                cu2.a("BlockEntityTag", (net.minecraft.e.a)object);
            }
            boolean bl4 = r2.a() >= 1 && r2.a() <= 45;
            boolean bl5 = cu2 == null || cu2.a() != null;
            boolean bl6 = bl2 = cu2 == null || cu2.h() >= 0 && cu2.b <= 64 && cu2.b > 0;
            if (bl4 && bl5 && bl2) {
                if (cu2 == null) {
                    this.b.r.a(r2.a(), null);
                } else {
                    this.b.r.a(r2.a(), cu2);
                }
                this.b.r.a((net.minecraft.w.a.b)this.b, true);
            } else if (bl3 && bl5 && bl2 && this.j < 200) {
                this.j += 20;
                object = this.b.a(cu2, true);
                if (object != null) {
                    ((net.minecraft.w.f.ae)object).a();
                }
            }
        }
    }

    @Override
    public void a(t t2) {
        net.minecraft.x.f.a(t2, this, this.b.y());
        Short s2 = (Short)this.k.a(this.b.s.f);
        if (s2 != null && t2.b() == s2.shortValue() && this.b.s.f == t2.a() && !this.b.s.c(this.b) && !this.b.a()) {
            this.b.s.a((net.minecraft.w.a.b)this.b, true);
        }
    }

    @Override
    public void a(s s2) {
        net.minecraft.x.f.a(s2, this, this.b.y());
        this.b.F();
        net.minecraft.q.v v2 = this.d.a(this.b.bS);
        net.minecraft.u.b.b b2 = s2.a();
        if (v2.d(b2)) {
            net.minecraft.g.c.b b3 = v2.n(b2);
            ap ap2 = v2.q(b2);
            if (!(ap2 instanceof net.minecraft.f.ad)) {
                return;
            }
            net.minecraft.f.ad ad2 = (net.minecraft.f.ad)ap2;
            if (!ad2.b() || ad2.g() != this.b) {
                this.d.d("Player " + this.b.X() + " just tried to change non-editable sign");
                return;
            }
            String[] arrstring = s2.b();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                ad2.a[i2] = new net.minecraft.u.d.k(net.minecraft.u.d.o.a(arrstring[i2]));
            }
            ad2.C();
            v2.a(b2, b3, b3, 3);
        }
    }

    @Override
    public void a(aa aa2) {
        if (aa2.a() == this.f) {
            int n2 = (int)(this.h() - this.g);
            this.b.g = (this.b.g * 3 + n2) / 4;
        }
    }

    private long h() {
        return System.nanoTime() / 1000000L;
    }

    @Override
    public void a(y y2) {
        net.minecraft.x.f.a(y2, this, this.b.y());
        this.b.J.b = y2.b() && this.b.J.c;
    }

    @Override
    public void a(g g2) {
        net.minecraft.x.f.a(g2, this, this.b.y());
        ArrayList arrayList = ov.a();
        for (String string : this.d.a(this.b, g2.a(), g2.b(), g2.c())) {
            arrayList.add(string);
        }
        this.b.a.a(new am(arrayList.toArray(new String[arrayList.size()])));
    }

    @Override
    public void a(ad ad2) {
        net.minecraft.x.f.a(ad2, this, this.b.y());
        this.b.a(ad2);
    }

    @Override
    public void a(j j2) {
        block82: {
            net.minecraft.x.f.a(j2, this, this.b.y());
            String string = j2.a();
            if ("MC|BEdit".equals(string)) {
                a a2 = j2.b();
                try {
                    cu cu2 = a2.i();
                    if (cu2 == null) {
                        return;
                    }
                    if (!bv.b(cu2.o())) {
                        throw new IOException("Invalid book tag!");
                    }
                    cu cu3 = this.b.bC();
                    if (cu3 == null) {
                        return;
                    }
                    if (cu2.a() == net.minecraft.a.w.bW && cu2.a() == cu3.a()) {
                        cu3.a("pages", cu2.o().c("pages", 8));
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't handle book info", (Throwable)exception);
                }
            } else if ("MC|BSign".equals(string)) {
                a a3 = j2.b();
                try {
                    cu cu4 = a3.i();
                    if (cu4 == null) {
                        return;
                    }
                    if (!ct.b(cu4.o())) {
                        throw new IOException("Invalid book tag!");
                    }
                    cu cu5 = this.b.bC();
                    if (cu5 == null) {
                        return;
                    }
                    if (cu4.a() == net.minecraft.a.w.bW && cu5.a() == net.minecraft.a.w.bW) {
                        cu5.a("author", new net.minecraft.e.y(this.b.X()));
                        cu5.a("title", new net.minecraft.e.y(cu4.o().l("title")));
                        net.minecraft.e.q q2 = cu4.o().c("pages", 8);
                        for (int i2 = 0; i2 < q2.e(); ++i2) {
                            String string2 = q2.g(i2);
                            net.minecraft.u.d.k k2 = new net.minecraft.u.d.k(string2);
                            string2 = net.minecraft.u.d.b.a(k2);
                            q2.a(i2, new net.minecraft.e.y(string2));
                        }
                        cu5.a("pages", q2);
                        cu5.a(net.minecraft.a.w.bX);
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't sign book", (Throwable)exception);
                }
            } else if ("MC|TrSel".equals(string)) {
                try {
                    int n2 = j2.b().K();
                    net.minecraft.h.aq aq2 = this.b.s;
                    if (aq2 instanceof net.minecraft.h.ag) {
                        ((net.minecraft.h.ag)aq2).a(n2);
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't select trade", (Throwable)exception);
                }
            } else if ("MC|AdvCmd".equals(string)) {
                if (!this.d.ar()) {
                    this.b.a(new net.minecraft.u.d.l("advMode.notEnabled", new Object[0]));
                    return;
                }
                if (!this.b.aN()) {
                    this.b.a(new net.minecraft.u.d.l("advMode.notAllowed", new Object[0]));
                    return;
                }
                a a4 = j2.b();
                try {
                    Object object;
                    byte by2 = a4.E();
                    net.minecraft.f.q q3 = null;
                    if (by2 == 0) {
                        object = this.b.aQ.q(new net.minecraft.u.b.b(a4.K(), a4.K(), a4.K()));
                        if (object instanceof net.minecraft.f.h) {
                            q3 = ((net.minecraft.f.h)object).b();
                        }
                    } else if (by2 == 1 && (object = this.b.aQ.a(a4.K())) instanceof net.minecraft.w.f.w) {
                        q3 = ((net.minecraft.w.f.w)object).g();
                    }
                    object = a4.e(a4.r());
                    boolean bl2 = a4.D();
                    if (q3 != null) {
                        q3.a((String)object);
                        q3.a(bl2);
                        if (!bl2) {
                            q3.b((net.minecraft.u.d.a)null);
                        }
                        q3.d();
                        this.b.a(new net.minecraft.u.d.l("advMode.setCommand.success", object));
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't set command block", (Throwable)exception);
                }
            } else if ("MC|AutoCmd".equals(string)) {
                if (!this.d.ar()) {
                    this.b.a(new net.minecraft.u.d.l("advMode.notEnabled", new Object[0]));
                    return;
                }
                if (!this.b.aN()) {
                    this.b.a(new net.minecraft.u.d.l("advMode.notAllowed", new Object[0]));
                    return;
                }
                a a5 = j2.b();
                try {
                    net.minecraft.f.q q4 = null;
                    net.minecraft.f.h h2 = null;
                    net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(a5.K(), a5.K(), a5.K());
                    ap ap2 = this.b.aQ.q(b2);
                    if (ap2 instanceof net.minecraft.f.h) {
                        h2 = (net.minecraft.f.h)ap2;
                        q4 = h2.b();
                    }
                    String string3 = a5.e(a5.r());
                    boolean bl3 = a5.D();
                    net.minecraft.f.n n3 = net.minecraft.f.n.valueOf(a5.e(16));
                    boolean bl4 = a5.D();
                    boolean bl5 = a5.D();
                    if (q4 == null) break block82;
                    net.minecraft.u.ad ad2 = (net.minecraft.u.ad)((Object)this.b.aQ.n(b2).a(fr.a));
                    switch (n3) {
                        case a: {
                            net.minecraft.g.c.b b3 = net.minecraft.a.p.dd.v();
                            this.b.aQ.a(b2, b3.a(fr.a, (Comparable)((Object)ad2)).a(fr.b, Boolean.valueOf(bl4)), 2);
                            break;
                        }
                        case b: {
                            net.minecraft.g.c.b b4 = net.minecraft.a.p.dc.v();
                            this.b.aQ.a(b2, b4.a(fr.a, (Comparable)((Object)ad2)).a(fr.b, Boolean.valueOf(bl4)), 2);
                            break;
                        }
                        case c: {
                            net.minecraft.g.c.b b5 = net.minecraft.a.p.bX.v();
                            this.b.aQ.a(b2, b5.a(fr.a, (Comparable)((Object)ad2)).a(fr.b, Boolean.valueOf(bl4)), 2);
                        }
                    }
                    ap2.l();
                    this.b.aQ.a(b2, ap2);
                    q4.a(string3);
                    q4.a(bl3);
                    if (!bl3) {
                        q4.b((net.minecraft.u.d.a)null);
                    }
                    h2.b(bl5);
                    q4.d();
                    if (!bw.b(string3)) {
                        this.b.a(new net.minecraft.u.d.l("advMode.setCommand.success", string3));
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't set command block", (Throwable)exception);
                }
            } else if ("MC|Beacon".equals(string)) {
                if (this.b.s instanceof ao) {
                    try {
                        a a6 = j2.b();
                        int n4 = a6.K();
                        int n5 = a6.K();
                        ao ao2 = (ao)this.b.s;
                        net.minecraft.h.r r2 = ao2.b(0);
                        if (r2.c()) {
                            r2.a(1);
                            net.minecraft.h.y y2 = ao2.b();
                            y2.b(1, n4);
                            y2.b(2, n5);
                            y2.C();
                        }
                    }
                    catch (Exception exception) {
                        c.b("Couldn't set beacon", (Throwable)exception);
                    }
                }
            } else if ("MC|ItemName".equals(string)) {
                if (this.b.s instanceof ar) {
                    ar ar2 = (ar)this.b.s;
                    if (j2.b() != null && j2.b().r() >= 1) {
                        String string4 = net.minecraft.u.d.a(j2.b().e(32767));
                        if (string4.length() <= 30) {
                            ar2.a(string4);
                        }
                    } else {
                        ar2.a("");
                    }
                }
            } else if ("MC|Struct".equals(string)) {
                if (!this.b.aN()) {
                    return;
                }
                a a7 = j2.b();
                try {
                    net.minecraft.u.b.b b6 = new net.minecraft.u.b.b(a7.K(), a7.K(), a7.K());
                    net.minecraft.g.c.b b7 = this.b.aQ.n(b6);
                    ap ap3 = this.b.aQ.q(b6);
                    if (ap3 instanceof net.minecraft.f.ab) {
                        net.minecraft.f.ab ab2 = (net.minecraft.f.ab)ap3;
                        byte by3 = a7.E();
                        String string5 = a7.e(32);
                        ab2.a(net.minecraft.f.r.valueOf(string5));
                        ab2.a(a7.e(64));
                        int n6 = net.minecraft.u.b.n.a(a7.K(), -32, 32);
                        int n7 = net.minecraft.u.b.n.a(a7.K(), -32, 32);
                        int n8 = net.minecraft.u.b.n.a(a7.K(), -32, 32);
                        ab2.a(new net.minecraft.u.b.b(n6, n7, n8));
                        int n9 = net.minecraft.u.b.n.a(a7.K(), 0, 32);
                        int n10 = net.minecraft.u.b.n.a(a7.K(), 0, 32);
                        int n11 = net.minecraft.u.b.n.a(a7.K(), 0, 32);
                        ab2.b(new net.minecraft.u.b.b(n9, n10, n11));
                        String string6 = a7.e(32);
                        ab2.b(bi.valueOf(string6));
                        String string7 = a7.e(32);
                        ab2.b(bq.valueOf(string7));
                        ab2.b(a7.e(128));
                        ab2.a(a7.D());
                        ab2.e(a7.D());
                        ab2.f(a7.D());
                        ab2.a(net.minecraft.u.b.n.a(a7.O(), 0.0f, 1.0f));
                        ab2.a(a7.f());
                        String string8 = ab2.b();
                        if (by3 == 2) {
                            if (ab2.t()) {
                                this.b.b(new net.minecraft.u.d.l("structure_block.save_success", string8));
                            } else {
                                this.b.b(new net.minecraft.u.d.l("structure_block.save_failure", string8));
                            }
                        } else if (by3 == 3) {
                            if (!ab2.w()) {
                                this.b.b(new net.minecraft.u.d.l("structure_block.load_not_found", string8));
                            } else if (ab2.u()) {
                                this.b.b(new net.minecraft.u.d.l("structure_block.load_success", string8));
                            } else {
                                this.b.b(new net.minecraft.u.d.l("structure_block.load_prepare", string8));
                            }
                        } else if (by3 == 4) {
                            if (ab2.s()) {
                                this.b.b(new net.minecraft.u.d.l("structure_block.size_success", string8));
                            } else {
                                this.b.b(new net.minecraft.u.d.l("structure_block.size_failure", new Object[0]));
                            }
                        }
                        ab2.C();
                        this.b.aQ.a(b6, b7, b7, 3);
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't set structure block", (Throwable)exception);
                }
            } else if ("MC|PickItem".equals(string)) {
                a a8 = j2.b();
                try {
                    int n12 = a8.e();
                    this.b.q.d(n12);
                    this.b.a.a(new bb(-2, this.b.q.d, this.b.q.a(this.b.q.d)));
                    this.b.a.a(new bb(-2, n12, this.b.q.a(n12)));
                    this.b.a.a(new net.minecraft.x.d.b.ae(this.b.q.d));
                }
                catch (Exception exception) {
                    c.b("Couldn't pick item", (Throwable)exception);
                }
            }
        }
    }
}

