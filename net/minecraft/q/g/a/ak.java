/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;

public class ak
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        if (!k2.c(b2)) {
            return false;
        }
        if (k2.n(b2.b()).c() != p.aV) {
            return false;
        }
        k2.a(b2, p.aX.v(), 2);
        for (int i2 = 0; i2 < 1500; ++i2) {
            b b3 = b2.a(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
            if (k2.n(b3).d() != h.a) continue;
            int n2 = 0;
            for (ad ad2 : ad.values()) {
                if (k2.n(b3.a(ad2)).c() == p.aX) {
                    ++n2;
                }
                if (n2 > 1) break;
            }
            if (n2 != true) continue;
            k2.a(b3, p.aX.v(), 2);
        }
        return true;
    }
}

