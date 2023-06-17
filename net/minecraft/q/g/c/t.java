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
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dn;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class t
extends dn {
    private boolean a;
    private int d;

    public t() {
    }

    public t(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
        this.a = random.nextBoolean();
        this.d = random.nextInt(3);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("T", this.d);
        e2.a("C", this.a);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.h("T");
        this.a = e2.p("C");
    }

    public static t a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 4, 6, 5, ad2);
        return t.a(dc2) && r.a(list, dc2) == null ? new t(ak2, n5, random, dc2, ad2) : null;
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
        this.a(k2, dc2, 1, 1, 1, 3, 5, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 0, 0, 3, 0, 4, b2, b2, false);
        this.a(k2, dc2, 1, 0, 1, 2, 0, 3, p.d.v(), p.d.v(), false);
        if (this.a) {
            this.a(k2, dc2, 1, 4, 1, 2, 4, 3, b5, b5, false);
        } else {
            this.a(k2, dc2, 1, 5, 1, 2, 5, 3, b5, b5, false);
        }
        this.a(k2, b5, 1, 4, 0, dc2);
        this.a(k2, b5, 2, 4, 0, dc2);
        this.a(k2, b5, 1, 4, 4, dc2);
        this.a(k2, b5, 2, 4, 4, dc2);
        this.a(k2, b5, 0, 4, 1, dc2);
        this.a(k2, b5, 0, 4, 2, dc2);
        this.a(k2, b5, 0, 4, 3, dc2);
        this.a(k2, b5, 3, 4, 1, dc2);
        this.a(k2, b5, 3, 4, 2, dc2);
        this.a(k2, b5, 3, 4, 3, dc2);
        this.a(k2, dc2, 0, 1, 0, 0, 3, 0, b5, b5, false);
        this.a(k2, dc2, 3, 1, 0, 3, 3, 0, b5, b5, false);
        this.a(k2, dc2, 0, 1, 4, 0, 3, 4, b5, b5, false);
        this.a(k2, dc2, 3, 1, 4, 3, 3, 4, b5, b5, false);
        this.a(k2, dc2, 0, 1, 1, 0, 3, 3, b3, b3, false);
        this.a(k2, dc2, 3, 1, 1, 3, 3, 3, b3, b3, false);
        this.a(k2, dc2, 1, 1, 0, 2, 3, 0, b3, b3, false);
        this.a(k2, dc2, 1, 1, 4, 2, 3, 4, b3, b3, false);
        this.a(k2, p.bj.v(), 0, 2, 2, dc2);
        this.a(k2, p.bj.v(), 3, 2, 2, dc2);
        if (this.d > 0) {
            this.a(k2, b6, this.d, 1, 3, dc2);
            this.a(k2, p.aB.v(), this.d, 2, 3, dc2);
        }
        this.a(k2, p.a.v(), 1, 1, 0, dc2);
        this.a(k2, p.a.v(), 1, 2, 0, dc2);
        this.a(k2, dc2, random, 1, 1, 0, ad.c);
        if (this.a(k2, 1, 0, -1, dc2).d() == h.a && this.a(k2, 1, -1, -1, dc2).d() != h.a) {
            this.a(k2, b4, 1, 0, -1, dc2);
            if (this.a(k2, 1, -1, -1, dc2).c() == p.da) {
                this.a(k2, p.c.v(), 1, -1, -1, dc2);
            }
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                this.c(k2, i3, 6, i2, dc2);
                this.b(k2, b2, i3, -1, i2, dc2);
            }
        }
        this.a(k2, dc2, 1, 1, 2, 1);
        return true;
    }
}

