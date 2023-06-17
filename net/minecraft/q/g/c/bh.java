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
import net.minecraft.g.cq;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class bh
extends dn {
    private boolean a;

    public bh() {
    }

    public bh(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
        this.a = random.nextBoolean();
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Terrace", this.a);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = e2.p("Terrace");
    }

    public static bh a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 5, 6, 5, ad2);
        return r.a(list, dc2) != null ? null : new bh(ak2, n5, random, dc2, ad2);
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.i < 0) {
            this.i = this.b(k2, dc2);
            if (this.i < 0) {
                return true;
            }
            this.b.a(0, this.i - this.b.e + 6 - 1, 0);
        }
        b b2 = this.a(p.e.v());
        b b3 = this.a(p.f.v());
        b b4 = this.a(p.aw.v().a(bi.a, (Comparable)((Object)ad.c)));
        b b5 = this.a(p.r.v());
        b b6 = this.a(p.aO.v());
        this.a(k2, dc2, 0, 0, 0, 4, 0, 4, b2, b2, false);
        this.a(k2, dc2, 0, 4, 0, 4, 4, 4, b5, b5, false);
        this.a(k2, dc2, 1, 4, 1, 3, 4, 3, b3, b3, false);
        this.a(k2, b2, 0, 1, 0, dc2);
        this.a(k2, b2, 0, 2, 0, dc2);
        this.a(k2, b2, 0, 3, 0, dc2);
        this.a(k2, b2, 4, 1, 0, dc2);
        this.a(k2, b2, 4, 2, 0, dc2);
        this.a(k2, b2, 4, 3, 0, dc2);
        this.a(k2, b2, 0, 1, 4, dc2);
        this.a(k2, b2, 0, 2, 4, dc2);
        this.a(k2, b2, 0, 3, 4, dc2);
        this.a(k2, b2, 4, 1, 4, dc2);
        this.a(k2, b2, 4, 2, 4, dc2);
        this.a(k2, b2, 4, 3, 4, dc2);
        this.a(k2, dc2, 0, 1, 1, 0, 3, 3, b3, b3, false);
        this.a(k2, dc2, 4, 1, 1, 4, 3, 3, b3, b3, false);
        this.a(k2, dc2, 1, 1, 4, 3, 3, 4, b3, b3, false);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 2, 2, 4, dc2);
        this.a(k2, p.bj.v(), 4, 2, 2, dc2);
        this.a(k2, b3, 1, 1, 0, dc2);
        this.a(k2, b3, 1, 2, 0, dc2);
        this.a(k2, b3, 1, 3, 0, dc2);
        this.a(k2, b3, 2, 3, 0, dc2);
        this.a(k2, b3, 3, 3, 0, dc2);
        this.a(k2, b3, 3, 2, 0, dc2);
        this.a(k2, b3, 3, 1, 0, dc2);
        if (this.a(k2, 2, 0, -1, dc2).d() == h.a && this.a(k2, 2, -1, -1, dc2).d() != h.a) {
            this.a(k2, b4, 2, 0, -1, dc2);
            if (this.a(k2, 2, -1, -1, dc2).c() == p.da) {
                this.a(k2, p.c.v(), 2, -1, -1, dc2);
            }
        }
        this.a(k2, dc2, 1, 1, 1, 3, 3, 3, p.a.v(), p.a.v(), false);
        if (this.a) {
            this.a(k2, b6, 0, 5, 0, dc2);
            this.a(k2, b6, 1, 5, 0, dc2);
            this.a(k2, b6, 2, 5, 0, dc2);
            this.a(k2, b6, 3, 5, 0, dc2);
            this.a(k2, b6, 4, 5, 0, dc2);
            this.a(k2, b6, 0, 5, 4, dc2);
            this.a(k2, b6, 1, 5, 4, dc2);
            this.a(k2, b6, 2, 5, 4, dc2);
            this.a(k2, b6, 3, 5, 4, dc2);
            this.a(k2, b6, 4, 5, 4, dc2);
            this.a(k2, b6, 4, 5, 1, dc2);
            this.a(k2, b6, 4, 5, 2, dc2);
            this.a(k2, b6, 4, 5, 3, dc2);
            this.a(k2, b6, 0, 5, 1, dc2);
            this.a(k2, b6, 0, 5, 2, dc2);
            this.a(k2, b6, 0, 5, 3, dc2);
        }
        if (this.a) {
            b b7 = p.au.v().a(cq.a, (Comparable)((Object)ad.d));
            this.a(k2, b7, 3, 1, 3, dc2);
            this.a(k2, b7, 3, 2, 3, dc2);
            this.a(k2, b7, 3, 3, 3, dc2);
            this.a(k2, b7, 3, 4, 3, dc2);
        }
        this.a(k2, ad.c, 2, 3, 1, dc2);
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 5; ++i3) {
                this.c(k2, i3, 6, i2, dc2);
                this.b(k2, b2, i3, -1, i2, dc2);
            }
        }
        this.a(k2, dc2, 1, 1, 2, 1);
        return true;
    }
}

