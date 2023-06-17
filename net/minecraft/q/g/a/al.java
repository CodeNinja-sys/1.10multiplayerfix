/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.c.a;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.c.a.e;
import net.minecraft.q.g.c.a.h;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.m;
import net.minecraft.u.bi;
import net.minecraft.u.bp;
import net.minecraft.u.bq;

public class al
extends aj {
    private static final bp a = new bp("fossils/fossil_spine_01");
    private static final bp b = new bp("fossils/fossil_spine_02");
    private static final bp c = new bp("fossils/fossil_spine_03");
    private static final bp d = new bp("fossils/fossil_spine_04");
    private static final bp e = new bp("fossils/fossil_spine_01_coal");
    private static final bp f = new bp("fossils/fossil_spine_02_coal");
    private static final bp g = new bp("fossils/fossil_spine_03_coal");
    private static final bp h = new bp("fossils/fossil_spine_04_coal");
    private static final bp i = new bp("fossils/fossil_skull_01");
    private static final bp j = new bp("fossils/fossil_skull_02");
    private static final bp k = new bp("fossils/fossil_skull_03");
    private static final bp l = new bp("fossils/fossil_skull_04");
    private static final bp m = new bp("fossils/fossil_skull_01_coal");
    private static final bp n = new bp("fossils/fossil_skull_02_coal");
    private static final bp o = new bp("fossils/fossil_skull_03_coal");
    private static final bp p = new bp("fossils/fossil_skull_04_coal");
    private static final bp[] q = new bp[]{a, b, c, d, i, j, k, l};
    private static final bp[] r = new bp[]{e, f, g, h, m, n, o, p};

    @Override
    public boolean a(k k2, Random random, b b2) {
        int n2;
        Random random2 = k2.a(b2.cy_(), b2.l()).a(987234911L);
        a a2 = k2.l();
        bq[] arrbq = bq.values();
        bq bq2 = arrbq[random2.nextInt(arrbq.length)];
        int n3 = random2.nextInt(q.length);
        e e2 = k2.E().g();
        h h2 = e2.a(a2, q[n3]);
        h h3 = e2.a(a2, r[n3]);
        m m2 = new m(b2);
        dc dc2 = new dc(m2.c(), 0, m2.d(), m2.e(), 256, m2.f());
        i i2 = new i().a(bq2).a(dc2).a(random2);
        b b3 = h2.a(bq2);
        int n4 = random2.nextInt(16 - b3.cy_());
        int n5 = random2.nextInt(16 - b3.l());
        int n6 = 256;
        for (n2 = 0; n2 < b3.cy_(); ++n2) {
            for (int i3 = 0; i3 < b3.cy_(); ++i3) {
                n6 = Math.min(n6, k2.b(b2.cy_() + n2 + n4, b2.l() + i3 + n5));
            }
        }
        n2 = Math.max(n6 - 15 - random2.nextInt(10), 10);
        b b4 = h2.a(b2.a(n4, n2, n5), bi.a, bq2);
        i2.a(0.9f);
        h2.a(k2, b4, i2, 4);
        i2.a(0.1f);
        h3.a(k2, b4, i2, 4);
        return true;
    }
}

