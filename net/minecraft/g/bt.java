/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.b.cm;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.c;
import net.minecraft.g.c.a.f;
import net.minecraft.g.c.a.h;
import net.minecraft.g.c.a.i;
import net.minecraft.g.c.b;
import net.minecraft.g.de;
import net.minecraft.g.fs;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.aj;
import net.minecraft.u.b.t;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.e.bb;
import net.minecraft.w.e.bj;
import net.minecraft.w.l;

public class bt
extends de {
    private h a;
    private h b;
    private h c;
    private h d;
    private static final cm e = new fs();

    protected bt() {
        super(net.minecraft.g.a.h.C, net.minecraft.g.a.e.q);
        this.z(this.O.b().a(j, (Comparable)((Object)ad.c)));
        this.b(true);
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        super.b(k2, b2, b3);
        this.d(k2, b2);
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        return this.h().a(k2, b2) != null || this.j().a(k2, b2) != null;
    }

    private void d(k k2, net.minecraft.u.b.b b2) {
        block9: {
            int n2;
            f f2;
            block8: {
                int n3;
                Object object;
                f2 = this.i().a(k2, b2);
                if (f2 == null) break block8;
                for (int i2 = 0; i2 < this.i().b(); ++i2) {
                    object = f2.a(0, i2, 0);
                    k2.a(((a)object).c(), p.a.v(), 2);
                }
                bb bb2 = new bb(k2);
                object = f2.a(0, 2, 0).c();
                bb2.b((double)((t)object).cy_() + 0.5, (double)((t)object).k() + 0.05, (double)((t)object).l() + 0.5, 0.0f, 0.0f);
                k2.a(bb2);
                for (n3 = 0; n3 < 120; ++n3) {
                    k2.a(aj.G, (double)((t)object).cy_() + k2.p.nextDouble(), (double)((t)object).k() + k2.p.nextDouble() * 2.5, (double)((t)object).l() + k2.p.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                }
                for (n3 = 0; n3 < this.i().b(); ++n3) {
                    a a2 = f2.a(0, n3, 0);
                    k2.a(a2.c(), p.a);
                }
                break block9;
            }
            f2 = this.k().a(k2, b2);
            if (f2 == null) break block9;
            for (int i3 = 0; i3 < this.k().c(); ++i3) {
                for (int i4 = 0; i4 < this.k().b(); ++i4) {
                    k2.a(f2.a(i3, i4, 0).c(), p.a.v(), 2);
                }
            }
            net.minecraft.u.b.b b3 = f2.a(1, 2, 0).c();
            bj bj2 = new bj(k2);
            bj2.c(true);
            bj2.b((double)b3.cy_() + 0.5, (double)b3.k() + 0.05, (double)b3.l() + 0.5, 0.0f, 0.0f);
            k2.a(bj2);
            for (n2 = 0; n2 < 120; ++n2) {
                k2.a(aj.F, (double)b3.cy_() + k2.p.nextDouble(), (double)b3.k() + k2.p.nextDouble() * 3.9, (double)b3.l() + k2.p.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (n2 = 0; n2 < this.k().c(); ++n2) {
                for (int i5 = 0; i5 < this.k().b(); ++i5) {
                    a a3 = f2.a(n2, i5, 0);
                    k2.a(a3.c(), p.a);
                }
            }
        }
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n((net.minecraft.u.b.b)b2).c().L.i() && k2.n(b2.c()).t();
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
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(j, (Comparable)((Object)l2.cl_().e()));
    }

    @Override
    public b a(int n2) {
        return this.v().a(j, (Comparable)((Object)ad.b(n2)));
    }

    @Override
    public int b(b b2) {
        return ((ad)((Object)b2.a(j))).c();
    }

    @Override
    protected net.minecraft.g.c.i a() {
        return new net.minecraft.g.c.i(this, j);
    }

    protected h h() {
        if (this.a == null) {
            this.a = net.minecraft.g.c.a.c.a().a(" ", "#", "#").a('#', net.minecraft.g.c.a.a(i.a(p.aJ))).b();
        }
        return this.a;
    }

    protected h i() {
        if (this.b == null) {
            this.b = net.minecraft.g.c.a.c.a().a("^", "#", "#").a('^', net.minecraft.g.c.a.a(e)).a('#', net.minecraft.g.c.a.a(i.a(p.aJ))).b();
        }
        return this.b;
    }

    protected h j() {
        if (this.c == null) {
            this.c = net.minecraft.g.c.a.c.a().a("~ ~", "###", "~#~").a('#', net.minecraft.g.c.a.a(i.a(p.S))).a('~', net.minecraft.g.c.a.a(net.minecraft.g.c.a.e.a(net.minecraft.g.a.h.a))).b();
        }
        return this.c;
    }

    protected h k() {
        if (this.d == null) {
            this.d = net.minecraft.g.c.a.c.a().a("~^~", "###", "~#~").a('^', net.minecraft.g.c.a.a(e)).a('#', net.minecraft.g.c.a.a(i.a(p.S))).a('~', net.minecraft.g.c.a.a(net.minecraft.g.c.a.e.a(net.minecraft.g.a.h.a))).b();
        }
        return this.d;
    }
}

