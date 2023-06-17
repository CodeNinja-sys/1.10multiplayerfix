/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class aa
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("color", cd.class);
    protected static final a b = new a(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0);

    protected aa() {
        super(h.r);
        this.z(this.O.b().a(a, (Comparable)((Object)cd.a)));
        this.b(true);
        this.a(d.c);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public e g(b b2) {
        return ((cd)((Object)b2.a(a))).e();
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
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) && this.c(k2, b2);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.e(k2, b3, b2);
    }

    private boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.c(k2, b2)) {
            this.b(k2, b2, b3, 0);
            k2.f(b2);
            return false;
        }
        return true;
    }

    private boolean c(k k2, net.minecraft.u.b.b b2) {
        return !k2.c(b2.c());
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2 == ad.b ? true : (n2.n(b3.a(ad2)).c() == this ? true : super.a(b2, n2, b3, ad2));
    }

    @Override
    public int k(b b2) {
        return ((cd)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new cu(cg2, 1, i2));
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)cd.b(n2)));
    }

    @Override
    public int b(b b2) {
        return ((cd)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

