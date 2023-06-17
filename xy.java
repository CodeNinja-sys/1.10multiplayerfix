/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public abstract class xy
extends bga {
    private static final bcz a = bwm.a(xy.class, cbf.a);
    public int h;
    protected int i;
    private final on b;
    protected cel j;
    protected ald k;
    private final cje c;
    protected dct l;
    protected final ave m;
    protected final ave n;
    private bga d;
    private final cuy e;
    private final bhl[] f = new bhl[2];
    protected float[] o = new float[2];
    private final bhl[] g = new bhl[4];
    protected float[] p = new float[4];
    private boolean q;
    private boolean r;
    private final Map s = sz.a(cfh.class);
    private bpx t;
    private long u;
    private boolean v;
    private cpk w;
    private bvp x;

    public xy(iu iu2) {
        super(iu2);
        this.m = new ave(iu2 == null || iu2.A == null ? null : iu2.A);
        this.n = new ave(iu2 == null || iu2.A == null ? null : iu2.A);
        this.b = new on(this);
        this.j = new cel(this);
        this.k = new ald(this);
        this.c = this.al();
        this.l = this.a(iu2);
        this.e = new cuy(this);
        Arrays.fill(this.p, 0.085f);
        Arrays.fill(this.o, 0.085f);
        if (iu2 != null && !iu2.C) {
            this.n();
        }
    }

    protected void n() {
    }

    @Override
    protected void p() {
        super.p();
        this.bs().b(cgz.b).a(16.0);
    }

    protected dct a(iu iu2) {
        return new vp(this, iu2);
    }

    public float a(cfh cfh2) {
        Float f2 = (Float)this.s.get((Object)cfh2);
        return f2 == null ? cfh2.a() : f2.floatValue();
    }

    public void a(cfh cfh2, float f2) {
        this.s.put(cfh2, Float.valueOf(f2));
    }

    protected cje al() {
        return new cje(this);
    }

    public on am() {
        return this.b;
    }

    public cel an() {
        return this.j;
    }

    public ald ao() {
        return this.k;
    }

    public dct ap() {
        return this.l;
    }

    public cuy aq() {
        return this.e;
    }

    public bga ar() {
        return this.d;
    }

    public void b(bga bga2) {
        this.d = bga2;
    }

    public boolean a(Class class_) {
        return class_ != ha.class;
    }

    public void S_() {
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
    }

    public int j() {
        return 80;
    }

    public void as() {
        bi bi2 = this.q();
        if (bi2 != null) {
            this.a(bi2, this.t(), this.ac_());
        }
    }

    @Override
    public void w_() {
        super.w_();
        this.aQ.A.a("mobBaseTick");
        if (this.bj() && this.bx.nextInt(1000) < this.h++) {
            this.T();
            this.as();
        }
        this.aQ.A.b();
    }

    @Override
    protected void b(ahy ahy2) {
        this.T();
        super.b(ahy2);
    }

    private void T() {
        this.h = -this.j();
    }

    @Override
    protected int c_(bdl bdl2) {
        if (this.i > 0) {
            int n2;
            int n3 = this.i;
            for (n2 = 0; n2 < this.g.length; ++n2) {
                if (this.g[n2] == null || !(this.p[n2] <= 1.0f)) continue;
                n3 += 1 + this.bx.nextInt(3);
            }
            for (n2 = 0; n2 < this.f.length; ++n2) {
                if (this.f[n2] == null || !(this.o[n2] <= 1.0f)) continue;
                n3 += 1 + this.bx.nextInt(3);
            }
            return n3;
        }
        return this.i;
    }

    public void at() {
        if (this.aQ.C) {
            for (int i2 = 0; i2 < 20; ++i2) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                double d5 = 10.0;
                this.aQ.a(lz.a, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl - d2 * 10.0, this.aV + (double)(this.bx.nextFloat() * this.bm) - d3 * 10.0, this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl - d4 * 10.0, d2, d3, d4, new int[0]);
            }
        } else {
            this.aQ.a((cpk)this, (byte)20);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 20) {
            this.at();
        } else {
            super.a(by2);
        }
    }

    @Override
    public void bb_() {
        super.bb_();
        if (!this.aQ.C) {
            this.aF();
            if (this.by % 5 == 0) {
                boolean bl2 = !(this.aj() instanceof xy);
                boolean bl3 = !(this.cL() instanceof cor);
                this.m.a(1, bl2);
                this.m.a(4, bl2 && bl3);
                this.m.a(2, bl2);
            }
        }
    }

    @Override
    protected float d(float f2, float f3) {
        this.c.a();
        return f3;
    }

    protected bi q() {
        return null;
    }

    protected azg au() {
        return null;
    }

    @Override
    protected void a(boolean bl2, int n2) {
        azg azg2 = this.au();
        if (azg2 != null) {
            int n3 = this.bx.nextInt(3);
            if (n2 > 0) {
                n3 += this.bx.nextInt(n2 + 1);
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(azg2, 1);
            }
        }
    }

    public static void a(cgy cgy2, String string) {
        cgy2.a(bst.e, (cui)new ml(string, "ArmorItems", "HandItems"));
    }

    public static void b(cgy cgy2) {
        xy.a(cgy2, "Mob");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(bvp bvp2) {
        void var7_15;
        super.a(bvp2);
        bvp2.a("CanPickUpLoot", this.aD());
        bvp2.a("PersistenceRequired", this.r);
        bmh bmh2 = new bmh();
        for (bhl bhl2 : this.g) {
            bvp object = new bvp();
            if (bhl2 != null) {
                bhl2.b(object);
            }
            bmh2.a(object);
        }
        bvp2.a("ArmorItems", bmh2);
        bmh bmh3 = new bmh();
        for (bhl uUID : this.f) {
            bvp bvp3 = new bvp();
            if (uUID != null) {
                uUID.b(bvp3);
            }
            bmh3.a(bvp3);
        }
        bvp2.a("HandItems", bmh3);
        bmh bmh4 = new bmh();
        Object object = this.p;
        int n2 = ((float[])object).length;
        boolean cmz2 = false;
        while (++var7_15 < n2) {
            float f2 = object[var7_15];
            bmh4.a(new po(f2));
        }
        bvp2.a("ArmorDropChances", bmh4);
        object = new bmh();
        for (float f3 : this.o) {
            ((bmh)object).a(new po(f3));
        }
        bvp2.a("HandDropChances", (azt)object);
        bvp2.a("Leashed", this.v);
        if (this.w != null) {
            Object object2 = new bvp();
            if (this.w instanceof bga) {
                UUID uUID = this.w.cx();
                ((bvp)object2).a("UUID", uUID);
            } else if (this.w instanceof gj) {
                cmz cmz3 = ((gj)this.w).p();
                ((bvp)object2).a("X", cmz3.a());
                ((bvp)object2).a("Y", cmz3.b());
                ((bvp)object2).a("Z", cmz3.c());
            }
            bvp2.a("Leash", (azt)object2);
        }
        bvp2.a("LeftHanded", this.aJ());
        if (this.t != null) {
            bvp2.a("DeathLootTable", this.t.toString());
            if (this.u != 0L) {
                bvp2.a("DeathLootTableSeed", this.u);
            }
        }
        if (this.aI()) {
            bvp2.a("NoAI", this.aI());
        }
    }

    @Override
    public void b(bvp bvp2) {
        int n2;
        bmh bmh2;
        super.b(bvp2);
        if (bvp2.b("CanPickUpLoot", 1)) {
            this.l(bvp2.p("CanPickUpLoot"));
        }
        this.r = bvp2.p("PersistenceRequired");
        if (bvp2.b("ArmorItems", 9)) {
            bmh2 = bvp2.c("ArmorItems", 10);
            for (n2 = 0; n2 < this.g.length; ++n2) {
                this.g[n2] = bhl.a(bmh2.b(n2));
            }
        }
        if (bvp2.b("HandItems", 9)) {
            bmh2 = bvp2.c("HandItems", 10);
            for (n2 = 0; n2 < this.f.length; ++n2) {
                this.f[n2] = bhl.a(bmh2.b(n2));
            }
        }
        if (bvp2.b("ArmorDropChances", 9)) {
            bmh2 = bvp2.c("ArmorDropChances", 5);
            for (n2 = 0; n2 < bmh2.b(); ++n2) {
                this.p[n2] = bmh2.f(n2);
            }
        }
        if (bvp2.b("HandDropChances", 9)) {
            bmh2 = bvp2.c("HandDropChances", 5);
            for (n2 = 0; n2 < bmh2.b(); ++n2) {
                this.o[n2] = bmh2.f(n2);
            }
        }
        this.v = bvp2.p("Leashed");
        if (this.v && bvp2.b("Leash", 10)) {
            this.x = bvp2.o("Leash");
        }
        this.n(bvp2.p("LeftHanded"));
        if (bvp2.b("DeathLootTable", 8)) {
            this.t = new bpx(bvp2.l("DeathLootTable"));
            this.u = bvp2.i("DeathLootTableSeed");
        }
        this.m(bvp2.p("NoAI"));
    }

    protected bpx u() {
        return null;
    }

    @Override
    protected void a(boolean bl2, int n2, ahy ahy2) {
        bpx bpx2 = this.t;
        if (bpx2 == null) {
            bpx2 = this.u();
        }
        if (bpx2 != null) {
            cse cse2 = this.aQ.V().a(bpx2);
            this.t = null;
            bcn bcn2 = new bcn((alj)this.aQ).a(this).a(ahy2);
            if (bl2 && this.am != null) {
                bcn2 = bcn2.a(this.am).a(this.am.aT());
            }
            List list = cse2.a(this.u == 0L ? this.bx : new Random(this.u), bcn2.a());
            for (bhl bhl2 : list) {
                this.a(bhl2, 0.0f);
            }
            this.b(bl2, n2);
        } else {
            super.a(bl2, n2, ahy2);
        }
    }

    public void g(float f2) {
        this.az = f2;
    }

    public void h(float f2) {
        this.ay = f2;
    }

    @Override
    public void i(float f2) {
        super.i(f2);
        this.g(f2);
    }

    @Override
    public void Q_() {
        super.Q_();
        this.aQ.A.a("looting");
        if (!this.aQ.C && this.aD() && !this.ao && this.aQ.F().b("mobGriefing")) {
            List list = this.aQ.a(er.class, this.cD().b(1.0, 0.0, 1.0));
            for (er er2 : list) {
                if (er2.bk || er2.h() == null || er2.o()) continue;
                this.a(er2);
            }
        }
        this.aQ.A.b();
    }

    protected void a(er er2) {
        bhl bhl2 = er2.h();
        dfm dfm2 = xy.c(bhl2);
        boolean bl2 = true;
        bhl bhl3 = this.a(dfm2);
        if (bhl3 != null) {
            azg azg2;
            if (dfm2.a() == dfd.a) {
                if (bhl2.a() instanceof bof && !(bhl3.a() instanceof bof)) {
                    bl2 = true;
                } else if (bhl2.a() instanceof bof && bhl3.a() instanceof bof) {
                    azg2 = (bof)bhl2.a();
                    bof bof2 = (bof)bhl3.a();
                    bl2 = ((bof)azg2).f() == bof2.f() ? bhl2.h() > bhl3.h() || bhl2.n() && !bhl3.n() : ((bof)azg2).f() > bof2.f();
                } else {
                    bl2 = bhl2.a() instanceof azd && bhl3.a() instanceof azd ? bhl2.n() && !bhl3.n() : false;
                }
            } else if (bhl2.a() instanceof uh && !(bhl3.a() instanceof uh)) {
                bl2 = true;
            } else if (bhl2.a() instanceof uh && bhl3.a() instanceof uh) {
                azg2 = (uh)bhl2.a();
                uh uh2 = (uh)bhl3.a();
                bl2 = ((uh)azg2).d == uh2.d ? bhl2.h() > bhl3.h() || bhl2.n() && !bhl3.n() : ((uh)azg2).d > uh2.d;
            } else {
                bl2 = false;
            }
        }
        if (bl2 && this.a_(bhl2)) {
            bdl bdl2;
            double d2;
            switch (dfm2.a()) {
                case a: {
                    d2 = this.o[dfm2.b()];
                    break;
                }
                case b: {
                    d2 = this.p[dfm2.b()];
                    break;
                }
                default: {
                    d2 = 0.0;
                }
            }
            if (bhl3 != null && (double)(this.bx.nextFloat() - 0.1f) < d2) {
                this.a(bhl3, 0.0f);
            }
            if (bhl2.a() == hp.k && er2.j() != null && (bdl2 = this.aQ.a(er2.j())) != null) {
                bdl2.a((cyd)bpa.x);
            }
            this.a(dfm2, bhl2);
            switch (dfm2.a()) {
                case a: {
                    this.o[dfm2.b()] = 2.0f;
                    break;
                }
                case b: {
                    this.p[dfm2.b()] = 2.0f;
                }
            }
            this.r = true;
            this.b((cpk)er2, 1);
            er2.ak_();
        }
    }

    protected boolean a_(bhl bhl2) {
        return true;
    }

    protected boolean k() {
        return true;
    }

    protected void av() {
        if (this.r) {
            this.ap = 0;
            return;
        }
        bdl bdl2 = this.aQ.a((cpk)this, -1.0);
        if (bdl2 != null) {
            double d2 = bdl2.aU - this.aU;
            double d3 = bdl2.aV - this.aV;
            double d4 = bdl2.aW - this.aW;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if (this.k() && d5 > 16384.0) {
                this.ak_();
            }
            if (this.ap > 600 && this.bx.nextInt(800) == 0 && d5 > 1024.0 && this.k()) {
                this.ak_();
            } else if (d5 < 1024.0) {
                this.ap = 0;
            }
        }
    }

    @Override
    protected final void aa_() {
        ++this.ap;
        this.aQ.A.a("checkDespawn");
        this.av();
        this.aQ.A.b();
        this.aQ.A.a("sensing");
        this.e.a();
        this.aQ.A.b();
        this.aQ.A.a("targetSelector");
        this.n.a();
        this.aQ.A.b();
        this.aQ.A.a("goalSelector");
        this.m.a();
        this.aQ.A.b();
        this.aQ.A.a("navigation");
        this.l.h();
        this.aQ.A.b();
        this.aQ.A.a("mob tick");
        this.o();
        this.aQ.A.b();
        if (this.cp() && this.cL() instanceof xy) {
            xy xy2 = (xy)this.cL();
            xy2.ap().a(this.ap().l(), 1.5);
            xy2.an().a(this.an());
        }
        this.aQ.A.a("controls");
        this.aQ.A.a("move");
        this.j.a();
        this.aQ.A.c("look");
        this.b.a();
        this.aQ.A.c("jump");
        this.k.b();
        this.aQ.A.b();
        this.aQ.A.b();
    }

    protected void o() {
    }

    public int aw() {
        return 40;
    }

    public int ax() {
        return 10;
    }

    public void a(cpk cpk2, float f2, float f3) {
        double d2;
        double d3 = cpk2.aU - this.aU;
        double d4 = cpk2.aW - this.aW;
        if (cpk2 instanceof bga) {
            bga bga2 = (bga)cpk2;
            d2 = bga2.aV + (double)bga2.A() - (this.aV + (double)this.A());
        } else {
            d2 = (cpk2.cD().b + cpk2.cD().e) / 2.0 - (this.aV + (double)this.A());
        }
        double d5 = cmk.a(d3 * d3 + d4 * d4);
        float f4 = (float)(cmk.b(d4, d3) * 57.2957763671875) - 90.0f;
        float f5 = (float)(-(cmk.b(d2, d5) * 57.2957763671875));
        this.bb = this.a(this.bb, f5, f3);
        this.ba = this.a(this.ba, f4, f2);
    }

    private float a(float f2, float f3, float f4) {
        float f5 = cmk.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean h() {
        dbk dbk2 = this.aQ.n(new cmz(this).h());
        return dbk2.a(this);
    }

    public boolean i() {
        return !this.aQ.e(this.cD()) && this.aQ.a((cpk)this, this.cD()).isEmpty() && this.aQ.a(this.cD(), (cpk)this);
    }

    public float ay() {
        return 1.0f;
    }

    public int z() {
        return 4;
    }

    @Override
    public int az() {
        if (this.ar() == null) {
            return 3;
        }
        int n2 = (int)(this.bh() - this.bo() * 0.33f);
        if ((n2 -= (3 - this.aQ.Q().a()) * 4) < 0) {
            n2 = 0;
        }
        return n2 + 3;
    }

    @Override
    public Iterable aA() {
        return Arrays.asList(this.f);
    }

    @Override
    public Iterable aB() {
        return Arrays.asList(this.g);
    }

    @Override
    public bhl a(dfm dfm2) {
        bhl bhl2 = null;
        switch (dfm2.a()) {
            case a: {
                bhl2 = this.f[dfm2.b()];
                break;
            }
            case b: {
                bhl2 = this.g[dfm2.b()];
            }
        }
        return bhl2;
    }

    @Override
    public void a(dfm dfm2, bhl bhl2) {
        switch (dfm2.a()) {
            case a: {
                this.f[dfm2.b()] = bhl2;
                break;
            }
            case b: {
                this.g[dfm2.b()] = bhl2;
            }
        }
    }

    @Override
    protected void b(boolean bl2, int n2) {
        for (dfm dfm2 : dfm.values()) {
            boolean bl3;
            double d2;
            bhl bhl2 = this.a(dfm2);
            switch (dfm2.a()) {
                case a: {
                    d2 = this.o[dfm2.b()];
                    break;
                }
                case b: {
                    d2 = this.p[dfm2.b()];
                    break;
                }
                default: {
                    d2 = 0.0;
                }
            }
            boolean bl4 = bl3 = d2 > 1.0;
            if (bhl2 == null || !bl2 && !bl3 || !((double)(this.bx.nextFloat() - (float)n2 * 0.01f) < d2)) continue;
            if (!bl3 && bhl2.d()) {
                int n3 = Math.max(bhl2.i() - 25, 1);
                int n4 = bhl2.i() - this.bx.nextInt(this.bx.nextInt(n3) + 1);
                if (n4 > n3) {
                    n4 = n3;
                }
                if (n4 < 1) {
                    n4 = 1;
                }
                bhl2.b(n4);
            }
            this.a(bhl2, 0.0f);
        }
    }

    protected void a(bgp bgp2) {
        if (this.bx.nextFloat() < 0.15f * bgp2.c()) {
            float f2;
            int n2 = this.bx.nextInt(2);
            float f3 = f2 = this.aQ.Q() == ct.d ? 0.1f : 0.25f;
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
            for (dfm dfm2 : dfm.values()) {
                azg azg2;
                if (dfm2.a() != dfd.b) continue;
                bhl bhl2 = this.a(dfm2);
                if (!bl2 && this.bx.nextFloat() < f2) break;
                bl2 = false;
                if (bhl2 != null || (azg2 = xy.a(dfm2, n2)) == null) continue;
                this.a(dfm2, new bhl(azg2));
            }
        }
    }

    public static dfm c(bhl bhl2) {
        if (bhl2.a() == azg.a(blg.aU) || bhl2.a() == hp.ch) {
            return dfm.f;
        }
        if (bhl2.a() instanceof uh) {
            return ((uh)bhl2.a()).c;
        }
        if (bhl2.a() == hp.cR) {
            return dfm.e;
        }
        if (bhl2.a() == hp.cQ) {
            return dfm.b;
        }
        return dfm.a;
    }

    public static azg a(dfm dfm2, int n2) {
        switch (dfm2) {
            case f: {
                if (n2 == 0) {
                    return hp.S;
                }
                if (n2 == 1) {
                    return hp.ai;
                }
                if (n2 == 2) {
                    return hp.W;
                }
                if (n2 == 3) {
                    return hp.aa;
                }
                if (n2 == 4) {
                    return hp.ae;
                }
            }
            case e: {
                if (n2 == 0) {
                    return hp.T;
                }
                if (n2 == 1) {
                    return hp.aj;
                }
                if (n2 == 2) {
                    return hp.X;
                }
                if (n2 == 3) {
                    return hp.ab;
                }
                if (n2 == 4) {
                    return hp.af;
                }
            }
            case d: {
                if (n2 == 0) {
                    return hp.U;
                }
                if (n2 == 1) {
                    return hp.ak;
                }
                if (n2 == 2) {
                    return hp.Y;
                }
                if (n2 == 3) {
                    return hp.ac;
                }
                if (n2 == 4) {
                    return hp.ag;
                }
            }
            case c: {
                if (n2 == 0) {
                    return hp.V;
                }
                if (n2 == 1) {
                    return hp.al;
                }
                if (n2 == 2) {
                    return hp.Z;
                }
                if (n2 == 3) {
                    return hp.ad;
                }
                if (n2 != 4) break;
                return hp.ah;
            }
        }
        return null;
    }

    protected void b(bgp bgp2) {
        float f2 = bgp2.c();
        if (this.bt() != null && this.bx.nextFloat() < 0.25f * f2) {
            acz.a(this.bx, this.bt(), (int)(5.0f + f2 * (float)this.bx.nextInt(18)), false);
        }
        for (dfm dfm2 : dfm.values()) {
            bhl bhl2;
            if (dfm2.a() != dfd.b || (bhl2 = this.a(dfm2)) == null || !(this.bx.nextFloat() < 0.5f * f2)) continue;
            acz.a(this.bx, bhl2, (int)(5.0f + f2 * (float)this.bx.nextInt(18)), false);
        }
    }

    public aql a(bgp bgp2, aql aql2) {
        this.a(cgz.b).b(new cs("Random spawn bonus", this.bx.nextGaussian() * 0.05, 1));
        if (this.bx.nextFloat() < 0.05f) {
            this.n(true);
        } else {
            this.n(false);
        }
        return aql2;
    }

    public boolean ad() {
        return false;
    }

    public void aC() {
        this.r = true;
    }

    public void a(dfm dfm2, float f2) {
        switch (dfm2.a()) {
            case a: {
                this.o[dfm2.b()] = f2;
                break;
            }
            case b: {
                this.p[dfm2.b()] = f2;
            }
        }
    }

    public boolean aD() {
        return this.q;
    }

    public void l(boolean bl2) {
        this.q = bl2;
    }

    public boolean aE() {
        return this.r;
    }

    @Override
    public final boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (this.aG() && this.aH() == bdl2) {
            this.a(true, !bdl2.G.d);
            return true;
        }
        if (bhl2 != null && bhl2.a() == hp.cx && this.c(bdl2)) {
            this.b((cpk)bdl2, true);
            --bhl2.b;
            return true;
        }
        if (this.a(bdl2, bqp2, bhl2)) {
            return true;
        }
        return super.a(bdl2, bhl2, bqp2);
    }

    protected boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        return false;
    }

    protected void aF() {
        if (this.x != null) {
            this.aL();
        }
        if (!this.v) {
            return;
        }
        if (!this.bj()) {
            this.a(true, true);
        }
        if (this.w == null || this.w.bk) {
            this.a(true, true);
            return;
        }
    }

    public void a(boolean bl2, boolean bl3) {
        if (this.v) {
            this.v = false;
            this.w = null;
            if (!this.aQ.C && bl3) {
                this.a(hp.cx, 1);
            }
            if (!this.aQ.C && bl2 && this.aQ instanceof alj) {
                ((alj)this.aQ).af().a(this, new bsc(this, null));
            }
        }
    }

    public boolean c(bdl bdl2) {
        return !this.aG() && !(this instanceof cso);
    }

    public boolean aG() {
        return this.v;
    }

    public cpk aH() {
        return this.w;
    }

    public void b(cpk cpk2, boolean bl2) {
        this.v = true;
        this.w = cpk2;
        if (!this.aQ.C && bl2 && this.aQ instanceof alj) {
            ((alj)this.aQ).af().a(this, new bsc(this, this.w));
        }
        if (this.cp()) {
            this.s_();
        }
    }

    @Override
    public boolean a(cpk cpk2, boolean bl2) {
        boolean bl3 = super.a(cpk2, bl2);
        if (bl3 && this.aG()) {
            this.a(true, true);
        }
        return bl3;
    }

    private void aL() {
        if (this.v && this.x != null) {
            if (this.x.b("UUID")) {
                UUID uUID = this.x.a("UUID");
                List list = this.aQ.a(bga.class, this.cD().b(10.0));
                for (bga bga2 : list) {
                    if (!bga2.cx().equals(uUID)) continue;
                    this.w = bga2;
                    break;
                }
            } else if (this.x.b("X", 99) && this.x.b("Y", 99) && this.x.b("Z", 99)) {
                cmz cmz2 = new cmz(this.x.h("X"), this.x.h("Y"), this.x.h("Z"));
                ahe ahe2 = ahe.b(this.aQ, cmz2);
                if (ahe2 == null) {
                    ahe2 = ahe.a(this.aQ, cmz2);
                }
                this.w = ahe2;
            } else {
                this.a(false, true);
            }
        }
        this.x = null;
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

    public static boolean b(dfm dfm2, bhl bhl2) {
        dfm dfm3 = xy.c(bhl2);
        return dfm3 == dfm2 || dfm3 == dfm.a && dfm2 == dfm.b || dfm3 == dfm.b && dfm2 == dfm.a;
    }

    @Override
    public boolean T_() {
        return super.T_() && !this.aI();
    }

    public void m(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        this.bE.b(a, bl2 ? (byte)(by2 | 1) : (byte)(by2 & 0xFFFFFFFE));
    }

    public void n(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        this.bE.b(a, bl2 ? (byte)(by2 | 2) : (byte)(by2 & 0xFFFFFFFD));
    }

    public boolean aI() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public boolean aJ() {
        return ((Byte)this.bE.a(a) & 2) != 0;
    }

    @Override
    public s aK() {
        return this.aJ() ? s.a : s.b;
    }
}

