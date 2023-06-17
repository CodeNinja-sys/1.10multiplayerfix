/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.aa;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.a.b;
import net.minecraft.g.a.h;
import net.minecraft.g.q;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.q.au;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.c;
import net.minecraft.v.d;

public class ag
extends q {
    public ag() {
        super(h.w, false);
        this.N = 0.98f;
        this.b(true);
        this.a(d.b);
    }

    @Override
    public c bR_() {
        return c.d;
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, net.minecraft.g.c.b b4, ap ap2, cu cu2) {
        b2.a(o.a(this));
        b2.e(0.025f);
        if (this.bQ_() && f.a(aa.r, cu2) > 0) {
            cu cu3 = this.j(b4);
            if (cu3 != null) {
                ag.a(k2, b3, cu3);
            }
        } else {
            if (k2.q.m()) {
                k2.f(b3);
                return;
            }
            int n2 = f.a(aa.t, cu2);
            this.b(k2, b3, b4, n2);
            h h2 = k2.n(b3.c()).d();
            if (h2.c() || h2.d()) {
                k2.b(b3, p.i.v());
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, Random random) {
        if (k2.b(au.b, b2) > 11 - this.v().f()) {
            this.b(k2, b2);
        }
    }

    protected void b(k k2, net.minecraft.u.b.b b2) {
        if (k2.q.m()) {
            k2.f(b2);
        } else {
            this.b(k2, b2, k2.n(b2), 0);
            k2.b(b2, p.j.v());
            k2.c(b2, p.j);
        }
    }

    @Override
    public b a_(net.minecraft.g.c.b b2) {
        return b.a;
    }
}

