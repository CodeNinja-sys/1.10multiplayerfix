/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.util.List;
import net.minecraft.a.w;
import net.minecraft.client.f.j;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ap;
import net.minecraft.client.g.aw;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.g;
import net.minecraft.client.g.b.a.h;
import net.minecraft.client.g.b.a.q;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bj;
import net.minecraft.client.g.bk;
import net.minecraft.client.g.c.e;
import net.minecraft.client.g.cc;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.ck;
import net.minecraft.client.g.co;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.k;
import net.minecraft.client.g.y;
import net.minecraft.client.g.z;
import net.minecraft.client.h.d;
import net.minecraft.client.k.ce;
import net.minecraft.client.r;
import net.minecraft.g.cn;
import net.minecraft.g.db;
import net.minecraft.g.dk;
import net.minecraft.g.ei;
import net.minecraft.g.el;
import net.minecraft.g.ev;
import net.minecraft.g.fd;
import net.minecraft.g.fh;
import net.minecraft.g.fn;
import net.minecraft.g.gm;
import net.minecraft.g.hx;
import net.minecraft.g.hy;
import net.minecraft.g.ic;
import net.minecraft.k.a;
import net.minecraft.k.i;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dg;
import net.minecraft.u.b.n;
import net.minecraft.u.bo;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import net.minecraft.w.l;

public class t
implements j {
    private static final bp b = new bp("textures/misc/enchanted_item_glint.png");
    private boolean c = true;
    public float a;
    private final aw d;
    private final c e;
    private final net.minecraft.client.g.h.c f;

    public t(c c2, g g2, net.minecraft.client.g.h.c c3) {
        this.e = c2;
        this.d = new aw(g2);
        this.b();
        this.f = c3;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public aw a() {
        return this.d;
    }

    protected void a(cg cg2, int n2, String string) {
        this.d.a(cg2, n2, new ag(string, "inventory"));
    }

    protected void a(cn cn2, int n2, String string) {
        this.a(cg.a(cn2), n2, string);
    }

    private void a(cn cn2, String string) {
        this.a(cn2, 0, string);
    }

    private void a(cg cg2, String string) {
        this.a(cg2, 0, string);
    }

    private void a(aq aq2, cu cu2) {
        this.a(aq2, -1, cu2);
    }

    private void a(aq aq2, int n2) {
        this.a(aq2, n2, null);
    }

    private void a(aq aq2, int n2, cu cu2) {
        ci ci2 = ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.b);
        for (net.minecraft.u.ad ad2 : net.minecraft.u.ad.values()) {
            this.a(g2, aq2.a(null, ad2, 0L), n2, cu2);
        }
        this.a(g2, aq2.a(null, null, 0L), n2, cu2);
        ci2.b();
    }

    public void a(cu cu2, aq aq2) {
        if (cu2 != null) {
            bd.D();
            bd.c(-0.5f, -0.5f, -0.5f);
            if (aq2.c()) {
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                bd.A();
                net.minecraft.client.g.c.e.a.a(cu2);
            } else {
                this.a(aq2, cu2);
                if (cu2.t()) {
                    this.a(aq2);
                }
            }
            bd.E();
        }
    }

    private void a(aq aq2) {
        bd.a(false);
        bd.c(514);
        bd.f();
        bd.a(ad.n, bc.e);
        this.e.a(b);
        bd.l(5890);
        bd.D();
        bd.b(8.0f, 8.0f, 8.0f);
        float f2 = (float)(r.I() % 3000L) / 3000.0f / 8.0f;
        bd.c(f2, 0.0f, 0.0f);
        bd.b(-50.0f, 0.0f, 0.0f, 1.0f);
        this.a(aq2, -8372020);
        bd.E();
        bd.D();
        bd.b(8.0f, 8.0f, 8.0f);
        float f3 = (float)(r.I() % 4873L) / 4873.0f / 8.0f;
        bd.c(-f3, 0.0f, 0.0f);
        bd.b(10.0f, 0.0f, 0.0f, 1.0f);
        this.a(aq2, -8372020);
        bd.E();
        bd.l(5888);
        bd.a(ad.l, bc.j);
        bd.e();
        bd.c(515);
        bd.a(true);
        this.e.a(net.minecraft.client.g.a.f.b);
    }

    private void a(net.minecraft.client.g.g g2, net.minecraft.client.g.b.a.t t2) {
        net.minecraft.u.b.t t3 = t2.e().n();
        g2.b(t3.cy_(), t3.k(), t3.l());
    }

    private void a(net.minecraft.client.g.g g2, net.minecraft.client.g.b.a.t t2, int n2) {
        g2.a(t2.b());
        g2.a(n2);
        this.a(g2, t2);
    }

    private void a(net.minecraft.client.g.g g2, List list, int n2, cu cu2) {
        boolean bl2 = n2 == -1 && cu2 != null;
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            net.minecraft.client.g.b.a.t t2 = (net.minecraft.client.g.b.a.t)list.get(i2);
            int n4 = n2;
            if (bl2 && t2.c()) {
                n4 = this.f.a(cu2, t2.d());
                if (cc.a) {
                    n4 = p.c(n4);
                }
                n4 |= 0xFF000000;
            }
            this.a(g2, t2, n4);
        }
    }

    public boolean a(cu cu2) {
        aq aq2 = this.d.a(cu2);
        return aq2 == null ? false : aq2.b();
    }

    public void a(cu cu2, ao ao2) {
        if (cu2 != null) {
            aq aq2 = this.a(cu2, null, null);
            this.a(cu2, aq2, ao2, false);
        }
    }

    public aq a(cu cu2, net.minecraft.q.k k2, l l2) {
        aq aq2 = this.d.a(cu2);
        cg cg2 = cu2.a();
        if (cg2 != null && cg2.h()) {
            bp bp2 = aq2.f().a(cu2, k2, l2);
            return bp2 == null ? aq2 : this.d.a().a(new ag(bp2, "inventory"));
        }
        return aq2;
    }

    public void a(cu cu2, l l2, ao ao2, boolean bl2) {
        if (cu2 != null && l2 != null && cu2.a() != null) {
            aq aq2 = this.a(cu2, l2.aQ, l2);
            this.a(cu2, aq2, ao2, bl2);
        }
    }

    protected void a(cu cu2, aq aq2, ao ao2, boolean bl2) {
        if (cu2.a() != null) {
            this.e.a(net.minecraft.client.g.a.f.b);
            this.e.b(net.minecraft.client.g.a.f.b).b(false, false);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.A();
            bd.a(516, 0.1f);
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            bd.D();
            q q2 = aq2.e();
            q.a(q2.b(ao2), bl2);
            if (this.a(q2.b(ao2))) {
                bd.a(bj.a);
            }
            this.a(cu2, aq2);
            bd.a(bj.b);
            bd.E();
            bd.B();
            bd.k();
            this.e.a(net.minecraft.client.g.a.f.b);
            this.e.b(net.minecraft.client.g.a.f.b).d();
        }
    }

    private boolean a(h h2) {
        return h2.d.a < 0.0f ^ h2.d.b < 0.0f ^ h2.d.c < 0.0f;
    }

    public void a(cu cu2, int n2, int n3) {
        this.a(cu2, n2, n3, this.a(cu2, null, null));
    }

    protected void a(cu cu2, int n2, int n3, aq aq2) {
        bd.D();
        this.e.a(net.minecraft.client.g.a.f.b);
        this.e.b(net.minecraft.client.g.a.f.b).b(false, false);
        bd.A();
        bd.d();
        bd.a(516, 0.1f);
        bd.l();
        bd.a(ad.l, bc.j);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(n2, n3, aq2.b());
        aq2.e().a(ao.g);
        this.a(cu2, aq2);
        bd.c();
        bd.B();
        bd.f();
        bd.E();
        this.e.a(net.minecraft.client.g.a.f.b);
        this.e.b(net.minecraft.client.g.a.f.b).d();
    }

    private void a(int n2, int n3, boolean bl2) {
        bd.c((float)n2, (float)n3, 100.0f + this.a);
        bd.c(8.0f, 8.0f, 0.0f);
        bd.b(1.0f, -1.0f, 1.0f);
        bd.b(16.0f, 16.0f, 16.0f);
        if (bl2) {
            bd.e();
        } else {
            bd.f();
        }
    }

    public void b(cu cu2, int n2, int n3) {
        this.a(r.z().j, cu2, n2, n3);
    }

    public void a(l l2, cu cu2, int n2, int n3) {
        if (cu2 != null && cu2.a() != null) {
            this.a += 50.0f;
            try {
                this.a(cu2, n2, n3, this.a(cu2, null, l2));
            }
            catch (Throwable throwable) {
                a a2 = net.minecraft.k.a.a(throwable, "Rendering item");
                i i2 = a2.a("Item being rendered");
                i2.a("Item Type", new bk(this, cu2));
                i2.a("Item Aux", new ap(this, cu2));
                i2.a("Item NBT", new z(this, cu2));
                i2.a("Item Foil", new co(this, cu2));
                throw new bo(a2);
            }
            this.a -= 50.0f;
        }
    }

    public void a(ce ce2, cu cu2, int n2, int n3) {
        this.a(ce2, cu2, n2, n3, null);
    }

    public void a(ce ce2, cu cu2, int n2, int n3, String string) {
        if (cu2 != null) {
            d d2;
            float f2;
            net.minecraft.client.g.g g2;
            ci ci2;
            if (cu2.b != 1 || string != null) {
                String string2;
                String string3 = string2 = string == null ? String.valueOf(cu2.b) : string;
                if (string == null && cu2.b < 1) {
                    string2 = (Object)((Object)o.m) + String.valueOf(cu2.b);
                }
                bd.f();
                bd.i();
                bd.k();
                ce2.a(string2, (float)(n2 + 19 - 2 - ce2.a(string2)), (float)(n3 + 6 + 3), 0xFFFFFF);
                bd.e();
                bd.j();
            }
            if (cu2.f()) {
                int n4 = (int)Math.round(13.0 - (double)cu2.g() * 13.0 / (double)cu2.i());
                int n5 = (int)Math.round(255.0 - (double)cu2.g() * 255.0 / (double)cu2.i());
                bd.f();
                bd.i();
                bd.w();
                bd.c();
                bd.k();
                ci2 = ci.a();
                g2 = ci2.c();
                this.a(g2, n2 + 2, n3 + 13, 13, 2, 0, 0, 0, 255);
                this.a(g2, n2 + 2, n3 + 13, 12, 1, (255 - n5) / 4, 64, 0, 255);
                this.a(g2, n2 + 2, n3 + 13, n4, 1, 255 - n5, n5, 0, 255);
                bd.l();
                bd.d();
                bd.v();
                bd.e();
                bd.j();
            }
            float f3 = f2 = (d2 = r.z().j) == null ? 0.0f : d2.aL().a(cu2.a(), r.z().ai());
            if (f2 > 0.0f) {
                bd.f();
                bd.i();
                bd.w();
                ci2 = ci.a();
                g2 = ci2.c();
                this.a(g2, n2, n3 + n.d(16.0f * (1.0f - f2)), 16, n.f(16.0f * f2), 255, 255, 255, 127);
                bd.v();
                bd.e();
                bd.j();
            }
        }
    }

    private void a(net.minecraft.client.g.g g2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        g2.a(7, net.minecraft.client.g.d.b.f);
        g2.b((double)(n2 + 0), (double)(n3 + 0), 0.0).b(n6, n7, n8, n9).d();
        g2.b((double)(n2 + 0), (double)(n3 + n5), 0.0).b(n6, n7, n8, n9).d();
        g2.b((double)(n2 + n4), (double)(n3 + n5), 0.0).b(n6, n7, n8, n9).d();
        g2.b((double)(n2 + n4), (double)(n3 + 0), 0.0).b(n6, n7, n8, n9).d();
        ci.a().b();
    }

    private void b() {
        this.a(net.minecraft.a.p.cf, "anvil_intact");
        this.a(net.minecraft.a.p.cf, 1, "anvil_slightly_damaged");
        this.a(net.minecraft.a.p.cf, 2, "anvil_very_damaged");
        this.a(net.minecraft.a.p.cy, cd.p.b(), "black_carpet");
        this.a(net.minecraft.a.p.cy, cd.l.b(), "blue_carpet");
        this.a(net.minecraft.a.p.cy, cd.m.b(), "brown_carpet");
        this.a(net.minecraft.a.p.cy, cd.j.b(), "cyan_carpet");
        this.a(net.minecraft.a.p.cy, cd.h.b(), "gray_carpet");
        this.a(net.minecraft.a.p.cy, cd.n.b(), "green_carpet");
        this.a(net.minecraft.a.p.cy, cd.d.b(), "light_blue_carpet");
        this.a(net.minecraft.a.p.cy, cd.f.b(), "lime_carpet");
        this.a(net.minecraft.a.p.cy, cd.c.b(), "magenta_carpet");
        this.a(net.minecraft.a.p.cy, cd.b.b(), "orange_carpet");
        this.a(net.minecraft.a.p.cy, cd.g.b(), "pink_carpet");
        this.a(net.minecraft.a.p.cy, cd.k.b(), "purple_carpet");
        this.a(net.minecraft.a.p.cy, cd.o.b(), "red_carpet");
        this.a(net.minecraft.a.p.cy, cd.i.b(), "silver_carpet");
        this.a(net.minecraft.a.p.cy, cd.a.b(), "white_carpet");
        this.a(net.minecraft.a.p.cy, cd.e.b(), "yellow_carpet");
        this.a(net.minecraft.a.p.bZ, ei.b.b(), "mossy_cobblestone_wall");
        this.a(net.minecraft.a.p.bZ, ei.a.b(), "cobblestone_wall");
        this.a(net.minecraft.a.p.d, ic.b.b(), "coarse_dirt");
        this.a(net.minecraft.a.p.d, ic.a.b(), "dirt");
        this.a(net.minecraft.a.p.d, ic.c.b(), "podzol");
        this.a(net.minecraft.a.p.cF, gm.d.b(), "double_fern");
        this.a(net.minecraft.a.p.cF, gm.c.b(), "double_grass");
        this.a(net.minecraft.a.p.cF, gm.f.b(), "paeonia");
        this.a(net.minecraft.a.p.cF, gm.e.b(), "double_rose");
        this.a(net.minecraft.a.p.cF, gm.a.b(), "sunflower");
        this.a(net.minecraft.a.p.cF, gm.b.b(), "syringa");
        this.a(net.minecraft.a.p.t, net.minecraft.g.b.c.b(), "birch_leaves");
        this.a(net.minecraft.a.p.t, net.minecraft.g.b.d.b(), "jungle_leaves");
        this.a(net.minecraft.a.p.t, net.minecraft.g.b.a.b(), "oak_leaves");
        this.a(net.minecraft.a.p.t, net.minecraft.g.b.b.b(), "spruce_leaves");
        this.a(net.minecraft.a.p.u, net.minecraft.g.b.e.b() - 4, "acacia_leaves");
        this.a(net.minecraft.a.p.u, net.minecraft.g.b.f.b() - 4, "dark_oak_leaves");
        this.a(net.minecraft.a.p.r, net.minecraft.g.b.c.b(), "birch_log");
        this.a(net.minecraft.a.p.r, net.minecraft.g.b.d.b(), "jungle_log");
        this.a(net.minecraft.a.p.r, net.minecraft.g.b.a.b(), "oak_log");
        this.a(net.minecraft.a.p.r, net.minecraft.g.b.b.b(), "spruce_log");
        this.a(net.minecraft.a.p.s, net.minecraft.g.b.e.b() - 4, "acacia_log");
        this.a(net.minecraft.a.p.s, net.minecraft.g.b.f.b() - 4, "dark_oak_log");
        this.a(net.minecraft.a.p.be, net.minecraft.g.bp.f.c(), "chiseled_brick_monster_egg");
        this.a(net.minecraft.a.p.be, net.minecraft.g.bp.b.c(), "cobblestone_monster_egg");
        this.a(net.minecraft.a.p.be, net.minecraft.g.bp.e.c(), "cracked_brick_monster_egg");
        this.a(net.minecraft.a.p.be, net.minecraft.g.bp.d.c(), "mossy_brick_monster_egg");
        this.a(net.minecraft.a.p.be, net.minecraft.g.bp.a.c(), "stone_monster_egg");
        this.a(net.minecraft.a.p.be, net.minecraft.g.bp.c.c(), "stone_brick_monster_egg");
        this.a(net.minecraft.a.p.f, net.minecraft.g.b.e.b(), "acacia_planks");
        this.a(net.minecraft.a.p.f, net.minecraft.g.b.c.b(), "birch_planks");
        this.a(net.minecraft.a.p.f, net.minecraft.g.b.f.b(), "dark_oak_planks");
        this.a(net.minecraft.a.p.f, net.minecraft.g.b.d.b(), "jungle_planks");
        this.a(net.minecraft.a.p.f, net.minecraft.g.b.a.b(), "oak_planks");
        this.a(net.minecraft.a.p.f, net.minecraft.g.b.b.b(), "spruce_planks");
        this.a(net.minecraft.a.p.cI, dk.b.b(), "prismarine_bricks");
        this.a(net.minecraft.a.p.cI, dk.c.b(), "dark_prismarine");
        this.a(net.minecraft.a.p.cI, dk.a.b(), "prismarine");
        this.a(net.minecraft.a.p.cq, fn.b.b(), "chiseled_quartz_block");
        this.a(net.minecraft.a.p.cq, fn.a.b(), "quartz_block");
        this.a(net.minecraft.a.p.cq, fn.c.b(), "quartz_column");
        this.a(net.minecraft.a.p.O, fh.d.c(), "allium");
        this.a(net.minecraft.a.p.O, fh.c.c(), "blue_orchid");
        this.a(net.minecraft.a.p.O, fh.e.c(), "houstonia");
        this.a(net.minecraft.a.p.O, fh.g.c(), "orange_tulip");
        this.a(net.minecraft.a.p.O, fh.j.c(), "oxeye_daisy");
        this.a(net.minecraft.a.p.O, fh.i.c(), "pink_tulip");
        this.a(net.minecraft.a.p.O, fh.b.c(), "poppy");
        this.a(net.minecraft.a.p.O, fh.f.c(), "red_tulip");
        this.a(net.minecraft.a.p.O, fh.h.c(), "white_tulip");
        this.a(net.minecraft.a.p.m, hy.b.c(), "red_sand");
        this.a(net.minecraft.a.p.m, hy.a.c(), "sand");
        this.a(net.minecraft.a.p.A, net.minecraft.g.r.b.b(), "chiseled_sandstone");
        this.a(net.minecraft.a.p.A, net.minecraft.g.r.a.b(), "sandstone");
        this.a(net.minecraft.a.p.A, net.minecraft.g.r.c.b(), "smooth_sandstone");
        this.a(net.minecraft.a.p.cM, ev.b.b(), "chiseled_red_sandstone");
        this.a(net.minecraft.a.p.cM, ev.a.b(), "red_sandstone");
        this.a(net.minecraft.a.p.cM, ev.c.b(), "smooth_red_sandstone");
        this.a(net.minecraft.a.p.g, net.minecraft.g.b.e.b(), "acacia_sapling");
        this.a(net.minecraft.a.p.g, net.minecraft.g.b.c.b(), "birch_sapling");
        this.a(net.minecraft.a.p.g, net.minecraft.g.b.f.b(), "dark_oak_sapling");
        this.a(net.minecraft.a.p.g, net.minecraft.g.b.d.b(), "jungle_sapling");
        this.a(net.minecraft.a.p.g, net.minecraft.g.b.a.b(), "oak_sapling");
        this.a(net.minecraft.a.p.g, net.minecraft.g.b.b.b(), "spruce_sapling");
        this.a(net.minecraft.a.p.v, 0, "sponge");
        this.a(net.minecraft.a.p.v, 1, "sponge_wet");
        this.a(net.minecraft.a.p.cG, cd.p.b(), "black_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.l.b(), "blue_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.m.b(), "brown_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.j.b(), "cyan_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.h.b(), "gray_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.n.b(), "green_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.d.b(), "light_blue_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.f.b(), "lime_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.c.b(), "magenta_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.b.b(), "orange_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.g.b(), "pink_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.k.b(), "purple_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.o.b(), "red_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.i.b(), "silver_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.a.b(), "white_stained_glass");
        this.a(net.minecraft.a.p.cG, cd.e.b(), "yellow_stained_glass");
        this.a(net.minecraft.a.p.cH, cd.p.b(), "black_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.l.b(), "blue_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.m.b(), "brown_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.j.b(), "cyan_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.h.b(), "gray_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.n.b(), "green_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.d.b(), "light_blue_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.f.b(), "lime_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.c.b(), "magenta_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.b.b(), "orange_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.g.b(), "pink_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.k.b(), "purple_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.o.b(), "red_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.i.b(), "silver_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.a.b(), "white_stained_glass_pane");
        this.a(net.minecraft.a.p.cH, cd.e.b(), "yellow_stained_glass_pane");
        this.a(net.minecraft.a.p.cu, cd.p.b(), "black_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.l.b(), "blue_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.m.b(), "brown_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.j.b(), "cyan_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.h.b(), "gray_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.n.b(), "green_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.d.b(), "light_blue_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.f.b(), "lime_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.c.b(), "magenta_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.b.b(), "orange_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.g.b(), "pink_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.k.b(), "purple_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.o.b(), "red_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.i.b(), "silver_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.a.b(), "white_stained_hardened_clay");
        this.a(net.minecraft.a.p.cu, cd.e.b(), "yellow_stained_hardened_clay");
        this.a(net.minecraft.a.p.b, db.f.b(), "andesite");
        this.a(net.minecraft.a.p.b, db.g.b(), "andesite_smooth");
        this.a(net.minecraft.a.p.b, db.d.b(), "diorite");
        this.a(net.minecraft.a.p.b, db.e.b(), "diorite_smooth");
        this.a(net.minecraft.a.p.b, db.b.b(), "granite");
        this.a(net.minecraft.a.p.b, db.c.b(), "granite_smooth");
        this.a(net.minecraft.a.p.b, db.a.b(), "stone");
        this.a(net.minecraft.a.p.bf, fd.c.b(), "cracked_stonebrick");
        this.a(net.minecraft.a.p.bf, fd.a.b(), "stonebrick");
        this.a(net.minecraft.a.p.bf, fd.d.b(), "chiseled_stonebrick");
        this.a(net.minecraft.a.p.bf, fd.b.b(), "mossy_stonebrick");
        this.a(net.minecraft.a.p.U, el.e.b(), "brick_slab");
        this.a(net.minecraft.a.p.U, el.d.b(), "cobblestone_slab");
        this.a(net.minecraft.a.p.U, el.c.b(), "old_wood_slab");
        this.a(net.minecraft.a.p.U, el.g.b(), "nether_brick_slab");
        this.a(net.minecraft.a.p.U, el.h.b(), "quartz_slab");
        this.a(net.minecraft.a.p.U, el.b.b(), "sandstone_slab");
        this.a(net.minecraft.a.p.U, el.f.b(), "stone_brick_slab");
        this.a(net.minecraft.a.p.U, el.a.b(), "stone_slab");
        this.a(net.minecraft.a.p.cP, hx.a.b(), "red_sandstone_slab");
        this.a(net.minecraft.a.p.H, net.minecraft.g.t.a.b(), "dead_bush");
        this.a(net.minecraft.a.p.H, net.minecraft.g.t.c.b(), "fern");
        this.a(net.minecraft.a.p.H, net.minecraft.g.t.b.b(), "tall_grass");
        this.a(net.minecraft.a.p.bM, net.minecraft.g.b.e.b(), "acacia_slab");
        this.a(net.minecraft.a.p.bM, net.minecraft.g.b.c.b(), "birch_slab");
        this.a(net.minecraft.a.p.bM, net.minecraft.g.b.f.b(), "dark_oak_slab");
        this.a(net.minecraft.a.p.bM, net.minecraft.g.b.d.b(), "jungle_slab");
        this.a(net.minecraft.a.p.bM, net.minecraft.g.b.a.b(), "oak_slab");
        this.a(net.minecraft.a.p.bM, net.minecraft.g.b.b.b(), "spruce_slab");
        this.a(net.minecraft.a.p.L, cd.p.b(), "black_wool");
        this.a(net.minecraft.a.p.L, cd.l.b(), "blue_wool");
        this.a(net.minecraft.a.p.L, cd.m.b(), "brown_wool");
        this.a(net.minecraft.a.p.L, cd.j.b(), "cyan_wool");
        this.a(net.minecraft.a.p.L, cd.h.b(), "gray_wool");
        this.a(net.minecraft.a.p.L, cd.n.b(), "green_wool");
        this.a(net.minecraft.a.p.L, cd.d.b(), "light_blue_wool");
        this.a(net.minecraft.a.p.L, cd.f.b(), "lime_wool");
        this.a(net.minecraft.a.p.L, cd.c.b(), "magenta_wool");
        this.a(net.minecraft.a.p.L, cd.b.b(), "orange_wool");
        this.a(net.minecraft.a.p.L, cd.g.b(), "pink_wool");
        this.a(net.minecraft.a.p.L, cd.k.b(), "purple_wool");
        this.a(net.minecraft.a.p.L, cd.o.b(), "red_wool");
        this.a(net.minecraft.a.p.L, cd.i.b(), "silver_wool");
        this.a(net.minecraft.a.p.L, cd.a.b(), "white_wool");
        this.a(net.minecraft.a.p.L, cd.e.b(), "yellow_wool");
        this.a(net.minecraft.a.p.ak, "farmland");
        this.a(net.minecraft.a.p.cC, "acacia_stairs");
        this.a(net.minecraft.a.p.cs, "activator_rail");
        this.a(net.minecraft.a.p.bY, "beacon");
        this.a(net.minecraft.a.p.h, "bedrock");
        this.a(net.minecraft.a.p.bV, "birch_stairs");
        this.a(net.minecraft.a.p.X, "bookshelf");
        this.a(net.minecraft.a.p.V, "brick_block");
        this.a(net.minecraft.a.p.V, "brick_block");
        this.a(net.minecraft.a.p.bu, "brick_stairs");
        this.a(net.minecraft.a.p.P, "brown_mushroom");
        this.a(net.minecraft.a.p.aK, "cactus");
        this.a(net.minecraft.a.p.aL, "clay");
        this.a(net.minecraft.a.p.cA, "coal_block");
        this.a(net.minecraft.a.p.q, "coal_ore");
        this.a(net.minecraft.a.p.e, "cobblestone");
        this.a(net.minecraft.a.p.ai, "crafting_table");
        this.a(net.minecraft.a.p.cD, "dark_oak_stairs");
        this.a(net.minecraft.a.p.cl, "daylight_detector");
        this.a(net.minecraft.a.p.I, "dead_bush");
        this.a(net.minecraft.a.p.E, "detector_rail");
        this.a(net.minecraft.a.p.ah, "diamond_block");
        this.a(net.minecraft.a.p.ag, "diamond_ore");
        this.a(net.minecraft.a.p.z, "dispenser");
        this.a(net.minecraft.a.p.ct, "dropper");
        this.a(net.minecraft.a.p.bT, "emerald_block");
        this.a(net.minecraft.a.p.bP, "emerald_ore");
        this.a(net.minecraft.a.p.bC, "enchanting_table");
        this.a(net.minecraft.a.p.bG, "end_portal_frame");
        this.a(net.minecraft.a.p.bH, "end_stone");
        this.a(net.minecraft.a.p.aO, "oak_fence");
        this.a(net.minecraft.a.p.aP, "spruce_fence");
        this.a(net.minecraft.a.p.aQ, "birch_fence");
        this.a(net.minecraft.a.p.aR, "jungle_fence");
        this.a(net.minecraft.a.p.aS, "dark_oak_fence");
        this.a(net.minecraft.a.p.aT, "acacia_fence");
        this.a(net.minecraft.a.p.bo, "oak_fence_gate");
        this.a(net.minecraft.a.p.bp, "spruce_fence_gate");
        this.a(net.minecraft.a.p.bq, "birch_fence_gate");
        this.a(net.minecraft.a.p.br, "jungle_fence_gate");
        this.a(net.minecraft.a.p.bs, "dark_oak_fence_gate");
        this.a(net.minecraft.a.p.bt, "acacia_fence_gate");
        this.a(net.minecraft.a.p.al, "furnace");
        this.a(net.minecraft.a.p.w, "glass");
        this.a(net.minecraft.a.p.bj, "glass_pane");
        this.a(net.minecraft.a.p.aX, "glowstone");
        this.a(net.minecraft.a.p.D, "golden_rail");
        this.a(net.minecraft.a.p.R, "gold_block");
        this.a(net.minecraft.a.p.o, "gold_ore");
        this.a(net.minecraft.a.p.c, "grass");
        this.a(net.minecraft.a.p.da, "grass_path");
        this.a(net.minecraft.a.p.n, "gravel");
        this.a(net.minecraft.a.p.cz, "hardened_clay");
        this.a(net.minecraft.a.p.cx, "hay_block");
        this.a(net.minecraft.a.p.ci, "heavy_weighted_pressure_plate");
        this.a(net.minecraft.a.p.cp, "hopper");
        this.a(net.minecraft.a.p.aI, "ice");
        this.a(net.minecraft.a.p.bi, "iron_bars");
        this.a(net.minecraft.a.p.S, "iron_block");
        this.a(net.minecraft.a.p.p, "iron_ore");
        this.a(net.minecraft.a.p.cw, "iron_trapdoor");
        this.a(net.minecraft.a.p.aN, "jukebox");
        this.a(net.minecraft.a.p.bW, "jungle_stairs");
        this.a(net.minecraft.a.p.au, "ladder");
        this.a(net.minecraft.a.p.y, "lapis_block");
        this.a(net.minecraft.a.p.x, "lapis_ore");
        this.a(net.minecraft.a.p.ay, "lever");
        this.a(net.minecraft.a.p.ch, "light_weighted_pressure_plate");
        this.a(net.minecraft.a.p.aZ, "lit_pumpkin");
        this.a(net.minecraft.a.p.bk, "melon_block");
        this.a(net.minecraft.a.p.Y, "mossy_cobblestone");
        this.a(net.minecraft.a.p.bw, "mycelium");
        this.a(net.minecraft.a.p.aV, "netherrack");
        this.a(net.minecraft.a.p.by, "nether_brick");
        this.a(net.minecraft.a.p.bz, "nether_brick_fence");
        this.a(net.minecraft.a.p.bA, "nether_brick_stairs");
        this.a(net.minecraft.a.p.B, "noteblock");
        this.a(net.minecraft.a.p.ad, "oak_stairs");
        this.a(net.minecraft.a.p.Z, "obsidian");
        this.a(net.minecraft.a.p.cB, "packed_ice");
        this.a(net.minecraft.a.p.J, "piston");
        this.a(net.minecraft.a.p.aU, "pumpkin");
        this.a(net.minecraft.a.p.co, "quartz_ore");
        this.a(net.minecraft.a.p.cr, "quartz_stairs");
        this.a(net.minecraft.a.p.av, "rail");
        this.a(net.minecraft.a.p.cn, "redstone_block");
        this.a(net.minecraft.a.p.bJ, "redstone_lamp");
        this.a(net.minecraft.a.p.aC, "redstone_ore");
        this.a(net.minecraft.a.p.aF, "redstone_torch");
        this.a(net.minecraft.a.p.Q, "red_mushroom");
        this.a(net.minecraft.a.p.bO, "sandstone_stairs");
        this.a(net.minecraft.a.p.cN, "red_sandstone_stairs");
        this.a(net.minecraft.a.p.cJ, "sea_lantern");
        this.a(net.minecraft.a.p.cE, "slime");
        this.a(net.minecraft.a.p.aJ, "snow");
        this.a(net.minecraft.a.p.aH, "snow_layer");
        this.a(net.minecraft.a.p.aW, "soul_sand");
        this.a(net.minecraft.a.p.bU, "spruce_stairs");
        this.a(net.minecraft.a.p.F, "sticky_piston");
        this.a(net.minecraft.a.p.bv, "stone_brick_stairs");
        this.a(net.minecraft.a.p.aG, "stone_button");
        this.a(net.minecraft.a.p.az, "stone_pressure_plate");
        this.a(net.minecraft.a.p.aw, "stone_stairs");
        this.a(net.minecraft.a.p.W, "tnt");
        this.a(net.minecraft.a.p.aa, "torch");
        this.a(net.minecraft.a.p.bd, "trapdoor");
        this.a(net.minecraft.a.p.bR, "tripwire_hook");
        this.a(net.minecraft.a.p.bn, "vine");
        this.a(net.minecraft.a.p.bx, "waterlily");
        this.a(net.minecraft.a.p.G, "web");
        this.a(net.minecraft.a.p.cd, "wooden_button");
        this.a(net.minecraft.a.p.aB, "wooden_pressure_plate");
        this.a(net.minecraft.a.p.N, fh.a.c(), "dandelion");
        this.a(net.minecraft.a.p.cQ, "end_rod");
        this.a(net.minecraft.a.p.cR, "chorus_plant");
        this.a(net.minecraft.a.p.cS, "chorus_flower");
        this.a(net.minecraft.a.p.cT, "purpur_block");
        this.a(net.minecraft.a.p.cU, "purpur_pillar");
        this.a(net.minecraft.a.p.cV, "purpur_stairs");
        this.a(net.minecraft.a.p.cX, "purpur_slab");
        this.a(net.minecraft.a.p.cW, "purpur_double_slab");
        this.a(net.minecraft.a.p.cY, "end_bricks");
        this.a(net.minecraft.a.p.df, "magma");
        this.a(net.minecraft.a.p.dg, "nether_wart_block");
        this.a(net.minecraft.a.p.dh, "red_nether_brick");
        this.a(net.minecraft.a.p.di, "bone_block");
        this.a(net.minecraft.a.p.dj, "structure_void");
        this.a(net.minecraft.a.p.ae, "chest");
        this.a(net.minecraft.a.p.cg, "trapped_chest");
        this.a(net.minecraft.a.p.bQ, "ender_chest");
        this.a(w.a, "iron_shovel");
        this.a(w.b, "iron_pickaxe");
        this.a(w.c, "iron_axe");
        this.a(w.d, "flint_and_steel");
        this.a(w.e, "apple");
        this.a(w.f, "bow");
        this.a(w.g, "arrow");
        this.a(w.h, "spectral_arrow");
        this.a(w.i, "tipped_arrow");
        this.a(w.j, 0, "coal");
        this.a(w.j, 1, "charcoal");
        this.a(w.k, "diamond");
        this.a(w.l, "iron_ingot");
        this.a(w.m, "gold_ingot");
        this.a(w.n, "iron_sword");
        this.a(w.o, "wooden_sword");
        this.a(w.p, "wooden_shovel");
        this.a(w.q, "wooden_pickaxe");
        this.a(w.r, "wooden_axe");
        this.a(w.s, "stone_sword");
        this.a(w.t, "stone_shovel");
        this.a(w.u, "stone_pickaxe");
        this.a(w.v, "stone_axe");
        this.a(w.w, "diamond_sword");
        this.a(w.x, "diamond_shovel");
        this.a(w.y, "diamond_pickaxe");
        this.a(w.z, "diamond_axe");
        this.a(w.A, "stick");
        this.a(w.B, "bowl");
        this.a(w.C, "mushroom_stew");
        this.a(w.D, "golden_sword");
        this.a(w.E, "golden_shovel");
        this.a(w.F, "golden_pickaxe");
        this.a(w.G, "golden_axe");
        this.a(w.H, "string");
        this.a(w.I, "feather");
        this.a(w.J, "gunpowder");
        this.a(w.K, "wooden_hoe");
        this.a(w.L, "stone_hoe");
        this.a(w.M, "iron_hoe");
        this.a(w.N, "diamond_hoe");
        this.a(w.O, "golden_hoe");
        this.a(w.P, "wheat_seeds");
        this.a(w.Q, "wheat");
        this.a(w.R, "bread");
        this.a(w.S, "leather_helmet");
        this.a(w.T, "leather_chestplate");
        this.a(w.U, "leather_leggings");
        this.a(w.V, "leather_boots");
        this.a(w.W, "chainmail_helmet");
        this.a(w.X, "chainmail_chestplate");
        this.a(w.Y, "chainmail_leggings");
        this.a(w.Z, "chainmail_boots");
        this.a(w.aa, "iron_helmet");
        this.a(w.ab, "iron_chestplate");
        this.a(w.ac, "iron_leggings");
        this.a(w.ad, "iron_boots");
        this.a(w.ae, "diamond_helmet");
        this.a(w.af, "diamond_chestplate");
        this.a(w.ag, "diamond_leggings");
        this.a(w.ah, "diamond_boots");
        this.a(w.ai, "golden_helmet");
        this.a(w.aj, "golden_chestplate");
        this.a(w.ak, "golden_leggings");
        this.a(w.al, "golden_boots");
        this.a(w.am, "flint");
        this.a(w.an, "porkchop");
        this.a(w.ao, "cooked_porkchop");
        this.a(w.ap, "painting");
        this.a(w.aq, "golden_apple");
        this.a(w.aq, 1, "golden_apple");
        this.a(w.ar, "sign");
        this.a(w.as, "oak_door");
        this.a(w.at, "spruce_door");
        this.a(w.au, "birch_door");
        this.a(w.av, "jungle_door");
        this.a(w.aw, "acacia_door");
        this.a(w.ax, "dark_oak_door");
        this.a(w.ay, "bucket");
        this.a(w.az, "water_bucket");
        this.a(w.aA, "lava_bucket");
        this.a(w.aB, "minecart");
        this.a(w.aC, "saddle");
        this.a(w.aD, "iron_door");
        this.a(w.aE, "redstone");
        this.a(w.aF, "snowball");
        this.a(w.aG, "oak_boat");
        this.a(w.aH, "spruce_boat");
        this.a(w.aI, "birch_boat");
        this.a(w.aJ, "jungle_boat");
        this.a(w.aK, "acacia_boat");
        this.a(w.aL, "dark_oak_boat");
        this.a(w.aM, "leather");
        this.a(w.aN, "milk_bucket");
        this.a(w.aO, "brick");
        this.a(w.aP, "clay_ball");
        this.a(w.aQ, "reeds");
        this.a(w.aR, "paper");
        this.a(w.aS, "book");
        this.a(w.aT, "slime_ball");
        this.a(w.aU, "chest_minecart");
        this.a(w.aV, "furnace_minecart");
        this.a(w.aW, "egg");
        this.a(w.aX, "compass");
        this.a(w.aY, "fishing_rod");
        this.a(w.aZ, "clock");
        this.a(w.ba, "glowstone_dust");
        this.a(w.bb, dg.a.a(), "cod");
        this.a(w.bb, dg.b.a(), "salmon");
        this.a(w.bb, dg.c.a(), "clownfish");
        this.a(w.bb, dg.d.a(), "pufferfish");
        this.a(w.bc, dg.a.a(), "cooked_cod");
        this.a(w.bc, dg.b.a(), "cooked_salmon");
        this.a(w.bd, cd.p.c(), "dye_black");
        this.a(w.bd, cd.o.c(), "dye_red");
        this.a(w.bd, cd.n.c(), "dye_green");
        this.a(w.bd, cd.m.c(), "dye_brown");
        this.a(w.bd, cd.l.c(), "dye_blue");
        this.a(w.bd, cd.k.c(), "dye_purple");
        this.a(w.bd, cd.j.c(), "dye_cyan");
        this.a(w.bd, cd.i.c(), "dye_silver");
        this.a(w.bd, cd.h.c(), "dye_gray");
        this.a(w.bd, cd.g.c(), "dye_pink");
        this.a(w.bd, cd.f.c(), "dye_lime");
        this.a(w.bd, cd.e.c(), "dye_yellow");
        this.a(w.bd, cd.d.c(), "dye_light_blue");
        this.a(w.bd, cd.c.c(), "dye_magenta");
        this.a(w.bd, cd.b.c(), "dye_orange");
        this.a(w.bd, cd.a.c(), "dye_white");
        this.a(w.be, "bone");
        this.a(w.bf, "sugar");
        this.a(w.bg, "cake");
        this.a(w.bh, "bed");
        this.a(w.bi, "repeater");
        this.a(w.bj, "cookie");
        this.a(w.bl, "shears");
        this.a(w.bm, "melon");
        this.a(w.bn, "pumpkin_seeds");
        this.a(w.bo, "melon_seeds");
        this.a(w.bp, "beef");
        this.a(w.bq, "cooked_beef");
        this.a(w.br, "chicken");
        this.a(w.bs, "cooked_chicken");
        this.a(w.bv, "rabbit");
        this.a(w.bw, "cooked_rabbit");
        this.a(w.bt, "mutton");
        this.a(w.bu, "cooked_mutton");
        this.a(w.by, "rabbit_foot");
        this.a(w.bz, "rabbit_hide");
        this.a(w.bx, "rabbit_stew");
        this.a(w.bA, "rotten_flesh");
        this.a(w.bB, "ender_pearl");
        this.a(w.bC, "blaze_rod");
        this.a(w.bD, "ghast_tear");
        this.a(w.bE, "gold_nugget");
        this.a(w.bF, "nether_wart");
        this.a(w.cV, "beetroot");
        this.a(w.cU, "beetroot_seeds");
        this.a(w.cW, "beetroot_soup");
        this.a(w.bG, "bottle_drinkable");
        this.a(w.bH, "bottle_splash");
        this.a(w.bI, "bottle_lingering");
        this.a(w.bJ, "glass_bottle");
        this.a(w.bK, "dragon_breath");
        this.a(w.bL, "spider_eye");
        this.a(w.bM, "fermented_spider_eye");
        this.a(w.bN, "blaze_powder");
        this.a(w.bO, "magma_cream");
        this.a(w.bP, "brewing_stand");
        this.a(w.bQ, "cauldron");
        this.a(w.bR, "ender_eye");
        this.a(w.bS, "speckled_melon");
        this.d.a(w.bT, new y(this));
        this.a(w.bU, "experience_bottle");
        this.a(w.bV, "fire_charge");
        this.a(w.bW, "writable_book");
        this.a(w.bY, "emerald");
        this.a(w.bZ, "item_frame");
        this.a(w.ca, "flower_pot");
        this.a(w.cb, "carrot");
        this.a(w.cc, "potato");
        this.a(w.cd, "baked_potato");
        this.a(w.ce, "poisonous_potato");
        this.a(w.cf, "map");
        this.a(w.cg, "golden_carrot");
        this.a(w.ch, 0, "skull_skeleton");
        this.a(w.ch, 1, "skull_wither");
        this.a(w.ch, 2, "skull_zombie");
        this.a(w.ch, 3, "skull_char");
        this.a(w.ch, 4, "skull_creeper");
        this.a(w.ch, 5, "skull_dragon");
        this.a(w.ci, "carrot_on_a_stick");
        this.a(w.cj, "nether_star");
        this.a(w.cP, "end_crystal");
        this.a(w.ck, "pumpkin_pie");
        this.a(w.cm, "firework_charge");
        this.a(w.co, "comparator");
        this.a(w.cp, "netherbrick");
        this.a(w.cq, "quartz");
        this.a(w.cr, "tnt_minecart");
        this.a(w.cs, "hopper_minecart");
        this.a(w.ct, "armor_stand");
        this.a(w.cu, "iron_horse_armor");
        this.a(w.cv, "golden_horse_armor");
        this.a(w.cw, "diamond_horse_armor");
        this.a(w.cx, "lead");
        this.a(w.cy, "name_tag");
        this.d.a(w.cO, new net.minecraft.client.g.c(this));
        this.d.a(w.cQ, new k(this));
        this.a(w.cR, "elytra");
        this.a(w.cS, "chorus_fruit");
        this.a(w.cT, "chorus_fruit_popped");
        this.a(w.cA, "record_13");
        this.a(w.cB, "record_cat");
        this.a(w.cC, "record_blocks");
        this.a(w.cD, "record_chirp");
        this.a(w.cE, "record_far");
        this.a(w.cF, "record_mall");
        this.a(w.cG, "record_mellohi");
        this.a(w.cH, "record_stal");
        this.a(w.cI, "record_strad");
        this.a(w.cJ, "record_ward");
        this.a(w.cK, "record_11");
        this.a(w.cL, "record_wait");
        this.a(w.cM, "prismarine_shard");
        this.a(w.cN, "prismarine_crystals");
        this.d.a((cg)w.cn, new net.minecraft.client.g.q(this));
        this.d.a((cg)w.bk, new ck(this));
        this.a(net.minecraft.a.p.bX, "command_block");
        this.a(w.cl, "fireworks");
        this.a(w.cz, "command_block_minecart");
        this.a(net.minecraft.a.p.cv, "barrier");
        this.a(net.minecraft.a.p.ac, "mob_spawner");
        this.a(w.bX, "written_book");
        this.a(net.minecraft.a.p.bg, net.minecraft.g.ck.k.b(), "brown_mushroom_block");
        this.a(net.minecraft.a.p.bh, net.minecraft.g.ck.k.b(), "red_mushroom_block");
        this.a(net.minecraft.a.p.bI, "dragon_egg");
        this.a(net.minecraft.a.p.dc, "repeating_command_block");
        this.a(net.minecraft.a.p.dd, "chain_command_block");
        this.a(net.minecraft.a.p.dk, net.minecraft.f.r.a.b(), "structure_block");
        this.a(net.minecraft.a.p.dk, net.minecraft.f.r.b.b(), "structure_block");
        this.a(net.minecraft.a.p.dk, net.minecraft.f.r.c.b(), "structure_block");
        this.a(net.minecraft.a.p.dk, net.minecraft.f.r.d.b(), "structure_block");
    }

    @Override
    public void a(s s2) {
        this.d.b();
    }
}

