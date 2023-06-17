/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.a.i;
import net.minecraft.g.a.h;
import net.minecraft.g.fh;
import net.minecraft.g.gd;
import net.minecraft.g.hy;
import net.minecraft.q.b;
import net.minecraft.q.b.a;
import net.minecraft.q.b.aa;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.ac;
import net.minecraft.q.b.ad;
import net.minecraft.q.b.ae;
import net.minecraft.q.b.ag;
import net.minecraft.q.b.ai;
import net.minecraft.q.b.aj;
import net.minecraft.q.b.ak;
import net.minecraft.q.b.al;
import net.minecraft.q.b.am;
import net.minecraft.q.b.an;
import net.minecraft.q.b.aq;
import net.minecraft.q.b.c;
import net.minecraft.q.b.d;
import net.minecraft.q.b.e;
import net.minecraft.q.b.f;
import net.minecraft.q.b.j;
import net.minecraft.q.b.k;
import net.minecraft.q.b.m;
import net.minecraft.q.b.n;
import net.minecraft.q.b.o;
import net.minecraft.q.b.p;
import net.minecraft.q.b.t;
import net.minecraft.q.b.u;
import net.minecraft.q.b.z;
import net.minecraft.q.g.a.ar;
import net.minecraft.q.g.a.r;
import net.minecraft.q.g.a.x;
import net.minecraft.q.s;
import net.minecraft.u.b.g;
import net.minecraft.u.bn;
import net.minecraft.u.bp;
import net.minecraft.w.e.au;
import net.minecraft.w.e.av;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.bi;
import net.minecraft.w.h.ah;
import net.minecraft.w.h.l;

public abstract class q {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    protected static final net.minecraft.g.c.b d = net.minecraft.a.p.b.v();
    protected static final net.minecraft.g.c.b e = net.minecraft.a.p.a.v();
    protected static final net.minecraft.g.c.b f = net.minecraft.a.p.h.v();
    protected static final net.minecraft.g.c.b g = net.minecraft.a.p.n.v();
    protected static final net.minecraft.g.c.b h = net.minecraft.a.p.cM.v();
    protected static final net.minecraft.g.c.b i = net.minecraft.a.p.A.v();
    protected static final net.minecraft.g.c.b j = net.minecraft.a.p.aI.v();
    protected static final net.minecraft.g.c.b k = net.minecraft.a.p.j.v();
    public static final Set l = aad.a();
    public static final bn m = new bn();
    protected static final net.minecraft.q.g.b n = new net.minecraft.q.g.b(new Random(1234L), 1);
    protected static final net.minecraft.q.g.b o = new net.minecraft.q.g.b(new Random(2345L), 1);
    protected static final net.minecraft.q.g.a.t p = new net.minecraft.q.g.a.t();
    protected static final x q = new x(false);
    protected static final ar r = new ar(false);
    protected static final net.minecraft.q.g.a.f s = new net.minecraft.q.g.a.f();
    public static final net.minecraft.u.c.c t = new net.minecraft.u.c.c();
    private final String b;
    private final float c;
    private final float B;
    private final float C;
    private final float D;
    private final int E;
    private final boolean F;
    private final boolean G;
    private final String H;
    public net.minecraft.g.c.b u = net.minecraft.a.p.c.v();
    public net.minecraft.g.c.b v = net.minecraft.a.p.d.v();
    public t w;
    protected List x = ov.a();
    protected List y = ov.a();
    protected List z = ov.a();
    protected List A = ov.a();

    public static int a(q q2) {
        return t.d(q2);
    }

    public static q a(int n2) {
        return (q)t.a(n2);
    }

    public static q b(q q2) {
        return (q)m.a(net.minecraft.q.b.q.a(q2));
    }

    protected q(ab ab2) {
        this.b = ab.a(ab2);
        this.c = ab.b(ab2);
        this.B = ab.c(ab2);
        this.C = ab.d(ab2);
        this.D = ab.e(ab2);
        this.E = ab.f(ab2);
        this.F = ab.g(ab2);
        this.G = ab.h(ab2);
        this.H = ab.i(ab2);
        this.w = this.d();
        this.y.add(new am(net.minecraft.w.h.ad.class, 12, 4, 4));
        this.y.add(new am(l.class, 10, 4, 4));
        this.y.add(new am(ah.class, 10, 4, 4));
        this.y.add(new am(net.minecraft.w.h.ab.class, 8, 4, 4));
        this.x.add(new am(net.minecraft.w.e.c.class, 100, 4, 4));
        this.x.add(new am(net.minecraft.w.e.d.class, 100, 4, 4));
        this.x.add(new am(ay.class, 100, 4, 4));
        this.x.add(new am(bi.class, 100, 4, 4));
        this.x.add(new am(av.class, 100, 4, 4));
        this.x.add(new am(au.class, 10, 1, 4));
        this.x.add(new am(net.minecraft.w.e.u.class, 5, 1, 1));
        this.z.add(new am(net.minecraft.w.h.ac.class, 10, 4, 4));
        this.A.add(new am(net.minecraft.w.h.aj.class, 10, 8, 8));
    }

    protected t d() {
        return new t();
    }

    public boolean e() {
        return this.H != null;
    }

    public net.minecraft.q.g.a.q a(Random random) {
        return random.nextInt(10) == 0 ? r : q;
    }

    public net.minecraft.q.g.a.aj b(Random random) {
        return new r(net.minecraft.g.t.b);
    }

    public fh a(Random random, net.minecraft.u.b.b b2) {
        return random.nextInt(3) > 0 ? fh.a : fh.b;
    }

    public int a(float f2) {
        f2 /= 3.0f;
        f2 = net.minecraft.u.b.n.a(f2, -1.0f, 1.0f);
        return net.minecraft.u.b.n.c(0.62222224f - f2 * 0.05f, 0.5f + f2 * 0.1f, 1.0f);
    }

    public List a(net.minecraft.w.ag ag2) {
        switch (ag2) {
            case a: {
                return this.x;
            }
            case b: {
                return this.y;
            }
            case d: {
                return this.z;
            }
            case c: {
                return this.A;
            }
        }
        return Collections.emptyList();
    }

    public boolean f() {
        return this.p();
    }

    public boolean g() {
        return this.p() ? false : this.G;
    }

    public boolean h() {
        return this.k() > 0.85f;
    }

    public float c() {
        return 0.1f;
    }

    public final float c(net.minecraft.u.b.b b2) {
        if (b2.k() > 64) {
            float f2 = (float)(n.a((float)b2.cy_() / 8.0f, (float)b2.l() / 8.0f) * 4.0);
            return this.n() - (f2 + (float)b2.k() - 64.0f) * 0.05f / 30.0f;
        }
        return this.n();
    }

    public void a(net.minecraft.q.k k2, Random random, net.minecraft.u.b.b b2) {
        this.w.a(k2, random, this, b2);
    }

    public int a(net.minecraft.u.b.b b2) {
        double d2 = net.minecraft.u.b.n.a(this.c(b2), 0.0f, 1.0f);
        double d3 = net.minecraft.u.b.n.a(this.k(), 0.0f, 1.0f);
        return net.minecraft.q.s.a(d2, d3);
    }

    public int b(net.minecraft.u.b.b b2) {
        double d2 = net.minecraft.u.b.n.a(this.c(b2), 0.0f, 1.0f);
        double d3 = net.minecraft.u.b.n.a(this.k(), 0.0f, 1.0f);
        return net.minecraft.q.b.a(d2, d3);
    }

    public void a(net.minecraft.q.k k2, Random random, net.minecraft.q.f.e e2, int n2, int n3, double d2) {
        this.b(k2, random, e2, n2, n3, d2);
    }

    public final void b(net.minecraft.q.k k2, Random random, net.minecraft.q.f.e e2, int n2, int n3, double d2) {
        int n4 = k2.x();
        net.minecraft.g.c.b b2 = this.u;
        net.minecraft.g.c.b b3 = this.v;
        int n5 = -1;
        int n6 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n7 = n2 & 0xF;
        int n8 = n3 & 0xF;
        g g2 = new g();
        for (int i2 = 255; i2 >= 0; --i2) {
            if (i2 <= random.nextInt(5)) {
                e2.a(n8, i2, n7, f);
                continue;
            }
            net.minecraft.g.c.b b4 = e2.a(n8, i2, n7);
            if (b4.d() == net.minecraft.g.a.h.a) {
                n5 = -1;
                continue;
            }
            if (b4.c() != net.minecraft.a.p.b) continue;
            if (n5 == -1) {
                if (n6 <= 0) {
                    b2 = e;
                    b3 = d;
                } else if (i2 >= n4 - 4 && i2 <= n4 + 1) {
                    b2 = this.u;
                    b3 = this.v;
                }
                if (i2 < n4 && (b2 == null || b2.d() == net.minecraft.g.a.h.a)) {
                    b2 = this.c(g2.b(n2, i2, n3)) < 0.15f ? j : k;
                }
                n5 = n6;
                if (i2 >= n4 - 1) {
                    e2.a(n8, i2, n7, b2);
                    continue;
                }
                if (i2 < n4 - 7 - n6) {
                    b2 = e;
                    b3 = d;
                    e2.a(n8, i2, n7, g);
                    continue;
                }
                e2.a(n8, i2, n7, b3);
                continue;
            }
            if (n5 <= 0) continue;
            e2.a(n8, i2, n7, b3);
            if (--n5 != 0 || b3.c() != net.minecraft.a.p.m || n6 <= 1) continue;
            n5 = random.nextInt(4) + Math.max(0, i2 - 63);
            b3 = b3.a(gd.b) == hy.b ? h : i;
        }
    }

    public Class a() {
        return this.getClass();
    }

    public ak b() {
        return (double)this.n() < 0.2 ? ak.b : ((double)this.n() < 1.0 ? ak.c : ak.d);
    }

    public static q b(int n2) {
        return net.minecraft.q.b.q.a(n2, null);
    }

    public static q a(int n2, q q2) {
        q q3 = net.minecraft.q.b.q.a(n2);
        return q3 == null ? q2 : q3;
    }

    public boolean i() {
        return false;
    }

    public final float j() {
        return this.c;
    }

    public final float k() {
        return this.D;
    }

    public final String l() {
        return this.b;
    }

    public final float m() {
        return this.B;
    }

    public final float n() {
        return this.C;
    }

    public final int o() {
        return this.E;
    }

    public final boolean p() {
        return this.F;
    }

    public static void q() {
        net.minecraft.q.b.q.a(0, "ocean", new k(new ab("Ocean").c(-1.0f).d(0.1f)));
        net.minecraft.q.b.q.a(1, "plains", new aq(false, new ab("Plains").c(0.125f).d(0.05f).a(0.8f).b(0.4f)));
        net.minecraft.q.b.q.a(2, "desert", new j(new ab("Desert").c(0.125f).d(0.05f).a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(3, "extreme_hills", new ai(al.a, new ab("Extreme Hills").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        net.minecraft.q.b.q.a(4, "forest", new n(net.minecraft.q.b.d.a, new ab("Forest").a(0.7f).b(0.8f)));
        net.minecraft.q.b.q.a(5, "taiga", new a(net.minecraft.q.b.f.a, new ab("Taiga").c(0.2f).d(0.2f).a(0.25f).b(0.8f)));
        net.minecraft.q.b.q.a(6, "swampland", new p(new ab("Swampland").c(-0.2f).d(0.1f).a(0.8f).b(0.9f).a(14745518)));
        net.minecraft.q.b.q.a(7, "river", new o(new ab("River").c(-0.5f).d(0.0f)));
        net.minecraft.q.b.q.a(8, "hell", new ad(new ab("Hell").a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(9, "sky", new u(new ab("The End").a()));
        net.minecraft.q.b.q.a(10, "frozen_ocean", new k(new ab("FrozenOcean").c(-1.0f).d(0.1f).a(0.0f).b(0.5f).b()));
        net.minecraft.q.b.q.a(11, "frozen_river", new o(new ab("FrozenRiver").c(-0.5f).d(0.0f).a(0.0f).b(0.5f).b()));
        net.minecraft.q.b.q.a(12, "ice_flats", new m(false, new ab("Ice Plains").c(0.125f).d(0.05f).a(0.0f).b(0.5f).b()));
        net.minecraft.q.b.q.a(13, "ice_mountains", new m(false, new ab("Ice Mountains").c(0.45f).d(0.3f).a(0.0f).b(0.5f).b()));
        net.minecraft.q.b.q.a(14, "mushroom_island", new z(new ab("MushroomIsland").c(0.2f).d(0.3f).a(0.9f).b(1.0f)));
        net.minecraft.q.b.q.a(15, "mushroom_island_shore", new z(new ab("MushroomIslandShore").c(0.0f).d(0.025f).a(0.9f).b(1.0f)));
        net.minecraft.q.b.q.a(16, "beaches", new ae(new ab("Beach").c(0.0f).d(0.025f).a(0.8f).b(0.4f)));
        net.minecraft.q.b.q.a(17, "desert_hills", new j(new ab("DesertHills").c(0.45f).d(0.3f).a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(18, "forest_hills", new n(net.minecraft.q.b.d.a, new ab("ForestHills").c(0.45f).d(0.3f).a(0.7f).b(0.8f)));
        net.minecraft.q.b.q.a(19, "taiga_hills", new a(net.minecraft.q.b.f.a, new ab("TaigaHills").a(0.25f).b(0.8f).c(0.45f).d(0.3f)));
        net.minecraft.q.b.q.a(20, "smaller_extreme_hills", new ai(al.b, new ab("Extreme Hills Edge").c(0.8f).d(0.3f).a(0.2f).b(0.3f)));
        net.minecraft.q.b.q.a(21, "jungle", new an(false, new ab("Jungle").a(0.95f).b(0.9f)));
        net.minecraft.q.b.q.a(22, "jungle_hills", new an(false, new ab("JungleHills").c(0.45f).d(0.3f).a(0.95f).b(0.9f)));
        net.minecraft.q.b.q.a(23, "jungle_edge", new an(true, new ab("JungleEdge").a(0.95f).b(0.8f)));
        net.minecraft.q.b.q.a(24, "deep_ocean", new k(new ab("Deep Ocean").c(-1.8f).d(0.1f)));
        net.minecraft.q.b.q.a(25, "stone_beach", new ac(new ab("Stone Beach").c(0.1f).d(0.8f).a(0.2f).b(0.3f)));
        net.minecraft.q.b.q.a(26, "cold_beach", new ae(new ab("Cold Beach").c(0.0f).d(0.025f).a(0.05f).b(0.3f).b()));
        net.minecraft.q.b.q.a(27, "birch_forest", new n(net.minecraft.q.b.d.c, new ab("Birch Forest").a(0.6f).b(0.6f)));
        net.minecraft.q.b.q.a(28, "birch_forest_hills", new n(net.minecraft.q.b.d.c, new ab("Birch Forest Hills").c(0.45f).d(0.3f).a(0.6f).b(0.6f)));
        net.minecraft.q.b.q.a(29, "roofed_forest", new n(net.minecraft.q.b.d.d, new ab("Roofed Forest").a(0.7f).b(0.8f)));
        net.minecraft.q.b.q.a(30, "taiga_cold", new a(net.minecraft.q.b.f.a, new ab("Cold Taiga").c(0.2f).d(0.2f).a(-0.5f).b(0.4f).b()));
        net.minecraft.q.b.q.a(31, "taiga_cold_hills", new a(net.minecraft.q.b.f.a, new ab("Cold Taiga Hills").c(0.45f).d(0.3f).a(-0.5f).b(0.4f).b()));
        net.minecraft.q.b.q.a(32, "redwood_taiga", new a(net.minecraft.q.b.f.b, new ab("Mega Taiga").a(0.3f).b(0.8f).c(0.2f).d(0.2f)));
        net.minecraft.q.b.q.a(33, "redwood_taiga_hills", new a(net.minecraft.q.b.f.b, new ab("Mega Taiga Hills").c(0.45f).d(0.3f).a(0.3f).b(0.8f)));
        net.minecraft.q.b.q.a(34, "extreme_hills_with_trees", new ai(al.b, new ab("Extreme Hills+").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        net.minecraft.q.b.q.a(35, "savanna", new c(new ab("Savanna").c(0.125f).d(0.05f).a(1.2f).b(0.0f).a()));
        net.minecraft.q.b.q.a(36, "savanna_rock", new c(new ab("Savanna Plateau").c(1.5f).d(0.025f).a(1.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(37, "mesa", new aj(false, false, new ab("Mesa").a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(38, "mesa_rock", new aj(false, true, new ab("Mesa Plateau F").c(1.5f).d(0.025f).a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(39, "mesa_clear_rock", new aj(false, false, new ab("Mesa Plateau").c(1.5f).d(0.025f).a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(127, "void", new aa(new ab("The Void").a()));
        net.minecraft.q.b.q.a(129, "mutated_plains", new aq(true, new ab("Sunflower Plains").a("plains").c(0.125f).d(0.05f).a(0.8f).b(0.4f)));
        net.minecraft.q.b.q.a(130, "mutated_desert", new j(new ab("Desert M").a("desert").c(0.225f).d(0.25f).a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(131, "mutated_extreme_hills", new ai(al.c, new ab("Extreme Hills M").a("extreme_hills").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        net.minecraft.q.b.q.a(132, "mutated_forest", new n(net.minecraft.q.b.d.b, new ab("Flower Forest").a("forest").d(0.4f).a(0.7f).b(0.8f)));
        net.minecraft.q.b.q.a(133, "mutated_taiga", new a(net.minecraft.q.b.f.a, new ab("Taiga M").a("taiga").c(0.3f).d(0.4f).a(0.25f).b(0.8f)));
        net.minecraft.q.b.q.a(134, "mutated_swampland", new p(new ab("Swampland M").a("swampland").c(-0.1f).d(0.3f).a(0.8f).b(0.9f).a(14745518)));
        net.minecraft.q.b.q.a(140, "mutated_ice_flats", new m(true, new ab("Ice Plains Spikes").a("ice_flats").c(0.425f).d(0.45000002f).a(0.0f).b(0.5f).b()));
        net.minecraft.q.b.q.a(149, "mutated_jungle", new an(false, new ab("Jungle M").a("jungle").c(0.2f).d(0.4f).a(0.95f).b(0.9f)));
        net.minecraft.q.b.q.a(151, "mutated_jungle_edge", new an(true, new ab("JungleEdge M").a("jungle_edge").c(0.2f).d(0.4f).a(0.95f).b(0.8f)));
        net.minecraft.q.b.q.a(155, "mutated_birch_forest", new ag(new ab("Birch Forest M").a("birch_forest").c(0.2f).d(0.4f).a(0.6f).b(0.6f)));
        net.minecraft.q.b.q.a(156, "mutated_birch_forest_hills", new ag(new ab("Birch Forest Hills M").a("birch_forest").c(0.55f).d(0.5f).a(0.6f).b(0.6f)));
        net.minecraft.q.b.q.a(157, "mutated_roofed_forest", new n(net.minecraft.q.b.d.d, new ab("Roofed Forest M").a("roofed_forest").c(0.2f).d(0.4f).a(0.7f).b(0.8f)));
        net.minecraft.q.b.q.a(158, "mutated_taiga_cold", new a(net.minecraft.q.b.f.a, new ab("Cold Taiga M").a("taiga_cold").c(0.3f).d(0.4f).a(-0.5f).b(0.4f).b()));
        net.minecraft.q.b.q.a(160, "mutated_redwood_taiga", new a(net.minecraft.q.b.f.c, new ab("Mega Spruce Taiga").a("redwood_taiga").c(0.2f).d(0.2f).a(0.25f).b(0.8f)));
        net.minecraft.q.b.q.a(161, "mutated_redwood_taiga_hills", new a(net.minecraft.q.b.f.c, new ab("Redwood Taiga Hills M").a("redwood_taiga_hills").c(0.2f).d(0.2f).a(0.25f).b(0.8f)));
        net.minecraft.q.b.q.a(162, "mutated_extreme_hills_with_trees", new ai(al.c, new ab("Extreme Hills+ M").a("extreme_hills_with_trees").c(1.0f).d(0.5f).a(0.2f).b(0.3f)));
        net.minecraft.q.b.q.a(163, "mutated_savanna", new e(new ab("Savanna M").a("savanna").c(0.3625f).d(1.225f).a(1.1f).b(0.0f).a()));
        net.minecraft.q.b.q.a(164, "mutated_savanna_rock", new e(new ab("Savanna Plateau M").a("savanna_rock").c(1.05f).d(1.2125001f).a(1.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(165, "mutated_mesa", new aj(true, false, new ab("Mesa (Bryce)").a("mesa").a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(166, "mutated_mesa_rock", new aj(false, true, new ab("Mesa Plateau F M").a("mesa_rock").c(0.45f).d(0.3f).a(2.0f).b(0.0f).a()));
        net.minecraft.q.b.q.a(167, "mutated_mesa_clear_rock", new aj(false, false, new ab("Mesa Plateau M").a("mesa_clear_rock").c(0.45f).d(0.3f).a(2.0f).b(0.0f).a()));
        Collections.addAll(l, net.minecraft.a.i.a, net.minecraft.a.i.c, net.minecraft.a.i.d, net.minecraft.a.i.e, net.minecraft.a.i.f, net.minecraft.a.i.g, net.minecraft.a.i.h, net.minecraft.a.i.i, net.minecraft.a.i.m, net.minecraft.a.i.n, net.minecraft.a.i.o, net.minecraft.a.i.p, net.minecraft.a.i.q, net.minecraft.a.i.r, net.minecraft.a.i.s, net.minecraft.a.i.t, net.minecraft.a.i.u, net.minecraft.a.i.w, net.minecraft.a.i.x, net.minecraft.a.i.y, net.minecraft.a.i.z, net.minecraft.a.i.A, net.minecraft.a.i.B, net.minecraft.a.i.C, net.minecraft.a.i.D, net.minecraft.a.i.E, net.minecraft.a.i.F, net.minecraft.a.i.G, net.minecraft.a.i.H, net.minecraft.a.i.I, net.minecraft.a.i.J, net.minecraft.a.i.K, net.minecraft.a.i.L, net.minecraft.a.i.M, net.minecraft.a.i.N, net.minecraft.a.i.O);
    }

    private static void a(int n2, String string, q q2) {
        t.a(n2, new bp(string), q2);
        if (q2.e()) {
            m.a(q2, net.minecraft.q.b.q.a((q)t.a(new bp(q2.H))));
        }
    }
}

