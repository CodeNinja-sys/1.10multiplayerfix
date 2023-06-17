/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.b.cm;
import java.util.List;
import java.util.Random;
import net.minecraft.a.f;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.f.d;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.fp;
import net.minecraft.g.gh;
import net.minecraft.g.gk;
import net.minecraft.g.p;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.bu;
import net.minecraft.w.f.l;

public class er
extends gh
implements p {
    public static final c a = net.minecraft.g.b.c.b("powered");
    public static final e b = e.a("mode", gk.class);

    public er(boolean bl2) {
        super(bl2);
        this.z(this.O.b().a(j, (Comparable)((Object)ad.c)).a(a, Boolean.valueOf(false)).a(b, (Comparable)((Object)gk.a)));
        this.I = true;
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a("item.comparator.name");
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.co;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.co);
    }

    @Override
    protected int l(b b2) {
        return 2;
    }

    @Override
    protected b m(b b2) {
        Boolean bl2 = (Boolean)b2.a(a);
        gk gk2 = (gk)((Object)b2.a(b));
        ad ad2 = (ad)((Object)b2.a(j));
        return net.minecraft.a.p.ck.v().a(j, (Comparable)((Object)ad2)).a(a, bl2).a(b, (Comparable)((Object)gk2));
    }

    @Override
    protected b n(b b2) {
        Boolean bl2 = (Boolean)b2.a(a);
        gk gk2 = (gk)((Object)b2.a(b));
        ad ad2 = (ad)((Object)b2.a(j));
        return net.minecraft.a.p.cj.v().a(j, (Comparable)((Object)ad2)).a(a, bl2).a(b, (Comparable)((Object)gk2));
    }

    @Override
    protected boolean A(b b2) {
        return this.d || (Boolean)b2.a(a) != false;
    }

    @Override
    protected int b(n n2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = n2.q(b2);
        return ap2 instanceof d ? ((d)ap2).a() : 0;
    }

    private int j(k k2, net.minecraft.u.b.b b2, b b3) {
        return b3.a(b) == gk.b ? Math.max(this.f(k2, b2, b3) - this.c((n)k2, b2, b3), 0) : this.f(k2, b2, b3);
    }

    @Override
    protected boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2 = this.f(k2, b2, b3);
        if (n2 >= 15) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c((n)k2, b2, b3);
        return n3 == 0 ? true : n2 >= n3;
    }

    @Override
    protected int f(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2 = super.f(k2, b2, b3);
        ad ad2 = (ad)((Object)b3.a(j));
        net.minecraft.u.b.b b4 = b2.a(ad2);
        b b5 = k2.n(b4);
        if (b5.q()) {
            n2 = b5.a(k2, b4);
        } else if (n2 < 15 && b5.o()) {
            l l2;
            b5 = k2.n(b4 = b4.a(ad2));
            if (b5.q()) {
                n2 = b5.a(k2, b4);
            } else if (b5.d() == h.a && (l2 = this.a(k2, ad2, b4)) != null) {
                n2 = l2.r();
            }
        }
        return n2;
    }

    private l a(k k2, ad ad2, net.minecraft.u.b.b b2) {
        List list = k2.a(l.class, new a(b2.cy_(), b2.k(), b2.l(), b2.cy_() + 1, b2.k() + 1, b2.l() + 1), (cm)new fp(this, ad2));
        return list.size() == 1 ? (l)list.get(0) : null;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (!b4.J.e) {
            return false;
        }
        float f5 = (b3 = b3.b(b)).a(b) == gk.b ? 0.55f : 0.5f;
        k2.a(b4, b2, f.al, bu.e, 0.3f, f5);
        k2.a(b2, b3, 2);
        this.k(k2, b2, b3);
        return true;
    }

    @Override
    protected void g(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.d(b2, this)) {
            int n2;
            int n3 = this.j(k2, b2, b3);
            ap ap2 = k2.q(b2);
            int n4 = n2 = ap2 instanceof d ? ((d)ap2).a() : 0;
            if (n3 != n2 || this.A(b3) != this.e(k2, b2, b3)) {
                if (this.i(k2, b2, b3)) {
                    k2.a(b2, this, 2, -1);
                } else {
                    k2.a(b2, this, 2, 0);
                }
            }
        }
    }

    private void k(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2 = this.j(k2, b2, b3);
        ap ap2 = k2.q(b2);
        int n3 = 0;
        if (ap2 instanceof d) {
            d d2 = (d)ap2;
            n3 = d2.a();
            d2.a(n2);
        }
        if (n3 != n2 || b3.a(b) == gk.a) {
            boolean bl2 = this.e(k2, b2, b3);
            boolean bl3 = this.A(b3);
            if (bl3 && !bl2) {
                k2.a(b2, b3.a(a, Boolean.valueOf(false)), 2);
            } else if (!bl3 && bl2) {
                k2.a(b2, b3.a(a, Boolean.valueOf(true)), 2);
            }
            this.h(k2, b2, b3);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (this.d) {
            k2.a(b2, this.n(b3).a(a, Boolean.valueOf(true)), 4);
        }
        this.k(k2, b2, b3);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        super.b(k2, b2, b3);
        k2.a(b2, this.a(k2, 0));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        super.a(k2, b2, b3);
        k2.r(b2);
        this.h(k2, b2, b3);
    }

    @Override
    public boolean a(b b2, k k2, net.minecraft.u.b.b b3, int n2, int n3) {
        super.a(b2, k2, b3, n2, n3);
        ap ap2 = k2.q(b3);
        return ap2 == null ? false : ap2.c(n2, n3);
    }

    @Override
    public ap a(k k2, int n2) {
        return new d();
    }

    @Override
    public b a(int n2) {
        return this.v().a(j, (Comparable)((Object)ad.b(n2))).a(a, Boolean.valueOf((n2 & 8) > 0)).a(b, (Comparable)((Object)((n2 & 4) > 0 ? gk.b : gk.a)));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(j))).c();
        if (((Boolean)b2.a(a)).booleanValue()) {
            n2 |= 8;
        }
        if (b2.a(b) == gk.b) {
            n2 |= 4;
        }
        return n2;
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
    protected i a() {
        return new i(this, j, b, a);
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, net.minecraft.w.l l2) {
        return this.v().a(j, (Comparable)((Object)l2.cl_().e())).a(a, Boolean.valueOf(false)).a(b, (Comparable)((Object)gk.a));
    }
}

