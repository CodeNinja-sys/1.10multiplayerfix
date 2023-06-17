/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cq;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ay
extends am {
    private boolean d;

    public ay() {
    }

    public ay(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
        this.d = dc2.d() > 6;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Tall", this.d);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.p("Tall");
    }

    public static ay a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -4, -1, 0, 14, 11, 15, ad2);
        if (!(ay.a(dc2) && r.a(list, dc2) == null || ay.a(dc2 = dc.a(n2, n3, n4, -4, -1, 0, 14, 6, 15, ad2)) && r.a(list, dc2) == null)) {
            return null;
        }
        return new ay(n5, random, dc2, ad2);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        if (this.a(k2, dc2)) {
            return false;
        }
        int n3 = 11;
        if (!this.d) {
            n3 = 6;
        }
        this.a(k2, dc2, 0, 0, 0, 13, n3 - 1, 14, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 4, 1, 0);
        this.a(k2, dc2, random, 0.07f, 2, 1, 1, 11, 4, 13, p.G.v(), p.G.v(), false, 0);
        boolean bl2 = true;
        int n4 = 12;
        for (n2 = 1; n2 <= 13; ++n2) {
            if ((n2 - 1) % 4 == 0) {
                this.a(k2, dc2, 1, 1, n2, 1, 4, n2, p.f.v(), p.f.v(), false);
                this.a(k2, dc2, 12, 1, n2, 12, 4, n2, p.f.v(), p.f.v(), false);
                this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.f)), 2, 3, n2, dc2);
                this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.e)), 11, 3, n2, dc2);
                if (!this.d) continue;
                this.a(k2, dc2, 1, 6, n2, 1, 9, n2, p.f.v(), p.f.v(), false);
                this.a(k2, dc2, 12, 6, n2, 12, 9, n2, p.f.v(), p.f.v(), false);
                continue;
            }
            this.a(k2, dc2, 1, 1, n2, 1, 4, n2, p.X.v(), p.X.v(), false);
            this.a(k2, dc2, 12, 1, n2, 12, 4, n2, p.X.v(), p.X.v(), false);
            if (!this.d) continue;
            this.a(k2, dc2, 1, 6, n2, 1, 9, n2, p.X.v(), p.X.v(), false);
            this.a(k2, dc2, 12, 6, n2, 12, 9, n2, p.X.v(), p.X.v(), false);
        }
        for (n2 = 3; n2 < 12; n2 += 2) {
            this.a(k2, dc2, 3, 1, n2, 4, 3, n2, p.X.v(), p.X.v(), false);
            this.a(k2, dc2, 6, 1, n2, 7, 3, n2, p.X.v(), p.X.v(), false);
            this.a(k2, dc2, 9, 1, n2, 10, 3, n2, p.X.v(), p.X.v(), false);
        }
        if (this.d) {
            this.a(k2, dc2, 1, 5, 1, 3, 5, 13, p.f.v(), p.f.v(), false);
            this.a(k2, dc2, 10, 5, 1, 12, 5, 13, p.f.v(), p.f.v(), false);
            this.a(k2, dc2, 4, 5, 1, 9, 5, 2, p.f.v(), p.f.v(), false);
            this.a(k2, dc2, 4, 5, 12, 9, 5, 13, p.f.v(), p.f.v(), false);
            this.a(k2, p.f.v(), 9, 5, 11, dc2);
            this.a(k2, p.f.v(), 8, 5, 11, dc2);
            this.a(k2, p.f.v(), 9, 5, 10, dc2);
            this.a(k2, dc2, 3, 6, 2, 3, 6, 12, p.aO.v(), p.aO.v(), false);
            this.a(k2, dc2, 10, 6, 2, 10, 6, 10, p.aO.v(), p.aO.v(), false);
            this.a(k2, dc2, 4, 6, 2, 9, 6, 2, p.aO.v(), p.aO.v(), false);
            this.a(k2, dc2, 4, 6, 12, 8, 6, 12, p.aO.v(), p.aO.v(), false);
            this.a(k2, p.aO.v(), 9, 6, 11, dc2);
            this.a(k2, p.aO.v(), 8, 6, 11, dc2);
            this.a(k2, p.aO.v(), 9, 6, 10, dc2);
            b b2 = p.au.v().a(cq.a, (Comparable)((Object)ad.d));
            this.a(k2, b2, 10, 1, 13, dc2);
            this.a(k2, b2, 10, 2, 13, dc2);
            this.a(k2, b2, 10, 3, 13, dc2);
            this.a(k2, b2, 10, 4, 13, dc2);
            this.a(k2, b2, 10, 5, 13, dc2);
            this.a(k2, b2, 10, 6, 13, dc2);
            this.a(k2, b2, 10, 7, 13, dc2);
            int n5 = 7;
            int n6 = 7;
            this.a(k2, p.aO.v(), 6, 9, 7, dc2);
            this.a(k2, p.aO.v(), 7, 9, 7, dc2);
            this.a(k2, p.aO.v(), 6, 8, 7, dc2);
            this.a(k2, p.aO.v(), 7, 8, 7, dc2);
            this.a(k2, p.aO.v(), 6, 7, 7, dc2);
            this.a(k2, p.aO.v(), 7, 7, 7, dc2);
            this.a(k2, p.aO.v(), 5, 7, 7, dc2);
            this.a(k2, p.aO.v(), 8, 7, 7, dc2);
            this.a(k2, p.aO.v(), 6, 7, 6, dc2);
            this.a(k2, p.aO.v(), 6, 7, 8, dc2);
            this.a(k2, p.aO.v(), 7, 7, 6, dc2);
            this.a(k2, p.aO.v(), 7, 7, 8, dc2);
            b b3 = p.aa.v().a(ap.a, (Comparable)((Object)ad.b));
            this.a(k2, b3, 5, 8, 7, dc2);
            this.a(k2, b3, 8, 8, 7, dc2);
            this.a(k2, b3, 6, 8, 6, dc2);
            this.a(k2, b3, 6, 8, 8, dc2);
            this.a(k2, b3, 7, 8, 6, dc2);
            this.a(k2, b3, 7, 8, 8, dc2);
        }
        this.a(k2, dc2, random, 3, 3, 5, j.h);
        if (this.d) {
            this.a(k2, p.a.v(), 12, 9, 1, dc2);
            this.a(k2, dc2, random, 12, 8, 1, j.h);
        }
        return true;
    }
}

