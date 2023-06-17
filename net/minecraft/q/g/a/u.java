/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;

public class u
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        for (g g2 : b.b(b2.a(-1, -2, -1), b2.a(1, 2, 1))) {
            boolean bl2;
            boolean bl3 = g2.cy_() == b2.cy_();
            boolean bl4 = g2.k() == b2.k();
            boolean bl5 = g2.l() == b2.l();
            boolean bl6 = bl2 = Math.abs(g2.k() - b2.k()) == 2;
            if (bl3 && bl4 && bl5) {
                this.a(k2, new b(g2), p.db.v());
                continue;
            }
            if (bl4) {
                this.a(k2, g2, p.a.v());
                continue;
            }
            if (bl2 && bl3 && bl5) {
                this.a(k2, g2, p.h.v());
                continue;
            }
            if ((bl3 || bl5) && !bl2) {
                this.a(k2, g2, p.h.v());
                continue;
            }
            this.a(k2, g2, p.a.v());
        }
        return true;
    }
}

