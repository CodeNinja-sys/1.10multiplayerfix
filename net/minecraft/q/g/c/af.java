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

public class af
extends ag {
    private int n;

    public af() {
    }

    public af(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 1, 1, 1);
        this.n = random.nextInt(3);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        boolean bl2;
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 0, 0, this.m.c[ad.a.b()]);
        }
        if (this.m.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 4, 1, 6, 4, 6, a);
        }
        boolean bl3 = bl2 = this.n != 0 && random.nextBoolean() && !this.m.c[ad.a.b()] && !this.m.c[ad.b.b()] && this.m.c() > 1;
        if (this.n == 0) {
            this.a(k2, dc2, 0, 1, 0, 2, 1, 2, d, d, false);
            this.a(k2, dc2, 0, 3, 0, 2, 3, 2, d, d, false);
            this.a(k2, dc2, 0, 2, 0, 0, 2, 2, a, a, false);
            this.a(k2, dc2, 1, 2, 0, 2, 2, 0, a, a, false);
            this.a(k2, g, 1, 2, 1, dc2);
            this.a(k2, dc2, 5, 1, 0, 7, 1, 2, d, d, false);
            this.a(k2, dc2, 5, 3, 0, 7, 3, 2, d, d, false);
            this.a(k2, dc2, 7, 2, 0, 7, 2, 2, a, a, false);
            this.a(k2, dc2, 5, 2, 0, 6, 2, 0, a, a, false);
            this.a(k2, g, 6, 2, 1, dc2);
            this.a(k2, dc2, 0, 1, 5, 2, 1, 7, d, d, false);
            this.a(k2, dc2, 0, 3, 5, 2, 3, 7, d, d, false);
            this.a(k2, dc2, 0, 2, 5, 0, 2, 7, a, a, false);
            this.a(k2, dc2, 1, 2, 7, 2, 2, 7, a, a, false);
            this.a(k2, g, 1, 2, 6, dc2);
            this.a(k2, dc2, 5, 1, 5, 7, 1, 7, d, d, false);
            this.a(k2, dc2, 5, 3, 5, 7, 3, 7, d, d, false);
            this.a(k2, dc2, 7, 2, 5, 7, 2, 7, a, a, false);
            this.a(k2, dc2, 5, 2, 7, 6, 2, 7, a, a, false);
            this.a(k2, g, 6, 2, 6, dc2);
            if (this.m.c[ad.d.b()]) {
                this.a(k2, dc2, 3, 3, 0, 4, 3, 0, d, d, false);
            } else {
                this.a(k2, dc2, 3, 3, 0, 4, 3, 1, d, d, false);
                this.a(k2, dc2, 3, 2, 0, 4, 2, 0, a, a, false);
                this.a(k2, dc2, 3, 1, 0, 4, 1, 1, d, d, false);
            }
            if (this.m.c[ad.c.b()]) {
                this.a(k2, dc2, 3, 3, 7, 4, 3, 7, d, d, false);
            } else {
                this.a(k2, dc2, 3, 3, 6, 4, 3, 7, d, d, false);
                this.a(k2, dc2, 3, 2, 7, 4, 2, 7, a, a, false);
                this.a(k2, dc2, 3, 1, 6, 4, 1, 7, d, d, false);
            }
            if (this.m.c[ad.e.b()]) {
                this.a(k2, dc2, 0, 3, 3, 0, 3, 4, d, d, false);
            } else {
                this.a(k2, dc2, 0, 3, 3, 1, 3, 4, d, d, false);
                this.a(k2, dc2, 0, 2, 3, 0, 2, 4, a, a, false);
                this.a(k2, dc2, 0, 1, 3, 1, 1, 4, d, d, false);
            }
            if (this.m.c[ad.f.b()]) {
                this.a(k2, dc2, 7, 3, 3, 7, 3, 4, d, d, false);
            } else {
                this.a(k2, dc2, 6, 3, 3, 7, 3, 4, d, d, false);
                this.a(k2, dc2, 7, 2, 3, 7, 2, 4, a, a, false);
                this.a(k2, dc2, 6, 1, 3, 7, 1, 4, d, d, false);
            }
        } else if (this.n == 1) {
            this.a(k2, dc2, 2, 1, 2, 2, 3, 2, d, d, false);
            this.a(k2, dc2, 2, 1, 5, 2, 3, 5, d, d, false);
            this.a(k2, dc2, 5, 1, 5, 5, 3, 5, d, d, false);
            this.a(k2, dc2, 5, 1, 2, 5, 3, 2, d, d, false);
            this.a(k2, g, 2, 2, 2, dc2);
            this.a(k2, g, 2, 2, 5, dc2);
            this.a(k2, g, 5, 2, 5, dc2);
            this.a(k2, g, 5, 2, 2, dc2);
            this.a(k2, dc2, 0, 1, 0, 1, 3, 0, d, d, false);
            this.a(k2, dc2, 0, 1, 1, 0, 3, 1, d, d, false);
            this.a(k2, dc2, 0, 1, 7, 1, 3, 7, d, d, false);
            this.a(k2, dc2, 0, 1, 6, 0, 3, 6, d, d, false);
            this.a(k2, dc2, 6, 1, 7, 7, 3, 7, d, d, false);
            this.a(k2, dc2, 7, 1, 6, 7, 3, 6, d, d, false);
            this.a(k2, dc2, 6, 1, 0, 7, 3, 0, d, d, false);
            this.a(k2, dc2, 7, 1, 1, 7, 3, 1, d, d, false);
            this.a(k2, a, 1, 2, 0, dc2);
            this.a(k2, a, 0, 2, 1, dc2);
            this.a(k2, a, 1, 2, 7, dc2);
            this.a(k2, a, 0, 2, 6, dc2);
            this.a(k2, a, 6, 2, 7, dc2);
            this.a(k2, a, 7, 2, 6, dc2);
            this.a(k2, a, 6, 2, 0, dc2);
            this.a(k2, a, 7, 2, 1, dc2);
            if (!this.m.c[ad.d.b()]) {
                this.a(k2, dc2, 1, 3, 0, 6, 3, 0, d, d, false);
                this.a(k2, dc2, 1, 2, 0, 6, 2, 0, a, a, false);
                this.a(k2, dc2, 1, 1, 0, 6, 1, 0, d, d, false);
            }
            if (!this.m.c[ad.c.b()]) {
                this.a(k2, dc2, 1, 3, 7, 6, 3, 7, d, d, false);
                this.a(k2, dc2, 1, 2, 7, 6, 2, 7, a, a, false);
                this.a(k2, dc2, 1, 1, 7, 6, 1, 7, d, d, false);
            }
            if (!this.m.c[ad.e.b()]) {
                this.a(k2, dc2, 0, 3, 1, 0, 3, 6, d, d, false);
                this.a(k2, dc2, 0, 2, 1, 0, 2, 6, a, a, false);
                this.a(k2, dc2, 0, 1, 1, 0, 1, 6, d, d, false);
            }
            if (!this.m.c[ad.f.b()]) {
                this.a(k2, dc2, 7, 3, 1, 7, 3, 6, d, d, false);
                this.a(k2, dc2, 7, 2, 1, 7, 2, 6, a, a, false);
                this.a(k2, dc2, 7, 1, 1, 7, 1, 6, d, d, false);
            }
        } else if (this.n == 2) {
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
            if (this.m.c[ad.c.b()]) {
                this.a(k2, dc2, 3, 1, 7, 4, 2, 7, false);
            }
            if (this.m.c[ad.e.b()]) {
                this.a(k2, dc2, 0, 1, 3, 0, 2, 4, false);
            }
            if (this.m.c[ad.f.b()]) {
                this.a(k2, dc2, 7, 1, 3, 7, 2, 4, false);
            }
        }
        if (bl2) {
            this.a(k2, dc2, 3, 1, 3, 4, 1, 4, d, d, false);
            this.a(k2, dc2, 3, 2, 3, 4, 2, 4, a, a, false);
            this.a(k2, dc2, 3, 3, 3, 4, 3, 4, d, d, false);
        }
        return true;
    }
}

