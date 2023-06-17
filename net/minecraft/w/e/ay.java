/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Calendar;
import net.minecraft.a.c;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.af;
import net.minecraft.q.z;
import net.minecraft.r.j;
import net.minecraft.u.a.a;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ae;
import net.minecraft.w.b.aa;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.be;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.bk;
import net.minecraft.w.b.y;
import net.minecraft.w.c.i;
import net.minecraft.w.d;
import net.minecraft.w.e.an;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bj;
import net.minecraft.w.e.k;
import net.minecraft.w.e.v;
import net.minecraft.w.f;
import net.minecraft.w.f.ab;
import net.minecraft.w.h.e;
import net.minecraft.w.l;
import net.minecraft.w.m;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class ay
extends k
implements m {
    private static final g a = net.minecraft.x.a.o.a(ay.class, net.minecraft.x.a.q.b);
    private static final g b = net.minecraft.x.a.o.a(ay.class, net.minecraft.x.a.q.h);
    private final bk c = new bk(this, 1.0, 20, 15.0f);
    private final aa d = new an(this, this, 1.2, false);

    public ay(net.minecraft.q.k k2) {
        super(k2);
        this.c();
    }

    @Override
    protected void cA_() {
        this.o.a(1, new av(this));
        this.o.a(2, new net.minecraft.w.b.bp(this));
        this.o.a(3, new be(this, 1.0));
        this.o.a(3, new net.minecraft.w.b.bi(this, e.class, 6.0f, 1.0, 1.2));
        this.o.a(5, new az(this, 1.0));
        this.o.a(6, new ap(this, b.class, 8.0f));
        this.o.a(6, new bh(this));
        this.p.a(1, new ba((t)this, false, new Class[0]));
        this.p.a(2, new y((t)this, b.class, true));
        this.p.a(3, new y((t)this, bj.class, true));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.d).a(0.25);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, v.a.a());
        this.bE.a(b, false);
    }

    @Override
    protected bv j() {
        return this.p().c();
    }

    @Override
    protected bv cc_() {
        return this.p().d();
    }

    @Override
    protected bv cd_() {
        return this.p().e();
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        bv bv2 = this.p().f();
        this.a(bv2, 0.15f, 1.0f);
    }

    @Override
    public boolean j(n n2) {
        if (super.j(n2)) {
            if (this.p() == v.b && n2 instanceof l) {
                ((l)n2).c(new net.minecraft.d.j(net.minecraft.a.c.t, 200));
            }
            return true;
        }
        return false;
    }

    @Override
    public ae bB() {
        return net.minecraft.w.ae.b;
    }

    @Override
    public void n() {
        if (this.aQ.n() && !this.aQ.C) {
            net.minecraft.u.b.b b2;
            float f2 = this.n(1.0f);
            net.minecraft.u.b.b b3 = b2 = this.df() instanceof ab ? new net.minecraft.u.b.b(this.aU, Math.round(this.aV), this.aW).b() : new net.minecraft.u.b.b(this.aU, Math.round(this.aV), this.aW);
            if (f2 > 0.5f && this.bx.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f && this.aQ.g(b2)) {
                boolean bl2 = true;
                cu cu2 = this.a(net.minecraft.h.k.f);
                if (cu2 != null) {
                    if (cu2.d()) {
                        cu2.b(cu2.g() + this.bx.nextInt(2));
                        if (cu2.g() >= cu2.i()) {
                            this.e(cu2);
                            this.a(net.minecraft.h.k.f, null);
                        }
                    }
                    bl2 = false;
                }
                if (bl2) {
                    this.k(8);
                }
            }
        }
        if (this.aQ.C) {
            this.b(this.p());
        }
        super.n();
    }

    @Override
    public void J() {
        super.J();
        if (this.df() instanceof t) {
            t t2 = (t)this.df();
            this.ak = t2.ak;
        }
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        if (n2.i() instanceof net.minecraft.w.c.f && n2.j() instanceof b) {
            b b2 = (b)n2.j();
            double d2 = b2.aU - this.aU;
            double d3 = b2.aW - this.aW;
            if (d2 * d2 + d3 * d3 >= 2500.0) {
                b2.a((net.minecraft.r.k)net.minecraft.r.j.v);
            }
        } else if (n2.j() instanceof bi && ((bi)n2.j()).c() && ((bi)n2.j()).s()) {
            ((bi)n2.j()).t();
            this.a(new cu(w.ch, 1, this.p() == v.b ? 1 : 0), 0.0f);
        }
    }

    @Override
    protected bp ai() {
        return this.p().b();
    }

    @Override
    protected void a(z z2) {
        super.a(z2);
        this.a(net.minecraft.h.k.a, new cu(w.f));
    }

    @Override
    public ac a(z z2, ac ac2) {
        Object object;
        ac2 = super.a(z2, ac2);
        if (this.aQ.q instanceof af && this.bd().nextInt(5) > 0) {
            this.o.a(4, this.d);
            this.a(v.b);
            this.a(net.minecraft.h.k.a, new cu(w.s));
            this.a(net.minecraft.w.d.e).a(4.0);
        } else {
            object = this.aQ.a(new net.minecraft.u.b.b(this));
            if (object instanceof net.minecraft.q.b.m && this.aQ.g(new net.minecraft.u.b.b(this)) && this.bx.nextInt(5) != 0) {
                this.a(v.c);
            }
            this.o.a(4, this.c);
            this.a(z2);
            this.b(z2);
        }
        this.f(this.bx.nextFloat() < 0.55f * z2.c());
        if (this.a(net.minecraft.h.k.f) == null && ((Calendar)(object = this.aQ.P())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.bx.nextFloat() < 0.25f) {
            this.a(net.minecraft.h.k.f, new cu(this.bx.nextFloat() < 0.1f ? net.minecraft.a.p.aZ : net.minecraft.a.p.aU));
            this.r[net.minecraft.h.k.f.b()] = 0.0f;
        }
        return ac2;
    }

    public void c() {
        if (this.aQ != null && !this.aQ.C) {
            this.o.a(this.d);
            this.o.a(this.c);
            cu cu2 = this.bC();
            if (cu2 != null && cu2.a() == w.f) {
                int n2 = 20;
                if (this.aQ.R() != net.minecraft.q.l.d) {
                    n2 = 40;
                }
                this.c.a(n2);
                this.o.a(4, this.c);
            } else {
                this.o.a(4, this.d);
            }
        }
    }

    @Override
    public void a(l l2, float f2) {
        cu cu2;
        i i2 = new i(this.aQ, this);
        double d2 = l2.aU - this.aU;
        double d3 = l2.cT().b + (double)(l2.bm / 3.0f) - i2.aV;
        double d4 = l2.aW - this.aW;
        double d5 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
        i2.c(d2, d3 + d5 * (double)0.2f, d4, 1.6f, 14 - this.aQ.R().a() * 4);
        int n2 = net.minecraft.o.f.a(net.minecraft.a.aa.u, this);
        int n3 = net.minecraft.o.f.a(net.minecraft.a.aa.v, this);
        z z2 = this.aQ.C(new net.minecraft.u.b.b(this));
        i2.c((double)(f2 * 2.0f) + this.bx.nextGaussian() * 0.25 + (double)((float)this.aQ.R().a() * 0.11f));
        if (n2 > 0) {
            i2.c(i2.c() + (double)n2 * 0.5 + 0.5);
        }
        if (n3 > 0) {
            i2.b(n3);
        }
        boolean bl2 = this.cy() && z2.b() && this.bx.nextBoolean() || this.p() == v.b;
        boolean bl3 = bl2 = bl2 || net.minecraft.o.f.a(net.minecraft.a.aa.w, this) > 0;
        if (bl2) {
            i2.k(100);
        }
        if ((cu2 = this.c(net.minecraft.u.ah.b)) != null && cu2.a() == w.i) {
            i2.a(cu2);
        } else if (this.p() == v.c) {
            i2.a(new net.minecraft.d.j(net.minecraft.a.c.b, 600));
        }
        this.a(net.minecraft.a.f.fz, 1.0f, 1.0f / (this.bd().nextFloat() * 0.4f + 0.8f));
        this.aQ.a(i2);
    }

    public v p() {
        return v.a((Integer)this.bE.a(a));
    }

    public void a(v v2) {
        this.bE.b(a, v2.a());
        this.bD = v2 == v.b;
        this.b(v2);
    }

    private void b(v v2) {
        if (v2 == v.b) {
            this.d(0.7f, 2.4f);
        } else {
            this.d(0.6f, 1.99f);
        }
    }

    public static void a(a a2) {
        f.a(a2, "Skeleton");
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        if (e2.b("SkeletonType", 99)) {
            byte by2 = e2.f("SkeletonType");
            this.a(v.a(by2));
        }
        this.c();
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("SkeletonType", (byte)this.p().a());
    }

    @Override
    public void a(net.minecraft.h.k k2, cu cu2) {
        super.a(k2, cu2);
        if (!this.aQ.C && k2 == net.minecraft.h.k.a) {
            this.c();
        }
    }

    @Override
    public float ce_() {
        return this.p() == v.b ? 2.1f : 1.74f;
    }

    @Override
    public double Y() {
        return -0.35;
    }

    public boolean q() {
        return (Boolean)this.bE.a(b);
    }

    public void a(boolean bl2) {
        this.bE.b(b, bl2);
    }
}

