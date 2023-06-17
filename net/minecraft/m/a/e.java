/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.m.a.g;
import net.minecraft.m.a.i;
import net.minecraft.m.a.z;
import net.minecraft.m.cd;
import net.minecraft.m.cu;

public class e {
    void a(g g2) {
        for (cd cd2 : cd.values()) {
            g2.a(new cu(w.cO, 1, cd2.c()), "###", "###", " | ", Character.valueOf('#'), new cu(p.L, 1, cd2.b()), Character.valueOf('|'), w.A);
        }
        g2.a(new i(null));
        g2.a(new z(null));
    }
}

