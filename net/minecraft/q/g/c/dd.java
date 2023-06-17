/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Map;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.a.e;
import net.minecraft.q.g.c.a.h;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.di;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.t;
import net.minecraft.u.bp;
import net.minecraft.u.bq;

public class dd
extends di {
    private static final bp g = new bp("igloo/igloo_top");
    private static final bp h = new bp("igloo/igloo_middle");
    private static final bp i = new bp("igloo/igloo_bottom");

    public dd() {
    }

    public dd(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 7, 5, 8);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (!this.a(k2, dc2, -1)) {
            return false;
        }
        dc dc3 = this.f();
        b b2 = new b(dc3.a, dc3.b, dc3.c);
        bq[] arrbq = bq.values();
        a a2 = k2.l();
        e e2 = k2.E().g();
        i i2 = new i().a(arrbq[random.nextInt(arrbq.length)]).a(p.dj).a(dc3);
        h h2 = e2.a(a2, g);
        h2.a(k2, b2, i2);
        if (random.nextDouble() < 0.5) {
            Object object;
            h h3 = e2.a(a2, h);
            h h4 = e2.a(a2, i);
            int n2 = random.nextInt(8) + 4;
            for (int i3 = 0; i3 < n2; ++i3) {
                object = h2.a(i2, new b(3, -1 - i3 * 3, 5), i2, new b(1, 2, 1));
                h3.a(k2, b2.a((t)object), i2);
            }
            b b3 = b2.a(h2.a(i2, new b(3, -1 - n2 * 3, 5), i2, new b(3, 5, 7)));
            h4.a(k2, b3, i2);
            object = h4.a(b3, i2);
            for (Map.Entry entry : object.entrySet()) {
                if (!"chest".equals(entry.getValue())) continue;
                b b4 = (b)entry.getKey();
                k2.a(b4, p.a.v(), 3);
                ap ap2 = k2.q(b4.c());
                if (!(ap2 instanceof u)) continue;
                ((u)ap2).a(j.n, random.nextLong());
            }
        } else {
            b b5 = net.minecraft.q.g.c.a.h.a(i2, new b(3, 0, 5));
            k2.a(b2.a(b5), p.aJ.v(), 3);
        }
        return true;
    }
}

