/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.m.a.g;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class n {
    private final String[][] a = new String[][]{{"X", "X", "#"}};
    private final Object[][] b = new Object[][]{{p.f, p.e, w.l, w.k, w.m}, {w.o, w.s, w.n, w.w, w.D}};

    public void a(g g2) {
        for (int i2 = 0; i2 < this.b[0].length; ++i2) {
            Object object = this.b[0][i2];
            for (int i3 = 0; i3 < this.b.length - 1; ++i3) {
                cg cg2 = (cg)this.b[i3 + 1][i2];
                g2.a(new cu(cg2), this.a[i3], Character.valueOf('#'), w.A, Character.valueOf('X'), object);
            }
        }
        g2.a(new cu(w.f, 1), " #X", "# X", " #X", Character.valueOf('X'), w.H, Character.valueOf('#'), w.A);
        g2.a(new cu(w.g, 4), "X", "#", "Y", Character.valueOf('Y'), w.I, Character.valueOf('X'), w.am, Character.valueOf('#'), w.A);
        g2.a(new cu(w.h, 2), " # ", "#X#", " # ", Character.valueOf('X'), w.g, Character.valueOf('#'), w.ba);
    }
}

