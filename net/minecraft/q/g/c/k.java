/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.as;
import net.minecraft.q.g.c.dt;
import net.minecraft.q.g.c.p;
import net.minecraft.u.b.b;
import net.minecraft.u.bq;
import net.minecraft.u.bz;

class k
implements as {
    k() {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean a(int n2, p p2, b b2, List list, Random random) {
        bq bq2 = p2.d.c();
        p p3 = dt.a(list, dt.a(p2, new b(-3, 4, -3), "fat_tower_base", bq2, true));
        p3 = dt.a(list, dt.a(p3, new b(0, 4, 0), "fat_tower_middle", bq2, true));
        for (int i2 = 0; i2 < 2 && random.nextInt(3) != 0; ++i2) {
            p3 = dt.a(list, dt.a(p3, new b(0, 8, 0), "fat_tower_middle", bq2, true));
            for (bz bz2 : dt.g()) {
                if (!random.nextBoolean()) continue;
                p p4 = dt.a(list, dt.a(p3, (b)bz2.b(), "bridge_end", bq2.a((bq)((Object)bz2.a())), true));
                dt.a(dt.d(), n2 + 1, p4, null, list, random);
            }
        }
        dt.a(list, dt.a(p3, new b(-2, 8, -2), "fat_tower_top", bq2, true));
        return true;
    }
}

