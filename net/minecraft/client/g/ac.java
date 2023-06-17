/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.aj;
import net.minecraft.client.g.ax;
import net.minecraft.client.g.az;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.g;
import net.minecraft.client.g.b.b.b;
import net.minecraft.client.g.b.b.f;
import net.minecraft.client.g.ca;
import net.minecraft.client.g.cp;
import net.minecraft.client.g.p;
import net.minecraft.client.g.x;
import net.minecraft.g.ab;
import net.minecraft.g.av;
import net.minecraft.g.bh;
import net.minecraft.g.bm;
import net.minecraft.g.bo;
import net.minecraft.g.bw;
import net.minecraft.g.cc;
import net.minecraft.g.cn;
import net.minecraft.g.ct;
import net.minecraft.g.dc;
import net.minecraft.g.ec;
import net.minecraft.g.ed;
import net.minecraft.g.en;
import net.minecraft.g.ep;
import net.minecraft.g.es;
import net.minecraft.g.et;
import net.minecraft.g.ey;
import net.minecraft.g.fe;
import net.minecraft.g.fj;
import net.minecraft.g.fl;
import net.minecraft.g.ga;
import net.minecraft.g.gd;
import net.minecraft.g.ge;
import net.minecraft.g.gj;
import net.minecraft.g.go;
import net.minecraft.g.gu;
import net.minecraft.g.gz;
import net.minecraft.g.hi;
import net.minecraft.g.ho;
import net.minecraft.g.hp;
import net.minecraft.g.l;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.g.w;

public class ac {
    private final Map a = sz.g();
    private final b b = new b();
    private final g c;

    public ac(g g2) {
        this.c = g2;
        this.d();
    }

    public b a() {
        return this.b;
    }

    public d a(net.minecraft.g.c.b b2) {
        cn cn2 = b2.c();
        aq aq2 = this.b(b2);
        if (aq2 == null || aq2 == this.c.a()) {
            if (cn2 == net.minecraft.a.p.ax || cn2 == net.minecraft.a.p.an || cn2 == net.minecraft.a.p.ae || cn2 == net.minecraft.a.p.cg || cn2 == net.minecraft.a.p.cK || cn2 == net.minecraft.a.p.cL) {
                return this.c.b().a("minecraft:blocks/planks_oak");
            }
            if (cn2 == net.minecraft.a.p.bQ) {
                return this.c.b().a("minecraft:blocks/obsidian");
            }
            if (cn2 == net.minecraft.a.p.k || cn2 == net.minecraft.a.p.l) {
                return this.c.b().a("minecraft:blocks/lava_still");
            }
            if (cn2 == net.minecraft.a.p.i || cn2 == net.minecraft.a.p.j) {
                return this.c.b().a("minecraft:blocks/water_still");
            }
            if (cn2 == net.minecraft.a.p.ce) {
                return this.c.b().a("minecraft:blocks/soul_sand");
            }
            if (cn2 == net.minecraft.a.p.cv) {
                return this.c.b().a("minecraft:items/barrier");
            }
        }
        if (aq2 == null) {
            aq2 = this.c.a();
        }
        return aq2.d();
    }

    public aq b(net.minecraft.g.c.b b2) {
        aq aq2 = (aq)this.a.get(b2);
        if (aq2 == null) {
            aq2 = this.c.a();
        }
        return aq2;
    }

    public g b() {
        return this.c;
    }

    public void c() {
        this.a.clear();
        for (Map.Entry entry : this.b.a().entrySet()) {
            this.a.put((net.minecraft.g.c.b)entry.getKey(), this.c.a((ag)entry.getValue()));
        }
    }

    public void a(cn cn2, f f2) {
        this.b.a(cn2, f2);
    }

    public void a(cn ... arrcn) {
        this.b.a(arrcn);
    }

    private void d() {
        this.a(net.minecraft.a.p.a, net.minecraft.a.p.i, net.minecraft.a.p.j, net.minecraft.a.p.k, net.minecraft.a.p.l, net.minecraft.a.p.M, net.minecraft.a.p.ae, net.minecraft.a.p.bQ, net.minecraft.a.p.cg, net.minecraft.a.p.an, net.minecraft.a.p.ce, net.minecraft.a.p.bF, net.minecraft.a.p.cv, net.minecraft.a.p.ax, net.minecraft.a.p.cL, net.minecraft.a.p.cK, net.minecraft.a.p.db);
        this.a(net.minecraft.a.p.b, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bo.a).a());
        this.a(net.minecraft.a.p.cI, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)fe.a).a());
        this.a((cn)net.minecraft.a.p.t, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)m.a).a("_leaves").a(bm.c, bm.b).a());
        this.a((cn)net.minecraft.a.p.u, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)gu.a).a("_leaves").a(bm.c, bm.b).a());
        this.a((cn)net.minecraft.a.p.aK, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ho.a}).a());
        this.a((cn)net.minecraft.a.p.aM, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ge.a}).a());
        this.a(net.minecraft.a.p.aN, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{gz.a}).a());
        this.a(net.minecraft.a.p.bZ, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)ey.f).a("_wall").a());
        this.a((cn)net.minecraft.a.p.cF, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bh.a).a(new net.minecraft.g.b.b[]{bh.c}).a());
        this.a(net.minecraft.a.p.bo, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ct.b}).a());
        this.a(net.minecraft.a.p.bp, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ct.b}).a());
        this.a(net.minecraft.a.p.bq, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ct.b}).a());
        this.a(net.minecraft.a.p.br, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ct.b}).a());
        this.a(net.minecraft.a.p.bs, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ct.b}).a());
        this.a(net.minecraft.a.p.bt, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ct.b}).a());
        this.a(net.minecraft.a.p.bS, new net.minecraft.client.g.b.b.d().a(cc.c, cc.a).a());
        this.a((cn)net.minecraft.a.p.bL, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)ep.a).a("_double_slab").a());
        this.a((cn)net.minecraft.a.p.bM, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)ep.a).a("_slab").a());
        this.a(net.minecraft.a.p.W, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{et.a}).a());
        this.a((cn)net.minecraft.a.p.ab, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{hp.a}).a());
        this.a((cn)net.minecraft.a.p.af, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ed.e}).a());
        this.a((cn)net.minecraft.a.p.ao, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a((cn)net.minecraft.a.p.ap, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a((cn)net.minecraft.a.p.aq, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a((cn)net.minecraft.a.p.ar, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a((cn)net.minecraft.a.p.as, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a((cn)net.minecraft.a.p.at, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a((cn)net.minecraft.a.p.aA, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{ga.d}).a());
        this.a(net.minecraft.a.p.L, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bw.a).a("_wool").a());
        this.a(net.minecraft.a.p.cy, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bw.a).a("_carpet").a());
        this.a(net.minecraft.a.p.cu, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bw.a).a("_stained_hardened_clay").a());
        this.a((cn)net.minecraft.a.p.cH, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bw.a).a("_stained_glass_pane").a());
        this.a((cn)net.minecraft.a.p.cG, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)bw.a).a("_stained_glass").a());
        this.a(net.minecraft.a.p.A, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)fj.a).a());
        this.a(net.minecraft.a.p.cM, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)go.a).a());
        this.a((cn)net.minecraft.a.p.H, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)hi.a).a());
        this.a(net.minecraft.a.p.C, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{av.b}).a());
        this.a((cn)net.minecraft.a.p.N, new net.minecraft.client.g.b.b.d().a(net.minecraft.a.p.N.h()).a());
        this.a((cn)net.minecraft.a.p.O, new net.minecraft.client.g.b.b.d().a(net.minecraft.a.p.O.h()).a());
        this.a((cn)net.minecraft.a.p.U, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)fl.e).a("_slab").a());
        this.a((cn)net.minecraft.a.p.cP, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)ec.e).a("_slab").a());
        this.a(net.minecraft.a.p.be, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)dc.a).a("_monster_egg").a());
        this.a(net.minecraft.a.p.bf, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)gj.a).a());
        this.a(net.minecraft.a.p.z, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{en.b}).a());
        this.a(net.minecraft.a.p.ct, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{w.b}).a());
        this.a(net.minecraft.a.p.r, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)s.a).a("_log").a());
        this.a(net.minecraft.a.p.s, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)es.a).a("_log").a());
        this.a(net.minecraft.a.p.f, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)ep.a).a("_planks").a());
        this.a(net.minecraft.a.p.g, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)ab.a).a("_sapling").a());
        this.a((cn)net.minecraft.a.p.m, new net.minecraft.client.g.b.b.d().a((net.minecraft.g.b.b)gd.b).a());
        this.a((cn)net.minecraft.a.p.cp, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{l.b}).a());
        this.a(net.minecraft.a.p.ca, new net.minecraft.client.g.b.b.d().a(new net.minecraft.g.b.b[]{net.minecraft.g.ax.a}).a());
        this.a(net.minecraft.a.p.cq, new cp(this));
        this.a((cn)net.minecraft.a.p.I, new ax(this));
        this.a(net.minecraft.a.p.bl, new x(this));
        this.a(net.minecraft.a.p.bm, new az(this));
        this.a(net.minecraft.a.p.d, new p(this));
        this.a((cn)net.minecraft.a.p.T, new ca(this));
        this.a((cn)net.minecraft.a.p.cO, new aj(this));
    }
}

