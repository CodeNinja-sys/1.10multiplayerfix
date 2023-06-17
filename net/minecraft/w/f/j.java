/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.b.cm;
import java.util.Arrays;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.q;
import net.minecraft.g.cn;
import net.minecraft.h.k;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.q.v;
import net.minecraft.u.a.b.e;
import net.minecraft.u.a.c;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.ai;
import net.minecraft.u.aj;
import net.minecraft.u.b.s;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.f;
import net.minecraft.w.f.r;
import net.minecraft.w.g.a;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;

public class j
extends l {
    private static final net.minecraft.u.b.q i = new net.minecraft.u.b.q(0.0f, 0.0f, 0.0f);
    private static final net.minecraft.u.b.q j = new net.minecraft.u.b.q(0.0f, 0.0f, 0.0f);
    private static final net.minecraft.u.b.q k = new net.minecraft.u.b.q(-10.0f, 0.0f, -10.0f);
    private static final net.minecraft.u.b.q l = new net.minecraft.u.b.q(-15.0f, 0.0f, 10.0f);
    private static final net.minecraft.u.b.q m = new net.minecraft.u.b.q(-1.0f, 0.0f, -1.0f);
    private static final net.minecraft.u.b.q n = new net.minecraft.u.b.q(1.0f, 0.0f, 1.0f);
    public static final g a = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.a);
    public static final g b = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.i);
    public static final g c = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.i);
    public static final g d = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.i);
    public static final g e = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.i);
    public static final g f = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.i);
    public static final g g = net.minecraft.x.a.o.a(j.class, net.minecraft.x.a.q.i);
    private static final cm o = new r();
    private final cu[] p = new cu[2];
    private final cu[] q = new cu[4];
    private boolean r;
    public long h;
    private int s;
    private boolean t;
    private net.minecraft.u.b.q u = i;
    private net.minecraft.u.b.q v = j;
    private net.minecraft.u.b.q w = k;
    private net.minecraft.u.b.q x = l;
    private net.minecraft.u.b.q y = m;
    private net.minecraft.u.b.q z = n;

    public j(net.minecraft.q.k k2) {
        super(k2);
        this.bv = this.ci();
        this.d(0.5f, 1.975f);
    }

    public j(net.minecraft.q.k k2, double d2, double d3, double d4) {
        this(k2);
        this.e(d2, d3, d4);
    }

    @Override
    public boolean A() {
        return super.A() && !this.ci();
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
        this.bE.a(b, i);
        this.bE.a(c, j);
        this.bE.a(d, k);
        this.bE.a(e, l);
        this.bE.a(f, m);
        this.bE.a(g, n);
    }

    @Override
    public Iterable aw() {
        return Arrays.asList(this.p);
    }

    @Override
    public Iterable ax() {
        return Arrays.asList(this.q);
    }

    @Override
    public cu a(k k2) {
        cu cu2 = null;
        switch (k2.a()) {
            case a: {
                cu2 = this.p[k2.b()];
                break;
            }
            case b: {
                cu2 = this.q[k2.b()];
            }
        }
        return cu2;
    }

    @Override
    public void a(k k2, cu cu2) {
        switch (k2.a()) {
            case a: {
                this.d(cu2);
                this.p[k2.b()] = cu2;
                break;
            }
            case b: {
                this.d(cu2);
                this.q[k2.b()] = cu2;
            }
        }
    }

    @Override
    public boolean a_(int n2, cu cu2) {
        k k2;
        if (n2 == 98) {
            k2 = net.minecraft.h.k.a;
        } else if (n2 == 99) {
            k2 = net.minecraft.h.k.b;
        } else if (n2 == 100 + net.minecraft.h.k.f.b()) {
            k2 = net.minecraft.h.k.f;
        } else if (n2 == 100 + net.minecraft.h.k.e.b()) {
            k2 = net.minecraft.h.k.e;
        } else if (n2 == 100 + net.minecraft.h.k.d.b()) {
            k2 = net.minecraft.h.k.d;
        } else {
            if (n2 != 100 + net.minecraft.h.k.c.b()) {
                return false;
            }
            k2 = net.minecraft.h.k.c;
        }
        if (cu2 != null && !net.minecraft.w.f.b(k2, cu2) && k2 != net.minecraft.h.k.f) {
            return false;
        }
        this.a(k2, cu2);
        return true;
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new e("ArmorStand", "ArmorItems", "HandItems"));
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        cu[] arrcu;
        Object object;
        super.a(e2);
        q q2 = new q();
        cu[] arrcu2 = this.q;
        int n2 = this.q.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = arrcu2[i2];
            arrcu = new net.minecraft.e.e();
            if (object != null) {
                ((cu)object).b((net.minecraft.e.e)arrcu);
            }
            q2.a((net.minecraft.e.a)arrcu);
        }
        e2.a("ArmorItems", q2);
        object = new q();
        arrcu = this.p;
        int n3 = this.p.length;
        for (n2 = 0; n2 < n3; ++n2) {
            cu cu2 = arrcu[n2];
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            if (cu2 != null) {
                cu2.b(e3);
            }
            ((q)object).a(e3);
        }
        e2.a("HandItems", (net.minecraft.e.a)object);
        if (this.cQ() && (this.cP() == null || this.cP().isEmpty())) {
            e2.a("CustomNameVisible", this.cQ());
        }
        e2.a("Invisible", this.cD());
        e2.a("Small", this.a());
        e2.a("ShowArms", this.c());
        e2.a("DisabledSlots", this.s);
        e2.a("NoBasePlate", this.i());
        if (this.p()) {
            e2.a("Marker", this.p());
        }
        e2.a("Pose", this.z());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        int n2;
        net.minecraft.e.a a2;
        super.b(e2);
        if (e2.b("ArmorItems", 9)) {
            a2 = e2.c("ArmorItems", 10);
            for (n2 = 0; n2 < this.q.length; ++n2) {
                this.q[n2] = cu.a(a2.b(n2));
            }
        }
        if (e2.b("HandItems", 9)) {
            a2 = e2.c("HandItems", 10);
            for (n2 = 0; n2 < this.p.length; ++n2) {
                this.p[n2] = cu.a(a2.b(n2));
            }
        }
        this.o(e2.p("Invisible"));
        this.c(e2.p("Small"));
        this.d(e2.p("ShowArms"));
        this.s = e2.h("DisabledSlots");
        this.e(e2.p("NoBasePlate"));
        this.f(e2.p("Marker"));
        this.t = !this.p();
        this.bv = this.ci();
        a2 = e2.o("Pose");
        this.g((net.minecraft.e.e)a2);
    }

    private void g(net.minecraft.e.e e2) {
        q q2 = e2.c("Head", 5);
        this.a(q2.c() ? i : new net.minecraft.u.b.q(q2));
        q q3 = e2.c("Body", 5);
        this.b(q3.c() ? j : new net.minecraft.u.b.q(q3));
        q q4 = e2.c("LeftArm", 5);
        this.c(q4.c() ? k : new net.minecraft.u.b.q(q4));
        q q5 = e2.c("RightArm", 5);
        this.d(q5.c() ? l : new net.minecraft.u.b.q(q5));
        q q6 = e2.c("LeftLeg", 5);
        this.e(q6.c() ? m : new net.minecraft.u.b.q(q6));
        q q7 = e2.c("RightLeg", 5);
        this.f(q7.c() ? n : new net.minecraft.u.b.q(q7));
    }

    private net.minecraft.e.e z() {
        net.minecraft.e.e e2 = new net.minecraft.e.e();
        if (!i.equals(this.u)) {
            e2.a("Head", this.u.a());
        }
        if (!j.equals(this.v)) {
            e2.a("Body", this.v.a());
        }
        if (!k.equals(this.w)) {
            e2.a("LeftArm", this.w.a());
        }
        if (!l.equals(this.x)) {
            e2.a("RightArm", this.x.a());
        }
        if (!m.equals(this.y)) {
            e2.a("LeftLeg", this.y.a());
        }
        if (!n.equals(this.z)) {
            e2.a("RightLeg", this.z.a());
        }
        return e2;
    }

    @Override
    public boolean bM() {
        return false;
    }

    @Override
    protected void k(n n2) {
    }

    @Override
    protected void bK() {
        List list = this.aQ.a((n)this, this.cT(), o);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            n n2 = (n)list.get(i2);
            if (!(this.n(n2) <= 0.2)) continue;
            n2.d(this);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public ab a(b var1_1, s var2_2, cu var3_3, ah var4_4) {
        block11: {
            block12: {
                block10: {
                    if (this.p()) {
                        return net.minecraft.u.ab.b;
                    }
                    if (this.aQ.C != false) return net.minecraft.u.ab.a;
                    if (var1_1.a() != false) return net.minecraft.u.ab.a;
                    var5_5 = net.minecraft.h.k.a;
                    var6_6 = var3_3 != null;
                    v0 = var7_7 = var6_6 != false ? var3_3.a() : null;
                    if (var6_6 && var7_7 instanceof dn) {
                        var5_5 = ((dn)var7_7).c;
                    }
                    if (var6_6 && (var7_7 == net.minecraft.a.w.ch || var7_7 == cg.a(net.minecraft.a.p.aU))) {
                        var5_5 = net.minecraft.h.k.f;
                    }
                    var8_8 = 0.1;
                    var10_9 = 0.9;
                    var12_10 = 0.4;
                    var14_11 = 1.6;
                    var16_12 = net.minecraft.h.k.a;
                    var17_13 = this.a();
                    v1 = var18_14 = var17_13 != false ? var2_2.c * 2.0 : var2_2.c;
                    if (!(var18_14 >= 0.1)) break block10;
                    v2 = var17_13 != false ? 0.8 : 0.45;
                    if (!(var18_14 < 0.1 + v2) || this.a(net.minecraft.h.k.c) == null) break block10;
                    var16_12 = net.minecraft.h.k.c;
                    break block11;
                }
                v3 = var17_13 != false ? 0.3 : 0.0;
                if (!(var18_14 >= 0.9 + v3)) break block12;
                v4 = var17_13 != false ? 1.0 : 0.7;
                if (!(var18_14 < 0.9 + v4) || this.a(net.minecraft.h.k.e) == null) break block12;
                var16_12 = net.minecraft.h.k.e;
                break block11;
            }
            if (!(var18_14 >= 0.4)) ** GOTO lbl-1000
            v5 = var17_13 != false ? 1.0 : 0.8;
            if (var18_14 < 0.4 + v5 && this.a(net.minecraft.h.k.d) != null) {
                var16_12 = net.minecraft.h.k.d;
            } else if (var18_14 >= 1.6 && this.a(net.minecraft.h.k.f) != null) {
                var16_12 = net.minecraft.h.k.f;
            }
        }
        v6 = var20_15 = this.a(var16_12) != null;
        if (this.b(var16_12) || this.b(var5_5)) {
            var16_12 = var5_5;
            if (this.b(var5_5)) {
                return net.minecraft.u.ab.c;
            }
        }
        if (var6_6 && var5_5 == net.minecraft.h.k.a && !this.c()) {
            return net.minecraft.u.ab.c;
        }
        if (var6_6) {
            this.a(var1_1, var5_5, var3_3, var4_4);
            return net.minecraft.u.ab.a;
        }
        if (var20_15 == false) return net.minecraft.u.ab.a;
        this.a(var1_1, var16_12, var3_3, var4_4);
        return net.minecraft.u.ab.a;
    }

    private boolean b(k k2) {
        return (this.s & 1 << k2.c()) != 0;
    }

    private void a(b b2, k k2, cu cu2, ah ah2) {
        cu cu3 = this.a(k2);
        if (!(cu3 != null && (this.s & 1 << k2.c() + 8) != 0 || cu3 == null && (this.s & 1 << k2.c() + 16) != 0)) {
            if (b2.J.d && (cu3 == null || cu3.a() == cg.a(net.minecraft.a.p.a)) && cu2 != null) {
                cu cu4 = cu2.j();
                cu4.b = 1;
                this.a(k2, cu4);
            } else if (cu2 != null && cu2.b > 1) {
                if (cu3 == null) {
                    cu cu5 = cu2.j();
                    cu5.b = 1;
                    this.a(k2, cu5);
                    --cu2.b;
                }
            } else {
                this.a(k2, cu2);
                b2.a(ah2, cu3);
            }
        }
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (!this.aQ.C && !this.bk) {
            if (net.minecraft.u.n.l.equals(n2)) {
                this.aa();
                return false;
            }
            if (!(this.b(n2) || this.r || this.p())) {
                if (n2.c()) {
                    this.I();
                    this.aa();
                    return false;
                }
                if (net.minecraft.u.n.a.equals(n2)) {
                    if (this.cy()) {
                        this.b(0.15f);
                    } else {
                        this.k(5);
                    }
                    return false;
                }
                if (net.minecraft.u.n.c.equals(n2) && this.bo() > 0.5f) {
                    this.b(4.0f);
                    return false;
                }
                boolean bl2 = "arrow".equals(n2.p());
                boolean bl3 = "player".equals(n2.p());
                if (!bl3 && !bl2) {
                    return false;
                }
                if (n2.i() instanceof net.minecraft.w.c.f) {
                    n2.i().aa();
                }
                if (n2.j() instanceof b && !((b)n2.j()).J.e) {
                    return false;
                }
                if (n2.u()) {
                    this.E();
                    this.aa();
                    return false;
                }
                long l2 = this.aQ.B();
                if (l2 - this.h > 5L && !bl2) {
                    this.aQ.a((n)this, (byte)32);
                    this.h = l2;
                } else {
                    this.F();
                    this.E();
                    this.aa();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 32) {
            if (this.aQ.C) {
                this.aQ.a(this.aU, this.aV, this.aW, net.minecraft.a.f.l, this.S(), 0.3f, 1.0f, false);
                this.h = this.aQ.B();
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cT().a() * 4.0;
        if (Double.isNaN(d3) || d3 == 0.0) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    private void E() {
        if (this.aQ instanceof v) {
            ((v)this.aQ).a(net.minecraft.u.aj.M, this.aU, this.aV + (double)this.bm / 1.5, this.aW, 10, (double)(this.bl / 4.0f), (double)(this.bm / 4.0f), (double)(this.bl / 4.0f), 0.05, cn.p(net.minecraft.a.p.f.v()));
        }
    }

    private void b(float f2) {
        float f3 = this.bo();
        if ((f3 -= f2) <= 0.5f) {
            this.I();
            this.aa();
        } else {
            this.h(f3);
        }
    }

    private void F() {
        cn.a(this.aQ, new net.minecraft.u.b.b(this), new cu(net.minecraft.a.w.ct));
        this.I();
    }

    private void I() {
        int n2;
        this.aQ.a(null, this.aU, this.aV, this.aW, net.minecraft.a.f.j, this.S(), 1.0f, 1.0f);
        for (n2 = 0; n2 < this.p.length; ++n2) {
            if (this.p[n2] == null || this.p[n2].b <= 0) continue;
            if (this.p[n2] != null) {
                cn.a(this.aQ, new net.minecraft.u.b.b(this).b(), this.p[n2]);
            }
            this.p[n2] = null;
        }
        for (n2 = 0; n2 < this.q.length; ++n2) {
            if (this.q[n2] == null || this.q[n2].b <= 0) continue;
            if (this.q[n2] != null) {
                cn.a(this.aQ, new net.minecraft.u.b.b(this).b(), this.q[n2]);
            }
            this.q[n2] = null;
        }
    }

    @Override
    protected float b_(float f2, float f3) {
        this.al = this.bc;
        this.ak = this.ba;
        return 0.0f;
    }

    @Override
    public float ce_() {
        return this.ba() ? this.bm * 0.5f : this.bm * 0.9f;
    }

    @Override
    public double Y() {
        return this.p() ? 0.0 : (double)0.1f;
    }

    @Override
    public void b(float f2, float f3) {
        if (!this.ci()) {
            super.b(f2, f3);
        }
    }

    @Override
    public void cE_() {
        net.minecraft.u.b.q q2;
        net.minecraft.u.b.q q3;
        net.minecraft.u.b.q q4;
        net.minecraft.u.b.q q5;
        net.minecraft.u.b.q q6;
        super.cE_();
        net.minecraft.u.b.q q7 = (net.minecraft.u.b.q)this.bE.a(b);
        if (!this.u.equals(q7)) {
            this.a(q7);
        }
        if (!this.v.equals(q6 = (net.minecraft.u.b.q)this.bE.a(c))) {
            this.b(q6);
        }
        if (!this.w.equals(q5 = (net.minecraft.u.b.q)this.bE.a(d))) {
            this.c(q5);
        }
        if (!this.x.equals(q4 = (net.minecraft.u.b.q)this.bE.a(e))) {
            this.d(q4);
        }
        if (!this.y.equals(q3 = (net.minecraft.u.b.q)this.bE.a(f))) {
            this.e(q3);
        }
        if (!this.z.equals(q2 = (net.minecraft.u.b.q)this.bE.a(g))) {
            this.f(q2);
        }
        boolean bl2 = this.p();
        if (!this.t && bl2) {
            this.a(false);
            this.aN = false;
        } else {
            if (!this.t || bl2) {
                return;
            }
            this.a(true);
            this.aN = true;
        }
        this.t = bl2;
    }

    private void a(boolean bl2) {
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        if (bl2) {
            this.d(0.5f, 1.975f);
        } else {
            this.d(0.0f, 0.0f);
        }
        this.e(d2, d3, d4);
    }

    @Override
    protected void cn_() {
        this.o(this.r);
    }

    @Override
    public void o(boolean bl2) {
        this.r = bl2;
        super.o(bl2);
    }

    @Override
    public boolean ba() {
        return this.a();
    }

    @Override
    public void aY() {
        this.aa();
    }

    @Override
    public boolean cX() {
        return this.cD();
    }

    private void c(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 1, bl2));
    }

    public boolean a() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    private void d(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 4, bl2));
    }

    public boolean c() {
        return ((Byte)this.bE.a(a) & 4) != 0;
    }

    private void e(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 8, bl2));
    }

    public boolean i() {
        return ((Byte)this.bE.a(a) & 8) != 0;
    }

    private void f(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 16, bl2));
    }

    public boolean p() {
        return ((Byte)this.bE.a(a) & 0x10) != 0;
    }

    private byte a(byte by2, int n2, boolean bl2) {
        by2 = bl2 ? (byte)(by2 | n2) : (byte)(by2 & ~n2);
        return by2;
    }

    public void a(net.minecraft.u.b.q q2) {
        this.u = q2;
        this.bE.b(b, q2);
    }

    public void b(net.minecraft.u.b.q q2) {
        this.v = q2;
        this.bE.b(c, q2);
    }

    public void c(net.minecraft.u.b.q q2) {
        this.w = q2;
        this.bE.b(d, q2);
    }

    public void d(net.minecraft.u.b.q q2) {
        this.x = q2;
        this.bE.b(e, q2);
    }

    public void e(net.minecraft.u.b.q q2) {
        this.y = q2;
        this.bE.b(f, q2);
    }

    public void f(net.minecraft.u.b.q q2) {
        this.z = q2;
        this.bE.b(g, q2);
    }

    public net.minecraft.u.b.q q() {
        return this.u;
    }

    public net.minecraft.u.b.q r() {
        return this.v;
    }

    public net.minecraft.u.b.q s() {
        return this.w;
    }

    public net.minecraft.u.b.q t() {
        return this.x;
    }

    public net.minecraft.u.b.q v() {
        return this.y;
    }

    public net.minecraft.u.b.q w() {
        return this.z;
    }

    @Override
    public boolean cg_() {
        return super.cg_() && !this.p();
    }

    @Override
    public ai aH() {
        return net.minecraft.u.ai.b;
    }

    @Override
    protected bv d(int n2) {
        return net.minecraft.a.f.k;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.l;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.j;
    }

    @Override
    public void a(a a2) {
    }

    @Override
    public boolean bY() {
        return false;
    }
}

