/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.fh;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.f.e;
import net.minecraft.q.g.a.al;
import net.minecraft.q.k;
import net.minecraft.w.e.av;

public class p
extends q {
    protected static final b a = net.minecraft.a.p.bx.v();

    protected p(ab ab2) {
        super(ab2);
        this.w.A = 2;
        this.w.C = 1;
        this.w.E = 1;
        this.w.F = 8;
        this.w.G = 10;
        this.w.K = 1;
        this.w.z = 4;
        this.w.J = 0;
        this.w.I = 0;
        this.w.D = 5;
        this.x.add(new am(av.class, 1, 1, 1));
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return s;
    }

    @Override
    public int a(net.minecraft.u.b.b b2) {
        double d2 = o.a((double)b2.cy_() * 0.0225, (double)b2.l() * 0.0225);
        return d2 < -0.1 ? 5011004 : 6975545;
    }

    @Override
    public int b(net.minecraft.u.b.b b2) {
        return 6975545;
    }

    @Override
    public fh a(Random random, net.minecraft.u.b.b b2) {
        return fh.c;
    }

    @Override
    public void a(k k2, Random random, e e2, int n2, int n3, double d2) {
        double d3 = o.a((double)n2 * 0.25, (double)n3 * 0.25);
        if (d3 > 0.0) {
            int n4 = n2 & 0xF;
            int n5 = n3 & 0xF;
            for (int i2 = 255; i2 >= 0; --i2) {
                if (e2.a(n5, i2, n4).d() == net.minecraft.g.a.h.a) continue;
                if (i2 != 62 || e2.a(n5, i2, n4).c() == net.minecraft.a.p.j) break;
                e2.a(n5, i2, n4, k);
                if (!(d3 < 0.12)) break;
                e2.a(n5, i2 + 1, n4, a);
                break;
            }
        }
        this.b(k2, random, e2, n2, n3, d2);
    }

    @Override
    public void a(k k2, Random random, net.minecraft.u.b.b b2) {
        super.a(k2, random, b2);
        if (random.nextInt(64) == 0) {
            new al().a(k2, random, b2);
        }
    }
}

