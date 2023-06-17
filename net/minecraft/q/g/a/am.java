/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.ap;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;

public class am
extends aj {
    public static final b a = net.minecraft.u.b.b.c;
    public static final b b = new b(a.cy_() - 4 & 0xFFFFFFF0, 0, a.l() - 4 & 0xFFFFFFF0);
    private final boolean c;

    public am(boolean bl2) {
        this.c = bl2;
    }

    @Override
    public boolean a(k k2, Random random, b b2) {
        for (g g2 : net.minecraft.u.b.b.b(new b(b2.cy_() - 4, b2.k() - 1, b2.l() - 4), new b(b2.cy_() + 4, b2.k() + 32, b2.l() + 4))) {
            double d2 = g2.e(b2.cy_(), g2.k(), b2.l());
            if (!(d2 <= 3.5)) continue;
            if (g2.k() < b2.k()) {
                if (d2 <= 2.5) {
                    this.a(k2, g2, p.h.v());
                    continue;
                }
                if (g2.k() >= b2.k()) continue;
                this.a(k2, g2, p.bH.v());
                continue;
            }
            if (g2.k() > b2.k()) {
                this.a(k2, g2, p.a.v());
                continue;
            }
            if (d2 > 2.5) {
                this.a(k2, g2, p.h.v());
                continue;
            }
            if (this.c) {
                this.a(k2, new b(g2), p.bF.v());
                continue;
            }
            this.a(k2, new b(g2), p.a.v());
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(k2, b2.a(i2), p.h.v());
        }
        b b3 = b2.a(2);
        for (Object object : ag.a) {
            this.a(k2, b3.a((ad)object), p.aa.v().a(ap.a, (Comparable)object));
        }
        return true;
    }
}

