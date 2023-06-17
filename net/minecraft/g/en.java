/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.f.ae;
import net.minecraft.f.ag;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cr;
import net.minecraft.g.hj;
import net.minecraft.g.id;
import net.minecraft.h.aq;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.t.e;
import net.minecraft.t.g;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class en
extends a {
    public static final f a = cr.o;
    public static final c b = net.minecraft.g.b.c.b("triggered");
    public static final net.minecraft.u.c.b c = new net.minecraft.u.c.b(new net.minecraft.t.b());
    protected Random d = new Random();

    protected en() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)));
        this.a(net.minecraft.v.d.d);
    }

    @Override
    public int a(k k2) {
        return 4;
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        super.b(k2, b2, b3);
        this.e(k2, b2, b3);
    }

    private void e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            ad ad2 = (ad)((Object)b3.a(a));
            boolean bl2 = k2.n(b2.d()).e();
            boolean bl3 = k2.n(b2.e()).e();
            if (ad2 == ad.c && bl2 && !bl3) {
                ad2 = ad.d;
            } else if (ad2 == ad.d && bl3 && !bl2) {
                ad2 = ad.c;
            } else {
                boolean bl4 = k2.n(b2.f()).e();
                boolean bl5 = k2.n(b2.g()).e();
                if (ad2 == ad.e && bl4 && !bl5) {
                    ad2 = ad.f;
                } else if (ad2 == ad.f && bl5 && !bl4) {
                    ad2 = ad.e;
                }
            }
            k2.a(b2, b3.a(a, (Comparable)((Object)ad2)).a(b, Boolean.valueOf(false)), 2);
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof ae) {
            b4.a((ae)ap2);
            if (ap2 instanceof ag) {
                b4.a(o.Q);
            } else {
                b4.a(o.S);
            }
        }
        return true;
    }

    protected void b(k k2, net.minecraft.u.b.b b2) {
        hj hj2 = new hj(k2, b2);
        ae ae2 = (ae)hj2.g();
        if (ae2 != null) {
            int n2 = ae2.k();
            if (n2 < 0) {
                k2.b(1001, b2, 0);
            } else {
                cu cu2 = ae2.a(n2);
                net.minecraft.t.i i2 = this.a(cu2);
                if (i2 != net.minecraft.t.i.b) {
                    cu cu3 = i2.a_(hj2, cu2);
                    ae2.a(n2, cu3.b <= 0 ? null : cu3);
                }
            }
        }
    }

    protected net.minecraft.t.i a(cu cu2) {
        return (net.minecraft.t.i)c.a(cu2 == null ? null : cu2.a());
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        boolean bl2 = k2.x(b3) || k2.x(b3.b());
        boolean bl3 = (Boolean)b2.a(b);
        if (bl2 && !bl3) {
            k2.a(b3, (cn)this, this.a(k2));
            k2.a(b3, b2.a(b, Boolean.valueOf(true)), 4);
        } else if (!bl2 && bl3) {
            k2.a(b3, b2.a(b, Boolean.valueOf(false)), 4);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C) {
            this.b(k2, b2);
        }
    }

    @Override
    public ap a(k k2, int n2) {
        return new ae();
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)id.a(b2, l2))).a(b, Boolean.valueOf(false));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        k2.a(b2, b3.a(a, (Comparable)((Object)id.a(b2, l2))), 2);
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof ae) {
            ((ae)ap2).a(cu2.q());
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof ae) {
            net.minecraft.h.a.a(k2, b2, (y)((ae)ap2));
            k2.f(b2, this);
        }
        super.a(k2, b2, b3);
    }

    public static net.minecraft.t.c a(g g2) {
        ad ad2 = (ad)((Object)g2.f().a(a));
        double d2 = g2.b() + 0.7 * (double)ad2.h();
        double d3 = g2.c() + 0.7 * (double)ad2.i();
        double d4 = g2.d() + 0.7 * (double)ad2.j();
        return new e(d2, d3, d4);
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return aq.a(k2.q(b3));
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ad.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(a))).b();
        if (((Boolean)b2.a(b)).booleanValue()) {
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

