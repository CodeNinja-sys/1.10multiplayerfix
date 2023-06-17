/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bt;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.ag;
import net.minecraft.u.b.b;

public class o
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            b b3 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b3) || k2.n(b3.c()).c() != p.c || !p.aU.a_(k2, b3)) continue;
            k2.a(b3, p.aU.v().a(bt.j, (Comparable)((Object)ag.a.a(random))), 2);
        }
        return true;
    }
}

