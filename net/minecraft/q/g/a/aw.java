/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.em;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;

public class aw
extends aj {
    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        while (b2.k() < 128) {
            if (k2.c(b2)) {
                for (ad ad2 : ag.a.a()) {
                    if (!p.bn.a_(k2, b2, ad2)) continue;
                    b b3 = p.bn.v().a(em.b, Boolean.valueOf(ad2 == ad.c)).a(em.c, Boolean.valueOf(ad2 == ad.f)).a(em.d, Boolean.valueOf(ad2 == ad.d)).a(em.e, Boolean.valueOf(ad2 == ad.e));
                    k2.a(b2, b3, 2);
                    break;
                }
            } else {
                b2 = b2.a(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            }
            b2 = b2.b();
        }
        return true;
    }
}

