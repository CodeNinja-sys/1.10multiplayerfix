/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class s
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            b b3 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b3)) continue;
            int n2 = 1 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!p.aK.c(k2, b3)) continue;
                k2.a(b3.a(i3), p.aK.v(), 2);
            }
        }
        return true;
    }
}

