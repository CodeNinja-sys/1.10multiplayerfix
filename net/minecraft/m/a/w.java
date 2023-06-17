/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.g.gj;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dg;

public class w {
    private static final w a = new w();
    private final Map b = sz.c();
    private final Map c = sz.c();

    public static w a() {
        return a;
    }

    private w() {
        this.a(p.p, new cu(net.minecraft.a.w.l), 0.7f);
        this.a(p.o, new cu(net.minecraft.a.w.m), 1.0f);
        this.a(p.ag, new cu(net.minecraft.a.w.k), 1.0f);
        this.a(p.m, new cu(p.w), 0.1f);
        this.a(net.minecraft.a.w.an, new cu(net.minecraft.a.w.ao), 0.35f);
        this.a(net.minecraft.a.w.bp, new cu(net.minecraft.a.w.bq), 0.35f);
        this.a(net.minecraft.a.w.br, new cu(net.minecraft.a.w.bs), 0.35f);
        this.a(net.minecraft.a.w.bv, new cu(net.minecraft.a.w.bw), 0.35f);
        this.a(net.minecraft.a.w.bt, new cu(net.minecraft.a.w.bu), 0.35f);
        this.a(p.e, new cu(p.b), 0.1f);
        this.a(new cu(p.bf, 1, gj.b), new cu(p.bf, 1, gj.d), 0.1f);
        this.a(net.minecraft.a.w.aP, new cu(net.minecraft.a.w.aO), 0.3f);
        this.a(p.aL, new cu(p.cz), 0.35f);
        this.a(p.aK, new cu(net.minecraft.a.w.bd, 1, cd.n.c()), 0.2f);
        this.a(p.r, new cu(net.minecraft.a.w.j, 1, 1), 0.15f);
        this.a(p.s, new cu(net.minecraft.a.w.j, 1, 1), 0.15f);
        this.a(p.bP, new cu(net.minecraft.a.w.bY), 1.0f);
        this.a(net.minecraft.a.w.cc, new cu(net.minecraft.a.w.cd), 0.35f);
        this.a(p.aV, new cu(net.minecraft.a.w.cp), 0.1f);
        this.a(new cu(p.v, 1, 1), new cu(p.v, 1, 0), 0.15f);
        this.a(net.minecraft.a.w.cS, new cu(net.minecraft.a.w.cT), 0.1f);
        for (dg dg2 : dg.values()) {
            if (!dg2.g()) continue;
            this.a(new cu(net.minecraft.a.w.bb, 1, dg2.a()), new cu(net.minecraft.a.w.bc, 1, dg2.a()), 0.35f);
        }
        this.a(p.q, new cu(net.minecraft.a.w.j), 0.1f);
        this.a(p.aC, new cu(net.minecraft.a.w.aE), 0.7f);
        this.a(p.x, new cu(net.minecraft.a.w.bd, 1, cd.l.c()), 0.2f);
        this.a(p.co, new cu(net.minecraft.a.w.cq), 0.2f);
    }

    public void a(cn cn2, cu cu2, float f2) {
        this.a(cg.a(cn2), cu2, f2);
    }

    public void a(cg cg2, cu cu2, float f2) {
        this.a(new cu(cg2, 1, 32767), cu2, f2);
    }

    public void a(cu cu2, cu cu3, float f2) {
        this.b.put(cu2, cu3);
        this.c.put(cu3, Float.valueOf(f2));
    }

    public cu a(cu cu2) {
        for (Map.Entry entry : this.b.entrySet()) {
            if (!this.a(cu2, (cu)entry.getKey())) continue;
            return (cu)entry.getValue();
        }
        return null;
    }

    private boolean a(cu cu2, cu cu3) {
        return cu3.a() == cu2.a() && (cu3.h() == 32767 || cu3.h() == cu2.h());
    }

    public Map b() {
        return this.b;
    }

    public float b(cu cu2) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (!this.a(cu2, (cu)entry.getKey())) continue;
            return ((Float)entry.getValue()).floatValue();
        }
        return 0.0f;
    }
}

