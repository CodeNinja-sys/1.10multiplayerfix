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

public class cg
extends ag {
    public cg() {
    }

    public cg(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 1, 1, 2);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        do do_ = this.m.b[ad.c.b()];
        do do_2 = this.m;
        if (this.m.a / 25 > 0) {
            this.a(k2, dc2, 0, 8, do_.c[ad.a.b()]);
            this.a(k2, dc2, 0, 0, do_2.c[ad.a.b()]);
        }
        if (do_2.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 4, 1, 6, 4, 7, a);
        }
        if (do_.b[ad.b.b()] == null) {
            this.a(k2, dc2, 1, 4, 8, 6, 4, 14, a);
        }
        this.a(k2, dc2, 0, 3, 0, 0, 3, 15, d, d, false);
        this.a(k2, dc2, 7, 3, 0, 7, 3, 15, d, d, false);
        this.a(k2, dc2, 1, 3, 0, 7, 3, 0, d, d, false);
        this.a(k2, dc2, 1, 3, 15, 6, 3, 15, d, d, false);
        this.a(k2, dc2, 0, 2, 0, 0, 2, 15, a, a, false);
        this.a(k2, dc2, 7, 2, 0, 7, 2, 15, a, a, false);
        this.a(k2, dc2, 1, 2, 0, 7, 2, 0, a, a, false);
        this.a(k2, dc2, 1, 2, 15, 6, 2, 15, a, a, false);
        this.a(k2, dc2, 0, 1, 0, 0, 1, 15, d, d, false);
        this.a(k2, dc2, 7, 1, 0, 7, 1, 15, d, d, false);
        this.a(k2, dc2, 1, 1, 0, 7, 1, 0, d, d, false);
        this.a(k2, dc2, 1, 1, 15, 6, 1, 15, d, d, false);
        this.a(k2, dc2, 1, 1, 1, 1, 1, 2, d, d, false);
        this.a(k2, dc2, 6, 1, 1, 6, 1, 2, d, d, false);
        this.a(k2, dc2, 1, 3, 1, 1, 3, 2, d, d, false);
        this.a(k2, dc2, 6, 3, 1, 6, 3, 2, d, d, false);
        this.a(k2, dc2, 1, 1, 13, 1, 1, 14, d, d, false);
        this.a(k2, dc2, 6, 1, 13, 6, 1, 14, d, d, false);
        this.a(k2, dc2, 1, 3, 13, 1, 3, 14, d, d, false);
        this.a(k2, dc2, 6, 3, 13, 6, 3, 14, d, d, false);
        this.a(k2, dc2, 2, 1, 6, 2, 3, 6, d, d, false);
        this.a(k2, dc2, 5, 1, 6, 5, 3, 6, d, d, false);
        this.a(k2, dc2, 2, 1, 9, 2, 3, 9, d, d, false);
        this.a(k2, dc2, 5, 1, 9, 5, 3, 9, d, d, false);
        this.a(k2, dc2, 3, 2, 6, 4, 2, 6, d, d, false);
        this.a(k2, dc2, 3, 2, 9, 4, 2, 9, d, d, false);
        this.a(k2, dc2, 2, 2, 7, 2, 2, 8, d, d, false);
        this.a(k2, dc2, 5, 2, 7, 5, 2, 8, d, d, false);
        this.a(k2, g, 2, 2, 5, dc2);
        this.a(k2, g, 5, 2, 5, dc2);
        this.a(k2, g, 2, 2, 10, dc2);
        this.a(k2, g, 5, 2, 10, dc2);
        this.a(k2, d, 2, 3, 5, dc2);
        this.a(k2, d, 5, 3, 5, dc2);
        this.a(k2, d, 2, 3, 10, dc2);
        this.a(k2, d, 5, 3, 10, dc2);
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
        return true;
    }
}

