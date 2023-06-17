/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;

public class l
extends aj {
    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        while ((b3.d() == h.a || b3.d() == h.j) && b2.k() > 0) {
            b2 = b2.c();
            b3 = k2.n(b2);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            net.minecraft.u.b.b b4 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b4) || !p.I.e(k2, b4, p.I.v())) continue;
            k2.a(b4, p.I.v(), 2);
        }
        return true;
    }
}

