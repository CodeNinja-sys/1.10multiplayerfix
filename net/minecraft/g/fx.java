/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.b.c;
import net.minecraft.g.b.f;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.h;
import net.minecraft.g.c.a.i;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.w.l;

public class fx
extends cn {
    public static final f a = de.j;
    public static final c b = net.minecraft.g.b.c.b("eye");
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
    protected static final net.minecraft.u.b.a d = new net.minecraft.u.b.a(0.3125, 0.8125, 0.3125, 0.6875, 1.0, 0.6875);
    private static h e;

    public fx() {
        super(net.minecraft.g.a.h.e, net.minecraft.g.a.e.C);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return c;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, net.minecraft.u.b.a a2, List list, net.minecraft.w.n n2) {
        fx.a(b3, a2, list, c);
        if (((Boolean)k2.n(b3).a(b)).booleanValue()) {
            fx.a(b3, a2, list, d);
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)l2.cl_().e())).a(b, Boolean.valueOf(false));
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return (Boolean)b2.a(b) != false ? 15 : 0;
    }

    @Override
    public b a(int n2) {
        return this.v().a(b, Boolean.valueOf((n2 & 4) != 0)).a(a, (Comparable)((Object)ad.b(n2 & 3)));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(a))).c();
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(a, (Comparable)((Object)bq2.a((ad)((Object)b2.a(a)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(a))));
    }

    @Override
    protected net.minecraft.g.c.i a() {
        return new net.minecraft.g.c.i(this, a, b);
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    public static h h() {
        if (e == null) {
            e = net.minecraft.g.c.a.c.a().a("?vvv?", ">???<", ">???<", ">???<", "?^^^?").a('?', net.minecraft.g.c.a.a(i.a)).a('^', net.minecraft.g.c.a.a(i.a(p.bG).a(b, com.a.a.b.cn.a((Object)true)).a(a, com.a.a.b.cn.a((Object)ad.d)))).a('>', net.minecraft.g.c.a.a(i.a(p.bG).a(b, com.a.a.b.cn.a((Object)true)).a(a, com.a.a.b.cn.a((Object)ad.e)))).a('v', net.minecraft.g.c.a.a(i.a(p.bG).a(b, com.a.a.b.cn.a((Object)true)).a(a, com.a.a.b.cn.a((Object)ad.c)))).a('<', net.minecraft.g.c.a.a(i.a(p.bG).a(b, com.a.a.b.cn.a((Object)true)).a(a, com.a.a.b.cn.a((Object)ad.f)))).b();
        }
        return e;
    }
}

