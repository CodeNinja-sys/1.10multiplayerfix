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

public class cy
extends dn {
    public cy() {
    }

    public cy(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
    }

    public static cy a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 9, 9, 6, ad2);
        return cy.a(dc2) && r.a(list, dc2) == null ? new cy(ak2, n5, random, dc2, ad2) : null;
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
            this.b.a(0, this.i - this.b.e + 9 - 1, 0);
        }
        b b2 = this.a(p.e.v());
        b b3 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b4 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.d)));
        b b5 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.f)));
        b b6 = this.a(p.f.v());
        b b7 = this.a(p.aw.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b8 = this.a(p.aO.v());
        this.a(k2, dc2, 1, 1, 1, 7, 5, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 0, 0, 8, 0, 5, b2, b2, false);
        this.a(k2, dc2, 0, 5, 0, 8, 5, 5, b2, b2, false);
        this.a(k2, dc2, 0, 6, 1, 8, 6, 4, b2, b2, false);
        this.a(k2, dc2, 0, 7, 2, 8, 7, 3, b2, b2, false);
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(k2, b3, n2, 6 + n3, n3, dc2);
                this.a(k2, b4, n2, 6 + n3, 5 - n3, dc2);
            }
        }
        this.a(k2, dc2, 0, 1, 0, 0, 1, 5, b2, b2, false);
        this.a(k2, dc2, 1, 1, 5, 8, 1, 5, b2, b2, false);
        this.a(k2, dc2, 8, 1, 0, 8, 1, 4, b2, b2, false);
        this.a(k2, dc2, 2, 1, 0, 7, 1, 0, b2, b2, false);
        this.a(k2, dc2, 0, 2, 0, 0, 4, 0, b2, b2, false);
        this.a(k2, dc2, 0, 2, 5, 0, 4, 5, b2, b2, false);
        this.a(k2, dc2, 8, 2, 5, 8, 4, 5, b2, b2, false);
        this.a(k2, dc2, 8, 2, 0, 8, 4, 0, b2, b2, false);
        this.a(k2, dc2, 0, 2, 1, 0, 4, 4, b6, b6, false);
        this.a(k2, dc2, 1, 2, 5, 7, 4, 5, b6, b6, false);
        this.a(k2, dc2, 8, 2, 1, 8, 4, 4, b6, b6, false);
        this.a(k2, dc2, 1, 2, 0, 7, 4, 0, b6, b6, false);
        this.a(k2, p.bj.v(), 4, 2, 0, dc2);
        this.a(k2, p.bj.v(), 5, 2, 0, dc2);
        this.a(k2, p.bj.v(), 6, 2, 0, dc2);
        this.a(k2, p.bj.v(), 4, 3, 0, dc2);
        this.a(k2, p.bj.v(), 5, 3, 0, dc2);
        this.a(k2, p.bj.v(), 6, 3, 0, dc2);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 0, 2, 3, dc2);
        this.a(k2, p.bj.v(), 0, 3, 2, dc2);
        this.a(k2, p.bj.v(), 0, 3, 3, dc2);
        this.a(k2, p.bj.v(), 8, 2, 2, dc2);
        this.a(k2, p.bj.v(), 8, 2, 3, dc2);
        this.a(k2, p.bj.v(), 8, 3, 2, dc2);
        this.a(k2, p.bj.v(), 8, 3, 3, dc2);
        this.a(k2, p.bj.v(), 2, 2, 5, dc2);
        this.a(k2, p.bj.v(), 3, 2, 5, dc2);
        this.a(k2, p.bj.v(), 5, 2, 5, dc2);
        this.a(k2, p.bj.v(), 6, 2, 5, dc2);
        this.a(k2, dc2, 1, 4, 1, 7, 4, 1, b6, b6, false);
        this.a(k2, dc2, 1, 4, 4, 7, 4, 4, b6, b6, false);
        this.a(k2, dc2, 1, 3, 4, 7, 3, 4, p.X.v(), p.X.v(), false);
        this.a(k2, b6, 7, 1, 4, dc2);
        this.a(k2, b5, 7, 1, 3, dc2);
        this.a(k2, b3, 6, 1, 4, dc2);
        this.a(k2, b3, 5, 1, 4, dc2);
        this.a(k2, b3, 4, 1, 4, dc2);
        this.a(k2, b3, 3, 1, 4, dc2);
        this.a(k2, b8, 6, 1, 3, dc2);
        this.a(k2, p.aB.v(), 6, 2, 3, dc2);
        this.a(k2, b8, 4, 1, 3, dc2);
        this.a(k2, p.aB.v(), 4, 2, 3, dc2);
        this.a(k2, p.ai.v(), 7, 1, 1, dc2);
        this.a(k2, p.a.v(), 1, 1, 0, dc2);
        this.a(k2, p.a.v(), 1, 2, 0, dc2);
        this.a(k2, dc2, random, 1, 1, 0, ad.c);
        if (this.a(k2, 1, 0, -1, dc2).d() == h.a && this.a(k2, 1, -1, -1, dc2).d() != h.a) {
            this.a(k2, b7, 1, 0, -1, dc2);
            if (this.a(k2, 1, -1, -1, dc2).c() == p.da) {
                this.a(k2, p.c.v(), 1, -1, -1, dc2);
            }
        }
        for (n3 = 0; n3 < 6; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(k2, n2, 9, n3, dc2);
                this.b(k2, b2, n2, -1, n3, dc2);
            }
        }
        this.a(k2, dc2, 2, 1, 2, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 1;
    }
}

