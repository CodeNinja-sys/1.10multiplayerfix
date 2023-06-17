/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ba
extends ag {
    public ba() {
    }

    public ba(ad ad2, dc dc2) {
        super(ad2, dc2);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        this.a(k2, dc2, 2, -1, 2, 11, -1, 11, d, d, false);
        this.a(k2, dc2, 0, -1, 0, 1, -1, 11, a, a, false);
        this.a(k2, dc2, 12, -1, 0, 13, -1, 11, a, a, false);
        this.a(k2, dc2, 2, -1, 0, 11, -1, 1, a, a, false);
        this.a(k2, dc2, 2, -1, 12, 11, -1, 13, a, a, false);
        this.a(k2, dc2, 0, 0, 0, 0, 0, 13, d, d, false);
        this.a(k2, dc2, 13, 0, 0, 13, 0, 13, d, d, false);
        this.a(k2, dc2, 1, 0, 0, 12, 0, 0, d, d, false);
        this.a(k2, dc2, 1, 0, 13, 12, 0, 13, d, d, false);
        for (n2 = 2; n2 <= 11; n2 += 3) {
            this.a(k2, g, 0, 0, n2, dc2);
            this.a(k2, g, 13, 0, n2, dc2);
            this.a(k2, g, n2, 0, 0, dc2);
        }
        this.a(k2, dc2, 2, 0, 3, 4, 0, 9, d, d, false);
        this.a(k2, dc2, 9, 0, 3, 11, 0, 9, d, d, false);
        this.a(k2, dc2, 4, 0, 9, 9, 0, 11, d, d, false);
        this.a(k2, d, 5, 0, 8, dc2);
        this.a(k2, d, 8, 0, 8, dc2);
        this.a(k2, d, 10, 0, 10, dc2);
        this.a(k2, d, 3, 0, 10, dc2);
        this.a(k2, dc2, 3, 0, 3, 3, 0, 7, e, e, false);
        this.a(k2, dc2, 10, 0, 3, 10, 0, 7, e, e, false);
        this.a(k2, dc2, 6, 0, 10, 7, 0, 10, e, e, false);
        n2 = 3;
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 2; i3 <= 8; i3 += 3) {
                this.a(k2, dc2, n2, 0, i3, n2, 2, i3, d, d, false);
            }
            n2 = 10;
        }
        this.a(k2, dc2, 5, 0, 10, 5, 2, 10, d, d, false);
        this.a(k2, dc2, 8, 0, 10, 8, 2, 10, d, d, false);
        this.a(k2, dc2, 6, -1, 7, 7, -1, 8, e, e, false);
        this.a(k2, dc2, 6, -1, 3, 7, -1, 4, false);
        this.a(k2, dc2, 6, 1, 6);
        return true;
    }
}

