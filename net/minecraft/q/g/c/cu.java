/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.d;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ag;

public class cu
extends d {
    public cu() {
    }

    public cu(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.b = dc2;
    }

    protected cu(Random random, int n2, int n3) {
        super(0);
        this.a(ag.a.a(random));
        this.b = this.i().l() == ae.c ? new dc(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1) : new dc(n2, 64, n3, n2 + 19 - 1, 73, n3 + 19 - 1);
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((cc)r2, list, random, 8, 3, false);
        this.b((cc)r2, list, random, 3, 8, false);
        this.c((cc)r2, list, random, 3, 8, false);
    }

    public static cu a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -8, -3, 0, 19, 10, 19, ad2);
        return cu.a(dc2) && r.a(list, dc2) == null ? new cu(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        this.a(k2, dc2, 7, 3, 0, 11, 4, 18, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 3, 7, 18, 4, 11, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 8, 5, 0, 10, 7, 18, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 5, 8, 18, 7, 10, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 7, 5, 0, 7, 5, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 7, 5, 11, 7, 5, 18, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 11, 5, 0, 11, 5, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 11, 5, 11, 11, 5, 18, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 5, 7, 7, 5, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 11, 5, 7, 18, 5, 7, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 5, 11, 7, 5, 11, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 11, 5, 11, 18, 5, 11, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 7, 2, 0, 11, 2, 5, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 7, 2, 13, 11, 2, 18, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 7, 0, 0, 11, 1, 3, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 7, 0, 15, 11, 1, 18, p.by.v(), p.by.v(), false);
        for (n3 = 7; n3 <= 11; ++n3) {
            for (n2 = 0; n2 <= 2; ++n2) {
                this.b(k2, p.by.v(), n3, -1, n2, dc2);
                this.b(k2, p.by.v(), n3, -1, 18 - n2, dc2);
            }
        }
        this.a(k2, dc2, 0, 2, 7, 5, 2, 11, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 13, 2, 7, 18, 2, 11, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 0, 0, 7, 3, 1, 11, p.by.v(), p.by.v(), false);
        this.a(k2, dc2, 15, 0, 7, 18, 1, 11, p.by.v(), p.by.v(), false);
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 7; n2 <= 11; ++n2) {
                this.b(k2, p.by.v(), n3, -1, n2, dc2);
                this.b(k2, p.by.v(), 18 - n3, -1, n2, dc2);
            }
        }
        return true;
    }
}

