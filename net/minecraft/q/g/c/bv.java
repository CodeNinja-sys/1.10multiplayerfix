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

class bv
implements as {
    bv() {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean a(int n2, p p2, b b2, List list, Random random) {
        bq bq2 = p2.d.c();
        p p3 = dt.a(list, dt.a(p2, new b(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", bq2, true));
        p3 = dt.a(list, dt.a(p3, new b(0, 7, 0), "tower_piece", bq2, true));
        p p4 = random.nextInt(3) == 0 ? p3 : null;
        int n3 = 1 + random.nextInt(3);
        for (int i2 = 0; i2 < n3; ++i2) {
            p3 = dt.a(list, dt.a(p3, new b(0, 4, 0), "tower_piece", bq2, true));
            if (i2 >= n3 - 1 || !random.nextBoolean()) continue;
            p4 = p3;
        }
        if (p4 != null) {
            for (bz bz2 : dt.c()) {
                if (!random.nextBoolean()) continue;
                p p5 = dt.a(list, dt.a(p4, (b)bz2.b(), "bridge_end", bq2.a((bq)((Object)bz2.a())), true));
                dt.a(dt.d(), n2 + 1, p5, null, list, random);
            }
            dt.a(list, dt.a(p3, new b(-1, 4, -1), "tower_top", bq2, true));
        } else {
            if (n2 != 7) {
                return dt.a(dt.e(), n2 + 1, p3, null, list, random);
            }
            dt.a(list, dt.a(p3, new b(-1, 4, -1), "tower_top", bq2, true));
        }
        return true;
    }
}

