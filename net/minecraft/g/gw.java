/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.v.d;

public class gw
extends cn {
    public gw() {
        this(h.e.p());
    }

    public gw(e e2) {
        super(h.e, e2);
        this.a(d.b);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return this == p.q ? net.minecraft.a.w.j : (this == p.ag ? net.minecraft.a.w.k : (this == p.x ? net.minecraft.a.w.bd : (this == p.bP ? net.minecraft.a.w.bY : (this == p.co ? net.minecraft.a.w.cq : cg.a(this)))));
    }

    @Override
    public int a(Random random) {
        return this == p.x ? 4 + random.nextInt(5) : 1;
    }

    @Override
    public int a(int n2, Random random) {
        if (n2 > 0 && cg.a(this) != this.a((b)this.u().a().aO_().next(), random, n2)) {
            int n3 = random.nextInt(n2 + 2) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            return this.a(random) * (n3 + 1);
        }
        return this.a(random);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        super.a(k2, b2, b3, f2, n2);
        if (this.a(b3, k2.p, n2) != cg.a(this)) {
            int n3 = 0;
            if (this == p.q) {
                n3 = n.a(k2.p, 0, 2);
            } else if (this == p.ag) {
                n3 = n.a(k2.p, 3, 7);
            } else if (this == p.bP) {
                n3 = n.a(k2.p, 3, 7);
            } else if (this == p.x) {
                n3 = n.a(k2.p, 2, 5);
            } else if (this == p.co) {
                n3 = n.a(k2.p, 2, 5);
            }
            this.b(k2, b2, n3);
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this);
    }

    @Override
    public int k(b b2) {
        return this == p.x ? cd.l.c() : 0;
    }
}

