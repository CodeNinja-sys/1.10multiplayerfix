/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ce
extends dn {
    private boolean a;

    public ce() {
    }

    public ce(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
    }

    public static ce a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 10, 6, 7, ad2);
        return ce.a(dc2) && r.a(list, dc2) == null ? new ce(ak2, n5, random, dc2, ad2) : null;
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Chest", this.a);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = e2.p("Chest");
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 6 - 1, 0);
        }
        b b2 = p.e.v();
        b b3 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b4 = this.a(p.ad.v().a(bi.a, (Comparable)((Object)ad.e)));
        b b5 = this.a(p.f.v());
        b b6 = this.a(p.aw.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b7 = this.a(p.r.v());
        b b8 = this.a(p.aO.v());
        this.a(k2, dc2, 0, 1, 0, 9, 4, 6, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 0, 0, 9, 0, 6, b2, b2, false);
        this.a(k2, dc2, 0, 4, 0, 9, 4, 6, b2, b2, false);
        this.a(k2, dc2, 0, 5, 0, 9, 5, 6, p.U.v(), p.U.v(), false);
        this.a(k2, dc2, 1, 5, 1, 8, 5, 5, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 1, 0, 2, 3, 0, b5, b5, false);
        this.a(k2, dc2, 0, 1, 0, 0, 4, 0, b7, b7, false);
        this.a(k2, dc2, 3, 1, 0, 3, 4, 0, b7, b7, false);
        this.a(k2, dc2, 0, 1, 6, 0, 4, 6, b7, b7, false);
        this.a(k2, b5, 3, 3, 1, dc2);
        this.a(k2, dc2, 3, 1, 2, 3, 3, 2, b5, b5, false);
        this.a(k2, dc2, 4, 1, 3, 5, 3, 3, b5, b5, false);
        this.a(k2, dc2, 0, 1, 1, 0, 3, 5, b5, b5, false);
        this.a(k2, dc2, 1, 1, 6, 5, 3, 6, b5, b5, false);
        this.a(k2, dc2, 5, 1, 0, 5, 3, 0, b8, b8, false);
        this.a(k2, dc2, 9, 1, 0, 9, 3, 0, b8, b8, false);
        this.a(k2, dc2, 6, 1, 4, 9, 4, 6, b2, b2, false);
        this.a(k2, p.k.v(), 7, 1, 5, dc2);
        this.a(k2, p.k.v(), 8, 1, 5, dc2);
        this.a(k2, p.bi.v(), 9, 2, 5, dc2);
        this.a(k2, p.bi.v(), 9, 2, 4, dc2);
        this.a(k2, dc2, 7, 2, 4, 8, 2, 5, p.a.v(), p.a.v(), false);
        this.a(k2, b2, 6, 1, 3, dc2);
        this.a(k2, p.al.v(), 6, 2, 3, dc2);
        this.a(k2, p.al.v(), 6, 3, 3, dc2);
        this.a(k2, p.T.v(), 8, 1, 1, dc2);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 0, 2, 4, dc2);
        this.a(k2, p.bj.v(), 2, 2, 6, dc2);
        this.a(k2, p.bj.v(), 4, 2, 6, dc2);
        this.a(k2, b8, 2, 1, 4, dc2);
        this.a(k2, p.aB.v(), 2, 2, 4, dc2);
        this.a(k2, b5, 1, 1, 5, dc2);
        this.a(k2, b3, 2, 1, 5, dc2);
        this.a(k2, b4, 1, 1, 4, dc2);
        if (!this.a && dc2.a(new net.minecraft.u.b.b(this.a(5, 5), this.a(1), this.b(5, 5)))) {
            this.a = true;
            this.a(k2, dc2, random, 5, 1, 5, net.minecraft.q.a.a.j.e);
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            if (this.a(k2, n2, 0, -1, dc2).d() != h.a || this.a(k2, n2, -1, -1, dc2).d() == h.a) continue;
            this.a(k2, b6, n2, 0, -1, dc2);
            if (this.a(k2, n2, -1, -1, dc2).c() != p.da) continue;
            this.a(k2, p.c.v(), n2, -1, -1, dc2);
        }
        for (n2 = 0; n2 < 7; ++n2) {
            for (int i2 = 0; i2 < 10; ++i2) {
                this.c(k2, i2, 6, n2, dc2);
                this.b(k2, b2, i2, -1, n2, dc2);
            }
        }
        this.a(k2, dc2, 7, 1, 1, 1);
        return true;
    }

    @Override
    protected int c(int n2, int n3) {
        return 3;
    }
}

