/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.bi;
import net.minecraft.g.c.b;
import net.minecraft.g.cc;
import net.minecraft.g.cm;
import net.minecraft.g.em;
import net.minecraft.g.g;
import net.minecraft.g.gj;
import net.minecraft.g.ia;
import net.minecraft.g.id;
import net.minecraft.g.u;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.di;
import net.minecraft.q.g.c.dm;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ck
extends di {
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private static final dm k = new dm(null);

    public ck() {
    }

    public ck(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 12, 10, 15);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("placedMainChest", this.g);
        e2.a("placedHiddenChest", this.h);
        e2.a("placedTrap1", this.i);
        e2.a("placedTrap2", this.j);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.g = e2.p("placedMainChest");
        this.h = e2.p("placedHiddenChest");
        this.i = e2.p("placedTrap1");
        this.j = e2.p("placedTrap2");
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        if (!this.a(k2, dc2, 0)) {
            return false;
        }
        this.a(k2, dc2, 0, -4, 0, this.a - 1, 0, this.e - 1, false, random, k);
        this.a(k2, dc2, 2, 1, 2, 9, 2, 2, false, random, k);
        this.a(k2, dc2, 2, 1, 12, 9, 2, 12, false, random, k);
        this.a(k2, dc2, 2, 1, 3, 2, 2, 11, false, random, k);
        this.a(k2, dc2, 9, 1, 3, 9, 2, 11, false, random, k);
        this.a(k2, dc2, 1, 3, 1, 10, 6, 1, false, random, k);
        this.a(k2, dc2, 1, 3, 13, 10, 6, 13, false, random, k);
        this.a(k2, dc2, 1, 3, 2, 1, 6, 12, false, random, k);
        this.a(k2, dc2, 10, 3, 2, 10, 6, 12, false, random, k);
        this.a(k2, dc2, 2, 3, 2, 9, 3, 12, false, random, k);
        this.a(k2, dc2, 2, 6, 2, 9, 6, 12, false, random, k);
        this.a(k2, dc2, 3, 7, 3, 8, 7, 11, false, random, k);
        this.a(k2, dc2, 4, 8, 4, 7, 8, 10, false, random, k);
        this.a(k2, dc2, 3, 1, 3, 8, 2, 11);
        this.a(k2, dc2, 4, 3, 6, 7, 3, 9);
        this.a(k2, dc2, 2, 4, 2, 9, 5, 12);
        this.a(k2, dc2, 4, 6, 5, 7, 6, 9);
        this.a(k2, dc2, 5, 7, 6, 6, 7, 8);
        this.a(k2, dc2, 5, 1, 2, 6, 2, 2);
        this.a(k2, dc2, 5, 2, 12, 6, 2, 12);
        this.a(k2, dc2, 5, 5, 1, 6, 5, 1);
        this.a(k2, dc2, 5, 5, 13, 6, 5, 13);
        this.a(k2, p.a.v(), 1, 5, 5, dc2);
        this.a(k2, p.a.v(), 10, 5, 5, dc2);
        this.a(k2, p.a.v(), 1, 5, 9, dc2);
        this.a(k2, p.a.v(), 10, 5, 9, dc2);
        for (n3 = 0; n3 <= 14; n3 += 14) {
            this.a(k2, dc2, 2, 4, n3, 2, 5, n3, false, random, k);
            this.a(k2, dc2, 4, 4, n3, 4, 5, n3, false, random, k);
            this.a(k2, dc2, 7, 4, n3, 7, 5, n3, false, random, k);
            this.a(k2, dc2, 9, 4, n3, 9, 5, n3, false, random, k);
        }
        this.a(k2, dc2, 5, 6, 0, 6, 6, 0, false, random, k);
        for (n3 = 0; n3 <= 11; n3 += 11) {
            for (int i2 = 2; i2 <= 12; i2 += 2) {
                this.a(k2, dc2, n3, 4, i2, n3, 5, i2, false, random, k);
            }
            this.a(k2, dc2, n3, 6, 5, n3, 6, 5, false, random, k);
            this.a(k2, dc2, n3, 6, 9, n3, 6, 9, false, random, k);
        }
        this.a(k2, dc2, 2, 7, 2, 2, 9, 2, false, random, k);
        this.a(k2, dc2, 9, 7, 2, 9, 9, 2, false, random, k);
        this.a(k2, dc2, 2, 7, 12, 2, 9, 12, false, random, k);
        this.a(k2, dc2, 9, 7, 12, 9, 9, 12, false, random, k);
        this.a(k2, dc2, 4, 9, 4, 4, 9, 4, false, random, k);
        this.a(k2, dc2, 7, 9, 4, 7, 9, 4, false, random, k);
        this.a(k2, dc2, 4, 9, 10, 4, 9, 10, false, random, k);
        this.a(k2, dc2, 7, 9, 10, 7, 9, 10, false, random, k);
        this.a(k2, dc2, 5, 9, 7, 6, 9, 7, false, random, k);
        b b2 = p.aw.v().a(bi.a, (Comparable)((Object)ad.f));
        b b3 = p.aw.v().a(bi.a, (Comparable)((Object)ad.e));
        b b4 = p.aw.v().a(bi.a, (Comparable)((Object)ad.d));
        b b5 = p.aw.v().a(bi.a, (Comparable)((Object)ad.c));
        this.a(k2, b5, 5, 9, 6, dc2);
        this.a(k2, b5, 6, 9, 6, dc2);
        this.a(k2, b4, 5, 9, 8, dc2);
        this.a(k2, b4, 6, 9, 8, dc2);
        this.a(k2, b5, 4, 0, 0, dc2);
        this.a(k2, b5, 5, 0, 0, dc2);
        this.a(k2, b5, 6, 0, 0, dc2);
        this.a(k2, b5, 7, 0, 0, dc2);
        this.a(k2, b5, 4, 1, 8, dc2);
        this.a(k2, b5, 4, 2, 9, dc2);
        this.a(k2, b5, 4, 3, 10, dc2);
        this.a(k2, b5, 7, 1, 8, dc2);
        this.a(k2, b5, 7, 2, 9, dc2);
        this.a(k2, b5, 7, 3, 10, dc2);
        this.a(k2, dc2, 4, 1, 9, 4, 1, 9, false, random, k);
        this.a(k2, dc2, 7, 1, 9, 7, 1, 9, false, random, k);
        this.a(k2, dc2, 4, 1, 10, 7, 2, 10, false, random, k);
        this.a(k2, dc2, 5, 4, 5, 6, 4, 5, false, random, k);
        this.a(k2, b2, 4, 4, 5, dc2);
        this.a(k2, b3, 7, 4, 5, dc2);
        for (n2 = 0; n2 < 4; ++n2) {
            this.a(k2, b4, 5, 0 - n2, 6 + n2, dc2);
            this.a(k2, b4, 6, 0 - n2, 6 + n2, dc2);
            this.a(k2, dc2, 5, 0 - n2, 7 + n2, 6, 0 - n2, 9 + n2);
        }
        this.a(k2, dc2, 1, -3, 12, 10, -1, 13);
        this.a(k2, dc2, 1, -3, 1, 3, -1, 13);
        this.a(k2, dc2, 1, -3, 1, 9, -1, 5);
        for (n2 = 1; n2 <= 13; n2 += 2) {
            this.a(k2, dc2, 1, -3, n2, 1, -2, n2, false, random, k);
        }
        for (n2 = 2; n2 <= 12; n2 += 2) {
            this.a(k2, dc2, 1, -1, n2, 3, -1, n2, false, random, k);
        }
        this.a(k2, dc2, 2, -2, 1, 5, -2, 1, false, random, k);
        this.a(k2, dc2, 7, -2, 1, 9, -2, 1, false, random, k);
        this.a(k2, dc2, 6, -3, 1, 6, -3, 1, false, random, k);
        this.a(k2, dc2, 6, -1, 1, 6, -1, 1, false, random, k);
        this.a(k2, p.bR.v().a(u.a, (Comparable)((Object)ad.f)).a(u.c, Boolean.valueOf(true)), 1, -3, 8, dc2);
        this.a(k2, p.bR.v().a(u.a, (Comparable)((Object)ad.e)).a(u.c, Boolean.valueOf(true)), 4, -3, 8, dc2);
        this.a(k2, p.bS.v().a(cc.b, Boolean.valueOf(true)), 2, -3, 8, dc2);
        this.a(k2, p.bS.v().a(cc.b, Boolean.valueOf(true)), 3, -3, 8, dc2);
        this.a(k2, p.af.v(), 5, -3, 7, dc2);
        this.a(k2, p.af.v(), 5, -3, 6, dc2);
        this.a(k2, p.af.v(), 5, -3, 5, dc2);
        this.a(k2, p.af.v(), 5, -3, 4, dc2);
        this.a(k2, p.af.v(), 5, -3, 3, dc2);
        this.a(k2, p.af.v(), 5, -3, 2, dc2);
        this.a(k2, p.af.v(), 5, -3, 1, dc2);
        this.a(k2, p.af.v(), 4, -3, 1, dc2);
        this.a(k2, p.Y.v(), 3, -3, 1, dc2);
        if (!this.i) {
            this.i = this.a(k2, dc2, random, 3, -2, 1, ad.c, net.minecraft.q.a.a.j.m);
        }
        this.a(k2, p.bn.v().a(em.d, Boolean.valueOf(true)), 3, -2, 2, dc2);
        this.a(k2, p.bR.v().a(u.a, (Comparable)((Object)ad.c)).a(u.c, Boolean.valueOf(true)), 7, -3, 1, dc2);
        this.a(k2, p.bR.v().a(u.a, (Comparable)((Object)ad.d)).a(u.c, Boolean.valueOf(true)), 7, -3, 5, dc2);
        this.a(k2, p.bS.v().a(cc.b, Boolean.valueOf(true)), 7, -3, 2, dc2);
        this.a(k2, p.bS.v().a(cc.b, Boolean.valueOf(true)), 7, -3, 3, dc2);
        this.a(k2, p.bS.v().a(cc.b, Boolean.valueOf(true)), 7, -3, 4, dc2);
        this.a(k2, p.af.v(), 8, -3, 6, dc2);
        this.a(k2, p.af.v(), 9, -3, 6, dc2);
        this.a(k2, p.af.v(), 9, -3, 5, dc2);
        this.a(k2, p.Y.v(), 9, -3, 4, dc2);
        this.a(k2, p.af.v(), 9, -2, 4, dc2);
        if (!this.j) {
            this.j = this.a(k2, dc2, random, 9, -2, 3, ad.e, net.minecraft.q.a.a.j.m);
        }
        this.a(k2, p.bn.v().a(em.c, Boolean.valueOf(true)), 8, -1, 3, dc2);
        this.a(k2, p.bn.v().a(em.c, Boolean.valueOf(true)), 8, -2, 3, dc2);
        if (!this.g) {
            this.g = this.a(k2, dc2, random, 8, -3, 3, net.minecraft.q.a.a.j.l);
        }
        this.a(k2, p.Y.v(), 9, -3, 2, dc2);
        this.a(k2, p.Y.v(), 8, -3, 1, dc2);
        this.a(k2, p.Y.v(), 4, -3, 5, dc2);
        this.a(k2, p.Y.v(), 5, -2, 5, dc2);
        this.a(k2, p.Y.v(), 5, -1, 5, dc2);
        this.a(k2, p.Y.v(), 6, -3, 5, dc2);
        this.a(k2, p.Y.v(), 7, -2, 5, dc2);
        this.a(k2, p.Y.v(), 7, -1, 5, dc2);
        this.a(k2, p.Y.v(), 8, -3, 5, dc2);
        this.a(k2, dc2, 9, -1, 1, 9, -1, 5, false, random, k);
        this.a(k2, dc2, 8, -3, 8, 10, -1, 10);
        this.a(k2, p.bf.a(gj.e), 8, -2, 11, dc2);
        this.a(k2, p.bf.a(gj.e), 9, -2, 11, dc2);
        this.a(k2, p.bf.a(gj.e), 10, -2, 11, dc2);
        b b6 = p.ay.v().a(net.minecraft.g.g.a, (Comparable)((Object)ia.e));
        this.a(k2, b6, 8, -2, 12, dc2);
        this.a(k2, b6, 9, -2, 12, dc2);
        this.a(k2, b6, 10, -2, 12, dc2);
        this.a(k2, dc2, 8, -3, 8, 8, -3, 10, false, random, k);
        this.a(k2, dc2, 10, -3, 8, 10, -3, 10, false, random, k);
        this.a(k2, p.Y.v(), 10, -2, 9, dc2);
        this.a(k2, p.af.v(), 8, -2, 9, dc2);
        this.a(k2, p.af.v(), 8, -2, 10, dc2);
        this.a(k2, p.af.v(), 10, -1, 9, dc2);
        this.a(k2, p.F.v().a(id.o, (Comparable)((Object)ad.b)), 9, -2, 8, dc2);
        this.a(k2, p.F.v().a(id.o, (Comparable)((Object)ad.e)), 10, -2, 8, dc2);
        this.a(k2, p.F.v().a(id.o, (Comparable)((Object)ad.e)), 10, -1, 8, dc2);
        this.a(k2, p.bb.v().a(cm.j, (Comparable)((Object)ad.c)), 10, -2, 10, dc2);
        if (!this.h) {
            this.h = this.a(k2, dc2, random, 9, -3, 10, net.minecraft.q.a.a.j.l);
        }
        return true;
    }
}

