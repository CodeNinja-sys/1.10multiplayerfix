/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ca
extends d {
    public ca() {
    }

    public ca(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        int n2 = 1;
        ad ad2 = this.i();
        if (ad2 == ad.e || ad2 == ad.c) {
            n2 = 5;
        }
        this.b((cc)r2, list, random, 0, n2, random.nextInt(8) > 0);
        this.c((cc)r2, list, random, 0, n2, random.nextInt(8) > 0);
    }

    public static ca a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -3, 0, 0, 9, 7, 9, ad2);
        return ca.a(dc2) && r.a(list, dc2) == null ? new ca(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        this.a(k2, dc2, 0, 0, 0, 8, 1, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 0, 8, 5, 8, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 6, 0, 8, 6, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 0, 2, 5, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 2, 0, 8, 5, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 3, 0, 1, 4, 0, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 7, 3, 0, 7, 4, 0, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 0, 2, 4, 8, 2, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 1, 4, 2, 2, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 6, 1, 4, 7, 2, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 3, 8, 8, 3, 8, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 0, 3, 6, 0, 3, 7, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 8, 3, 6, 8, 3, 7, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 0, 3, 4, 0, 5, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 8, 3, 4, 8, 5, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 3, 5, 2, 5, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 3, 5, 7, 5, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 4, 5, 1, 5, 5, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 7, 4, 5, 7, 5, 5, p.bz.v(), p.bz.v(), false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 8; ++i3) {
                this.b(k2, p.by.v(), i3, -1, i2, dc2);
            }
        }
        return true;
    }
}

