/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class g
extends d {
    public g() {
    }

    public g(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((cc)r2, list, random, 5, 3, true);
    }

    public static g a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -5, -3, 0, 13, 14, 13, ad2);
        return g.a(dc2) && r.a(list, dc2) == null ? new g(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
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
        this.a(k2, dc2, 5, 8, 0, 7, 8, 0, p.bz.v(), p.bz.v(), false);
        for (n3 = 1; n3 <= 11; n3 += 2) {
            this.a(k2, dc2, n3, 10, 0, n3, 11, 0, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, n3, 10, 12, n3, 11, 12, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, 0, 10, n3, 0, 11, n3, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, 12, 10, n3, 12, 11, n3, p.bz.v(), p.bz.v(), false);
            this.a(k2, p.by.v(), n3, 13, 0, dc2);
            this.a(k2, p.by.v(), n3, 13, 12, dc2);
            this.a(k2, p.by.v(), 0, 13, n3, dc2);
            this.a(k2, p.by.v(), 12, 13, n3, dc2);
            this.a(k2, p.bz.v(), n3 + 1, 13, 0, dc2);
            this.a(k2, p.bz.v(), n3 + 1, 13, 12, dc2);
            this.a(k2, p.bz.v(), 0, 13, n3 + 1, dc2);
            this.a(k2, p.bz.v(), 12, 13, n3 + 1, dc2);
        }
        this.a(k2, p.bz.v(), 0, 13, 0, dc2);
        this.a(k2, p.bz.v(), 0, 13, 12, dc2);
        this.a(k2, p.bz.v(), 0, 13, 0, dc2);
        this.a(k2, p.bz.v(), 12, 13, 0, dc2);
        for (n3 = 3; n3 <= 9; n3 += 2) {
            this.a(k2, dc2, 1, 7, n3, 1, 8, n3, p.bz.v(), p.bz.v(), false);
            this.a(k2, dc2, 11, 7, n3, 11, 8, n3, p.bz.v(), p.bz.v(), false);
        }
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
        this.a(k2, dc2, 5, 5, 5, 7, 5, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 6, 1, 6, 6, 4, 6, p.a.v(), p.a.v(), false);
        this.a(k2, p.by.v(), 6, 0, 6, dc2);
        b b2 = p.k.v();
        this.a(k2, b2, 6, 5, 6, dc2);
        net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(this.a(6, 6), this.a(5), this.b(6, 6));
        if (dc2.a(b3)) {
            k2.a(b3, b2, random);
        }
        return true;
    }
}

