/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bth
implements aoi {
    private static final bpx b = new bpx("textures/misc/enchanted_item_glint.png");
    private boolean c = true;
    public float a;
    private final dbg d;
    private final bnm e;
    private final bkr f;

    public bth(bnm bnm2, wm wm2, bkr bkr2) {
        this.e = bnm2;
        this.d = new dbg(wm2);
        this.b();
        this.f = bkr2;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public dbg a() {
        return this.d;
    }

    protected void a(azg azg2, int n2, String string) {
        this.d.a(azg2, n2, new up(string, "inventory"));
    }

    protected void a(bfa bfa2, int n2, String string) {
        this.a(azg.a(bfa2), n2, string);
    }

    private void a(bfa bfa2, String string) {
        this.a(bfa2, 0, string);
    }

    private void a(azg azg2, String string) {
        this.a(azg2, 0, string);
    }

    private void a(bpi bpi2, bhl bhl2) {
        this.a(bpi2, -1, bhl2);
    }

    private void a(bpi bpi2, int n2) {
        this.a(bpi2, n2, null);
    }

    private void a(bpi bpi2, int n2, bhl bhl2) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.b);
        for (bqk bqk2 : bqk.values()) {
            this.a(bix2, bpi2.a(null, bqk2, 0L), n2, bhl2);
        }
        this.a(bix2, bpi2.a(null, null, 0L), n2, bhl2);
        bha2.b();
    }

    public void a(bhl bhl2, bpi bpi2) {
        if (bhl2 == null) {
            return;
        }
        cja.D();
        cja.c(-0.5f, -0.5f, -0.5f);
        if (bpi2.c()) {
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            cja.A();
            bkx.a.a(bhl2);
        } else {
            this.a(bpi2, bhl2);
            if (bhl2.t()) {
                this.a(bpi2);
            }
        }
        cja.E();
    }

    private void a(bpi bpi2) {
        cja.a(false);
        cja.c(514);
        cja.f();
        cja.a(bjt.n, afi.e);
        this.e.a(b);
        cja.l(5890);
        cja.D();
        cja.b(8.0f, 8.0f, 8.0f);
        float f2 = (float)(bxy.K() % 3000L) / 3000.0f / 8.0f;
        cja.c(f2, 0.0f, 0.0f);
        cja.b(-50.0f, 0.0f, 0.0f, 1.0f);
        this.a(bpi2, -8372020);
        cja.E();
        cja.D();
        cja.b(8.0f, 8.0f, 8.0f);
        float f3 = (float)(bxy.K() % 4873L) / 4873.0f / 8.0f;
        cja.c(-f3, 0.0f, 0.0f);
        cja.b(10.0f, 0.0f, 0.0f, 1.0f);
        this.a(bpi2, -8372020);
        cja.E();
        cja.l(5888);
        cja.a(bjt.l, afi.j);
        cja.e();
        cja.c(515);
        cja.a(true);
        this.e.a(dam.g);
    }

    private void a(bix bix2, crz crz2) {
        cjx cjx2 = crz2.e().n();
        bix2.b(cjx2.a(), cjx2.b(), cjx2.c());
    }

    private void a(bix bix2, crz crz2, int n2) {
        bix2.a(crz2.b());
        bix2.a(n2);
        this.a(bix2, crz2);
    }

    private void a(bix bix2, List list, int n2, bhl bhl2) {
        boolean bl2 = n2 == -1 && bhl2 != null;
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            crz crz2 = (crz)list.get(i2);
            int n4 = n2;
            if (bl2 && crz2.c()) {
                n4 = this.f.a(bhl2, crz2.d());
                if (cwz.a) {
                    n4 = anq.c(n4);
                }
                n4 |= 0xFF000000;
            }
            this.a(bix2, crz2, n4);
        }
    }

    public boolean a(bhl bhl2) {
        bpi bpi2 = this.d.a(bhl2);
        if (bpi2 == null) {
            return false;
        }
        return bpi2.b();
    }

    public void a(bhl bhl2, cua cua2) {
        if (bhl2 == null) {
            return;
        }
        bpi bpi2 = this.a(bhl2, null, null);
        this.a(bhl2, bpi2, cua2, false);
    }

    public bpi a(bhl bhl2, iu iu2, bga bga2) {
        bpi bpi2 = this.d.a(bhl2);
        azg azg2 = bhl2.a();
        if (azg2 == null || !azg2.h()) {
            return bpi2;
        }
        bpx bpx2 = bpi2.f().a(bhl2, iu2, bga2);
        return bpx2 == null ? bpi2 : this.d.a().a(new up(bpx2, "inventory"));
    }

    public void a(bhl bhl2, bga bga2, cua cua2, boolean bl2) {
        if (bhl2 == null || bga2 == null || bhl2.a() == null) {
            return;
        }
        bpi bpi2 = this.a(bhl2, bga2.aQ, bga2);
        this.a(bhl2, bpi2, cua2, bl2);
    }

    protected void a(bhl bhl2, bpi bpi2, cua cua2, boolean bl2) {
        if (bhl2.a() == null) {
            return;
        }
        this.e.a(dam.g);
        this.e.b(dam.g).b(false, false);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.A();
        cja.a(516, 0.1f);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.D();
        dfk dfk2 = bpi2.e();
        dfk.a(dfk2.b(cua2), bl2);
        if (this.a(dfk2.b(cua2))) {
            cja.a(csw.a);
        }
        this.a(bhl2, bpi2);
        cja.a(csw.b);
        cja.E();
        cja.B();
        cja.k();
        this.e.a(dam.g);
        this.e.b(dam.g).d();
    }

    private boolean a(cll cll2) {
        return cll2.d.a < 0.0f ^ cll2.d.b < 0.0f ^ cll2.d.c < 0.0f;
    }

    public void a(bhl bhl2, int n2, int n3) {
        this.a(bhl2, n2, n3, this.a(bhl2, null, null));
    }

    protected void a(bhl bhl2, int n2, int n3, bpi bpi2) {
        cja.D();
        this.e.a(dam.g);
        this.e.b(dam.g).b(false, false);
        cja.A();
        cja.d();
        cja.a(516, 0.1f);
        cja.l();
        cja.a(bjt.l, afi.j);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(n2, n3, bpi2.b());
        bpi2.e().a(cua.g);
        this.a(bhl2, bpi2);
        cja.c();
        cja.B();
        cja.f();
        cja.E();
        this.e.a(dam.g);
        this.e.b(dam.g).d();
    }

    private void a(int n2, int n3, boolean bl2) {
        cja.c((float)n2, (float)n3, 100.0f + this.a);
        cja.c(8.0f, 8.0f, 0.0f);
        cja.b(1.0f, -1.0f, 1.0f);
        cja.b(16.0f, 16.0f, 16.0f);
        if (bl2) {
            cja.e();
        } else {
            cja.f();
        }
    }

    public void b(bhl bhl2, int n2, int n3) {
        this.a(bxy.B().h, bhl2, n2, n3);
    }

    public void a(bga bga2, bhl bhl2, int n2, int n3) {
        if (bhl2 == null || bhl2.a() == null) {
            return;
        }
        this.a += 50.0f;
        try {
            this.a(bhl2, n2, n3, this.a(bhl2, null, bga2));
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Rendering item");
            sx sx2 = cet2.a("Item being rendered");
            sx2.a("Item Type", new cdc(this, bhl2));
            sx2.a("Item Aux", new bja(this, bhl2));
            sx2.a("Item NBT", new fk(this, bhl2));
            sx2.a("Item Foil", new bg(this, bhl2));
            throw new oz(cet2);
        }
        this.a -= 50.0f;
    }

    public void a(deb deb2, bhl bhl2, int n2, int n3) {
        this.a(deb2, bhl2, n2, n3, null);
    }

    public void a(deb deb2, bhl bhl2, int n2, int n3, String string) {
        ob ob2;
        float f2;
        bix bix2;
        bha bha2;
        if (bhl2 == null) {
            return;
        }
        if (bhl2.b != 1 || string != null) {
            String string2;
            String string3 = string2 = string == null ? String.valueOf(bhl2.b) : string;
            if (string == null && bhl2.b < 1) {
                string2 = (Object)((Object)aug.m) + String.valueOf(bhl2.b);
            }
            cja.f();
            cja.i();
            cja.k();
            deb2.a(string2, (float)(n2 + 19 - 2 - deb2.a(string2)), (float)(n3 + 6 + 3), 0xFFFFFF);
            cja.e();
            cja.j();
        }
        if (bhl2.f()) {
            int n4 = (int)Math.round(13.0 - (double)bhl2.g() * 13.0 / (double)bhl2.i());
            int n5 = (int)Math.round(255.0 - (double)bhl2.g() * 255.0 / (double)bhl2.i());
            cja.f();
            cja.i();
            cja.w();
            cja.c();
            cja.k();
            bha2 = bha.a();
            bix2 = bha2.c();
            this.a(bix2, n2 + 2, n3 + 13, 13, 2, 0, 0, 0, 255);
            this.a(bix2, n2 + 2, n3 + 13, 12, 1, (255 - n5) / 4, 64, 0, 255);
            this.a(bix2, n2 + 2, n3 + 13, n4, 1, 255 - n5, n5, 0, 255);
            cja.l();
            cja.d();
            cja.v();
            cja.e();
            cja.j();
        }
        float f3 = f2 = (ob2 = bxy.B().h) == null ? 0.0f : ob2.aS().a(bhl2.a(), bxy.B().ak());
        if (f2 > 0.0f) {
            cja.f();
            cja.i();
            cja.w();
            bha2 = bha.a();
            bix2 = bha2.c();
            this.a(bix2, n2, n3 + cmk.d(16.0f * (1.0f - f2)), 16, cmk.f(16.0f * f2), 255, 255, 255, 127);
            cja.v();
            cja.e();
            cja.j();
        }
    }

    private void a(bix bix2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        bix2.a(7, bxb.f);
        bix2.b((double)(n2 + 0), (double)(n3 + 0), 0.0).b(n6, n7, n8, n9).d();
        bix2.b((double)(n2 + 0), (double)(n3 + n5), 0.0).b(n6, n7, n8, n9).d();
        bix2.b((double)(n2 + n4), (double)(n3 + n5), 0.0).b(n6, n7, n8, n9).d();
        bix2.b((double)(n2 + n4), (double)(n3 + 0), 0.0).b(n6, n7, n8, n9).d();
        bha.a().b();
    }

    private void b() {
        this.a(blg.cf, "anvil_intact");
        this.a(blg.cf, 1, "anvil_slightly_damaged");
        this.a(blg.cf, 2, "anvil_very_damaged");
        this.a(blg.cy, dck.p.b(), "black_carpet");
        this.a(blg.cy, dck.l.b(), "blue_carpet");
        this.a(blg.cy, dck.m.b(), "brown_carpet");
        this.a(blg.cy, dck.j.b(), "cyan_carpet");
        this.a(blg.cy, dck.h.b(), "gray_carpet");
        this.a(blg.cy, dck.n.b(), "green_carpet");
        this.a(blg.cy, dck.d.b(), "light_blue_carpet");
        this.a(blg.cy, dck.f.b(), "lime_carpet");
        this.a(blg.cy, dck.c.b(), "magenta_carpet");
        this.a(blg.cy, dck.b.b(), "orange_carpet");
        this.a(blg.cy, dck.g.b(), "pink_carpet");
        this.a(blg.cy, dck.k.b(), "purple_carpet");
        this.a(blg.cy, dck.o.b(), "red_carpet");
        this.a(blg.cy, dck.i.b(), "silver_carpet");
        this.a(blg.cy, dck.a.b(), "white_carpet");
        this.a(blg.cy, dck.e.b(), "yellow_carpet");
        this.a(blg.bZ, wv.b.b(), "mossy_cobblestone_wall");
        this.a(blg.bZ, wv.a.b(), "cobblestone_wall");
        this.a(blg.d, dgu.b.b(), "coarse_dirt");
        this.a(blg.d, dgu.a.b(), "dirt");
        this.a(blg.d, dgu.c.b(), "podzol");
        this.a(blg.cF, bon.d.b(), "double_fern");
        this.a(blg.cF, bon.c.b(), "double_grass");
        this.a(blg.cF, bon.f.b(), "paeonia");
        this.a(blg.cF, bon.e.b(), "double_rose");
        this.a(blg.cF, bon.a.b(), "sunflower");
        this.a(blg.cF, bon.b.b(), "syringa");
        this.a(blg.t, zg.c.b(), "birch_leaves");
        this.a(blg.t, zg.d.b(), "jungle_leaves");
        this.a(blg.t, zg.a.b(), "oak_leaves");
        this.a(blg.t, zg.b.b(), "spruce_leaves");
        this.a(blg.u, zg.e.b() - 4, "acacia_leaves");
        this.a(blg.u, zg.f.b() - 4, "dark_oak_leaves");
        this.a(blg.r, zg.c.b(), "birch_log");
        this.a(blg.r, zg.d.b(), "jungle_log");
        this.a(blg.r, zg.a.b(), "oak_log");
        this.a(blg.r, zg.b.b(), "spruce_log");
        this.a(blg.s, zg.e.b() - 4, "acacia_log");
        this.a(blg.s, zg.f.b() - 4, "dark_oak_log");
        this.a(blg.be, btc.f.c(), "chiseled_brick_monster_egg");
        this.a(blg.be, btc.b.c(), "cobblestone_monster_egg");
        this.a(blg.be, btc.e.c(), "cracked_brick_monster_egg");
        this.a(blg.be, btc.d.c(), "mossy_brick_monster_egg");
        this.a(blg.be, btc.a.c(), "stone_monster_egg");
        this.a(blg.be, btc.c.c(), "stone_brick_monster_egg");
        this.a(blg.f, zg.e.b(), "acacia_planks");
        this.a(blg.f, zg.c.b(), "birch_planks");
        this.a(blg.f, zg.f.b(), "dark_oak_planks");
        this.a(blg.f, zg.d.b(), "jungle_planks");
        this.a(blg.f, zg.a.b(), "oak_planks");
        this.a(blg.f, zg.b.b(), "spruce_planks");
        this.a(blg.cI, bzb.b.b(), "prismarine_bricks");
        this.a(blg.cI, bzb.c.b(), "dark_prismarine");
        this.a(blg.cI, bzb.a.b(), "prismarine");
        this.a(blg.cq, bjn.b.b(), "chiseled_quartz_block");
        this.a(blg.cq, bjn.a.b(), "quartz_block");
        this.a(blg.cq, bjn.c.b(), "quartz_column");
        this.a(blg.O, amt.d.c(), "allium");
        this.a(blg.O, amt.c.c(), "blue_orchid");
        this.a(blg.O, amt.e.c(), "houstonia");
        this.a(blg.O, amt.g.c(), "orange_tulip");
        this.a(blg.O, amt.j.c(), "oxeye_daisy");
        this.a(blg.O, amt.i.c(), "pink_tulip");
        this.a(blg.O, amt.b.c(), "poppy");
        this.a(blg.O, amt.f.c(), "red_tulip");
        this.a(blg.O, amt.h.c(), "white_tulip");
        this.a(blg.m, aac.b.c(), "red_sand");
        this.a(blg.m, aac.a.c(), "sand");
        this.a(blg.A, byr.b.b(), "chiseled_sandstone");
        this.a(blg.A, byr.a.b(), "sandstone");
        this.a(blg.A, byr.c.b(), "smooth_sandstone");
        this.a(blg.cM, byj.b.b(), "chiseled_red_sandstone");
        this.a(blg.cM, byj.a.b(), "red_sandstone");
        this.a(blg.cM, byj.c.b(), "smooth_red_sandstone");
        this.a(blg.g, zg.e.b(), "acacia_sapling");
        this.a(blg.g, zg.c.b(), "birch_sapling");
        this.a(blg.g, zg.f.b(), "dark_oak_sapling");
        this.a(blg.g, zg.d.b(), "jungle_sapling");
        this.a(blg.g, zg.a.b(), "oak_sapling");
        this.a(blg.g, zg.b.b(), "spruce_sapling");
        this.a(blg.v, 0, "sponge");
        this.a(blg.v, 1, "sponge_wet");
        this.a(blg.cG, dck.p.b(), "black_stained_glass");
        this.a(blg.cG, dck.l.b(), "blue_stained_glass");
        this.a(blg.cG, dck.m.b(), "brown_stained_glass");
        this.a(blg.cG, dck.j.b(), "cyan_stained_glass");
        this.a(blg.cG, dck.h.b(), "gray_stained_glass");
        this.a(blg.cG, dck.n.b(), "green_stained_glass");
        this.a(blg.cG, dck.d.b(), "light_blue_stained_glass");
        this.a(blg.cG, dck.f.b(), "lime_stained_glass");
        this.a(blg.cG, dck.c.b(), "magenta_stained_glass");
        this.a(blg.cG, dck.b.b(), "orange_stained_glass");
        this.a(blg.cG, dck.g.b(), "pink_stained_glass");
        this.a(blg.cG, dck.k.b(), "purple_stained_glass");
        this.a(blg.cG, dck.o.b(), "red_stained_glass");
        this.a(blg.cG, dck.i.b(), "silver_stained_glass");
        this.a(blg.cG, dck.a.b(), "white_stained_glass");
        this.a(blg.cG, dck.e.b(), "yellow_stained_glass");
        this.a(blg.cH, dck.p.b(), "black_stained_glass_pane");
        this.a(blg.cH, dck.l.b(), "blue_stained_glass_pane");
        this.a(blg.cH, dck.m.b(), "brown_stained_glass_pane");
        this.a(blg.cH, dck.j.b(), "cyan_stained_glass_pane");
        this.a(blg.cH, dck.h.b(), "gray_stained_glass_pane");
        this.a(blg.cH, dck.n.b(), "green_stained_glass_pane");
        this.a(blg.cH, dck.d.b(), "light_blue_stained_glass_pane");
        this.a(blg.cH, dck.f.b(), "lime_stained_glass_pane");
        this.a(blg.cH, dck.c.b(), "magenta_stained_glass_pane");
        this.a(blg.cH, dck.b.b(), "orange_stained_glass_pane");
        this.a(blg.cH, dck.g.b(), "pink_stained_glass_pane");
        this.a(blg.cH, dck.k.b(), "purple_stained_glass_pane");
        this.a(blg.cH, dck.o.b(), "red_stained_glass_pane");
        this.a(blg.cH, dck.i.b(), "silver_stained_glass_pane");
        this.a(blg.cH, dck.a.b(), "white_stained_glass_pane");
        this.a(blg.cH, dck.e.b(), "yellow_stained_glass_pane");
        this.a(blg.cu, dck.p.b(), "black_stained_hardened_clay");
        this.a(blg.cu, dck.l.b(), "blue_stained_hardened_clay");
        this.a(blg.cu, dck.m.b(), "brown_stained_hardened_clay");
        this.a(blg.cu, dck.j.b(), "cyan_stained_hardened_clay");
        this.a(blg.cu, dck.h.b(), "gray_stained_hardened_clay");
        this.a(blg.cu, dck.n.b(), "green_stained_hardened_clay");
        this.a(blg.cu, dck.d.b(), "light_blue_stained_hardened_clay");
        this.a(blg.cu, dck.f.b(), "lime_stained_hardened_clay");
        this.a(blg.cu, dck.c.b(), "magenta_stained_hardened_clay");
        this.a(blg.cu, dck.b.b(), "orange_stained_hardened_clay");
        this.a(blg.cu, dck.g.b(), "pink_stained_hardened_clay");
        this.a(blg.cu, dck.k.b(), "purple_stained_hardened_clay");
        this.a(blg.cu, dck.o.b(), "red_stained_hardened_clay");
        this.a(blg.cu, dck.i.b(), "silver_stained_hardened_clay");
        this.a(blg.cu, dck.a.b(), "white_stained_hardened_clay");
        this.a(blg.cu, dck.e.b(), "yellow_stained_hardened_clay");
        this.a(blg.b, ade.f.b(), "andesite");
        this.a(blg.b, ade.g.b(), "andesite_smooth");
        this.a(blg.b, ade.d.b(), "diorite");
        this.a(blg.b, ade.e.b(), "diorite_smooth");
        this.a(blg.b, ade.b.b(), "granite");
        this.a(blg.b, ade.c.b(), "granite_smooth");
        this.a(blg.b, ade.a.b(), "stone");
        this.a(blg.bf, crt.c.b(), "cracked_stonebrick");
        this.a(blg.bf, crt.a.b(), "stonebrick");
        this.a(blg.bf, crt.d.b(), "chiseled_stonebrick");
        this.a(blg.bf, crt.b.b(), "mossy_stonebrick");
        this.a(blg.U, cev.e.b(), "brick_slab");
        this.a(blg.U, cev.d.b(), "cobblestone_slab");
        this.a(blg.U, cev.c.b(), "old_wood_slab");
        this.a(blg.U, cev.g.b(), "nether_brick_slab");
        this.a(blg.U, cev.h.b(), "quartz_slab");
        this.a(blg.U, cev.b.b(), "sandstone_slab");
        this.a(blg.U, cev.f.b(), "stone_brick_slab");
        this.a(blg.U, cev.a.b(), "stone_slab");
        this.a(blg.cP, dgk.a.b(), "red_sandstone_slab");
        this.a(blg.H, deq.a.b(), "dead_bush");
        this.a(blg.H, deq.c.b(), "fern");
        this.a(blg.H, deq.b.b(), "tall_grass");
        this.a(blg.bM, zg.e.b(), "acacia_slab");
        this.a(blg.bM, zg.c.b(), "birch_slab");
        this.a(blg.bM, zg.f.b(), "dark_oak_slab");
        this.a(blg.bM, zg.d.b(), "jungle_slab");
        this.a(blg.bM, zg.a.b(), "oak_slab");
        this.a(blg.bM, zg.b.b(), "spruce_slab");
        this.a(blg.L, dck.p.b(), "black_wool");
        this.a(blg.L, dck.l.b(), "blue_wool");
        this.a(blg.L, dck.m.b(), "brown_wool");
        this.a(blg.L, dck.j.b(), "cyan_wool");
        this.a(blg.L, dck.h.b(), "gray_wool");
        this.a(blg.L, dck.n.b(), "green_wool");
        this.a(blg.L, dck.d.b(), "light_blue_wool");
        this.a(blg.L, dck.f.b(), "lime_wool");
        this.a(blg.L, dck.c.b(), "magenta_wool");
        this.a(blg.L, dck.b.b(), "orange_wool");
        this.a(blg.L, dck.g.b(), "pink_wool");
        this.a(blg.L, dck.k.b(), "purple_wool");
        this.a(blg.L, dck.o.b(), "red_wool");
        this.a(blg.L, dck.i.b(), "silver_wool");
        this.a(blg.L, dck.a.b(), "white_wool");
        this.a(blg.L, dck.e.b(), "yellow_wool");
        this.a(blg.ak, "farmland");
        this.a(blg.cC, "acacia_stairs");
        this.a(blg.cs, "activator_rail");
        this.a(blg.bY, "beacon");
        this.a(blg.h, "bedrock");
        this.a(blg.bV, "birch_stairs");
        this.a(blg.X, "bookshelf");
        this.a(blg.V, "brick_block");
        this.a(blg.V, "brick_block");
        this.a(blg.bu, "brick_stairs");
        this.a(blg.P, "brown_mushroom");
        this.a(blg.aK, "cactus");
        this.a(blg.aL, "clay");
        this.a(blg.cA, "coal_block");
        this.a(blg.q, "coal_ore");
        this.a(blg.e, "cobblestone");
        this.a(blg.ai, "crafting_table");
        this.a(blg.cD, "dark_oak_stairs");
        this.a(blg.cl, "daylight_detector");
        this.a(blg.I, "dead_bush");
        this.a(blg.E, "detector_rail");
        this.a(blg.ah, "diamond_block");
        this.a(blg.ag, "diamond_ore");
        this.a(blg.z, "dispenser");
        this.a(blg.ct, "dropper");
        this.a(blg.bT, "emerald_block");
        this.a(blg.bP, "emerald_ore");
        this.a(blg.bC, "enchanting_table");
        this.a(blg.bG, "end_portal_frame");
        this.a(blg.bH, "end_stone");
        this.a(blg.aO, "oak_fence");
        this.a(blg.aP, "spruce_fence");
        this.a(blg.aQ, "birch_fence");
        this.a(blg.aR, "jungle_fence");
        this.a(blg.aS, "dark_oak_fence");
        this.a(blg.aT, "acacia_fence");
        this.a(blg.bo, "oak_fence_gate");
        this.a(blg.bp, "spruce_fence_gate");
        this.a(blg.bq, "birch_fence_gate");
        this.a(blg.br, "jungle_fence_gate");
        this.a(blg.bs, "dark_oak_fence_gate");
        this.a(blg.bt, "acacia_fence_gate");
        this.a(blg.al, "furnace");
        this.a(blg.w, "glass");
        this.a(blg.bj, "glass_pane");
        this.a(blg.aX, "glowstone");
        this.a(blg.D, "golden_rail");
        this.a(blg.R, "gold_block");
        this.a(blg.o, "gold_ore");
        this.a(blg.c, "grass");
        this.a(blg.da, "grass_path");
        this.a(blg.n, "gravel");
        this.a(blg.cz, "hardened_clay");
        this.a(blg.cx, "hay_block");
        this.a(blg.ci, "heavy_weighted_pressure_plate");
        this.a(blg.cp, "hopper");
        this.a(blg.aI, "ice");
        this.a(blg.bi, "iron_bars");
        this.a(blg.S, "iron_block");
        this.a(blg.p, "iron_ore");
        this.a(blg.cw, "iron_trapdoor");
        this.a(blg.aN, "jukebox");
        this.a(blg.bW, "jungle_stairs");
        this.a(blg.au, "ladder");
        this.a(blg.y, "lapis_block");
        this.a(blg.x, "lapis_ore");
        this.a(blg.ay, "lever");
        this.a(blg.ch, "light_weighted_pressure_plate");
        this.a(blg.aZ, "lit_pumpkin");
        this.a(blg.bk, "melon_block");
        this.a(blg.Y, "mossy_cobblestone");
        this.a(blg.bw, "mycelium");
        this.a(blg.aV, "netherrack");
        this.a(blg.by, "nether_brick");
        this.a(blg.bz, "nether_brick_fence");
        this.a(blg.bA, "nether_brick_stairs");
        this.a(blg.B, "noteblock");
        this.a(blg.ad, "oak_stairs");
        this.a(blg.Z, "obsidian");
        this.a(blg.cB, "packed_ice");
        this.a(blg.J, "piston");
        this.a(blg.aU, "pumpkin");
        this.a(blg.co, "quartz_ore");
        this.a(blg.cr, "quartz_stairs");
        this.a(blg.av, "rail");
        this.a(blg.cn, "redstone_block");
        this.a(blg.bJ, "redstone_lamp");
        this.a(blg.aC, "redstone_ore");
        this.a(blg.aF, "redstone_torch");
        this.a(blg.Q, "red_mushroom");
        this.a(blg.bO, "sandstone_stairs");
        this.a(blg.cN, "red_sandstone_stairs");
        this.a(blg.cJ, "sea_lantern");
        this.a(blg.cE, "slime");
        this.a(blg.aJ, "snow");
        this.a(blg.aH, "snow_layer");
        this.a(blg.aW, "soul_sand");
        this.a(blg.bU, "spruce_stairs");
        this.a(blg.F, "sticky_piston");
        this.a(blg.bv, "stone_brick_stairs");
        this.a(blg.aG, "stone_button");
        this.a(blg.az, "stone_pressure_plate");
        this.a(blg.aw, "stone_stairs");
        this.a(blg.W, "tnt");
        this.a(blg.aa, "torch");
        this.a(blg.bd, "trapdoor");
        this.a(blg.bR, "tripwire_hook");
        this.a(blg.bn, "vine");
        this.a(blg.bx, "waterlily");
        this.a(blg.G, "web");
        this.a(blg.cd, "wooden_button");
        this.a(blg.aB, "wooden_pressure_plate");
        this.a(blg.N, amt.a.c(), "dandelion");
        this.a(blg.cQ, "end_rod");
        this.a(blg.cR, "chorus_plant");
        this.a(blg.cS, "chorus_flower");
        this.a(blg.cT, "purpur_block");
        this.a(blg.cU, "purpur_pillar");
        this.a(blg.cV, "purpur_stairs");
        this.a(blg.cX, "purpur_slab");
        this.a(blg.cW, "purpur_double_slab");
        this.a(blg.cY, "end_bricks");
        this.a(blg.df, "magma");
        this.a(blg.dg, "nether_wart_block");
        this.a(blg.dh, "red_nether_brick");
        this.a(blg.di, "bone_block");
        this.a(blg.dj, "structure_void");
        this.a(blg.ae, "chest");
        this.a(blg.cg, "trapped_chest");
        this.a(blg.bQ, "ender_chest");
        this.a(hp.a, "iron_shovel");
        this.a(hp.b, "iron_pickaxe");
        this.a(hp.c, "iron_axe");
        this.a(hp.d, "flint_and_steel");
        this.a(hp.e, "apple");
        this.a(hp.f, "bow");
        this.a(hp.g, "arrow");
        this.a(hp.h, "spectral_arrow");
        this.a(hp.i, "tipped_arrow");
        this.a(hp.j, 0, "coal");
        this.a(hp.j, 1, "charcoal");
        this.a(hp.k, "diamond");
        this.a(hp.l, "iron_ingot");
        this.a(hp.m, "gold_ingot");
        this.a(hp.n, "iron_sword");
        this.a(hp.o, "wooden_sword");
        this.a(hp.p, "wooden_shovel");
        this.a(hp.q, "wooden_pickaxe");
        this.a(hp.r, "wooden_axe");
        this.a(hp.s, "stone_sword");
        this.a(hp.t, "stone_shovel");
        this.a(hp.u, "stone_pickaxe");
        this.a(hp.v, "stone_axe");
        this.a(hp.w, "diamond_sword");
        this.a(hp.x, "diamond_shovel");
        this.a(hp.y, "diamond_pickaxe");
        this.a(hp.z, "diamond_axe");
        this.a(hp.A, "stick");
        this.a(hp.B, "bowl");
        this.a(hp.C, "mushroom_stew");
        this.a(hp.D, "golden_sword");
        this.a(hp.E, "golden_shovel");
        this.a(hp.F, "golden_pickaxe");
        this.a(hp.G, "golden_axe");
        this.a(hp.H, "string");
        this.a(hp.I, "feather");
        this.a(hp.J, "gunpowder");
        this.a(hp.K, "wooden_hoe");
        this.a(hp.L, "stone_hoe");
        this.a(hp.M, "iron_hoe");
        this.a(hp.N, "diamond_hoe");
        this.a(hp.O, "golden_hoe");
        this.a(hp.P, "wheat_seeds");
        this.a(hp.Q, "wheat");
        this.a(hp.R, "bread");
        this.a(hp.S, "leather_helmet");
        this.a(hp.T, "leather_chestplate");
        this.a(hp.U, "leather_leggings");
        this.a(hp.V, "leather_boots");
        this.a(hp.W, "chainmail_helmet");
        this.a(hp.X, "chainmail_chestplate");
        this.a(hp.Y, "chainmail_leggings");
        this.a(hp.Z, "chainmail_boots");
        this.a(hp.aa, "iron_helmet");
        this.a(hp.ab, "iron_chestplate");
        this.a(hp.ac, "iron_leggings");
        this.a(hp.ad, "iron_boots");
        this.a(hp.ae, "diamond_helmet");
        this.a(hp.af, "diamond_chestplate");
        this.a(hp.ag, "diamond_leggings");
        this.a(hp.ah, "diamond_boots");
        this.a(hp.ai, "golden_helmet");
        this.a(hp.aj, "golden_chestplate");
        this.a(hp.ak, "golden_leggings");
        this.a(hp.al, "golden_boots");
        this.a(hp.am, "flint");
        this.a(hp.an, "porkchop");
        this.a(hp.ao, "cooked_porkchop");
        this.a(hp.ap, "painting");
        this.a(hp.aq, "golden_apple");
        this.a(hp.aq, 1, "golden_apple");
        this.a(hp.ar, "sign");
        this.a(hp.as, "oak_door");
        this.a(hp.at, "spruce_door");
        this.a(hp.au, "birch_door");
        this.a(hp.av, "jungle_door");
        this.a(hp.aw, "acacia_door");
        this.a(hp.ax, "dark_oak_door");
        this.a(hp.ay, "bucket");
        this.a(hp.az, "water_bucket");
        this.a(hp.aA, "lava_bucket");
        this.a(hp.aB, "minecart");
        this.a(hp.aC, "saddle");
        this.a(hp.aD, "iron_door");
        this.a(hp.aE, "redstone");
        this.a(hp.aF, "snowball");
        this.a(hp.aG, "oak_boat");
        this.a(hp.aH, "spruce_boat");
        this.a(hp.aI, "birch_boat");
        this.a(hp.aJ, "jungle_boat");
        this.a(hp.aK, "acacia_boat");
        this.a(hp.aL, "dark_oak_boat");
        this.a(hp.aM, "leather");
        this.a(hp.aN, "milk_bucket");
        this.a(hp.aO, "brick");
        this.a(hp.aP, "clay_ball");
        this.a(hp.aQ, "reeds");
        this.a(hp.aR, "paper");
        this.a(hp.aS, "book");
        this.a(hp.aT, "slime_ball");
        this.a(hp.aU, "chest_minecart");
        this.a(hp.aV, "furnace_minecart");
        this.a(hp.aW, "egg");
        this.a(hp.aX, "compass");
        this.a(hp.aY, "fishing_rod");
        this.a(hp.aZ, "clock");
        this.a(hp.ba, "glowstone_dust");
        this.a(hp.bb, aty.a.a(), "cod");
        this.a(hp.bb, aty.b.a(), "salmon");
        this.a(hp.bb, aty.c.a(), "clownfish");
        this.a(hp.bb, aty.d.a(), "pufferfish");
        this.a(hp.bc, aty.a.a(), "cooked_cod");
        this.a(hp.bc, aty.b.a(), "cooked_salmon");
        this.a(hp.bd, dck.p.c(), "dye_black");
        this.a(hp.bd, dck.o.c(), "dye_red");
        this.a(hp.bd, dck.n.c(), "dye_green");
        this.a(hp.bd, dck.m.c(), "dye_brown");
        this.a(hp.bd, dck.l.c(), "dye_blue");
        this.a(hp.bd, dck.k.c(), "dye_purple");
        this.a(hp.bd, dck.j.c(), "dye_cyan");
        this.a(hp.bd, dck.i.c(), "dye_silver");
        this.a(hp.bd, dck.h.c(), "dye_gray");
        this.a(hp.bd, dck.g.c(), "dye_pink");
        this.a(hp.bd, dck.f.c(), "dye_lime");
        this.a(hp.bd, dck.e.c(), "dye_yellow");
        this.a(hp.bd, dck.d.c(), "dye_light_blue");
        this.a(hp.bd, dck.c.c(), "dye_magenta");
        this.a(hp.bd, dck.b.c(), "dye_orange");
        this.a(hp.bd, dck.a.c(), "dye_white");
        this.a(hp.be, "bone");
        this.a(hp.bf, "sugar");
        this.a(hp.bg, "cake");
        this.a(hp.bh, "bed");
        this.a(hp.bi, "repeater");
        this.a(hp.bj, "cookie");
        this.a(hp.bl, "shears");
        this.a(hp.bm, "melon");
        this.a(hp.bn, "pumpkin_seeds");
        this.a(hp.bo, "melon_seeds");
        this.a(hp.bp, "beef");
        this.a(hp.bq, "cooked_beef");
        this.a(hp.br, "chicken");
        this.a(hp.bs, "cooked_chicken");
        this.a(hp.bv, "rabbit");
        this.a(hp.bw, "cooked_rabbit");
        this.a(hp.bt, "mutton");
        this.a(hp.bu, "cooked_mutton");
        this.a(hp.by, "rabbit_foot");
        this.a(hp.bz, "rabbit_hide");
        this.a(hp.bx, "rabbit_stew");
        this.a(hp.bA, "rotten_flesh");
        this.a(hp.bB, "ender_pearl");
        this.a(hp.bC, "blaze_rod");
        this.a(hp.bD, "ghast_tear");
        this.a(hp.bE, "gold_nugget");
        this.a(hp.bF, "nether_wart");
        this.a(hp.cV, "beetroot");
        this.a(hp.cU, "beetroot_seeds");
        this.a(hp.cW, "beetroot_soup");
        this.a(hp.bG, "bottle_drinkable");
        this.a(hp.bH, "bottle_splash");
        this.a(hp.bI, "bottle_lingering");
        this.a(hp.bJ, "glass_bottle");
        this.a(hp.bK, "dragon_breath");
        this.a(hp.bL, "spider_eye");
        this.a(hp.bM, "fermented_spider_eye");
        this.a(hp.bN, "blaze_powder");
        this.a(hp.bO, "magma_cream");
        this.a(hp.bP, "brewing_stand");
        this.a(hp.bQ, "cauldron");
        this.a(hp.bR, "ender_eye");
        this.a(hp.bS, "speckled_melon");
        this.d.a(hp.bT, new aef(this));
        this.a(hp.bU, "experience_bottle");
        this.a(hp.bV, "fire_charge");
        this.a(hp.bW, "writable_book");
        this.a(hp.bY, "emerald");
        this.a(hp.bZ, "item_frame");
        this.a(hp.ca, "flower_pot");
        this.a(hp.cb, "carrot");
        this.a(hp.cc, "potato");
        this.a(hp.cd, "baked_potato");
        this.a(hp.ce, "poisonous_potato");
        this.a(hp.cf, "map");
        this.a(hp.cg, "golden_carrot");
        this.a(hp.ch, 0, "skull_skeleton");
        this.a(hp.ch, 1, "skull_wither");
        this.a(hp.ch, 2, "skull_zombie");
        this.a(hp.ch, 3, "skull_char");
        this.a(hp.ch, 4, "skull_creeper");
        this.a(hp.ch, 5, "skull_dragon");
        this.a(hp.ci, "carrot_on_a_stick");
        this.a(hp.cj, "nether_star");
        this.a(hp.cP, "end_crystal");
        this.a(hp.ck, "pumpkin_pie");
        this.a(hp.cm, "firework_charge");
        this.a(hp.co, "comparator");
        this.a(hp.cp, "netherbrick");
        this.a(hp.cq, "quartz");
        this.a(hp.cr, "tnt_minecart");
        this.a(hp.cs, "hopper_minecart");
        this.a(hp.ct, "armor_stand");
        this.a(hp.cu, "iron_horse_armor");
        this.a(hp.cv, "golden_horse_armor");
        this.a(hp.cw, "diamond_horse_armor");
        this.a(hp.cx, "lead");
        this.a(hp.cy, "name_tag");
        this.d.a(hp.cO, new cbo(this));
        this.d.a(hp.cQ, new ckt(this));
        this.a(hp.cR, "elytra");
        this.a(hp.cS, "chorus_fruit");
        this.a(hp.cT, "chorus_fruit_popped");
        this.a(hp.cA, "record_13");
        this.a(hp.cB, "record_cat");
        this.a(hp.cC, "record_blocks");
        this.a(hp.cD, "record_chirp");
        this.a(hp.cE, "record_far");
        this.a(hp.cF, "record_mall");
        this.a(hp.cG, "record_mellohi");
        this.a(hp.cH, "record_stal");
        this.a(hp.cI, "record_strad");
        this.a(hp.cJ, "record_ward");
        this.a(hp.cK, "record_11");
        this.a(hp.cL, "record_wait");
        this.a(hp.cM, "prismarine_shard");
        this.a(hp.cN, "prismarine_crystals");
        this.d.a((azg)hp.cn, new cdj(this));
        this.d.a((azg)hp.bk, new qj(this));
        this.a(blg.bX, "command_block");
        this.a(hp.cl, "fireworks");
        this.a(hp.cz, "command_block_minecart");
        this.a(blg.cv, "barrier");
        this.a(blg.ac, "mob_spawner");
        this.a(hp.bX, "written_book");
        this.a(blg.bg, afg.k.b(), "brown_mushroom_block");
        this.a(blg.bh, afg.k.b(), "red_mushroom_block");
        this.a(blg.bI, "dragon_egg");
        this.a(blg.dc, "repeating_command_block");
        this.a(blg.dd, "chain_command_block");
        this.a(blg.dk, cfk.a.b(), "structure_block");
        this.a(blg.dk, cfk.b.b(), "structure_block");
        this.a(blg.dk, cfk.c.b(), "structure_block");
        this.a(blg.dk, cfk.d.b(), "structure_block");
    }

    @Override
    public void a(akx akx2) {
        this.d.b();
    }
}

