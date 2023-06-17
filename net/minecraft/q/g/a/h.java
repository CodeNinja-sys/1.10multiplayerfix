/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;

public class h
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        float f2 = random.nextInt(3) + 4;
        int n2 = 0;
        while (f2 > 0.5f) {
            for (int i2 = n.d(-f2); i2 <= n.f(f2); ++i2) {
                for (int i3 = n.d(-f2); i3 <= n.f(f2); ++i3) {
                    if (!((float)(i2 * i2 + i3 * i3) <= (f2 + 1.0f) * (f2 + 1.0f))) continue;
                    this.a(k2, b2.a(i2, n2, i3), p.bH.v());
                }
            }
            f2 = (float)((double)f2 - ((double)random.nextInt(2) + 0.5));
            --n2;
        }
        return true;
    }
}

