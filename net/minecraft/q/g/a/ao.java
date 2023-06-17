/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.n;

public class ao
extends aj {
    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2;
        int n3;
        while (k2.c(b2) && b2.k() > 2) {
            b2 = b2.c();
        }
        if (k2.n(b2).c() != p.aJ) {
            return false;
        }
        b2 = b2.a(random.nextInt(4));
        int n4 = random.nextInt(4) + 7;
        int n5 = n4 / 4 + random.nextInt(2);
        if (n5 > 1 && random.nextInt(60) == 0) {
            b2 = b2.a(10 + random.nextInt(30));
        }
        for (n3 = 0; n3 < n4; ++n3) {
            float f2 = (1.0f - (float)n3 / (float)n4) * (float)n5;
            n2 = n.f(f2);
            for (int i2 = -n2; i2 <= n2; ++i2) {
                float f3 = (float)n.a(i2) - 0.25f;
                for (int i3 = -n2; i3 <= n2; ++i3) {
                    float f4 = (float)n.a(i3) - 0.25f;
                    if ((i2 != 0 || i3 != 0) && !(f3 * f3 + f4 * f4 <= f2 * f2) || (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) && !(random.nextFloat() <= 0.75f)) continue;
                    b b3 = k2.n(b2.a(i2, n3, i3));
                    cn cn2 = b3.c();
                    if (b3.d() == h.a || cn2 == p.d || cn2 == p.aJ || cn2 == p.aI) {
                        this.a(k2, b2.a(i2, n3, i3), p.cB.v());
                    }
                    if (n3 == 0 || n2 <= 1) continue;
                    b3 = k2.n(b2.a(i2, -n3, i3));
                    cn2 = b3.c();
                    if (b3.d() != h.a && cn2 != p.d && cn2 != p.aJ && cn2 != p.aI) continue;
                    this.a(k2, b2.a(i2, -n3, i3), p.cB.v());
                }
            }
        }
        n3 = n5 - 1;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 1) {
            n3 = 1;
        }
        for (int i4 = -n3; i4 <= n3; ++i4) {
            block5: for (n2 = -n3; n2 <= n3; ++n2) {
                net.minecraft.u.b.b b4 = b2.a(i4, -1, n2);
                int n6 = 50;
                if (Math.abs(i4) == 1 && Math.abs(n2) == 1) {
                    n6 = random.nextInt(5);
                }
                while (b4.k() > 50) {
                    b b5 = k2.n(b4);
                    cn cn3 = b5.c();
                    if (b5.d() != h.a && cn3 != p.d && cn3 != p.aJ && cn3 != p.aI && cn3 != p.cB) continue block5;
                    this.a(k2, b4, p.cB.v());
                    b4 = b4.c();
                    if (--n6 > 0) continue;
                    b4 = b4.b(random.nextInt(5) + 1);
                    n6 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}

