/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.ew;
import net.minecraft.g.ga;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class bo
extends am {
    public bo() {
    }

    public bo(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((ds)r2, list, random, 1, 1);
    }

    public static bo a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -1, 0, 9, 5, 11, ad2);
        return bo.a(dc2) && r.a(list, dc2) == null ? new bo(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 8, 4, 10, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 1, 1, 0);
        this.a(k2, dc2, 1, 1, 10, 3, 3, 10, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 4, 1, 1, 4, 3, 1, false, random, dq.c());
        this.a(k2, dc2, 4, 1, 3, 4, 3, 3, false, random, dq.c());
        this.a(k2, dc2, 4, 1, 7, 4, 3, 7, false, random, dq.c());
        this.a(k2, dc2, 4, 1, 9, 4, 3, 9, false, random, dq.c());
        this.a(k2, dc2, 4, 1, 4, 4, 3, 6, p.bi.v(), p.bi.v(), false);
        this.a(k2, dc2, 5, 1, 5, 7, 3, 5, p.bi.v(), p.bi.v(), false);
        this.a(k2, p.bi.v(), 4, 3, 2, dc2);
        this.a(k2, p.bi.v(), 4, 3, 8, dc2);
        b b2 = p.aA.v().a(ga.a, (Comparable)((Object)ad.e));
        b b3 = p.aA.v().a(ga.a, (Comparable)((Object)ad.e)).a(ga.e, (Comparable)((Object)ew.a));
        this.a(k2, b2, 4, 1, 2, dc2);
        this.a(k2, b3, 4, 2, 2, dc2);
        this.a(k2, b2, 4, 1, 8, dc2);
        this.a(k2, b3, 4, 2, 8, dc2);
        return true;
    }
}

