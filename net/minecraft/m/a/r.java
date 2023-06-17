/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.m.a.g;
import net.minecraft.m.cd;
import net.minecraft.m.cu;

public class r {
    private final Object[][] a = new Object[][]{{p.R, new cu(w.m, 9)}, {p.S, new cu(w.l, 9)}, {p.ah, new cu(w.k, 9)}, {p.bT, new cu(w.bY, 9)}, {p.y, new cu(w.bd, 9, cd.l.c())}, {p.cn, new cu(w.aE, 9)}, {p.cA, new cu(w.j, 9, 0)}, {p.cx, new cu(w.Q, 9)}, {p.cE, new cu(w.aT, 9)}};

    public void a(g g2) {
        Object[][] arrobject = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object[] arrobject2 = arrobject[i2];
            cn cn2 = (cn)arrobject2[0];
            cu cu2 = (cu)arrobject2[1];
            g2.a(new cu(cn2), "###", "###", "###", Character.valueOf('#'), cu2);
            g2.a(cu2, "#", Character.valueOf('#'), cn2);
        }
        g2.a(new cu(w.m), "###", "###", "###", Character.valueOf('#'), w.bE);
        g2.a(new cu(w.bE, 9), "#", Character.valueOf('#'), w.m);
    }
}

