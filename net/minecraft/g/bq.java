/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.f.ao;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.aj;

public class bq
extends a {
    protected static final net.minecraft.u.b.a a = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

    protected bq(h h2) {
        super(h2);
        this.a(1.0f);
    }

    @Override
    public ap a(k k2, int n2) {
        return new ao();
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return a;
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2 == ad.a ? super.a(b2, n2, b3, ad2) : false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, net.minecraft.u.b.a a2, List list, net.minecraft.w.n n2) {
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.n n2) {
        if (!n2.cz() && !n2.cA() && n2.cH() && !k2.C && n2.cT().b(b3.c((n)k2, b2).a(b2))) {
            n2.h_(1);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        double d2 = (float)b3.cy_() + random.nextFloat();
        double d3 = (float)b3.k() + 0.8f;
        double d4 = (float)b3.l() + random.nextFloat();
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        k2.a(aj.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return null;
    }

    @Override
    public e g(b b2) {
        return e.E;
    }
}

