/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class bax {
    private final Map a = sz.g();
    private final bvz b = new bvz();
    private final wm c;

    public bax(wm wm2) {
        this.c = wm2;
        this.d();
    }

    public bvz a() {
        return this.b;
    }

    public ars a(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        bpi bpi2 = this.b(dbk2);
        if (bpi2 == null || bpi2 == this.c.a()) {
            if (bfa2 == blg.ax || bfa2 == blg.an || bfa2 == blg.ae || bfa2 == blg.cg || bfa2 == blg.cK || bfa2 == blg.cL) {
                return this.c.b().a("minecraft:blocks/planks_oak");
            }
            if (bfa2 == blg.bQ) {
                return this.c.b().a("minecraft:blocks/obsidian");
            }
            if (bfa2 == blg.k || bfa2 == blg.l) {
                return this.c.b().a("minecraft:blocks/lava_still");
            }
            if (bfa2 == blg.i || bfa2 == blg.j) {
                return this.c.b().a("minecraft:blocks/water_still");
            }
            if (bfa2 == blg.ce) {
                return this.c.b().a("minecraft:blocks/soul_sand");
            }
            if (bfa2 == blg.cv) {
                return this.c.b().a("minecraft:items/barrier");
            }
        }
        if (bpi2 == null) {
            bpi2 = this.c.a();
        }
        return bpi2.d();
    }

    public bpi b(dbk dbk2) {
        bpi bpi2 = (bpi)this.a.get(dbk2);
        if (bpi2 == null) {
            bpi2 = this.c.a();
        }
        return bpi2;
    }

    public wm b() {
        return this.c;
    }

    public void c() {
        this.a.clear();
        for (Map.Entry entry : this.b.a().entrySet()) {
            this.a.put(entry.getKey(), this.c.a((up)entry.getValue()));
        }
    }

    public void a(bfa bfa2, abr abr2) {
        this.b.a(bfa2, abr2);
    }

    public void a(bfa ... arrbfa) {
        this.b.a(arrbfa);
    }

    private void d() {
        this.a(blg.a, blg.i, blg.j, blg.k, blg.l, blg.M, blg.ae, blg.bQ, blg.cg, blg.an, blg.ce, blg.bF, blg.cv, blg.ax, blg.cL, blg.cK, blg.db);
        this.a(blg.b, new mv().a((bvs)cec.a).a());
        this.a(blg.cI, new mv().a((bvs)crw.a).a());
        this.a((bfa)blg.t, new mv().a((bvs)dbo.e).a("_leaves").a(aai.b, aai.a).a());
        this.a((bfa)blg.u, new mv().a((bvs)bfy.e).a("_leaves").a(aai.b, aai.a).a());
        this.a((bfa)blg.aK, new mv().a(new bvs[]{qt.a}).a());
        this.a((bfa)blg.aM, new mv().a(new bvs[]{bxe.a}).a());
        this.a(blg.aN, new mv().a(new bvs[]{cdu.a}).a());
        this.a(blg.bZ, new mv().a((bvs)zd.f).a("_wall").a());
        this.a((bfa)blg.cF, new mv().a((bvs)aqr.a).a(new bvs[]{aqr.d}).a());
        this.a(blg.bo, new mv().a(new bvs[]{bty.b}).a());
        this.a(blg.bp, new mv().a(new bvs[]{bty.b}).a());
        this.a(blg.bq, new mv().a(new bvs[]{bty.b}).a());
        this.a(blg.br, new mv().a(new bvs[]{bty.b}).a());
        this.a(blg.bs, new mv().a(new bvs[]{bty.b}).a());
        this.a(blg.bt, new mv().a(new bvs[]{bty.b}).a());
        this.a(blg.bS, new mv().a(uk.c, uk.a).a());
        this.a((bfa)blg.bL, new mv().a((bvs)adg.a).a("_double_slab").a());
        this.a((bfa)blg.bM, new mv().a((bvs)adg.a).a("_slab").a());
        this.a(blg.W, new mv().a(new bvs[]{rp.a}).a());
        this.a((bfa)blg.ab, new mv().a(new bvs[]{art.a}).a());
        this.a((bfa)blg.af, new mv().a(new bvs[]{czs.e}).a());
        this.a((bfa)blg.ao, new mv().a(new bvs[]{xt.d}).a());
        this.a((bfa)blg.ap, new mv().a(new bvs[]{xt.d}).a());
        this.a((bfa)blg.aq, new mv().a(new bvs[]{xt.d}).a());
        this.a((bfa)blg.ar, new mv().a(new bvs[]{xt.d}).a());
        this.a((bfa)blg.as, new mv().a(new bvs[]{xt.d}).a());
        this.a((bfa)blg.at, new mv().a(new bvs[]{xt.d}).a());
        this.a((bfa)blg.aA, new mv().a(new bvs[]{xt.d}).a());
        this.a(blg.L, new mv().a((bvs)bsd.a).a("_wool").a());
        this.a(blg.cy, new mv().a((bvs)bsd.a).a("_carpet").a());
        this.a(blg.cu, new mv().a((bvs)bsd.a).a("_stained_hardened_clay").a());
        this.a((bfa)blg.cH, new mv().a((bvs)bsd.a).a("_stained_glass_pane").a());
        this.a((bfa)blg.cG, new mv().a((bvs)bsd.a).a("_stained_glass").a());
        this.a(blg.A, new mv().a((bvs)bqv.a).a());
        this.a(blg.cM, new mv().a((bvs)aaa.a).a());
        this.a((bfa)blg.H, new mv().a((bvs)add.a).a());
        this.a(blg.C, new mv().a(new bvs[]{dx.b}).a());
        this.a((bfa)blg.N, new mv().a(blg.N.h()).a());
        this.a((bfa)blg.O, new mv().a(blg.O.h()).a());
        this.a((bfa)blg.U, new mv().a((bvs)jo.b).a("_slab").a());
        this.a((bfa)blg.cP, new mv().a((bvs)clq.b).a("_slab").a());
        this.a(blg.be, new mv().a((bvs)aob.a).a("_monster_egg").a());
        this.a(blg.bf, new mv().a((bvs)bbt.a).a());
        this.a(blg.z, new mv().a(new bvs[]{crh.b}).a());
        this.a(blg.ct, new mv().a(new bvs[]{ahp.b}).a());
        this.a(blg.r, new mv().a((bvs)ff.a).a("_log").a());
        this.a(blg.s, new mv().a((bvs)bjc.a).a("_log").a());
        this.a(blg.f, new mv().a((bvs)adg.a).a("_planks").a());
        this.a(blg.g, new mv().a((bvs)bqh.a).a("_sapling").a());
        this.a((bfa)blg.m, new mv().a((bvs)bhg.a).a());
        this.a((bfa)blg.cp, new mv().a(new bvs[]{ao.b}).a());
        this.a(blg.ca, new mv().a(new bvs[]{acw.a}).a());
        this.a(blg.cq, new bct(this));
        this.a((bfa)blg.I, new cxo(this));
        this.a(blg.bl, new ayp(this));
        this.a(blg.bm, new cno(this));
        this.a(blg.d, new ada(this));
        this.a((bfa)blg.T, new cyl(this));
        this.a((bfa)blg.cO, new zj(this));
    }
}

