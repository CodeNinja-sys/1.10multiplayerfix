/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.h;

import java.util.List;
import net.minecraft.a.w;
import net.minecraft.client.c.e;
import net.minecraft.client.h.a;
import net.minecraft.client.k.ag;
import net.minecraft.client.k.b.b;
import net.minecraft.client.k.b.h;
import net.minecraft.client.k.b.i;
import net.minecraft.client.k.b.j;
import net.minecraft.client.k.b.m;
import net.minecraft.client.k.b.n;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ct;
import net.minecraft.client.k.dc;
import net.minecraft.client.k.dh;
import net.minecraft.client.k.dj;
import net.minecraft.client.k.do;
import net.minecraft.client.l.g;
import net.minecraft.client.r;
import net.minecraft.d.c;
import net.minecraft.f.ad;
import net.minecraft.f.q;
import net.minecraft.h.k;
import net.minecraft.m.by;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.f;
import net.minecraft.u.b.s;
import net.minecraft.u.bl;
import net.minecraft.u.bv;
import net.minecraft.w.aj;
import net.minecraft.w.f.ab;
import net.minecraft.w.h.al;
import net.minecraft.x.d.a.ae;
import net.minecraft.x.d.a.ah;
import net.minecraft.x.d.a.l;
import net.minecraft.x.d.a.p;
import net.minecraft.x.d.a.v;
import net.minecraft.x.d.a.x;
import net.minecraft.x.d.a.y;
import net.minecraft.x.d.a.z;

public class d
extends a {
    public final g d;
    private final f bZ;
    private int ca = 0;
    private double cb;
    private double cc;
    private double cd;
    private float ce;
    private float cf;
    private boolean cg;
    private boolean ch;
    private boolean ci;
    private int cj;
    private boolean ck;
    private String cl;
    public bl e;
    protected r f;
    protected int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    private int cm;
    private float cn;
    public float m;
    public float n;
    private boolean co;
    private net.minecraft.u.ah cp;
    private boolean cq;
    private boolean cr = true;
    private int cs;
    private boolean ct;

    public d(r r2, net.minecraft.q.k k2, g g2, f f2) {
        super(k2, g2.d());
        this.d = g2;
        this.bZ = f2;
        this.f = r2;
        this.bS = 0;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        return false;
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public boolean a(net.minecraft.w.n n2, boolean bl2) {
        if (!super.a(n2, bl2)) {
            return false;
        }
        if (n2 instanceof net.minecraft.w.f.f) {
            this.f.U().a(new net.minecraft.client.c.m(this, (net.minecraft.w.f.f)n2));
        }
        if (n2 instanceof ab) {
            this.bc = n2.ba;
            this.ba = n2.ba;
            this.k(n2.ba);
        }
        return true;
    }

    @Override
    public void o() {
        super.o();
        this.cq = false;
    }

    @Override
    public void cE_() {
        if (this.aQ.d(new net.minecraft.u.b.b(this.aU, 0.0, this.aW))) {
            super.cE_();
            if (this.cz()) {
                this.d.a(new net.minecraft.x.d.a.w(this.ba, this.bb, this.be));
                this.d.a(new net.minecraft.x.d.a.f(this.aB, this.aC, this.e.g, this.e.h));
                net.minecraft.w.n n2 = this.dd();
                if (n2 != this && n2.de()) {
                    this.d.a(new net.minecraft.x.d.a.d(n2));
                }
            } else {
                this.p();
            }
        }
    }

    public void p() {
        boolean bl2;
        boolean bl3 = this.cB();
        if (bl3 != this.ci) {
            if (bl3) {
                this.d.a(new p(this, net.minecraft.x.d.a.h.d));
            } else {
                this.d.a(new p(this, net.minecraft.x.d.a.h.e));
            }
            this.ci = bl3;
        }
        if ((bl2 = this.G()) != this.ch) {
            if (bl2) {
                this.d.a(new p(this, net.minecraft.x.d.a.h.a));
            } else {
                this.d.a(new p(this, net.minecraft.x.d.a.h.b));
            }
            this.ch = bl2;
        }
        if (this.I()) {
            boolean bl4;
            net.minecraft.u.b.a a2 = this.cT();
            double d2 = this.aU - this.cb;
            double d3 = a2.b - this.cc;
            double d4 = this.aW - this.cd;
            double d5 = this.ba - this.ce;
            double d6 = this.bb - this.cf;
            ++this.cj;
            boolean bl5 = d2 * d2 + d3 * d3 + d4 * d4 > 9.0E-4 || this.cj >= 20;
            boolean bl6 = bl4 = d5 != 0.0 || d6 != 0.0;
            if (this.cz()) {
                this.d.a(new z(this.aX, -999.0, this.aZ, this.ba, this.bb, this.be));
                bl5 = false;
            } else if (bl5 && bl4) {
                this.d.a(new z(this.aU, a2.b, this.aW, this.ba, this.bb, this.be));
            } else if (bl5) {
                this.d.a(new net.minecraft.x.d.a.c(this.aU, a2.b, this.aW, this.be));
            } else if (bl4) {
                this.d.a(new net.minecraft.x.d.a.w(this.ba, this.bb, this.be));
            } else if (this.cg != this.be) {
                this.d.a(new l(this.be));
            }
            if (bl5) {
                this.cb = this.aU;
                this.cc = a2.b;
                this.cd = this.aW;
                this.cj = 0;
            }
            if (bl4) {
                this.ce = this.ba;
                this.cf = this.bb;
            }
            this.cg = this.be;
            this.cr = this.f.w.R;
        }
    }

    @Override
    public net.minecraft.w.f.ae a(boolean bl2) {
        ae ae2 = bl2 ? net.minecraft.x.d.a.ae.d : net.minecraft.x.d.a.ae.e;
        this.d.a(new net.minecraft.x.d.a.ab(ae2, net.minecraft.u.b.b.c, net.minecraft.u.ad.a));
        return null;
    }

    @Override
    protected cu a(net.minecraft.w.f.ae ae2) {
        return null;
    }

    public void b(String string) {
        this.d.a(new v(string));
    }

    @Override
    public void a(net.minecraft.u.ah ah2) {
        super.a(ah2);
        this.d.a(new net.minecraft.x.d.a.n(ah2));
    }

    @Override
    public void q() {
        this.d.a(new x(net.minecraft.x.d.a.ah.a));
    }

    @Override
    protected void b(net.minecraft.u.n n2, float f2) {
        if (!this.b(n2)) {
            this.h(this.bo() - f2);
        }
    }

    @Override
    public void r() {
        this.d.a(new net.minecraft.x.d.a.a(this.s.f));
        this.s();
    }

    public void s() {
        this.q.e(null);
        super.r();
        this.f.a((cc)null);
    }

    public void b(float f2) {
        if (this.ck) {
            float f3 = this.bo() - f2;
            if (f3 <= 0.0f) {
                this.h(f2);
                if (f3 < 0.0f) {
                    this.bB = this.af / 2;
                }
            } else {
                this.az = f3;
                this.h(this.bo());
                this.bB = this.af;
                this.b(net.minecraft.u.n.m, f3);
                this.V = this.W = 10;
            }
        } else {
            this.h(f2);
            this.ck = true;
        }
    }

    @Override
    public void a(net.minecraft.r.k k2, int n2) {
        if (k2 != null && k2.f) {
            super.a(k2, n2);
        }
    }

    @Override
    public void t() {
        this.d.a(new y(this.J));
    }

    @Override
    public boolean u() {
        return true;
    }

    protected void v() {
        this.d.a(new p(this, net.minecraft.x.d.a.h.f, net.minecraft.u.b.n.d(this.F() * 100.0f)));
    }

    public void w() {
        this.d.a(new p(this, net.minecraft.x.d.a.h.h));
    }

    public void c(String string) {
        this.cl = string;
    }

    public String x() {
        return this.cl;
    }

    public f y() {
        return this.bZ;
    }

    public int z() {
        return this.ca;
    }

    public void a(int n2) {
        this.ca = n2;
    }

    @Override
    public void b(net.minecraft.u.d.a a2) {
        this.f.t.c().a(a2);
    }

    @Override
    protected boolean a(double d2, double d3, double d4) {
        if (this.bv) {
            return false;
        }
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(d2, d3, d4);
        double d5 = d2 - (double)b2.cy_();
        double d6 = d4 - (double)b2.l();
        if (!this.f(b2)) {
            int n2 = -1;
            double d7 = 9999.0;
            if (this.f(b2.f()) && d5 < d7) {
                d7 = d5;
                n2 = 0;
            }
            if (this.f(b2.g()) && 1.0 - d5 < d7) {
                d7 = 1.0 - d5;
                n2 = 1;
            }
            if (this.f(b2.d()) && d6 < d7) {
                d7 = d6;
                n2 = 4;
            }
            if (this.f(b2.e()) && 1.0 - d6 < d7) {
                d7 = 1.0 - d6;
                n2 = 5;
            }
            float f2 = 0.1f;
            if (n2 == 0) {
                this.aX = -0.1f;
            }
            if (n2 == 1) {
                this.aX = 0.1f;
            }
            if (n2 == 4) {
                this.aZ = -0.1f;
            }
            if (n2 == 5) {
                this.aZ = 0.1f;
            }
        }
        return false;
    }

    private boolean f(net.minecraft.u.b.b b2) {
        return !this.aQ.n(b2).o() && !this.aQ.n(b2.b()).o();
    }

    @Override
    public void b(boolean bl2) {
        super.b(bl2);
        this.h = 0;
    }

    public void a(float f2, int n2, int n3) {
        this.M = f2;
        this.L = n2;
        this.K = n3;
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        this.f.t.c().a(a2);
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= this.z();
    }

    @Override
    public void a(byte by2) {
        if (by2 >= 24 && by2 <= 28) {
            this.a(by2 - 24);
        } else {
            super.a(by2);
        }
    }

    @Override
    public net.minecraft.u.b.b aC() {
        return new net.minecraft.u.b.b(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5);
    }

    @Override
    public void a(bv bv2, float f2, float f3) {
        this.aQ.a(this.aU, this.aV, this.aW, bv2, this.S(), f2, f3, false);
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public void b(net.minecraft.u.ah ah2) {
        cu cu2 = this.c(ah2);
        if (cu2 != null && !this.B()) {
            super.b(ah2);
            this.co = true;
            this.cp = ah2;
        }
    }

    @Override
    public boolean B() {
        return this.co;
    }

    @Override
    public void C() {
        super.C();
        this.co = false;
    }

    @Override
    public net.minecraft.u.ah D() {
        return this.cp;
    }

    @Override
    public void a(net.minecraft.x.a.g g2) {
        super.a(g2);
        if (Q.equals(g2)) {
            net.minecraft.u.ah ah2;
            boolean bl2 = ((Byte)this.bE.a(Q) & 1) > 0;
            net.minecraft.u.ah ah3 = ah2 = ((Byte)this.bE.a(Q) & 2) > 0 ? net.minecraft.u.ah.b : net.minecraft.u.ah.a;
            if (bl2 && !this.co) {
                this.b(ah2);
            } else if (!bl2 && this.co) {
                this.C();
            }
        }
        if (bF.equals(g2) && this.bW() && !this.ct) {
            this.f.U().a(new net.minecraft.client.c.i(this));
        }
    }

    public boolean E() {
        net.minecraft.w.n n2 = this.df();
        return this.cz() && n2 instanceof net.minecraft.w.i && ((net.minecraft.w.i)((Object)n2)).b();
    }

    public float F() {
        return this.cn;
    }

    @Override
    public void a(ad ad2) {
        this.f.a(new net.minecraft.client.k.b.r(ad2));
    }

    @Override
    public void a(q q2) {
        this.f.a(new j(q2));
    }

    @Override
    public void a(net.minecraft.f.h h2) {
        this.f.a(new ag(h2));
    }

    @Override
    public void a(net.minecraft.f.ab ab2) {
        this.f.a(new net.minecraft.client.k.b.f(ab2));
    }

    @Override
    public void a(cu cu2, net.minecraft.u.ah ah2) {
        cg cg2 = cu2.a();
        if (cg2 == net.minecraft.a.w.bW) {
            this.f.a(new dj(this, cu2, true));
        }
    }

    @Override
    public void a(net.minecraft.h.y y2) {
        String string;
        String string2 = string = y2 instanceof net.minecraft.q.d ? ((net.minecraft.q.d)((Object)y2)).h() : "minecraft:container";
        if ("minecraft:chest".equals(string)) {
            this.f.a(new h(this.q, y2));
        } else if ("minecraft:hopper".equals(string)) {
            this.f.a(new do(this.q, y2));
        } else if ("minecraft:furnace".equals(string)) {
            this.f.a(new b(this.q, y2));
        } else if ("minecraft:brewing_stand".equals(string)) {
            this.f.a(new net.minecraft.client.k.b.a(this.q, y2));
        } else if ("minecraft:beacon".equals(string)) {
            this.f.a(new m(this.q, y2));
        } else if (!"minecraft:dispenser".equals(string) && !"minecraft:dropper".equals(string)) {
            this.f.a(new h(this.q, y2));
        } else {
            this.f.a(new net.minecraft.client.k.b.d(this.q, y2));
        }
    }

    @Override
    public void a(al al2, net.minecraft.h.y y2) {
        this.f.a(new n(this.q, y2, al2));
    }

    @Override
    public void a(net.minecraft.q.d d2) {
        String string = d2.h();
        if ("minecraft:crafting_table".equals(string)) {
            this.f.a(new i(this.q, this.aQ));
        } else if ("minecraft:enchanting_table".equals(string)) {
            this.f.a(new dc(this.q, this.aQ, d2));
        } else if ("minecraft:anvil".equals(string)) {
            this.f.a(new dh(this.q, this.aQ));
        }
    }

    @Override
    public void a(aj aj2) {
        this.f.a(new ct(this.q, aj2, this.aQ));
    }

    @Override
    public void a(net.minecraft.w.n n2) {
        this.f.l.a(n2, net.minecraft.u.aj.j);
    }

    @Override
    public void b(net.minecraft.w.n n2) {
        this.f.l.a(n2, net.minecraft.u.aj.k);
    }

    @Override
    public boolean G() {
        boolean bl2;
        boolean bl3 = bl2 = this.e != null ? this.e.h : false;
        return bl2 && !this.E;
    }

    @Override
    public void H() {
        super.H();
        if (this.I()) {
            this.aB = this.e.a;
            this.aC = this.e.b;
            this.aA = this.e.g;
            this.k = this.i;
            this.l = this.j;
            this.j = (float)((double)this.j + (double)(this.bb - this.j) * 0.5);
            this.i = (float)((double)this.i + (double)(this.ba - this.i) * 0.5);
        }
    }

    protected boolean I() {
        return this.f.Z() == this;
    }

    @Override
    public void n() {
        Object object;
        boolean bl2;
        ++this.h;
        if (this.g > 0) {
            --this.g;
        }
        this.n = this.m;
        if (this.bQ) {
            if (this.f.o != null && !this.f.o.cq_()) {
                this.f.a((cc)null);
            }
            if (this.m == 0.0f) {
                this.f.U().a(net.minecraft.client.c.e.a(net.minecraft.a.f.ez, this.bx.nextFloat() * 0.4f + 0.8f));
            }
            this.m += 0.0125f;
            if (this.m >= 1.0f) {
                this.m = 1.0f;
            }
            this.bQ = false;
        } else if (this.b(net.minecraft.a.c.i) && this.c(net.minecraft.a.c.i).b() > 60) {
            this.m += 0.006666667f;
            if (this.m > 1.0f) {
                this.m = 1.0f;
            }
        } else {
            if (this.m > 0.0f) {
                this.m -= 0.05f;
            }
            if (this.m < 0.0f) {
                this.m = 0.0f;
            }
        }
        if (this.bP > 0) {
            --this.bP;
        }
        boolean bl3 = this.e.g;
        boolean bl4 = this.e.h;
        float f2 = 0.8f;
        boolean bl5 = this.e.b >= 0.8f;
        this.e.a();
        if (this.B() && !this.cz()) {
            this.e.a *= 0.2f;
            this.e.b *= 0.2f;
            this.g = 0;
        }
        boolean bl6 = false;
        if (this.cs > 0) {
            --this.cs;
            bl6 = true;
            this.e.g = true;
        }
        net.minecraft.u.b.a a2 = this.cT();
        this.a(this.aU - (double)this.bl * 0.35, a2.b + 0.5, this.aW + (double)this.bl * 0.35);
        this.a(this.aU - (double)this.bl * 0.35, a2.b + 0.5, this.aW - (double)this.bl * 0.35);
        this.a(this.aU + (double)this.bl * 0.35, a2.b + 0.5, this.aW - (double)this.bl * 0.35);
        this.a(this.aU + (double)this.bl * 0.35, a2.b + 0.5, this.aW + (double)this.bl * 0.35);
        boolean bl7 = bl2 = (float)this.ap().a() > 6.0f || this.J.c;
        if (this.be && !bl4 && !bl5 && this.e.b >= 0.8f && !this.cB() && bl2 && !this.B() && !this.b(net.minecraft.a.c.o)) {
            if (this.g <= 0 && !this.f.w.Y.e()) {
                this.g = 7;
            } else {
                this.b(true);
            }
        }
        if (!this.cB() && this.e.b >= 0.8f && bl2 && !this.B() && !this.b(net.minecraft.a.c.o) && this.f.w.Y.e()) {
            this.b(true);
        }
        if (this.cB() && (this.e.b < 0.8f || this.bf || !bl2)) {
            this.b(false);
        }
        if (this.J.c) {
            if (this.f.d.k()) {
                if (!this.J.b) {
                    this.J.b = true;
                    this.t();
                }
            } else if (!bl3 && this.e.g && !bl6) {
                if (this.u == 0) {
                    this.u = 7;
                } else {
                    this.J.b = !this.J.b;
                    this.t();
                    this.u = 0;
                }
            }
        }
        if (this.e.g && !bl3 && !this.be && this.aY < 0.0 && !this.bW() && !this.J.b && (object = this.a(net.minecraft.h.k.e)) != null && ((cu)object).a() == net.minecraft.a.w.cR && net.minecraft.m.by.h((cu)object)) {
            this.d.a(new p(this, net.minecraft.x.d.a.h.i));
        }
        this.ct = this.bW();
        if (this.J.b && this.I()) {
            if (this.e.h) {
                this.e.a = (float)((double)this.e.a / 0.3);
                this.e.b = (float)((double)this.e.b / 0.3);
                this.aY -= (double)(this.J.a() * 3.0f);
            }
            if (this.e.g) {
                this.aY += (double)(this.J.a() * 3.0f);
            }
        }
        if (this.E()) {
            object = (net.minecraft.w.i)((Object)this.df());
            if (this.cm < 0) {
                ++this.cm;
                if (this.cm == 0) {
                    this.cn = 0.0f;
                }
            }
            if (bl3 && !this.e.g) {
                this.cm = -10;
                object.a(net.minecraft.u.b.n.d(this.F() * 100.0f));
                this.v();
            } else if (!bl3 && this.e.g) {
                this.cm = 0;
                this.cn = 0.0f;
            } else if (bl3) {
                ++this.cm;
                this.cn = this.cm < 10 ? (float)this.cm * 0.1f : 0.8f + 2.0f / (float)(this.cm - 9) * 0.1f;
            }
        } else {
            this.cn = 0.0f;
        }
        super.n();
        if (this.be && this.J.b && !this.f.d.k()) {
            this.J.b = false;
            this.t();
        }
    }

    @Override
    public void J() {
        super.J();
        this.cq = false;
        if (this.df() instanceof ab) {
            ab ab2 = (ab)this.df();
            ab2.a(this.e.e, this.e.f, this.e.c, this.e.d);
            this.cq |= this.e.e || this.e.f || this.e.c || this.e.d;
        }
    }

    public boolean K() {
        return this.cq;
    }

    @Override
    public net.minecraft.d.j a(c c2) {
        if (c2 == net.minecraft.a.c.i) {
            this.n = 0.0f;
            this.m = 0.0f;
        }
        return super.a(c2);
    }

    @Override
    public void b(double d2, double d3, double d4) {
        double d5 = this.aU;
        double d6 = this.aW;
        super.b(d2, d3, d4);
        this.a((float)(this.aU - d5), (float)(this.aW - d6));
    }

    public boolean L() {
        return this.cr;
    }

    protected void a(float f2, float f3) {
        if (this.L() && this.cs <= 0 && this.be && !this.G() && !this.cz()) {
            net.minecraft.u.b.r r2 = this.e.b();
            if (r2.i != 0.0f || r2.j != 0.0f) {
                net.minecraft.g.c.b b2;
                net.minecraft.u.b.b b3;
                net.minecraft.g.c.b b4;
                float f4;
                float f5;
                s s2 = new s(this.aU, this.cT().b, this.aW);
                double d2 = this.aU + (double)f2;
                double d3 = this.aW + (double)f3;
                s s3 = new s(d2, this.cT().b, d3);
                s s4 = new s(f2, 0.0, f3);
                float f6 = this.ak();
                float f7 = (float)s4.c();
                if (f7 <= 0.001f) {
                    f5 = f6 * r2.i;
                    float f8 = f6 * r2.j;
                    float f9 = net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180));
                    f4 = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180));
                    s4 = new s(f5 * f4 - f8 * f9, s4.c, f8 * f4 + f5 * f9);
                    f7 = (float)s4.c();
                    if (f7 <= 0.001f) {
                        return;
                    }
                }
                f5 = (float)net.minecraft.u.b.n.i(f7);
                s s5 = s4.a((double)f5);
                s s6 = this.cw();
                f4 = (float)(s6.b * s5.b + s6.d * s5.d);
                if (f4 >= -0.15f && (b4 = this.aQ.n(b3 = new net.minecraft.u.b.b(this.aU, this.cT().e, this.aW))).d(this.aQ, b3) == null && (b2 = this.aQ.n(b3 = b3.b())).d(this.aQ, b3) == null) {
                    float f10;
                    float f11 = 7.0f;
                    float f12 = 1.2f;
                    if (this.b(net.minecraft.a.c.h)) {
                        f12 += (float)(this.c(net.minecraft.a.c.h).c() + 1) * 0.75f;
                    }
                    float f13 = Math.max(f6 * 7.0f, 1.0f / f5);
                    s s7 = s3.e(s5.a((double)f13));
                    float f14 = this.bl;
                    float f15 = this.bm;
                    net.minecraft.u.b.a a2 = new net.minecraft.u.b.a(s2, s7.b(0.0, f15, 0.0)).b((double)f14, 0.0, f14);
                    s s8 = s2.b(0.0, 0.51f, 0.0);
                    s7 = s7.b(0.0, 0.51f, 0.0);
                    s s9 = s5.c(new s(0.0, 1.0, 0.0));
                    s s10 = s9.a((double)(f14 * 0.5f));
                    s s11 = s8.d(s10);
                    s s12 = s7.d(s10);
                    s s13 = s8.e(s10);
                    s s14 = s7.e(s10);
                    List list = this.aQ.a((net.minecraft.w.n)this, a2);
                    if (!list.isEmpty()) {
                        // empty if block
                    }
                    float f16 = Float.MIN_VALUE;
                    for (net.minecraft.u.b.a a3 : list) {
                        if (!a3.a(s11, s12) && !a3.a(s13, s14)) continue;
                        f16 = (float)a3.e;
                        s s15 = a3.c();
                        net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(s15);
                        int n2 = 1;
                        while (!((float)n2 >= f12)) {
                            net.minecraft.g.c.b b6;
                            net.minecraft.u.b.b b7 = b5.a(n2);
                            net.minecraft.g.c.b b8 = this.aQ.n(b7);
                            net.minecraft.u.b.a a4 = b8.d(this.aQ, b7);
                            if (a4 != null && (double)(f16 = (float)a4.e + (float)b7.k()) - this.cT().b > (double)f12) {
                                return;
                            }
                            if (n2 > 1 && (b6 = this.aQ.n(b3 = b3.b())).d(this.aQ, b3) != null) {
                                return;
                            }
                            ++n2;
                        }
                        break block0;
                    }
                    if (f16 != Float.MIN_VALUE && (f10 = (float)((double)f16 - this.cT().b)) > 0.5f && f10 <= f12) {
                        this.cs = 1;
                    }
                }
            }
        }
    }
}

