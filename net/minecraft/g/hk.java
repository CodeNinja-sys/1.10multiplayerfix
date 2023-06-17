/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.eg;
import net.minecraft.g.fh;
import net.minecraft.g.fi;
import net.minecraft.g.gb;
import net.minecraft.g.hi;
import net.minecraft.g.ic;
import net.minecraft.g.t;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.v.d;

public class hk
extends cn
implements fi {
    public static final c a = c.b("snowy");

    protected hk() {
        super(h.b);
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
                k2.b(b2, p.d.v());
            } else if (k2.j(b2.b()) >= 9) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    net.minecraft.u.b.b b4 = b2.a(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (b4.k() >= 0 && b4.k() < 256 && !k2.d(b4)) {
                        return;
                    }
                    b b5 = k2.n(b4.b());
                    b b6 = k2.n(b4);
                    if (b6.c() != p.d || b6.a(eg.a) != ic.a || k2.j(b4.b()) < 4 || b5.f() > 2) continue;
                    k2.b(b4, p.c.v());
                }
            }
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return p.d.a(p.d.v().a(eg.a, (Comparable)((Object)ic.a)), random, n2);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return true;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        net.minecraft.u.b.b b4 = b2.b();
        block0: for (int i2 = 0; i2 < 128; ++i2) {
            net.minecraft.u.b.b b5 = b4;
            int n2 = 0;
            while (true) {
                if (n2 >= i2 / 16) {
                    Object object;
                    if (k2.n((net.minecraft.u.b.b)b5).c().L != h.a) continue block0;
                    if (random.nextInt(8) == 0) {
                        b b6;
                        object = k2.a(b5).a(random, b5);
                        gb gb2 = ((fh)object).b().a();
                        if (!gb2.e(k2, b5, b6 = gb2.v().a(gb2.h(), (Comparable)object))) continue block0;
                        k2.a(b5, b6, 3);
                        continue block0;
                    }
                    object = p.H.v().a(hi.a, (Comparable)((Object)t.b));
                    if (!p.H.e(k2, b5, (b)object)) continue block0;
                    k2.a(b5, (b)object, 3);
                    continue block0;
                }
                if (k2.n((b5 = b5.a(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1)).c()).c() != p.c || k2.n(b5).o()) continue block0;
                ++n2;
            }
        }
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.b;
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

