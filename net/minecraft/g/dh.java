/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;

public class dh
extends cn {
    protected static final a a = new a(0.0, 0.0, 0.0, 1.0, 0.9375, 1.0);

    protected dh() {
        super(h.c);
        this.f(255);
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        switch (ad2) {
            case b: {
                return true;
            }
            case c: 
            case d: 
            case e: 
            case f: {
                b b4 = n2.n(b3.a(ad2));
                cn cn2 = b4.c();
                return !b4.s() && cn2 != p.ak && cn2 != p.da;
            }
        }
        return super.a(b2, n2, b3, ad2);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return a;
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
    public cg a(b b2, Random random, int n2) {
        return p.d.a(p.d.v().a(eg.a, (Comparable)((Object)ic.a)), random, n2);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        super.a(b2, k2, b3, cn2);
        if (k2.n(b3.b()).d().a()) {
            k2.b(b3, p.d.v());
        }
    }
}

