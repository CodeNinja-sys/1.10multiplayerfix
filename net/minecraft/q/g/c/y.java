/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.do;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class y
extends ag {
    public y() {
    }

    public y(ad ad2, do do_, Random random) {
        super(1, ad2, do_, 2, 2, 2);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        this.a(k2, dc2, 1, 8, 0, 14, 8, 14, a);
        int n3 = 7;
        b b2 = d;
        this.a(k2, dc2, 0, 7, 0, 0, 7, 15, b2, b2, false);
        this.a(k2, dc2, 15, 7, 0, 15, 7, 15, b2, b2, false);
        this.a(k2, dc2, 1, 7, 0, 15, 7, 0, b2, b2, false);
        this.a(k2, dc2, 1, 7, 15, 14, 7, 15, b2, b2, false);
        for (n3 = 1; n3 <= 6; ++n3) {
            b2 = d;
            if (n3 == 2 || n3 == 6) {
                b2 = a;
            }
            for (n2 = 0; n2 <= 15; n2 += 15) {
                this.a(k2, dc2, n2, n3, 0, n2, n3, 1, b2, b2, false);
                this.a(k2, dc2, n2, n3, 6, n2, n3, 9, b2, b2, false);
                this.a(k2, dc2, n2, n3, 14, n2, n3, 15, b2, b2, false);
            }
            this.a(k2, dc2, 1, n3, 0, 1, n3, 0, b2, b2, false);
            this.a(k2, dc2, 6, n3, 0, 9, n3, 0, b2, b2, false);
            this.a(k2, dc2, 14, n3, 0, 14, n3, 0, b2, b2, false);
            this.a(k2, dc2, 1, n3, 15, 14, n3, 15, b2, b2, false);
        }
        this.a(k2, dc2, 6, 3, 6, 9, 6, 9, e, e, false);
        this.a(k2, dc2, 7, 4, 7, 8, 5, 8, p.R.v(), p.R.v(), false);
        for (n3 = 3; n3 <= 6; n3 += 3) {
            for (n2 = 6; n2 <= 9; n2 += 3) {
                this.a(k2, g, n2, n3, 6, dc2);
                this.a(k2, g, n2, n3, 9, dc2);
            }
        }
        this.a(k2, dc2, 5, 1, 6, 5, 2, 6, d, d, false);
        this.a(k2, dc2, 5, 1, 9, 5, 2, 9, d, d, false);
        this.a(k2, dc2, 10, 1, 6, 10, 2, 6, d, d, false);
        this.a(k2, dc2, 10, 1, 9, 10, 2, 9, d, d, false);
        this.a(k2, dc2, 6, 1, 5, 6, 2, 5, d, d, false);
        this.a(k2, dc2, 9, 1, 5, 9, 2, 5, d, d, false);
        this.a(k2, dc2, 6, 1, 10, 6, 2, 10, d, d, false);
        this.a(k2, dc2, 9, 1, 10, 9, 2, 10, d, d, false);
        this.a(k2, dc2, 5, 2, 5, 5, 6, 5, d, d, false);
        this.a(k2, dc2, 5, 2, 10, 5, 6, 10, d, d, false);
        this.a(k2, dc2, 10, 2, 5, 10, 6, 5, d, d, false);
        this.a(k2, dc2, 10, 2, 10, 10, 6, 10, d, d, false);
        this.a(k2, dc2, 5, 7, 1, 5, 7, 6, d, d, false);
        this.a(k2, dc2, 10, 7, 1, 10, 7, 6, d, d, false);
        this.a(k2, dc2, 5, 7, 9, 5, 7, 14, d, d, false);
        this.a(k2, dc2, 10, 7, 9, 10, 7, 14, d, d, false);
        this.a(k2, dc2, 1, 7, 5, 6, 7, 5, d, d, false);
        this.a(k2, dc2, 1, 7, 10, 6, 7, 10, d, d, false);
        this.a(k2, dc2, 9, 7, 5, 14, 7, 5, d, d, false);
        this.a(k2, dc2, 9, 7, 10, 14, 7, 10, d, d, false);
        this.a(k2, dc2, 2, 1, 2, 2, 1, 3, d, d, false);
        this.a(k2, dc2, 3, 1, 2, 3, 1, 2, d, d, false);
        this.a(k2, dc2, 13, 1, 2, 13, 1, 3, d, d, false);
        this.a(k2, dc2, 12, 1, 2, 12, 1, 2, d, d, false);
        this.a(k2, dc2, 2, 1, 12, 2, 1, 13, d, d, false);
        this.a(k2, dc2, 3, 1, 13, 3, 1, 13, d, d, false);
        this.a(k2, dc2, 13, 1, 12, 13, 1, 13, d, d, false);
        this.a(k2, dc2, 12, 1, 13, 12, 1, 13, d, d, false);
        return true;
    }
}

