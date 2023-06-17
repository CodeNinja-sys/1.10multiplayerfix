/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.m.a.g;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class q {
    private final String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private final Object[][] b = new Object[][]{{p.f, p.e, w.l, w.k, w.m}, {w.q, w.u, w.b, w.y, w.F}, {w.p, w.t, w.a, w.x, w.E}, {w.r, w.v, w.c, w.z, w.G}, {w.K, w.L, w.M, w.N, w.O}};

    public void a(g g2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                cg cg2 = (cg)this.b[i3 + 1][i2];
                g2.a(new cu(cg2), this.a[i3], Character.valueOf('#'), w.A, Character.valueOf('X'), object);
            }
        }
        g2.a(new cu(w.bl), " #", "# ", Character.valueOf('#'), w.l);
    }
}

