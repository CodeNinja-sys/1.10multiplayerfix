/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.ft;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.b.a;

public class ea
extends ft {
    protected static final a a = new a(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);

    protected ea() {
        super(h.l);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return a;
    }

    @Override
    public e g(b b2) {
        return e.o;
    }

    @Override
    protected boolean i(b b2) {
        return b2.c() == p.m || b2.c() == p.cz || b2.c() == p.cu || b2.c() == p.d;
    }

    @Override
    public boolean b(n n2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public int a(Random random) {
        return random.nextInt(3);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.A;
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (!k2.C && cu2 != null && cu2.a() == net.minecraft.a.w.bl) {
            b2.a(o.a(this));
            ea.a(k2, b3, new cu(p.I, 1, 0));
        } else {
            super.a(k2, b2, b3, b4, ap2, cu2);
        }
    }
}

