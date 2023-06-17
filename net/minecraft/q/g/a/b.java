/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.g.ft;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;

public class b
extends aj {
    private final ft a;

    public b(ft ft2) {
        this.a = ft2;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            net.minecraft.u.b.b b3 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b3) || k2.q.n() && b3.k() >= 255 || !this.a.e(k2, b3, this.a.v())) continue;
            k2.a(b3, this.a.v(), 2);
        }
        return true;
    }
}

