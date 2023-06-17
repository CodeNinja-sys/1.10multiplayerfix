/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.b.q;
import net.minecraft.q.b.t;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;

public class v
extends t {
    @Override
    public void a(k k2, Random random, q q2, b b2) {
        b b3 = k2.D();
        int n2 = 16;
        double d2 = b3.i(b2.a(8, b3.k(), 8));
        if (d2 <= 1024.0) {
            b b4 = new b(b3.cy_() - 16, b3.k() - 1, b3.l() - 16);
            b b5 = new b(b3.cy_() + 16, b3.k() - 1, b3.l() + 16);
            g g2 = new g(b4);
            for (int i2 = b2.l(); i2 < b2.l() + 16; ++i2) {
                for (int i3 = b2.cy_(); i3 < b2.cy_() + 16; ++i3) {
                    if (i2 < b4.l() || i2 > b5.l() || i3 < b4.cy_() || i3 > b5.cy_()) continue;
                    g2.b(i3, g2.k(), i2);
                    if (b3.cy_() == i3 && b3.l() == i2) {
                        k2.a((b)g2, net.minecraft.a.p.e.v(), 2);
                        continue;
                    }
                    k2.a((b)g2, net.minecraft.a.p.b.v(), 2);
                }
            }
        }
    }
}

