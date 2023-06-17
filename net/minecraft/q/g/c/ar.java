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

public class ar
extends ag {
    public ar() {
    }

    public ar(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 2, 2, 1);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        do do_ = this.m.b[ad.f.b()];
        do do_2 = this.m;
        do do_3 = do_2.b[ad.b.b()];
        do do_4 = do_.b[ad.b.b()];
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 8, 0, do_.c[ad.a.b()]);
            this.a(k2, dc2, 0, 0, do_2.c[ad.a.b()]);
        }
        if (do_3.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 8, 1, 7, 8, 6, a);
        }
        if (do_4.b[ad.b.b()] == null) {
            this.a(k2, dc2, 8, 8, 1, 14, 8, 6, a);
        }
        for (int i2 = 1; i2 <= 7; ++i2) {
            b b2 = d;
            if (i2 == 2 || i2 == 6) {
                b2 = a;
            }
            this.a(k2, dc2, 0, i2, 0, 0, i2, 7, b2, b2, false);
            this.a(k2, dc2, 15, i2, 0, 15, i2, 7, b2, b2, false);
            this.a(k2, dc2, 1, i2, 0, 15, i2, 0, b2, b2, false);
            this.a(k2, dc2, 1, i2, 7, 14, i2, 7, b2, b2, false);
        }
        this.a(k2, dc2, 2, 1, 3, 2, 7, 4, d, d, false);
        this.a(k2, dc2, 3, 1, 2, 4, 7, 2, d, d, false);
        this.a(k2, dc2, 3, 1, 5, 4, 7, 5, d, d, false);
        this.a(k2, dc2, 13, 1, 3, 13, 7, 4, d, d, false);
        this.a(k2, dc2, 11, 1, 2, 12, 7, 2, d, d, false);
        this.a(k2, dc2, 11, 1, 5, 12, 7, 5, d, d, false);
        this.a(k2, dc2, 5, 1, 3, 5, 3, 4, d, d, false);
        this.a(k2, dc2, 10, 1, 3, 10, 3, 4, d, d, false);
        this.a(k2, dc2, 5, 7, 2, 10, 7, 5, d, d, false);
        this.a(k2, dc2, 5, 5, 2, 5, 7, 2, d, d, false);
        this.a(k2, dc2, 10, 5, 2, 10, 7, 2, d, d, false);
        this.a(k2, dc2, 5, 5, 5, 5, 7, 5, d, d, false);
        this.a(k2, dc2, 10, 5, 5, 10, 7, 5, d, d, false);
        this.a(k2, d, 6, 6, 2, dc2);
        this.a(k2, d, 9, 6, 2, dc2);
        this.a(k2, d, 6, 6, 5, dc2);
        this.a(k2, d, 9, 6, 5, dc2);
        this.a(k2, dc2, 5, 4, 3, 6, 4, 4, d, d, false);
        this.a(k2, dc2, 9, 4, 3, 10, 4, 4, d, d, false);
        this.a(k2, g, 5, 4, 2, dc2);
        this.a(k2, g, 5, 4, 5, dc2);
        this.a(k2, g, 10, 4, 2, dc2);
        this.a(k2, g, 10, 4, 5, dc2);
        if (do_2.c[ad.d.b()]) {
            this.a(k2, dc2, 3, 1, 0, 4, 2, 0, false);
        }
        if (do_2.c[ad.c.b()]) {
            this.a(k2, dc2, 3, 1, 7, 4, 2, 7, false);
        }
        if (do_2.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 1, 3, 0, 2, 4, false);
        }
        if (do_.c[ad.d.b()]) {
            this.a(k2, dc2, 11, 1, 0, 12, 2, 0, false);
        }
        if (do_.c[ad.c.b()]) {
            this.a(k2, dc2, 11, 1, 7, 12, 2, 7, false);
        }
        if (do_.c[ad.f.b()]) {
            this.a(k2, dc2, 15, 1, 3, 15, 2, 4, false);
        }
        if (do_3.c[ad.d.b()]) {
            this.a(k2, dc2, 3, 5, 0, 4, 6, 0, false);
        }
        if (do_3.c[ad.c.b()]) {
            this.a(k2, dc2, 3, 5, 7, 4, 6, 7, false);
        }
        if (do_3.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 5, 3, 0, 6, 4, false);
        }
        if (do_4.c[ad.d.b()]) {
            this.a(k2, dc2, 11, 5, 0, 12, 6, 0, false);
        }
        if (do_4.c[ad.c.b()]) {
            this.a(k2, dc2, 11, 5, 7, 12, 6, 7, false);
        }
        if (do_4.c[ad.f.b()]) {
            this.a(k2, dc2, 15, 5, 3, 15, 6, 4, false);
        }
        return true;
    }
}

