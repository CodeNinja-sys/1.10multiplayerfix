/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.f.ad;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ah;

public class cx
extends a {
    protected static final net.minecraft.u.b.a f = new net.minecraft.u.b.a(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);

    protected cx() {
        super(h.d);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return f;
    }

    @Override
    public net.minecraft.u.b.a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public ap a(k k2, int n2) {
        return new ad();
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.ar;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.ar);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, net.minecraft.u.ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        return ap2 instanceof ad ? ((ad)ap2).b(b4) : false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return !this.a(k2, b2) && super.a_(k2, b2);
    }
}

