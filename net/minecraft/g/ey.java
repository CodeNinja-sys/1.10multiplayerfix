/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.ct;
import net.minecraft.g.ei;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class ey
extends cn {
    public static final c a = net.minecraft.g.b.c.b("up");
    public static final c b = net.minecraft.g.b.c.b("north");
    public static final c c = net.minecraft.g.b.c.b("east");
    public static final c d = net.minecraft.g.b.c.b("south");
    public static final c e = net.minecraft.g.b.c.b("west");
    public static final e f = net.minecraft.g.b.e.a("variant", ei.class);
    protected static final a[] g = new a[]{new a(0.25, 0.0, 0.25, 0.75, 1.0, 0.75), new a(0.25, 0.0, 0.25, 0.75, 1.0, 1.0), new a(0.0, 0.0, 0.25, 0.75, 1.0, 0.75), new a(0.0, 0.0, 0.25, 0.75, 1.0, 1.0), new a(0.25, 0.0, 0.0, 0.75, 1.0, 0.75), new a(0.3125, 0.0, 0.0, 0.6875, 0.875, 1.0), new a(0.0, 0.0, 0.0, 0.75, 1.0, 0.75), new a(0.0, 0.0, 0.0, 0.75, 1.0, 1.0), new a(0.25, 0.0, 0.25, 1.0, 1.0, 0.75), new a(0.25, 0.0, 0.25, 1.0, 1.0, 1.0), new a(0.0, 0.0, 0.3125, 1.0, 0.875, 0.6875), new a(0.0, 0.0, 0.25, 1.0, 1.0, 1.0), new a(0.25, 0.0, 0.0, 1.0, 1.0, 0.75), new a(0.25, 0.0, 0.0, 1.0, 1.0, 1.0), new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.75), new a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    protected static final a[] h = new a[]{g[0].a(1.5), g[1].a(1.5), g[2].a(1.5), g[3].a(1.5), g[4].a(1.5), g[5].a(1.5), g[6].a(1.5), g[7].a(1.5), g[8].a(1.5), g[9].a(1.5), g[10].a(1.5), g[11].a(1.5), g[12].a(1.5), g[13].a(1.5), g[14].a(1.5), g[15].a(1.5)};

    public ey(cn cn2) {
        super(cn2.L);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, (Comparable)((Object)ei.a)));
        this.c(cn2.E);
        this.b(cn2.F / 3.0f);
        this.a(cn2.J);
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = this.b(b2, n2, b3);
        return g[ey.l(b2)];
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        b2 = this.b(b2, (n)k2, b3);
        return h[ey.l(b2)];
    }

    private static int l(b b2) {
        int n2 = 0;
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 1 << ad.c.c();
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            n2 |= 1 << ad.f.c();
        }
        if (((Boolean)b2.a(d)).booleanValue()) {
            n2 |= 1 << ad.d.c();
        }
        if (((Boolean)b2.a(e)).booleanValue()) {
            n2 |= 1 << ad.e.c();
        }
        return n2;
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.p()) + "." + ei.a.c() + ".name");
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    private boolean c(n n2, net.minecraft.u.b.b b2) {
        b b3 = n2.n(b2);
        cn cn2 = b3.c();
        return cn2 == p.cv ? false : (cn2 != this && !(cn2 instanceof ct) ? (cn2.L.j() && b3.k() ? cn2.L != net.minecraft.g.a.h.C : false) : true);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (ei ei2 : ei.values()) {
            list.add(new cu(cg2, 1, ei2.b()));
        }
    }

    @Override
    public int k(b b2) {
        return ((ei)((Object)b2.a(f))).b();
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2 == ad.a ? super.a(b2, n2, b3, ad2) : true;
    }

    @Override
    public b a(int n2) {
        return this.v().a(f, (Comparable)((Object)ei.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((ei)((Object)b2.a(f))).b();
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        boolean bl2 = this.c(n2, b3.d());
        boolean bl3 = this.c(n2, b3.g());
        boolean bl4 = this.c(n2, b3.e());
        boolean bl5 = this.c(n2, b3.f());
        boolean bl6 = bl2 && !bl3 && bl4 && !bl5 || !bl2 && bl3 && !bl4 && bl5;
        return b2.a(a, Boolean.valueOf(!bl6 || !n2.c(b3.b()))).a(b, Boolean.valueOf(bl2)).a(c, Boolean.valueOf(bl3)).a(d, Boolean.valueOf(bl4)).a(e, Boolean.valueOf(bl5));
    }

    @Override
    protected i a() {
        return new i(this, a, b, c, e, d, f);
    }
}

