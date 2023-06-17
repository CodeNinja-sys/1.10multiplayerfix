/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.cm;
import com.a.a.l.m;
import java.util.Random;
import net.minecraft.a.i;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.ae;
import net.minecraft.client.k.am;
import net.minecraft.client.k.ao;
import net.minecraft.client.k.bf;
import net.minecraft.client.k.bi;
import net.minecraft.client.k.bk;
import net.minecraft.client.k.c;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.cg;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cj;
import net.minecraft.client.k.ck;
import net.minecraft.client.k.cs;
import net.minecraft.client.k.de;
import net.minecraft.client.k.dn;
import net.minecraft.client.k.f;
import net.minecraft.client.k.o;
import net.minecraft.client.k.w;
import net.minecraft.q.b.q;
import net.minecraft.q.g.h;
import net.minecraft.u.b.n;

public class cq
extends cc
implements ae,
bk {
    private final cs e;
    protected String a = "Customize World Settings";
    protected String b = "Page 1 of 3";
    protected String c = "Basic Settings";
    protected String[] d = new String[4];
    private f f;
    private ch g;
    private ch h;
    private ch i;
    private ch j;
    private ch k;
    private ch l;
    private ch m;
    private ch v;
    private boolean w;
    private int x;
    private boolean C;
    private final cm D = new cg(this);
    private final h E = new h();
    private h F;
    private final Random G = new Random();

    public cq(cc cc2, String string) {
        this.e = (cs)cc2;
        this.a(string);
    }

    @Override
    public void ct_() {
        int n2 = 0;
        int n3 = 0;
        if (this.f != null) {
            n2 = this.f.b();
            n3 = this.f.m();
        }
        this.a = net.minecraft.client.f.u.a("options.customizeTitle", new Object[0]);
        this.r.clear();
        this.j = this.b(new ch(302, 20, 5, 80, 20, net.minecraft.client.f.u.a("createWorld.customize.custom.prev", new Object[0])));
        this.k = this.b(new ch(303, this.p - 100, 5, 80, 20, net.minecraft.client.f.u.a("createWorld.customize.custom.next", new Object[0])));
        this.i = this.b(new ch(304, this.p / 2 - 187, this.q - 27, 90, 20, net.minecraft.client.f.u.a("createWorld.customize.custom.defaults", new Object[0])));
        this.h = this.b(new ch(301, this.p / 2 - 92, this.q - 27, 90, 20, net.minecraft.client.f.u.a("createWorld.customize.custom.randomize", new Object[0])));
        this.v = this.b(new ch(305, this.p / 2 + 3, this.q - 27, 90, 20, net.minecraft.client.f.u.a("createWorld.customize.custom.presets", new Object[0])));
        this.g = this.b(new ch(300, this.p / 2 + 98, this.q - 27, 90, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.i.k = this.w;
        this.l = new ch(306, this.p / 2 - 55, 160, 50, 20, net.minecraft.client.f.u.a("gui.yes", new Object[0]));
        this.l.l = false;
        this.r.add(this.l);
        this.m = new ch(307, this.p / 2 + 5, 160, 50, 20, net.minecraft.client.f.u.a("gui.no", new Object[0]));
        this.m.l = false;
        this.r.add(this.m);
        if (this.x != 0) {
            this.l.l = true;
            this.m.l = true;
        }
        this.g();
        if (n2 != 0) {
            this.f.b(n2);
            this.f.g(n3);
            this.q();
        }
    }

    @Override
    public void cp_() {
        super.cp_();
        this.f.cr_();
    }

    private void g() {
        ao[] arrao = new ao[]{new w(160, net.minecraft.client.f.u.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0f, 255.0f, this.F.r), new cj(148, net.minecraft.client.f.u.a("createWorld.customize.custom.useCaves", new Object[0]), true, this.F.s), new cj(150, net.minecraft.client.f.u.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.F.v), new cj(151, net.minecraft.client.f.u.a("createWorld.customize.custom.useVillages", new Object[0]), true, this.F.w), new cj(152, net.minecraft.client.f.u.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.F.x), new cj(153, net.minecraft.client.f.u.a("createWorld.customize.custom.useTemples", new Object[0]), true, this.F.y), new cj(210, net.minecraft.client.f.u.a("createWorld.customize.custom.useMonuments", new Object[0]), true, this.F.z), new cj(154, net.minecraft.client.f.u.a("createWorld.customize.custom.useRavines", new Object[0]), true, this.F.A), new cj(149, net.minecraft.client.f.u.a("createWorld.customize.custom.useDungeons", new Object[0]), true, this.F.t), new w(157, net.minecraft.client.f.u.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0f, 100.0f, this.F.u), new cj(155, net.minecraft.client.f.u.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.F.B), new w(158, net.minecraft.client.f.u.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0f, 100.0f, this.F.C), new cj(156, net.minecraft.client.f.u.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.F.D), new w(159, net.minecraft.client.f.u.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0f, 100.0f, this.F.E), new cj(161, net.minecraft.client.f.u.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.F.F), new w(162, net.minecraft.client.f.u.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0f, 37.0f, this.F.G), new w(163, net.minecraft.client.f.u.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0f, 8.0f, this.F.H), new w(164, net.minecraft.client.f.u.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0f, 5.0f, this.F.I)};
        ao[] arrao2 = new ao[66];
        arrao2[0] = new ck(416, net.minecraft.client.f.u.a("tile.dirt.name", new Object[0]), false);
        arrao2[2] = new w(165, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.J);
        arrao2[3] = new w(166, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.K);
        arrao2[4] = new w(167, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.L);
        arrao2[5] = new w(168, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.M);
        arrao2[6] = new ck(417, net.minecraft.client.f.u.a("tile.gravel.name", new Object[0]), false);
        arrao2[8] = new w(169, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.N);
        arrao2[9] = new w(170, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.O);
        arrao2[10] = new w(171, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.P);
        arrao2[11] = new w(172, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.Q);
        arrao2[12] = new ck(418, net.minecraft.client.f.u.a("tile.stone.granite.name", new Object[0]), false);
        arrao2[14] = new w(173, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.R);
        arrao2[15] = new w(174, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.S);
        arrao2[16] = new w(175, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.T);
        arrao2[17] = new w(176, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.U);
        arrao2[18] = new ck(419, net.minecraft.client.f.u.a("tile.stone.diorite.name", new Object[0]), false);
        arrao2[20] = new w(177, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.V);
        arrao2[21] = new w(178, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.W);
        arrao2[22] = new w(179, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.X);
        arrao2[23] = new w(180, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.Y);
        arrao2[24] = new ck(420, net.minecraft.client.f.u.a("tile.stone.andesite.name", new Object[0]), false);
        arrao2[26] = new w(181, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.Z);
        arrao2[27] = new w(182, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.aa);
        arrao2[28] = new w(183, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ab);
        arrao2[29] = new w(184, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ac);
        arrao2[30] = new ck(421, net.minecraft.client.f.u.a("tile.oreCoal.name", new Object[0]), false);
        arrao2[32] = new w(185, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ad);
        arrao2[33] = new w(186, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.ae);
        arrao2[34] = new w(187, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.af);
        arrao2[35] = new w(189, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ag);
        arrao2[36] = new ck(422, net.minecraft.client.f.u.a("tile.oreIron.name", new Object[0]), false);
        arrao2[38] = new w(190, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ah);
        arrao2[39] = new w(191, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.ai);
        arrao2[40] = new w(192, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.aj);
        arrao2[41] = new w(193, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ak);
        arrao2[42] = new ck(423, net.minecraft.client.f.u.a("tile.oreGold.name", new Object[0]), false);
        arrao2[44] = new w(194, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.al);
        arrao2[45] = new w(195, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.am);
        arrao2[46] = new w(196, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.an);
        arrao2[47] = new w(197, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ao);
        arrao2[48] = new ck(424, net.minecraft.client.f.u.a("tile.oreRedstone.name", new Object[0]), false);
        arrao2[50] = new w(198, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ap);
        arrao2[51] = new w(199, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.aq);
        arrao2[52] = new w(200, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.ar);
        arrao2[53] = new w(201, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.as);
        arrao2[54] = new ck(425, net.minecraft.client.f.u.a("tile.oreDiamond.name", new Object[0]), false);
        arrao2[56] = new w(202, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.at);
        arrao2[57] = new w(203, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.au);
        arrao2[58] = new w(204, net.minecraft.client.f.u.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.av);
        arrao2[59] = new w(205, net.minecraft.client.f.u.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.F.aw);
        arrao2[60] = new ck(426, net.minecraft.client.f.u.a("tile.oreLapis.name", new Object[0]), false);
        arrao2[62] = new w(206, net.minecraft.client.f.u.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.F.ax);
        arrao2[63] = new w(207, net.minecraft.client.f.u.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.F.ay);
        arrao2[64] = new w(208, net.minecraft.client.f.u.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0f, 255.0f, this.F.az);
        arrao2[65] = new w(209, net.minecraft.client.f.u.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0f, 255.0f, this.F.aA);
        ao[] arrao3 = arrao2;
        ao[] arrao4 = new ao[]{new w(100, net.minecraft.client.f.u.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0f, 5000.0f, this.F.i), new w(101, net.minecraft.client.f.u.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0f, 5000.0f, this.F.j), new w(102, net.minecraft.client.f.u.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0f, 5000.0f, this.F.k), new w(103, net.minecraft.client.f.u.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0f, 2000.0f, this.F.f), new w(104, net.minecraft.client.f.u.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0f, 2000.0f, this.F.g), new w(105, net.minecraft.client.f.u.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01f, 20.0f, this.F.h), new w(106, net.minecraft.client.f.u.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0f, 25.0f, this.F.l), new w(107, net.minecraft.client.f.u.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0f, 6000.0f, this.F.b), new w(108, net.minecraft.client.f.u.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0f, 6000.0f, this.F.c), new w(109, net.minecraft.client.f.u.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01f, 50.0f, this.F.m), new w(110, net.minecraft.client.f.u.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.F.d), new w(111, net.minecraft.client.f.u.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.F.e), new w(112, net.minecraft.client.f.u.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0f, 20.0f, this.F.n), new w(113, net.minecraft.client.f.u.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0f, 20.0f, this.F.o), new w(114, net.minecraft.client.f.u.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0f, 20.0f, this.F.p), new w(115, net.minecraft.client.f.u.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0f, 20.0f, this.F.q)};
        ao[] arrao5 = new ao[]{new ck(400, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0])) + ":", false), new am(132, String.format("%5.3f", Float.valueOf(this.F.i)), false, this.D), new ck(401, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0])) + ":", false), new am(133, String.format("%5.3f", Float.valueOf(this.F.j)), false, this.D), new ck(402, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0])) + ":", false), new am(134, String.format("%5.3f", Float.valueOf(this.F.k)), false, this.D), new ck(403, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0])) + ":", false), new am(135, String.format("%5.3f", Float.valueOf(this.F.f)), false, this.D), new ck(404, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0])) + ":", false), new am(136, String.format("%5.3f", Float.valueOf(this.F.g)), false, this.D), new ck(405, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0])) + ":", false), new am(137, String.format("%2.3f", Float.valueOf(this.F.h)), false, this.D), new ck(406, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.baseSize", new Object[0])) + ":", false), new am(138, String.format("%2.3f", Float.valueOf(this.F.l)), false, this.D), new ck(407, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.coordinateScale", new Object[0])) + ":", false), new am(139, String.format("%5.3f", Float.valueOf(this.F.b)), false, this.D), new ck(408, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.heightScale", new Object[0])) + ":", false), new am(140, String.format("%5.3f", Float.valueOf(this.F.c)), false, this.D), new ck(409, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.stretchY", new Object[0])) + ":", false), new am(141, String.format("%2.3f", Float.valueOf(this.F.m)), false, this.D), new ck(410, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.upperLimitScale", new Object[0])) + ":", false), new am(142, String.format("%5.3f", Float.valueOf(this.F.d)), false, this.D), new ck(411, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.lowerLimitScale", new Object[0])) + ":", false), new am(143, String.format("%5.3f", Float.valueOf(this.F.e)), false, this.D), new ck(412, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.biomeDepthWeight", new Object[0])) + ":", false), new am(144, String.format("%2.3f", Float.valueOf(this.F.n)), false, this.D), new ck(413, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.biomeDepthOffset", new Object[0])) + ":", false), new am(145, String.format("%2.3f", Float.valueOf(this.F.o)), false, this.D), new ck(414, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.biomeScaleWeight", new Object[0])) + ":", false), new am(146, String.format("%2.3f", Float.valueOf(this.F.p)), false, this.D), new ck(415, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.custom.biomeScaleOffset", new Object[0])) + ":", false), new am(147, String.format("%2.3f", Float.valueOf(this.F.q)), false, this.D)};
        this.f = new f(this.n, this.p, this.q, 32, this.q - 32, 25, this, arrao, arrao3, arrao4, arrao5);
        for (int i2 = 0; i2 < 4; ++i2) {
            this.d[i2] = net.minecraft.client.f.u.a("createWorld.customize.custom.page" + i2, new Object[0]);
        }
        this.q();
    }

    public String f() {
        return this.F.toString().replace("\n", "");
    }

    public void a(String string) {
        this.F = string != null && !string.isEmpty() ? net.minecraft.q.g.h.a(string) : new h();
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
            case 132: {
                f3 = this.F.i = net.minecraft.u.b.n.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 133: {
                f3 = this.F.j = net.minecraft.u.b.n.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 134: {
                f3 = this.F.k = net.minecraft.u.b.n.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 135: {
                f3 = this.F.f = net.minecraft.u.b.n.a(f2, 1.0f, 2000.0f);
                break;
            }
            case 136: {
                f3 = this.F.g = net.minecraft.u.b.n.a(f2, 1.0f, 2000.0f);
                break;
            }
            case 137: {
                f3 = this.F.h = net.minecraft.u.b.n.a(f2, 0.01f, 20.0f);
                break;
            }
            case 138: {
                f3 = this.F.l = net.minecraft.u.b.n.a(f2, 1.0f, 25.0f);
                break;
            }
            case 139: {
                f3 = this.F.b = net.minecraft.u.b.n.a(f2, 1.0f, 6000.0f);
                break;
            }
            case 140: {
                f3 = this.F.c = net.minecraft.u.b.n.a(f2, 1.0f, 6000.0f);
                break;
            }
            case 141: {
                f3 = this.F.m = net.minecraft.u.b.n.a(f2, 0.01f, 50.0f);
                break;
            }
            case 142: {
                f3 = this.F.d = net.minecraft.u.b.n.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 143: {
                f3 = this.F.e = net.minecraft.u.b.n.a(f2, 1.0f, 5000.0f);
                break;
            }
            case 144: {
                f3 = this.F.n = net.minecraft.u.b.n.a(f2, 1.0f, 20.0f);
                break;
            }
            case 145: {
                f3 = this.F.o = net.minecraft.u.b.n.a(f2, 0.0f, 20.0f);
                break;
            }
            case 146: {
                f3 = this.F.p = net.minecraft.u.b.n.a(f2, 1.0f, 20.0f);
                break;
            }
            case 147: {
                f3 = this.F.q = net.minecraft.u.b.n.a(f2, 0.0f, 20.0f);
            }
        }
        if (f3 != f2 && f2 != 0.0f) {
            ((dn)this.f.c(n2)).a(this.b(n2, f3));
        }
        ((bf)this.f.c(n2 - 132 + 100)).a(f3, false);
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }

    private void a(boolean bl2) {
        this.w = bl2;
        this.i.k = bl2;
    }

    @Override
    public String a(int n2, String string, float f2) {
        return String.valueOf(string) + ": " + this.b(n2, f2);
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
            default: {
                return String.format("%d", (int)f2);
            }
            case 162: 
        }
        if (f2 < 0.0f) {
            return net.minecraft.client.f.u.a("gui.all", new Object[0]);
        }
        if ((int)f2 >= net.minecraft.q.b.q.a(net.minecraft.a.i.j)) {
            q q2 = net.minecraft.q.b.q.a((int)f2 + 2);
            return q2 != null ? q2.l() : "?";
        }
        q q3 = net.minecraft.q.b.q.a((int)f2);
        return q3 != null ? q3.l() : "?";
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
                break;
            }
            case 210: {
                this.F.z = bl2;
            }
        }
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }

    @Override
    public void a(int n2, float f2) {
        de de2;
        switch (n2) {
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
            case 106: {
                this.F.l = f2;
                break;
            }
            case 107: {
                this.F.b = f2;
                break;
            }
            case 108: {
                this.F.c = f2;
                break;
            }
            case 109: {
                this.F.m = f2;
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
            }
            default: {
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
            case 165: {
                this.F.J = (int)f2;
                break;
            }
            case 166: {
                this.F.K = (int)f2;
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
            case 169: {
                this.F.N = (int)f2;
                break;
            }
            case 170: {
                this.F.O = (int)f2;
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
            case 173: {
                this.F.R = (int)f2;
                break;
            }
            case 174: {
                this.F.S = (int)f2;
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
            case 177: {
                this.F.V = (int)f2;
                break;
            }
            case 178: {
                this.F.W = (int)f2;
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
            case 181: {
                this.F.Z = (int)f2;
                break;
            }
            case 182: {
                this.F.aa = (int)f2;
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
            case 185: {
                this.F.ad = (int)f2;
                break;
            }
            case 186: {
                this.F.ae = (int)f2;
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
            case 190: {
                this.F.ah = (int)f2;
                break;
            }
            case 191: {
                this.F.ai = (int)f2;
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
            case 194: {
                this.F.al = (int)f2;
                break;
            }
            case 195: {
                this.F.am = (int)f2;
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
            case 198: {
                this.F.ap = (int)f2;
                break;
            }
            case 199: {
                this.F.aq = (int)f2;
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
            case 202: {
                this.F.at = (int)f2;
                break;
            }
            case 203: {
                this.F.au = (int)f2;
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
            case 206: {
                this.F.ax = (int)f2;
                break;
            }
            case 207: {
                this.F.ay = (int)f2;
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
        if (n2 >= 100 && n2 < 116 && (de2 = this.f.c(n2 - 100 + 132)) != null) {
            ((dn)de2).a(this.b(n2, f2));
        }
        if (!this.F.equals(this.E)) {
            this.a(true);
        }
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            switch (ch2.j) {
                case 300: {
                    this.e.a = this.F.toString();
                    this.n.a(this.e);
                    break;
                }
                case 301: {
                    for (int i2 = 0; i2 < this.f.a(); ++i2) {
                        de de2;
                        bi bi2 = this.f.d(i2);
                        de de3 = bi2.a();
                        if (de3 instanceof ch) {
                            de2 = (ch)de3;
                            if (de2 instanceof bf) {
                                float f2 = ((bf)de2).b() * (0.75f + this.G.nextFloat() * 0.5f) + (this.G.nextFloat() * 0.1f - 0.05f);
                                ((bf)de2).a(net.minecraft.u.b.n.a(f2, 0.0f, 1.0f));
                            } else if (de2 instanceof o) {
                                ((o)de2).a(this.G.nextBoolean());
                            }
                        }
                        if (!((de2 = bi2.b()) instanceof ch)) continue;
                        de de4 = de2;
                        if (de4 instanceof bf) {
                            float f3 = ((bf)de4).b() * (0.75f + this.G.nextFloat() * 0.5f) + (this.G.nextFloat() * 0.1f - 0.05f);
                            ((bf)de4).a(net.minecraft.u.b.n.a(f3, 0.0f, 1.0f));
                            continue;
                        }
                        if (!(de4 instanceof o)) continue;
                        ((o)de4).a(this.G.nextBoolean());
                    }
                    return;
                }
                case 302: {
                    this.f.g();
                    this.q();
                    break;
                }
                case 303: {
                    this.f.h();
                    this.q();
                    break;
                }
                case 304: {
                    if (!this.w) break;
                    this.a(304);
                    break;
                }
                case 305: {
                    this.n.a(new c(this));
                    break;
                }
                case 306: {
                    this.i();
                    break;
                }
                case 307: {
                    this.x = 0;
                    this.i();
                }
            }
        }
    }

    private void h() {
        this.F.a();
        this.g();
        this.a(false);
    }

    private void a(int n2) {
        this.x = n2;
        this.b(true);
    }

    private void i() {
        switch (this.x) {
            case 300: {
                this.a((o)this.f.c(300));
                break;
            }
            case 304: {
                this.h();
            }
        }
        this.x = 0;
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
        this.i.k = this.w && !bl2;
        this.v.k = !bl2;
        this.f.a(!bl2);
    }

    private void q() {
        this.j.k = this.f.b() != 0;
        this.k.k = this.f.b() != this.f.e() - 1;
        this.b = net.minecraft.client.f.u.a("book.pageIndicator", this.f.b() + 1, this.f.e());
        this.c = this.d[this.f.b()];
        this.h.k = this.f.b() != this.f.e() - 1;
    }

    @Override
    protected void a(char c2, int n2) {
        super.a(c2, n2);
        if (this.x == 0) {
            switch (n2) {
                case 200: {
                    this.a(1.0f);
                    break;
                }
                case 208: {
                    this.a(-1.0f);
                    break;
                }
                default: {
                    this.f.a(c2, n2);
                }
            }
        }
    }

    private void a(float f2) {
        de de2 = this.f.f();
        if (de2 instanceof dn) {
            dn dn2;
            Float f3;
            float f4 = f2;
            if (cc.o()) {
                f4 = f2 * 0.1f;
                if (cc.n()) {
                    f4 *= 0.1f;
                }
            } else if (cc.n()) {
                f4 = f2 * 10.0f;
                if (cc.p()) {
                    f4 *= 10.0f;
                }
            }
            if ((f3 = com.a.a.l.m.a((dn2 = (dn)de2).b())) != null) {
                f3 = Float.valueOf(f3.floatValue() + f4);
                int n2 = dn2.d();
                String string = this.b(dn2.d(), f3.floatValue());
                dn2.a(string);
                this.a(n2, string);
            }
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.x == 0 && !this.C) {
            this.f.a(n2, n3, n4);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        if (this.C) {
            this.C = false;
        } else if (this.x == 0) {
            this.f.c(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.f.a(n2, n3, f2);
        this.a(this.u, this.a, this.p / 2, 2, 0xFFFFFF);
        this.a(this.u, this.b, this.p / 2, 12, 0xFFFFFF);
        this.a(this.u, this.c, this.p / 2, 22, 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.x != 0) {
            cq.a(0, 0, this.p, this.q, Integer.MIN_VALUE);
            this.a(this.p / 2 - 91, this.p / 2 + 90, 99, -2039584);
            this.a(this.p / 2 - 91, this.p / 2 + 90, 185, -6250336);
            this.b(this.p / 2 - 91, 99, 185, -2039584);
            this.b(this.p / 2 + 90, 99, 185, -6250336);
            float f3 = 85.0f;
            float f4 = 180.0f;
            bd.f();
            bd.o();
            ci ci2 = ci.a();
            g g2 = ci2.c();
            this.n.N().a(y);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            float f5 = 32.0f;
            g2.a(7, net.minecraft.client.g.d.b.i);
            g2.b((double)(this.p / 2 - 90), 185.0, 0.0).a(0.0, 2.65625).b(64, 64, 64, 64).d();
            g2.b((double)(this.p / 2 + 90), 185.0, 0.0).a(5.625, 2.65625).b(64, 64, 64, 64).d();
            g2.b((double)(this.p / 2 + 90), 100.0, 0.0).a(5.625, 0.0).b(64, 64, 64, 64).d();
            g2.b((double)(this.p / 2 - 90), 100.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 64).d();
            ci2.b();
            this.a(this.u, net.minecraft.client.f.u.a("createWorld.customize.custom.confirmTitle", new Object[0]), this.p / 2, 105, 0xFFFFFF);
            this.a(this.u, net.minecraft.client.f.u.a("createWorld.customize.custom.confirm1", new Object[0]), this.p / 2, 125, 0xFFFFFF);
            this.a(this.u, net.minecraft.client.f.u.a("createWorld.customize.custom.confirm2", new Object[0]), this.p / 2, 135, 0xFFFFFF);
            this.l.c(this.n, n2, n3);
            this.m.c(this.n, n2, n3);
        }
    }
}

