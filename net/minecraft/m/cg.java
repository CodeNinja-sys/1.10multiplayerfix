/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.io;
import com.a.a.d.sz;
import com.a.a.d.vi;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.m.a;
import net.minecraft.m.ab;
import net.minecraft.m.ac;
import net.minecraft.m.ae;
import net.minecraft.m.af;
import net.minecraft.m.ag;
import net.minecraft.m.ah;
import net.minecraft.m.ai;
import net.minecraft.m.ak;
import net.minecraft.m.al;
import net.minecraft.m.an;
import net.minecraft.m.ao;
import net.minecraft.m.ap;
import net.minecraft.m.aq;
import net.minecraft.m.ar;
import net.minecraft.m.as;
import net.minecraft.m.au;
import net.minecraft.m.av;
import net.minecraft.m.aw;
import net.minecraft.m.ax;
import net.minecraft.m.az;
import net.minecraft.m.b;
import net.minecraft.m.ba;
import net.minecraft.m.bb;
import net.minecraft.m.be;
import net.minecraft.m.bf;
import net.minecraft.m.bg;
import net.minecraft.m.bh;
import net.minecraft.m.bi;
import net.minecraft.m.bj;
import net.minecraft.m.bk;
import net.minecraft.m.bl;
import net.minecraft.m.bm;
import net.minecraft.m.bn;
import net.minecraft.m.bo;
import net.minecraft.m.bp;
import net.minecraft.m.br;
import net.minecraft.m.bs;
import net.minecraft.m.bt;
import net.minecraft.m.bu;
import net.minecraft.m.bv;
import net.minecraft.m.bw;
import net.minecraft.m.bx;
import net.minecraft.m.by;
import net.minecraft.m.bz;
import net.minecraft.m.c;
import net.minecraft.m.ca;
import net.minecraft.m.cb;
import net.minecraft.m.cc;
import net.minecraft.m.ce;
import net.minecraft.m.cf;
import net.minecraft.m.ch;
import net.minecraft.m.ci;
import net.minecraft.m.cj;
import net.minecraft.m.ck;
import net.minecraft.m.cl;
import net.minecraft.m.cm;
import net.minecraft.m.cn;
import net.minecraft.m.cp;
import net.minecraft.m.cq;
import net.minecraft.m.cr;
import net.minecraft.m.cs;
import net.minecraft.m.ct;
import net.minecraft.m.cu;
import net.minecraft.m.cv;
import net.minecraft.m.cw;
import net.minecraft.m.cx;
import net.minecraft.m.cy;
import net.minecraft.m.cz;
import net.minecraft.m.d;
import net.minecraft.m.da;
import net.minecraft.m.db;
import net.minecraft.m.dc;
import net.minecraft.m.dd;
import net.minecraft.m.de;
import net.minecraft.m.df;
import net.minecraft.m.dh;
import net.minecraft.m.di;
import net.minecraft.m.dj;
import net.minecraft.m.dk;
import net.minecraft.m.dl;
import net.minecraft.m.dn;
import net.minecraft.m.do;
import net.minecraft.m.e;
import net.minecraft.m.f;
import net.minecraft.m.g;
import net.minecraft.m.h;
import net.minecraft.m.j;
import net.minecraft.m.k;
import net.minecraft.m.l;
import net.minecraft.m.m;
import net.minecraft.m.n;
import net.minecraft.m.o;
import net.minecraft.m.p;
import net.minecraft.m.q;
import net.minecraft.m.r;
import net.minecraft.m.s;
import net.minecraft.m.u;
import net.minecraft.m.v;
import net.minecraft.m.w;
import net.minecraft.m.x;
import net.minecraft.m.y;
import net.minecraft.u.ad;
import net.minecraft.w.f.t;

public class cg {
    public static final net.minecraft.u.c.c e = new net.minecraft.u.c.c();
    private static final Map a = sz.c();
    private static final cy b = new dh();
    private static final cy c = new cr();
    private static final cy d = new cp();
    private static final cy l = new cf();
    private final net.minecraft.u.c.a m = new net.minecraft.u.c.e();
    protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    protected static final UUID g = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
    private net.minecraft.v.d n;
    protected static Random h = new Random();
    protected int i = 64;
    private int o;
    protected boolean j;
    protected boolean k;
    private cg p;
    private String q;

    public static int a(cg cg2) {
        return cg2 == null ? 0 : e.d(cg2);
    }

    public static cg c(int n2) {
        return (cg)e.a(n2);
    }

    public static cg a(net.minecraft.g.cn cn2) {
        return (cg)a.get(cn2);
    }

    public static cg c(String string) {
        cg cg2 = (cg)e.a(new net.minecraft.u.bp(string));
        if (cg2 == null) {
            try {
                return cg.c(Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return cg2;
    }

    public final void a(net.minecraft.u.bp bp2, cy cy2) {
        this.m.a(bp2, cy2);
    }

    public cy a(net.minecraft.u.bp bp2) {
        return (cy)this.m.a(bp2);
    }

    public boolean h() {
        return !this.m.c().isEmpty();
    }

    public boolean a(net.minecraft.e.e e2) {
        return false;
    }

    public cg() {
        this.a(new net.minecraft.u.bp("lefthanded"), d);
        this.a(new net.minecraft.u.bp("cooldown"), l);
    }

    public cg d(int n2) {
        this.i = n2;
        return this;
    }

    public net.minecraft.u.ab a(cu cu2, net.minecraft.w.a.b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3, net.minecraft.u.ah ah2, ad ad2, float f2, float f3, float f4) {
        return net.minecraft.u.ab.b;
    }

    public float a(cu cu2, net.minecraft.g.c.b b2) {
        return 1.0f;
    }

    public net.minecraft.u.a a(cu cu2, net.minecraft.q.k k2, net.minecraft.w.a.b b2, net.minecraft.u.ah ah2) {
        return new net.minecraft.u.a(net.minecraft.u.ab.b, cu2);
    }

    public cu a(cu cu2, net.minecraft.q.k k2, net.minecraft.w.l l2) {
        return cu2;
    }

    public int i() {
        return this.i;
    }

    public int a(int n2) {
        return 0;
    }

    public boolean j() {
        return this.k;
    }

    protected cg a(boolean bl2) {
        this.k = bl2;
        return this;
    }

    public int k() {
        return this.o;
    }

    protected cg e(int n2) {
        this.o = n2;
        if (n2 > 0) {
            this.a(new net.minecraft.u.bp("damaged"), b);
            this.a(new net.minecraft.u.bp("damage"), c);
        }
        return this;
    }

    public boolean l() {
        return this.o > 0 && (!this.k || this.i == 1);
    }

    public boolean a(cu cu2, net.minecraft.w.l l2, net.minecraft.w.l l3) {
        return false;
    }

    public boolean a(cu cu2, net.minecraft.q.k k2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, net.minecraft.w.l l2) {
        return false;
    }

    public boolean a(net.minecraft.g.c.b b2) {
        return false;
    }

    public boolean a(cu cu2, net.minecraft.w.a.b b2, net.minecraft.w.l l2, net.minecraft.u.ah ah2) {
        return false;
    }

    public cg m() {
        this.j = true;
        return this;
    }

    public boolean c() {
        return this.j;
    }

    public boolean n() {
        return false;
    }

    public cg b(String string) {
        this.q = string;
        return this;
    }

    public String j(cu cu2) {
        String string = this.d(cu2);
        return string == null ? "" : net.minecraft.u.d.b.a.a(string);
    }

    public String cw_() {
        return "item." + this.q;
    }

    public String d(cu cu2) {
        return "item." + this.q;
    }

    public cg b(cg cg2) {
        this.p = cg2;
        return this;
    }

    public boolean o() {
        return true;
    }

    public cg p() {
        return this.p;
    }

    public boolean q() {
        return this.p != null;
    }

    public void a(cu cu2, net.minecraft.q.k k2, net.minecraft.w.n n2, int n3, boolean bl2) {
    }

    public void b(cu cu2, net.minecraft.q.k k2, net.minecraft.w.a.b b2) {
    }

    public boolean b() {
        return false;
    }

    public av b(cu cu2) {
        return av.a;
    }

    public int c(cu cu2) {
        return 0;
    }

    public void a(cu cu2, net.minecraft.q.k k2, net.minecraft.w.l l2, int n2) {
    }

    public void a(cu cu2, net.minecraft.w.a.b b2, List list, boolean bl2) {
    }

    public String a(cu cu2) {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.j(cu2)) + ".name").trim();
    }

    public boolean e(cu cu2) {
        return cu2.w();
    }

    public dd f(cu cu2) {
        return cu2.w() ? dd.c : dd.a;
    }

    public boolean g(cu cu2) {
        return this.i() == 1 && this.l();
    }

    protected net.minecraft.u.b.o a(net.minecraft.q.k k2, net.minecraft.w.a.b b2, boolean bl2) {
        float f2 = b2.bb;
        float f3 = b2.ba;
        double d2 = b2.aU;
        double d3 = b2.aV + (double)b2.ce_();
        double d4 = b2.aW;
        net.minecraft.u.b.s s2 = new net.minecraft.u.b.s(d2, d3, d4);
        float f4 = net.minecraft.u.b.n.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = net.minecraft.u.b.n.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -net.minecraft.u.b.n.b(-f2 * ((float)Math.PI / 180));
        float f7 = net.minecraft.u.b.n.a(-f2 * ((float)Math.PI / 180));
        float f8 = f5 * f6;
        float f9 = f4 * f6;
        double d5 = 5.0;
        net.minecraft.u.b.s s3 = s2.b((double)f8 * 5.0, (double)f7 * 5.0, (double)f9 * 5.0);
        return k2.a(s2, s3, bl2, !bl2, false);
    }

    public int cx_() {
        return 0;
    }

    public void a(cg cg2, net.minecraft.v.d d2, List list) {
        list.add(new cu(cg2));
    }

    public net.minecraft.v.d a() {
        return this.n;
    }

    public cg a(net.minecraft.v.d d2) {
        this.n = d2;
        return this;
    }

    public boolean r() {
        return false;
    }

    public boolean a(cu cu2, cu cu3) {
        return false;
    }

    public vi a(net.minecraft.h.k k2) {
        return io.v();
    }

    public static void s() {
        cg.a(net.minecraft.a.p.b, new da(net.minecraft.a.p.b, net.minecraft.a.p.b, new cn()).a("stone"));
        cg.a(net.minecraft.a.p.c, new ah(net.minecraft.a.p.c, false));
        cg.a(net.minecraft.a.p.d, new da(net.minecraft.a.p.d, net.minecraft.a.p.d, new cw()).a("dirt"));
        cg.b(net.minecraft.a.p.e);
        cg.a(net.minecraft.a.p.f, new da(net.minecraft.a.p.f, net.minecraft.a.p.f, new db()).a("wood"));
        cg.a(net.minecraft.a.p.g, new da(net.minecraft.a.p.g, net.minecraft.a.p.g, new df()).a("sapling"));
        cg.b(net.minecraft.a.p.h);
        cg.a(net.minecraft.a.p.m, new da((net.minecraft.g.cn)net.minecraft.a.p.m, (net.minecraft.g.cn)net.minecraft.a.p.m, new cx()).a("sand"));
        cg.b(net.minecraft.a.p.n);
        cg.b(net.minecraft.a.p.o);
        cg.b(net.minecraft.a.p.p);
        cg.b(net.minecraft.a.p.q);
        cg.a(net.minecraft.a.p.r, new da(net.minecraft.a.p.r, net.minecraft.a.p.r, new b()).a("log"));
        cg.a(net.minecraft.a.p.s, new da(net.minecraft.a.p.s, net.minecraft.a.p.s, new bg()).a("log"));
        cg.a(net.minecraft.a.p.t, new l(net.minecraft.a.p.t).a("leaves"));
        cg.a(net.minecraft.a.p.u, new l(net.minecraft.a.p.u).a("leaves"));
        cg.a(net.minecraft.a.p.v, new da(net.minecraft.a.p.v, net.minecraft.a.p.v, new bs()).a("sponge"));
        cg.b(net.minecraft.a.p.w);
        cg.b(net.minecraft.a.p.x);
        cg.b(net.minecraft.a.p.y);
        cg.b(net.minecraft.a.p.z);
        cg.a(net.minecraft.a.p.A, new da(net.minecraft.a.p.A, net.minecraft.a.p.A, new bo()).a("sandStone"));
        cg.b(net.minecraft.a.p.B);
        cg.b(net.minecraft.a.p.D);
        cg.b(net.minecraft.a.p.E);
        cg.a(net.minecraft.a.p.F, new be(net.minecraft.a.p.F));
        cg.b(net.minecraft.a.p.G);
        cg.a(net.minecraft.a.p.H, new ah(net.minecraft.a.p.H, true).a(new String[]{"shrub", "grass", "fern"}));
        cg.b(net.minecraft.a.p.I);
        cg.a(net.minecraft.a.p.J, new be(net.minecraft.a.p.J));
        cg.a(net.minecraft.a.p.L, new cs(net.minecraft.a.p.L).a("cloth"));
        cg.a(net.minecraft.a.p.N, new da((net.minecraft.g.cn)net.minecraft.a.p.N, (net.minecraft.g.cn)net.minecraft.a.p.N, new ag()).a("flower"));
        cg.a(net.minecraft.a.p.O, new da((net.minecraft.g.cn)net.minecraft.a.p.O, (net.minecraft.g.cn)net.minecraft.a.p.O, new dj()).a("rose"));
        cg.b(net.minecraft.a.p.P);
        cg.b(net.minecraft.a.p.Q);
        cg.b(net.minecraft.a.p.R);
        cg.b(net.minecraft.a.p.S);
        cg.a(net.minecraft.a.p.U, new ai(net.minecraft.a.p.U, net.minecraft.a.p.U, net.minecraft.a.p.T).a("stoneSlab"));
        cg.b(net.minecraft.a.p.V);
        cg.b(net.minecraft.a.p.W);
        cg.b(net.minecraft.a.p.X);
        cg.b(net.minecraft.a.p.Y);
        cg.b(net.minecraft.a.p.Z);
        cg.b(net.minecraft.a.p.aa);
        cg.b(net.minecraft.a.p.cQ);
        cg.b(net.minecraft.a.p.cR);
        cg.b(net.minecraft.a.p.cS);
        cg.b(net.minecraft.a.p.cT);
        cg.b(net.minecraft.a.p.cU);
        cg.b(net.minecraft.a.p.cV);
        cg.a(net.minecraft.a.p.cX, new ai(net.minecraft.a.p.cX, net.minecraft.a.p.cX, net.minecraft.a.p.cW).a("purpurSlab"));
        cg.b(net.minecraft.a.p.ac);
        cg.b(net.minecraft.a.p.ad);
        cg.b(net.minecraft.a.p.ae);
        cg.b(net.minecraft.a.p.ag);
        cg.b(net.minecraft.a.p.ah);
        cg.b(net.minecraft.a.p.ai);
        cg.b(net.minecraft.a.p.ak);
        cg.b(net.minecraft.a.p.al);
        cg.b(net.minecraft.a.p.au);
        cg.b(net.minecraft.a.p.av);
        cg.b(net.minecraft.a.p.aw);
        cg.b(net.minecraft.a.p.ay);
        cg.b(net.minecraft.a.p.az);
        cg.b(net.minecraft.a.p.aB);
        cg.b(net.minecraft.a.p.aC);
        cg.b(net.minecraft.a.p.aF);
        cg.b(net.minecraft.a.p.aG);
        cg.a(net.minecraft.a.p.aH, new dl(net.minecraft.a.p.aH));
        cg.b(net.minecraft.a.p.aI);
        cg.b(net.minecraft.a.p.aJ);
        cg.b(net.minecraft.a.p.aK);
        cg.b(net.minecraft.a.p.aL);
        cg.b(net.minecraft.a.p.aN);
        cg.b(net.minecraft.a.p.aO);
        cg.b(net.minecraft.a.p.aP);
        cg.b(net.minecraft.a.p.aQ);
        cg.b(net.minecraft.a.p.aR);
        cg.b(net.minecraft.a.p.aS);
        cg.b(net.minecraft.a.p.aT);
        cg.b(net.minecraft.a.p.aU);
        cg.b(net.minecraft.a.p.aV);
        cg.b(net.minecraft.a.p.aW);
        cg.b(net.minecraft.a.p.aX);
        cg.b(net.minecraft.a.p.aZ);
        cg.b(net.minecraft.a.p.bd);
        cg.a(net.minecraft.a.p.be, new da(net.minecraft.a.p.be, net.minecraft.a.p.be, new bi()).a("monsterStoneEgg"));
        cg.a(net.minecraft.a.p.bf, new da(net.minecraft.a.p.bf, net.minecraft.a.p.bf, new ab()).a("stonebricksmooth"));
        cg.b(net.minecraft.a.p.bg);
        cg.b(net.minecraft.a.p.bh);
        cg.b(net.minecraft.a.p.bi);
        cg.b(net.minecraft.a.p.bj);
        cg.b(net.minecraft.a.p.bk);
        cg.a(net.minecraft.a.p.bn, new ah(net.minecraft.a.p.bn, false));
        cg.b(net.minecraft.a.p.bo);
        cg.b(net.minecraft.a.p.bp);
        cg.b(net.minecraft.a.p.bq);
        cg.b(net.minecraft.a.p.br);
        cg.b(net.minecraft.a.p.bs);
        cg.b(net.minecraft.a.p.bt);
        cg.b(net.minecraft.a.p.bu);
        cg.b(net.minecraft.a.p.bv);
        cg.b(net.minecraft.a.p.bw);
        cg.a(net.minecraft.a.p.bx, new r(net.minecraft.a.p.bx));
        cg.b(net.minecraft.a.p.by);
        cg.b(net.minecraft.a.p.bz);
        cg.b(net.minecraft.a.p.bA);
        cg.b(net.minecraft.a.p.bC);
        cg.b(net.minecraft.a.p.bG);
        cg.b(net.minecraft.a.p.bH);
        cg.b(net.minecraft.a.p.cY);
        cg.b(net.minecraft.a.p.bI);
        cg.b(net.minecraft.a.p.bJ);
        cg.a(net.minecraft.a.p.bM, new ai(net.minecraft.a.p.bM, net.minecraft.a.p.bM, net.minecraft.a.p.bL).a("woodSlab"));
        cg.b(net.minecraft.a.p.bO);
        cg.b(net.minecraft.a.p.bP);
        cg.b(net.minecraft.a.p.bQ);
        cg.b(net.minecraft.a.p.bR);
        cg.b(net.minecraft.a.p.bT);
        cg.b(net.minecraft.a.p.bU);
        cg.b(net.minecraft.a.p.bV);
        cg.b(net.minecraft.a.p.bW);
        cg.b(net.minecraft.a.p.bX);
        cg.b(net.minecraft.a.p.bY);
        cg.a(net.minecraft.a.p.bZ, new da(net.minecraft.a.p.bZ, net.minecraft.a.p.bZ, new bl()).a("cobbleWall"));
        cg.b(net.minecraft.a.p.cd);
        cg.a(net.minecraft.a.p.cf, new bx(net.minecraft.a.p.cf).a("anvil"));
        cg.b(net.minecraft.a.p.cg);
        cg.b(net.minecraft.a.p.ch);
        cg.b(net.minecraft.a.p.ci);
        cg.b(net.minecraft.a.p.cl);
        cg.b(net.minecraft.a.p.cn);
        cg.b(net.minecraft.a.p.co);
        cg.b(net.minecraft.a.p.cp);
        cg.a(net.minecraft.a.p.cq, new da(net.minecraft.a.p.cq, net.minecraft.a.p.cq, new String[]{"default", "chiseled", "lines"}).a("quartzBlock"));
        cg.b(net.minecraft.a.p.cr);
        cg.b(net.minecraft.a.p.cs);
        cg.b(net.minecraft.a.p.ct);
        cg.a(net.minecraft.a.p.cu, new cs(net.minecraft.a.p.cu).a("clayHardenedStained"));
        cg.b(net.minecraft.a.p.cv);
        cg.b(net.minecraft.a.p.cw);
        cg.b(net.minecraft.a.p.cx);
        cg.a(net.minecraft.a.p.cy, new cs(net.minecraft.a.p.cy).a("woolCarpet"));
        cg.b(net.minecraft.a.p.cz);
        cg.b(net.minecraft.a.p.cA);
        cg.b(net.minecraft.a.p.cB);
        cg.b(net.minecraft.a.p.cC);
        cg.b(net.minecraft.a.p.cD);
        cg.b(net.minecraft.a.p.cE);
        cg.b(net.minecraft.a.p.da);
        cg.a(net.minecraft.a.p.cF, new da((net.minecraft.g.cn)net.minecraft.a.p.cF, (net.minecraft.g.cn)net.minecraft.a.p.cF, new q()).a("doublePlant"));
        cg.a(net.minecraft.a.p.cG, new cs(net.minecraft.a.p.cG).a("stainedGlass"));
        cg.a(net.minecraft.a.p.cH, new cs(net.minecraft.a.p.cH).a("stainedGlassPane"));
        cg.a(net.minecraft.a.p.cI, new da(net.minecraft.a.p.cI, net.minecraft.a.p.cI, new ap()).a("prismarine"));
        cg.b(net.minecraft.a.p.cJ);
        cg.a(net.minecraft.a.p.cM, new da(net.minecraft.a.p.cM, net.minecraft.a.p.cM, new k()).a("redSandStone"));
        cg.b(net.minecraft.a.p.cN);
        cg.a(net.minecraft.a.p.cP, new ai(net.minecraft.a.p.cP, net.minecraft.a.p.cP, net.minecraft.a.p.cO).a("stoneSlab2"));
        cg.b(net.minecraft.a.p.dc);
        cg.b(net.minecraft.a.p.dd);
        cg.b(net.minecraft.a.p.df);
        cg.b(net.minecraft.a.p.dg);
        cg.b(net.minecraft.a.p.dh);
        cg.b(net.minecraft.a.p.di);
        cg.b(net.minecraft.a.p.dj);
        cg.b(net.minecraft.a.p.dk);
        cg.a(256, "iron_shovel", new u(net.minecraft.m.p.c).b("shovelIron"));
        cg.a(257, "iron_pickaxe", new ba(net.minecraft.m.p.c).b("pickaxeIron"));
        cg.a(258, "iron_axe", new n(net.minecraft.m.p.c).b("hatchetIron"));
        cg.a(259, "flint_and_steel", new v().b("flintAndSteel"));
        cg.a(260, "apple", new cb(4, 0.3f, false).b("apple"));
        cg.a(261, "bow", new bn().b("bow"));
        cg.a(262, "arrow", new j().b("arrow"));
        cg.a(263, "coal", new cq().b("coal"));
        cg.a(264, "diamond", new cg().b("diamond").a(net.minecraft.v.d.l));
        cg.a(265, "iron_ingot", new cg().b("ingotIron").a(net.minecraft.v.d.l));
        cg.a(266, "gold_ingot", new cg().b("ingotGold").a(net.minecraft.v.d.l));
        cg.a(267, "iron_sword", new ca(net.minecraft.m.p.c).b("swordIron"));
        cg.a(268, "wooden_sword", new ca(net.minecraft.m.p.a).b("swordWood"));
        cg.a(269, "wooden_shovel", new u(net.minecraft.m.p.a).b("shovelWood"));
        cg.a(270, "wooden_pickaxe", new ba(net.minecraft.m.p.a).b("pickaxeWood"));
        cg.a(271, "wooden_axe", new n(net.minecraft.m.p.a).b("hatchetWood"));
        cg.a(272, "stone_sword", new ca(net.minecraft.m.p.b).b("swordStone"));
        cg.a(273, "stone_shovel", new u(net.minecraft.m.p.b).b("shovelStone"));
        cg.a(274, "stone_pickaxe", new ba(net.minecraft.m.p.b).b("pickaxeStone"));
        cg.a(275, "stone_axe", new n(net.minecraft.m.p.b).b("hatchetStone"));
        cg.a(276, "diamond_sword", new ca(net.minecraft.m.p.d).b("swordDiamond"));
        cg.a(277, "diamond_shovel", new u(net.minecraft.m.p.d).b("shovelDiamond"));
        cg.a(278, "diamond_pickaxe", new ba(net.minecraft.m.p.d).b("pickaxeDiamond"));
        cg.a(279, "diamond_axe", new n(net.minecraft.m.p.d).b("hatchetDiamond"));
        cg.a(280, "stick", new cg().m().b("stick").a(net.minecraft.v.d.l));
        cg.a(281, "bowl", new cg().b("bowl").a(net.minecraft.v.d.l));
        cg.a(282, "mushroom_stew", new bt(6).b("mushroomStew"));
        cg.a(283, "golden_sword", new ca(net.minecraft.m.p.e).b("swordGold"));
        cg.a(284, "golden_shovel", new u(net.minecraft.m.p.e).b("shovelGold"));
        cg.a(285, "golden_pickaxe", new ba(net.minecraft.m.p.e).b("pickaxeGold"));
        cg.a(286, "golden_axe", new n(net.minecraft.m.p.e).b("hatchetGold"));
        cg.a(287, "string", new a(net.minecraft.a.p.bS).b("string").a(net.minecraft.v.d.l));
        cg.a(288, "feather", new cg().b("feather").a(net.minecraft.v.d.l));
        cg.a(289, "gunpowder", new cg().b("sulphur").a(net.minecraft.v.d.l));
        cg.a(290, "wooden_hoe", new ac(net.minecraft.m.p.a).b("hoeWood"));
        cg.a(291, "stone_hoe", new ac(net.minecraft.m.p.b).b("hoeStone"));
        cg.a(292, "iron_hoe", new ac(net.minecraft.m.p.c).b("hoeIron"));
        cg.a(293, "diamond_hoe", new ac(net.minecraft.m.p.d).b("hoeDiamond"));
        cg.a(294, "golden_hoe", new ac(net.minecraft.m.p.e).b("hoeGold"));
        cg.a(295, "wheat_seeds", new ax(net.minecraft.a.p.aj, net.minecraft.a.p.ak).b("seeds"));
        cg.a(296, "wheat", new cg().b("wheat").a(net.minecraft.v.d.l));
        cg.a(297, "bread", new cb(5, 0.6f, false).b("bread"));
        cg.a(298, "leather_helmet", new dn(br.a, 0, net.minecraft.h.k.f).b("helmetCloth"));
        cg.a(299, "leather_chestplate", new dn(br.a, 0, net.minecraft.h.k.e).b("chestplateCloth"));
        cg.a(300, "leather_leggings", new dn(br.a, 0, net.minecraft.h.k.d).b("leggingsCloth"));
        cg.a(301, "leather_boots", new dn(br.a, 0, net.minecraft.h.k.c).b("bootsCloth"));
        cg.a(302, "chainmail_helmet", new dn(br.b, 1, net.minecraft.h.k.f).b("helmetChain"));
        cg.a(303, "chainmail_chestplate", new dn(br.b, 1, net.minecraft.h.k.e).b("chestplateChain"));
        cg.a(304, "chainmail_leggings", new dn(br.b, 1, net.minecraft.h.k.d).b("leggingsChain"));
        cg.a(305, "chainmail_boots", new dn(br.b, 1, net.minecraft.h.k.c).b("bootsChain"));
        cg.a(306, "iron_helmet", new dn(br.c, 2, net.minecraft.h.k.f).b("helmetIron"));
        cg.a(307, "iron_chestplate", new dn(br.c, 2, net.minecraft.h.k.e).b("chestplateIron"));
        cg.a(308, "iron_leggings", new dn(br.c, 2, net.minecraft.h.k.d).b("leggingsIron"));
        cg.a(309, "iron_boots", new dn(br.c, 2, net.minecraft.h.k.c).b("bootsIron"));
        cg.a(310, "diamond_helmet", new dn(br.e, 3, net.minecraft.h.k.f).b("helmetDiamond"));
        cg.a(311, "diamond_chestplate", new dn(br.e, 3, net.minecraft.h.k.e).b("chestplateDiamond"));
        cg.a(312, "diamond_leggings", new dn(br.e, 3, net.minecraft.h.k.d).b("leggingsDiamond"));
        cg.a(313, "diamond_boots", new dn(br.e, 3, net.minecraft.h.k.c).b("bootsDiamond"));
        cg.a(314, "golden_helmet", new dn(br.d, 4, net.minecraft.h.k.f).b("helmetGold"));
        cg.a(315, "golden_chestplate", new dn(br.d, 4, net.minecraft.h.k.e).b("chestplateGold"));
        cg.a(316, "golden_leggings", new dn(br.d, 4, net.minecraft.h.k.d).b("leggingsGold"));
        cg.a(317, "golden_boots", new dn(br.d, 4, net.minecraft.h.k.c).b("bootsGold"));
        cg.a(318, "flint", new cg().b("flint").a(net.minecraft.v.d.l));
        cg.a(319, "porkchop", new cb(3, 0.3f, true).b("porkchopRaw"));
        cg.a(320, "cooked_porkchop", new cb(8, 0.8f, true).b("porkchopCooked"));
        cg.a(321, "painting", new di(net.minecraft.w.f.q.class).b("painting"));
        cg.a(322, "golden_apple", new af(4, 1.2f, false).g().b("appleGold"));
        cg.a(323, "sign", new y().b("sign"));
        cg.a(324, "wooden_door", new d(net.minecraft.a.p.ao).b("doorOak"));
        cg cg2 = new do(net.minecraft.a.p.a).b("bucket").d(16);
        cg.a(325, "bucket", cg2);
        cg.a(326, "water_bucket", new do(net.minecraft.a.p.i).b("bucketWater").b(cg2));
        cg.a(327, "lava_bucket", new do(net.minecraft.a.p.k).b("bucketLava").b(cg2));
        cg.a(328, "minecart", new dc(net.minecraft.w.f.m.a).b("minecart"));
        cg.a(329, "saddle", new cz().b("saddle"));
        cg.a(330, "iron_door", new d(net.minecraft.a.p.aA).b("doorIron"));
        cg.a(331, "redstone", new s().b("redstone"));
        cg.a(332, "snowball", new as().b("snowball"));
        cg.a(333, "boat", (cg)new o(t.a));
        cg.a(334, "leather", new cg().b("leather").a(net.minecraft.v.d.l));
        cg.a(335, "milk_bucket", new bu().b("milk").b(cg2));
        cg.a(336, "brick", new cg().b("brick").a(net.minecraft.v.d.l));
        cg.a(337, "clay_ball", new cg().b("clay").a(net.minecraft.v.d.l));
        cg.a(338, "reeds", new a(net.minecraft.a.p.aM).b("reeds").a(net.minecraft.v.d.l));
        cg.a(339, "paper", new cg().b("paper").a(net.minecraft.v.d.f));
        cg.a(340, "book", new bz().b("book").a(net.minecraft.v.d.f));
        cg.a(341, "slime_ball", new cg().b("slimeball").a(net.minecraft.v.d.f));
        cg.a(342, "chest_minecart", new dc(net.minecraft.w.f.m.b).b("minecartChest"));
        cg.a(343, "furnace_minecart", new dc(net.minecraft.w.f.m.c).b("minecartFurnace"));
        cg.a(344, "egg", new cm().b("egg"));
        cg.a(345, "compass", new g().b("compass").a(net.minecraft.v.d.i));
        cg.a(346, "fishing_rod", new cl().b("fishingRod"));
        cg.a(347, "clock", new ch().b("clock").a(net.minecraft.v.d.i));
        cg.a(348, "glowstone_dust", new cg().b("yellowDust").a(net.minecraft.v.d.l));
        cg.a(349, "fish", new az(false).b("fish").a(true));
        cg.a(350, "cooked_fish", new az(true).b("fish").a(true));
        cg.a(351, "dye", new m().b("dyePowder"));
        cg.a(352, "bone", new cg().b("bone").m().a(net.minecraft.v.d.f));
        cg.a(353, "sugar", new cg().b("sugar").a(net.minecraft.v.d.l));
        cg.a(354, "cake", new a(net.minecraft.a.p.ba).d(1).b("cake").a(net.minecraft.v.d.h));
        cg.a(355, "bed", new ce().d(1).b("bed"));
        cg.a(356, "repeater", new a(net.minecraft.a.p.bb).b("diode").a(net.minecraft.v.d.d));
        cg.a(357, "cookie", new cb(2, 0.1f, false).b("cookie"));
        cg.a(358, "filled_map", new bf().b("map"));
        cg.a(359, "shears", new ak().b("shears"));
        cg.a(360, "melon", new cb(2, 0.3f, false).b("melon"));
        cg.a(361, "pumpkin_seeds", new ax(net.minecraft.a.p.bl, net.minecraft.a.p.ak).b("seeds_pumpkin"));
        cg.a(362, "melon_seeds", new ax(net.minecraft.a.p.bm, net.minecraft.a.p.ak).b("seeds_melon"));
        cg.a(363, "beef", new cb(3, 0.3f, true).b("beefRaw"));
        cg.a(364, "cooked_beef", new cb(8, 0.8f, true).b("beefCooked"));
        cg.a(365, "chicken", new cb(2, 0.3f, true).a(new net.minecraft.d.j(net.minecraft.a.c.q, 600, 0), 0.3f).b("chickenRaw"));
        cg.a(366, "cooked_chicken", new cb(6, 0.6f, true).b("chickenCooked"));
        cg.a(367, "rotten_flesh", new cb(4, 0.1f, true).a(new net.minecraft.d.j(net.minecraft.a.c.q, 600, 0), 0.8f).b("rottenFlesh"));
        cg.a(368, "ender_pearl", new cj().b("enderPearl"));
        cg.a(369, "blaze_rod", new cg().b("blazeRod").a(net.minecraft.v.d.l).m());
        cg.a(370, "ghast_tear", new cg().b("ghastTear").a(net.minecraft.v.d.k));
        cg.a(371, "gold_nugget", new cg().b("goldNugget").a(net.minecraft.v.d.l));
        cg.a(372, "nether_wart", new ax(net.minecraft.a.p.bB, net.minecraft.a.p.aW).b("netherStalkSeeds"));
        cg.a(373, "potion", new ae().b("potion"));
        cg cg3 = new aw().b("glassBottle");
        cg.a(374, "glass_bottle", cg3);
        cg.a(375, "spider_eye", new cb(2, 0.8f, false).a(new net.minecraft.d.j(net.minecraft.a.c.s, 100, 0), 1.0f).b("spiderEye"));
        cg.a(376, "fermented_spider_eye", new cg().b("fermentedSpiderEye").a(net.minecraft.v.d.k));
        cg.a(377, "blaze_powder", new cg().b("blazePowder").a(net.minecraft.v.d.k));
        cg.a(378, "magma_cream", new cg().b("magmaCream").a(net.minecraft.v.d.k));
        cg.a(379, "brewing_stand", new a(net.minecraft.a.p.bD).b("brewingStand").a(net.minecraft.v.d.k));
        cg.a(380, "cauldron", new a(net.minecraft.a.p.bE).b("cauldron").a(net.minecraft.v.d.k));
        cg.a(381, "ender_eye", new bh().b("eyeOfEnder"));
        cg.a(382, "speckled_melon", new cg().b("speckledMelon").a(net.minecraft.v.d.k));
        cg.a(383, "spawn_egg", new dk().b("monsterPlacer"));
        cg.a(384, "experience_bottle", new an().b("expBottle"));
        cg.a(385, "fire_charge", new bj().b("fireball"));
        cg.a(386, "writable_book", new bv().b("writingBook").a(net.minecraft.v.d.f));
        cg.a(387, "written_book", new ct().b("writtenBook").d(16));
        cg.a(388, "emerald", new cg().b("emerald").a(net.minecraft.v.d.l));
        cg.a(389, "item_frame", new di(net.minecraft.w.f.l.class).b("frame"));
        cg.a(390, "flower_pot", new a(net.minecraft.a.p.ca).b("flowerPot").a(net.minecraft.v.d.c));
        cg.a(391, "carrot", new bk(3, 0.6f, net.minecraft.a.p.cb, net.minecraft.a.p.ak).b("carrots"));
        cg.a(392, "potato", new bk(1, 0.3f, net.minecraft.a.p.cc, net.minecraft.a.p.ak).b("potato"));
        cg.a(393, "baked_potato", new cb(5, 0.6f, false).b("potatoBaked"));
        cg.a(394, "poisonous_potato", new cb(2, 0.3f, false).a(new net.minecraft.d.j(net.minecraft.a.c.s, 100, 0), 0.6f).b("potatoPoisonous"));
        cg.a(395, "map", new f().b("emptyMap"));
        cg.a(396, "golden_carrot", new cb(6, 1.2f, false).b("carrotGolden").a(net.minecraft.v.d.k));
        cg.a(397, "skull", new x().b("skull"));
        cg.a(398, "carrot_on_a_stick", new ck().b("carrotOnAStick"));
        cg.a(399, "nether_star", new bp().b("netherStar").a(net.minecraft.v.d.l));
        cg.a(400, "pumpkin_pie", new cb(8, 0.3f, false).b("pumpkinPie").a(net.minecraft.v.d.h));
        cg.a(401, "fireworks", new w().b("fireworks"));
        cg.a(402, "firework_charge", new cc().b("fireworksCharge").a(net.minecraft.v.d.f));
        cg.a(403, "enchanted_book", new al().d(1).b("enchantedBook"));
        cg.a(404, "comparator", new a(net.minecraft.a.p.cj).b("comparator").a(net.minecraft.v.d.d));
        cg.a(405, "netherbrick", new cg().b("netherbrick").a(net.minecraft.v.d.l));
        cg.a(406, "quartz", new cg().b("netherquartz").a(net.minecraft.v.d.l));
        cg.a(407, "tnt_minecart", new dc(net.minecraft.w.f.m.d).b("minecartTnt"));
        cg.a(408, "hopper_minecart", new dc(net.minecraft.w.f.m.f).b("minecartHopper"));
        cg.a(409, "prismarine_shard", new cg().b("prismarineShard").a(net.minecraft.v.d.l));
        cg.a(410, "prismarine_crystals", new cg().b("prismarineCrystals").a(net.minecraft.v.d.l));
        cg.a(411, "rabbit", new cb(3, 0.3f, true).b("rabbitRaw"));
        cg.a(412, "cooked_rabbit", new cb(5, 0.6f, true).b("rabbitCooked"));
        cg.a(413, "rabbit_stew", new bt(10).b("rabbitStew"));
        cg.a(414, "rabbit_foot", new cg().b("rabbitFoot").a(net.minecraft.v.d.k));
        cg.a(415, "rabbit_hide", new cg().b("rabbitHide").a(net.minecraft.v.d.l));
        cg.a(416, "armor_stand", new aq().b("armorStand").d(16));
        cg.a(417, "iron_horse_armor", new cg().b("horsearmormetal").d(1).a(net.minecraft.v.d.f));
        cg.a(418, "golden_horse_armor", new cg().b("horsearmorgold").d(1).a(net.minecraft.v.d.f));
        cg.a(419, "diamond_horse_armor", new cg().b("horsearmordiamond").d(1).a(net.minecraft.v.d.f));
        cg.a(420, "lead", new c().b("leash"));
        cg.a(421, "name_tag", new h().b("nameTag"));
        cg.a(422, "command_block_minecart", new dc(net.minecraft.w.f.m.g).b("minecartCommandBlock").a((net.minecraft.v.d)null));
        cg.a(423, "mutton", new cb(2, 0.3f, true).b("muttonRaw"));
        cg.a(424, "cooked_mutton", new cb(6, 0.8f, true).b("muttonCooked"));
        cg.a(425, "banner", (cg)new ao().a("banner"));
        cg.a(426, "end_crystal", (cg)new ci());
        cg.a(427, "spruce_door", new d(net.minecraft.a.p.ap).b("doorSpruce"));
        cg.a(428, "birch_door", new d(net.minecraft.a.p.aq).b("doorBirch"));
        cg.a(429, "jungle_door", new d(net.minecraft.a.p.ar).b("doorJungle"));
        cg.a(430, "acacia_door", new d(net.minecraft.a.p.as).b("doorAcacia"));
        cg.a(431, "dark_oak_door", new d(net.minecraft.a.p.at).b("doorDarkOak"));
        cg.a(432, "chorus_fruit", new bw(4, 0.3f).g().b("chorusFruit").a(net.minecraft.v.d.l));
        cg.a(433, "chorus_fruit_popped", new cg().b("chorusFruitPopped").a(net.minecraft.v.d.l));
        cg.a(434, "beetroot", new cb(1, 0.6f, false).b("beetroot"));
        cg.a(435, "beetroot_seeds", new ax(net.minecraft.a.p.cZ, net.minecraft.a.p.ak).b("beetroot_seeds"));
        cg.a(436, "beetroot_soup", new bt(6).b("beetroot_soup"));
        cg.a(437, "dragon_breath", new cg().a(net.minecraft.v.d.k).b("dragon_breath").b(cg3));
        cg.a(438, "splash_potion", new bm().b("splash_potion"));
        cg.a(439, "spectral_arrow", new bb().b("spectral_arrow"));
        cg.a(440, "tipped_arrow", new cv().b("tipped_arrow"));
        cg.a(441, "lingering_potion", new de().b("lingering_potion"));
        cg.a(442, "shield", new e().b("shield"));
        cg.a(443, "elytra", new by().b("elytra"));
        cg.a(444, "spruce_boat", (cg)new o(t.b));
        cg.a(445, "birch_boat", (cg)new o(t.c));
        cg.a(446, "jungle_boat", (cg)new o(t.d));
        cg.a(447, "acacia_boat", (cg)new o(t.e));
        cg.a(448, "dark_oak_boat", (cg)new o(t.f));
        cg.a(2256, "record_13", new au("13", net.minecraft.a.f.eG).b("record"));
        cg.a(2257, "record_cat", new au("cat", net.minecraft.a.f.eI).b("record"));
        cg.a(2258, "record_blocks", new au("blocks", net.minecraft.a.f.eH).b("record"));
        cg.a(2259, "record_chirp", new au("chirp", net.minecraft.a.f.eJ).b("record"));
        cg.a(2260, "record_far", new au("far", net.minecraft.a.f.eK).b("record"));
        cg.a(2261, "record_mall", new au("mall", net.minecraft.a.f.eL).b("record"));
        cg.a(2262, "record_mellohi", new au("mellohi", net.minecraft.a.f.eM).b("record"));
        cg.a(2263, "record_stal", new au("stal", net.minecraft.a.f.eN).b("record"));
        cg.a(2264, "record_strad", new au("strad", net.minecraft.a.f.eO).b("record"));
        cg.a(2265, "record_ward", new au("ward", net.minecraft.a.f.eQ).b("record"));
        cg.a(2266, "record_11", new au("11", net.minecraft.a.f.eF).b("record"));
        cg.a(2267, "record_wait", new au("wait", net.minecraft.a.f.eP).b("record"));
    }

    private static void b(net.minecraft.g.cn cn2) {
        cg.a(cn2, new ar(cn2));
    }

    protected static void a(net.minecraft.g.cn cn2, cg cg2) {
        cg.a(net.minecraft.g.cn.c(cn2), (net.minecraft.u.bp)net.minecraft.g.cn.v.b(cn2), cg2);
        a.put(cn2, cg2);
    }

    private static void a(int n2, String string, cg cg2) {
        cg.a(n2, new net.minecraft.u.bp(string), cg2);
    }

    private static void a(int n2, net.minecraft.u.bp bp2, cg cg2) {
        e.a(n2, bp2, cg2);
    }
}

