/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.ed;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.a;
import net.minecraft.u.c;
import net.minecraft.w.l;

public abstract class gh
extends de {
    protected static final a c = new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    protected final boolean d;

    protected gh(boolean bl2) {
        super(h.q);
        this.d = bl2;
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return c;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).t() ? super.a_(k2, b2) : false;
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).t();
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!this.a((n)k2, b2, b3)) {
            boolean bl2 = this.e(k2, b2, b3);
            if (this.d && !bl2) {
                k2.a(b2, this.n(b3), 2);
            } else if (!this.d) {
                k2.a(b2, this.m(b3), 2);
                if (!bl2) {
                    k2.a(b2, this.m(b3).c(), this.D(b3), -1);
                }
            }
        }
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2.l() != ae.b;
    }

    protected boolean A(b b2) {
        return this.d;
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return b2.a(n2, b3, ad2);
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return !this.A(b2) ? 0 : (b2.a(j) == ad2 ? this.b(n2, b3, b2) : 0);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (this.c(k2, b3)) {
            this.g(k2, b3, b2);
        } else {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
            for (ad ad2 : ad.values()) {
                k2.b(b3.a(ad2), this);
            }
        }
    }

    protected void g(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.a((n)k2, b2, b3)) {
            boolean bl2 = this.e(k2, b2, b3);
            if ((this.d && !bl2 || !this.d && bl2) && !k2.d(b2, this)) {
                int n2 = -1;
                if (this.i(k2, b2, b3)) {
                    n2 = -3;
                } else if (this.d) {
                    n2 = -2;
                }
                k2.a(b2, this, this.l(b3), n2);
            }
        }
    }

    public boolean a(n n2, net.minecraft.u.b.b b2, b b3) {
        return false;
    }

    protected boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        return this.f(k2, b2, b3) > 0;
    }

    protected int f(k k2, net.minecraft.u.b.b b2, b b3) {
        ad ad2 = (ad)((Object)b3.a(j));
        net.minecraft.u.b.b b4 = b2.a(ad2);
        int n2 = k2.c(b4, ad2);
        if (n2 >= 15) {
            return n2;
        }
        b b5 = k2.n(b4);
        return Math.max(n2, b5.c() == p.af ? (Integer)b5.a(ed.e) : 0);
    }

    protected int c(n n2, net.minecraft.u.b.b b2, b b3) {
        ad ad2 = (ad)((Object)b3.a(j));
        ad ad3 = ad2.f();
        ad ad4 = ad2.g();
        return Math.max(this.b(n2, b2.a(ad3), ad3), this.b(n2, b2.a(ad4), ad4));
    }

    protected int b(n n2, net.minecraft.u.b.b b2, ad ad2) {
        b b3 = n2.n(b2);
        cn cn2 = b3.c();
        return this.o(b3) ? (cn2 == p.cn ? 15 : (cn2 == p.af ? ((Integer)b3.a(ed.e)).intValue() : n2.a(b2, ad2))) : 0;
    }

    @Override
    public boolean f(b b2) {
        return true;
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(j, (Comparable)((Object)l2.cl_().e()));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        if (this.e(k2, b2, b3)) {
            k2.a(b2, (cn)this, 1);
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.h(k2, b2, b3);
    }

    protected void h(k k2, net.minecraft.u.b.b b2, b b3) {
        ad ad2 = (ad)((Object)b3.a(j));
        net.minecraft.u.b.b b4 = b2.a(ad2.e());
        k2.c(b4, this);
        k2.a(b4, (cn)this, ad2);
    }

    @Override
    public void a_(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.d) {
            for (ad ad2 : ad.values()) {
                k2.b(b2.a(ad2), this);
            }
        }
        super.a_(k2, b2, b3);
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    protected boolean o(b b2) {
        return b2.p();
    }

    protected int b(n n2, net.minecraft.u.b.b b2, b b3) {
        return 15;
    }

    public static boolean B(b b2) {
        return p.bb.C(b2) || p.cj.C(b2);
    }

    public boolean C(b b2) {
        cn cn2 = b2.c();
        return cn2 == this.m(this.v()).c() || cn2 == this.n(this.v()).c();
    }

    public boolean i(k k2, net.minecraft.u.b.b b2, b b3) {
        ad ad2 = ((ad)((Object)b3.a(j))).e();
        net.minecraft.u.b.b b4 = b2.a(ad2);
        return gh.B(k2.n(b4)) ? k2.n(b4).a(j) != ad2 : false;
    }

    protected int D(b b2) {
        return this.l(b2);
    }

    protected abstract int l(b var1);

    protected abstract b m(b var1);

    protected abstract b n(b var1);

    @Override
    public boolean a(cn cn2) {
        return this.C(cn2.v());
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }
}

