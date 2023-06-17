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

class ac
implements as {
    ac() {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean a(int n2, p p2, b b2, List list, Random random) {
        if (n2 > 8) {
            return false;
        }
        bq bq2 = p2.d.c();
        p p3 = dt.a(list, dt.a(p2, b2, "base_floor", bq2, true));
        int n3 = random.nextInt(3);
        if (n3 == 0) {
            dt.a(list, dt.a(p3, new b(-1, 4, -1), "base_roof", bq2, true));
        } else if (n3 == 1) {
            p3 = dt.a(list, dt.a(p3, new b(-1, 0, -1), "second_floor_2", bq2, false));
            p3 = dt.a(list, dt.a(p3, new b(-1, 8, -1), "second_roof", bq2, false));
            dt.a(dt.b(), n2 + 1, p3, null, list, random);
        } else if (n3 == 2) {
            p3 = dt.a(list, dt.a(p3, new b(-1, 0, -1), "second_floor_2", bq2, false));
            p3 = dt.a(list, dt.a(p3, new b(-1, 4, -1), "third_floor_c", bq2, false));
            p3 = dt.a(list, dt.a(p3, new b(-1, 8, -1), "third_roof", bq2, true));
            dt.a(dt.b(), n2 + 1, p3, null, list, random);
        }
        return true;
    }
}

