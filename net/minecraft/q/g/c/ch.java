/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.g.el;
import net.minecraft.g.r;
import net.minecraft.m.cd;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.di;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;

public class ch
extends di {
    private final boolean[] g = new boolean[4];

    public ch() {
    }

    public ch(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 21, 15, 21);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("hasPlacedChest0", this.g[0]);
        e2.a("hasPlacedChest1", this.g[1]);
        e2.a("hasPlacedChest2", this.g[2]);
        e2.a("hasPlacedChest3", this.g[3]);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.g[0] = e2.p("hasPlacedChest0");
        this.g[1] = e2.p("hasPlacedChest1");
        this.g[2] = e2.p("hasPlacedChest2");
        this.g[3] = e2.p("hasPlacedChest3");
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        this.a(k2, dc2, 0, -4, 0, this.a - 1, 0, this.e - 1, p.A.v(), p.A.v(), false);
        for (n3 = 1; n3 <= 9; ++n3) {
            this.a(k2, dc2, n3, n3, n3, this.a - 1 - n3, n3, this.e - 1 - n3, p.A.v(), p.A.v(), false);
            this.a(k2, dc2, n3 + 1, n3, n3 + 1, this.a - 2 - n3, n3, this.e - 2 - n3, p.a.v(), p.a.v(), false);
        }
        for (n3 = 0; n3 < this.a; ++n3) {
            for (int i2 = 0; i2 < this.e; ++i2) {
                int n4 = -5;
                this.b(k2, p.A.v(), n3, -5, i2, dc2);
            }
        }
        b b2 = p.bO.v().a(bi.a, (Comparable)((Object)ad.c));
        b b3 = p.bO.v().a(bi.a, (Comparable)((Object)ad.d));
        b b4 = p.bO.v().a(bi.a, (Comparable)((Object)ad.f));
        b b5 = p.bO.v().a(bi.a, (Comparable)((Object)ad.e));
        int n5 = ~cd.b.c() & 0xF;
        int n6 = ~cd.l.c() & 0xF;
        this.a(k2, dc2, 0, 0, 0, 4, 9, 4, p.A.v(), p.a.v(), false);
        this.a(k2, dc2, 1, 10, 1, 3, 10, 3, p.A.v(), p.A.v(), false);
        this.a(k2, b2, 2, 10, 0, dc2);
        this.a(k2, b3, 2, 10, 4, dc2);
        this.a(k2, b4, 0, 10, 2, dc2);
        this.a(k2, b5, 4, 10, 2, dc2);
        this.a(k2, dc2, this.a - 5, 0, 0, this.a - 1, 9, 4, p.A.v(), p.a.v(), false);
        this.a(k2, dc2, this.a - 4, 10, 1, this.a - 2, 10, 3, p.A.v(), p.A.v(), false);
        this.a(k2, b2, this.a - 3, 10, 0, dc2);
        this.a(k2, b3, this.a - 3, 10, 4, dc2);
        this.a(k2, b4, this.a - 5, 10, 2, dc2);
        this.a(k2, b5, this.a - 1, 10, 2, dc2);
        this.a(k2, dc2, 8, 0, 0, 12, 4, 4, p.A.v(), p.a.v(), false);
        this.a(k2, dc2, 9, 1, 0, 11, 3, 4, p.a.v(), p.a.v(), false);
        this.a(k2, p.A.a(r.c.b()), 9, 1, 1, dc2);
        this.a(k2, p.A.a(r.c.b()), 9, 2, 1, dc2);
        this.a(k2, p.A.a(r.c.b()), 9, 3, 1, dc2);
        this.a(k2, p.A.a(r.c.b()), 10, 3, 1, dc2);
        this.a(k2, p.A.a(r.c.b()), 11, 3, 1, dc2);
        this.a(k2, p.A.a(r.c.b()), 11, 2, 1, dc2);
        this.a(k2, p.A.a(r.c.b()), 11, 1, 1, dc2);
        this.a(k2, dc2, 4, 1, 1, 8, 3, 3, p.A.v(), p.a.v(), false);
        this.a(k2, dc2, 4, 1, 2, 8, 2, 2, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 12, 1, 1, 16, 3, 3, p.A.v(), p.a.v(), false);
        this.a(k2, dc2, 12, 1, 2, 16, 2, 2, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 5, 4, 5, this.a - 6, 4, this.e - 6, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, 9, 4, 9, 11, 4, 11, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 8, 1, 8, 8, 3, 8, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, 12, 1, 8, 12, 3, 8, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, 8, 1, 12, 8, 3, 12, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, 12, 1, 12, 12, 3, 12, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, 1, 1, 5, 4, 4, 11, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, this.a - 5, 1, 5, this.a - 2, 4, 11, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, 6, 7, 9, 6, 7, 11, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, this.a - 7, 7, 9, this.a - 7, 7, 11, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, 5, 5, 9, 5, 7, 11, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, this.a - 6, 5, 9, this.a - 6, 7, 11, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, p.a.v(), 5, 5, 10, dc2);
        this.a(k2, p.a.v(), 5, 6, 10, dc2);
        this.a(k2, p.a.v(), 6, 6, 10, dc2);
        this.a(k2, p.a.v(), this.a - 6, 5, 10, dc2);
        this.a(k2, p.a.v(), this.a - 6, 6, 10, dc2);
        this.a(k2, p.a.v(), this.a - 7, 6, 10, dc2);
        this.a(k2, dc2, 2, 4, 4, 2, 6, 4, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, this.a - 3, 4, 4, this.a - 3, 6, 4, p.a.v(), p.a.v(), false);
        this.a(k2, b2, 2, 4, 5, dc2);
        this.a(k2, b2, 2, 3, 4, dc2);
        this.a(k2, b2, this.a - 3, 4, 5, dc2);
        this.a(k2, b2, this.a - 3, 3, 4, dc2);
        this.a(k2, dc2, 1, 1, 3, 2, 2, 3, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, this.a - 3, 1, 3, this.a - 2, 2, 3, p.A.v(), p.A.v(), false);
        this.a(k2, p.A.v(), 1, 1, 2, dc2);
        this.a(k2, p.A.v(), this.a - 2, 1, 2, dc2);
        this.a(k2, p.U.a(el.b.b()), 1, 2, 2, dc2);
        this.a(k2, p.U.a(el.b.b()), this.a - 2, 2, 2, dc2);
        this.a(k2, b5, 2, 1, 2, dc2);
        this.a(k2, b4, this.a - 3, 1, 2, dc2);
        this.a(k2, dc2, 4, 3, 5, 4, 3, 18, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, this.a - 5, 3, 5, this.a - 5, 3, 17, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, 3, 1, 5, 4, 2, 16, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, this.a - 6, 1, 5, this.a - 5, 2, 16, p.a.v(), p.a.v(), false);
        for (n2 = 5; n2 <= 17; n2 += 2) {
            this.a(k2, p.A.a(r.c.b()), 4, 1, n2, dc2);
            this.a(k2, p.A.a(r.b.b()), 4, 2, n2, dc2);
            this.a(k2, p.A.a(r.c.b()), this.a - 5, 1, n2, dc2);
            this.a(k2, p.A.a(r.b.b()), this.a - 5, 2, n2, dc2);
        }
        this.a(k2, p.cu.a(n5), 10, 0, 7, dc2);
        this.a(k2, p.cu.a(n5), 10, 0, 8, dc2);
        this.a(k2, p.cu.a(n5), 9, 0, 9, dc2);
        this.a(k2, p.cu.a(n5), 11, 0, 9, dc2);
        this.a(k2, p.cu.a(n5), 8, 0, 10, dc2);
        this.a(k2, p.cu.a(n5), 12, 0, 10, dc2);
        this.a(k2, p.cu.a(n5), 7, 0, 10, dc2);
        this.a(k2, p.cu.a(n5), 13, 0, 10, dc2);
        this.a(k2, p.cu.a(n5), 9, 0, 11, dc2);
        this.a(k2, p.cu.a(n5), 11, 0, 11, dc2);
        this.a(k2, p.cu.a(n5), 10, 0, 12, dc2);
        this.a(k2, p.cu.a(n5), 10, 0, 13, dc2);
        this.a(k2, p.cu.a(n6), 10, 0, 10, dc2);
        for (n2 = 0; n2 <= this.a - 1; n2 += this.a - 1) {
            this.a(k2, p.A.a(r.c.b()), n2, 2, 1, dc2);
            this.a(k2, p.cu.a(n5), n2, 2, 2, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 2, 3, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 3, 1, dc2);
            this.a(k2, p.cu.a(n5), n2, 3, 2, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 3, 3, dc2);
            this.a(k2, p.cu.a(n5), n2, 4, 1, dc2);
            this.a(k2, p.A.a(r.b.b()), n2, 4, 2, dc2);
            this.a(k2, p.cu.a(n5), n2, 4, 3, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 5, 1, dc2);
            this.a(k2, p.cu.a(n5), n2, 5, 2, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 5, 3, dc2);
            this.a(k2, p.cu.a(n5), n2, 6, 1, dc2);
            this.a(k2, p.A.a(r.b.b()), n2, 6, 2, dc2);
            this.a(k2, p.cu.a(n5), n2, 6, 3, dc2);
            this.a(k2, p.cu.a(n5), n2, 7, 1, dc2);
            this.a(k2, p.cu.a(n5), n2, 7, 2, dc2);
            this.a(k2, p.cu.a(n5), n2, 7, 3, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 8, 1, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 8, 2, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 8, 3, dc2);
        }
        for (n2 = 2; n2 <= this.a - 3; n2 += this.a - 3 - 2) {
            this.a(k2, p.A.a(r.c.b()), n2 - 1, 2, 0, dc2);
            this.a(k2, p.cu.a(n5), n2, 2, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 + 1, 2, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 - 1, 3, 0, dc2);
            this.a(k2, p.cu.a(n5), n2, 3, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 + 1, 3, 0, dc2);
            this.a(k2, p.cu.a(n5), n2 - 1, 4, 0, dc2);
            this.a(k2, p.A.a(r.b.b()), n2, 4, 0, dc2);
            this.a(k2, p.cu.a(n5), n2 + 1, 4, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 - 1, 5, 0, dc2);
            this.a(k2, p.cu.a(n5), n2, 5, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 + 1, 5, 0, dc2);
            this.a(k2, p.cu.a(n5), n2 - 1, 6, 0, dc2);
            this.a(k2, p.A.a(r.b.b()), n2, 6, 0, dc2);
            this.a(k2, p.cu.a(n5), n2 + 1, 6, 0, dc2);
            this.a(k2, p.cu.a(n5), n2 - 1, 7, 0, dc2);
            this.a(k2, p.cu.a(n5), n2, 7, 0, dc2);
            this.a(k2, p.cu.a(n5), n2 + 1, 7, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 - 1, 8, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2, 8, 0, dc2);
            this.a(k2, p.A.a(r.c.b()), n2 + 1, 8, 0, dc2);
        }
        this.a(k2, dc2, 8, 4, 0, 12, 6, 0, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, p.a.v(), 8, 6, 0, dc2);
        this.a(k2, p.a.v(), 12, 6, 0, dc2);
        this.a(k2, p.cu.a(n5), 9, 5, 0, dc2);
        this.a(k2, p.A.a(r.b.b()), 10, 5, 0, dc2);
        this.a(k2, p.cu.a(n5), 11, 5, 0, dc2);
        this.a(k2, dc2, 8, -14, 8, 12, -11, 12, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, 8, -10, 8, 12, -10, 12, p.A.a(r.b.b()), p.A.a(r.b.b()), false);
        this.a(k2, dc2, 8, -9, 8, 12, -9, 12, p.A.a(r.c.b()), p.A.a(r.c.b()), false);
        this.a(k2, dc2, 8, -8, 8, 12, -1, 12, p.A.v(), p.A.v(), false);
        this.a(k2, dc2, 9, -11, 9, 11, -1, 11, p.a.v(), p.a.v(), false);
        this.a(k2, p.az.v(), 10, -11, 10, dc2);
        this.a(k2, dc2, 9, -13, 9, 11, -13, 11, p.W.v(), p.a.v(), false);
        this.a(k2, p.a.v(), 8, -11, 10, dc2);
        this.a(k2, p.a.v(), 8, -10, 10, dc2);
        this.a(k2, p.A.a(r.b.b()), 7, -10, 10, dc2);
        this.a(k2, p.A.a(r.c.b()), 7, -11, 10, dc2);
        this.a(k2, p.a.v(), 12, -11, 10, dc2);
        this.a(k2, p.a.v(), 12, -10, 10, dc2);
        this.a(k2, p.A.a(r.b.b()), 13, -10, 10, dc2);
        this.a(k2, p.A.a(r.c.b()), 13, -11, 10, dc2);
        this.a(k2, p.a.v(), 10, -11, 8, dc2);
        this.a(k2, p.a.v(), 10, -10, 8, dc2);
        this.a(k2, p.A.a(r.b.b()), 10, -10, 7, dc2);
        this.a(k2, p.A.a(r.c.b()), 10, -11, 7, dc2);
        this.a(k2, p.a.v(), 10, -11, 12, dc2);
        this.a(k2, p.a.v(), 10, -10, 12, dc2);
        this.a(k2, p.A.a(r.b.b()), 10, -10, 13, dc2);
        this.a(k2, p.A.a(r.c.b()), 10, -11, 13, dc2);
        for (ad ad2 : ag.a) {
            if (this.g[ad2.c()]) continue;
            int n7 = ad2.h() * 2;
            int n8 = ad2.j() * 2;
            this.g[ad2.c()] = this.a(k2, dc2, random, 10 + n7, -11, 10 + n8, j.k);
        }
        return true;
    }
}

