/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.do;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class z
extends ag {
    public z() {
    }

    public z(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 1, 2, 2);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        b b2;
        int n2;
        do do_ = this.m.b[ad.c.b()];
        do do_2 = this.m;
        do do_3 = do_.b[ad.b.b()];
        do do_4 = do_2.b[ad.b.b()];
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 0, 8, do_.c[ad.a.b()]);
            this.a(k2, dc2, 0, 0, do_2.c[ad.a.b()]);
        }
        if (do_4.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 8, 1, 6, 8, 7, a);
        }
        if (do_3.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 8, 8, 6, 8, 14, a);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            b2 = d;
            if (n2 == 2 || n2 == 6) {
                b2 = a;
            }
            this.a(k2, dc2, 0, n2, 0, 0, n2, 15, b2, b2, false);
            this.a(k2, dc2, 7, n2, 0, 7, n2, 15, b2, b2, false);
            this.a(k2, dc2, 1, n2, 0, 6, n2, 0, b2, b2, false);
            this.a(k2, dc2, 1, n2, 15, 6, n2, 15, b2, b2, false);
        }
        for (n2 = 1; n2 <= 7; ++n2) {
            b2 = e;
            if (n2 == 2 || n2 == 6) {
                b2 = g;
            }
            this.a(k2, dc2, 3, n2, 7, 4, n2, 8, b2, b2, false);
        }
        if (do_2.c[ad.d.b()]) {
            this.a(k2, dc2, 3, 1, 0, 4, 2, 0, false);
        }
        if (do_2.c[ad.f.b()]) {
            this.a(k2, dc2, 7, 1, 3, 7, 2, 4, false);
        }
        if (do_2.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 1, 3, 0, 2, 4, false);
        }
        if (do_.c[ad.c.b()]) {
            this.a(k2, dc2, 3, 1, 15, 4, 2, 15, false);
        }
        if (do_.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 1, 11, 0, 2, 12, false);
        }
        if (do_.c[ad.f.b()]) {
            this.a(k2, dc2, 7, 1, 11, 7, 2, 12, false);
        }
        if (do_4.c[ad.d.b()]) {
            this.a(k2, dc2, 3, 5, 0, 4, 6, 0, false);
        }
        if (do_4.c[ad.f.b()]) {
            this.a(k2, dc2, 7, 5, 3, 7, 6, 4, false);
            this.a(k2, dc2, 5, 4, 2, 6, 4, 5, d, d, false);
            this.a(k2, dc2, 6, 1, 2, 6, 3, 2, d, d, false);
            this.a(k2, dc2, 6, 1, 5, 6, 3, 5, d, d, false);
        }
        if (do_4.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 5, 3, 0, 6, 4, false);
            this.a(k2, dc2, 1, 4, 2, 2, 4, 5, d, d, false);
            this.a(k2, dc2, 1, 1, 2, 1, 3, 2, d, d, false);
            this.a(k2, dc2, 1, 1, 5, 1, 3, 5, d, d, false);
        }
        if (do_3.c[ad.c.b()]) {
            this.a(k2, dc2, 3, 5, 15, 4, 6, 15, false);
        }
        if (do_3.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 5, 11, 0, 6, 12, false);
            this.a(k2, dc2, 1, 4, 10, 2, 4, 13, d, d, false);
            this.a(k2, dc2, 1, 1, 10, 1, 3, 10, d, d, false);
            this.a(k2, dc2, 1, 1, 13, 1, 3, 13, d, d, false);
        }
        if (do_3.c[ad.f.b()]) {
            this.a(k2, dc2, 7, 5, 11, 7, 6, 12, false);
            this.a(k2, dc2, 5, 4, 10, 6, 4, 13, d, d, false);
            this.a(k2, dc2, 6, 1, 10, 6, 3, 10, d, d, false);
            this.a(k2, dc2, 6, 1, 13, 6, 3, 13, d, d, false);
        }
        return true;
    }
}

