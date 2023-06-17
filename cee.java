/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.l.m;
import java.util.Random;

public class cee
extends cjn
implements ceh,
ckg {
    private final clo e;
    protected String a = "Customize World Settings";
    protected String b = "Page 1 of 3";
    protected String c = "Basic Settings";
    protected String[] d = new String[4];
    private axv f;
    private cwv g;
    private cwv h;
    private cwv i;
    private cwv j;
    private cwv k;
    private cwv l;
    private cwv m;
    private cwv r;
    private boolean s;
    private int t;
    private boolean C;
    private final cm D = new pq(this);
    private final bqr E = new bqr();
    private bqr F;
    private final Random G = new Random();

    public cee(cjn cjn2, String string) {
        this.e = (clo)cjn2;
        this.a(string);
    }

    @Override
    public void cH_() {
        int n2 = 0;
        int n3 = 0;
        if (this.f != null) {
            n2 = this.f.l();
            n3 = this.f.h();
        }
        this.a = bf.a("options.customizeTitle", new Object[0]);
        this.y.clear();
        this.j = this.b(new cwv(302, 20, 5, 80, 20, bf.a("createWorld.customize.custom.prev", new Object[0])));
        this.k = this.b(new cwv(303, this.w - 100, 5, 80, 20, bf.a("createWorld.customize.custom.next", new Object[0])));
        this.i = this.b(new cwv(304, this.w / 2 - 187, this.x - 27, 90, 20, bf.a("createWorld.customize.custom.defaults", new Object[0])));
        this.h = this.b(new cwv(301, this.w / 2 - 92, this.x - 27, 90, 20, bf.a("createWorld.customize.custom.randomize", new Object[0])));
        this.r = this.b(new cwv(305, this.w / 2 + 3, this.x - 27, 90, 20, bf.a("createWorld.customize.custom.presets", new Object[0])));
        this.g = this.b(new cwv(300, this.w / 2 + 98, this.x - 27, 90, 20, bf.a("gui.done", new Object[0])));
        this.i.k = this.s;
        this.l = new cwv(306, this.w / 2 - 55, 160, 50, 20, bf.a("gui.yes", new Object[0]));
        this.l.l = false;
        this.y.add(this.l);
        this.m = new cwv(307, this.w / 2 + 5, 160, 50, 20, bf.a("gui.no", new Object[0]));
        this.m.l = false;
        this.y.add(this.m);
        if (this.t != 0) {
            this.l.l = true;
            this.m.l = true;
        }
        this.h();
        if (n2 != 0) {
            this.f.b(n2);
            this.f.e(n3);
            this.q();
        }
    }

    @Override
    public void p_() {
        super.p_();
        this.f.i();
    }

    private void h() {
        asq[] arrasq = new asq[]{new ddl(160, bf.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0f, 255.0f, this.F.r), new bvf(148, bf.a("createWorld.customize.custom.useCaves", new Object[0]), true, this.F.s), new bvf(150, bf.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.F.v), new bvf(151, bf.a("createWorld.customize.custom.useVillages", new Object[0]), true, this.F.w), new bvf(152, bf.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.F.x), new bvf(153, bf.a("createWorld.customize.custom.useTemples", new Object[0]), true, this.F.y), new bvf(210, bf.a("createWorld.customize.custom.useMonuments", new Object[0]), true, this.F.z), new bvf(154, bf.a("createWorld.customize.custom.useRavines", new Object[0]), true, this.F.A), new bvf(149, bf.a("createWorld.customize.custom.useDungeons", new Object[0]), true, this.F.t), new ddl(157, bf.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0f, 100.0f, this.F.u), new bvf(155, bf.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.F.B), new ddl(158, bf.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0f, 100.0f, this.F.C), new bvf(156, bf.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.F.D), new ddl(159, bf.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0f, 100.0f, this.F.E), new bvf(161, bf.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.F.F), new ddl(162, bf.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0f, 37.0f, this.F.G), new ddl(163, bf.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0f, 8.0f, this.F.H), new ddl(164, bf.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0f, 5.0f, this.F.I)};
        asq[] arrasq2 = new asq[]{new agv(416, bf.a("tile.dirt.name", new Object[0]), false), null, new ddl(165, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.J), new ddl(166, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.K), new ddl(167, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.L), new ddl(168, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.M), new agv(417, bf.a("tile.gravel.name", new Object[0]), false), null, new ddl(169, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.N), new ddl(170, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.O), new ddl(171, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.P), new ddl(172, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.Q), new agv(418, bf.a("tile.stone.granite.name", new Object[0]), false), null, new ddl(173, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.R), new ddl(174, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.S), new ddl(175, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.T), new ddl(176, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.U), new agv(419, bf.a("tile.stone.diorite.name", new Object[0]), false), null, new ddl(177, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.V), new ddl(178, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.W), new ddl(179, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.X), new ddl(180, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.Y), new agv(420, bf.a("tile.stone.andesite.name", new Object[0]), false), null, new ddl(181, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.Z), new ddl(182, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.aa), new ddl(183, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ab), new ddl(184, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ac), new agv(421, bf.a("tile.oreCoal.name", new Object[0]), false), null, new ddl(185, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ad), new ddl(186, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.ae), new ddl(187, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.af), new ddl(189, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ag), new agv(422, bf.a("tile.oreIron.name", new Object[0]), false), null, new ddl(190, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ah), new ddl(191, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.ai), new ddl(192, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.aj), new ddl(193, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ak), new agv(423, bf.a("tile.oreGold.name", new Object[0]), false), null, new ddl(194, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.al), new ddl(195, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.am), new ddl(196, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.an), new ddl(197, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ao), new agv(424, bf.a("tile.oreRedstone.name", new Object[0]), false), null, new ddl(198, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ap), new ddl(199, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.aq), new ddl(200, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ar), new ddl(201, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.as), new agv(425, bf.a("tile.oreDiamond.name", new Object[0]), false), null, new ddl(202, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.at), new ddl(203, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.au), new ddl(204, bf.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.av), new ddl(205, bf.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.aw), new agv(426, bf.a("tile.oreLapis.name", new Object[0]), false), null, new ddl(206, bf.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ax), new ddl(207, bf.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.ay), new ddl(208, bf.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0f, 255.0f, this.F.az), new ddl(209, bf.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0f, 255.0f, this.F.aA)};
        asq[] arrasq3 = new asq[]{new ddl(100, bf.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0f, 5000.0f, this.F.i), new ddl(101, bf.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0f, 5000.0f, this.F.j), new ddl(102, bf.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0f, 5000.0f, this.F.k), new ddl(103, bf.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0f, 2000.0f, this.F.f), new ddl(104, bf.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0f, 2000.0f, this.F.g), new ddl(105, bf.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01f, 20.0f, this.F.h), new ddl(106, bf.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0f, 25.0f, this.F.l), new ddl(107, bf.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0f, 6000.0f, this.F.b), new ddl(108, bf.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0f, 6000.0f, this.F.c), new ddl(109, bf.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01f, 50.0f, this.F.m), new ddl(110, bf.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.F.d), new ddl(111, bf.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.F.e), new ddl(112, bf.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0f, 20.0f, this.F.n), new ddl(113, bf.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0f, 20.0f, this.F.o), new ddl(114, bf.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0f, 20.0f, this.F.p), new ddl(115, bf.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0f, 20.0f, this.F.q)};
        asq[] arrasq4 = new asq[]{new agv(400, bf.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new aad(132, String.format("%5.3f", Float.valueOf(this.F.i)), false, this.D), new agv(401, bf.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new aad(133, String.format("%5.3f", Float.valueOf(this.F.j)), false, this.D), new agv(402, bf.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new aad(134, String.format("%5.3f", Float.valueOf(this.F.k)), false, this.D), new agv(403, bf.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new aad(135, String.format("%5.3f", Float.valueOf(this.F.f)), false, this.D), new agv(404, bf.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new aad(136, String.format("%5.3f", Float.valueOf(this.F.g)), false, this.D), new agv(405, bf.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new aad(137, String.format("%2.3f", Float.valueOf(this.F.h)), false, this.D), new agv(406, bf.a("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new aad(138, String.format("%2.3f", Float.valueOf(this.F.l)), false, this.D), new agv(407, bf.a("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new aad(139, String.format("%5.3f", Float.valueOf(this.F.b)), false, this.D), new agv(408, bf.a("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new aad(140, String.format("%5.3f", Float.valueOf(this.F.c)), false, this.D), new agv(409, bf.a("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new aad(141, String.format("%2.3f", Float.valueOf(this.F.m)), false, this.D), new agv(410, bf.a("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new aad(142, String.format("%5.3f", Float.valueOf(this.F.d)), false, this.D), new agv(411, bf.a("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new aad(143, String.format("%5.3f", Float.valueOf(this.F.e)), false, this.D), new agv(412, bf.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new aad(144, String.format("%2.3f", Float.valueOf(this.F.n)), false, this.D), new agv(413, bf.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new aad(145, String.format("%2.3f", Float.valueOf(this.F.o)), false, this.D), new agv(414, bf.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new aad(146, String.format("%2.3f", Float.valueOf(this.F.p)), false, this.D), new agv(415, bf.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new aad(147, String.format("%2.3f", Float.valueOf(this.F.q)), false, this.D)};
        this.f = new axv(this.u, this.w, this.x, 32, this.x - 32, 25, this, arrasq, arrasq2, arrasq3, arrasq4);
        for (int i2 = 0; i2 < 4; ++i2) {
            this.d[i2] = bf.a("createWorld.customize.custom.page" + i2, new Object[0]);
        }
        this.q();
    }

    public String f() {
        return this.F.toString().replace("\n", "");
    }

    public void a(String string) {
        this.F = string != null && !string.isEmpty() ? bqr.a(string) : new bqr();
    }

    @Override
    public void a(int n2, String string) {
        float f2 = 0.0f;
        try {
            f2 = Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        float f3 = 0.0f;
        switch (n2) {
            case 139: {
                f3 = this.F.b = cmk.a(f2, 1.0f, 6000.0f);
                break;
            }
            case 140: {
                f3 = this.F.c = cmk.a(f2, 1.0f, 6000.0f);
                break;
            }
            case 142: {
                f3 = this.F.d = cmk.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 143: {
                f3 = this.F.e = cmk.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 135: {
                f3 = this.F.f = cmk.a(f2, 1.0f, 2000.0f);
                break;
            }
            case 136: {
                f3 = this.F.g = cmk.a(f2, 1.0f, 2000.0f);
                break;
            }
            case 137: {
                f3 = this.F.h = cmk.a(f2, 0.01f, 20.0f);
                break;
            }
            case 132: {
                f3 = this.F.i = cmk.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 133: {
                f3 = this.F.j = cmk.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 134: {
                f3 = this.F.k = cmk.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 138: {
                f3 = this.F.l = cmk.a(f2, 1.0f, 25.0f);
                break;
            }
            case 141: {
                f3 = this.F.m = cmk.a(f2, 0.01f, 50.0f);
                break;
            }
            case 144: {
                f3 = this.F.n = cmk.a(f2, 1.0f, 20.0f);
                break;
            }
            case 145: {
                f3 = this.F.o = cmk.a(f2, 0.0f, 20.0f);
                break;
            }
            case 146: {
                f3 = this.F.p = cmk.a(f2, 1.0f, 20.0f);
                break;
            }
            case 147: {
                f3 = this.F.q = cmk.a(f2, 0.0f, 20.0f);
            }
        }
        if (f3 != f2 && f2 != 0.0f) {
            ((cld)this.f.g(n2)).a(this.b(n2, f3));
        }
        ((dv)this.f.g(n2 - 132 + 100)).a(f3, false);
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }

    private void a(boolean bl2) {
        this.s = bl2;
        this.i.k = bl2;
    }

    @Override
    public String a(int n2, String string, float f2) {
        return string + ": " + this.b(n2, f2);
    }

    private String b(int n2, float f2) {
        switch (n2) {
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 107: 
            case 108: 
            case 110: 
            case 111: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 139: 
            case 140: 
            case 142: 
            case 143: {
                return String.format("%5.3f", Float.valueOf(f2));
            }
            case 105: 
            case 106: 
            case 109: 
            case 112: 
            case 113: 
            case 114: 
            case 115: 
            case 137: 
            case 138: 
            case 141: 
            case 144: 
            case 145: 
            case 146: 
            case 147: {
                return String.format("%2.3f", Float.valueOf(f2));
            }
            case 162: {
                if (f2 < 0.0f) {
                    return bf.a("gui.all", new Object[0]);
                }
                if ((int)f2 >= anr.a(cff.j)) {
                    anr anr2 = anr.a((int)f2 + 2);
                    return anr2 != null ? anr2.l() : "?";
                }
                anr anr3 = anr.a((int)f2);
                return anr3 != null ? anr3.l() : "?";
            }
        }
        return String.format("%d", (int)f2);
    }

    @Override
    public void a(int n2, boolean bl2) {
        switch (n2) {
            case 148: {
                this.F.s = bl2;
                break;
            }
            case 149: {
                this.F.t = bl2;
                break;
            }
            case 150: {
                this.F.v = bl2;
                break;
            }
            case 151: {
                this.F.w = bl2;
                break;
            }
            case 152: {
                this.F.x = bl2;
                break;
            }
            case 153: {
                this.F.y = bl2;
                break;
            }
            case 154: {
                this.F.A = bl2;
                break;
            }
            case 210: {
                this.F.z = bl2;
                break;
            }
            case 155: {
                this.F.B = bl2;
                break;
            }
            case 156: {
                this.F.D = bl2;
                break;
            }
            case 161: {
                this.F.F = bl2;
            }
        }
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }

    @Override
    public void a(int n2, float f2) {
        alo alo2;
        switch (n2) {
            case 107: {
                this.F.b = f2;
                break;
            }
            case 108: {
                this.F.c = f2;
                break;
            }
            case 110: {
                this.F.d = f2;
                break;
            }
            case 111: {
                this.F.e = f2;
                break;
            }
            case 103: {
                this.F.f = f2;
                break;
            }
            case 104: {
                this.F.g = f2;
                break;
            }
            case 105: {
                this.F.h = f2;
                break;
            }
            case 100: {
                this.F.i = f2;
                break;
            }
            case 101: {
                this.F.j = f2;
                break;
            }
            case 102: {
                this.F.k = f2;
                break;
            }
            case 106: {
                this.F.l = f2;
                break;
            }
            case 109: {
                this.F.m = f2;
                break;
            }
            case 112: {
                this.F.n = f2;
                break;
            }
            case 113: {
                this.F.o = f2;
                break;
            }
            case 114: {
                this.F.p = f2;
                break;
            }
            case 115: {
                this.F.q = f2;
                break;
            }
            case 157: {
                this.F.u = (int)f2;
                break;
            }
            case 158: {
                this.F.C = (int)f2;
                break;
            }
            case 159: {
                this.F.E = (int)f2;
                break;
            }
            case 160: {
                this.F.r = (int)f2;
                break;
            }
            case 162: {
                this.F.G = (int)f2;
                break;
            }
            case 163: {
                this.F.H = (int)f2;
                break;
            }
            case 164: {
                this.F.I = (int)f2;
                break;
            }
            case 166: {
                this.F.K = (int)f2;
                break;
            }
            case 165: {
                this.F.J = (int)f2;
                break;
            }
            case 167: {
                this.F.L = (int)f2;
                break;
            }
            case 168: {
                this.F.M = (int)f2;
                break;
            }
            case 170: {
                this.F.O = (int)f2;
                break;
            }
            case 169: {
                this.F.N = (int)f2;
                break;
            }
            case 171: {
                this.F.P = (int)f2;
                break;
            }
            case 172: {
                this.F.Q = (int)f2;
                break;
            }
            case 174: {
                this.F.S = (int)f2;
                break;
            }
            case 173: {
                this.F.R = (int)f2;
                break;
            }
            case 175: {
                this.F.T = (int)f2;
                break;
            }
            case 176: {
                this.F.U = (int)f2;
                break;
            }
            case 178: {
                this.F.W = (int)f2;
                break;
            }
            case 177: {
                this.F.V = (int)f2;
                break;
            }
            case 179: {
                this.F.X = (int)f2;
                break;
            }
            case 180: {
                this.F.Y = (int)f2;
                break;
            }
            case 182: {
                this.F.aa = (int)f2;
                break;
            }
            case 181: {
                this.F.Z = (int)f2;
                break;
            }
            case 183: {
                this.F.ab = (int)f2;
                break;
            }
            case 184: {
                this.F.ac = (int)f2;
                break;
            }
            case 186: {
                this.F.ae = (int)f2;
                break;
            }
            case 185: {
                this.F.ad = (int)f2;
                break;
            }
            case 187: {
                this.F.af = (int)f2;
                break;
            }
            case 189: {
                this.F.ag = (int)f2;
                break;
            }
            case 191: {
                this.F.ai = (int)f2;
                break;
            }
            case 190: {
                this.F.ah = (int)f2;
                break;
            }
            case 192: {
                this.F.aj = (int)f2;
                break;
            }
            case 193: {
                this.F.ak = (int)f2;
                break;
            }
            case 195: {
                this.F.am = (int)f2;
                break;
            }
            case 194: {
                this.F.al = (int)f2;
                break;
            }
            case 196: {
                this.F.an = (int)f2;
                break;
            }
            case 197: {
                this.F.ao = (int)f2;
                break;
            }
            case 199: {
                this.F.aq = (int)f2;
                break;
            }
            case 198: {
                this.F.ap = (int)f2;
                break;
            }
            case 200: {
                this.F.ar = (int)f2;
                break;
            }
            case 201: {
                this.F.as = (int)f2;
                break;
            }
            case 203: {
                this.F.au = (int)f2;
                break;
            }
            case 202: {
                this.F.at = (int)f2;
                break;
            }
            case 204: {
                this.F.av = (int)f2;
                break;
            }
            case 205: {
                this.F.aw = (int)f2;
                break;
            }
            case 207: {
                this.F.ay = (int)f2;
                break;
            }
            case 206: {
                this.F.ax = (int)f2;
                break;
            }
            case 208: {
                this.F.az = (int)f2;
                break;
            }
            case 209: {
                this.F.aA = (int)f2;
            }
        }
        if (n2 >= 100 && n2 < 116 && (alo2 = this.f.g(n2 - 100 + 132)) != null) {
            ((cld)alo2).a(this.b(n2, f2));
        }
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        switch (cwv2.j) {
            case 300: {
                this.e.a = this.F.toString();
                this.u.a(this.e);
                break;
            }
            case 305: {
                this.u.a(new blk(this));
                break;
            }
            case 301: {
                for (int i2 = 0; i2 < this.f.a(); ++i2) {
                    alo alo2;
                    cqp cqp2 = this.f.h(i2);
                    alo alo3 = cqp2.a();
                    if (alo3 instanceof cwv) {
                        alo2 = (cwv)alo3;
                        if (alo2 instanceof dv) {
                            float f2 = ((dv)alo2).b() * (0.75f + this.G.nextFloat() * 0.5f) + (this.G.nextFloat() * 0.1f - 0.05f);
                            ((dv)alo2).a(cmk.a(f2, 0.0f, 1.0f));
                        } else if (alo2 instanceof ahv) {
                            ((ahv)alo2).b(this.G.nextBoolean());
                        }
                    }
                    if (!((alo2 = cqp2.b()) instanceof cwv)) continue;
                    alo alo4 = alo2;
                    if (alo4 instanceof dv) {
                        float f3 = ((dv)alo4).b() * (0.75f + this.G.nextFloat() * 0.5f) + (this.G.nextFloat() * 0.1f - 0.05f);
                        ((dv)alo4).a(cmk.a(f3, 0.0f, 1.0f));
                        continue;
                    }
                    if (!(alo4 instanceof ahv)) continue;
                    ((ahv)alo4).b(this.G.nextBoolean());
                }
                break;
            }
            case 302: {
                this.f.o();
                this.q();
                break;
            }
            case 303: {
                this.f.p();
                this.q();
                break;
            }
            case 304: {
                if (!this.s) break;
                this.b(304);
                break;
            }
            case 307: {
                this.t = 0;
                this.j();
                break;
            }
            case 306: {
                this.j();
            }
        }
    }

    private void i() {
        this.F.a();
        this.h();
        this.a(false);
    }

    private void b(int n2) {
        this.t = n2;
        this.b(true);
    }

    private void j() {
        switch (this.t) {
            case 300: {
                this.a((ahv)this.f.g(300));
                break;
            }
            case 304: {
                this.i();
            }
        }
        this.t = 0;
        this.C = true;
        this.b(false);
    }

    private void b(boolean bl2) {
        this.l.l = bl2;
        this.m.l = bl2;
        this.h.k = !bl2;
        this.g.k = !bl2;
        this.j.k = !bl2;
        this.k.k = !bl2;
        this.i.k = this.s && !bl2;
        this.r.k = !bl2;
        this.f.c(!bl2);
    }

    private void q() {
        this.j.k = this.f.l() != 0;
        this.k.k = this.f.l() != this.f.m() - 1;
        this.b = bf.a("book.pageIndicator", this.f.l() + 1, this.f.m());
        this.c = this.d[this.f.l()];
        this.h.k = this.f.l() != this.f.m() - 1;
    }

    @Override
    protected void a(char c2, int n2) {
        super.a(c2, n2);
        if (this.t != 0) {
            return;
        }
        switch (n2) {
            case 208: {
                this.a(-1.0f);
                break;
            }
            case 200: {
                this.a(1.0f);
                break;
            }
            default: {
                this.f.a(c2, n2);
            }
        }
    }

    private void a(float f2) {
        cld cld2;
        Float f3;
        alo alo2 = this.f.n();
        if (!(alo2 instanceof cld)) {
            return;
        }
        float f4 = f2;
        if (cjn.o()) {
            f4 *= 0.1f;
            if (cjn.n()) {
                f4 *= 0.1f;
            }
        } else if (cjn.n()) {
            f4 *= 10.0f;
            if (cjn.p()) {
                f4 *= 10.0f;
            }
        }
        if ((f3 = com.a.a.l.m.a((cld2 = (cld)alo2).b())) == null) {
            return;
        }
        f3 = Float.valueOf(f3.floatValue() + f4);
        int n2 = cld2.d();
        String string = this.b(cld2.d(), f3.floatValue());
        cld2.a(string);
        this.a(n2, string);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.t != 0 || this.C) {
            return;
        }
        this.f.b(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        if (this.C) {
            this.C = false;
            return;
        }
        if (this.t != 0) {
            return;
        }
        this.f.c(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.f.a(n2, n3, f2);
        this.a(this.B, this.a, this.w / 2, 2, 0xFFFFFF);
        this.a(this.B, this.b, this.w / 2, 12, 0xFFFFFF);
        this.a(this.B, this.c, this.w / 2, 22, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.t != 0) {
            cee.a(0, 0, this.w, this.x, Integer.MIN_VALUE);
            this.a(this.w / 2 - 91, this.w / 2 + 90, 99, -2039584);
            this.a(this.w / 2 - 91, this.w / 2 + 90, 185, -6250336);
            this.b(this.w / 2 - 91, 99, 185, -2039584);
            this.b(this.w / 2 + 90, 99, 185, -6250336);
            float f3 = 85.0f;
            float f4 = 180.0f;
            cja.f();
            cja.o();
            bha bha2 = bha.a();
            bix bix2 = bha2.c();
            this.u.P().a(n);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            float f5 = 32.0f;
            bix2.a(7, bxb.i);
            bix2.b((double)(this.w / 2 - 90), 185.0, 0.0).a(0.0, 2.65625).b(64, 64, 64, 64).d();
            bix2.b((double)(this.w / 2 + 90), 185.0, 0.0).a(5.625, 2.65625).b(64, 64, 64, 64).d();
            bix2.b((double)(this.w / 2 + 90), 100.0, 0.0).a(5.625, 0.0).b(64, 64, 64, 64).d();
            bix2.b((double)(this.w / 2 - 90), 100.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 64).d();
            bha2.b();
            this.a(this.B, bf.a("createWorld.customize.custom.confirmTitle", new Object[0]), this.w / 2, 105, 0xFFFFFF);
            this.a(this.B, bf.a("createWorld.customize.custom.confirm1", new Object[0]), this.w / 2, 125, 0xFFFFFF);
            this.a(this.B, bf.a("createWorld.customize.custom.confirm2", new Object[0]), this.w / 2, 135, 0xFFFFFF);
            this.l.c(this.u, n2, n3);
            this.m.c(this.u, n2, n3);
        }
    }
}

