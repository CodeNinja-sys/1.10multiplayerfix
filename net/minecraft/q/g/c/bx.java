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
import net.minecraft.g.cq;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class bx
extends dn {
    public bx() {
    }

    public bx(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
    }

    public static bx a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 5, 12, 9, ad2);
        return bx.a(dc2) && r.a(list, dc2) == null ? new bx(ak2, n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 12 - 1, 0);
        }
        b b2 = p.e.v();
        b b3 = this.a(p.aw.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b4 = this.a(p.aw.v().a(bi.a, (Comparable)((Object)ad.e)));
        b b5 = this.a(p.aw.v().a(bi.a, (Comparable)((Object)ad.f)));
        this.a(k2, dc2, 1, 1, 1, 3, 3, 7, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 5, 1, 3, 9, 3, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 0, 0, 3, 0, 8, b2, b2, false);
        this.a(k2, dc2, 1, 1, 0, 3, 10, 0, b2, b2, false);
        this.a(k2, dc2, 0, 1, 1, 0, 10, 3, b2, b2, false);
        this.a(k2, dc2, 4, 1, 1, 4, 10, 3, b2, b2, false);
        this.a(k2, dc2, 0, 0, 4, 0, 4, 7, b2, b2, false);
        this.a(k2, dc2, 4, 0, 4, 4, 4, 7, b2, b2, false);
        this.a(k2, dc2, 1, 1, 8, 3, 4, 8, b2, b2, false);
        this.a(k2, dc2, 1, 5, 4, 3, 10, 4, b2, b2, false);
        this.a(k2, dc2, 1, 5, 5, 3, 5, 7, b2, b2, false);
        this.a(k2, dc2, 0, 9, 0, 4, 9, 4, b2, b2, false);
        this.a(k2, dc2, 0, 4, 0, 4, 4, 4, b2, b2, false);
        this.a(k2, b2, 0, 11, 2, dc2);
        this.a(k2, b2, 4, 11, 2, dc2);
        this.a(k2, b2, 2, 11, 0, dc2);
        this.a(k2, b2, 2, 11, 4, dc2);
        this.a(k2, b2, 1, 1, 6, dc2);
        this.a(k2, b2, 1, 1, 7, dc2);
        this.a(k2, b2, 2, 1, 7, dc2);
        this.a(k2, b2, 3, 1, 6, dc2);
        this.a(k2, b2, 3, 1, 7, dc2);
        this.a(k2, b3, 1, 1, 5, dc2);
        this.a(k2, b3, 2, 1, 6, dc2);
        this.a(k2, b3, 3, 1, 5, dc2);
        this.a(k2, b4, 1, 2, 7, dc2);
        this.a(k2, b5, 3, 2, 7, dc2);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 0, 3, 2, dc2);
        this.a(k2, p.bj.v(), 4, 2, 2, dc2);
        this.a(k2, p.bj.v(), 4, 3, 2, dc2);
        this.a(k2, p.bj.v(), 0, 6, 2, dc2);
        this.a(k2, p.bj.v(), 0, 7, 2, dc2);
        this.a(k2, p.bj.v(), 4, 6, 2, dc2);
        this.a(k2, p.bj.v(), 4, 7, 2, dc2);
        this.a(k2, p.bj.v(), 2, 6, 0, dc2);
        this.a(k2, p.bj.v(), 2, 7, 0, dc2);
        this.a(k2, p.bj.v(), 2, 6, 4, dc2);
        this.a(k2, p.bj.v(), 2, 7, 4, dc2);
        this.a(k2, p.bj.v(), 0, 3, 6, dc2);
        this.a(k2, p.bj.v(), 4, 3, 6, dc2);
        this.a(k2, p.bj.v(), 2, 3, 8, dc2);
        this.a(k2, ad.d, 2, 4, 7, dc2);
        this.a(k2, ad.f, 1, 4, 6, dc2);
        this.a(k2, ad.e, 3, 4, 6, dc2);
        this.a(k2, ad.c, 2, 4, 5, dc2);
        b b6 = p.au.v().a(cq.a, (Comparable)((Object)ad.e));
        for (n2 = 1; n2 <= 9; ++n2) {
            this.a(k2, b6, 3, n2, 3, dc2);
        }
        this.a(k2, p.a.v(), 2, 1, 0, dc2);
        this.a(k2, p.a.v(), 2, 2, 0, dc2);
        this.a(k2, dc2, random, 2, 1, 0, ad.c);
        if (this.a(k2, 2, 0, -1, dc2).d() == h.a && this.a(k2, 2, -1, -1, dc2).d() != h.a) {
            this.a(k2, b3, 2, 0, -1, dc2);
            if (this.a(k2, 2, -1, -1, dc2).c() == p.da) {
                this.a(k2, p.c.v(), 2, -1, -1, dc2);
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            for (int i2 = 0; i2 < 5; ++i2) {
                this.c(k2, i2, 12, n2, dc2);
                this.b(k2, b2, i2, -1, n2, dc2);
            }
        }
        this.a(k2, dc2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 2;
    }
}

