/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.b;
import net.minecraft.g.b.e;
import net.minecraft.g.cd;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.w.l;

public abstract class bl
extends cn {
    public static final e b = e.a("half", cd.class);
    protected static final a c = new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0);
    protected static final a d = new a(0.0, 0.5, 0.0, 1.0, 1.0, 1.0);

    public bl(h h2) {
        super(h2);
        this.z = this.c();
        this.f(255);
    }

    @Override
    protected boolean bQ_() {
        return false;
    }

    @Override
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        return this.c() ? x : (b2.a(b) == cd.a ? d : c);
    }

    @Override
    public boolean h(net.minecraft.g.c.b b2) {
        return ((bl)b2.c()).c() || b2.a(b) == cd.a;
    }

    @Override
    public boolean d(net.minecraft.g.c.b b2) {
        return this.c();
    }

    @Override
    public net.minecraft.g.c.b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        net.minecraft.g.c.b b3 = super.a(k2, b2, ad2, f2, f3, f4, n2, l2).a(b, (Comparable)((Object)cd.b));
        return this.c() ? b3 : (ad2 != ad.a && (ad2 == ad.b || (double)f3 <= 0.5) ? b3 : b3.a(b, (Comparable)((Object)cd.a)));
    }

    @Override
    public int a(Random random) {
        return this.c() ? 2 : 1;
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return this.c();
    }

    @Override
    public boolean a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        boolean bl2;
        if (this.c()) {
            return super.a(b2, n2, b3, ad2);
        }
        if (ad2 != ad.b && ad2 != ad.a && !super.a(b2, n2, b3, ad2)) {
            return false;
        }
        net.minecraft.g.c.b b4 = n2.n(b3.a(ad2));
        boolean bl3 = bl.l(b4) && b4.a(b) == cd.a;
        boolean bl4 = bl2 = bl.l(b2) && b2.a(b) == cd.a;
        return bl2 ? (ad2 == ad.a ? true : (ad2 == ad.b && super.a(b2, n2, b3, ad2) ? true : !bl.l(b4) || !bl3)) : (ad2 == ad.b ? true : (ad2 == ad.a && super.a(b2, n2, b3, ad2) ? true : !bl.l(b4) || bl3));
    }

    protected static boolean l(net.minecraft.g.c.b b2) {
        cn cn2 = b2.c();
        return cn2 == p.U || cn2 == p.bM || cn2 == p.cP || cn2 == p.cX;
    }

    public abstract String b(int var1);

    public abstract boolean c();

    public abstract b e();

    public abstract Comparable a(cu var1);
}

