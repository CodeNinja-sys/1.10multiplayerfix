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

public class an
extends d {
    public an() {
    }

    public an(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((cc)r2, list, random, 2, 0, false);
        this.b((cc)r2, list, random, 0, 2, false);
        this.c((cc)r2, list, random, 0, 2, false);
    }

    public static an a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -2, 0, 0, 7, 9, 7, ad2);
        return an.a(dc2) && r.a(list, dc2) == null ? new an(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        this.a(k2, dc2, 0, 0, 0, 6, 1, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 0, 6, 7, 6, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 2, 0, 1, 6, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 6, 1, 6, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 2, 0, 6, 6, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 2, 6, 6, 6, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 0, 0, 6, 1, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 5, 0, 6, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 2, 0, 6, 6, 1, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 2, 5, 6, 6, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 6, 0, 4, 6, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 0, 4, 5, 0, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 2, 6, 6, 4, 6, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 6, 4, 5, 6, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 0, 6, 2, 0, 6, 4, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 5, 2, 0, 5, 4, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 6, 6, 2, 6, 6, 4, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 5, 2, 6, 5, 4, p.bz.v(), p.bz.v(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(k2, p.by.v(), i2, -1, i3, dc2);
            }
        }
        return true;
    }
}

