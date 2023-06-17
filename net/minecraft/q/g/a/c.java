/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class c
extends aj {
    @Override
    public boolean a(k k2, Random random, b b2) {
        for (int i2 = 0; i2 < 20; ++i2) {
            b b3;
            b b4 = b2.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            if (!k2.c(b4) || k2.n((b3 = b4.c()).f()).d() != h.h && k2.n(b3.g()).d() != h.h && k2.n(b3.d()).d() != h.h && k2.n(b3.e()).d() != h.h) continue;
            int n2 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!p.aM.c(k2, b4)) continue;
                k2.a(b4.a(i3), p.aM.v(), 2);
            }
        }
        return true;
    }
}

