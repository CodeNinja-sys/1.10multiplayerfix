/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class n
extends ag {
    private int n;

    public n() {
    }

    public n(ad ad2, dc dc2, int n2) {
        super(ad2, dc2);
        this.n = n2 & 1;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.n == 0) {
            int n2;
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, 10 - n2, 3 - n2, 20 - n2, 12 + n2, 3 - n2, 20, d, d, false);
            }
            this.a(k2, dc2, 7, 0, 6, 15, 0, 16, d, d, false);
            this.a(k2, dc2, 6, 0, 6, 6, 3, 20, d, d, false);
            this.a(k2, dc2, 16, 0, 6, 16, 3, 20, d, d, false);
            this.a(k2, dc2, 7, 1, 7, 7, 1, 20, d, d, false);
            this.a(k2, dc2, 15, 1, 7, 15, 1, 20, d, d, false);
            this.a(k2, dc2, 7, 1, 6, 9, 3, 6, d, d, false);
            this.a(k2, dc2, 13, 1, 6, 15, 3, 6, d, d, false);
            this.a(k2, dc2, 8, 1, 7, 9, 1, 7, d, d, false);
            this.a(k2, dc2, 13, 1, 7, 14, 1, 7, d, d, false);
            this.a(k2, dc2, 9, 0, 5, 13, 0, 5, d, d, false);
            this.a(k2, dc2, 10, 0, 7, 12, 0, 7, e, e, false);
            this.a(k2, dc2, 8, 0, 10, 8, 0, 12, e, e, false);
            this.a(k2, dc2, 14, 0, 10, 14, 0, 12, e, e, false);
            for (n2 = 18; n2 >= 7; n2 -= 3) {
                this.a(k2, g, 6, 3, n2, dc2);
                this.a(k2, g, 16, 3, n2, dc2);
            }
            this.a(k2, g, 10, 0, 10, dc2);
            this.a(k2, g, 12, 0, 10, dc2);
            this.a(k2, g, 10, 0, 12, dc2);
            this.a(k2, g, 12, 0, 12, dc2);
            this.a(k2, g, 8, 3, 6, dc2);
            this.a(k2, g, 14, 3, 6, dc2);
            this.a(k2, d, 4, 2, 4, dc2);
            this.a(k2, g, 4, 1, 4, dc2);
            this.a(k2, d, 4, 0, 4, dc2);
            this.a(k2, d, 18, 2, 4, dc2);
            this.a(k2, g, 18, 1, 4, dc2);
            this.a(k2, d, 18, 0, 4, dc2);
            this.a(k2, d, 4, 2, 18, dc2);
            this.a(k2, g, 4, 1, 18, dc2);
            this.a(k2, d, 4, 0, 18, dc2);
            this.a(k2, d, 18, 2, 18, dc2);
            this.a(k2, g, 18, 1, 18, dc2);
            this.a(k2, d, 18, 0, 18, dc2);
            this.a(k2, d, 9, 7, 20, dc2);
            this.a(k2, d, 13, 7, 20, dc2);
            this.a(k2, dc2, 6, 0, 21, 7, 4, 21, d, d, false);
            this.a(k2, dc2, 15, 0, 21, 16, 4, 21, d, d, false);
            this.a(k2, dc2, 11, 2, 16);
        } else if (this.n == 1) {
            int n3;
            this.a(k2, dc2, 9, 3, 18, 13, 3, 20, d, d, false);
            this.a(k2, dc2, 9, 0, 18, 9, 2, 18, d, d, false);
            this.a(k2, dc2, 13, 0, 18, 13, 2, 18, d, d, false);
            int n4 = 9;
            int n5 = 20;
            int n6 = 5;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(k2, d, n4, 6, 20, dc2);
                this.a(k2, g, n4, 5, 20, dc2);
                this.a(k2, d, n4, 4, 20, dc2);
                n4 = 13;
            }
            this.a(k2, dc2, 7, 3, 7, 15, 3, 14, d, d, false);
            n4 = 10;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(k2, dc2, n4, 0, 10, n4, 6, 10, d, d, false);
                this.a(k2, dc2, n4, 0, 12, n4, 6, 12, d, d, false);
                this.a(k2, g, n4, 0, 10, dc2);
                this.a(k2, g, n4, 0, 12, dc2);
                this.a(k2, g, n4, 4, 10, dc2);
                this.a(k2, g, n4, 4, 12, dc2);
                n4 = 12;
            }
            n4 = 8;
            for (n3 = 0; n3 < 2; ++n3) {
                this.a(k2, dc2, n4, 0, 7, n4, 2, 7, d, d, false);
                this.a(k2, dc2, n4, 0, 14, n4, 2, 14, d, d, false);
                n4 = 14;
            }
            this.a(k2, dc2, 8, 3, 8, 8, 3, 13, e, e, false);
            this.a(k2, dc2, 14, 3, 8, 14, 3, 13, e, e, false);
            this.a(k2, dc2, 11, 5, 13);
        }
        return true;
    }
}

