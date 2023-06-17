/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.a;

import com.a.a.d.ov;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import net.minecraft.a.w;
import net.minecraft.client.r;
import net.minecraft.f.ad;
import net.minecraft.g.av;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.h.aq;
import net.minecraft.h.au;
import net.minecraft.h.k;
import net.minecraft.h.p;
import net.minecraft.h.y;
import net.minecraft.m.by;
import net.minecraft.m.ca;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.q.am;
import net.minecraft.q.an;
import net.minecraft.q.v;
import net.minecraft.u.a.c;
import net.minecraft.u.ah;
import net.minecraft.u.ai;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.a;
import net.minecraft.w.a.e;
import net.minecraft.w.a.g;
import net.minecraft.w.a.j;
import net.minecraft.w.ae;
import net.minecraft.w.aj;
import net.minecraft.w.b.a.i;
import net.minecraft.w.d;
import net.minecraft.w.e.aw;
import net.minecraft.w.f;
import net.minecraft.w.f.ab;
import net.minecraft.w.h;
import net.minecraft.w.h.al;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.q;
import net.minecraft.x.a.o;

public abstract class b
extends l {
    private static final net.minecraft.x.a.g a = net.minecraft.x.a.o.a(b.class, net.minecraft.x.a.q.c);
    private static final net.minecraft.x.a.g b = net.minecraft.x.a.o.a(b.class, net.minecraft.x.a.q.b);
    protected static final net.minecraft.x.a.g o = net.minecraft.x.a.o.a(b.class, net.minecraft.x.a.q.a);
    protected static final net.minecraft.x.a.g p = net.minecraft.x.a.o.a(b.class, net.minecraft.x.a.q.a);
    public a q = new a(this);
    private p c = new p();
    public aq r;
    public aq s;
    protected net.minecraft.u.am t = new net.minecraft.u.am();
    protected int u;
    public float v;
    public float w;
    public int x;
    public double y;
    public double z;
    public double A;
    public double B;
    public double C;
    public double D;
    protected boolean E;
    public net.minecraft.u.b.b F;
    private int d;
    public float G;
    public float H;
    public float I;
    private net.minecraft.u.b.b e;
    private boolean f;
    private net.minecraft.u.b.b g;
    public e J = new e();
    public int K;
    public int L;
    public float M;
    private int h;
    protected float N = 0.1f;
    protected float O = 0.02f;
    private int i;
    private final com.c.a.e j;
    private boolean k;
    private cu l;
    private final net.minecraft.u.j m = this.M();
    public net.minecraft.w.c.a P;

    protected net.minecraft.u.j M() {
        return new net.minecraft.u.j();
    }

    public b(net.minecraft.q.k k2, com.c.a.e e2) {
        super(k2);
        this.a(net.minecraft.w.a.b.a(e2));
        this.j = e2;
        this.s = this.r = new net.minecraft.h.aj(this.q, !k2.C, this);
        net.minecraft.u.b.b b2 = k2.D();
        this.b((double)b2.cy_() + 0.5, b2.k() + 1, (double)b2.l() + 0.5, 0.0f, 0.0f);
        this.ax = 180.0f;
        this.bz = 20;
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.bA().b(net.minecraft.w.d.e).a(1.0);
        this.a(net.minecraft.w.d.d).a(0.1f);
        this.bA().b(net.minecraft.w.d.f);
        this.bA().b(net.minecraft.w.d.i);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, Float.valueOf(0.0f));
        this.bE.a(b, 0);
        this.bE.a(o, (byte)0);
        this.bE.a(p, (byte)1);
    }

    @Override
    public void cE_() {
        this.bv = this.a();
        if (this.a()) {
            this.be = false;
        }
        if (this.x > 0) {
            --this.x;
        }
        if (this.ae()) {
            ++this.d;
            if (this.d > 100) {
                this.d = 100;
            }
            if (!this.aQ.C) {
                if (!this.p()) {
                    this.a(true, true, false);
                } else if (this.aQ.n()) {
                    this.a(false, true, true);
                }
            }
        } else if (this.d > 0) {
            ++this.d;
            if (this.d >= 110) {
                this.d = 0;
            }
        }
        super.cE_();
        if (!this.aQ.C && this.s != null && !this.s.a(this)) {
            this.r();
            this.s = this.r;
        }
        if (this.cy() && this.J.a) {
            this.ce();
        }
        this.i();
        if (!this.cz()) {
            this.g = null;
        }
        if (!this.aQ.C) {
            this.t.a(this);
            this.a(net.minecraft.r.o.g);
            if (this.br()) {
                this.a(net.minecraft.r.o.h);
            }
            if (this.G()) {
                this.a(net.minecraft.r.o.i);
            }
        }
        int n2 = 29999999;
        double d2 = net.minecraft.u.b.n.a(this.aU, -2.9999999E7, 2.9999999E7);
        double d3 = net.minecraft.u.b.n.a(this.aW, -2.9999999E7, 2.9999999E7);
        if (d2 != this.aU || d3 != this.aW) {
            this.e(d2, this.aV, d3);
        }
        ++this.ab;
        cu cu2 = this.bC();
        if (!cu.b(this.l, cu2)) {
            if (!cu.d(this.l, cu2)) {
                this.aJ();
            }
            this.l = cu2 == null ? null : cu2.j();
        }
        this.m.a();
        this.N();
    }

    private void i() {
        this.y = this.B;
        this.z = this.C;
        this.A = this.D;
        double d2 = this.aU - this.B;
        double d3 = this.aV - this.C;
        double d4 = this.aW - this.D;
        double d5 = 10.0;
        if (d2 > 10.0) {
            this.y = this.B = this.aU;
        }
        if (d4 > 10.0) {
            this.A = this.D = this.aW;
        }
        if (d3 > 10.0) {
            this.z = this.C = this.aV;
        }
        if (d2 < -10.0) {
            this.y = this.B = this.aU;
        }
        if (d4 < -10.0) {
            this.A = this.D = this.aW;
        }
        if (d3 < -10.0) {
            this.z = this.C = this.aV;
        }
        this.B += d2 * 0.25;
        this.D += d4 * 0.25;
        this.C += d3 * 0.25;
    }

    protected void N() {
        float f2;
        float f3;
        if (this.bW()) {
            f3 = 0.6f;
            f2 = 0.6f;
        } else if (this.ae()) {
            f3 = 0.2f;
            f2 = 0.2f;
        } else if (this.G()) {
            f3 = 0.6f;
            f2 = 1.65f;
        } else {
            f3 = 0.6f;
            f2 = 1.8f;
        }
        if (f3 != this.bl || f2 != this.bm) {
            net.minecraft.u.b.a a2 = this.cT();
            a2 = new net.minecraft.u.b.a(a2.a, a2.b, a2.c, a2.a + (double)f3, a2.b + (double)f2, a2.c + (double)f3);
            if (!this.aQ.b(a2)) {
                this.d(f3, f2);
            }
        }
    }

    @Override
    public int O() {
        return this.J.a ? 1 : 80;
    }

    @Override
    protected bv P() {
        return net.minecraft.a.f.eq;
    }

    @Override
    protected bv Q() {
        return net.minecraft.a.f.ep;
    }

    @Override
    public int R() {
        return 10;
    }

    @Override
    public void a(bv bv2, float f2, float f3) {
        this.aQ.a(this, this.aU, this.aV, this.aW, bv2, this.S(), f2, f3);
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.h;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 9) {
            this.co_();
        } else if (by2 == 23) {
            this.k = false;
        } else if (by2 == 22) {
            this.k = true;
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean T() {
        return this.bo() <= 0.0f || this.ae();
    }

    protected void r() {
        this.s = this.r;
    }

    @Override
    public void J() {
        if (!this.aQ.C && this.G() && this.cz()) {
            this.o();
            this.m(false);
        } else {
            double d2 = this.aU;
            double d3 = this.aV;
            double d4 = this.aW;
            float f2 = this.ba;
            float f3 = this.bb;
            super.J();
            this.v = this.w;
            this.w = 0.0f;
            this.l(this.aU - d2, this.aV - d3, this.aW - d4);
            if (this.df() instanceof net.minecraft.w.h.l) {
                this.bb = f3;
                this.ba = f2;
                this.ak = ((net.minecraft.w.h.l)this.df()).ak;
            }
        }
    }

    @Override
    public void U() {
        this.d(0.6f, 1.8f);
        super.U();
        this.h(this.bw());
        this.Y = 0;
    }

    @Override
    protected void H() {
        if (net.minecraft.client.r.I.v != null) {
            net.minecraft.client.r.I.v.a(this);
        }
        super.H();
        this.bz();
        this.am = this.ba;
    }

    @Override
    public void n() {
        if (this.u > 0) {
            --this.u;
        }
        if (this.aQ.R() == net.minecraft.q.l.a && this.aQ.G().b("naturalRegeneration")) {
            if (this.bo() < this.bw() && this.by % 20 == 0) {
                this.a(1.0f);
            }
            if (this.t.b() && this.by % 10 == 0) {
                this.t.a(this.t.a() + 1);
            }
        }
        this.q.h();
        this.v = this.w;
        super.n();
        i i2 = this.a(net.minecraft.w.d.d);
        if (!this.aQ.C) {
            i2.a(this.J.b());
        }
        this.ao = this.O;
        if (this.cB()) {
            this.ao = (float)((double)this.ao + (double)this.O * 0.3);
        }
        this.e_((float)i2.f());
        float f2 = net.minecraft.u.b.n.a(this.aX * this.aX + this.aZ * this.aZ);
        float f3 = (float)(Math.atan(-this.aY * (double)0.2f) * 15.0);
        if (f2 > 0.1f) {
            f2 = 0.1f;
        }
        if (!this.be || this.bo() <= 0.0f) {
            f2 = 0.0f;
        }
        if (this.be || this.bo() <= 0.0f) {
            f3 = 0.0f;
        }
        this.w += (f2 - this.w) * 0.4f;
        this.ah += (f3 - this.ah) * 0.8f;
        if (this.bo() > 0.0f && !this.a()) {
            net.minecraft.u.b.a a2 = this.cz() && !this.df().bk ? this.cT().a(this.df().cT()).b(1.0, 0.0, 1.0) : this.cT().b(1.0, 0.5, 1.0);
            List list = this.aQ.b((n)this, a2);
            for (int i3 = 0; i3 < list.size(); ++i3) {
                n n2 = (n)list.get(i3);
                if (n2.bk) continue;
                this.e(n2);
            }
        }
    }

    private void e(n n2) {
        n2.d(this);
    }

    public int V() {
        return (Integer)this.bE.a(b);
    }

    public void b(int n2) {
        this.bE.b(b, n2);
    }

    public void c(int n2) {
        int n3 = this.V();
        this.bE.b(b, n3 + n2);
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        this.d(0.2f, 0.2f);
        this.e(this.aU, this.aV, this.aW);
        this.aY = 0.1f;
        if ("Notch".equals(this.X())) {
            this.a(new cu(net.minecraft.a.w.e, 1), true, false);
        }
        if (!this.aQ.G().b("keepInventory") && !this.a()) {
            this.q.k();
        }
        if (n2 != null) {
            this.aX = -net.minecraft.u.b.n.b((this.X + this.ba) * ((float)Math.PI / 180)) * 0.1f;
            this.aZ = -net.minecraft.u.b.n.a((this.X + this.ba) * ((float)Math.PI / 180)) * 0.1f;
        } else {
            this.aX = 0.0;
            this.aZ = 0.0;
        }
        this.a(net.minecraft.r.o.A);
        this.b(net.minecraft.r.o.h);
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.em;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.el;
    }

    @Override
    public void a(n n2, int n3) {
        if (n2 != this) {
            this.c(n3);
            Collection collection = this.az().a(net.minecraft.j.f.f);
            if (n2 instanceof b) {
                this.a(net.minecraft.r.o.D);
                collection.addAll(this.az().a(net.minecraft.j.f.e));
            } else {
                this.a(net.minecraft.r.o.B);
            }
            collection.addAll(this.f(n2));
            for (net.minecraft.j.j j2 : collection) {
                this.az().c(this.X(), j2).a();
            }
        }
    }

    private Collection f(n n2) {
        int n3;
        net.minecraft.j.d d2;
        int n4;
        String string = n2 instanceof b ? n2.X() : n2.cN();
        net.minecraft.j.d d3 = this.az().g(this.X());
        if (d3 != null && (n4 = d3.l().a()) >= 0 && n4 < net.minecraft.j.f.n.length) {
            for (net.minecraft.j.j j2 : this.az().a(net.minecraft.j.f.n[n4])) {
                net.minecraft.j.p p2 = this.az().c(string, j2);
                p2.a();
            }
        }
        if ((d2 = this.az().g(string)) != null && (n3 = d2.l().a()) >= 0 && n3 < net.minecraft.j.f.m.length) {
            return this.az().a(net.minecraft.j.f.m[n3]);
        }
        return ov.a();
    }

    public net.minecraft.w.f.ae a(boolean bl2) {
        return this.a(this.q.a(this.q.d, bl2 && this.q.a() != null ? this.q.a().b : 1), false, true);
    }

    public net.minecraft.w.f.ae a(cu cu2, boolean bl2) {
        return this.a(cu2, false, false);
    }

    public net.minecraft.w.f.ae a(cu cu2, boolean bl2, boolean bl3) {
        float f2;
        if (cu2 == null) {
            return null;
        }
        if (cu2.b == 0) {
            return null;
        }
        double d2 = this.aV - (double)0.3f + (double)this.ce_();
        net.minecraft.w.f.ae ae2 = new net.minecraft.w.f.ae(this.aQ, this.aU, d2, this.aW, cu2);
        ae2.b(40);
        if (bl3) {
            ae2.b(this.X());
        }
        if (bl2) {
            f2 = this.bx.nextFloat() * 0.5f;
            float f3 = this.bx.nextFloat() * ((float)Math.PI * 2);
            ae2.aX = -net.minecraft.u.b.n.a(f3) * f2;
            ae2.aZ = net.minecraft.u.b.n.b(f3) * f2;
            ae2.aY = 0.2f;
        } else {
            f2 = 0.3f;
            ae2.aX = -net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(this.bb * ((float)Math.PI / 180)) * f2;
            ae2.aZ = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(this.bb * ((float)Math.PI / 180)) * f2;
            ae2.aY = -net.minecraft.u.b.n.a(this.bb * ((float)Math.PI / 180)) * f2 + 0.1f;
            float f4 = this.bx.nextFloat() * ((float)Math.PI * 2);
            f2 = 0.02f * this.bx.nextFloat();
            ae2.aX += Math.cos(f4) * (double)f2;
            ae2.aY += (double)((this.bx.nextFloat() - this.bx.nextFloat()) * 0.1f);
            ae2.aZ += Math.sin(f4) * (double)f2;
        }
        cu cu3 = this.a(ae2);
        if (bl3) {
            if (cu3 != null) {
                this.a(net.minecraft.r.o.e(cu3.a()), cu2.b);
            }
            this.a(net.minecraft.r.o.x);
        }
        return ae2;
    }

    protected cu a(net.minecraft.w.f.ae ae2) {
        this.aQ.a(ae2);
        return ae2.c();
    }

    public float a(net.minecraft.g.c.b b2) {
        float f2 = this.q.a(b2);
        if (f2 > 1.0f) {
            int n2 = net.minecraft.o.f.e(this);
            cu cu2 = this.bC();
            if (n2 > 0 && cu2 != null) {
                f2 += (float)(n2 * n2 + 1);
            }
        }
        if (this.b(net.minecraft.a.c.c)) {
            f2 *= 1.0f + (float)(this.c(net.minecraft.a.c.c).c() + 1) * 0.2f;
        }
        if (this.b(net.minecraft.a.c.d)) {
            float f3;
            switch (this.c(net.minecraft.a.c.d).c()) {
                case 0: {
                    f3 = 0.3f;
                    break;
                }
                case 1: {
                    f3 = 0.09f;
                    break;
                }
                case 2: {
                    f3 = 0.0027f;
                    break;
                }
                default: {
                    f3 = 8.1E-4f;
                }
            }
            f2 *= f3;
        }
        if (this.a(net.minecraft.g.a.h.h) && !net.minecraft.o.f.i(this)) {
            f2 /= 5.0f;
        }
        if (!this.be) {
            f2 /= 5.0f;
        }
        return f2;
    }

    public boolean b(net.minecraft.g.c.b b2) {
        return this.q.b(b2);
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.b, (net.minecraft.u.a.e)new net.minecraft.w.a.f());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a(net.minecraft.w.a.b.a(this.j));
        net.minecraft.e.q q2 = e2.c("Inventory", 10);
        this.q.b(q2);
        this.q.d = e2.h("SelectedItemSlot");
        this.E = e2.p("Sleeping");
        this.d = e2.g("SleepTimer");
        this.M = e2.j("XpP");
        this.K = e2.h("XpLevel");
        this.L = e2.h("XpTotal");
        this.h = e2.h("XpSeed");
        if (this.h == 0) {
            this.h = this.bx.nextInt();
        }
        this.b(e2.h("Score"));
        if (this.E) {
            this.F = new net.minecraft.u.b.b(this);
            this.a(true, true, false);
        }
        if (e2.b("SpawnX", 99) && e2.b("SpawnY", 99) && e2.b("SpawnZ", 99)) {
            this.e = new net.minecraft.u.b.b(e2.h("SpawnX"), e2.h("SpawnY"), e2.h("SpawnZ"));
            this.f = e2.p("SpawnForced");
        }
        this.t.a(e2);
        this.J.b(e2);
        if (e2.b("EnderItems", 9)) {
            net.minecraft.e.q q3 = e2.c("EnderItems", 10);
            this.c.a(q3);
        }
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("DataVersion", 510);
        e2.a("Inventory", this.q.a(new net.minecraft.e.q()));
        e2.a("SelectedItemSlot", this.q.d);
        e2.a("Sleeping", this.E);
        e2.a("SleepTimer", (short)this.d);
        e2.a("XpP", this.M);
        e2.a("XpLevel", this.K);
        e2.a("XpTotal", this.L);
        e2.a("XpSeed", this.h);
        e2.a("Score", this.V());
        if (this.e != null) {
            e2.a("SpawnX", this.e.cy_());
            e2.a("SpawnY", this.e.k());
            e2.a("SpawnZ", this.e.l());
            e2.a("SpawnForced", this.f);
        }
        this.t.b(e2);
        this.J.a(e2);
        e2.a("EnderItems", this.c.a());
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (this.J.a && !n2.g()) {
            return false;
        }
        this.as = 0;
        if (this.bo() <= 0.0f) {
            return false;
        }
        if (this.ae() && !this.aQ.C) {
            this.a(true, true, false);
        }
        if (n2.r()) {
            if (this.aQ.R() == net.minecraft.q.l.a) {
                f2 = 0.0f;
            }
            if (this.aQ.R() == net.minecraft.q.l.b) {
                f2 = f2 / 2.0f + 1.0f;
            }
            if (this.aQ.R() == net.minecraft.q.l.d) {
                f2 = f2 * 3.0f / 2.0f;
            }
        }
        return f2 == 0.0f ? false : super.a(n2, f2);
    }

    public boolean a(b b2) {
        net.minecraft.j.i i2 = this.aA();
        net.minecraft.j.i i3 = b2.aA();
        return i2 == null ? true : (!i2.a(i3) ? true : i2.f());
    }

    @Override
    protected void c(float f2) {
        this.q.a(f2);
    }

    @Override
    protected void d(float f2) {
        if (f2 >= 3.0f && this.aK != null && this.aK.a() == net.minecraft.a.w.cQ) {
            int n2 = 1 + net.minecraft.u.b.n.d(f2);
            this.aK.a(n2, (l)this);
            if (this.aK.b <= 0) {
                ah ah2 = this.D();
                if (ah2 == net.minecraft.u.ah.a) {
                    this.a(net.minecraft.h.k.a, null);
                } else {
                    this.a(net.minecraft.h.k.b, null);
                }
                this.aK = null;
                this.a(net.minecraft.a.f.fd, 0.8f, 0.8f + this.aQ.p.nextFloat() * 0.4f);
            }
        }
    }

    public float W() {
        int n2 = 0;
        cu[] arrcu = this.q.b;
        int n3 = this.q.b.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            cu cu2 = arrcu[i2];
            if (cu2 == null) continue;
            ++n2;
        }
        return (float)n2 / (float)this.q.b.length;
    }

    @Override
    protected void b(net.minecraft.u.n n2, float f2) {
        if (!this.b(n2)) {
            f2 = this.c(n2, f2);
            float f3 = f2 = this.d(n2, f2);
            f2 = Math.max(f2 - this.aB(), 0.0f);
            this.f(this.aB() - (f3 - f2));
            if (f2 != 0.0f) {
                this.e(n2.f());
                float f4 = this.bo();
                this.h(this.bo() - f2);
                this.bu().a(n2, f4, f2);
                if (f2 < 3.4028235E37f) {
                    this.a(net.minecraft.r.o.z, Math.round(f2 * 10.0f));
                }
            }
        }
    }

    public void a(ad ad2) {
    }

    public void a(net.minecraft.f.q q2) {
    }

    public void a(net.minecraft.f.h h2) {
    }

    public void a(net.minecraft.f.ab ab2) {
    }

    public void a(aj aj2) {
    }

    public void a(y y2) {
    }

    public void a(al al2, y y2) {
    }

    public void a(net.minecraft.q.d d2) {
    }

    public void a(cu cu2, ah ah2) {
    }

    public net.minecraft.u.ab a(n n2, cu cu2, ah ah2) {
        cu cu3;
        if (this.a()) {
            if (n2 instanceof y) {
                this.a((y)((Object)n2));
            }
            return net.minecraft.u.ab.b;
        }
        cu cu4 = cu3 = cu2 != null ? cu2.j() : null;
        if (!n2.a(this, cu2, ah2)) {
            if (cu2 != null && n2 instanceof l) {
                if (this.J.d) {
                    cu2 = cu3;
                }
                if (cu2.a(this, (l)n2, ah2)) {
                    if (cu2.b <= 0 && !this.J.d) {
                        this.a(ah2, null);
                    }
                    return net.minecraft.u.ab.a;
                }
            }
            return net.minecraft.u.ab.b;
        }
        if (cu2 != null && cu2 == this.c(ah2)) {
            if (cu2.b <= 0 && !this.J.d) {
                this.a(ah2, null);
            } else if (cu2.b < cu3.b && this.J.d) {
                cu2.b = cu3.b;
            }
        }
        return net.minecraft.u.ab.a;
    }

    @Override
    public double Y() {
        return -0.35;
    }

    @Override
    public void o() {
        super.o();
        this.aO = 0;
    }

    public void c(n n2) {
        if (n2.cG() && !n2.a_(this)) {
            float f2 = (float)this.a(net.minecraft.w.d.e).f();
            float f3 = n2 instanceof l ? net.minecraft.o.f.a(this.bC(), ((l)n2).bB()) : net.minecraft.o.f.a(this.bC(), net.minecraft.w.ae.a);
            float f4 = this.g(0.5f);
            f3 *= f4;
            this.aJ();
            if ((f2 *= 0.2f + f4 * f4 * 0.8f) > 0.0f || f3 > 0.0f) {
                cu cu2;
                boolean bl2 = f4 > 0.9f;
                boolean bl3 = false;
                int n3 = 0;
                n3 += net.minecraft.o.f.a(this);
                if (this.cB() && bl2) {
                    this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.ed, this.S(), 1.0f, 1.0f);
                    ++n3;
                    bl3 = true;
                }
                boolean bl4 = bl2 && this.bq > 0.0f && !this.be && !this.bq() && !this.cm() && !this.b(net.minecraft.a.c.o) && !this.cz() && n2 instanceof l;
                boolean bl5 = bl4 = bl4 && !this.cB();
                if (bl4) {
                    f2 *= 1.5f;
                }
                f2 += f3;
                boolean bl6 = false;
                double d2 = this.bo - this.bn;
                if (bl2 && !bl4 && !bl3 && this.be && d2 < (double)this.ak() && (cu2 = this.c(net.minecraft.u.ah.a)) != null && cu2.a() instanceof ca) {
                    bl6 = true;
                }
                float f5 = 0.0f;
                boolean bl7 = false;
                int n4 = net.minecraft.o.f.b(this);
                if (n2 instanceof l) {
                    f5 = ((l)n2).bo();
                    if (n4 > 0 && !n2.cy()) {
                        bl7 = true;
                        n2.k(1);
                    }
                }
                double d3 = n2.aX;
                double d4 = n2.aY;
                double d5 = n2.aZ;
                boolean bl8 = n2.a(net.minecraft.u.n.a(this), f2);
                if (bl8) {
                    Object object;
                    Object object2;
                    Object object32;
                    if (n3 > 0) {
                        if (n2 instanceof l) {
                            ((l)n2).a((n)this, (float)n3 * 0.5f, (double)net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)), (double)(-net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180))));
                        } else {
                            n2.a_(-net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)) * (float)n3 * 0.5f, 0.1, net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180)) * (float)n3 * 0.5f);
                        }
                        this.aX *= 0.6;
                        this.aZ *= 0.6;
                        this.b(false);
                    }
                    if (bl6) {
                        for (Object object32 : this.aQ.a(l.class, n2.cT().b(1.0, 0.25, 1.0))) {
                            if (object32 == this || object32 == n2 || this.w((n)object32) || !(this.n((n)object32) < 9.0)) continue;
                            ((l)object32).a((n)this, 0.4f, (double)net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)), (double)(-net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180))));
                            ((l)object32).a(net.minecraft.u.n.a(this), 1.0f);
                        }
                        this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.eg, this.S(), 1.0f, 1.0f);
                        this.Z();
                    }
                    if (n2 instanceof g && n2.bi) {
                        ((g)n2).a.a(new net.minecraft.x.d.b.h(n2));
                        n2.bi = false;
                        n2.aX = d3;
                        n2.aY = d4;
                        n2.aZ = d5;
                    }
                    if (bl4) {
                        this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.ec, this.S(), 1.0f, 1.0f);
                        this.a(n2);
                    }
                    if (!bl4 && !bl6) {
                        if (bl2) {
                            this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.ef, this.S(), 1.0f, 1.0f);
                        } else {
                            this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.eh, this.S(), 1.0f, 1.0f);
                        }
                    }
                    if (f3 > 0.0f) {
                        this.b(n2);
                    }
                    if (!this.aQ.C && n2 instanceof b) {
                        object32 = (b)n2;
                        object2 = this.bC();
                        Object object4 = object = ((l)object32).B() ? ((l)object32).bR() : null;
                        if (object2 != null && object != null && ((cu)object2).a() instanceof net.minecraft.m.n && ((cu)object).a() == net.minecraft.a.w.cQ) {
                            float f6 = 0.25f + (float)net.minecraft.o.f.e(this) * 0.05f;
                            if (bl3) {
                                f6 += 0.75f;
                            }
                            if (this.bx.nextFloat() < f6) {
                                ((b)object32).aL().a(net.minecraft.a.w.cQ, 100);
                                this.aQ.a((n)object32, (byte)30);
                            }
                        }
                    }
                    if (f2 >= 18.0f) {
                        this.a((net.minecraft.r.k)net.minecraft.r.j.F);
                    }
                    this.h(n2);
                    if (n2 instanceof l) {
                        net.minecraft.o.f.a((l)n2, (n)this);
                    }
                    net.minecraft.o.f.b(this, n2);
                    object32 = this.bC();
                    object2 = n2;
                    if (n2 instanceof net.minecraft.w.d.b && (object = ((net.minecraft.w.d.b)n2).a) instanceof l) {
                        object2 = (l)object;
                    }
                    if (object32 != null && object2 instanceof l) {
                        ((cu)object32).a((l)object2, this);
                        if (((cu)object32).b <= 0) {
                            this.a(net.minecraft.u.ah.a, null);
                        }
                    }
                    if (n2 instanceof l) {
                        float f7 = f5 - ((l)n2).bo();
                        this.a(net.minecraft.r.o.y, Math.round(f7 * 10.0f));
                        if (n4 > 0) {
                            n2.k(n4 * 4);
                        }
                        if (this.aQ instanceof v && f7 > 2.0f) {
                            int n5 = (int)((double)f7 * 0.5);
                            ((v)this.aQ).a(net.minecraft.u.aj.S, n2.aU, n2.aV + (double)(n2.bm * 0.5f), n2.aW, n5, 0.1, 0.0, 0.1, 0.2, new int[0]);
                        }
                    }
                    this.e(0.3f);
                } else {
                    this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.ee, this.S(), 1.0f, 1.0f);
                    if (bl7) {
                        n2.ce();
                    }
                }
            }
        }
    }

    public void a(n n2) {
    }

    public void b(n n2) {
    }

    public void Z() {
        double d2 = -net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180));
        double d3 = net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180));
        if (this.aQ instanceof v) {
            ((v)this.aQ).a(net.minecraft.u.aj.T, this.aU + d2, this.aV + (double)this.bm * 0.5, this.aW + d3, 0, d2, 0.0, d3, 0.0, new int[0]);
        }
    }

    public void q() {
    }

    @Override
    public void aa() {
        super.aa();
        this.r.b(this);
        if (this.s != null) {
            this.s.b(this);
        }
    }

    @Override
    public boolean ab() {
        return !this.E && super.ab();
    }

    public boolean u() {
        return false;
    }

    public com.c.a.e ac() {
        return this.j;
    }

    public net.minecraft.w.a.h a(net.minecraft.u.b.b b2) {
        if (!this.aQ.C) {
            if (this.ae() || !this.br()) {
                return net.minecraft.w.a.h.e;
            }
            if (!this.aQ.q.e()) {
                return net.minecraft.w.a.h.b;
            }
            if (this.aQ.n()) {
                return net.minecraft.w.a.h.c;
            }
            if (Math.abs(this.aU - (double)b2.cy_()) > 3.0 || Math.abs(this.aV - (double)b2.k()) > 2.0 || Math.abs(this.aW - (double)b2.l()) > 3.0) {
                return net.minecraft.w.a.h.d;
            }
            double d2 = 8.0;
            double d3 = 5.0;
            List list = this.aQ.a(net.minecraft.w.e.k.class, new net.minecraft.u.b.a((double)b2.cy_() - 8.0, (double)b2.k() - 5.0, (double)b2.l() - 8.0, (double)b2.cy_() + 8.0, (double)b2.k() + 5.0, (double)b2.l() + 8.0));
            if (!list.isEmpty()) {
                return net.minecraft.w.a.h.f;
            }
        }
        if (this.cz()) {
            this.o();
        }
        this.d(0.2f, 0.2f);
        if (this.aQ.d(b2)) {
            net.minecraft.u.ad ad2 = (net.minecraft.u.ad)((Object)this.aQ.n(b2).a(de.j));
            float f2 = 0.5f;
            float f3 = 0.5f;
            switch (ad2) {
                case d: {
                    f3 = 0.9f;
                    break;
                }
                case c: {
                    f3 = 0.1f;
                    break;
                }
                case e: {
                    f2 = 0.1f;
                    break;
                }
                case f: {
                    f2 = 0.9f;
                }
            }
            this.a(ad2);
            this.e((float)b2.cy_() + f2, (float)b2.k() + 0.6875f, (float)b2.l() + f3);
        } else {
            this.e((float)b2.cy_() + 0.5f, (float)b2.k() + 0.6875f, (float)b2.l() + 0.5f);
        }
        this.E = true;
        this.d = 0;
        this.F = b2;
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        if (!this.aQ.C) {
            this.aQ.H();
        }
        return net.minecraft.w.a.h.a;
    }

    private void a(net.minecraft.u.ad ad2) {
        this.G = 0.0f;
        this.I = 0.0f;
        switch (ad2) {
            case d: {
                this.I = -1.8f;
                break;
            }
            case c: {
                this.I = 1.8f;
                break;
            }
            case e: {
                this.G = 1.8f;
                break;
            }
            case f: {
                this.G = -1.8f;
            }
        }
    }

    public void a(boolean bl2, boolean bl3, boolean bl4) {
        this.d(0.6f, 1.8f);
        net.minecraft.g.c.b b2 = this.aQ.n(this.F);
        if (this.F != null && b2.c() == net.minecraft.a.p.C) {
            this.aQ.a(this.F, b2.a(net.minecraft.g.av.b, Boolean.valueOf(false)), 4);
            net.minecraft.u.b.b b3 = net.minecraft.g.av.a(this.aQ, this.F, 0);
            if (b3 == null) {
                b3 = this.F.b();
            }
            this.e((float)b3.cy_() + 0.5f, (float)b3.k() + 0.1f, (float)b3.l() + 0.5f);
        }
        this.E = false;
        if (!this.aQ.C && bl3) {
            this.aQ.H();
        }
        int n2 = this.d = bl2 ? 0 : 100;
        if (bl4) {
            this.a(this.F, false);
        }
    }

    private boolean p() {
        return this.aQ.n(this.F).c() == net.minecraft.a.p.C;
    }

    public static net.minecraft.u.b.b a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, boolean bl2) {
        cn cn2 = k2.n(b2).c();
        if (cn2 != net.minecraft.a.p.C) {
            if (!bl2) {
                return null;
            }
            boolean bl3 = cn2.o();
            boolean bl4 = k2.n(b2.b()).c().o();
            return bl3 && bl4 ? b2 : null;
        }
        return net.minecraft.g.av.a(k2, b2, 0);
    }

    public float ad() {
        if (this.F != null) {
            net.minecraft.u.ad ad2 = (net.minecraft.u.ad)((Object)this.aQ.n(this.F).a(de.j));
            switch (ad2) {
                case d: {
                    return 90.0f;
                }
                case c: {
                    return 270.0f;
                }
                case e: {
                    return 0.0f;
                }
                case f: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    public boolean ae() {
        return this.E;
    }

    public boolean af() {
        return this.E && this.d >= 100;
    }

    public int ag() {
        return this.d;
    }

    public void b(net.minecraft.u.d.a a2) {
    }

    public net.minecraft.u.b.b ah() {
        return this.e;
    }

    public boolean ai() {
        return this.f;
    }

    public void a(net.minecraft.u.b.b b2, boolean bl2) {
        if (b2 != null) {
            this.e = b2;
            this.f = bl2;
        } else {
            this.e = null;
            this.f = false;
        }
    }

    public boolean a(net.minecraft.r.d d2) {
        return false;
    }

    public void a(net.minecraft.r.k k2) {
        this.a(k2, 1);
    }

    public void a(net.minecraft.r.k k2, int n2) {
    }

    public void b(net.minecraft.r.k k2) {
    }

    @Override
    public void aj() {
        super.aj();
        this.a(net.minecraft.r.o.w);
        if (this.cB()) {
            this.e(0.8f);
        } else {
            this.e(0.2f);
        }
    }

    @Override
    public void b(float f2, float f3) {
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        if (this.J.b && !this.cz()) {
            double d5 = this.aY;
            float f4 = this.ao;
            this.ao = this.J.a() * (float)(this.cB() ? 2 : 1);
            super.b(f2, f3);
            this.aY = d5 * 0.6;
            this.ao = f4;
            this.bq = 0.0f;
            this.a(7, false);
        } else {
            super.b(f2, f3);
        }
        this.c(this.aU - d2, this.aV - d3, this.aW - d4);
    }

    @Override
    public float ak() {
        return (float)this.a(net.minecraft.w.d.d).f();
    }

    public void c(double d2, double d3, double d4) {
        if (!this.cz()) {
            if (this.a(net.minecraft.g.a.h.h)) {
                int n2 = Math.round(net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f);
                if (n2 > 0) {
                    this.a(net.minecraft.r.o.q, n2);
                    this.e(0.015f * (float)n2 * 0.01f);
                }
            } else if (this.cm()) {
                int n3 = Math.round(net.minecraft.u.b.n.a(d2 * d2 + d4 * d4) * 100.0f);
                if (n3 > 0) {
                    this.a(net.minecraft.r.o.m, n3);
                    this.e(0.015f * (float)n3 * 0.01f);
                }
            } else if (this.bq()) {
                if (d3 > 0.0) {
                    this.a(net.minecraft.r.o.o, (int)Math.round(d3 * 100.0));
                }
            } else if (this.be) {
                int n4 = Math.round(net.minecraft.u.b.n.a(d2 * d2 + d4 * d4) * 100.0f);
                if (n4 > 0) {
                    if (this.cB()) {
                        this.a(net.minecraft.r.o.l, n4);
                        this.e(0.099999994f * (float)n4 * 0.01f);
                    } else if (this.G()) {
                        this.a(net.minecraft.r.o.k, n4);
                        this.e(0.005f * (float)n4 * 0.01f);
                    } else {
                        this.a(net.minecraft.r.o.j, n4);
                        this.e(0.01f * (float)n4 * 0.01f);
                    }
                }
            } else if (this.bW()) {
                int n5 = Math.round(net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f);
                this.a(net.minecraft.r.o.v, n5);
            } else {
                int n6 = Math.round(net.minecraft.u.b.n.a(d2 * d2 + d4 * d4) * 100.0f);
                if (n6 > 25) {
                    this.a(net.minecraft.r.o.p, n6);
                }
            }
        }
    }

    private void l(double d2, double d3, double d4) {
        int n2;
        if (this.cz() && (n2 = Math.round(net.minecraft.u.b.n.a(d2 * d2 + d3 * d3 + d4 * d4) * 100.0f)) > 0) {
            if (this.df() instanceof net.minecraft.w.f.f) {
                this.a(net.minecraft.r.o.r, n2);
                if (this.g == null) {
                    this.g = new net.minecraft.u.b.b(this);
                } else if (this.g.e((double)net.minecraft.u.b.n.c(this.aU), (double)net.minecraft.u.b.n.c(this.aV), (double)net.minecraft.u.b.n.c(this.aW)) >= 1000000.0) {
                    this.a((net.minecraft.r.k)net.minecraft.r.j.q);
                }
            } else if (this.df() instanceof ab) {
                this.a(net.minecraft.r.o.s, n2);
            } else if (this.df() instanceof net.minecraft.w.h.l) {
                this.a(net.minecraft.r.o.t, n2);
            } else if (this.df() instanceof al) {
                this.a(net.minecraft.r.o.u, n2);
            }
        }
    }

    @Override
    public void c(float f2, float f3) {
        if (!this.J.c) {
            if (f2 >= 2.0f) {
                this.a(net.minecraft.r.o.n, (int)Math.round((double)f2 * 100.0));
            }
            super.c(f2, f3);
        }
    }

    @Override
    protected void al() {
        if (!this.a()) {
            super.al();
        }
    }

    @Override
    protected bv d(int n2) {
        return n2 > 4 ? net.minecraft.a.f.ei : net.minecraft.a.f.eo;
    }

    @Override
    public void b(l l2) {
        q q2;
        if (l2 instanceof aw) {
            this.a((net.minecraft.r.k)net.minecraft.r.j.s);
        }
        if ((q2 = (q)net.minecraft.w.h.a.get(net.minecraft.w.h.b(l2))) != null) {
            this.a(q2.d);
        }
    }

    @Override
    public void am() {
        if (!this.J.b) {
            super.am();
        }
    }

    public void e(int n2) {
        this.c(n2);
        int n3 = Integer.MAX_VALUE - this.L;
        if (n2 > n3) {
            n2 = n3;
        }
        this.M += (float)n2 / (float)this.ao();
        this.L += n2;
        while (this.M >= 1.0f) {
            this.M = (this.M - 1.0f) * (float)this.ao();
            this.g(1);
            this.M /= (float)this.ao();
        }
    }

    public int an() {
        return this.h;
    }

    public void f(int n2) {
        this.K -= n2;
        if (this.K < 0) {
            this.K = 0;
            this.M = 0.0f;
            this.L = 0;
        }
        this.h = this.bx.nextInt();
    }

    public void g(int n2) {
        this.K += n2;
        if (this.K < 0) {
            this.K = 0;
            this.M = 0.0f;
            this.L = 0;
        }
        if (n2 > 0 && this.K % 5 == 0 && (float)this.i < (float)this.by - 100.0f) {
            float f2 = this.K > 30 ? 1.0f : (float)this.K / 30.0f;
            this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.en, this.S(), f2 * 0.75f, 1.0f);
            this.i = this.by;
        }
    }

    public int ao() {
        return this.K >= 30 ? 112 + (this.K - 30) * 9 : (this.K >= 15 ? 37 + (this.K - 15) * 5 : 7 + this.K * 2);
    }

    public void e(float f2) {
        if (!this.J.a && !this.aQ.C) {
            this.t.a(f2);
        }
    }

    public net.minecraft.u.am ap() {
        return this.t;
    }

    public boolean c(boolean bl2) {
        return (bl2 || this.t.b()) && !this.J.a;
    }

    public boolean aq() {
        return this.bo() > 0.0f && this.bo() < this.bw();
    }

    public boolean ar() {
        return this.J.e;
    }

    public boolean a(net.minecraft.u.b.b b2, net.minecraft.u.ad ad2, cu cu2) {
        if (this.J.e) {
            return true;
        }
        if (cu2 == null) {
            return false;
        }
        net.minecraft.u.b.b b3 = b2.a(ad2.e());
        cn cn2 = this.aQ.n(b3).c();
        return cu2.b(cn2) || cu2.x();
    }

    @Override
    protected int b_(b b2) {
        if (!this.aQ.G().b("keepInventory") && !this.a()) {
            int n2 = this.K * 7;
            return n2 > 100 ? 100 : n2;
        }
        return 0;
    }

    @Override
    protected boolean as() {
        return true;
    }

    @Override
    public boolean at() {
        return true;
    }

    public void a(b b2, boolean bl2) {
        if (bl2) {
            this.q.a(b2.q);
            this.h(b2.bo());
            this.t = b2.t;
            this.K = b2.K;
            this.L = b2.L;
            this.M = b2.M;
            this.b(b2.V());
            this.bT = b2.bT;
            this.bU = b2.bU;
            this.bV = b2.bV;
        } else if (this.aQ.G().b("keepInventory") || b2.a()) {
            this.q.a(b2.q);
            this.K = b2.K;
            this.L = b2.L;
            this.M = b2.M;
            this.b(b2.V());
        }
        this.h = b2.h;
        this.c = b2.c;
        this.cc().b(o, (Byte)b2.cc().a(o));
    }

    @Override
    protected boolean au() {
        return !this.J.b;
    }

    public void t() {
    }

    public void a(am am2) {
    }

    @Override
    public String X() {
        return this.j.b();
    }

    public p av() {
        return this.c;
    }

    @Override
    public cu a(k k2) {
        return k2 == net.minecraft.h.k.a ? this.q.a() : (k2 == net.minecraft.h.k.b ? this.q.c[0] : (k2.a() == net.minecraft.h.au.b ? this.q.b[k2.b()] : null));
    }

    @Override
    public void a(k k2, cu cu2) {
        if (k2 == net.minecraft.h.k.a) {
            this.d(cu2);
            this.q.a[this.q.d] = cu2;
        } else if (k2 == net.minecraft.h.k.b) {
            this.d(cu2);
            this.q.c[0] = cu2;
        } else if (k2.a() == net.minecraft.h.au.b) {
            this.d(cu2);
            this.q.b[k2.b()] = cu2;
        }
    }

    @Override
    public Iterable aw() {
        return ov.a(this.bC(), this.bD());
    }

    @Override
    public Iterable ax() {
        return Arrays.asList(this.q.b);
    }

    @Override
    public boolean c_(b b2) {
        if (!this.cD()) {
            return false;
        }
        if (b2.a()) {
            return false;
        }
        net.minecraft.j.i i2 = this.aA();
        return i2 == null || b2 == null || b2.aA() != i2 || !i2.g();
    }

    public abstract boolean a();

    public abstract boolean c();

    @Override
    public boolean ay() {
        return !this.J.b;
    }

    public net.minecraft.j.r az() {
        return this.aQ.Q();
    }

    @Override
    public net.minecraft.j.i aA() {
        return this.az().g(this.X());
    }

    @Override
    public net.minecraft.u.d.a aK() {
        net.minecraft.u.d.k k2 = new net.minecraft.u.d.k(net.minecraft.j.d.a(this.aA(), this.X()));
        k2.a().a(new net.minecraft.u.d.a.a(net.minecraft.u.d.a.b.d, "/msg " + this.X() + " "));
        k2.a().a(this.cS());
        k2.a().a(this.X());
        return k2;
    }

    @Override
    public float ce_() {
        float f2 = 1.62f;
        if (this.ae()) {
            f2 = 0.2f;
        } else if (!this.G() && this.bm != 1.65f) {
            if (this.bW() || this.bm == 0.6f) {
                f2 = 0.4f;
            }
        } else {
            f2 -= 0.08f;
        }
        return f2;
    }

    @Override
    public void f(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.cc().b(a, Float.valueOf(f2));
    }

    @Override
    public float aB() {
        return ((Float)this.cc().a(a)).floatValue();
    }

    public static UUID a(com.c.a.e e2) {
        UUID uUID = e2.a();
        if (uUID == null) {
            uUID = net.minecraft.w.a.b.d(e2.b());
        }
        return uUID;
    }

    public static UUID d(String string) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(com.a.a.b.aj.c));
    }

    public boolean a(an an2) {
        if (an2.a()) {
            return true;
        }
        cu cu2 = this.bC();
        return cu2 != null && cu2.s() ? cu2.q().equals(an2.b()) : false;
    }

    public boolean a(j j2) {
        return ((Byte)this.cc().a(o) & j2.a()) == j2.a();
    }

    @Override
    public boolean aR() {
        return this.aS().d[0].G().b("sendCommandFeedback");
    }

    @Override
    public boolean a_(int n2, cu cu2) {
        if (n2 >= 0 && n2 < this.q.a.length) {
            this.q.a(n2, cu2);
            return true;
        }
        k k2 = n2 == 100 + net.minecraft.h.k.f.b() ? net.minecraft.h.k.f : (n2 == 100 + net.minecraft.h.k.e.b() ? net.minecraft.h.k.e : (n2 == 100 + net.minecraft.h.k.d.b() ? net.minecraft.h.k.d : (n2 == 100 + net.minecraft.h.k.c.b() ? net.minecraft.h.k.c : null)));
        if (n2 == 98) {
            this.a(net.minecraft.h.k.a, cu2);
            return true;
        }
        if (n2 == 99) {
            this.a(net.minecraft.h.k.b, cu2);
            return true;
        }
        if (k2 == null) {
            int n3 = n2 - 200;
            if (n3 >= 0 && n3 < this.c.e()) {
                this.c.a(n3, cu2);
                return true;
            }
            return false;
        }
        if (cu2 != null && cu2.a() != null && (!(cu2.a() instanceof dn) && !(cu2.a() instanceof by) ? k2 != net.minecraft.h.k.f : net.minecraft.w.f.c(cu2) != k2)) {
            return false;
        }
        this.q.a(k2.b() + this.q.a.length, cu2);
        return true;
    }

    public boolean aG() {
        return this.k;
    }

    public void d(boolean bl2) {
        this.k = bl2;
    }

    @Override
    public ai aH() {
        return (Byte)this.bE.a(p) == 0 ? net.minecraft.u.ai.a : net.minecraft.u.ai.b;
    }

    public void a(ai ai2) {
        this.bE.b(p, (byte)(ai2 != net.minecraft.u.ai.a ? 1 : 0));
    }

    public float aI() {
        return (float)(1.0 / this.a(net.minecraft.w.d.f).f() * 20.0);
    }

    public float g(float f2) {
        return net.minecraft.u.b.n.a(((float)this.ab + f2) / this.aI(), 0.0f, 1.0f);
    }

    public void aJ() {
        this.ab = 0;
    }

    public net.minecraft.u.j aL() {
        return this.m;
    }

    @Override
    public void d(n n2) {
        if (!this.ae()) {
            super.d(n2);
        }
    }

    public float aM() {
        return (float)this.a(net.minecraft.w.d.i).f();
    }

    public boolean aN() {
        return this.J.d && this.a(2, "");
    }
}

