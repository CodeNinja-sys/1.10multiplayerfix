/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.o.f;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.q.v;
import net.minecraft.u.aj;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class hz
extends cn {
    public hz() {
        super(h.e);
        this.a(d.b);
        this.a(0.2f);
        this.b(true);
    }

    @Override
    public e g(b b2) {
        return e.K;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.n n2) {
        if (!n2.ck() && n2 instanceof l && !f.j((l)n2)) {
            n2.a(net.minecraft.u.n.e, 1.0f);
        }
        super.a(k2, b2, n2);
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3) {
        return 0xF000F0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        net.minecraft.u.b.b b4 = b2.b();
        b b5 = k2.n(b4);
        if (b5.c() == p.j || b5.c() == p.i) {
            k2.f(b4);
            k2.a(null, b2, net.minecraft.a.f.bx, bu.e, 0.5f, 2.6f + (k2.p.nextFloat() - k2.p.nextFloat()) * 0.8f);
            if (k2 instanceof v) {
                ((v)k2).a(aj.m, (double)b4.cy_() + 0.5, (double)b4.k() + 0.25, (double)b4.l() + 0.5, 8, 0.5, 0.25, 0.5, 0.0, new int[0]);
            }
        }
    }

    @Override
    public boolean a(b b2, net.minecraft.w.n n2) {
        return n2.ck();
    }
}

