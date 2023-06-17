/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.f.m;
import net.minecraft.g.a.b;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.bu;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.co;
import net.minecraft.g.cr;
import net.minecraft.g.ds;
import net.minecraft.g.fk;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class id
extends cr {
    public static final c a = net.minecraft.g.b.c.b("extended");
    protected static final a b = new a(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
    protected static final a c = new a(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a d = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
    protected static final a e = new a(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
    protected static final a f = new a(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
    protected static final a g = new a(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
    private final boolean h;
    private static /* synthetic */ int[] i;

    public id(boolean bl2) {
        super(net.minecraft.g.a.h.H);
        this.z(this.O.b().a(o, (Comparable)((Object)ad.c)).a(a, Boolean.valueOf(false)));
        this.h = bl2;
        this.a(fk.d);
        this.c(0.5f);
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        if (((Boolean)b2.a(a)).booleanValue()) {
            switch (id.h()[((ad)((Object)b2.a(o))).ordinal()]) {
                case 1: {
                    return g;
                }
                default: {
                    return f;
                }
                case 3: {
                    return e;
                }
                case 4: {
                    return d;
                }
                case 5: {
                    return c;
                }
                case 6: 
            }
            return b;
        }
        return x;
    }

    @Override
    public boolean h(net.minecraft.g.c.b b2) {
        return (Boolean)b2.a(a) == false || b2.a(o) == ad.a;
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        id.a(b3, a2, list, b2.c((n)k2, b3));
    }

    @Override
    public boolean d(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, l l2, cu cu2) {
        k2.a(b2, b3.a(o, (Comparable)((Object)id.a(b2, l2))), 2);
        if (!k2.C) {
            this.e(k2, b2, b3);
        }
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.C) {
            this.e(k2, b3, b2);
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        if (!k2.C && k2.q(b2) == null) {
            this.e(k2, b2, b3);
        }
    }

    @Override
    public net.minecraft.g.c.b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(o, (Comparable)((Object)id.a(b2, l2))).a(a, Boolean.valueOf(false));
    }

    private void e(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        ad ad2 = (ad)((Object)b3.a(o));
        boolean bl2 = this.b(k2, b2, ad2);
        if (bl2 && !((Boolean)b3.a(a)).booleanValue()) {
            if (new net.minecraft.g.c.c(k2, b2, ad2, true).a()) {
                k2.c(b2, this, 0, ad2.b());
            }
        } else if (!bl2 && ((Boolean)b3.a(a)).booleanValue()) {
            k2.c(b2, this, 1, ad2.b());
        }
    }

    private boolean b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        Object object;
        ad[] arrad = ad.values();
        int n2 = arrad.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = arrad[i2];
            if (object == ad2 || !k2.b(b2.a((ad)object), (ad)object)) continue;
            return true;
        }
        if (k2.b(b2, ad.a)) {
            return true;
        }
        object = b2.b();
        for (ad ad3 : ad.values()) {
            if (ad3 == ad.a || !k2.b(((net.minecraft.u.b.b)object).a(ad3), ad3)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, int n2, int n3) {
        ad ad2 = (ad)((Object)b2.a(o));
        if (!k2.C) {
            boolean bl2 = this.b(k2, b3, ad2);
            if (bl2 && n2 == 1) {
                k2.a(b3, b2.a(a, Boolean.valueOf(true)), 2);
                return false;
            }
            if (!bl2 && n2 == 0) {
                return false;
            }
        }
        if (n2 == 0) {
            if (!this.a(k2, b3, ad2, true)) {
                return false;
            }
            k2.a(b3, b2.a(a, Boolean.valueOf(true)), 2);
            k2.a(null, b3, net.minecraft.a.f.eb, net.minecraft.u.bu.e, 0.5f, k2.p.nextFloat() * 0.25f + 0.6f);
        } else if (n2 == 1) {
            ap ap2 = k2.q(b3.a(ad2));
            if (ap2 instanceof m) {
                ((m)ap2).i();
            }
            k2.a(b3, p.M.v().a(ds.a, (Comparable)((Object)ad2)).a(ds.b, (Comparable)((Object)(this.h ? bu.b : bu.a))), 3);
            k2.a(b3, ds.a(this.a(n3), ad2, false, true));
            if (this.h) {
                m m2;
                ap ap3;
                net.minecraft.u.b.b b4 = b3.a(ad2.h() * 2, ad2.i() * 2, ad2.j() * 2);
                net.minecraft.g.c.b b5 = k2.n(b4);
                cn cn2 = b5.c();
                boolean bl3 = false;
                if (cn2 == p.M && (ap3 = k2.q(b4)) instanceof m && (m2 = (m)ap3).g() == ad2 && m2.f()) {
                    m2.i();
                    bl3 = true;
                }
                if (!bl3 && b5.d() != net.minecraft.g.a.h.a && id.a(b5, k2, b4, ad2.e(), false) && (b5.r() == net.minecraft.g.a.b.a || cn2 == p.J || cn2 == p.F)) {
                    this.a(k2, b3, ad2, false);
                }
            } else {
                k2.f(b3.a(ad2));
            }
            k2.a(null, b3, net.minecraft.a.f.ea, net.minecraft.u.bu.e, 0.5f, k2.p.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return false;
    }

    public static ad b(int n2) {
        int n3 = n2 & 7;
        return n3 > 5 ? null : ad.a(n3);
    }

    public static ad a(net.minecraft.u.b.b b2, l l2) {
        if (net.minecraft.u.b.n.e((float)l2.aU - (float)b2.cy_()) < 2.0f && net.minecraft.u.b.n.e((float)l2.aW - (float)b2.l()) < 2.0f) {
            double d2 = l2.aV + (double)l2.ce_();
            if (d2 - (double)b2.k() > 2.0) {
                return ad.b;
            }
            if ((double)b2.k() - d2 > 0.0) {
                return ad.a;
            }
        }
        return l2.cl_().e();
    }

    public static boolean a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, ad ad2, boolean bl2) {
        cn cn2 = b2.c();
        if (cn2 == p.Z) {
            return false;
        }
        if (!k2.V().a(b3)) {
            return false;
        }
        if (b3.k() >= 0 && (ad2 != ad.a || b3.k() != 0)) {
            if (b3.k() <= k2.L() - 1 && (ad2 != ad.b || b3.k() != k2.L() - 1)) {
                if (cn2 != p.J && cn2 != p.F) {
                    if (b2.b(k2, b3) == -1.0f) {
                        return false;
                    }
                    if (b2.r() == net.minecraft.g.a.b.c) {
                        return false;
                    }
                    if (b2.r() == net.minecraft.g.a.b.b) {
                        return bl2;
                    }
                } else if (((Boolean)b2.a(a)).booleanValue()) {
                    return false;
                }
                return !cn2.n();
            }
            return false;
        }
        return false;
    }

    private boolean a(k k2, net.minecraft.u.b.b b2, ad ad2, boolean bl2) {
        int n2;
        net.minecraft.g.c.b b3;
        Object object;
        int n3;
        net.minecraft.g.c.c c2;
        if (!bl2) {
            k2.f(b2.a(ad2));
        }
        if (!(c2 = new net.minecraft.g.c.c(k2, b2, ad2, bl2)).a()) {
            return false;
        }
        List list = c2.b();
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            net.minecraft.u.b.b b4 = (net.minecraft.u.b.b)list.get(i2);
            arrayList.add(k2.n(b4).b((n)k2, b4));
        }
        List list2 = c2.c();
        int n4 = list.size() + list2.size();
        net.minecraft.g.c.b[] arrb = new net.minecraft.g.c.b[n4];
        ad ad3 = bl2 ? ad2 : ad2.e();
        for (n3 = list2.size() - 1; n3 >= 0; --n3) {
            object = (net.minecraft.u.b.b)list2.get(n3);
            b3 = k2.n((net.minecraft.u.b.b)object);
            b3.c().b(k2, (net.minecraft.u.b.b)object, b3, 0);
            k2.f((net.minecraft.u.b.b)object);
            arrb[--n4] = b3;
        }
        for (n3 = list.size() - 1; n3 >= 0; --n3) {
            object = (net.minecraft.u.b.b)list.get(n3);
            b3 = k2.n((net.minecraft.u.b.b)object);
            k2.a((net.minecraft.u.b.b)object, p.a.v(), 2);
            object = ((net.minecraft.u.b.b)object).a(ad3);
            k2.a((net.minecraft.u.b.b)object, p.M.v().a(o, (Comparable)((Object)ad2)), 4);
            k2.a((net.minecraft.u.b.b)object, ds.a((net.minecraft.g.c.b)arrayList.get(n3), ad2, bl2, false));
            arrb[--n4] = b3;
        }
        net.minecraft.u.b.b b5 = b2.a(ad2);
        if (bl2) {
            object = this.h ? bu.b : bu.a;
            b3 = p.K.v().a(co.o, (Comparable)((Object)ad2)).a(co.a, (Comparable)object);
            net.minecraft.g.c.b b6 = p.M.v().a(ds.a, (Comparable)((Object)ad2)).a(ds.b, (Comparable)((Object)(this.h ? bu.b : bu.a)));
            k2.a(b5, b6, 4);
            k2.a(b5, ds.a(b3, ad2, true, false));
        }
        for (n2 = list2.size() - 1; n2 >= 0; --n2) {
            k2.b((net.minecraft.u.b.b)list2.get(n2), arrb[n4++].c());
        }
        for (n2 = list.size() - 1; n2 >= 0; --n2) {
            k2.b((net.minecraft.u.b.b)list.get(n2), arrb[n4++].c());
        }
        if (bl2) {
            k2.b(b5, p.K);
            k2.b(b2, this);
        }
        return true;
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        return this.v().a(o, (Comparable)((Object)id.b(n2))).a(a, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(o))).b();
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bq bq2) {
        return b2.a(o, (Comparable)((Object)bq2.a((ad)((Object)b2.a(o)))));
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(o))));
    }

    @Override
    protected i a() {
        return new i(this, o, a);
    }

    static /* synthetic */ int[] h() {
        if (i != null) {
            return i;
        }
        int[] arrn = new int[ad.values().length];
        try {
            arrn[ad.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        i = arrn;
        return arrn;
    }
}

