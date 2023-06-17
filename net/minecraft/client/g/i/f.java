/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.i.a;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.ab;
import net.minecraft.client.g.i.ad;
import net.minecraft.client.g.i.ae;
import net.minecraft.client.g.i.af;
import net.minecraft.client.g.i.ag;
import net.minecraft.client.g.i.ah;
import net.minecraft.client.g.i.aj;
import net.minecraft.client.g.i.ak;
import net.minecraft.client.g.i.am;
import net.minecraft.client.g.i.an;
import net.minecraft.client.g.i.ao;
import net.minecraft.client.g.i.ap;
import net.minecraft.client.g.i.aq;
import net.minecraft.client.g.i.ar;
import net.minecraft.client.g.i.as;
import net.minecraft.client.g.i.at;
import net.minecraft.client.g.i.au;
import net.minecraft.client.g.i.av;
import net.minecraft.client.g.i.ay;
import net.minecraft.client.g.i.az;
import net.minecraft.client.g.i.ba;
import net.minecraft.client.g.i.bb;
import net.minecraft.client.g.i.bc;
import net.minecraft.client.g.i.bd;
import net.minecraft.client.g.i.be;
import net.minecraft.client.g.i.bf;
import net.minecraft.client.g.i.bg;
import net.minecraft.client.g.i.bh;
import net.minecraft.client.g.i.bi;
import net.minecraft.client.g.i.bj;
import net.minecraft.client.g.i.bl;
import net.minecraft.client.g.i.bm;
import net.minecraft.client.g.i.bp;
import net.minecraft.client.g.i.bq;
import net.minecraft.client.g.i.br;
import net.minecraft.client.g.i.bs;
import net.minecraft.client.g.i.c;
import net.minecraft.client.g.i.d;
import net.minecraft.client.g.i.e;
import net.minecraft.client.g.i.g;
import net.minecraft.client.g.i.h;
import net.minecraft.client.g.i.i;
import net.minecraft.client.g.i.j;
import net.minecraft.client.g.i.k;
import net.minecraft.client.g.i.l;
import net.minecraft.client.g.i.m;
import net.minecraft.client.g.i.o;
import net.minecraft.client.g.i.p;
import net.minecraft.client.g.i.q;
import net.minecraft.client.g.i.s;
import net.minecraft.client.g.i.t;
import net.minecraft.client.g.i.u;
import net.minecraft.client.g.i.v;
import net.minecraft.client.g.i.w;
import net.minecraft.client.g.i.x;
import net.minecraft.client.g.i.y;
import net.minecraft.client.g.i.z;
import net.minecraft.client.j.ai;
import net.minecraft.client.k.ce;
import net.minecraft.client.r;
import net.minecraft.g.cn;
import net.minecraft.u.bo;
import net.minecraft.w.c.b;
import net.minecraft.w.e.bk;
import net.minecraft.w.e.bn;
import net.minecraft.w.e.n;
import net.minecraft.w.h.ac;
import net.minecraft.w.h.al;

public class f {
    private final Map k = sz.c();
    private final Map l = sz.c();
    private final ab m;
    private ce n;
    private double o;
    private double p;
    private double q;
    public net.minecraft.client.g.a.c a;
    public net.minecraft.q.k b;
    public net.minecraft.w.n c;
    public net.minecraft.w.n d;
    public float e;
    public float f;
    public net.minecraft.client.b.a g;
    public double h;
    public double i;
    public double j;
    private boolean r;
    private boolean s = true;
    private boolean t;

    public f(net.minecraft.client.g.a.c c2, net.minecraft.client.g.t t2) {
        this.a = c2;
        this.k.put(bk.class, new aj(this));
        this.k.put(net.minecraft.w.e.c.class, new bb(this));
        this.k.put(net.minecraft.w.h.l.class, new j(this, new net.minecraft.client.j.v(), 0.7f));
        this.k.put(net.minecraft.w.h.ad.class, new ba(this, new net.minecraft.client.j.j(), 0.7f));
        this.k.put(net.minecraft.w.h.ab.class, new bq(this, new net.minecraft.client.j.ab(), 0.7f));
        this.k.put(net.minecraft.w.h.w.class, new au(this, new net.minecraft.client.j.ab(), 0.7f));
        this.k.put(net.minecraft.w.h.e.class, new ag(this, new net.minecraft.client.j.au(), 0.5f));
        this.k.put(net.minecraft.w.h.ah.class, new q(this, new net.minecraft.client.j.n(), 0.3f));
        this.k.put(net.minecraft.w.h.u.class, new z(this, new net.minecraft.client.j.af(), 0.4f));
        this.k.put(net.minecraft.w.h.am.class, new an(this, new net.minecraft.client.j.an(), 0.3f));
        this.k.put(net.minecraft.w.e.aj.class, new bh(this));
        this.k.put(net.minecraft.w.e.q.class, new bg(this));
        this.k.put(net.minecraft.w.e.bi.class, new af(this));
        this.k.put(net.minecraft.w.e.au.class, new l(this));
        this.k.put(net.minecraft.w.e.bb.class, new bd(this));
        this.k.put(net.minecraft.w.e.ay.class, new bf(this));
        this.k.put(net.minecraft.w.e.u.class, new az(this));
        this.k.put(net.minecraft.w.e.aa.class, new ad(this));
        this.k.put(net.minecraft.w.e.ao.class, new ar(this));
        this.k.put(net.minecraft.w.e.d.class, new as(this));
        this.k.put(net.minecraft.w.e.av.class, new e(this, new ai(16), 0.25f));
        this.k.put(net.minecraft.w.e.bh.class, new y(this));
        this.k.put(net.minecraft.w.e.be.class, new bl(this, new net.minecraft.client.j.c(), 0.5f, 6.0f));
        this.k.put(bn.class, new bi(this));
        this.k.put(ac.class, new aq(this, new net.minecraft.client.j.ay(), 0.7f));
        this.k.put(net.minecraft.w.h.ak.class, new ae(this));
        this.k.put(net.minecraft.w.e.bj.class, new ap(this));
        this.k.put(net.minecraft.w.h.aj.class, new bp(this));
        this.k.put(net.minecraft.w.e.g.class, new bj(this));
        this.k.put(net.minecraft.w.e.as.class, new ao(this, new net.minecraft.client.j.ac()));
        this.k.put(n.class, new ak(this, new net.minecraft.client.j.i(), 0.7f));
        this.k.put(net.minecraft.w.d.a.class, new o(this));
        this.k.put(net.minecraft.w.f.ad.class, new net.minecraft.client.g.c.g(this));
        this.k.put(net.minecraft.w.d.e.class, new v(this));
        this.k.put(net.minecraft.w.n.class, new x(this));
        this.k.put(net.minecraft.w.f.q.class, new a(this));
        this.k.put(net.minecraft.w.f.l.class, new net.minecraft.client.g.c.m(this, t2));
        this.k.put(net.minecraft.w.p.class, new p(this));
        this.k.put(net.minecraft.w.c.i.class, new d(this));
        this.k.put(net.minecraft.w.c.h.class, new h(this));
        this.k.put(net.minecraft.w.c.r.class, new c(this, net.minecraft.a.w.aF, t2));
        this.k.put(net.minecraft.w.f.k.class, new c(this, net.minecraft.a.w.bB, t2));
        this.k.put(net.minecraft.w.f.a.class, new c(this, net.minecraft.a.w.bR, t2));
        this.k.put(net.minecraft.w.c.m.class, new c(this, net.minecraft.a.w.aW, t2));
        this.k.put(net.minecraft.w.c.k.class, new bs(this, t2));
        this.k.put(net.minecraft.w.f.p.class, new c(this, net.minecraft.a.w.bU, t2));
        this.k.put(net.minecraft.w.f.h.class, new c(this, net.minecraft.a.w.cl, t2));
        this.k.put(net.minecraft.w.c.g.class, new av(this, 2.0f));
        this.k.put(net.minecraft.w.c.d.class, new av(this, 0.5f));
        this.k.put(net.minecraft.w.c.o.class, new ah(this));
        this.k.put(b.class, new net.minecraft.client.g.c.q(this));
        this.k.put(net.minecraft.w.c.j.class, new s(this));
        this.k.put(net.minecraft.w.f.ae.class, new g(this, t2));
        this.k.put(net.minecraft.w.f.e.class, new m(this));
        this.k.put(net.minecraft.w.f.af.class, new u(this));
        this.k.put(net.minecraft.w.f.n.class, new be(this));
        this.k.put(net.minecraft.w.f.j.class, new bm(this));
        this.k.put(net.minecraft.w.f.c.class, new t(this));
        this.k.put(net.minecraft.w.f.aa.class, new w(this));
        this.k.put(net.minecraft.w.f.f.class, new i(this));
        this.k.put(net.minecraft.w.f.ab.class, new am(this));
        this.k.put(net.minecraft.w.c.a.class, new bc(this));
        this.k.put(net.minecraft.w.a.class, new at(this));
        this.k.put(al.class, new k(this, new net.minecraft.client.j.be(), 0.75f));
        this.k.put(net.minecraft.w.g.a.class, new br(this));
        this.k.put(net.minecraft.l.b.b.class, new ay(this));
        this.m = new ab(this);
        this.l.put("default", this.m);
        this.l.put("slim", new ab(this, true));
    }

    public void a(double d2, double d3, double d4) {
        this.o = d2;
        this.p = d3;
        this.q = d4;
    }

    public aa a(Class class_) {
        aa aa2 = (aa)this.k.get(class_);
        if (aa2 == null && class_ != net.minecraft.w.n.class) {
            aa2 = this.a(class_.getSuperclass());
            this.k.put(class_, aa2);
        }
        return aa2;
    }

    public aa a(net.minecraft.w.n n2) {
        if (n2 instanceof net.minecraft.client.h.a) {
            String string = ((net.minecraft.client.h.a)n2).k();
            ab ab2 = (ab)this.l.get(string);
            return ab2 != null ? ab2 : this.m;
        }
        return this.a(n2.getClass());
    }

    public void a(net.minecraft.q.k k2, ce ce2, net.minecraft.w.n n2, net.minecraft.w.n n3, net.minecraft.client.b.a a2, float f2) {
        this.b = k2;
        this.g = a2;
        this.c = n2;
        this.d = n3;
        this.n = ce2;
        if (n2 instanceof net.minecraft.w.l && ((net.minecraft.w.l)n2).ae()) {
            net.minecraft.g.c.b b2 = k2.n(new net.minecraft.u.b.b(n2));
            cn cn2 = b2.c();
            if (cn2 == net.minecraft.a.p.C) {
                int n4 = ((net.minecraft.u.ad)((Object)b2.a(net.minecraft.g.av.j))).c();
                this.e = n4 * 90 + 180;
                this.f = 0.0f;
            }
        } else {
            this.e = n2.bc + (n2.ba - n2.bc) * f2;
            this.f = n2.bd + (n2.bb - n2.bd) * f2;
        }
        if (a2.as == 2) {
            this.e += 180.0f;
        }
        this.h = n2.br + (n2.aU - n2.br) * (double)f2;
        this.i = n2.bs + (n2.aV - n2.bs) * (double)f2;
        this.j = n2.bt + (n2.aW - n2.bt) * (double)f2;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public boolean a() {
        return this.s;
    }

    public void a(boolean bl2) {
        this.s = bl2;
    }

    public void b(boolean bl2) {
        this.t = bl2;
    }

    public boolean b() {
        return this.t;
    }

    public boolean b(net.minecraft.w.n n2) {
        return this.a(n2).d();
    }

    public boolean a(net.minecraft.w.n n2, net.minecraft.client.g.g.d d2, double d3, double d4, double d5) {
        aa aa2 = this.a(n2);
        return aa2 != null && aa2.a(n2, d2, d3, d4, d5);
    }

    public void a(net.minecraft.w.n n2, float f2, boolean bl2) {
        if (n2.by == 0) {
            n2.br = n2.aU;
            n2.bs = n2.aV;
            n2.bt = n2.aW;
        }
        double d2 = n2.br + (n2.aU - n2.br) * (double)f2;
        double d3 = n2.bs + (n2.aV - n2.bs) * (double)f2;
        double d4 = n2.bt + (n2.aW - n2.bt) * (double)f2;
        float f3 = n2.bc + (n2.ba - n2.bc) * f2;
        int n3 = n2.m(f2);
        if (n2.cy()) {
            n3 = 0xF000F0;
        }
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        net.minecraft.client.g.ay.a(net.minecraft.client.g.ay.r, n4, (float)n5);
        net.minecraft.client.g.bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(n2, d2 - this.o, d3 - this.p, d4 - this.q, f3, f2, bl2);
    }

    public void a(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        block9: {
            aa aa2 = null;
            try {
                aa2 = this.a(n2);
                if (aa2 == null || this.a == null) break block9;
                try {
                    aa2.a(this.r);
                    aa2.a(n2, d2, d3, d4, f2, f3);
                }
                catch (Throwable throwable) {
                    throw new bo(net.minecraft.k.a.a(throwable, "Rendering entity in world"));
                }
                try {
                    if (!this.r) {
                        aa2.b(n2, d2, d3, d4, f2, f3);
                    }
                }
                catch (Throwable throwable) {
                    throw new bo(net.minecraft.k.a.a(throwable, "Post-rendering entity in world"));
                }
                if (!this.t || n2.cD() || bl2 || net.minecraft.client.r.z().al()) break block9;
                try {
                    this.a(n2, d2, d3, d4, f2, f3);
                }
                catch (Throwable throwable) {
                    throw new bo(net.minecraft.k.a.a(throwable, "Rendering entity hitbox in world"));
                }
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Rendering entity in world");
                net.minecraft.k.i i2 = a2.a("Entity being rendered");
                n2.a(i2);
                net.minecraft.k.i i3 = a2.a("Renderer details");
                i3.a("Assigned renderer", aa2);
                i3.a("Location", net.minecraft.k.i.a(d2, d3, d4));
                i3.a("Rotation", Float.valueOf(f2));
                i3.a("Delta", Float.valueOf(f3));
                throw new bo(a2);
            }
        }
    }

    public void a(net.minecraft.w.n n2, float f2) {
        if (n2.by == 0) {
            n2.br = n2.aU;
            n2.bs = n2.aV;
            n2.bt = n2.aW;
        }
        double d2 = n2.br + (n2.aU - n2.br) * (double)f2;
        double d3 = n2.bs + (n2.aV - n2.bs) * (double)f2;
        double d4 = n2.bt + (n2.aW - n2.bt) * (double)f2;
        float f3 = n2.bc + (n2.ba - n2.bc) * f2;
        int n3 = n2.m(f2);
        if (n2.cy()) {
            n3 = 0xF000F0;
        }
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        net.minecraft.client.g.ay.a(net.minecraft.client.g.ay.r, n4, (float)n5);
        net.minecraft.client.g.bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        aa aa2 = this.a(n2);
        if (aa2 != null && this.a != null) {
            aa2.c(n2, d2 - this.o, d3 - this.p, d4 - this.q, f3, f2);
        }
    }

    private void a(net.minecraft.w.n n2, double d2, double d3, double d4, float f2, float f3) {
        net.minecraft.client.g.bd.a(false);
        net.minecraft.client.g.bd.w();
        net.minecraft.client.g.bd.f();
        net.minecraft.client.g.bd.q();
        net.minecraft.client.g.bd.k();
        float f4 = n2.bl / 2.0f;
        net.minecraft.u.b.a a2 = n2.cT();
        net.minecraft.client.g.ar.a(a2.a - n2.aU + d2, a2.b - n2.aV + d3, a2.c - n2.aW + d4, a2.d - n2.aU + d2, a2.e - n2.aV + d3, a2.f - n2.aW + d4, 1.0f, 1.0f, 1.0f, 1.0f);
        if (n2 instanceof net.minecraft.w.l) {
            float f5 = 0.01f;
            net.minecraft.client.g.ar.a(d2 - (double)f4, d3 + (double)n2.ce_() - (double)0.01f, d4 - (double)f4, d2 + (double)f4, d3 + (double)n2.ce_() + (double)0.01f, d4 + (double)f4, 1.0f, 0.0f, 0.0f, 1.0f);
        }
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        net.minecraft.u.b.s s2 = n2.i(f3);
        g2.a(3, net.minecraft.client.g.d.b.f);
        g2.b(d2, d3 + (double)n2.ce_(), d4).b(0, 0, 255, 255).d();
        g2.b(d2 + s2.b * 2.0, d3 + (double)n2.ce_() + s2.c * 2.0, d4 + s2.d * 2.0).b(0, 0, 255, 255).d();
        ci2.b();
        net.minecraft.client.g.bd.v();
        net.minecraft.client.g.bd.e();
        net.minecraft.client.g.bd.p();
        net.minecraft.client.g.bd.k();
        net.minecraft.client.g.bd.a(true);
    }

    public void a(net.minecraft.q.k k2) {
        this.b = k2;
        if (k2 == null) {
            this.c = null;
        }
    }

    public double b(double d2, double d3, double d4) {
        double d5 = d2 - this.h;
        double d6 = d3 - this.i;
        double d7 = d4 - this.j;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public ce c() {
        return this.n;
    }

    public void c(boolean bl2) {
        this.r = bl2;
    }
}

