/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.gm;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class t
extends aj {
    private gm a;

    public void a(gm gm2) {
        this.a = gm2;
    }

    @Override
    public boolean a(k k2, Random random, b b2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b3) || k2.q.n() && b3.k() >= 254 || !p.cF.a_(k2, b3)) continue;
            p.cF.a(k2, b3, this.a, 2);
            bl2 = true;
        }
        return bl2;
    }
}

