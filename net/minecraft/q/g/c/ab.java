/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dr;
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ab
extends am {
    public ab() {
    }

    public ab(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((ds)r2, list, random, 1, 1);
    }

    public static ab a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -1, -7, 0, 5, 11, 8, ad2);
        return ab.a(dc2) && r.a(list, dc2) == null ? new ab(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 4, 10, 7, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 1, 7, 0);
        this.a(k2, random, dc2, dr.a, 1, 1, 7);
        b b2 = p.aw.v().a(bi.a, (Comparable)((Object)ad.d));
        for (int i2 = 0; i2 < 6; ++i2) {
            this.a(k2, b2, 1, 6 - i2, 1 + i2, dc2);
            this.a(k2, b2, 2, 6 - i2, 1 + i2, dc2);
            this.a(k2, b2, 3, 6 - i2, 1 + i2, dc2);
            if (i2 >= 5) continue;
            this.a(k2, p.bf.v(), 1, 5 - i2, 1 + i2, dc2);
            this.a(k2, p.bf.v(), 2, 5 - i2, 1 + i2, dc2);
            this.a(k2, p.bf.v(), 3, 5 - i2, 1 + i2, dc2);
        }
        return true;
    }
}

