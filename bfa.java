/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class bfa {
    private static final bpx a = new bpx("air");
    public static final abl v = new abl(a);
    public static final cpv w = new cpv();
    public static final cxt x = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
    public static final cxt y = null;
    private zm b;
    protected boolean z;
    protected int A;
    protected boolean B;
    protected int C;
    protected boolean D;
    protected float E;
    protected float F;
    protected boolean G = true;
    protected boolean H;
    protected boolean I;
    protected acv J = acv.d;
    public float K = 1.0f;
    protected final ahk L;
    protected final bif M;
    public float N = 0.6f;
    protected final bkp O;
    private dbk c;
    private String d;

    public static int c(bfa bfa2) {
        return v.a(bfa2);
    }

    public static int u(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        return bfa.c(bfa2) + (bfa2.e(dbk2) << 12);
    }

    public static bfa f(int n2) {
        return (bfa)v.a(n2);
    }

    public static dbk g(int n2) {
        int n3 = n2 & 0xFFF;
        int n4 = n2 >> 12 & 0xF;
        return bfa.f(n3).a(n4);
    }

    public static bfa a(azg azg2) {
        if (azg2 instanceof ge) {
            return ((ge)azg2).c();
        }
        return null;
    }

    public static bfa a(String string) {
        bpx bpx2 = new bpx(string);
        if (v.d(bpx2)) {
            return (bfa)v.c(bpx2);
        }
        try {
            return (bfa)v.a(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public boolean f(dbk dbk2) {
        return dbk2.a().j() && dbk2.h();
    }

    public boolean v(dbk dbk2) {
        return this.z;
    }

    public boolean a(dbk dbk2, cpk cpk2) {
        return true;
    }

    public int w(dbk dbk2) {
        return this.A;
    }

    public boolean x(dbk dbk2) {
        return this.B;
    }

    public int y(dbk dbk2) {
        return this.C;
    }

    public boolean z(dbk dbk2) {
        return this.D;
    }

    public ahk A(dbk dbk2) {
        return this.L;
    }

    public bif a(dbk dbk2) {
        return this.M;
    }

    public dbk a(int n2) {
        return this.s();
    }

    public int e(dbk dbk2) {
        if (dbk2 == null || dbk2.r().isEmpty()) {
            return 0;
        }
        throw new IllegalArgumentException("Don't know how to convert " + dbk2 + " back into data...");
    }

    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2;
    }

    public dbk a(dbk dbk2, ih ih2) {
        return dbk2;
    }

    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2;
    }

    public bfa(ahk ahk2, bif bif2) {
        this.L = ahk2;
        this.M = bif2;
        this.O = this.a();
        this.D(this.O.b());
        this.z = this.s().p();
        this.A = this.z ? 255 : 0;
        this.B = !ahk2.b();
    }

    protected bfa(ahk ahk2) {
        this(ahk2, ahk2.p());
    }

    protected bfa a(acv acv2) {
        this.J = acv2;
        return this;
    }

    protected bfa h(int n2) {
        this.A = n2;
        return this;
    }

    protected bfa a(float f2) {
        this.C = (int)(15.0f * f2);
        return this;
    }

    protected bfa b(float f2) {
        this.F = f2 * 3.0f;
        return this;
    }

    public boolean B(dbk dbk2) {
        return dbk2.a().c() && dbk2.h();
    }

    public boolean C(dbk dbk2) {
        return dbk2.a().j() && dbk2.h() && !dbk2.m();
    }

    public boolean ay_() {
        return this.L.c() && this.s().h();
    }

    public boolean c(dbk dbk2) {
        return true;
    }

    public boolean a(bnj bnj2, cmz cmz2) {
        return !this.L.c();
    }

    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    public boolean a_(bnj bnj2, cmz cmz2) {
        return false;
    }

    protected bfa c(float f2) {
        this.E = f2;
        if (this.F < f2 * 5.0f) {
            this.F = f2 * 5.0f;
        }
        return this;
    }

    protected bfa j() {
        this.c(-1.0f);
        return this;
    }

    public float d(dbk dbk2, iu iu2, cmz cmz2) {
        return this.E;
    }

    protected bfa b(boolean bl2) {
        this.H = bl2;
        return this;
    }

    public boolean k() {
        return this.H;
    }

    public boolean l() {
        return this.I;
    }

    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return x;
    }

    public int c(dbk dbk2, bnj bnj2, cmz cmz2) {
        int n2 = bnj2.b(cmz2, dbk2.d());
        if (n2 == 0 && dbk2.t() instanceof bnr) {
            cmz2 = cmz2.h();
            dbk2 = bnj2.n(cmz2);
            return bnj2.b(cmz2, dbk2.d());
        }
        return n2;
    }

    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        cxt cxt2 = dbk2.c(bnj2, cmz2);
        switch (bqk2) {
            case a: {
                if (!(cxt2.b > 0.0)) break;
                return true;
            }
            case b: {
                if (!(cxt2.e < 1.0)) break;
                return true;
            }
            case c: {
                if (!(cxt2.c > 0.0)) break;
                return true;
            }
            case d: {
                if (!(cxt2.f < 1.0)) break;
                return true;
            }
            case e: {
                if (!(cxt2.a > 0.0)) break;
                return true;
            }
            case f: {
                if (!(cxt2.d < 1.0)) break;
                return true;
            }
        }
        return !bnj2.n(cmz2.c(bqk2)).p();
    }

    public boolean a(bnj bnj2, cmz cmz2, bqk bqk2) {
        return bnj2.n(cmz2).a().a();
    }

    public cxt c(dbk dbk2, iu iu2, cmz cmz2) {
        return dbk2.c((bnj)iu2, cmz2).a(cmz2);
    }

    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        bfa.a(cmz2, cxt2, list, dbk2.d(iu2, cmz2));
    }

    protected static void a(cmz cmz2, cxt cxt2, List list, cxt cxt3) {
        cxt cxt4;
        if (cxt3 != y && cxt2.b(cxt4 = cxt3.a(cmz2))) {
            list.add(cxt4);
        }
    }

    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return dbk2.c((bnj)iu2, cmz2);
    }

    public boolean b(dbk dbk2) {
        return true;
    }

    public boolean a(dbk dbk2, boolean bl2) {
        return this.Y_();
    }

    public boolean Y_() {
        return true;
    }

    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        this.a(iu2, cmz2, dbk2, random);
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
    }

    public void a_(iu iu2, cmz cmz2, dbk dbk2) {
    }

    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
    }

    public int a(iu iu2) {
        return 10;
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2) {
    }

    public void b(iu iu2, cmz cmz2, dbk dbk2) {
    }

    public int a(Random random) {
        return 1;
    }

    public azg a(dbk dbk2, Random random, int n2) {
        return azg.a(this);
    }

    public float a(dbk dbk2, bdl bdl2, iu iu2, cmz cmz2) {
        float f2 = dbk2.b(iu2, cmz2);
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (!bdl2.b(dbk2)) {
            return bdl2.a(dbk2) / f2 / 100.0f;
        }
        return bdl2.a(dbk2) / f2 / 30.0f;
    }

    public final void b(iu iu2, cmz cmz2, dbk dbk2, int n2) {
        this.a(iu2, cmz2, dbk2, 1.0f, n2);
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (iu2.C) {
            return;
        }
        int n3 = this.a(n2, iu2.p);
        for (int i2 = 0; i2 < n3; ++i2) {
            azg azg2;
            if (iu2.p.nextFloat() > f2 || (azg2 = this.a(dbk2, iu2.p, n2)) == null) continue;
            bfa.a(iu2, cmz2, new bhl(azg2, 1, this.d(dbk2)));
        }
    }

    public static void a(iu iu2, cmz cmz2, bhl bhl2) {
        if (iu2.C || !iu2.F().b("doTileDrops")) {
            return;
        }
        float f2 = 0.5f;
        double d2 = (double)(iu2.p.nextFloat() * 0.5f) + 0.25;
        double d3 = (double)(iu2.p.nextFloat() * 0.5f) + 0.25;
        double d4 = (double)(iu2.p.nextFloat() * 0.5f) + 0.25;
        er er2 = new er(iu2, (double)cmz2.a() + d2, (double)cmz2.b() + d3, (double)cmz2.c() + d4, bhl2);
        er2.l();
        iu2.b(er2);
    }

    protected void b(iu iu2, cmz cmz2, int n2) {
        if (!iu2.C && iu2.F().b("doTileDrops")) {
            while (n2 > 0) {
                int n3 = cvs.c(n2);
                n2 -= n3;
                iu2.b(new cvs(iu2, (double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, n3));
            }
        }
    }

    public int d(dbk dbk2) {
        return 0;
    }

    public float a(cpk cpk2) {
        return this.F / 5.0f;
    }

    public auu a(dbk dbk2, iu iu2, cmz cmz2, amj amj2, amj amj3) {
        return this.a(cmz2, amj2, amj3, dbk2.c((bnj)iu2, cmz2));
    }

    protected auu a(cmz cmz2, amj amj2, amj amj3, cxt cxt2) {
        amj amj4;
        amj amj5 = amj2.a(cmz2.a(), cmz2.b(), cmz2.c());
        auu auu2 = cxt2.b(amj5, amj4 = amj3.a(cmz2.a(), cmz2.b(), cmz2.c()));
        if (auu2 == null) {
            return null;
        }
        return new auu(auu2.c.b(cmz2.a(), cmz2.b(), cmz2.c()), auu2.b, cmz2);
    }

    public void a(iu iu2, cmz cmz2, yk yk2) {
    }

    public kj b() {
        return kj.a;
    }

    public boolean a(iu iu2, cmz cmz2, bqk bqk2, bhl bhl2) {
        return this.a_(iu2, cmz2, bqk2);
    }

    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        return this.a(iu2, cmz2);
    }

    public boolean a(iu iu2, cmz cmz2) {
        return iu2.n((cmz)cmz2).t().L.i();
    }

    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        return false;
    }

    public void a(iu iu2, cmz cmz2, cpk cpk2) {
    }

    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.a(n2);
    }

    public void a(iu iu2, cmz cmz2, bdl bdl2) {
    }

    public amj a(iu iu2, cmz cmz2, cpk cpk2, amj amj2) {
        return amj2;
    }

    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return 0;
    }

    public boolean i(dbk dbk2) {
        return false;
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
    }

    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return 0;
    }

    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        bdl2.a(bpv.a(this));
        bdl2.g(0.025f);
        if (this.c() && acz.a(bbh.r, bhl2) > 0) {
            bhl bhl3 = this.a_(dbk2);
            if (bhl3 != null) {
                bfa.a(iu2, cmz2, bhl3);
            }
        } else {
            int n2 = acz.a(bbh.t, bhl2);
            this.b(iu2, cmz2, dbk2, n2);
        }
    }

    protected boolean c() {
        return this.s().h() && !this.I;
    }

    protected bhl a_(dbk dbk2) {
        azg azg2 = azg.a(this);
        if (azg2 == null) {
            return null;
        }
        int n2 = 0;
        if (azg2.j()) {
            n2 = this.e(dbk2);
        }
        return new bhl(azg2, 1, n2);
    }

    public int a(int n2, Random random) {
        return this.a(random);
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
    }

    public boolean m() {
        return !this.L.a() && !this.L.d();
    }

    public bfa b(String string) {
        this.d = string;
        return this;
    }

    public String az_() {
        return caf.a(this.n() + ".name");
    }

    public String n() {
        return "tile." + this.d;
    }

    public boolean a(dbk dbk2, iu iu2, cmz cmz2, int n2, int n3) {
        return false;
    }

    public boolean o() {
        return this.G;
    }

    protected bfa p() {
        this.G = false;
        return this;
    }

    public bez j(dbk dbk2) {
        return this.L.l();
    }

    public float k(dbk dbk2) {
        return dbk2.k() ? 0.2f : 1.0f;
    }

    public void a(iu iu2, cmz cmz2, cpk cpk2, float f2) {
        cpk2.a(f2, 1.0f);
    }

    public void a(iu iu2, cpk cpk2) {
        cpk2.aY = 0.0;
    }

    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(azg.a(this), 1, this.d(dbk2));
    }

    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2));
    }

    public zm q() {
        return this.b;
    }

    public bfa a(zm zm2) {
        this.b = zm2;
        return this;
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
    }

    public void a_(iu iu2, cmz cmz2) {
    }

    public boolean i() {
        return true;
    }

    public boolean a(yk yk2) {
        return true;
    }

    public boolean a(bfa bfa2) {
        return this == bfa2;
    }

    public static boolean a(bfa bfa2, bfa bfa3) {
        if (bfa2 == null || bfa3 == null) {
            return false;
        }
        if (bfa2 == bfa3) {
            return true;
        }
        return bfa2.a(bfa3);
    }

    public boolean h(dbk dbk2) {
        return false;
    }

    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        return 0;
    }

    protected bkp a() {
        return new bkp(this, new bvs[0]);
    }

    public bkp r() {
        return this.O;
    }

    protected final void D(dbk dbk2) {
        this.c = dbk2;
    }

    public final dbk s() {
        return this.c;
    }

    public bjp aA_() {
        return bjp.a;
    }

    public acv t() {
        return this.J;
    }

    public String toString() {
        return "Block{" + v.b(this) + "}";
    }

    public static void u() {
        int n2;
        bfa.a(0, a, new xa().b("air"));
        bfa.a(1, "stone", new cec().c(1.5f).b(10.0f).a(acv.d).b("stone"));
        bfa.a(2, "grass", new bs().c(0.6f).a(acv.c).b("grass"));
        bfa.a(3, "dirt", new bwt().c(0.5f).a(acv.b).b("dirt"));
        bfa bfa2 = new bfa(ahk.e).c(2.0f).b(10.0f).a(acv.d).b("stonebrick").a(zm.b);
        bfa.a(4, "cobblestone", bfa2);
        bfa bfa3 = new adg().c(2.0f).b(5.0f).a(acv.a).b("wood");
        bfa.a(5, "planks", bfa3);
        bfa.a(6, "sapling", new bqh().c(0.0f).a(acv.c).b("sapling"));
        bfa.a(7, "bedrock", new brq(ahk.e).j().b(6000000.0f).a(acv.d).b("bedrock").p().a(zm.b));
        bfa.a(8, "flowing_water", new cyi(ahk.h).c(100.0f).h(3).b("water").p());
        bfa.a(9, "water", new arf(ahk.h).c(100.0f).h(3).b("water").p());
        bfa.a(10, "flowing_lava", new cyi(ahk.i).c(100.0f).a(1.0f).b("lava").p());
        bfa.a(11, "lava", new arf(ahk.i).c(100.0f).a(1.0f).b("lava").p());
        bfa.a(12, "sand", new bhg().c(0.5f).a(acv.h).b("sand"));
        bfa.a(13, "gravel", new avv().c(0.6f).a(acv.b).b("gravel"));
        bfa.a(14, "gold_ore", new bsm().c(3.0f).b(5.0f).a(acv.d).b("oreGold"));
        bfa.a(15, "iron_ore", new bsm().c(3.0f).b(5.0f).a(acv.d).b("oreIron"));
        bfa.a(16, "coal_ore", new bsm().c(3.0f).b(5.0f).a(acv.d).b("oreCoal"));
        bfa.a(17, "log", new ff().b("log"));
        bfa.a(18, "leaves", new dbo().b("leaves"));
        bfa.a(19, "sponge", new cxu().c(0.6f).a(acv.c).b("sponge"));
        bfa.a(20, "glass", new dh(ahk.s, false).c(0.3f).a(acv.f).b("glass"));
        bfa.a(21, "lapis_ore", new bsm().c(3.0f).b(5.0f).a(acv.d).b("oreLapis"));
        bfa.a(22, "lapis_block", new bfa(ahk.f, bif.H).c(3.0f).b(5.0f).a(acv.d).b("blockLapis").a(zm.b));
        bfa.a(23, "dispenser", new crh().c(3.5f).a(acv.d).b("dispenser"));
        bfa bfa4 = new bqv().a(acv.d).c(0.8f).b("sandStone");
        bfa.a(24, "sandstone", bfa4);
        bfa.a(25, "noteblock", new arl().a(acv.a).c(0.8f).b("musicBlock"));
        bfa.a(26, "bed", new dx().a(acv.a).c(0.2f).b("bed").p());
        bfa.a(27, "golden_rail", new gm().c(0.7f).a(acv.e).b("goldenRail"));
        bfa.a(28, "detector_rail", new bnb().c(0.7f).a(acv.e).b("detectorRail"));
        bfa.a(29, "sticky_piston", new ath(true).b("pistonStickyBase"));
        bfa.a(30, "web", new bks().h(1).c(4.0f).b("web"));
        bfa.a(31, "tallgrass", new add().c(0.0f).a(acv.c).b("tallgrass"));
        bfa.a(32, "deadbush", new asn().c(0.0f).a(acv.c).b("deadbush"));
        bfa.a(33, "piston", new ath(false).b("pistonBase"));
        bfa.a(34, "piston_head", new ln().b("pistonBase"));
        bfa.a(35, "wool", new bsd(ahk.n).c(0.8f).a(acv.g).b("cloth"));
        bfa.a(36, "piston_extension", (bfa)new pk());
        bfa.a(37, "yellow_flower", new amz().c(0.0f).a(acv.c).b("flower1"));
        bfa.a(38, "red_flower", new pw().c(0.0f).a(acv.c).b("flower2"));
        bfa bfa5 = new ast().c(0.0f).a(acv.c).a(0.125f).b("mushroom");
        bfa.a(39, "brown_mushroom", bfa5);
        bfa bfa6 = new ast().c(0.0f).a(acv.c).b("mushroom");
        bfa.a(40, "red_mushroom", bfa6);
        bfa.a(41, "gold_block", new bfa(ahk.f, bif.F).c(3.0f).b(10.0f).a(acv.e).b("blockGold").a(zm.b));
        bfa.a(42, "iron_block", new bfa(ahk.f, bif.h).c(5.0f).b(10.0f).a(acv.e).b("blockIron").a(zm.b));
        bfa.a(43, "double_stone_slab", new att().c(2.0f).b(10.0f).a(acv.d).b("stoneSlab"));
        bfa.a(44, "stone_slab", new aip().c(2.0f).b(10.0f).a(acv.d).b("stoneSlab"));
        bfa bfa7 = new bfa(ahk.e, bif.D).c(2.0f).b(10.0f).a(acv.d).b("brick").a(zm.b);
        bfa.a(45, "brick_block", bfa7);
        bfa.a(46, "tnt", new rp().c(0.0f).a(acv.c).b("tnt"));
        bfa.a(47, "bookshelf", new bl().c(1.5f).a(acv.a).b("bookshelf"));
        bfa.a(48, "mossy_cobblestone", new bfa(ahk.e).c(2.0f).b(10.0f).a(acv.d).b("stoneMoss").a(zm.b));
        bfa.a(49, "obsidian", new czz().c(50.0f).b(2000.0f).a(acv.d).b("obsidian"));
        bfa.a(50, "torch", new vl().c(0.0f).a(0.9375f).a(acv.a).b("torch"));
        bfa.a(51, "fire", new art().c(0.0f).a(1.0f).a(acv.g).b("fire").p());
        bfa.a(52, "mob_spawner", new ddo().c(5.0f).a(acv.e).b("mobSpawner").p());
        bfa.a(53, "oak_stairs", new qi(bfa3.s().a(adg.a, (Comparable)((Object)zg.a))).b("stairsWood"));
        bfa.a(54, "chest", new aqi(asr.a).c(2.5f).a(acv.a).b("chest"));
        bfa.a(55, "redstone_wire", new czs().c(0.0f).a(acv.d).b("redstoneDust").p());
        bfa.a(56, "diamond_ore", new bsm().c(3.0f).b(5.0f).a(acv.d).b("oreDiamond"));
        bfa.a(57, "diamond_block", new bfa(ahk.f, bif.G).c(5.0f).b(10.0f).a(acv.e).b("blockDiamond").a(zm.b));
        bfa.a(58, "crafting_table", new cxc().c(2.5f).a(acv.a).b("workbench"));
        bfa.a(59, "wheat", new kd().b("crops"));
        bfa bfa8 = new dgf().c(0.6f).a(acv.b).b("farmland");
        bfa.a(60, "farmland", bfa8);
        bfa.a(61, "furnace", new aer(false).c(3.5f).a(acv.d).b("furnace").a(zm.c));
        bfa.a(62, "lit_furnace", new aer(true).c(3.5f).a(acv.d).a(0.875f).b("furnace"));
        bfa.a(63, "standing_sign", new ayr().c(1.0f).a(acv.a).b("sign").p());
        bfa.a(64, "wooden_door", new xt(ahk.d).c(3.0f).a(acv.a).b("doorOak").p());
        bfa.a(65, "ladder", new def().c(0.4f).a(acv.j).b("ladder"));
        bfa.a(66, "rail", new bsr().c(0.7f).a(acv.e).b("rail"));
        bfa.a(67, "stone_stairs", new qi(bfa2.s()).b("stairsStone"));
        bfa.a(68, "wall_sign", new bqz().c(1.0f).a(acv.a).b("sign").p());
        bfa.a(69, "lever", new cex().c(0.5f).a(acv.a).b("lever"));
        bfa.a(70, "stone_pressure_plate", new avh(ahk.e, if.b).c(0.5f).a(acv.d).b("pressurePlateStone"));
        bfa.a(71, "iron_door", new xt(ahk.f).c(5.0f).a(acv.e).b("doorIron").p());
        bfa.a(72, "wooden_pressure_plate", new avh(ahk.d, if.a).c(0.5f).a(acv.a).b("pressurePlateWood"));
        bfa.a(73, "redstone_ore", new bqi(false).c(3.0f).b(5.0f).a(acv.d).b("oreRedstone").a(zm.b));
        bfa.a(74, "lit_redstone_ore", new bqi(true).a(0.625f).c(3.0f).b(5.0f).a(acv.d).b("oreRedstone"));
        bfa.a(75, "unlit_redstone_torch", new aqk(false).c(0.0f).a(acv.a).b("notGate"));
        bfa.a(76, "redstone_torch", new aqk(true).c(0.0f).a(0.5f).a(acv.a).b("notGate").a(zm.d));
        bfa.a(77, "stone_button", new acg().c(0.5f).a(acv.d).b("button"));
        bfa.a(78, "snow_layer", new btq().c(0.1f).a(acv.i).b("snow").h(0));
        bfa.a(79, "ice", new dcl().c(0.5f).h(3).a(acv.f).b("ice"));
        bfa.a(80, "snow", new ex().c(0.2f).a(acv.i).b("snow"));
        bfa.a(81, "cactus", new qt().c(0.4f).a(acv.g).b("cactus"));
        bfa.a(82, "clay", new ajs().c(0.6f).a(acv.b).b("clay"));
        bfa.a(83, "reeds", new bxe().c(0.0f).a(acv.c).b("reeds").p());
        bfa.a(84, "jukebox", new cdu().c(2.0f).b(10.0f).a(acv.d).b("jukebox"));
        bfa.a(85, "fence", new gd(ahk.d, zg.a.c()).c(2.0f).b(5.0f).a(acv.a).b("fence"));
        bfa bfa9 = new coj().c(1.0f).a(acv.a).b("pumpkin");
        bfa.a(86, "pumpkin", bfa9);
        bfa.a(87, "netherrack", new bfe().c(0.4f).a(acv.d).b("hellrock"));
        bfa.a(88, "soul_sand", new aki().c(0.5f).a(acv.h).b("hellsand"));
        bfa.a(89, "glowstone", new yb(ahk.s).c(0.3f).a(acv.f).a(1.0f).b("lightgem"));
        bfa.a(90, "portal", new axz().c(-1.0f).a(acv.f).a(0.75f).b("portal"));
        bfa.a(91, "lit_pumpkin", new coj().c(1.0f).a(acv.a).a(1.0f).b("litpumpkin"));
        bfa.a(92, "cake", new bsi().c(0.5f).a(acv.g).b("cake").p());
        bfa.a(93, "unpowered_repeater", new xc(false).c(0.0f).a(acv.a).b("diode").p());
        bfa.a(94, "powered_repeater", new xc(true).c(0.0f).a(acv.a).b("diode").p());
        bfa.a(95, "stained_glass", new ajr(ahk.s).c(0.3f).a(acv.f).b("stainedGlass"));
        bfa.a(96, "trapdoor", new csa(ahk.d).c(3.0f).a(acv.a).b("trapdoor").p());
        bfa.a(97, "monster_egg", new aob().c(0.75f).b("monsterStoneEgg"));
        bfa bfa10 = new bbt().c(1.5f).b(10.0f).a(acv.d).b("stonebricksmooth");
        bfa.a(98, "stonebrick", bfa10);
        bfa.a(99, "brown_mushroom_block", new biv(ahk.d, bif.l, bfa5).c(0.2f).a(acv.a).b("mushroom"));
        bfa.a(100, "red_mushroom_block", new biv(ahk.d, bif.D, bfa6).c(0.2f).a(acv.a).b("mushroom"));
        bfa.a(101, "iron_bars", new agz(ahk.f, true).c(5.0f).b(10.0f).a(acv.e).b("fenceIron"));
        bfa.a(102, "glass_pane", new agz(ahk.s, false).c(0.3f).a(acv.f).b("thinGlass"));
        bfa bfa11 = new qd().c(1.0f).a(acv.a).b("melon");
        bfa.a(103, "melon_block", bfa11);
        bfa.a(104, "pumpkin_stem", new cux(bfa9).c(0.0f).a(acv.a).b("pumpkinStem"));
        bfa.a(105, "melon_stem", new cux(bfa11).c(0.0f).a(acv.a).b("pumpkinStem"));
        bfa.a(106, "vine", new ju().c(0.2f).a(acv.c).b("vine"));
        bfa.a(107, "fence_gate", new bty(zg.a).c(2.0f).b(5.0f).a(acv.a).b("fenceGate"));
        bfa.a(108, "brick_stairs", new qi(bfa7.s()).b("stairsBrick"));
        bfa.a(109, "stone_brick_stairs", new qi(bfa10.s().a(bbt.a, (Comparable)((Object)crt.a))).b("stairsStoneBrickSmooth"));
        bfa.a(110, "mycelium", new sg().c(0.6f).a(acv.c).b("mycel"));
        bfa.a(111, "waterlily", new cmv().c(0.0f).a(acv.c).b("waterlily"));
        bfa bfa12 = new bhp().c(2.0f).b(10.0f).a(acv.d).b("netherBrick").a(zm.b);
        bfa.a(112, "nether_brick", bfa12);
        bfa.a(113, "nether_brick_fence", new gd(ahk.e, bif.K).c(2.0f).b(10.0f).a(acv.d).b("netherFence"));
        bfa.a(114, "nether_brick_stairs", new qi(bfa12.s()).b("stairsNetherBrick"));
        bfa.a(115, "nether_wart", new aqb().b("netherStalk"));
        bfa.a(116, "enchanting_table", new acb().c(5.0f).b(2000.0f).b("enchantmentTable"));
        bfa.a(117, "brewing_stand", new cfw().c(0.5f).a(0.125f).b("brewingStand"));
        bfa.a(118, "cauldron", new auf().c(2.0f).b("cauldron"));
        bfa.a(119, "end_portal", new bbr(ahk.E).c(-1.0f).b(6000000.0f));
        bfa.a(120, "end_portal_frame", new crk().a(acv.f).a(0.125f).c(-1.0f).b("endPortalFrame").b(6000000.0f).a(zm.c));
        bfa.a(121, "end_stone", new bfa(ahk.e, bif.d).c(3.0f).b(15.0f).a(acv.d).b("whiteStone").a(zm.b));
        bfa.a(122, "dragon_egg", new md().c(3.0f).b(15.0f).a(acv.d).a(0.125f).b("dragonEgg"));
        bfa.a(123, "redstone_lamp", new czv(false).c(0.3f).a(acv.f).b("redstoneLight").a(zm.d));
        bfa.a(124, "lit_redstone_lamp", new czv(true).c(0.3f).a(acv.f).b("redstoneLight"));
        bfa.a(125, "double_wooden_slab", new dcj().c(2.0f).b(5.0f).a(acv.a).b("woodSlab"));
        bfa.a(126, "wooden_slab", new bww().c(2.0f).b(5.0f).a(acv.a).b("woodSlab"));
        bfa.a(127, "cocoa", new cez().c(0.2f).b(5.0f).a(acv.a).b("cocoa"));
        bfa.a(128, "sandstone_stairs", new qi(bfa4.s().a(bqv.a, (Comparable)((Object)byr.c))).b("stairsSandStone"));
        bfa.a(129, "emerald_ore", new bsm().c(3.0f).b(5.0f).a(acv.d).b("oreEmerald"));
        bfa.a(130, "ender_chest", new avw().c(22.5f).b(1000.0f).a(acv.d).b("enderChest").a(0.5f));
        bfa.a(131, "tripwire_hook", new cr().b("tripWireSource"));
        bfa.a(132, "tripwire", new uk().b("tripWire"));
        bfa.a(133, "emerald_block", new bfa(ahk.f, bif.I).c(5.0f).b(10.0f).a(acv.e).b("blockEmerald").a(zm.b));
        bfa.a(134, "spruce_stairs", new qi(bfa3.s().a(adg.a, (Comparable)((Object)zg.b))).b("stairsWoodSpruce"));
        bfa.a(135, "birch_stairs", new qi(bfa3.s().a(adg.a, (Comparable)((Object)zg.c))).b("stairsWoodBirch"));
        bfa.a(136, "jungle_stairs", new qi(bfa3.s().a(adg.a, (Comparable)((Object)zg.d))).b("stairsWoodJungle"));
        bfa.a(137, "command_block", new btt(bif.B).j().b(6000000.0f).b("commandBlock"));
        bfa.a(138, "beacon", new aga().b("beacon").a(1.0f));
        bfa.a(139, "cobblestone_wall", new zd(bfa2).b("cobbleWall"));
        bfa.a(140, "flower_pot", new acw().c(0.0f).a(acv.d).b("flowerPot"));
        bfa.a(141, "carrots", new blm().b("carrots"));
        bfa.a(142, "potatoes", new axl().b("potatoes"));
        bfa.a(143, "wooden_button", new afa().c(0.5f).a(acv.a).b("button"));
        bfa.a(144, "skull", new cvc().c(1.0f).a(acv.d).b("skull"));
        bfa.a(145, "anvil", new ba().c(5.0f).a(acv.k).b(2000.0f).b("anvil"));
        bfa.a(146, "trapped_chest", new aqi(asr.b).c(2.5f).a(acv.a).b("chestTrap"));
        bfa.a(147, "light_weighted_pressure_plate", new csm(ahk.f, 15, bif.F).c(0.5f).a(acv.a).b("weightedPlate_light"));
        bfa.a(148, "heavy_weighted_pressure_plate", new csm(ahk.f, 150).c(0.5f).a(acv.a).b("weightedPlate_heavy"));
        bfa.a(149, "unpowered_comparator", new bra(false).c(0.0f).a(acv.a).b("comparator").p());
        bfa.a(150, "powered_comparator", new bra(true).c(0.0f).a(0.625f).a(acv.a).b("comparator").p());
        bfa.a(151, "daylight_detector", (bfa)new lu(false));
        bfa.a(152, "redstone_block", new biy(ahk.f, bif.f).c(5.0f).b(10.0f).a(acv.e).b("blockRedstone").a(zm.d));
        bfa.a(153, "quartz_ore", new bsm(bif.K).c(3.0f).b(5.0f).a(acv.d).b("netherquartz"));
        bfa.a(154, "hopper", new ao().c(3.0f).b(8.0f).a(acv.e).b("hopper"));
        bfa bfa13 = new ddd().a(acv.d).c(0.8f).b("quartzBlock");
        bfa.a(155, "quartz_block", bfa13);
        bfa.a(156, "quartz_stairs", new qi(bfa13.s().a(ddd.a, (Comparable)((Object)bjn.a))).b("stairsQuartz"));
        bfa.a(157, "activator_rail", new gm().c(0.7f).a(acv.e).b("activatorRail"));
        bfa.a(158, "dropper", new ahp().c(3.5f).a(acv.d).b("dropper"));
        bfa.a(159, "stained_hardened_clay", new bsd(ahk.e).c(1.25f).b(7.0f).a(acv.d).b("clayHardenedStained"));
        bfa.a(160, "stained_glass_pane", new cqe().c(0.3f).a(acv.f).b("thinStainedGlass"));
        bfa.a(161, "leaves2", new bfy().b("leaves"));
        bfa.a(162, "log2", new bjc().b("log"));
        bfa.a(163, "acacia_stairs", new qi(bfa3.s().a(adg.a, (Comparable)((Object)zg.e))).b("stairsWoodAcacia"));
        bfa.a(164, "dark_oak_stairs", new qi(bfa3.s().a(adg.a, (Comparable)((Object)zg.f))).b("stairsWoodDarkOak"));
        bfa.a(165, "slime", new vw().b("slime").a(acv.l));
        bfa.a(166, "barrier", new id().b("barrier"));
        bfa.a(167, "iron_trapdoor", new csa(ahk.f).c(5.0f).a(acv.e).b("ironTrapdoor").p());
        bfa.a(168, "prismarine", new crw().c(1.5f).b(10.0f).a(acv.d).b("prismarine"));
        bfa.a(169, "sea_lantern", new cul(ahk.s).c(0.3f).a(acv.f).a(1.0f).b("seaLantern"));
        bfa.a(170, "hay_block", new ub().c(0.5f).a(acv.c).b("hayBlock").a(zm.b));
        bfa.a(171, "carpet", new z().c(0.1f).a(acv.g).b("woolCarpet").h(0));
        bfa.a(172, "hardened_clay", new ber().c(1.25f).b(7.0f).a(acv.d).b("clayHardened"));
        bfa.a(173, "coal_block", new bfa(ahk.e, bif.E).c(5.0f).b(10.0f).a(acv.d).b("blockCoal").a(zm.b));
        bfa.a(174, "packed_ice", new afh().c(0.5f).a(acv.f).b("icePacked"));
        bfa.a(175, "double_plant", (bfa)new aqr());
        bfa.a(176, "standing_banner", new bnt().c(1.0f).a(acv.a).b("banner").p());
        bfa.a(177, "wall_banner", new jx().c(1.0f).a(acv.a).b("banner").p());
        bfa.a(178, "daylight_detector_inverted", (bfa)new lu(true));
        bfa bfa14 = new aaa().a(acv.d).c(0.8f).b("redSandStone");
        bfa.a(179, "red_sandstone", bfa14);
        bfa.a(180, "red_sandstone_stairs", new qi(bfa14.s().a(aaa.a, (Comparable)((Object)byj.c))).b("stairsRedSandStone"));
        bfa.a(181, "double_stone_slab2", new iy().c(2.0f).b(10.0f).a(acv.d).b("stoneSlab2"));
        bfa.a(182, "stone_slab2", new lb().c(2.0f).b(10.0f).a(acv.d).b("stoneSlab2"));
        bfa.a(183, "spruce_fence_gate", new bty(zg.b).c(2.0f).b(5.0f).a(acv.a).b("spruceFenceGate"));
        bfa.a(184, "birch_fence_gate", new bty(zg.c).c(2.0f).b(5.0f).a(acv.a).b("birchFenceGate"));
        bfa.a(185, "jungle_fence_gate", new bty(zg.d).c(2.0f).b(5.0f).a(acv.a).b("jungleFenceGate"));
        bfa.a(186, "dark_oak_fence_gate", new bty(zg.f).c(2.0f).b(5.0f).a(acv.a).b("darkOakFenceGate"));
        bfa.a(187, "acacia_fence_gate", new bty(zg.e).c(2.0f).b(5.0f).a(acv.a).b("acaciaFenceGate"));
        bfa.a(188, "spruce_fence", new gd(ahk.d, zg.b.c()).c(2.0f).b(5.0f).a(acv.a).b("spruceFence"));
        bfa.a(189, "birch_fence", new gd(ahk.d, zg.c.c()).c(2.0f).b(5.0f).a(acv.a).b("birchFence"));
        bfa.a(190, "jungle_fence", new gd(ahk.d, zg.d.c()).c(2.0f).b(5.0f).a(acv.a).b("jungleFence"));
        bfa.a(191, "dark_oak_fence", new gd(ahk.d, zg.f.c()).c(2.0f).b(5.0f).a(acv.a).b("darkOakFence"));
        bfa.a(192, "acacia_fence", new gd(ahk.d, zg.e.c()).c(2.0f).b(5.0f).a(acv.a).b("acaciaFence"));
        bfa.a(193, "spruce_door", new xt(ahk.d).c(3.0f).a(acv.a).b("doorSpruce").p());
        bfa.a(194, "birch_door", new xt(ahk.d).c(3.0f).a(acv.a).b("doorBirch").p());
        bfa.a(195, "jungle_door", new xt(ahk.d).c(3.0f).a(acv.a).b("doorJungle").p());
        bfa.a(196, "acacia_door", new xt(ahk.d).c(3.0f).a(acv.a).b("doorAcacia").p());
        bfa.a(197, "dark_oak_door", new xt(ahk.d).c(3.0f).a(acv.a).b("doorDarkOak").p());
        bfa.a(198, "end_rod", new afp().c(0.0f).a(0.9375f).a(acv.a).b("endRod"));
        bfa.a(199, "chorus_plant", new bkg().c(0.4f).a(acv.a).b("chorusPlant"));
        bfa.a(200, "chorus_flower", new ft().c(0.4f).a(acv.a).b("chorusFlower"));
        bfa bfa15 = new bfa(ahk.e).c(1.5f).b(10.0f).a(acv.d).a(zm.b).b("purpurBlock");
        bfa.a(201, "purpur_block", bfa15);
        bfa.a(202, "purpur_pillar", new cea(ahk.e).c(1.5f).b(10.0f).a(acv.d).a(zm.b).b("purpurPillar"));
        bfa.a(203, "purpur_stairs", new qi(bfa15.s()).b("stairsPurpur"));
        bfa.a(204, "purpur_double_slab", new sf().c(2.0f).b(10.0f).a(acv.d).b("purpurSlab"));
        bfa.a(205, "purpur_slab", new apj().c(2.0f).b(10.0f).a(acv.d).b("purpurSlab"));
        bfa.a(206, "end_bricks", new bfa(ahk.e).a(acv.d).c(0.8f).a(zm.b).b("endBricks"));
        bfa.a(207, "beetroots", new chk().b("beetroots"));
        bfa bfa16 = new bj().c(0.65f).a(acv.c).b("grassPath").p();
        bfa.a(208, "grass_path", bfa16);
        bfa.a(209, "end_gateway", new ig(ahk.E).c(-1.0f).b(6000000.0f));
        bfa.a(210, "repeating_command_block", new btt(bif.z).j().b(6000000.0f).b("repeatingCommandBlock"));
        bfa.a(211, "chain_command_block", new btt(bif.C).j().b(6000000.0f).b("chainCommandBlock"));
        bfa.a(212, "frosted_ice", new ddp().c(0.5f).h(3).a(acv.f).b("frostedIce"));
        bfa.a(213, "magma", new tf().c(0.5f).a(acv.d).b("magma"));
        bfa.a(214, "nether_wart_block", new bfa(ahk.b, bif.D).a(zm.b).c(1.0f).a(acv.a).b("netherWartBlock"));
        bfa.a(215, "red_nether_brick", new bhp().c(2.0f).b(10.0f).a(acv.d).b("redNetherBrick").a(zm.b));
        bfa.a(216, "bone_block", new ax().b("boneBlock"));
        bfa.a(217, "structure_void", new dz().b("structureVoid"));
        bfa.a(255, "structure_block", new cip().j().b(6000000.0f).b("structureBlock"));
        v.a();
        for (Object object : v) {
            boolean bl2;
            if (((bfa)object).L == ahk.a) {
                ((bfa)object).D = false;
                continue;
            }
            boolean bl3 = false;
            boolean bl4 = object instanceof qi;
            boolean bl5 = object instanceof bnr;
            n2 = object == bfa8 || object == bfa16 ? 1 : 0;
            boolean bl6 = ((bfa)object).B;
            boolean bl7 = bl2 = ((bfa)object).A == 0;
            if (bl4 || bl5 || n2 != 0 || bl6 || bl2) {
                bl3 = true;
            }
            ((bfa)object).D = bl3;
        }
        HashSet hashSet = aad.a((bfa)v.c(new bpx("tripwire")));
        for (bfa bfa17 : v) {
            if (hashSet.contains(bfa17)) {
                for (int i2 = 0; i2 < 15; ++i2) {
                    int n3 = v.a(bfa17) << 4 | i2;
                    w.a(bfa17.a(i2), n3);
                }
                continue;
            }
            for (dbk dbk2 : bfa17.r().a()) {
                n2 = v.a(bfa17) << 4 | bfa17.e(dbk2);
                w.a(dbk2, n2);
            }
        }
    }

    private static void a(int n2, bpx bpx2, bfa bfa2) {
        v.a(n2, bpx2, bfa2);
    }

    private static void a(int n2, String string, bfa bfa2) {
        bfa.a(n2, new bpx(string), bfa2);
    }
}

