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

public class bd
extends ag {
    public bd() {
    }

    public bd(ad ad2, do do_) {
        super(1, ad2, do_, 1, 1, 1);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        this.a(k2, dc2, 0, 3, 0, 2, 3, 7, d, d, false);
        this.a(k2, dc2, 5, 3, 0, 7, 3, 7, d, d, false);
        this.a(k2, dc2, 0, 2, 0, 1, 2, 7, d, d, false);
        this.a(k2, dc2, 6, 2, 0, 7, 2, 7, d, d, false);
        this.a(k2, dc2, 0, 1, 0, 0, 1, 7, d, d, false);
        this.a(k2, dc2, 7, 1, 0, 7, 1, 7, d, d, false);
        this.a(k2, dc2, 0, 1, 7, 7, 3, 7, d, d, false);
        this.a(k2, dc2, 1, 1, 0, 2, 3, 0, d, d, false);
        this.a(k2, dc2, 5, 1, 0, 6, 3, 0, d, d, false);
        if (this.m.c[ad.c.b()]) {
            this.a(k2, dc2, 3, 1, 7, 4, 2, 7, false);
        }
        if (this.m.c[ad.e.b()]) {
            this.a(k2, dc2, 0, 1, 3, 1, 2, 4, false);
        }
        if (this.m.c[ad.f.b()]) {
            this.a(k2, dc2, 6, 1, 3, 7, 2, 4, false);
        }
        return true;
    }
}

