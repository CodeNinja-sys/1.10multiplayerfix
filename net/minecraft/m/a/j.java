/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.fh;
import net.minecraft.g.gm;
import net.minecraft.m.a.g;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class j {
    public void a(g g2) {
        int n2;
        for (n2 = 0; n2 < 16; ++n2) {
            g2.b(new cu(p.L, 1, n2), new cu(w.bd, 1, 15 - n2), new cu(cg.a(p.L)));
            g2.a(new cu(p.cu, 8, 15 - n2), "###", "#X#", "###", Character.valueOf('#'), new cu(p.cz), Character.valueOf('X'), new cu(w.bd, 1, n2));
            g2.a(new cu(p.cG, 8, 15 - n2), "###", "#X#", "###", Character.valueOf('#'), new cu(p.w), Character.valueOf('X'), new cu(w.bd, 1, n2));
            g2.a(new cu(p.cH, 16, n2), "###", "###", Character.valueOf('#'), new cu(p.cG, 1, n2));
        }
        g2.b(new cu(w.bd, 1, cd.e.c()), new cu(p.N, 1, fh.a.c()));
        g2.b(new cu(w.bd, 1, cd.o.c()), new cu(p.O, 1, fh.b.c()));
        g2.b(new cu(w.bd, 3, cd.a.c()), w.be);
        g2.b(new cu(w.bd, 9, cd.a.c()), p.di);
        g2.b(new cu(w.bd, 2, cd.g.c()), new cu(w.bd, 1, cd.o.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 2, cd.b.c()), new cu(w.bd, 1, cd.o.c()), new cu(w.bd, 1, cd.e.c()));
        g2.b(new cu(w.bd, 2, cd.f.c()), new cu(w.bd, 1, cd.n.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 2, cd.h.c()), new cu(w.bd, 1, cd.p.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 2, cd.i.c()), new cu(w.bd, 1, cd.h.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 3, cd.i.c()), new cu(w.bd, 1, cd.p.c()), new cu(w.bd, 1, cd.a.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 2, cd.d.c()), new cu(w.bd, 1, cd.l.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 2, cd.j.c()), new cu(w.bd, 1, cd.l.c()), new cu(w.bd, 1, cd.n.c()));
        g2.b(new cu(w.bd, 2, cd.k.c()), new cu(w.bd, 1, cd.l.c()), new cu(w.bd, 1, cd.o.c()));
        g2.b(new cu(w.bd, 2, cd.c.c()), new cu(w.bd, 1, cd.k.c()), new cu(w.bd, 1, cd.g.c()));
        g2.b(new cu(w.bd, 3, cd.c.c()), new cu(w.bd, 1, cd.l.c()), new cu(w.bd, 1, cd.o.c()), new cu(w.bd, 1, cd.g.c()));
        g2.b(new cu(w.bd, 4, cd.c.c()), new cu(w.bd, 1, cd.l.c()), new cu(w.bd, 1, cd.o.c()), new cu(w.bd, 1, cd.o.c()), new cu(w.bd, 1, cd.a.c()));
        g2.b(new cu(w.bd, 1, cd.d.c()), new cu(p.O, 1, fh.c.c()));
        g2.b(new cu(w.bd, 1, cd.c.c()), new cu(p.O, 1, fh.d.c()));
        g2.b(new cu(w.bd, 1, cd.i.c()), new cu(p.O, 1, fh.e.c()));
        g2.b(new cu(w.bd, 1, cd.o.c()), new cu(p.O, 1, fh.f.c()));
        g2.b(new cu(w.bd, 1, cd.b.c()), new cu(p.O, 1, fh.g.c()));
        g2.b(new cu(w.bd, 1, cd.i.c()), new cu(p.O, 1, fh.h.c()));
        g2.b(new cu(w.bd, 1, cd.g.c()), new cu(p.O, 1, fh.i.c()));
        g2.b(new cu(w.bd, 1, cd.i.c()), new cu(p.O, 1, fh.j.c()));
        g2.b(new cu(w.bd, 2, cd.e.c()), new cu(p.cF, 1, gm.a.b()));
        g2.b(new cu(w.bd, 2, cd.c.c()), new cu(p.cF, 1, gm.b.b()));
        g2.b(new cu(w.bd, 2, cd.o.c()), new cu(p.cF, 1, gm.e.b()));
        g2.b(new cu(w.bd, 2, cd.g.c()), new cu(p.cF, 1, gm.f.b()));
        g2.b(new cu(w.bd, 1, cd.o.c()), new cu(w.cV, 1));
        for (n2 = 0; n2 < 16; ++n2) {
            g2.a(new cu(p.cy, 3, n2), "##", Character.valueOf('#'), new cu(p.L, 1, n2));
        }
    }
}

