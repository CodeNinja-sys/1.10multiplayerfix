/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class aa
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2;
            int n3;
            int n4 = b2.cy_() + random.nextInt(8) - random.nextInt(8);
            if (!k2.c(new b(n4, n3 = b2.k() + random.nextInt(4) - random.nextInt(4), n2 = b2.l() + random.nextInt(8) - random.nextInt(8))) || !p.bx.a_(k2, new b(n4, n3, n2))) continue;
            k2.a(new b(n4, n3, n2), p.bx.v(), 2);
        }
        return true;
    }
}

