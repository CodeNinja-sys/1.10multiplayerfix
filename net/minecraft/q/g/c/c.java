/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.do;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class c
extends ag {
    public c() {
    }

    public c(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 1, 1, 1);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 0, 0, this.m.c[ad.a.b()]);
        }
        if (this.m.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 4, 1, 6, 4, 6, a);
        }
        for (int i2 = 1; i2 <= 6; ++i2) {
            for (int i3 = 1; i3 <= 6; ++i3) {
                if (random.nextInt(3) == 0) continue;
                int n2 = 2 + (random.nextInt(4) == 0 ? 0 : 1);
                this.a(k2, dc2, i2, n2, i3, i2, 3, i3, p.v.a(1), p.v.a(1), false);
            }
        }
        this.a(k2, dc2, 0, 1, 0, 0, 1, 7, d, d, false);
        this.a(k2, dc2, 7, 1, 0, 7, 1, 7, d, d, false);
        this.a(k2, dc2, 1, 1, 0, 6, 1, 0, d, d, false);
        this.a(k2, dc2, 1, 1, 7, 6, 1, 7, d, d, false);
        this.a(k2, dc2, 0, 2, 0, 0, 2, 7, e, e, false);
        this.a(k2, dc2, 7, 2, 0, 7, 2, 7, e, e, false);
        this.a(k2, dc2, 1, 2, 0, 6, 2, 0, e, e, false);
        this.a(k2, dc2, 1, 2, 7, 6, 2, 7, e, e, false);
        this.a(k2, dc2, 0, 3, 0, 0, 3, 7, d, d, false);
        this.a(k2, dc2, 7, 3, 0, 7, 3, 7, d, d, false);
        this.a(k2, dc2, 1, 3, 0, 6, 3, 0, d, d, false);
        this.a(k2, dc2, 1, 3, 7, 6, 3, 7, d, d, false);
        this.a(k2, dc2, 0, 1, 3, 0, 2, 4, e, e, false);
        this.a(k2, dc2, 7, 1, 3, 7, 2, 4, e, e, false);
        this.a(k2, dc2, 3, 1, 0, 4, 2, 0, e, e, false);
        this.a(k2, dc2, 3, 1, 7, 4, 2, 7, e, e, false);
        if (this.m.c[ad.d.b()]) {
            this.a(k2, dc2, 3, 1, 0, 4, 2, 0, false);
        }
        return true;
    }
}

