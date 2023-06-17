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
import net.minecraft.q.g.c.ds;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class ao
extends am {
    protected int d;

    public ao() {
    }

    public ao(int n2, Random random, dc dc2, ad ad2) {
        super(n2);
        this.a(ad2);
        this.a = this.a(random);
        this.b = dc2;
        this.d = random.nextInt(5);
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Type", this.d);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.h("Type");
    }

    @Override
    public void a(r r2, List list, Random random) {
        this.a((ds)r2, list, random, 4, 1);
        this.b((ds)r2, list, random, 1, 4);
        this.c((ds)r2, list, random, 1, 4);
    }

    public static ao a(List list, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        dc dc2 = dc.a(n2, n3, n4, -4, -1, 0, 11, 7, 11, ad2);
        return ao.a(dc2) && r.a(list, dc2) == null ? new ao(n5, random, dc2, ad2) : null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        if (this.a(k2, dc2)) {
            return false;
        }
        this.a(k2, dc2, 0, 0, 0, 10, 6, 10, true, random, dq.c());
        this.a(k2, random, dc2, this.a, 4, 1, 0);
        this.a(k2, dc2, 4, 1, 10, 6, 3, 10, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 0, 1, 4, 0, 3, 6, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, 10, 1, 4, 10, 3, 6, p.a.v(), p.a.v(), false);
        switch (this.d) {
            case 0: {
                this.a(k2, p.bf.v(), 5, 1, 5, dc2);
                this.a(k2, p.bf.v(), 5, 2, 5, dc2);
                this.a(k2, p.bf.v(), 5, 3, 5, dc2);
                this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.e)), 4, 3, 5, dc2);
                this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.f)), 6, 3, 5, dc2);
                this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.d)), 5, 3, 4, dc2);
                this.a(k2, p.aa.v().a(ap.a, (Comparable)((Object)ad.c)), 5, 3, 6, dc2);
                this.a(k2, p.U.v(), 4, 1, 4, dc2);
                this.a(k2, p.U.v(), 4, 1, 5, dc2);
                this.a(k2, p.U.v(), 4, 1, 6, dc2);
                this.a(k2, p.U.v(), 6, 1, 4, dc2);
                this.a(k2, p.U.v(), 6, 1, 5, dc2);
                this.a(k2, p.U.v(), 6, 1, 6, dc2);
                this.a(k2, p.U.v(), 5, 1, 4, dc2);
                this.a(k2, p.U.v(), 5, 1, 6, dc2);
                break;
            }
            case 1: {
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.a(k2, p.bf.v(), 3, 1, 3 + i2, dc2);
                    this.a(k2, p.bf.v(), 7, 1, 3 + i2, dc2);
                    this.a(k2, p.bf.v(), 3 + i2, 1, 3, dc2);
                    this.a(k2, p.bf.v(), 3 + i2, 1, 7, dc2);
                }
                this.a(k2, p.bf.v(), 5, 1, 5, dc2);
                this.a(k2, p.bf.v(), 5, 2, 5, dc2);
                this.a(k2, p.bf.v(), 5, 3, 5, dc2);
                this.a(k2, p.i.v(), 5, 4, 5, dc2);
                break;
            }
            case 2: {
                int n2;
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(k2, p.e.v(), 1, 3, n2, dc2);
                    this.a(k2, p.e.v(), 9, 3, n2, dc2);
                }
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(k2, p.e.v(), n2, 3, 1, dc2);
                    this.a(k2, p.e.v(), n2, 3, 9, dc2);
                }
                this.a(k2, p.e.v(), 5, 1, 4, dc2);
                this.a(k2, p.e.v(), 5, 1, 6, dc2);
                this.a(k2, p.e.v(), 5, 3, 4, dc2);
                this.a(k2, p.e.v(), 5, 3, 6, dc2);
                this.a(k2, p.e.v(), 4, 1, 5, dc2);
                this.a(k2, p.e.v(), 6, 1, 5, dc2);
                this.a(k2, p.e.v(), 4, 3, 5, dc2);
                this.a(k2, p.e.v(), 6, 3, 5, dc2);
                for (n2 = 1; n2 <= 3; ++n2) {
                    this.a(k2, p.e.v(), 4, n2, 4, dc2);
                    this.a(k2, p.e.v(), 6, n2, 4, dc2);
                    this.a(k2, p.e.v(), 4, n2, 6, dc2);
                    this.a(k2, p.e.v(), 6, n2, 6, dc2);
                }
                this.a(k2, p.aa.v(), 5, 3, 5, dc2);
                for (n2 = 2; n2 <= 8; ++n2) {
                    this.a(k2, p.f.v(), 2, 3, n2, dc2);
                    this.a(k2, p.f.v(), 3, 3, n2, dc2);
                    if (n2 <= 3 || n2 >= 7) {
                        this.a(k2, p.f.v(), 4, 3, n2, dc2);
                        this.a(k2, p.f.v(), 5, 3, n2, dc2);
                        this.a(k2, p.f.v(), 6, 3, n2, dc2);
                    }
                    this.a(k2, p.f.v(), 7, 3, n2, dc2);
                    this.a(k2, p.f.v(), 8, 3, n2, dc2);
                }
                b b2 = p.au.v().a(cq.a, (Comparable)((Object)ad.e));
                this.a(k2, b2, 9, 1, 3, dc2);
                this.a(k2, b2, 9, 2, 3, dc2);
                this.a(k2, b2, 9, 3, 3, dc2);
                this.a(k2, dc2, random, 3, 4, 8, j.i);
            }
        }
        return true;
    }
}

