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

public class cn
extends ag {
    public cn() {
    }

    public cn(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 2, 1, 1);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        do do_ = this.m.b[ad.f.b()];
        do do_2 = this.m;
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 8, 0, do_.c[ad.a.b()]);
            this.a(k2, dc2, 0, 0, do_2.c[ad.a.b()]);
        }
        if (do_2.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 4, 1, 7, 4, 6, a);
        }
        if (do_.b[ad.b.b()] == null) {
            this.a(k2, dc2, 8, 4, 1, 14, 4, 6, a);
        }
        this.a(k2, dc2, 0, 3, 0, 0, 3, 7, d, d, false);
        this.a(k2, dc2, 15, 3, 0, 15, 3, 7, d, d, false);
        this.a(k2, dc2, 1, 3, 0, 15, 3, 0, d, d, false);
        this.a(k2, dc2, 1, 3, 7, 14, 3, 7, d, d, false);
        this.a(k2, dc2, 0, 2, 0, 0, 2, 7, a, a, false);
        this.a(k2, dc2, 15, 2, 0, 15, 2, 7, a, a, false);
        this.a(k2, dc2, 1, 2, 0, 15, 2, 0, a, a, false);
        this.a(k2, dc2, 1, 2, 7, 14, 2, 7, a, a, false);
        this.a(k2, dc2, 0, 1, 0, 0, 1, 7, d, d, false);
        this.a(k2, dc2, 15, 1, 0, 15, 1, 7, d, d, false);
        this.a(k2, dc2, 1, 1, 0, 15, 1, 0, d, d, false);
        this.a(k2, dc2, 1, 1, 7, 14, 1, 7, d, d, false);
        this.a(k2, dc2, 5, 1, 0, 10, 1, 4, d, d, false);
        this.a(k2, dc2, 6, 2, 0, 9, 2, 3, a, a, false);
        this.a(k2, dc2, 5, 3, 0, 10, 3, 4, d, d, false);
        this.a(k2, g, 6, 2, 3, dc2);
        this.a(k2, g, 9, 2, 3, dc2);
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
        return true;
    }
}

