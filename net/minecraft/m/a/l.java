/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.w;
import net.minecraft.m.a.g;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class l {
    private final String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private final cg[][] b = new cg[][]{{w.aM, w.l, w.k, w.m}, {w.S, w.aa, w.ae, w.ai}, {w.T, w.ab, w.af, w.aj}, {w.U, w.ac, w.ag, w.ak}, {w.V, w.ad, w.ah, w.al}};

    public void a(g g2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            cg cg2 = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                cg cg3 = this.b[i3 + 1][i2];
                g2.a(new cu(cg3), this.a[i3], Character.valueOf('X'), cg2);
            }
        }
    }
}

