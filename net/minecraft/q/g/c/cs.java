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

public class cs
extends d {
    public cs() {
    }

    public cs(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((cc)r2, list, random, 5, 3, true);
        this.a((cc)r2, list, random, 5, 11, true);
    }

    public static cs a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, ad2);
        return cs.a(dc2) && r.a(list, dc2) == null ? new cs(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        int n4;
        int n5;
        this.a(k2, dc2, 0, 3, 0, 12, 4, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 5, 0, 12, 13, 12, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 5, 0, 1, 12, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 11, 5, 0, 12, 12, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 11, 4, 12, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 8, 5, 11, 10, 12, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 9, 11, 7, 12, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 0, 4, 12, 1, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 8, 5, 0, 10, 12, 1, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 5, 9, 0, 7, 12, 1, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 11, 2, 10, 12, 10, p.by.v(), p.by.v(), false);
        for (n5 = 1; n5 <= 11; n5 += 2) {
            this.a(k2, dc2, n5, 10, 0, n5, 11, 0, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, n5, 10, 12, n5, 11, 12, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, 0, 10, n5, 0, 11, n5, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, 12, 10, n5, 12, 11, n5, p.bz.v(), p.bz.v(), false);
            this.a(k2, p.by.v(), n5, 13, 0, dc2);
            this.a(k2, p.by.v(), n5, 13, 12, dc2);
            this.a(k2, p.by.v(), 0, 13, n5, dc2);
            this.a(k2, p.by.v(), 12, 13, n5, dc2);
            this.a(k2, p.bz.v(), n5 + 1, 13, 0, dc2);
            this.a(k2, p.bz.v(), n5 + 1, 13, 12, dc2);
            this.a(k2, p.bz.v(), 0, 13, n5 + 1, dc2);
            this.a(k2, p.bz.v(), 12, 13, n5 + 1, dc2);
        }
        this.a(k2, p.bz.v(), 0, 13, 0, dc2);
        this.a(k2, p.bz.v(), 0, 13, 12, dc2);
        this.a(k2, p.bz.v(), 0, 13, 0, dc2);
        this.a(k2, p.bz.v(), 12, 13, 0, dc2);
        for (n5 = 3; n5 <= 9; n5 += 2) {
            this.a(k2, dc2, 1, 7, n5, 1, 8, n5, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, 11, 7, n5, 11, 8, n5, p.bz.v(), p.bz.v(), false);
        }
        b b2 = p.bA.v().a(bi.a, (Comparable)((Object)ad.c));
        for (n4 = 0; n4 <= 6; ++n4) {
            int n6 = n4 + 4;
            for (n3 = 5; n3 <= 7; ++n3) {
                this.a(k2, b2, n3, 5 + n4, n6, dc2);
            }
            if (n6 >= 5 && n6 <= 8) {
                this.a(k2, dc2, 5, 5, n6, 7, n4 + 4, n6, p.by.v(), p.by.v(), false);
            } else if (n6 >= 9 && n6 <= 10) {
                this.a(k2, dc2, 5, 8, n6, 7, n4 + 4, n6, p.by.v(), p.by.v(), false);
            }
            if (n4 < 1) continue;
            this.a(k2, dc2, 5, 6 + n4, n6, 7, 9 + n4, n6, p.a.v(), p.a.v(), false);
        }
        for (n4 = 5; n4 <= 7; ++n4) {
            this.a(k2, b2, n4, 12, 11, dc2);
        }
        this.a(k2, dc2, 5, 6, 7, 5, 7, 7, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 7, 6, 7, 7, 7, 7, p.bz.v(), p.bz.v(), false);
        this.a(k2, dc2, 5, 13, 12, 7, 13, 12, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 2, 5, 2, 3, 5, 3, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 9, 3, 5, 10, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 2, 5, 4, 2, 5, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 9, 5, 2, 10, 5, 3, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 9, 5, 9, 10, 5, 10, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 10, 5, 4, 10, 5, 8, p.by.v(), p.by.v(), false);
        b b3 = b2.a(bi.a, (Comparable)((Object)ad.f));
        b b4 = b2.a(bi.a, (Comparable)((Object)ad.e));
        this.a(k2, b4, 4, 5, 2, dc2);
        this.a(k2, b4, 4, 5, 3, dc2);
        this.a(k2, b4, 4, 5, 9, dc2);
        this.a(k2, b4, 4, 5, 10, dc2);
        this.a(k2, b3, 8, 5, 2, dc2);
        this.a(k2, b3, 8, 5, 3, dc2);
        this.a(k2, b3, 8, 5, 9, dc2);
        this.a(k2, b3, 8, 5, 10, dc2);
        this.a(k2, dc2, 3, 4, 4, 4, 4, 8, p.aW.v(), p.aW.v(), false);
        this.a(k2, dc2, 8, 4, 4, 9, 4, 8, p.aW.v(), p.aW.v(), false);
        this.a(k2, dc2, 3, 5, 4, 4, 5, 8, p.bB.v(), p.bB.v(), false);
        this.a(k2, dc2, 8, 5, 4, 9, 5, 8, p.bB.v(), p.bB.v(), false);
        this.a(k2, dc2, 4, 2, 0, 8, 2, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 2, 4, 12, 2, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 4, 0, 0, 8, 1, 3, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 4, 0, 9, 8, 1, 12, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 0, 4, 3, 1, 8, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 9, 0, 4, 12, 1, 8, p.by.v(), p.by.v(), false);
        for (n3 = 4; n3 <= 8; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(k2, p.by.v(), n3, -1, n2, dc2);
                this.b(k2, p.by.v(), n3, -1, 12 - n2, dc2);
            }
        }
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 4; n2 <= 8; ++n2) {
                this.b(k2, p.by.v(), n3, -1, n2, dc2);
                this.b(k2, p.by.v(), 12 - n3, -1, n2, dc2);
            }
        }
        return true;
    }
}

