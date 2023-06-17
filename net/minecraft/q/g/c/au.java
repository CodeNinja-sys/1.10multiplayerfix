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

class au
implements as {
    public boolean a;

    au() {
    }

    @Override
    public void a() {
        this.a = false;
    }

    @Override
    public boolean a(int n2, p p2, b b2, List list, Random random) {
        bq bq2 = p2.d.c();
        int n3 = random.nextInt(4) + 1;
        p p3 = dt.a(list, dt.a(p2, new b(0, 0, -4), "bridge_piece", bq2, true));
        p3.c = -1;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (random.nextBoolean()) {
                p3 = dt.a(list, dt.a(p3, new b(0, n4, -4), "bridge_piece", bq2, true));
                n4 = 0;
                continue;
            }
            p3 = random.nextBoolean() ? dt.a(list, dt.a(p3, new b(0, n4, -4), "bridge_steep_stairs", bq2, true)) : dt.a(list, dt.a(p3, new b(0, n4, -8), "bridge_gentle_stairs", bq2, true));
            n4 = 4;
        }
        if (!this.a && random.nextInt(10 - n2) == 0) {
            dt.a(list, dt.a(p3, new b(-8 + random.nextInt(8), n4, -70 + random.nextInt(10)), "ship", bq2, true));
            this.a = true;
        } else if (!dt.a(dt.f(), n2 + 1, p3, new b(-3, n4 + 1, -11), list, random)) {
            return false;
        }
        p3 = dt.a(list, dt.a(p3, new b(4, n4, 0), "bridge_end", bq2.a(bq.c), true));
        p3.c = -1;
        return true;
    }
}

