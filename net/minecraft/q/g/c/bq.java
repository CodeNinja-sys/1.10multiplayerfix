/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class bq
extends dn {
    public bq() {
    }

    public bq(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
    }

    public static bq a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 9, 7, 11, ad2);
        return bq.a(dc2) && r.a(list, dc2) == null ? new bq(ak2, n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 7 - 1, 0);
        }
        b b2 = this.a(p.e.v());
        b b3 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b4 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.d)));
        b b5 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.e)));
        b b6 = this.a(p.f.v());
        b b7 = this.a(p.r.v());
        b b8 = this.a(p.aO.v());
        this.a(k2, dc2, 1, 1, 1, 7, 4, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 2, 1, 6, 8, 4, 10, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 2, 0, 6, 8, 0, 10, p.d.v(), p.d.v(), false);
        this.a(k2, b2, 6, 0, 6, dc2);
        this.a(k2, dc2, 2, 1, 6, 2, 1, 10, b8, b8, false);
        this.a(k2, dc2, 8, 1, 6, 8, 1, 10, b8, b8, false);
        this.a(k2, dc2, 3, 1, 10, 7, 1, 10, b8, b8, false);
        this.a(k2, dc2, 1, 0, 1, 7, 0, 4, b6, b6, false);
        this.a(k2, dc2, 0, 0, 0, 0, 3, 5, b2, b2, false);
        this.a(k2, dc2, 8, 0, 0, 8, 3, 5, b2, b2, false);
        this.a(k2, dc2, 1, 0, 0, 7, 1, 0, b2, b2, false);
        this.a(k2, dc2, 1, 0, 5, 7, 1, 5, b2, b2, false);
        this.a(k2, dc2, 1, 2, 0, 7, 3, 0, b6, b6, false);
        this.a(k2, dc2, 1, 2, 5, 7, 3, 5, b6, b6, false);
        this.a(k2, dc2, 0, 4, 1, 8, 4, 1, b6, b6, false);
        this.a(k2, dc2, 0, 4, 4, 8, 4, 4, b6, b6, false);
        this.a(k2, dc2, 0, 5, 2, 8, 5, 3, b6, b6, false);
        this.a(k2, b6, 0, 4, 2, dc2);
        this.a(k2, b6, 0, 4, 3, dc2);
        this.a(k2, b6, 8, 4, 2, dc2);
        this.a(k2, b6, 8, 4, 3, dc2);
        b b9 = b3;
        b b10 = b4;
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(k2, b9, n2, 4 + n3, n3, dc2);
                this.a(k2, b10, n2, 4 + n3, 5 - n3, dc2);
            }
        }
        this.a(k2, b7, 0, 2, 1, dc2);
        this.a(k2, b7, 0, 2, 4, dc2);
        this.a(k2, b7, 8, 2, 1, dc2);
        this.a(k2, b7, 8, 2, 4, dc2);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 0, 2, 3, dc2);
        this.a(k2, p.bj.v(), 8, 2, 2, dc2);
        this.a(k2, p.bj.v(), 8, 2, 3, dc2);
        this.a(k2, p.bj.v(), 2, 2, 5, dc2);
        this.a(k2, p.bj.v(), 3, 2, 5, dc2);
        this.a(k2, p.bj.v(), 5, 2, 0, dc2);
        this.a(k2, p.bj.v(), 6, 2, 5, dc2);
        this.a(k2, b8, 2, 1, 3, dc2);
        this.a(k2, p.aB.v(), 2, 2, 3, dc2);
        this.a(k2, b6, 1, 1, 4, dc2);
        this.a(k2, b9, 2, 1, 4, dc2);
        this.a(k2, b5, 1, 1, 3, dc2);
        this.a(k2, dc2, 5, 0, 1, 7, 0, 3, p.T.v(), p.T.v(), false);
        this.a(k2, p.T.v(), 6, 1, 1, dc2);
        this.a(k2, p.T.v(), 6, 1, 2, dc2);
        this.a(k2, p.a.v(), 2, 1, 0, dc2);
        this.a(k2, p.a.v(), 2, 2, 0, dc2);
        this.a(k2, ad.c, 2, 3, 1, dc2);
        this.a(k2, dc2, random, 2, 1, 0, ad.c);
        if (this.a(k2, 2, 0, -1, dc2).d() == h.a && this.a(k2, 2, -1, -1, dc2).d() != h.a) {
            this.a(k2, b9, 2, 0, -1, dc2);
            if (this.a(k2, 2, -1, -1, dc2).c() == p.da) {
                this.a(k2, p.c.v(), 2, -1, -1, dc2);
            }
        }
        this.a(k2, p.a.v(), 6, 1, 5, dc2);
        this.a(k2, p.a.v(), 6, 2, 5, dc2);
        this.a(k2, ad.d, 6, 3, 4, dc2);
        this.a(k2, dc2, random, 6, 1, 5, ad.d);
        for (n3 = 0; n3 < 5; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(k2, n2, 7, n3, dc2);
                this.b(k2, b2, n2, -1, n3, dc2);
            }
        }
        this.a(k2, dc2, 4, 1, 2, 2);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return n2 == 0 ? 4 : super.c(n2, n3);
    }
}

