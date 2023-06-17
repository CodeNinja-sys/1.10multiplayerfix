/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class ct
extends de {
    public static final c a = net.minecraft.g.b.c.b("open");
    public static final c b = net.minecraft.g.b.c.b("powered");
    public static final c c = net.minecraft.g.b.c.b("in_wall");
    protected static final a d = new a(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
    protected static final a e = new a(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
    protected static final a f = new a(0.0, 0.0, 0.375, 1.0, 0.8125, 0.625);
    protected static final a g = new a(0.375, 0.0, 0.0, 0.625, 0.8125, 1.0);
    protected static final a h = new a(0.0, 0.0, 0.375, 1.0, 1.5, 0.625);
    protected static final a i = new a(0.375, 0.0, 0.0, 0.625, 1.5, 1.0);

    public ct(net.minecraft.g.b b2) {
        super(net.minecraft.g.a.h.d, b2.c());
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return ((Boolean)(b2 = this.b(b2, n2, b3)).a(c)).booleanValue() ? (((ad)((Object)b2.a(j))).l() == ae.a ? g : f) : (((ad)((Object)b2.a(j))).l() == ae.a ? e : d);
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        ae ae2 = ((ad)((Object)b2.a(j))).l();
        if (ae2 == ae.c && (n2.n(b3.f()).c() == p.bZ || n2.n(b3.g()).c() == p.bZ) || ae2 == ae.a && (n2.n(b3.d()).c() == p.bZ || n2.n(b3.e()).c() == p.bZ)) {
            b2 = b2.a(c, Boolean.valueOf(true));
        }
        return b2;
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(j, (Comparable)((Object)bq2.a((ad)((Object)b2.a(j)))));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(j))));
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).d().a() ? super.a_(k2, b2) : false;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return (Boolean)b2.a(a) != false ? y : (((ad)((Object)b2.a(j))).l() == ae.c ? h : i);
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
        return (Boolean)n2.n(b2).a(a);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(j, (Comparable)((Object)l2.cl_())).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (((Boolean)b3.a(a)).booleanValue()) {
            b3 = b3.a(a, Boolean.valueOf(false));
            k2.a(b2, b3, 10);
        } else {
            ad ad3 = ad.a(b4.ba);
            if (b3.a(j) == ad3.e()) {
                b3 = b3.a(j, (Comparable)((Object)ad3));
            }
            b3 = b3.a(a, Boolean.valueOf(true));
            k2.a(b2, b3, 10);
        }
        k2.a(b4, (Boolean)b3.a(a) != false ? 1008 : 1014, b2, 0);
        return true;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        boolean bl2;
        if (!k2.C && ((bl2 = k2.x(b3)) || cn2.v().p())) {
            if (bl2 && !((Boolean)b2.a(a)).booleanValue() && !((Boolean)b2.a(b)).booleanValue()) {
                k2.a(b3, b2.a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)), 2);
                k2.a(null, 1008, b3, 0);
            } else if (!bl2 && ((Boolean)b2.a(a)).booleanValue() && ((Boolean)b2.a(b)).booleanValue()) {
                k2.a(b3, b2.a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
                k2.a(null, 1014, b3, 0);
            } else if (bl2 != (Boolean)b2.a(b)) {
                k2.a(b3, b2.a(b, Boolean.valueOf(bl2)), 2);
            }
        }
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return true;
    }

    @Override
    public b a(int n2) {
        return this.v().a(j, (Comparable)((Object)ad.b(n2))).a(a, Boolean.valueOf((n2 & 4) != 0)).a(b, Boolean.valueOf((n2 & 8) != 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(j))).c();
        if (((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 8;
        }
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, j, a, b, c);
    }
}

