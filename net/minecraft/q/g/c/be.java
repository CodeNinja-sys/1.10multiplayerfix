/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.q.g.c.am;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class be
extends am {
    private int d;

    public be() {
    }

    public be(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
        this.d = ad2 != ad.c && ad2 != ad.d ? dc2.c() : dc2.e();
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Steps", this.d);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.h("Steps");
    }

    public static dc a(List list, Random random, int n2, int n3, int n4, ad ad2) {
        int n5 = 3;
        dc dc2 = dc.a(n2, n3, n4, -1, -1, 0, 5, 5, 4, ad2);
        r r2 = r.a(list, dc2);
        if (r2 == null) {
            return null;
        }
        if (r2.f().b == dc2.b) {
            for (int i2 = 3; i2 >= 1; --i2) {
                dc2 = dc.a(n2, n3, n4, -1, -1, 0, 5, 5, i2 - 1, ad2);
                if (r2.f().a(dc2)) continue;
                return dc.a(n2, n3, n4, -1, -1, 0, 5, 5, i2, ad2);
            }
        }
        return null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.a(k2, p.bf.v(), 0, 0, i2, dc2);
            this.a(k2, p.bf.v(), 1, 0, i2, dc2);
            this.a(k2, p.bf.v(), 2, 0, i2, dc2);
            this.a(k2, p.bf.v(), 3, 0, i2, dc2);
            this.a(k2, p.bf.v(), 4, 0, i2, dc2);
            for (int i3 = 1; i3 <= 3; ++i3) {
                this.a(k2, p.bf.v(), 0, i3, i2, dc2);
                this.a(k2, p.a.v(), 1, i3, i2, dc2);
                this.a(k2, p.a.v(), 2, i3, i2, dc2);
                this.a(k2, p.a.v(), 3, i3, i2, dc2);
                this.a(k2, p.bf.v(), 4, i3, i2, dc2);
            }
            this.a(k2, p.bf.v(), 0, 4, i2, dc2);
            this.a(k2, p.bf.v(), 1, 4, i2, dc2);
            this.a(k2, p.bf.v(), 2, 4, i2, dc2);
            this.a(k2, p.bf.v(), 3, 4, i2, dc2);
            this.a(k2, p.bf.v(), 4, 4, i2, dc2);
        }
        return true;
    }
}

