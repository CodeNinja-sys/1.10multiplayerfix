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

public class cz
extends dn {
    public cz() {
    }

    public cz(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
    }

    public static cz a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 9, 7, 12, ad2);
        return cz.a(dc2) && r.a(list, dc2) == null ? new cz(ak2, n5, random, dc2, ad2) : null;
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
        b b5 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.f)));
        b b6 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.e)));
        b b7 = this.a(p.f.v());
        b b8 = this.a(p.r.v());
        this.a(k2, dc2, 1, 1, 1, 7, 4, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 2, 1, 6, 8, 4, 10, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 2, 0, 5, 8, 0, 10, b7, b7, false);
        this.a(k2, dc2, 1, 0, 1, 7, 0, 4, b7, b7, false);
        this.a(k2, dc2, 0, 0, 0, 0, 3, 5, b2, b2, false);
        this.a(k2, dc2, 8, 0, 0, 8, 3, 10, b2, b2, false);
        this.a(k2, dc2, 1, 0, 0, 7, 2, 0, b2, b2, false);
        this.a(k2, dc2, 1, 0, 5, 2, 1, 5, b2, b2, false);
        this.a(k2, dc2, 2, 0, 6, 2, 3, 10, b2, b2, false);
        this.a(k2, dc2, 3, 0, 10, 7, 3, 10, b2, b2, false);
        this.a(k2, dc2, 1, 2, 0, 7, 3, 0, b7, b7, false);
        this.a(k2, dc2, 1, 2, 5, 2, 3, 5, b7, b7, false);
        this.a(k2, dc2, 0, 4, 1, 8, 4, 1, b7, b7, false);
        this.a(k2, dc2, 0, 4, 4, 3, 4, 4, b7, b7, false);
        this.a(k2, dc2, 0, 5, 2, 8, 5, 3, b7, b7, false);
        this.a(k2, b7, 0, 4, 2, dc2);
        this.a(k2, b7, 0, 4, 3, dc2);
        this.a(k2, b7, 8, 4, 2, dc2);
        this.a(k2, b7, 8, 4, 3, dc2);
        this.a(k2, b7, 8, 4, 4, dc2);
        b b9 = b3;
        b b10 = b4;
        b b11 = b6;
        b b12 = b5;
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= 8; ++n2) {
                this.a(k2, b9, n2, 4 + n3, n3, dc2);
                if (n3 <= -1 && n2 > 1 || n3 <= 0 && n2 > 3 || n3 <= 1 && n2 > 4 && n2 < 6) continue;
                this.a(k2, b10, n2, 4 + n3, 5 - n3, dc2);
            }
        }
        this.a(k2, dc2, 3, 4, 5, 3, 4, 10, b7, b7, false);
        this.a(k2, dc2, 7, 4, 2, 7, 4, 10, b7, b7, false);
        this.a(k2, dc2, 4, 5, 4, 4, 5, 10, b7, b7, false);
        this.a(k2, dc2, 6, 5, 4, 6, 5, 10, b7, b7, false);
        this.a(k2, dc2, 5, 6, 3, 5, 6, 10, b7, b7, false);
        for (n3 = 4; n3 >= 1; --n3) {
            this.a(k2, b7, n3, 2 + n3, 7 - n3, dc2);
            for (n2 = 8 - n3; n2 <= 10; ++n2) {
                this.a(k2, b12, n3, 2 + n3, n2, dc2);
            }
        }
        this.a(k2, b7, 6, 6, 3, dc2);
        this.a(k2, b7, 7, 5, 4, dc2);
        this.a(k2, b6, 6, 6, 4, dc2);
        for (n3 = 6; n3 <= 8; ++n3) {
            for (n2 = 5; n2 <= 10; ++n2) {
                this.a(k2, b11, n3, 12 - n3, n2, dc2);
            }
        }
        this.a(k2, b8, 0, 2, 1, dc2);
        this.a(k2, b8, 0, 2, 4, dc2);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 0, 2, 3, dc2);
        this.a(k2, b8, 4, 2, 0, dc2);
        this.a(k2, p.bj.v(), 5, 2, 0, dc2);
        this.a(k2, b8, 6, 2, 0, dc2);
        this.a(k2, b8, 8, 2, 1, dc2);
        this.a(k2, p.bj.v(), 8, 2, 2, dc2);
        this.a(k2, p.bj.v(), 8, 2, 3, dc2);
        this.a(k2, b8, 8, 2, 4, dc2);
        this.a(k2, b7, 8, 2, 5, dc2);
        this.a(k2, b8, 8, 2, 6, dc2);
        this.a(k2, p.bj.v(), 8, 2, 7, dc2);
        this.a(k2, p.bj.v(), 8, 2, 8, dc2);
        this.a(k2, b8, 8, 2, 9, dc2);
        this.a(k2, b8, 2, 2, 6, dc2);
        this.a(k2, p.bj.v(), 2, 2, 7, dc2);
        this.a(k2, p.bj.v(), 2, 2, 8, dc2);
        this.a(k2, b8, 2, 2, 9, dc2);
        this.a(k2, b8, 4, 4, 10, dc2);
        this.a(k2, p.bj.v(), 5, 4, 10, dc2);
        this.a(k2, b8, 6, 4, 10, dc2);
        this.a(k2, b7, 5, 5, 10, dc2);
        this.a(k2, p.a.v(), 2, 1, 0, dc2);
        this.a(k2, p.a.v(), 2, 2, 0, dc2);
        this.a(k2, ad.c, 2, 3, 1, dc2);
        this.a(k2, dc2, random, 2, 1, 0, ad.c);
        this.a(k2, dc2, 1, 0, -1, 3, 2, -1, p.a.v(), p.a.v(), false);
        if (this.a(k2, 2, 0, -1, dc2).d() == h.a && this.a(k2, 2, -1, -1, dc2).d() != h.a) {
            this.a(k2, b9, 2, 0, -1, dc2);
            if (this.a(k2, 2, -1, -1, dc2).c() == p.da) {
                this.a(k2, p.c.v(), 2, -1, -1, dc2);
            }
        }
        for (n3 = 0; n3 < 5; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.c(k2, n2, 7, n3, dc2);
                this.b(k2, b2, n2, -1, n3, dc2);
            }
        }
        for (n3 = 5; n3 < 11; ++n3) {
            for (n2 = 2; n2 < 9; ++n2) {
                this.c(k2, n2, 7, n3, dc2);
                this.b(k2, b2, n2, -1, n3, dc2);
            }
        }
        this.a(k2, dc2, 4, 1, 2, 2);
        return true;
    }
}

