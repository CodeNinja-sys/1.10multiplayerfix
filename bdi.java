/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.Arrays;
import java.util.List;

public class bdi
extends bga {
    private static final cig i = new cig(0.0f, 0.0f, 0.0f);
    private static final cig j = new cig(0.0f, 0.0f, 0.0f);
    private static final cig k = new cig(-10.0f, 0.0f, -10.0f);
    private static final cig l = new cig(-15.0f, 0.0f, 10.0f);
    private static final cig m = new cig(-1.0f, 0.0f, -1.0f);
    private static final cig n = new cig(1.0f, 0.0f, 1.0f);
    public static final bcz a = bwm.a(bdi.class, cbf.a);
    public static final bcz b = bwm.a(bdi.class, cbf.i);
    public static final bcz c = bwm.a(bdi.class, cbf.i);
    public static final bcz d = bwm.a(bdi.class, cbf.i);
    public static final bcz e = bwm.a(bdi.class, cbf.i);
    public static final bcz f = bwm.a(bdi.class, cbf.i);
    public static final bcz g = bwm.a(bdi.class, cbf.i);
    private static final cm o = new aim();
    private final bhl[] p = new bhl[2];
    private final bhl[] q = new bhl[4];
    private boolean r;
    public long h;
    private int s;
    private boolean t;
    private cig u = i;
    private cig v = j;
    private cig w = k;
    private cig x = l;
    private cig y = m;
    private cig z = n;

    public bdi(iu iu2) {
        super(iu2);
        this.bv = this.cf();
        this.a_(0.5f, 1.975f);
    }

    public bdi(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
    }

    @Override
    public boolean T_() {
        return super.T_() && !this.cf();
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
        this.bE.a(b, i);
        this.bE.a(c, j);
        this.bE.a(d, k);
        this.bE.a(e, l);
        this.bE.a(f, m);
        this.bE.a(g, n);
    }

    @Override
    public Iterable aA() {
        return Arrays.asList(this.p);
    }

    @Override
    public Iterable aB() {
        return Arrays.asList(this.q);
    }

    @Override
    public bhl a(dfm dfm2) {
        bhl bhl2 = null;
        switch (dfm2.a()) {
            case a: {
                bhl2 = this.p[dfm2.b()];
                break;
            }
            case b: {
                bhl2 = this.q[dfm2.b()];
            }
        }
        return bhl2;
    }

    @Override
    public void a(dfm dfm2, bhl bhl2) {
        switch (dfm2.a()) {
            case a: {
                this.d(bhl2);
                this.p[dfm2.b()] = bhl2;
                break;
            }
            case b: {
                this.d(bhl2);
                this.q[dfm2.b()] = bhl2;
            }
        }
    }

    @Override
    public boolean a_(int n2, bhl bhl2) {
        dfm dfm2;
        if (n2 == 98) {
            dfm2 = dfm.a;
        } else if (n2 == 99) {
            dfm2 = dfm.b;
        } else if (n2 == 100 + dfm.f.b()) {
            dfm2 = dfm.f;
        } else if (n2 == 100 + dfm.e.b()) {
            dfm2 = dfm.e;
        } else if (n2 == 100 + dfm.d.b()) {
            dfm2 = dfm.d;
        } else if (n2 == 100 + dfm.c.b()) {
            dfm2 = dfm.c;
        } else {
            return false;
        }
        if (bhl2 == null || xy.b(dfm2, bhl2) || dfm2 == dfm.f) {
            this.a(dfm2, bhl2);
            return true;
        }
        return false;
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.e, (cui)new ml("ArmorStand", "ArmorItems", "HandItems"));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bmh bmh2 = new bmh();
        for (bhl bhl2 : this.q) {
            bvp object = new bvp();
            if (bhl2 != null) {
                bhl2.b(object);
            }
            bmh2.a(object);
        }
        bvp2.a("ArmorItems", bmh2);
        bmh bmh3 = new bmh();
        for (bhl bhl2 : this.p) {
            bvp bvp3 = new bvp();
            if (bhl2 != null) {
                bhl2.b(bvp3);
            }
            bmh3.a(bvp3);
        }
        bvp2.a("HandItems", bmh3);
        if (this.cB() && (this.cA() == null || this.cA().isEmpty())) {
            bvp2.a("CustomNameVisible", this.cB());
        }
        bvp2.a("Invisible", this.ct());
        bvp2.a("Small", this.z());
        bvp2.a("ShowArms", this.C());
        bvp2.a("DisabledSlots", this.s);
        bvp2.a("NoBasePlate", this.T());
        if (this.Z()) {
            bvp2.a("Marker", this.Z());
        }
        bvp2.a("Pose", this.ao());
    }

    @Override
    public void b(bvp bvp2) {
        int n2;
        azt azt2;
        super.b(bvp2);
        if (bvp2.b("ArmorItems", 9)) {
            azt2 = bvp2.c("ArmorItems", 10);
            for (n2 = 0; n2 < this.q.length; ++n2) {
                this.q[n2] = bhl.a(azt2.b(n2));
            }
        }
        if (bvp2.b("HandItems", 9)) {
            azt2 = bvp2.c("HandItems", 10);
            for (n2 = 0; n2 < this.p.length; ++n2) {
                this.p[n2] = bhl.a(azt2.b(n2));
            }
        }
        this.e_(bvp2.p("Invisible"));
        this.e(bvp2.p("Small"));
        this.f(bvp2.p("ShowArms"));
        this.s = bvp2.h("DisabledSlots");
        this.g(bvp2.p("NoBasePlate"));
        this.h(bvp2.p("Marker"));
        this.t = !this.Z();
        this.bv = this.cf();
        azt2 = bvp2.o("Pose");
        this.g((bvp)azt2);
    }

    private void g(bvp bvp2) {
        bmh bmh2 = bvp2.c("Head", 5);
        this.a(bmh2.j() ? i : new cig(bmh2));
        bmh bmh3 = bvp2.c("Body", 5);
        this.b(bmh3.j() ? j : new cig(bmh3));
        bmh bmh4 = bvp2.c("LeftArm", 5);
        this.c(bmh4.j() ? k : new cig(bmh4));
        bmh bmh5 = bvp2.c("RightArm", 5);
        this.d(bmh5.j() ? l : new cig(bmh5));
        bmh bmh6 = bvp2.c("LeftLeg", 5);
        this.e(bmh6.j() ? m : new cig(bmh6));
        bmh bmh7 = bvp2.c("RightLeg", 5);
        this.f(bmh7.j() ? n : new cig(bmh7));
    }

    private bvp ao() {
        bvp bvp2 = new bvp();
        if (!i.equals(this.u)) {
            bvp2.a("Head", this.u.a());
        }
        if (!j.equals(this.v)) {
            bvp2.a("Body", this.v.a());
        }
        if (!k.equals(this.w)) {
            bvp2.a("LeftArm", this.w.a());
        }
        if (!l.equals(this.x)) {
            bvp2.a("RightArm", this.x.a());
        }
        if (!m.equals(this.y)) {
            bvp2.a("LeftLeg", this.y.a());
        }
        if (!n.equals(this.z)) {
            bvp2.a("RightLeg", this.z.a());
        }
        return bvp2;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    protected void b(cpk cpk2) {
    }

    @Override
    protected void ae_() {
        List list = this.aQ.a((cpk)this, this.cD(), o);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            cpk cpk2 = (cpk)list.get(i2);
            if (!(this.l(cpk2) <= 0.2)) continue;
            cpk2.e_(this);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public cey a(bdl var1_1, amj var2_2, bhl var3_3, bqp var4_4) {
        block11: {
            block12: {
                block10: {
                    if (this.Z()) {
                        return cey.b;
                    }
                    if (this.aQ.C != false) return cey.a;
                    if (var1_1.aL()) {
                        return cey.a;
                    }
                    var5_5 = dfm.a;
                    var6_6 = var3_3 != null;
                    v0 = var7_7 = var6_6 != false ? var3_3.a() : null;
                    if (var6_6 && var7_7 instanceof uh) {
                        var5_5 = ((uh)var7_7).c;
                    }
                    if (var6_6 && (var7_7 == hp.ch || var7_7 == azg.a(blg.aU))) {
                        var5_5 = dfm.f;
                    }
                    var8_8 = 0.1;
                    var10_9 = 0.9;
                    var12_10 = 0.4;
                    var14_11 = 1.6;
                    var16_12 = dfm.a;
                    var17_13 = this.z();
                    v1 = var18_14 = var17_13 != false ? var2_2.c * 2.0 : var2_2.c;
                    if (!(var18_14 >= 0.1)) break block10;
                    v2 = var17_13 != false ? 0.8 : 0.45;
                    if (!(var18_14 < 0.1 + v2) || this.a(dfm.c) == null) break block10;
                    var16_12 = dfm.c;
                    break block11;
                }
                v3 = var17_13 != false ? 0.3 : 0.0;
                if (!(var18_14 >= 0.9 + v3)) break block12;
                v4 = var17_13 != false ? 1.0 : 0.7;
                if (!(var18_14 < 0.9 + v4) || this.a(dfm.e) == null) break block12;
                var16_12 = dfm.e;
                break block11;
            }
            if (!(var18_14 >= 0.4)) ** GOTO lbl-1000
            v5 = var17_13 != false ? 1.0 : 0.8;
            if (var18_14 < 0.4 + v5 && this.a(dfm.d) != null) {
                var16_12 = dfm.d;
            } else if (var18_14 >= 1.6 && this.a(dfm.f) != null) {
                var16_12 = dfm.f;
            }
        }
        v6 = var20_15 = this.a(var16_12) != null;
        if ((this.b(var16_12) || this.b(var5_5)) && this.b(var16_12 = var5_5)) {
            return cey.c;
        }
        if (var6_6 && var5_5 == dfm.a && !this.C()) {
            return cey.c;
        }
        if (var6_6) {
            this.a(var1_1, var5_5, var3_3, var4_4);
            return cey.a;
        }
        if (var20_15 == false) return cey.a;
        this.a(var1_1, var16_12, var3_3, var4_4);
        return cey.a;
    }

    private boolean b(dfm dfm2) {
        return (this.s & 1 << dfm2.c()) != 0;
    }

    private void a(bdl bdl2, dfm dfm2, bhl bhl2, bqp bqp2) {
        bhl bhl3 = this.a(dfm2);
        if (bhl3 != null && (this.s & 1 << dfm2.c() + 8) != 0) {
            return;
        }
        if (bhl3 == null && (this.s & 1 << dfm2.c() + 16) != 0) {
            return;
        }
        if (bdl2.G.d && (bhl3 == null || bhl3.a() == azg.a(blg.a)) && bhl2 != null) {
            bhl bhl4 = bhl2.j();
            bhl4.b = 1;
            this.a(dfm2, bhl4);
            return;
        }
        if (bhl2 != null && bhl2.b > 1) {
            if (bhl3 != null) {
                return;
            }
            bhl bhl5 = bhl2.j();
            bhl5.b = 1;
            this.a(dfm2, bhl5);
            --bhl2.b;
            return;
        }
        this.a(dfm2, bhl2);
        bdl2.a(bqp2, bhl3);
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.aQ.C || this.bk) {
            return false;
        }
        if (ahy.l.equals(ahy2)) {
            this.ak_();
            return false;
        }
        if (this.c(ahy2) || this.r || this.Z()) {
            return false;
        }
        if (ahy2.e()) {
            this.at();
            this.ak_();
            return false;
        }
        if (ahy.a.equals(ahy2)) {
            if (this.y_()) {
                this.d(0.15f);
            } else {
                this.m(5);
            }
            return false;
        }
        if (ahy.c.equals(ahy2) && this.bh() > 0.5f) {
            this.d(4.0f);
            return false;
        }
        boolean bl2 = "arrow".equals(ahy2.p());
        boolean bl3 = "player".equals(ahy2.p());
        if (!bl3 && !bl2) {
            return false;
        }
        if (ahy2.a() instanceof cwt) {
            ahy2.a().ak_();
        }
        if (ahy2.b() instanceof bdl && !((bdl)ahy2.b()).G.e) {
            return false;
        }
        if (ahy2.u()) {
            this.aq();
            this.ak_();
            return false;
        }
        long l2 = this.aQ.z();
        if (l2 - this.h <= 5L || bl2) {
            this.ar();
            this.aq();
            this.ak_();
        } else {
            this.aQ.a((cpk)this, (byte)32);
            this.h = l2;
        }
        return false;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 32) {
            if (this.aQ.C) {
                this.aQ.a(this.aU, this.aV, this.aW, dah.l, this.y(), 0.3f, 1.0f, false);
                this.h = this.aQ.z();
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cD().a() * 4.0;
        if (Double.isNaN(d3) || d3 == 0.0) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    private void aq() {
        if (this.aQ instanceof alj) {
            ((alj)this.aQ).a(lz.M, this.aU, this.aV + (double)this.bm / 1.5, this.aW, 10, (double)(this.bl / 4.0f), (double)(this.bm / 4.0f), (double)(this.bl / 4.0f), 0.05, bfa.u(blg.f.s()));
        }
    }

    private void d(float f2) {
        float f3 = this.bh();
        if ((f3 -= f2) <= 0.5f) {
            this.at();
            this.ak_();
        } else {
            this.k(f3);
        }
    }

    private void ar() {
        bfa.a(this.aQ, new cmz(this), new bhl(hp.ct));
        this.at();
    }

    private void at() {
        int n2;
        this.aQ.a(null, this.aU, this.aV, this.aW, dah.j, this.y(), 1.0f, 1.0f);
        for (n2 = 0; n2 < this.p.length; ++n2) {
            if (this.p[n2] == null || this.p[n2].b <= 0) continue;
            if (this.p[n2] != null) {
                bfa.a(this.aQ, new cmz(this).g(), this.p[n2]);
            }
            this.p[n2] = null;
        }
        for (n2 = 0; n2 < this.q.length; ++n2) {
            if (this.q[n2] == null || this.q[n2].b <= 0) continue;
            if (this.q[n2] != null) {
                bfa.a(this.aQ, new cmz(this).g(), this.q[n2]);
            }
            this.q[n2] = null;
        }
    }

    @Override
    protected float d(float f2, float f3) {
        this.ai = this.bc;
        this.ah = this.ba;
        return 0.0f;
    }

    @Override
    public float A() {
        return this.R_() ? this.bm * 0.5f : this.bm * 0.9f;
    }

    @Override
    public double Z_() {
        return this.Z() ? 0.0 : (double)0.1f;
    }

    @Override
    public void b(float f2, float f3) {
        if (this.cf()) {
            return;
        }
        super.b(f2, f3);
    }

    @Override
    public void bb_() {
        cig cig2;
        cig cig3;
        cig cig4;
        cig cig5;
        cig cig6;
        super.bb_();
        cig cig7 = (cig)this.bE.a(b);
        if (!this.u.equals(cig7)) {
            this.a(cig7);
        }
        if (!this.v.equals(cig6 = (cig)this.bE.a(c))) {
            this.b(cig6);
        }
        if (!this.w.equals(cig5 = (cig)this.bE.a(d))) {
            this.c(cig5);
        }
        if (!this.x.equals(cig4 = (cig)this.bE.a(e))) {
            this.d(cig4);
        }
        if (!this.y.equals(cig3 = (cig)this.bE.a(f))) {
            this.e(cig3);
        }
        if (!this.z.equals(cig2 = (cig)this.bE.a(g))) {
            this.f(cig2);
        }
        boolean bl2 = this.Z();
        if (!this.t && bl2) {
            this.d(false);
            this.aN = false;
        } else if (this.t && !bl2) {
            this.d(true);
            this.aN = true;
        } else {
            return;
        }
        this.t = bl2;
    }

    private void d(boolean bl2) {
        double d2 = this.aU;
        double d3 = this.aV;
        double d4 = this.aW;
        if (bl2) {
            this.a_(0.5f, 1.975f);
        } else {
            this.a_(0.0f, 0.0f);
        }
        this.d(d2, d3, d4);
    }

    @Override
    protected void E_() {
        this.e_(this.r);
    }

    @Override
    public void e_(boolean bl2) {
        this.r = bl2;
        super.e_(bl2);
    }

    @Override
    public boolean R_() {
        return this.z();
    }

    @Override
    public void v_() {
        this.ak_();
    }

    @Override
    public boolean N_() {
        return this.ct();
    }

    private void e(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 1, bl2));
    }

    public boolean z() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    private void f(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 4, bl2));
    }

    public boolean C() {
        return ((Byte)this.bE.a(a) & 4) != 0;
    }

    private void g(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 8, bl2));
    }

    public boolean T() {
        return ((Byte)this.bE.a(a) & 8) != 0;
    }

    private void h(boolean bl2) {
        this.bE.b(a, this.a((Byte)this.bE.a(a), 16, bl2));
    }

    public boolean Z() {
        return ((Byte)this.bE.a(a) & 0x10) != 0;
    }

    private byte a(byte by2, int n2, boolean bl2) {
        by2 = bl2 ? (byte)(by2 | n2) : (byte)(by2 & ~n2);
        return by2;
    }

    public void a(cig cig2) {
        this.u = cig2;
        this.bE.b(b, cig2);
    }

    public void b(cig cig2) {
        this.v = cig2;
        this.bE.b(c, cig2);
    }

    public void c(cig cig2) {
        this.w = cig2;
        this.bE.b(d, cig2);
    }

    public void d(cig cig2) {
        this.x = cig2;
        this.bE.b(e, cig2);
    }

    public void e(cig cig2) {
        this.y = cig2;
        this.bE.b(f, cig2);
    }

    public void f(cig cig2) {
        this.z = cig2;
        this.bE.b(g, cig2);
    }

    public cig ad() {
        return this.u;
    }

    public cig ae() {
        return this.v;
    }

    public cig af() {
        return this.w;
    }

    public cig ah() {
        return this.x;
    }

    public cig al() {
        return this.y;
    }

    public cig am() {
        return this.z;
    }

    @Override
    public boolean bc_() {
        return super.bc_() && !this.Z();
    }

    @Override
    public s aK() {
        return s.b;
    }

    @Override
    protected bi c_(int n2) {
        return dah.k;
    }

    @Override
    protected bi r() {
        return dah.l;
    }

    @Override
    protected bi s() {
        return dah.j;
    }

    @Override
    public void a(tz tz2) {
    }

    @Override
    public boolean I_() {
        return false;
    }
}

