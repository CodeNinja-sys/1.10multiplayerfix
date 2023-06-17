/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.io;
import com.a.a.d.sz;
import com.a.a.d.vi;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class azg {
    public static final apg g = new apg();
    private static final Map a = sz.c();
    private static final cak b = new bes();
    private static final cak c = new bcj();
    private static final cak d = new bzy();
    private static final cak e = new axc();
    private final avt f = new dai();
    protected static final UUID h = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    protected static final UUID i = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
    private zm n;
    protected static Random j = new Random();
    protected int k = 64;
    private int o;
    protected boolean l;
    protected boolean m;
    private azg p;
    private String q;

    public static int a(azg azg2) {
        return azg2 == null ? 0 : g.a(azg2);
    }

    public static azg c(int n2) {
        return (azg)g.a(n2);
    }

    public static azg a(bfa bfa2) {
        return (azg)a.get(bfa2);
    }

    public static azg c(String string) {
        azg azg2 = (azg)g.c(new bpx(string));
        if (azg2 == null) {
            try {
                return azg.c(Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return azg2;
    }

    public final void a(bpx bpx2, cak cak2) {
        this.f.a(bpx2, cak2);
    }

    public cak a(bpx bpx2) {
        return (cak)this.f.c(bpx2);
    }

    public boolean h() {
        return !this.f.c().isEmpty();
    }

    public boolean a(bvp bvp2) {
        return false;
    }

    public azg() {
        this.a(new bpx("lefthanded"), d);
        this.a(new bpx("cooldown"), e);
    }

    public azg d(int n2) {
        this.k = n2;
        return this;
    }

    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        return cey.b;
    }

    public float a(bhl bhl2, dbk dbk2) {
        return 1.0f;
    }

    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        return new wx(cey.b, bhl2);
    }

    public bhl a(bhl bhl2, iu iu2, bga bga2) {
        return bhl2;
    }

    public int i() {
        return this.k;
    }

    public int a(int n2) {
        return 0;
    }

    public boolean j() {
        return this.m;
    }

    protected azg a(boolean bl2) {
        this.m = bl2;
        return this;
    }

    public int k() {
        return this.o;
    }

    protected azg e(int n2) {
        this.o = n2;
        if (n2 > 0) {
            this.a(new bpx("damaged"), b);
            this.a(new bpx("damage"), c);
        }
        return this;
    }

    public boolean l() {
        return this.o > 0 && (!this.m || this.k == 1);
    }

    public boolean a(bhl bhl2, bga bga2, bga bga3) {
        return false;
    }

    public boolean a(bhl bhl2, iu iu2, dbk dbk2, cmz cmz2, bga bga2) {
        return false;
    }

    public boolean a(dbk dbk2) {
        return false;
    }

    public boolean a(bhl bhl2, bdl bdl2, bga bga2, bqp bqp2) {
        return false;
    }

    public azg m() {
        this.l = true;
        return this;
    }

    public boolean aD_() {
        return this.l;
    }

    public boolean n() {
        return false;
    }

    public azg b(String string) {
        this.q = string;
        return this;
    }

    public String i(bhl bhl2) {
        String string = this.b(bhl2);
        if (string == null) {
            return "";
        }
        return caf.a(string);
    }

    public String a() {
        return "item." + this.q;
    }

    public String b(bhl bhl2) {
        return "item." + this.q;
    }

    public azg b(azg azg2) {
        this.p = azg2;
        return this;
    }

    public boolean o() {
        return true;
    }

    public azg p() {
        return this.p;
    }

    public boolean q() {
        return this.p != null;
    }

    public void a(bhl bhl2, iu iu2, cpk cpk2, int n2, boolean bl2) {
    }

    public void b(bhl bhl2, iu iu2, bdl bdl2) {
    }

    public boolean u_() {
        return false;
    }

    public cga d_(bhl bhl2) {
        return cga.a;
    }

    public int e_(bhl bhl2) {
        return 0;
    }

    public void a(bhl bhl2, iu iu2, bga bga2, int n2) {
    }

    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
    }

    public String c(bhl bhl2) {
        return ("" + caf.a(this.i(bhl2) + ".name")).trim();
    }

    public boolean a(bhl bhl2) {
        return bhl2.w();
    }

    public abj b_(bhl bhl2) {
        if (bhl2.w()) {
            return abj.c;
        }
        return abj.a;
    }

    public boolean c_(bhl bhl2) {
        return this.i() == 1 && this.l();
    }

    protected auu a(iu iu2, bdl bdl2, boolean bl2) {
        float f2 = bdl2.bb;
        float f3 = bdl2.ba;
        double d2 = bdl2.aU;
        double d3 = bdl2.aV + (double)bdl2.A();
        double d4 = bdl2.aW;
        amj amj2 = new amj(d2, d3, d4);
        float f4 = cmk.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = cmk.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -cmk.b(-f2 * ((float)Math.PI / 180));
        float f7 = cmk.a(-f2 * ((float)Math.PI / 180));
        float f8 = f5 * f6;
        float f9 = f7;
        float f10 = f4 * f6;
        double d5 = 5.0;
        amj amj3 = amj2.b((double)f8 * 5.0, (double)f9 * 5.0, (double)f10 * 5.0);
        return iu2.a(amj2, amj3, bl2, !bl2, false);
    }

    public int d() {
        return 0;
    }

    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2));
    }

    public zm b() {
        return this.n;
    }

    public azg a(zm zm2) {
        this.n = zm2;
        return this;
    }

    public boolean r() {
        return false;
    }

    public boolean a(bhl bhl2, bhl bhl3) {
        return false;
    }

    public vi a(dfm dfm2) {
        return io.v();
    }

    public static void s() {
        azg.a(blg.b, new cdf(blg.b, blg.b, new bav()).a("stone"));
        azg.a(blg.c, new bkk(blg.c, false));
        azg.a(blg.d, new cdf(blg.d, blg.d, new aju()).a("dirt"));
        azg.b(blg.e);
        azg.a(blg.f, new cdf(blg.f, blg.f, new aaz()).a("wood"));
        azg.a(blg.g, new cdf(blg.g, blg.g, new btn()).a("sapling"));
        azg.b(blg.h);
        azg.a(blg.m, new cdf((bfa)blg.m, (bfa)blg.m, new bqq()).a("sand"));
        azg.b(blg.n);
        azg.b(blg.o);
        azg.b(blg.p);
        azg.b(blg.q);
        azg.a(blg.r, new cdf(blg.r, blg.r, new cpc()).a("log"));
        azg.a(blg.s, new cdf(blg.s, blg.s, new cdb()).a("log"));
        azg.a(blg.t, new dt(blg.t).a("leaves"));
        azg.a(blg.u, new dt(blg.u).a("leaves"));
        azg.a(blg.v, new cdf(blg.v, blg.v, new cmj()).a("sponge"));
        azg.b(blg.w);
        azg.b(blg.x);
        azg.b(blg.y);
        azg.b(blg.z);
        azg.a(blg.A, new cdf(blg.A, blg.A, new ckr()).a("sandStone"));
        azg.b(blg.B);
        azg.b(blg.D);
        azg.b(blg.E);
        azg.a(blg.F, new dcz(blg.F));
        azg.b(blg.G);
        azg.a(blg.H, new bkk(blg.H, true).a(new String[]{"shrub", "grass", "fern"}));
        azg.b(blg.I);
        azg.a(blg.J, new dcz(blg.J));
        azg.a(blg.L, new no(blg.L).a("cloth"));
        azg.a(blg.N, new cdf((bfa)blg.N, (bfa)blg.N, new ces()).a("flower"));
        azg.a(blg.O, new cdf((bfa)blg.O, (bfa)blg.O, new yq()).a("rose"));
        azg.b(blg.P);
        azg.b(blg.Q);
        azg.b(blg.R);
        azg.b(blg.S);
        azg.a(blg.U, new rn(blg.U, blg.U, blg.T).a("stoneSlab"));
        azg.b(blg.V);
        azg.b(blg.W);
        azg.b(blg.X);
        azg.b(blg.Y);
        azg.b(blg.Z);
        azg.b(blg.aa);
        azg.b(blg.cQ);
        azg.b(blg.cR);
        azg.b(blg.cS);
        azg.b(blg.cT);
        azg.b(blg.cU);
        azg.b(blg.cV);
        azg.a(blg.cX, new rn(blg.cX, blg.cX, blg.cW).a("purpurSlab"));
        azg.b(blg.ac);
        azg.b(blg.ad);
        azg.b(blg.ae);
        azg.b(blg.ag);
        azg.b(blg.ah);
        azg.b(blg.ai);
        azg.b(blg.ak);
        azg.b(blg.al);
        azg.b(blg.au);
        azg.b(blg.av);
        azg.b(blg.aw);
        azg.b(blg.ay);
        azg.b(blg.az);
        azg.b(blg.aB);
        azg.b(blg.aC);
        azg.b(blg.aF);
        azg.b(blg.aG);
        azg.a(blg.aH, new acx(blg.aH));
        azg.b(blg.aI);
        azg.b(blg.aJ);
        azg.b(blg.aK);
        azg.b(blg.aL);
        azg.b(blg.aN);
        azg.b(blg.aO);
        azg.b(blg.aP);
        azg.b(blg.aQ);
        azg.b(blg.aR);
        azg.b(blg.aS);
        azg.b(blg.aT);
        azg.b(blg.aU);
        azg.b(blg.aV);
        azg.b(blg.aW);
        azg.b(blg.aX);
        azg.b(blg.aZ);
        azg.b(blg.bd);
        azg.a(blg.be, new cdf(blg.be, blg.be, new auc()).a("monsterStoneEgg"));
        azg.a(blg.bf, new cdf(blg.bf, blg.bf, new kv()).a("stonebricksmooth"));
        azg.b(blg.bg);
        azg.b(blg.bh);
        azg.b(blg.bi);
        azg.b(blg.bj);
        azg.b(blg.bk);
        azg.a(blg.bn, new bkk(blg.bn, false));
        azg.b(blg.bo);
        azg.b(blg.bp);
        azg.b(blg.bq);
        azg.b(blg.br);
        azg.b(blg.bs);
        azg.b(blg.bt);
        azg.b(blg.bu);
        azg.b(blg.bv);
        azg.b(blg.bw);
        azg.a(blg.bx, new cwn(blg.bx));
        azg.b(blg.by);
        azg.b(blg.bz);
        azg.b(blg.bA);
        azg.b(blg.bC);
        azg.b(blg.bG);
        azg.b(blg.bH);
        azg.b(blg.cY);
        azg.b(blg.bI);
        azg.b(blg.bJ);
        azg.a(blg.bM, new rn(blg.bM, blg.bM, blg.bL).a("woodSlab"));
        azg.b(blg.bO);
        azg.b(blg.bP);
        azg.b(blg.bQ);
        azg.b(blg.bR);
        azg.b(blg.bT);
        azg.b(blg.bU);
        azg.b(blg.bV);
        azg.b(blg.bW);
        azg.b(blg.bX);
        azg.b(blg.bY);
        azg.a(blg.bZ, new cdf(blg.bZ, blg.bZ, new cbi()).a("cobbleWall"));
        azg.b(blg.cd);
        azg.a(blg.cf, new dde(blg.cf).a("anvil"));
        azg.b(blg.cg);
        azg.b(blg.ch);
        azg.b(blg.ci);
        azg.b(blg.cl);
        azg.b(blg.cn);
        azg.b(blg.co);
        azg.b(blg.cp);
        azg.a(blg.cq, new cdf(blg.cq, blg.cq, new String[]{"default", "chiseled", "lines"}).a("quartzBlock"));
        azg.b(blg.cr);
        azg.b(blg.cs);
        azg.b(blg.ct);
        azg.a(blg.cu, new no(blg.cu).a("clayHardenedStained"));
        azg.b(blg.cv);
        azg.b(blg.cw);
        azg.b(blg.cx);
        azg.a(blg.cy, new no(blg.cy).a("woolCarpet"));
        azg.b(blg.cz);
        azg.b(blg.cA);
        azg.b(blg.cB);
        azg.b(blg.cC);
        azg.b(blg.cD);
        azg.b(blg.cE);
        azg.b(blg.da);
        azg.a(blg.cF, new cdf((bfa)blg.cF, (bfa)blg.cF, new btg()).a("doublePlant"));
        azg.a(blg.cG, new no(blg.cG).a("stainedGlass"));
        azg.a(blg.cH, new no(blg.cH).a("stainedGlassPane"));
        azg.a(blg.cI, new cdf(blg.cI, blg.cI, new ajh()).a("prismarine"));
        azg.b(blg.cJ);
        azg.a(blg.cM, new cdf(blg.cM, blg.cM, new cqv()).a("redSandStone"));
        azg.b(blg.cN);
        azg.a(blg.cP, new rn(blg.cP, blg.cP, blg.cO).a("stoneSlab2"));
        azg.b(blg.dc);
        azg.b(blg.dd);
        azg.b(blg.df);
        azg.b(blg.dg);
        azg.b(blg.dh);
        azg.b(blg.di);
        azg.b(blg.dj);
        azg.b(blg.dk);
        azg.a(256, "iron_shovel", new aat(avx.c).b("shovelIron"));
        azg.a(257, "iron_pickaxe", new dax(avx.c).b("pickaxeIron"));
        azg.a(258, "iron_axe", new bap(avx.c).b("hatchetIron"));
        azg.a(259, "flint_and_steel", new bec().b("flintAndSteel"));
        azg.a(260, "apple", new aeu(4, 0.3f, false).b("apple"));
        azg.a(261, "bow", new azd().b("bow"));
        azg.a(262, "arrow", new dar().b("arrow"));
        azg.a(263, "coal", new dfb().b("coal"));
        azg.a(264, "diamond", new azg().b("diamond").a(zm.l));
        azg.a(265, "iron_ingot", new azg().b("ingotIron").a(zm.l));
        azg.a(266, "gold_ingot", new azg().b("ingotGold").a(zm.l));
        azg.a(267, "iron_sword", new bof(avx.c).b("swordIron"));
        azg.a(268, "wooden_sword", new bof(avx.a).b("swordWood"));
        azg.a(269, "wooden_shovel", new aat(avx.a).b("shovelWood"));
        azg.a(270, "wooden_pickaxe", new dax(avx.a).b("pickaxeWood"));
        azg.a(271, "wooden_axe", new bap(avx.a).b("hatchetWood"));
        azg.a(272, "stone_sword", new bof(avx.b).b("swordStone"));
        azg.a(273, "stone_shovel", new aat(avx.b).b("shovelStone"));
        azg.a(274, "stone_pickaxe", new dax(avx.b).b("pickaxeStone"));
        azg.a(275, "stone_axe", new bap(avx.b).b("hatchetStone"));
        azg.a(276, "diamond_sword", new bof(avx.d).b("swordDiamond"));
        azg.a(277, "diamond_shovel", new aat(avx.d).b("shovelDiamond"));
        azg.a(278, "diamond_pickaxe", new dax(avx.d).b("pickaxeDiamond"));
        azg.a(279, "diamond_axe", new bap(avx.d).b("hatchetDiamond"));
        azg.a(280, "stick", new azg().m().b("stick").a(zm.l));
        azg.a(281, "bowl", new azg().b("bowl").a(zm.l));
        azg.a(282, "mushroom_stew", new ny(6).b("mushroomStew"));
        azg.a(283, "golden_sword", new bof(avx.e).b("swordGold"));
        azg.a(284, "golden_shovel", new aat(avx.e).b("shovelGold"));
        azg.a(285, "golden_pickaxe", new dax(avx.e).b("pickaxeGold"));
        azg.a(286, "golden_axe", new bap(avx.e).b("hatchetGold"));
        azg.a(287, "string", new ddn(blg.bS).b("string").a(zm.l));
        azg.a(288, "feather", new azg().b("feather").a(zm.l));
        azg.a(289, "gunpowder", new azg().b("sulphur").a(zm.l));
        azg.a(290, "wooden_hoe", new axj(avx.a).b("hoeWood"));
        azg.a(291, "stone_hoe", new axj(avx.b).b("hoeStone"));
        azg.a(292, "iron_hoe", new axj(avx.c).b("hoeIron"));
        azg.a(293, "diamond_hoe", new axj(avx.d).b("hoeDiamond"));
        azg.a(294, "golden_hoe", new axj(avx.e).b("hoeGold"));
        azg.a(295, "wheat_seeds", new bw(blg.aj, blg.ak).b("seeds"));
        azg.a(296, "wheat", new azg().b("wheat").a(zm.l));
        azg.a(297, "bread", new aeu(5, 0.6f, false).b("bread"));
        azg.a(298, "leather_helmet", new uh(in.a, 0, dfm.f).b("helmetCloth"));
        azg.a(299, "leather_chestplate", new uh(in.a, 0, dfm.e).b("chestplateCloth"));
        azg.a(300, "leather_leggings", new uh(in.a, 0, dfm.d).b("leggingsCloth"));
        azg.a(301, "leather_boots", new uh(in.a, 0, dfm.c).b("bootsCloth"));
        azg.a(302, "chainmail_helmet", new uh(in.b, 1, dfm.f).b("helmetChain"));
        azg.a(303, "chainmail_chestplate", new uh(in.b, 1, dfm.e).b("chestplateChain"));
        azg.a(304, "chainmail_leggings", new uh(in.b, 1, dfm.d).b("leggingsChain"));
        azg.a(305, "chainmail_boots", new uh(in.b, 1, dfm.c).b("bootsChain"));
        azg.a(306, "iron_helmet", new uh(in.c, 2, dfm.f).b("helmetIron"));
        azg.a(307, "iron_chestplate", new uh(in.c, 2, dfm.e).b("chestplateIron"));
        azg.a(308, "iron_leggings", new uh(in.c, 2, dfm.d).b("leggingsIron"));
        azg.a(309, "iron_boots", new uh(in.c, 2, dfm.c).b("bootsIron"));
        azg.a(310, "diamond_helmet", new uh(in.e, 3, dfm.f).b("helmetDiamond"));
        azg.a(311, "diamond_chestplate", new uh(in.e, 3, dfm.e).b("chestplateDiamond"));
        azg.a(312, "diamond_leggings", new uh(in.e, 3, dfm.d).b("leggingsDiamond"));
        azg.a(313, "diamond_boots", new uh(in.e, 3, dfm.c).b("bootsDiamond"));
        azg.a(314, "golden_helmet", new uh(in.d, 4, dfm.f).b("helmetGold"));
        azg.a(315, "golden_chestplate", new uh(in.d, 4, dfm.e).b("chestplateGold"));
        azg.a(316, "golden_leggings", new uh(in.d, 4, dfm.d).b("leggingsGold"));
        azg.a(317, "golden_boots", new uh(in.d, 4, dfm.c).b("bootsGold"));
        azg.a(318, "flint", new azg().b("flint").a(zm.l));
        azg.a(319, "porkchop", new aeu(3, 0.3f, true).b("porkchopRaw"));
        azg.a(320, "cooked_porkchop", new aeu(8, 0.8f, true).b("porkchopCooked"));
        azg.a(321, "painting", new rl(cbk.class).b("painting"));
        azg.a(322, "golden_apple", new cdt(4, 1.2f, false).g().b("appleGold"));
        azg.a(323, "sign", new aml().b("sign"));
        azg.a(324, "wooden_door", new gc(blg.ao).b("doorOak"));
        azg azg2 = new cvk(blg.a).b("bucket").d(16);
        azg.a(325, "bucket", azg2);
        azg.a(326, "water_bucket", new cvk(blg.i).b("bucketWater").b(azg2));
        azg.a(327, "lava_bucket", new cvk(blg.k).b("bucketLava").b(azg2));
        azg.a(328, "minecart", new abx(cta.a).b("minecart"));
        azg.a(329, "saddle", new ya().b("saddle"));
        azg.a(330, "iron_door", new gc(blg.aA).b("doorIron"));
        azg.a(331, "redstone", new nt().b("redstone"));
        azg.a(332, "snowball", new axu().b("snowball"));
        azg.a(333, "boat", (azg)new cwf(cns.a));
        azg.a(334, "leather", new azg().b("leather").a(zm.l));
        azg.a(335, "milk_bucket", new aec().b("milk").b(azg2));
        azg.a(336, "brick", new azg().b("brick").a(zm.l));
        azg.a(337, "clay_ball", new azg().b("clay").a(zm.l));
        azg.a(338, "reeds", new ddn(blg.aM).b("reeds").a(zm.l));
        azg.a(339, "paper", new azg().b("paper").a(zm.f));
        azg.a(340, "book", new ti().b("book").a(zm.f));
        azg.a(341, "slime_ball", new azg().b("slimeball").a(zm.f));
        azg.a(342, "chest_minecart", new abx(cta.b).b("minecartChest"));
        azg.a(343, "furnace_minecart", new abx(cta.c).b("minecartFurnace"));
        azg.a(344, "egg", new ctw().b("egg"));
        azg.a(345, "compass", new qm().b("compass").a(zm.i));
        azg.a(346, "fishing_rod", new bic().b("fishingRod"));
        azg.a(347, "clock", new abv().b("clock").a(zm.i));
        azg.a(348, "glowstone_dust", new azg().b("yellowDust").a(zm.l));
        azg.a(349, "fish", new bin(false).b("fish").a(true));
        azg.a(350, "cooked_fish", new bin(true).b("fish").a(true));
        azg.a(351, "dye", new hr().b("dyePowder"));
        azg.a(352, "bone", new azg().b("bone").m().a(zm.f));
        azg.a(353, "sugar", new azg().b("sugar").a(zm.l));
        azg.a(354, "cake", new ddn(blg.ba).d(1).b("cake").a(zm.h));
        azg.a(355, "bed", new cxd().d(1).b("bed"));
        azg.a(356, "repeater", new ddn(blg.bb).b("diode").a(zm.d));
        azg.a(357, "cookie", new aeu(2, 0.1f, false).b("cookie"));
        azg.a(358, "filled_map", new ayb().b("map"));
        azg.a(359, "shears", new blf().b("shears"));
        azg.a(360, "melon", new aeu(2, 0.3f, false).b("melon"));
        azg.a(361, "pumpkin_seeds", new bw(blg.bl, blg.ak).b("seeds_pumpkin"));
        azg.a(362, "melon_seeds", new bw(blg.bm, blg.ak).b("seeds_melon"));
        azg.a(363, "beef", new aeu(3, 0.3f, true).b("beefRaw"));
        azg.a(364, "cooked_beef", new aeu(8, 0.8f, true).b("beefCooked"));
        azg.a(365, "chicken", new aeu(2, 0.3f, true).a(new cko(ake.q, 600, 0), 0.3f).b("chickenRaw"));
        azg.a(366, "cooked_chicken", new aeu(6, 0.6f, true).b("chickenCooked"));
        azg.a(367, "rotten_flesh", new aeu(4, 0.1f, true).a(new cko(ake.q, 600, 0), 0.8f).b("rottenFlesh"));
        azg.a(368, "ender_pearl", new boy().b("enderPearl"));
        azg.a(369, "blaze_rod", new azg().b("blazeRod").a(zm.l).m());
        azg.a(370, "ghast_tear", new azg().b("ghastTear").a(zm.k));
        azg.a(371, "gold_nugget", new azg().b("goldNugget").a(zm.l));
        azg.a(372, "nether_wart", new bw(blg.bB, blg.aW).b("netherStalkSeeds"));
        azg.a(373, "potion", new abb().b("potion"));
        azg azg3 = new fs().b("glassBottle");
        azg.a(374, "glass_bottle", azg3);
        azg.a(375, "spider_eye", new aeu(2, 0.8f, false).a(new cko(ake.s, 100, 0), 1.0f).b("spiderEye"));
        azg.a(376, "fermented_spider_eye", new azg().b("fermentedSpiderEye").a(zm.k));
        azg.a(377, "blaze_powder", new azg().b("blazePowder").a(zm.k));
        azg.a(378, "magma_cream", new azg().b("magmaCream").a(zm.k));
        azg.a(379, "brewing_stand", new ddn(blg.bD).b("brewingStand").a(zm.k));
        azg.a(380, "cauldron", new ddn(blg.bE).b("cauldron").a(zm.k));
        azg.a(381, "ender_eye", new bhe().b("eyeOfEnder"));
        azg.a(382, "speckled_melon", new azg().b("speckledMelon").a(zm.k));
        azg.a(383, "spawn_egg", new clx().b("monsterPlacer"));
        azg.a(384, "experience_bottle", new bk().b("expBottle"));
        azg.a(385, "fire_charge", new dbb().b("fireball"));
        azg.a(386, "writable_book", new bsp().b("writingBook").a(zm.f));
        azg.a(387, "written_book", new daa().b("writtenBook").d(16));
        azg.a(388, "emerald", new azg().b("emerald").a(zm.l));
        azg.a(389, "item_frame", new rl(cvr.class).b("frame"));
        azg.a(390, "flower_pot", new ddn(blg.ca).b("flowerPot").a(zm.c));
        azg.a(391, "carrot", new bhf(3, 0.6f, blg.cb, blg.ak).b("carrots"));
        azg.a(392, "potato", new bhf(1, 0.3f, blg.cc, blg.ak).b("potato"));
        azg.a(393, "baked_potato", new aeu(5, 0.6f, false).b("potatoBaked"));
        azg.a(394, "poisonous_potato", new aeu(2, 0.3f, false).a(new cko(ake.s, 100, 0), 0.6f).b("potatoPoisonous"));
        azg.a(395, "map", new dgh().b("emptyMap"));
        azg.a(396, "golden_carrot", new aeu(6, 1.2f, false).b("carrotGolden").a(zm.k));
        azg.a(397, "skull", new crl().b("skull"));
        azg.a(398, "carrot_on_a_stick", new bgq().b("carrotOnAStick"));
        azg.a(399, "nether_star", new dl().b("netherStar").a(zm.l));
        azg.a(400, "pumpkin_pie", new aeu(8, 0.3f, false).b("pumpkinPie").a(zm.h));
        azg.a(401, "fireworks", new cxm().b("fireworks"));
        azg.a(402, "firework_charge", new avm().b("fireworksCharge").a(zm.f));
        azg.a(403, "enchanted_book", new auj().d(1).b("enchantedBook"));
        azg.a(404, "comparator", new ddn(blg.cj).b("comparator").a(zm.d));
        azg.a(405, "netherbrick", new azg().b("netherbrick").a(zm.l));
        azg.a(406, "quartz", new azg().b("netherquartz").a(zm.l));
        azg.a(407, "tnt_minecart", new abx(cta.d).b("minecartTnt"));
        azg.a(408, "hopper_minecart", new abx(cta.f).b("minecartHopper"));
        azg.a(409, "prismarine_shard", new azg().b("prismarineShard").a(zm.l));
        azg.a(410, "prismarine_crystals", new azg().b("prismarineCrystals").a(zm.l));
        azg.a(411, "rabbit", new aeu(3, 0.3f, true).b("rabbitRaw"));
        azg.a(412, "cooked_rabbit", new aeu(5, 0.6f, true).b("rabbitCooked"));
        azg.a(413, "rabbit_stew", new ny(10).b("rabbitStew"));
        azg.a(414, "rabbit_foot", new azg().b("rabbitFoot").a(zm.k));
        azg.a(415, "rabbit_hide", new azg().b("rabbitHide").a(zm.l));
        azg.a(416, "armor_stand", new nq().b("armorStand").d(16));
        azg.a(417, "iron_horse_armor", new azg().b("horsearmormetal").d(1).a(zm.f));
        azg.a(418, "golden_horse_armor", new azg().b("horsearmorgold").d(1).a(zm.f));
        azg.a(419, "diamond_horse_armor", new azg().b("horsearmordiamond").d(1).a(zm.f));
        azg.a(420, "lead", new mx().b("leash"));
        azg.a(421, "name_tag", new azi().b("nameTag"));
        azg.a(422, "command_block_minecart", new abx(cta.g).b("minecartCommandBlock").a((zm)null));
        azg.a(423, "mutton", new aeu(2, 0.3f, true).b("muttonRaw"));
        azg.a(424, "cooked_mutton", new aeu(6, 0.8f, true).b("muttonCooked"));
        azg.a(425, "banner", (azg)new oj().a("banner"));
        azg.a(426, "end_crystal", (azg)new afn());
        azg.a(427, "spruce_door", new gc(blg.ap).b("doorSpruce"));
        azg.a(428, "birch_door", new gc(blg.aq).b("doorBirch"));
        azg.a(429, "jungle_door", new gc(blg.ar).b("doorJungle"));
        azg.a(430, "acacia_door", new gc(blg.as).b("doorAcacia"));
        azg.a(431, "dark_oak_door", new gc(blg.at).b("doorDarkOak"));
        azg.a(432, "chorus_fruit", new aur(4, 0.3f).g().b("chorusFruit").a(zm.l));
        azg.a(433, "chorus_fruit_popped", new azg().b("chorusFruitPopped").a(zm.l));
        azg.a(434, "beetroot", new aeu(1, 0.6f, false).b("beetroot"));
        azg.a(435, "beetroot_seeds", new bw(blg.cZ, blg.ak).b("beetroot_seeds"));
        azg.a(436, "beetroot_soup", new ny(6).b("beetroot_soup"));
        azg.a(437, "dragon_breath", new azg().a(zm.k).b("dragon_breath").b(azg3));
        azg.a(438, "splash_potion", new can().b("splash_potion"));
        azg.a(439, "spectral_arrow", new byu().b("spectral_arrow"));
        azg.a(440, "tipped_arrow", new ddw().b("tipped_arrow"));
        azg.a(441, "lingering_potion", new awq().b("lingering_potion"));
        azg.a(442, "shield", new ddv().b("shield"));
        azg.a(443, "elytra", new anb().b("elytra"));
        azg.a(444, "spruce_boat", (azg)new cwf(cns.b));
        azg.a(445, "birch_boat", (azg)new cwf(cns.c));
        azg.a(446, "jungle_boat", (azg)new cwf(cns.d));
        azg.a(447, "acacia_boat", (azg)new cwf(cns.e));
        azg.a(448, "dark_oak_boat", (azg)new cwf(cns.f));
        azg.a(2256, "record_13", new anz("13", dah.eG).b("record"));
        azg.a(2257, "record_cat", new anz("cat", dah.eI).b("record"));
        azg.a(2258, "record_blocks", new anz("blocks", dah.eH).b("record"));
        azg.a(2259, "record_chirp", new anz("chirp", dah.eJ).b("record"));
        azg.a(2260, "record_far", new anz("far", dah.eK).b("record"));
        azg.a(2261, "record_mall", new anz("mall", dah.eL).b("record"));
        azg.a(2262, "record_mellohi", new anz("mellohi", dah.eM).b("record"));
        azg.a(2263, "record_stal", new anz("stal", dah.eN).b("record"));
        azg.a(2264, "record_strad", new anz("strad", dah.eO).b("record"));
        azg.a(2265, "record_ward", new anz("ward", dah.eQ).b("record"));
        azg.a(2266, "record_11", new anz("11", dah.eF).b("record"));
        azg.a(2267, "record_wait", new anz("wait", dah.eP).b("record"));
    }

    private static void b(bfa bfa2) {
        azg.a(bfa2, new ge(bfa2));
    }

    protected static void a(bfa bfa2, azg azg2) {
        azg.a(bfa.c(bfa2), (bpx)bfa.v.b(bfa2), azg2);
        a.put(bfa2, azg2);
    }

    private static void a(int n2, String string, azg azg2) {
        azg.a(n2, new bpx(string), azg2);
    }

    private static void a(int n2, bpx bpx2, azg azg2) {
        g.a(n2, bpx2, azg2);
    }
}

