/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.f.ap;
import net.minecraft.f.k;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cu;
import net.minecraft.h.aq;
import net.minecraft.h.y;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;

public class l
extends a {
    public static final f a = net.minecraft.g.b.f.a("facing", new cu());
    public static final c b = net.minecraft.g.b.c.b("enabled");
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 0.625, 1.0);
    protected static final net.minecraft.u.b.a d = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
    protected static final net.minecraft.u.b.a e = new net.minecraft.u.b.a(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
    protected static final net.minecraft.u.b.a f = new net.minecraft.u.b.a(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final net.minecraft.u.b.a g = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);

    public l() {
        super(h.f, net.minecraft.g.a.e.m);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.a)).a(b, Boolean.valueOf(true)));
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return x;
    }

    @Override
    public void a(b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3, net.minecraft.u.b.a a2, List list, net.minecraft.w.n n2) {
        l.a(b3, a2, list, c);
        l.a(b3, a2, list, g);
        l.a(b3, a2, list, f);
        l.a(b3, a2, list, d);
        l.a(b3, a2, list, e);
    }

    @Override
    public b a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, net.minecraft.w.l l2) {
        ad ad3 = ad2.e();
        if (ad3 == ad.b) {
            ad3 = ad.a;
        }
        return this.v().a(a, (Comparable)((Object)ad3)).a(b, Boolean.valueOf(true));
    }

    @Override
    public ap a(net.minecraft.q.k k2, int n2) {
        return new k();
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.l l2, net.minecraft.m.cu cu2) {
        ap ap2;
        super.a(k2, b2, b3, l2, cu2);
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof k) {
            ((k)ap2).a(cu2.q());
        }
    }

    @Override
    public boolean h(b b2) {
        return true;
    }

    @Override
    public void b(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
    }

    @Override
    public boolean a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, net.minecraft.m.cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof k) {
            b4.a((k)ap2);
            b4.a(o.R);
        }
        return true;
    }

    @Override
    public void a(b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.e(k2, b3, b2);
    }

    private void e(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3) {
        boolean bl2;
        boolean bl3 = bl2 = !k2.x(b2);
        if (bl2 != (Boolean)b3.a(b)) {
            k2.a(b2, b3.a(b, Boolean.valueOf(bl2)), 4);
        }
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof k) {
            net.minecraft.h.a.a(k2, b2, (y)((k)ap2));
            k2.f(b2, this);
        }
        super.a(k2, b2, b3);
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return true;
    }

    public static ad b(int n2) {
        return ad.a(n2 & 7);
    }

    public static boolean c(int n2) {
        return (n2 & 8) != 8;
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3) {
        return aq.a(k2.q(b3));
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.b;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)l.b(n2))).a(b, Boolean.valueOf(l.c(n2)));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(a))).b();
        if (!((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 8;
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
    protected i a() {
        return new i(this, a, b);
    }
}

