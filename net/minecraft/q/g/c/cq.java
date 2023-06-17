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

public class cq
extends d {
    public cq() {
    }

    public cq(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.c((cc)r2, list, random, 6, 2, false);
    }

    public static cq a(List list, Random random, int n2, int n3, int n4, int n5, ad ad2) {
        dc dc2 = dc.a(n2, n3, n4, -2, 0, 0, 7, 11, 7, ad2);
        return cq.a(dc2) && r.a(list, dc2) == null ? new cq(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        this.a(k2, dc2, 0, 0, 0, 6, 1, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 0, 6, 10, 6, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 2, 0, 1, 8, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 2, 0, 6, 8, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 1, 0, 8, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 2, 1, 6, 8, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 2, 6, 5, 8, 6, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 3, 2, 0, 5, 4, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 6, 3, 2, 6, 5, 2, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 6, 3, 4, 6, 5, 4, p.bz.v(), p.bz.v(), false);
        this.a(k2, p.by.v(), 5, 2, 5, dc2);
        this.a(k2, dc2, 4, 2, 5, 4, 3, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 3, 2, 5, 3, 4, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 2, 5, 2, 5, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 2, 5, 1, 6, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 1, 7, 1, 5, 7, 4, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 8, 2, 6, 8, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 2, 6, 0, 4, 8, 0, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 0, 4, 5, 0, p.bz.v(), p.bz.v(), false);
        for (int i2 = 0; i2 <= 6; ++i2) {
            for (int i3 = 0; i3 <= 6; ++i3) {
                this.b(k2, p.by.v(), i2, -1, i3, dc2);
            }
        }
        return true;
    }
}

