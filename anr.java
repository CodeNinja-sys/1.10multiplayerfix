/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class anr {
    private static final d a = org.apache.logging.log4j.c.c();
    protected static final dbk g = blg.b.s();
    protected static final dbk h = blg.a.s();
    protected static final dbk i = blg.h.s();
    protected static final dbk j = blg.n.s();
    protected static final dbk k = blg.cM.s();
    protected static final dbk l = blg.A.s();
    protected static final dbk m = blg.aI.s();
    protected static final dbk n = blg.j.s();
    public static final Set o = aad.a();
    public static final cpv p = new cpv();
    protected static final ctl q = new ctl(new Random(1234L), 1);
    protected static final ctl r = new ctl(new Random(2345L), 1);
    protected static final adt s = new adt();
    protected static final ctj t = new ctj(false);
    protected static final hl u = new hl(false);
    protected static final dcp v = new dcp();
    public static final apg w = new apg();
    private final String b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final int E;
    private final boolean F;
    private final boolean G;
    private final String H;
    public dbk x = blg.c.s();
    public dbk y = blg.d.s();
    public bku z;
    protected List A = ov.a();
    protected List B = ov.a();
    protected List C = ov.a();
    protected List D = ov.a();

    public static int a(anr anr2) {
        return w.a(anr2);
    }

    public static anr a(int n2) {
        return (anr)w.a(n2);
    }

    public static anr b(anr anr2) {
        return (anr)p.a(anr.a(anr2));
    }

    protected anr(ain ain2) {
        this.b = ain.a(ain2);
        this.c = ain.b(ain2);
        this.d = ain.c(ain2);
        this.e = ain.d(ain2);
        this.f = ain.e(ain2);
        this.E = ain.f(ain2);
        this.F = ain.g(ain2);
        this.G = ain.h(ain2);
        this.H = ain.i(ain2);
        this.z = this.a();
        this.B.add(new clh(ne.class, 12, 4, 4));
        this.B.add(new clh(cna.class, 10, 4, 4));
        this.B.add(new clh(jp.class, 10, 4, 4));
        this.B.add(new clh(cof.class, 8, 4, 4));
        this.A.add(new clh(yi.class, 100, 4, 4));
        this.A.add(new clh(oe.class, 100, 4, 4));
        this.A.add(new clh(azy.class, 100, 4, 4));
        this.A.add(new clh(ddh.class, 100, 4, 4));
        this.A.add(new clh(akr.class, 100, 4, 4));
        this.A.add(new clh(bgv.class, 10, 1, 4));
        this.A.add(new clh(byl.class, 5, 1, 1));
        this.C.add(new clh(aqc.class, 10, 4, 4));
        this.D.add(new clh(azc.class, 10, 8, 8));
    }

    protected bku a() {
        return new bku();
    }

    public boolean b() {
        return this.H != null;
    }

    public ko a(Random random) {
        if (random.nextInt(10) == 0) {
            return u;
        }
        return t;
    }

    public to b(Random random) {
        return new cfr(deq.b);
    }

    public amt a(Random random, cmz cmz2) {
        if (random.nextInt(3) > 0) {
            return amt.a;
        }
        return amt.b;
    }

    public int a(float f2) {
        f2 /= 3.0f;
        f2 = cmk.a(f2, -1.0f, 1.0f);
        return cmk.c(0.62222224f - f2 * 0.05f, 0.5f + f2 * 0.1f, 1.0f);
    }

    public List a(nx nx2) {
        switch (nx2) {
            case a: {
                return this.A;
            }
            case b: {
                return this.B;
            }
            case d: {
                return this.C;
            }
            case c: {
                return this.D;
            }
        }
        return Collections.emptyList();
    }

    public boolean c() {
        return this.p();
    }

    public boolean d() {
        if (this.p()) {
            return false;
        }
        return this.G;
    }

    public boolean e() {
        return this.k() > 0.85f;
    }

    public float f() {
        return 0.1f;
    }

    public final float c(cmz cmz2) {
        if (cmz2.b() > 64) {
            float f2 = (float)(q.a((float)cmz2.a() / 8.0f, (float)cmz2.c() / 8.0f) * 4.0);
            return this.n() - (f2 + (float)cmz2.b() - 64.0f) * 0.05f / 30.0f;
        }
        return this.n();
    }

    public void a(iu iu2, Random random, cmz cmz2) {
        this.z.a(iu2, random, this, cmz2);
    }

    public int a(cmz cmz2) {
        double d2 = cmk.a(this.c(cmz2), 0.0f, 1.0f);
        double d3 = cmk.a(this.k(), 0.0f, 1.0f);
        return asm.a(d2, d3);
    }

    public int b(cmz cmz2) {
        double d2 = cmk.a(this.c(cmz2), 0.0f, 1.0f);
        double d3 = cmk.a(this.k(), 0.0f, 1.0f);
        return do.a(d2, d3);
    }

    public void a(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        this.b(iu2, random, cnb2, n2, n3, d2);
    }

    public final void b(iu iu2, Random random, cnb cnb2, int n2, int n3, double d2) {
        int n4 = iu2.u();
        dbk dbk2 = this.x;
        dbk dbk3 = this.y;
        int n5 = -1;
        int n6 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n7 = n2 & 0xF;
        int n8 = n3 & 0xF;
        pj pj2 = new pj();
        for (int i2 = 255; i2 >= 0; --i2) {
            if (i2 <= random.nextInt(5)) {
                cnb2.a(n8, i2, n7, i);
                continue;
            }
            dbk dbk4 = cnb2.a(n8, i2, n7);
            if (dbk4.a() == ahk.a) {
                n5 = -1;
                continue;
            }
            if (dbk4.t() != blg.b) continue;
            if (n5 == -1) {
                if (n6 <= 0) {
                    dbk2 = h;
                    dbk3 = g;
                } else if (i2 >= n4 - 4 && i2 <= n4 + 1) {
                    dbk2 = this.x;
                    dbk3 = this.y;
                }
                if (i2 < n4 && (dbk2 == null || dbk2.a() == ahk.a)) {
                    dbk2 = this.c(pj2.a(n2, i2, n3)) < 0.15f ? m : n;
                }
                n5 = n6;
                if (i2 >= n4 - 1) {
                    cnb2.a(n8, i2, n7, dbk2);
                    continue;
                }
                if (i2 < n4 - 7 - n6) {
                    dbk2 = h;
                    dbk3 = g;
                    cnb2.a(n8, i2, n7, j);
                    continue;
                }
                cnb2.a(n8, i2, n7, dbk3);
                continue;
            }
            if (n5 <= 0) continue;
            cnb2.a(n8, i2, n7, dbk3);
            if (--n5 != 0 || dbk3.t() != blg.m || n6 <= 1) continue;
            n5 = random.nextInt(4) + Math.max(0, i2 - 63);
            dbk3 = dbk3.b(bhg.a) == aac.b ? k : l;
        }
    }

    public Class g() {
        return this.getClass();
    }

    public daz h() {
        if ((double)this.n() < 0.2) {
            return daz.b;
        }
        if ((double)this.n() < 1.0) {
            return daz.c;
        }
        return daz.d;
    }

    public static anr b(int n2) {
        return anr.a(n2, null);
    }

    public static anr a(int n2, anr anr2) {
        anr anr3 = anr.a(n2);
        if (anr3 == null) {
            return anr2;
        }
        return anr3;
    }

    public boolean i() {
        return false;
    }

    public final float j() {
        return this.c;
    }

    public final float k() {
        return this.f;
    }

    public final String l() {
        return this.b;
    }

    public final float m() {
        return this.d;
    }

    public final float n() {
        return this.e;
    }

    public final int o() {
        return this.E;
    }

    public final boolean p() {
        return this.F;
    }

    public static void q() {
        anr.a(0, "ocean", new cpz(new ain("Ocean").c(-1.0f).d(0.1f)));
        anr.a(1, "plains", new conn(false, new ain("Plains").c(0.125f).d(0.05f).a(0.8f).b(0.4f)));
        anr.a(2, "desert", new bwu(new ain("Desert").c(0.125f).d(0.05f).a(2.0f).b(0.0f).a()));
        anr.a(3, "extreme_hills", new clb(aqw.a, new ain("Extreme Hills").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        anr.a(4, "forest", new cgj(nk.a, new ain("Forest").a(0.7f).b(0.8f)));
        anr.a(5, "taiga", new bco(cwy.a, new ain("Taiga").c(0.2f).d(0.2f).a(0.25f).b(0.8f)));
        anr.a(6, "swampland", new wp(new ain("Swampland").c(-0.2f).d(0.1f).a(0.8f).b(0.9f).a(14745518)));
        anr.a(7, "river", new fq(new ain("River").c(-0.5f).d(0.0f)));
        anr.a(8, "hell", new cms(new ain("Hell").a(2.0f).b(0.0f).a()));
        anr.a(9, "sky", new cne(new ain("The End").a()));
        anr.a(10, "frozen_ocean", new cpz(new ain("FrozenOcean").c(-1.0f).d(0.1f).a(0.0f).b(0.5f).b()));
        anr.a(11, "frozen_river", new fq(new ain("FrozenRiver").c(-0.5f).d(0.0f).a(0.0f).b(0.5f).b()));
        anr.a(12, "ice_flats", new axa(false, new ain("Ice Plains").c(0.125f).d(0.05f).a(0.0f).b(0.5f).b()));
        anr.a(13, "ice_mountains", new axa(false, new ain("Ice Mountains").c(0.45f).d(0.3f).a(0.0f).b(0.5f).b()));
        anr.a(14, "mushroom_island", new bjw(new ain("MushroomIsland").c(0.2f).d(0.3f).a(0.9f).b(1.0f)));
        anr.a(15, "mushroom_island_shore", new bjw(new ain("MushroomIslandShore").c(0.0f).d(0.025f).a(0.9f).b(1.0f)));
        anr.a(16, "beaches", new agd(new ain("Beach").c(0.0f).d(0.025f).a(0.8f).b(0.4f)));
        anr.a(17, "desert_hills", new bwu(new ain("DesertHills").c(0.45f).d(0.3f).a(2.0f).b(0.0f).a()));
        anr.a(18, "forest_hills", new cgj(nk.a, new ain("ForestHills").c(0.45f).d(0.3f).a(0.7f).b(0.8f)));
        anr.a(19, "taiga_hills", new bco(cwy.a, new ain("TaigaHills").a(0.25f).b(0.8f).c(0.45f).d(0.3f)));
        anr.a(20, "smaller_extreme_hills", new clb(aqw.b, new ain("Extreme Hills Edge").c(0.8f).d(0.3f).a(0.2f).b(0.3f)));
        anr.a(21, "jungle", new bnq(false, new ain("Jungle").a(0.95f).b(0.9f)));
        anr.a(22, "jungle_hills", new bnq(false, new ain("JungleHills").c(0.45f).d(0.3f).a(0.95f).b(0.9f)));
        anr.a(23, "jungle_edge", new bnq(true, new ain("JungleEdge").a(0.95f).b(0.8f)));
        anr.a(24, "deep_ocean", new cpz(new ain("Deep Ocean").c(-1.8f).d(0.1f)));
        anr.a(25, "stone_beach", new cin(new ain("Stone Beach").c(0.1f).d(0.8f).a(0.2f).b(0.3f)));
        anr.a(26, "cold_beach", new agd(new ain("Cold Beach").c(0.0f).d(0.025f).a(0.05f).b(0.3f).b()));
        anr.a(27, "birch_forest", new cgj(nk.c, new ain("Birch Forest").a(0.6f).b(0.6f)));
        anr.a(28, "birch_forest_hills", new cgj(nk.c, new ain("Birch Forest Hills").c(0.45f).d(0.3f).a(0.6f).b(0.6f)));
        anr.a(29, "roofed_forest", new cgj(nk.d, new ain("Roofed Forest").a(0.7f).b(0.8f)));
        anr.a(30, "taiga_cold", new bco(cwy.a, new ain("Cold Taiga").c(0.2f).d(0.2f).a(-0.5f).b(0.4f).b()));
        anr.a(31, "taiga_cold_hills", new bco(cwy.a, new ain("Cold Taiga Hills").c(0.45f).d(0.3f).a(-0.5f).b(0.4f).b()));
        anr.a(32, "redwood_taiga", new bco(cwy.b, new ain("Mega Taiga").a(0.3f).b(0.8f).c(0.2f).d(0.2f)));
        anr.a(33, "redwood_taiga_hills", new bco(cwy.b, new ain("Mega Taiga Hills").c(0.45f).d(0.3f).a(0.3f).b(0.8f)));
        anr.a(34, "extreme_hills_with_trees", new clb(aqw.b, new ain("Extreme Hills+").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        anr.a(35, "savanna", new cxx(new ain("Savanna").c(0.125f).d(0.05f).a(1.2f).b(0.0f).a()));
        anr.a(36, "savanna_rock", new cxx(new ain("Savanna Plateau").c(1.5f).d(0.025f).a(1.0f).b(0.0f).a()));
        anr.a(37, "mesa", new aex(false, false, new ain("Mesa").a(2.0f).b(0.0f).a()));
        anr.a(38, "mesa_rock", new aex(false, true, new ain("Mesa Plateau F").c(1.5f).d(0.025f).a(2.0f).b(0.0f).a()));
        anr.a(39, "mesa_clear_rock", new aex(false, false, new ain("Mesa Plateau").c(1.5f).d(0.025f).a(2.0f).b(0.0f).a()));
        anr.a(127, "void", new brc(new ain("The Void").a()));
        anr.a(129, "mutated_plains", new conn(true, new ain("Sunflower Plains").a("plains").c(0.125f).d(0.05f).a(0.8f).b(0.4f)));
        anr.a(130, "mutated_desert", new bwu(new ain("Desert M").a("desert").c(0.225f).d(0.25f).a(2.0f).b(0.0f).a()));
        anr.a(131, "mutated_extreme_hills", new clb(aqw.c, new ain("Extreme Hills M").a("extreme_hills").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        anr.a(132, "mutated_forest", new cgj(nk.b, new ain("Flower Forest").a("forest").d(0.4f).a(0.7f).b(0.8f)));
        anr.a(133, "mutated_taiga", new bco(cwy.a, new ain("Taiga M").a("taiga").c(0.3f).d(0.4f).a(0.25f).b(0.8f)));
        anr.a(134, "mutated_swampland", new wp(new ain("Swampland M").a("swampland").c(-0.1f).d(0.3f).a(0.8f).b(0.9f).a(14745518)));
        anr.a(140, "mutated_ice_flats", new axa(true, new ain("Ice Plains Spikes").a("ice_flats").c(0.425f).d(0.45000002f).a(0.0f).b(0.5f).b()));
        anr.a(149, "mutated_jungle", new bnq(false, new ain("Jungle M").a("jungle").c(0.2f).d(0.4f).a(0.95f).b(0.9f)));
        anr.a(151, "mutated_jungle_edge", new bnq(true, new ain("JungleEdge M").a("jungle_edge").c(0.2f).d(0.4f).a(0.95f).b(0.8f)));
        anr.a(155, "mutated_birch_forest", new dcq(new ain("Birch Forest M").a("birch_forest").c(0.2f).d(0.4f).a(0.6f).b(0.6f)));
        anr.a(156, "mutated_birch_forest_hills", new dcq(new ain("Birch Forest Hills M").a("birch_forest").c(0.55f).d(0.5f).a(0.6f).b(0.6f)));
        anr.a(157, "mutated_roofed_forest", new cgj(nk.d, new ain("Roofed Forest M").a("roofed_forest").c(0.2f).d(0.4f).a(0.7f).b(0.8f)));
        anr.a(158, "mutated_taiga_cold", new bco(cwy.a, new ain("Cold Taiga M").a("taiga_cold").c(0.3f).d(0.4f).a(-0.5f).b(0.4f).b()));
        anr.a(160, "mutated_redwood_taiga", new bco(cwy.c, new ain("Mega Spruce Taiga").a("redwood_taiga").c(0.2f).d(0.2f).a(0.25f).b(0.8f)));
        anr.a(161, "mutated_redwood_taiga_hills", new bco(cwy.c, new ain("Redwood Taiga Hills M").a("redwood_taiga_hills").c(0.2f).d(0.2f).a(0.25f).b(0.8f)));
        anr.a(162, "mutated_extreme_hills_with_trees", new clb(aqw.c, new ain("Extreme Hills+ M").a("extreme_hills_with_trees").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        anr.a(163, "mutated_savanna", new dff(new ain("Savanna M").a("savanna").c(0.3625f).d(1.225f).a(1.1f).b(0.0f).a()));
        anr.a(164, "mutated_savanna_rock", new dff(new ain("Savanna Plateau M").a("savanna_rock").c(1.05f).d(1.2125001f).a(1.0f).b(0.0f).a()));
        anr.a(165, "mutated_mesa", new aex(true, false, new ain("Mesa (Bryce)").a("mesa").a(2.0f).b(0.0f).a()));
        anr.a(166, "mutated_mesa_rock", new aex(false, true, new ain("Mesa Plateau F M").a("mesa_rock").c(0.45f).d(0.3f).a(2.0f).b(0.0f).a()));
        anr.a(167, "mutated_mesa_clear_rock", new aex(false, false, new ain("Mesa Plateau M").a("mesa_clear_rock").c(0.45f).d(0.3f).a(2.0f).b(0.0f).a()));
        Collections.addAll(o, cff.a, cff.c, cff.d, cff.e, cff.f, cff.g, cff.h, cff.i, cff.m, cff.n, cff.o, cff.p, cff.q, cff.r, cff.s, cff.t, cff.u, cff.w, cff.x, cff.y, cff.z, cff.A, cff.B, cff.C, cff.D, cff.E, cff.F, cff.G, cff.H, cff.I, cff.J, cff.K, cff.L, cff.M, cff.N, cff.O);
    }

    private static void a(int n2, String string, anr anr2) {
        w.a(n2, new bpx(string), anr2);
        if (anr2.b()) {
            p.a(anr2, anr.a((anr)w.c(new bpx(anr2.H))));
        }
    }
}

