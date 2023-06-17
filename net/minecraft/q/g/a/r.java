/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.hi;
import net.minecraft.g.t;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;

public class r
extends aj {
    private final b a;

    public r(t t2) {
        this.a = p.H.v().a(hi.a, (Comparable)((Object)t2));
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        while ((b3.d() == h.a || b3.d() == h.j) && b2.k() > 0) {
            b2 = b2.c();
            b3 = k2.n(b2);
        }
        for (int i2 = 0; i2 < 128; ++i2) {
            net.minecraft.u.b.b b4 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b4) || !p.H.e(k2, b4, this.a)) continue;
            k2.a(b4, this.a, 2);
        }
        return true;
    }
}

