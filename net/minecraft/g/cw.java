/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.aj;
import net.minecraft.v.d;

public class cw
extends cn {
    public static final c a = c.b("snowy");

    protected cw() {
        super(h.b, e.z);
        this.z(this.O.b().a(a, Boolean.valueOf(false)));
        this.b(true);
        this.a(d.b);
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        cn cn2 = n2.n(b3.b()).c();
        return b2.a(a, Boolean.valueOf(cn2 == p.aJ || cn2 == p.aH));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C) {
            if (k2.j(b2.b()) < 4 && k2.n(b2.b()).f() > 2) {
                k2.b(b2, p.d.v().a(eg.a, (Comparable)((Object)ic.a)));
            } else if (k2.j(b2.b()) >= 9) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    net.minecraft.u.b.b b4 = b2.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    b b5 = k2.n(b4);
                    b b6 = k2.n(b4.b());
                    if (b5.c() != p.d || b5.a(eg.a) != ic.a || k2.j(b4.b()) < 4 || b6.f() > 2) continue;
                    k2.b(b4, this.v());
                }
            }
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        super.a(b2, k2, b3, random);
        if (random.nextInt(10) == 0) {
            k2.a(aj.w, (double)((float)b3.cy_() + random.nextFloat()), (double)((float)b3.k() + 1.1f), (double)((float)b3.l() + random.nextFloat()), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return p.d.a(p.d.v().a(eg.a, (Comparable)((Object)ic.a)), random, n2);
    }

    @Override
    public int b(b b2) {
        return 0;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

