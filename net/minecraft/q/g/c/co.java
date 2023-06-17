/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class co
extends d {
    public co() {
    }

    public co(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((cc)r2, list, random, 1, 0, true);
    }

    public static co a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -7, 0, 5, 14, 10, ad2);
        return co.a(dc2) && r.a(list, dc2) == null ? new co(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        b b2 = p.bA.v().a(bi.a, (Comparable)((Object)ad.d));
        for (int i2 = 0; i2 <= 9; ++i2) {
            int n2 = Math.max(1, 7 - i2);
            int n3 = Math.min(Math.max(n2 + 5, 14 - i2), 13);
            int n4 = i2;
            this.a(k2, dc2, 0, 0, i2, 4, n2, i2, p.by.v(), p.by.v(), false);
            this.a(k2, dc2, 1, n2 + 1, i2, 3, n3 - 1, i2, p.a.v(), p.a.v(), false);
            if (i2 <= 6) {
                this.a(k2, b2, 1, n2 + 1, i2, dc2);
                this.a(k2, b2, 2, n2 + 1, i2, dc2);
                this.a(k2, b2, 3, n2 + 1, i2, dc2);
            }
            this.a(k2, dc2, 0, n3, i2, 4, n3, i2, p.by.v(), p.by.v(), false);
            this.a(k2, dc2, 0, n2 + 1, i2, 0, n3 - 1, i2, p.by.v(), p.by.v(), false);
            this.a(k2, dc2, 4, n2 + 1, i2, 4, n3 - 1, i2, p.by.v(), p.by.v(), false);
            if ((i2 & 1) == 0) {
                this.a(k2, dc2, 0, n2 + 2, i2, 0, n2 + 3, i2, p.bz.v(), p.bz.v(), false);
                this.a(k2, dc2, 4, n2 + 2, i2, 4, n2 + 3, i2, p.bz.v(), p.bz.v(), false);
            }
            for (int i3 = 0; i3 <= 4; ++i3) {
                this.b(k2, p.by.v(), i3, -1, n4, dc2);
            }
        }
        return true;
    }
}

