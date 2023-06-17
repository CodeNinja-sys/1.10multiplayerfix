/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.ct;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;

public class fm
extends cn {
    public static final c a = net.minecraft.g.b.c.b("north");
    public static final c b = net.minecraft.g.b.c.b("east");
    public static final c c = net.minecraft.g.b.c.b("south");
    public static final c d = net.minecraft.g.b.c.b("west");
    protected static final a[] e = new a[]{new a(0.375, 0.0, 0.375, 0.625, 1.0, 0.625), new a(0.375, 0.0, 0.375, 0.625, 1.0, 1.0), new a(0.0, 0.0, 0.375, 0.625, 1.0, 0.625), new a(0.0, 0.0, 0.375, 0.625, 1.0, 1.0), new a(0.375, 0.0, 0.0, 0.625, 1.0, 0.625), new a(0.375, 0.0, 0.0, 0.625, 1.0, 1.0), new a(0.0, 0.0, 0.0, 0.625, 1.0, 0.625), new a(0.0, 0.0, 0.0, 0.625, 1.0, 1.0), new a(0.375, 0.0, 0.375, 1.0, 1.0, 0.625), new a(0.375, 0.0, 0.375, 1.0, 1.0, 1.0), new a(0.0, 0.0, 0.375, 1.0, 1.0, 0.625), new a(0.0, 0.0, 0.375, 1.0, 1.0, 1.0), new a(0.375, 0.0, 0.0, 1.0, 1.0, 0.625), new a(0.375, 0.0, 0.0, 1.0, 1.0, 1.0), new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.625), new a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};
    public static final a f = new a(0.375, 0.0, 0.375, 0.625, 1.5, 0.625);
    public static final a g = new a(0.375, 0.0, 0.625, 0.625, 1.5, 1.0);
    public static final a h = new a(0.0, 0.0, 0.375, 0.375, 1.5, 0.625);
    public static final a i = new a(0.375, 0.0, 0.0, 0.625, 1.5, 0.375);
    public static final a j = new a(0.625, 0.0, 0.375, 1.0, 1.5, 0.625);

    public fm(h h2, e e2) {
        super(h2, e2);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        b2 = b2.b((n)k2, b3);
        fm.a(b3, a2, list, f);
        if (((Boolean)b2.a(a)).booleanValue()) {
            fm.a(b3, a2, list, i);
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            fm.a(b3, a2, list, j);
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            fm.a(b3, a2, list, g);
        }
        if (((Boolean)b2.a(d)).booleanValue()) {
            fm.a(b3, a2, list, h);
        }
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = this.b(b2, n2, b3);
        return e[fm.l(b2)];
    }

    private static int l(b b2) {
        int n2 = 0;
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= 1 << ad.c.c();
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 1 << ad.f.c();
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            n2 |= 1 << ad.d.c();
        }
        if (((Boolean)b2.a(d)).booleanValue()) {
            n2 |= 1 << ad.e.c();
        }
        return n2;
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
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return false;
    }

    public boolean c(n n2, net.minecraft.u.b.b b2) {
        b b3 = n2.n(b2);
        cn cn2 = b3.c();
        return cn2 == p.cv ? false : (!(cn2 instanceof fm && cn2.L == this.L || cn2 instanceof ct) ? (cn2.L.j() && b3.k() ? cn2.L != net.minecraft.g.a.h.C : false) : true);
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return true;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        return k2.C ? true : net.minecraft.m.c.a(b4, k2, b2);
    }

    @Override
    public int b(b b2) {
        return 0;
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        return b2.a(a, Boolean.valueOf(this.c(n2, b3.d()))).a(b, Boolean.valueOf(this.c(n2, b3.g()))).a(c, Boolean.valueOf(this.c(n2, b3.e()))).a(d, Boolean.valueOf(this.c(n2, b3.f())));
    }

    @Override
    public b a(b b2, bq bq2) {
        switch (bq2) {
            case c: {
                return b2.a(a, (Boolean)b2.a(c)).a(b, (Boolean)b2.a(d)).a(c, (Boolean)b2.a(a)).a(d, (Boolean)b2.a(b));
            }
            case d: {
                return b2.a(a, (Boolean)b2.a(b)).a(b, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(a));
            }
            case b: {
                return b2.a(a, (Boolean)b2.a(d)).a(b, (Boolean)b2.a(a)).a(c, (Boolean)b2.a(b)).a(d, (Boolean)b2.a(c));
            }
        }
        return b2;
    }

    @Override
    public b a(b b2, bi bi2) {
        switch (bi2) {
            case b: {
                return b2.a(a, (Boolean)b2.a(c)).a(c, (Boolean)b2.a(a));
            }
            case c: {
                return b2.a(b, (Boolean)b2.a(d)).a(d, (Boolean)b2.a(b));
            }
        }
        return super.a(b2, bi2);
    }

    @Override
    protected i a() {
        return new i(this, a, b, d, c);
    }
}

