/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.eg;
import net.minecraft.g.gm;
import net.minecraft.g.ic;
import net.minecraft.g.t;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.f;
import net.minecraft.q.b.q;
import net.minecraft.q.f.e;
import net.minecraft.q.g.a.ad;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.at;
import net.minecraft.q.g.a.av;
import net.minecraft.q.g.a.r;
import net.minecraft.q.g.a.v;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class a
extends q {
    private static final ad a = new ad();
    private static final v b = new v(false);
    private static final av c = new av(false, false);
    private static final av B = new av(false, true);
    private static final at C = new at(net.minecraft.a.p.Y, 0);
    private final f D;

    public a(f f2, ab ab2) {
        super(ab2);
        this.D = f2;
        this.y.add(new am(net.minecraft.w.h.e.class, 8, 4, 4));
        this.y.add(new am(net.minecraft.w.h.am.class, 4, 2, 3));
        this.w.A = 10;
        if (f2 != net.minecraft.q.b.f.b && f2 != net.minecraft.q.b.f.c) {
            this.w.D = 1;
            this.w.F = 1;
        } else {
            this.w.D = 7;
            this.w.E = 1;
            this.w.F = 3;
        }
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return (this.D == net.minecraft.q.b.f.b || this.D == net.minecraft.q.b.f.c) && random.nextInt(3) == 0 ? (this.D != net.minecraft.q.b.f.c && random.nextInt(13) != 0 ? c : B) : (random.nextInt(3) == 0 ? a : b);
    }

    @Override
    public aj b(Random random) {
        return random.nextInt(5) > 0 ? new r(net.minecraft.g.t.c) : new r(net.minecraft.g.t.b);
    }

    @Override
    public void a(k k2, Random random, b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.D == net.minecraft.q.b.f.b || this.D == net.minecraft.q.b.f.c) {
            n5 = random.nextInt(3);
            for (n4 = 0; n4 < n5; ++n4) {
                n3 = random.nextInt(16) + 8;
                n2 = random.nextInt(16) + 8;
                b b3 = k2.k(b2.a(n3, 0, n2));
                C.a(k2, random, b3);
            }
        }
        p.a(gm.d);
        for (n5 = 0; n5 < 7; ++n5) {
            n4 = random.nextInt(16) + 8;
            n3 = random.nextInt(16) + 8;
            n2 = random.nextInt(k2.k(b2.a(n4, 0, n3)).k() + 32);
            p.a(k2, random, b2.a(n4, n2, n3));
        }
        super.a(k2, random, b2);
    }

    @Override
    public void a(k k2, Random random, e e2, int n2, int n3, double d2) {
        if (this.D == net.minecraft.q.b.f.b || this.D == net.minecraft.q.b.f.c) {
            this.u = net.minecraft.a.p.c.v();
            this.v = net.minecraft.a.p.d.v();
            if (d2 > 1.75) {
                this.u = net.minecraft.a.p.d.v().a(eg.a, (Comparable)((Object)ic.b));
            } else if (d2 > -0.95) {
                this.u = net.minecraft.a.p.d.v().a(eg.a, (Comparable)((Object)ic.c));
            }
        }
        this.b(k2, random, e2, n2, n3, d2);
    }
}

