/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.do;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class bn
extends ag {
    public bn() {
    }

    public bn(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 1, 2, 1);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 0, 0, this.m.c[ad.a.b()]);
        }
        do do_ = this.m.b[ad.b.b()];
        if (do_.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 8, 1, 6, 8, 6, a);
        }
        this.a(k2, dc2, 0, 4, 0, 0, 4, 7, d, d, false);
        this.a(k2, dc2, 7, 4, 0, 7, 4, 7, d, d, false);
        this.a(k2, dc2, 1, 4, 0, 6, 4, 0, d, d, false);
        this.a(k2, dc2, 1, 4, 7, 6, 4, 7, d, d, false);
        this.a(k2, dc2, 2, 4, 1, 2, 4, 2, d, d, false);
        this.a(k2, dc2, 1, 4, 2, 1, 4, 2, d, d, false);
        this.a(k2, dc2, 5, 4, 1, 5, 4, 2, d, d, false);
        this.a(k2, dc2, 6, 4, 2, 6, 4, 2, d, d, false);
        this.a(k2, dc2, 2, 4, 5, 2, 4, 6, d, d, false);
        this.a(k2, dc2, 1, 4, 5, 1, 4, 5, d, d, false);
        this.a(k2, dc2, 5, 4, 5, 5, 4, 6, d, d, false);
        this.a(k2, dc2, 6, 4, 5, 6, 4, 5, d, d, false);
        do do_2 = this.m;
        for (int i2 = 1; i2 <= 5; i2 += 4) {
            int n2 = 0;
            if (do_2.c[ad.d.b()]) {
                this.a(k2, dc2, 2, i2, n2, 2, i2 + 2, n2, d, d, false);
                this.a(k2, dc2, 5, i2, n2, 5, i2 + 2, n2, d, d, false);
                this.a(k2, dc2, 3, i2 + 2, n2, 4, i2 + 2, n2, d, d, false);
            } else {
                this.a(k2, dc2, 0, i2, n2, 7, i2 + 2, n2, d, d, false);
                this.a(k2, dc2, 0, i2 + 1, n2, 7, i2 + 1, n2, a, a, false);
            }
            n2 = 7;
            if (do_2.c[ad.c.b()]) {
                this.a(k2, dc2, 2, i2, n2, 2, i2 + 2, n2, d, d, false);
                this.a(k2, dc2, 5, i2, n2, 5, i2 + 2, n2, d, d, false);
                this.a(k2, dc2, 3, i2 + 2, n2, 4, i2 + 2, n2, d, d, false);
            } else {
                this.a(k2, dc2, 0, i2, n2, 7, i2 + 2, n2, d, d, false);
                this.a(k2, dc2, 0, i2 + 1, n2, 7, i2 + 1, n2, a, a, false);
            }
            int n3 = 0;
            if (do_2.c[ad.e.b()]) {
                this.a(k2, dc2, n3, i2, 2, n3, i2 + 2, 2, d, d, false);
                this.a(k2, dc2, n3, i2, 5, n3, i2 + 2, 5, d, d, false);
                this.a(k2, dc2, n3, i2 + 2, 3, n3, i2 + 2, 4, d, d, false);
            } else {
                this.a(k2, dc2, n3, i2, 0, n3, i2 + 2, 7, d, d, false);
                this.a(k2, dc2, n3, i2 + 1, 0, n3, i2 + 1, 7, a, a, false);
            }
            n3 = 7;
            if (do_2.c[ad.f.b()]) {
                this.a(k2, dc2, n3, i2, 2, n3, i2 + 2, 2, d, d, false);
                this.a(k2, dc2, n3, i2, 5, n3, i2 + 2, 5, d, d, false);
                this.a(k2, dc2, n3, i2 + 2, 3, n3, i2 + 2, 4, d, d, false);
            } else {
                this.a(k2, dc2, n3, i2, 0, n3, i2 + 2, 7, d, d, false);
                this.a(k2, dc2, n3, i2 + 1, 0, n3, i2 + 1, 7, a, a, false);
            }
            do_2 = do_;
        }
        return true;
    }
}

