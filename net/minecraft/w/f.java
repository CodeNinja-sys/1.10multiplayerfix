/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.d.sz;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.a.w;
import net.minecraft.e.q;
import net.minecraft.h.au;
import net.minecraft.h.k;
import net.minecraft.m.ca;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.q.a.a.i;
import net.minecraft.q.a.a.r;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.a.c;
import net.minecraft.u.a.e;
import net.minecraft.u.ah;
import net.minecraft.u.ai;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.ad;
import net.minecraft.w.b.aw;
import net.minecraft.w.b.bd;
import net.minecraft.w.b.t;
import net.minecraft.w.b.v;
import net.minecraft.w.d;
import net.minecraft.w.e.bn;
import net.minecraft.w.f.ab;
import net.minecraft.w.f.ae;
import net.minecraft.w.j;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.o;
import net.minecraft.w.p;
import net.minecraft.x.a.g;
import net.minecraft.x.d.b.cc;

public abstract class f
extends l {
    private static final g a = net.minecraft.x.a.o.a(f.class, net.minecraft.x.a.q.a);
    public int j;
    protected int k;
    private final aw b;
    protected ad l;
    protected t m;
    private final o c;
    protected net.minecraft.i.j n;
    protected final bd o;
    protected final bd p;
    private l d;
    private final v e;
    private final cu[] f = new cu[2];
    protected float[] q = new float[2];
    private final cu[] g = new cu[4];
    protected float[] r = new float[4];
    private boolean h;
    private boolean i;
    private final Map s = sz.a(net.minecraft.i.h.class);
    private bp t;
    private long u;
    private boolean v;
    private n w;
    private net.minecraft.e.e x;

    public f(net.minecraft.q.k k2) {
        super(k2);
        this.o = new bd(k2 != null && k2.A != null ? k2.A : null);
        this.p = new bd(k2 != null && k2.A != null ? k2.A : null);
        this.b = new aw(this);
        this.l = new ad(this);
        this.m = new t(this);
        this.c = this.F();
        this.n = this.a(k2);
        this.e = new v(this);
        Arrays.fill(this.r, 0.085f);
        Arrays.fill(this.q, 0.085f);
        if (k2 != null && !k2.C && !(this instanceof net.minecraft.l.b.b)) {
            this.cA_();
        }
    }

    protected void cA_() {
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.bA().b(net.minecraft.w.d.b).a(16.0);
    }

    protected net.minecraft.i.j a(net.minecraft.q.k k2) {
        if (this instanceof net.minecraft.l.b.b) {
            return new net.minecraft.i.a(this, k2, true);
        }
        return new net.minecraft.i.a(this, k2);
    }

    public float a(net.minecraft.i.h h2) {
        Float f2 = (Float)this.s.get((Object)h2);
        return f2 == null ? h2.a() : f2.floatValue();
    }

    public void a(net.minecraft.i.h h2, float f2) {
        this.s.put(h2, Float.valueOf(f2));
    }

    protected o F() {
        return new o(this);
    }

    public aw I() {
        return this.b;
    }

    public ad L() {
        return this.l;
    }

    public t M() {
        return this.m;
    }

    public net.minecraft.i.j N() {
        return this.n;
    }

    public v V() {
        return this.e;
    }

    public l W() {
        return this.d;
    }

    public void c(l l2) {
        this.d = l2;
    }

    public boolean a(Class class_) {
        return class_ != bn.class;
    }

    public void Z() {
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
    }

    public int ac() {
        return 80;
    }

    public void ad() {
        if (this instanceof net.minecraft.l.b.b) {
            return;
        }
        bv bv2 = this.j();
        if (bv2 != null) {
            this.a(bv2, this.bE(), this.bF());
        }
    }

    private void l(double d2, double d3, double d4) {
        double d5 = d2 - this.aU;
        double d6 = d4 - this.aW;
        double d7 = d3 + 0.5;
        float f2 = (float)(Math.atan2(d6, d5) * 180.0 / Math.PI) - 90.0f;
        float f3 = f2 - this.ba;
        this.ba += f3;
        double d8 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
        float f4 = (float)(-(Math.atan2(d3, d8) * 180.0 / Math.PI));
        this.bb = -this.a(this.bb, f4, 80.0f);
        if (net.minecraft.client.r.I.l.aV > this.aV && net.minecraft.client.r.I.l.aV - this.aV < 4.0) {
            this.bb = 0.0f;
        }
        if (net.minecraft.client.r.I.l.aV > this.aV && net.minecraft.client.r.I.l.aV - this.aV < 7.0) {
            this.bb = -15.0f;
        }
        if (net.minecraft.client.r.I.l.aV > this.aV && net.minecraft.client.r.I.l.aV - this.aV >= 7.0) {
            this.bb = -30.0f;
        }
        if (net.minecraft.client.r.I.l.aV <= this.aV + 2.0) {
            this.bb = 0.0f;
        }
    }

    @Override
    public void cf_() {
        super.cf_();
        this.aQ.A.a("mobBaseTick");
        if (this.br() && this.bx.nextInt(1000) < this.j++) {
            this.p();
            this.ad();
        }
        this.aQ.A.b();
    }

    @Override
    protected void c(net.minecraft.u.n n2) {
        this.p();
        super.c(n2);
    }

    private void p() {
        this.j = -this.ac();
    }

    @Override
    protected int b_(b b2) {
        if (this.k > 0) {
            int n2;
            int n3 = this.k;
            for (n2 = 0; n2 < this.g.length; ++n2) {
                if (this.g[n2] == null || !(this.r[n2] <= 1.0f)) continue;
                n3 += 1 + this.bx.nextInt(3);
            }
            for (n2 = 0; n2 < this.f.length; ++n2) {
                if (this.f[n2] == null || !(this.q[n2] <= 1.0f)) continue;
                n3 += 1 + this.bx.nextInt(3);
            }
            return n3;
        }
        return this.k;
    }

    public void ag() {
        if (this.aQ.C) {
            for (int i2 = 0; i2 < 20; ++i2) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                double d5 = 10.0;
                this.aQ.a(net.minecraft.u.aj.a, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl - d2 * 10.0, this.aV + (double)(this.bx.nextFloat() * this.bm) - d3 * 10.0, this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl - d4 * 10.0, d2, d3, d4, new int[0]);
            }
        } else {
            this.aQ.a((n)this, (byte)20);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 20) {
            this.ag();
        } else {
            super.a(by2);
        }
    }

    @Override
    public void cE_() {
        super.cE_();
        if (!this.aQ.C) {
            this.aN();
            if (this.by % 5 == 0) {
                boolean bl2 = !(this.da() instanceof f);
                boolean bl3 = !(this.df() instanceof ab);
                this.o.a(1, bl2);
                this.o.a(4, bl2 && bl3);
                this.o.a(2, bl2);
            }
        }
    }

    @Override
    protected float b_(float f2, float f3) {
        this.c.a();
        return f3;
    }

    protected bv j() {
        return null;
    }

    protected cg ah() {
        return null;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        cg cg2 = this.ah();
        if (cg2 != null) {
            int n3 = this.bx.nextInt(3);
            if (n2 > 0) {
                n3 += this.bx.nextInt(n2 + 1);
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(cg2, 1);
            }
        }
    }

    public static void a(a a2, String string) {
        a2.a(net.minecraft.u.a.c.e, (e)new net.minecraft.u.a.b.e(string, "ArmorItems", "HandItems"));
    }

    public static void b(a a2) {
        net.minecraft.w.f.a(a2, "Mob");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        Object object;
        cu[] arrcu;
        Object object2;
        super.a(e2);
        e2.a("CanPickUpLoot", this.aL());
        e2.a("PersistenceRequired", this.i);
        q q2 = new q();
        cu[] arrcu2 = this.g;
        int n2 = this.g.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = arrcu2[i2];
            arrcu = new net.minecraft.e.e();
            if (object2 != null) {
                ((cu)object2).b((net.minecraft.e.e)arrcu);
            }
            q2.a((net.minecraft.e.a)arrcu);
        }
        e2.a("ArmorItems", q2);
        object2 = new q();
        arrcu = this.f;
        int n3 = this.f.length;
        for (n2 = 0; n2 < n3; ++n2) {
            cu cu2 = arrcu[n2];
            object = new net.minecraft.e.e();
            if (cu2 != null) {
                cu2.b((net.minecraft.e.e)object);
            }
            ((q)object2).a((net.minecraft.e.a)object);
        }
        e2.a("HandItems", (net.minecraft.e.a)object2);
        q q3 = new q();
        object = this.r;
        int n4 = this.r.length;
        for (n3 = 0; n3 < n4; ++n3) {
            Object object3 = object[n3];
            q3.a(new net.minecraft.e.b((float)object3));
        }
        e2.a("ArmorDropChances", q3);
        q q4 = new q();
        float[] arrf = this.q;
        int n5 = this.q.length;
        for (n4 = 0; n4 < n5; ++n4) {
            float f2 = arrf[n4];
            q4.a(new net.minecraft.e.b(f2));
        }
        e2.a("HandDropChances", q4);
        e2.a("Leashed", this.v);
        if (this.w != null) {
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            if (this.w instanceof l) {
                UUID uUID = this.w.cM();
                e3.a("UUID", uUID);
            } else if (this.w instanceof j) {
                net.minecraft.u.b.b b2 = ((j)this.w).l();
                e3.a("X", b2.cy_());
                e3.a("Y", b2.k());
                e3.a("Z", b2.l());
            }
            e2.a("Leash", e3);
        }
        e2.a("LeftHanded", this.aU());
        if (this.t != null) {
            e2.a("DeathLootTable", this.t.toString());
            if (this.u != 0L) {
                e2.a("DeathLootTableSeed", this.u);
            }
        }
        if (this.aT()) {
            e2.a("NoAI", this.aT());
        }
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        int n2;
        q q2;
        super.b(e2);
        if (e2.b("CanPickUpLoot", 1)) {
            this.f(e2.p("CanPickUpLoot"));
        }
        this.i = e2.p("PersistenceRequired");
        if (e2.b("ArmorItems", 9)) {
            q2 = e2.c("ArmorItems", 10);
            for (n2 = 0; n2 < this.g.length; ++n2) {
                this.g[n2] = cu.a(q2.b(n2));
            }
        }
        if (e2.b("HandItems", 9)) {
            q2 = e2.c("HandItems", 10);
            for (n2 = 0; n2 < this.f.length; ++n2) {
                this.f[n2] = cu.a(q2.b(n2));
            }
        }
        if (e2.b("ArmorDropChances", 9)) {
            q2 = e2.c("ArmorDropChances", 5);
            for (n2 = 0; n2 < q2.e(); ++n2) {
                this.r[n2] = q2.f(n2);
            }
        }
        if (e2.b("HandDropChances", 9)) {
            q2 = e2.c("HandDropChances", 5);
            for (n2 = 0; n2 < q2.e(); ++n2) {
                this.q[n2] = q2.f(n2);
            }
        }
        this.v = e2.p("Leashed");
        if (this.v && e2.b("Leash", 10)) {
            this.x = e2.o("Leash");
        }
        this.h(e2.p("LeftHanded"));
        if (e2.b("DeathLootTable", 8)) {
            this.t = new bp(e2.l("DeathLootTable"));
            this.u = e2.i("DeathLootTableSeed");
        }
        this.g(e2.p("NoAI"));
    }

    protected bp ai() {
        return null;
    }

    @Override
    protected void a(boolean bl2, int n2, net.minecraft.u.n n3) {
        bp bp2 = this.t;
        if (bp2 == null) {
            bp2 = this.ai();
        }
        if (bp2 != null) {
            i i2 = this.aQ.W().a(bp2);
            this.t = null;
            r r2 = new r((net.minecraft.q.v)this.aQ).a(this).a(n3);
            if (bl2 && this.ap != null) {
                r2 = r2.a(this.ap).a(this.ap.aM());
            }
            for (cu cu2 : i2.a(this.u == 0L ? this.bx : new Random(this.u), r2.a())) {
                this.a(cu2, 0.0f);
            }
            this.b(bl2, n2);
        } else {
            super.a(bl2, n2, n3);
        }
    }

    public void b(float f2) {
        this.aC = f2;
    }

    public void e(float f2) {
        this.aB = f2;
    }

    @Override
    public void e_(float f2) {
        super.e_(f2);
        this.b(f2);
    }

    @Override
    public void n() {
        super.n();
        this.aQ.A.a("looting");
        if (!this.aQ.C && this.aL() && !this.ar && this.aQ.G().b("mobGriefing")) {
            for (ae ae2 : this.aQ.a(ae.class, this.cT().b(1.0, 0.0, 1.0))) {
                if (ae2.bk || ae2.c() == null || ae2.q()) continue;
                this.a(ae2);
            }
        }
        this.aQ.A.b();
    }

    protected void a(ae ae2) {
        cu cu2 = ae2.c();
        k k2 = net.minecraft.w.f.c(cu2);
        boolean bl2 = true;
        cu cu3 = this.a(k2);
        if (cu3 != null) {
            cg cg2;
            if (k2.a() == net.minecraft.h.au.a) {
                if (cu2.a() instanceof ca && !(cu3.a() instanceof ca)) {
                    bl2 = true;
                } else if (cu2.a() instanceof ca && cu3.a() instanceof ca) {
                    cg2 = (ca)cu2.a();
                    ca ca2 = (ca)cu3.a();
                    bl2 = ((ca)cg2).e() == ca2.e() ? cu2.h() > cu3.h() || cu2.n() && !cu3.n() : ((ca)cg2).e() > ca2.e();
                } else {
                    bl2 = cu2.a() instanceof net.minecraft.m.bn && cu3.a() instanceof net.minecraft.m.bn ? cu2.n() && !cu3.n() : false;
                }
            } else if (cu2.a() instanceof dn && !(cu3.a() instanceof dn)) {
                bl2 = true;
            } else if (cu2.a() instanceof dn && cu3.a() instanceof dn) {
                cg2 = (dn)cu2.a();
                dn dn2 = (dn)cu3.a();
                bl2 = ((dn)cg2).d == dn2.d ? cu2.h() > cu3.h() || cu2.n() && !cu3.n() : ((dn)cg2).d > dn2.d;
            } else {
                bl2 = false;
            }
        }
        if (bl2 && this.b(cu2)) {
            b b2;
            double d2;
            switch (k2.a()) {
                case a: {
                    d2 = this.q[k2.b()];
                    break;
                }
                case b: {
                    d2 = this.r[k2.b()];
                    break;
                }
                default: {
                    d2 = 0.0;
                }
            }
            if (cu3 != null && (double)(this.bx.nextFloat() - 0.1f) < d2) {
                this.a(cu3, 0.0f);
            }
            if (cu2.a() == net.minecraft.a.w.k && ae2.g() != null && (b2 = this.aQ.a(ae2.g())) != null) {
                b2.a((net.minecraft.r.k)net.minecraft.r.j.x);
            }
            this.a(k2, cu2);
            switch (k2.a()) {
                case a: {
                    this.q[k2.b()] = 2.0f;
                    break;
                }
                case b: {
                    this.r[k2.b()] = 2.0f;
                }
            }
            this.i = true;
            this.b((n)ae2, 1);
            ae2.aa();
        }
    }

    protected boolean b(cu cu2) {
        return true;
    }

    protected boolean i() {
        return true;
    }

    protected void an() {
        if (this.i) {
            this.as = 0;
        } else {
            b b2 = this.aQ.a((n)this, -1.0);
            if (b2 != null) {
                double d2 = b2.aU - this.aU;
                double d3 = b2.aV - this.aV;
                double d4 = b2.aW - this.aW;
                double d5 = d2 * d2 + d3 * d3 + d4 * d4;
                if (this.i() && d5 > 16384.0) {
                    this.aa();
                }
                if (this.as > 600 && this.bx.nextInt(800) == 0 && d5 > 1024.0 && this.i()) {
                    this.aa();
                } else if (d5 < 1024.0) {
                    this.as = 0;
                }
            }
        }
    }

    @Override
    protected final void H() {
        ++this.as;
        this.aQ.A.a("checkDespawn");
        this.an();
        this.aQ.A.b();
        this.aQ.A.a("sensing");
        this.e.a();
        this.aQ.A.b();
        this.aQ.A.a("targetSelector");
        this.p.a();
        this.aQ.A.b();
        this.aQ.A.a("goalSelector");
        this.o.a();
        this.aQ.A.b();
        this.aQ.A.a("navigation");
        this.n.k();
        this.aQ.A.b();
        this.aQ.A.a("mob tick");
        this.e();
        this.aQ.A.b();
        if (this.cz() && this.df() instanceof f) {
            f f2 = (f)this.df();
            f2.N().a(this.N().j(), 1.5);
            f2.L().a(this.L());
        }
        this.aQ.A.a("controls");
        this.aQ.A.a("move");
        this.l.c();
        this.aQ.A.c("look");
        this.b.a();
        this.aQ.A.c("jump");
        this.m.b();
        this.aQ.A.b();
        this.aQ.A.b();
    }

    protected void e() {
    }

    public int ao() {
        return 40;
    }

    public int ap() {
        return 10;
    }

    public void a(n n2, float f2, float f3) {
        double d2;
        double d3 = n2.aU - this.aU;
        double d4 = n2.aW - this.aW;
        if (n2 instanceof l) {
            l l2 = (l)n2;
            d2 = l2.aV + (double)l2.ce_() - (this.aV + (double)this.ce_());
        } else {
            d2 = (n2.cT().b + n2.cT().e) / 2.0 - (this.aV + (double)this.ce_());
        }
        double d5 = net.minecraft.u.b.n.a(d3 * d3 + d4 * d4);
        float f4 = (float)(net.minecraft.u.b.n.b(d4, d3) * 57.29577951308232) - 90.0f;
        float f5 = (float)(-(net.minecraft.u.b.n.b(d2, d5) * 57.29577951308232));
        this.bb = this.a(this.bb, f5, f3);
        this.ba = this.a(this.ba, f4, f2);
    }

    protected float a(float f2, float f3, float f4) {
        float f5 = net.minecraft.u.b.n.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean aq() {
        net.minecraft.g.c.b b2 = this.aQ.n(new net.minecraft.u.b.b(this).c());
        return b2.a(this);
    }

    public boolean ar() {
        return !this.aQ.e(this.cT()) && this.aQ.a((n)this, this.cT()).isEmpty() && this.aQ.a(this.cT(), (n)this);
    }

    public float av() {
        return 1.0f;
    }

    public int az() {
        return 4;
    }

    @Override
    public int ck_() {
        if (this.W() == null) {
            return 3;
        }
        int n2 = (int)(this.bo() - this.bw() * 0.33f);
        if ((n2 -= (3 - this.aQ.R().a()) * 4) < 0) {
            n2 = 0;
        }
        return n2 + 3;
    }

    @Override
    public Iterable aw() {
        return Arrays.asList(this.f);
    }

    @Override
    public Iterable ax() {
        return Arrays.asList(this.g);
    }

    @Override
    public cu a(k k2) {
        cu cu2 = null;
        switch (k2.a()) {
            case a: {
                cu2 = this.f[k2.b()];
                break;
            }
            case b: {
                cu2 = this.g[k2.b()];
            }
        }
        return cu2;
    }

    @Override
    public void a(k k2, cu cu2) {
        switch (k2.a()) {
            case a: {
                this.f[k2.b()] = cu2;
                break;
            }
            case b: {
                this.g[k2.b()] = cu2;
            }
        }
    }

    @Override
    protected void b(boolean bl2, int n2) {
        for (k k2 : net.minecraft.h.k.values()) {
            boolean bl3;
            double d2;
            cu cu2 = this.a(k2);
            switch (k2.a()) {
                case a: {
                    d2 = this.q[k2.b()];
                    break;
                }
                case b: {
                    d2 = this.r[k2.b()];
                    break;
                }
                default: {
                    d2 = 0.0;
                }
            }
            boolean bl4 = bl3 = d2 > 1.0;
            if (cu2 == null || !bl2 && !bl3 || !((double)(this.bx.nextFloat() - (float)n2 * 0.01f) < d2)) continue;
            if (!bl3 && cu2.d()) {
                int n3 = Math.max(cu2.i() - 25, 1);
                int n4 = cu2.i() - this.bx.nextInt(this.bx.nextInt(n3) + 1);
                if (n4 > n3) {
                    n4 = n3;
                }
                if (n4 < 1) {
                    n4 = 1;
                }
                cu2.b(n4);
            }
            this.a(cu2, 0.0f);
        }
    }

    protected void a(z z2) {
        if (this.bx.nextFloat() < 0.15f * z2.c()) {
            float f2;
            int n2 = this.bx.nextInt(2);
            float f3 = f2 = this.aQ.R() == net.minecraft.q.l.d ? 0.1f : 0.25f;
            if (this.bx.nextFloat() < 0.095f) {
                ++n2;
            }
            if (this.bx.nextFloat() < 0.095f) {
                ++n2;
            }
            if (this.bx.nextFloat() < 0.095f) {
                ++n2;
            }
            boolean bl2 = true;
            for (k k2 : net.minecraft.h.k.values()) {
                cg cg2;
                if (k2.a() != net.minecraft.h.au.b) continue;
                cu cu2 = this.a(k2);
                if (!bl2 && this.bx.nextFloat() < f2) break;
                bl2 = false;
                if (cu2 != null || (cg2 = net.minecraft.w.f.a(k2, n2)) == null) continue;
                this.a(k2, new cu(cg2));
            }
        }
    }

    public static k c(cu cu2) {
        return cu2.a() != cg.a(net.minecraft.a.p.aU) && cu2.a() != net.minecraft.a.w.ch ? (cu2.a() instanceof dn ? ((dn)cu2.a()).c : (cu2.a() == net.minecraft.a.w.cR ? net.minecraft.h.k.e : (cu2.a() == net.minecraft.a.w.cQ ? net.minecraft.h.k.b : net.minecraft.h.k.a))) : net.minecraft.h.k.f;
    }

    public static cg a(k k2, int n2) {
        switch (k2) {
            case f: {
                if (n2 == 0) {
                    return net.minecraft.a.w.S;
                }
                if (n2 == 1) {
                    return net.minecraft.a.w.ai;
                }
                if (n2 == 2) {
                    return net.minecraft.a.w.W;
                }
                if (n2 == 3) {
                    return net.minecraft.a.w.aa;
                }
                if (n2 == 4) {
                    return net.minecraft.a.w.ae;
                }
            }
            case e: {
                if (n2 == 0) {
                    return net.minecraft.a.w.T;
                }
                if (n2 == 1) {
                    return net.minecraft.a.w.aj;
                }
                if (n2 == 2) {
                    return net.minecraft.a.w.X;
                }
                if (n2 == 3) {
                    return net.minecraft.a.w.ab;
                }
                if (n2 == 4) {
                    return net.minecraft.a.w.af;
                }
            }
            case d: {
                if (n2 == 0) {
                    return net.minecraft.a.w.U;
                }
                if (n2 == 1) {
                    return net.minecraft.a.w.ak;
                }
                if (n2 == 2) {
                    return net.minecraft.a.w.Y;
                }
                if (n2 == 3) {
                    return net.minecraft.a.w.ac;
                }
                if (n2 == 4) {
                    return net.minecraft.a.w.ag;
                }
            }
            case c: {
                if (n2 == 0) {
                    return net.minecraft.a.w.V;
                }
                if (n2 == 1) {
                    return net.minecraft.a.w.al;
                }
                if (n2 == 2) {
                    return net.minecraft.a.w.Z;
                }
                if (n2 == 3) {
                    return net.minecraft.a.w.ad;
                }
                if (n2 != 4) break;
                return net.minecraft.a.w.ah;
            }
        }
        return null;
    }

    protected void b(z z2) {
        float f2 = z2.c();
        if (this.bC() != null && this.bx.nextFloat() < 0.25f * f2) {
            net.minecraft.o.f.a(this.bx, this.bC(), (int)(5.0f + f2 * (float)this.bx.nextInt(18)), false);
        }
        for (k k2 : net.minecraft.h.k.values()) {
            cu cu2;
            if (k2.a() != net.minecraft.h.au.b || (cu2 = this.a(k2)) == null || !(this.bx.nextFloat() < 0.5f * f2)) continue;
            net.minecraft.o.f.a(this.bx, cu2, (int)(5.0f + f2 * (float)this.bx.nextInt(18)), false);
        }
    }

    public ac a(z z2, ac ac2) {
        this.a(net.minecraft.w.d.b).b(new h("Random spawn bonus", this.bx.nextGaussian() * 0.05, 1));
        if (this.bx.nextFloat() < 0.05f) {
            this.h(true);
        } else {
            this.h(false);
        }
        return ac2;
    }

    public boolean aI() {
        return false;
    }

    public void aJ() {
        this.i = true;
    }

    public void a(k k2, float f2) {
        switch (k2.a()) {
            case a: {
                this.q[k2.b()] = f2;
                break;
            }
            case b: {
                this.r[k2.b()] = f2;
            }
        }
    }

    public boolean aL() {
        return this.h;
    }

    public void f(boolean bl2) {
        this.h = bl2;
    }

    public boolean aM() {
        return this.i;
    }

    @Override
    public final boolean a(b b2, cu cu2, ah ah2) {
        if (this.aO() && this.aQ() == b2) {
            this.a(true, !b2.J.d);
            return true;
        }
        if (cu2 != null && cu2.a() == net.minecraft.a.w.cx && this.c(b2)) {
            this.b((n)b2, true);
            --cu2.b;
            return true;
        }
        return this.a(b2, ah2, cu2) ? true : super.a(b2, cu2, ah2);
    }

    protected boolean a(b b2, ah ah2, cu cu2) {
        return false;
    }

    protected void aN() {
        if (this.x != null) {
            this.q();
        }
        if (this.v) {
            if (!this.br()) {
                this.a(true, true);
            }
            if (this.w == null || this.w.bk) {
                this.a(true, true);
            }
        }
    }

    public void a(boolean bl2, boolean bl3) {
        if (this.v) {
            this.v = false;
            this.w = null;
            if (!this.aQ.C && bl3) {
                this.a(net.minecraft.a.w.cx, 1);
            }
            if (!this.aQ.C && bl2 && this.aQ instanceof net.minecraft.q.v) {
                ((net.minecraft.q.v)this.aQ).ae().a(this, new cc(this, null));
            }
        }
    }

    public boolean c(b b2) {
        return !this.aO() && !(this instanceof net.minecraft.w.e.aw);
    }

    public boolean aO() {
        return this.v;
    }

    public n aQ() {
        return this.w;
    }

    public void b(n n2, boolean bl2) {
        this.v = true;
        this.w = n2;
        if (!this.aQ.C && bl2 && this.aQ instanceof net.minecraft.q.v) {
            ((net.minecraft.q.v)this.aQ).ae().a(this, new cc(this, this.w));
        }
        if (this.cz()) {
            this.o();
        }
    }

    @Override
    public boolean a(n n2, boolean bl2) {
        boolean bl3 = super.a(n2, bl2);
        if (bl3 && this.aO()) {
            this.a(true, true);
        }
        return bl3;
    }

    private void q() {
        if (this.v && this.x != null) {
            if (this.x.b("UUID")) {
                UUID uUID = this.x.a("UUID");
                for (l l2 : this.aQ.a(l.class, this.cT().b(10.0))) {
                    if (!l2.cM().equals(uUID)) continue;
                    this.w = l2;
                    break;
                }
            } else if (this.x.b("X", 99) && this.x.b("Y", 99) && this.x.b("Z", 99)) {
                net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.x.h("X"), this.x.h("Y"), this.x.h("Z"));
                p p2 = net.minecraft.w.p.b(this.aQ, b2);
                if (p2 == null) {
                    p2 = net.minecraft.w.p.a(this.aQ, b2);
                }
                this.w = p2;
            } else {
                this.a(false, true);
            }
        }
        this.x = null;
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

    public static boolean b(k k2, cu cu2) {
        k k3 = net.minecraft.w.f.c(cu2);
        return k3 == k2 || k3 == net.minecraft.h.k.a && k2 == net.minecraft.h.k.b || k3 == net.minecraft.h.k.b && k2 == net.minecraft.h.k.a;
    }

    @Override
    public boolean A() {
        return super.A() && !this.aT();
    }

    public void g(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        this.bE.b(a, bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE));
    }

    public void h(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        this.bE.b(a, bl2 ? (byte)(by2 | 2) : (byte)(by2 & 0xFFFFFFFD));
    }

    public boolean aT() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public boolean aU() {
        return ((Byte)this.bE.a(a) & 2) != 0;
    }

    @Override
    public ai aH() {
        return this.aU() ? net.minecraft.u.ai.a : net.minecraft.u.ai.b;
    }
}

