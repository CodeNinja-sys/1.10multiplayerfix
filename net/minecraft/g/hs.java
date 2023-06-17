/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.b.cm;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.u;
import net.minecraft.f.ap;
import net.minecraft.g.b.c;
import net.minecraft.g.bk;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.e;
import net.minecraft.g.c.a.f;
import net.minecraft.g.c.a.h;
import net.minecraft.g.c.a.i;
import net.minecraft.g.c.b;
import net.minecraft.g.cr;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.l;
import net.minecraft.q.n;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.aj;
import net.minecraft.u.b.t;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class hs
extends net.minecraft.g.a {
    public static final net.minecraft.g.b.f a = cr.o;
    public static final c b = net.minecraft.g.b.c.b("nodrop");
    private static final cm h = new bk();
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.25, 0.0, 0.25, 0.75, 0.5, 0.75);
    protected static final net.minecraft.u.b.a d = new net.minecraft.u.b.a(0.25, 0.25, 0.5, 0.75, 0.75, 1.0);
    protected static final net.minecraft.u.b.a e = new net.minecraft.u.b.a(0.25, 0.25, 0.0, 0.75, 0.75, 0.5);
    protected static final net.minecraft.u.b.a f = new net.minecraft.u.b.a(0.5, 0.25, 0.25, 1.0, 0.75, 0.75);
    protected static final net.minecraft.u.b.a g = new net.minecraft.u.b.a(0.0, 0.25, 0.25, 0.5, 0.75, 0.75);
    private h i;
    private h j;

    protected hs() {
        super(net.minecraft.g.a.h.q);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a("tile.skull.skeleton.name");
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
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        switch ((ad)((Object)b2.a(a))) {
            default: {
                return c;
            }
            case c: {
                return d;
            }
            case d: {
                return e;
            }
            case e: {
                return f;
            }
            case f: 
        }
        return g;
    }

    @Override
    public b a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, net.minecraft.w.l l2) {
        return this.v().a(a, (Comparable)((Object)l2.cl_())).a(b, Boolean.valueOf(false));
    }

    @Override
    public ap a(net.minecraft.q.k k2, int n2) {
        return new net.minecraft.f.f();
    }

    @Override
    public cu c(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3) {
        int n2 = 0;
        ap ap2 = k2.q(b2);
        if (ap2 instanceof net.minecraft.f.f) {
            n2 = ((net.minecraft.f.f)ap2).e();
        }
        return new cu(net.minecraft.a.w.ch, 1, n2);
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        if (b4.J.d) {
            b3 = b3.a(b, Boolean.valueOf(true));
            k2.a(b2, b3, 4);
        }
        super.a(k2, b2, b3, b4);
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            ap ap2;
            if (!((Boolean)b3.a(b)).booleanValue() && (ap2 = k2.q(b2)) instanceof net.minecraft.f.f) {
                net.minecraft.f.f f2 = (net.minecraft.f.f)ap2;
                cu cu2 = this.c(k2, b2, b3);
                if (f2.e() == 3 && f2.b() != null) {
                    cu2.d(new net.minecraft.e.e());
                    net.minecraft.e.e e2 = new net.minecraft.e.e();
                    u.a(e2, f2.b());
                    cu2.o().a("SkullOwner", e2);
                }
                hs.a(k2, b2, cu2);
            }
            super.a(k2, b2, b3);
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.ch;
    }

    public boolean b(net.minecraft.q.k k2, net.minecraft.u.b.b b2, cu cu2) {
        return cu2.h() == 1 && b2.k() >= 2 && k2.R() != l.a && !k2.C ? this.h().a(k2, b2) != null : false;
    }

    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, net.minecraft.f.f f2) {
        h h2;
        f f3;
        if (f2.e() == 1 && b2.k() >= 2 && k2.R() != l.a && !k2.C && (f3 = (h2 = this.i()).a(k2, b2)) != null) {
            int n2;
            Object object;
            Object object2;
            int n3;
            for (n3 = 0; n3 < 3; ++n3) {
                object2 = f3.a(n3, 0, 0);
                k2.a(((a)object2).c(), ((a)object2).a().a(b, Boolean.valueOf(true)), 2);
            }
            for (n3 = 0; n3 < h2.c(); ++n3) {
                for (int i2 = 0; i2 < h2.b(); ++i2) {
                    object = f3.a(n3, i2, 0);
                    k2.a(((a)object).c(), p.a.v(), 2);
                }
            }
            net.minecraft.u.b.b b3 = f3.a(1, 0, 0).c();
            object2 = new net.minecraft.w.d.e(k2);
            object = f3.a(1, 2, 0).c();
            ((net.minecraft.w.n)object2).b((double)((t)object).cy_() + 0.5, (double)((t)object).k() + 0.55, (double)((t)object).l() + 0.5, f3.b().l() == ae.a ? 0.0f : 90.0f, 0.0f);
            ((net.minecraft.w.d.e)object2).ak = f3.b().l() == ae.a ? 0.0f : 90.0f;
            ((net.minecraft.w.d.e)object2).c();
            for (net.minecraft.w.a.b b4 : k2.a(net.minecraft.w.a.b.class, ((net.minecraft.w.n)object2).cT().b(50.0))) {
                b4.a((k)net.minecraft.r.j.I);
            }
            k2.a((net.minecraft.w.n)object2);
            for (n2 = 0; n2 < 120; ++n2) {
                k2.a(aj.F, (double)b3.cy_() + k2.p.nextDouble(), (double)(b3.k() - 2) + k2.p.nextDouble() * 3.9, (double)b3.l() + k2.p.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (n2 = 0; n2 < h2.c(); ++n2) {
                for (int i3 = 0; i3 < h2.b(); ++i3) {
                    a a2 = f3.a(n2, i3, 0);
                    k2.a(a2.c(), p.a);
                }
            }
        }
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
    protected net.minecraft.g.c.i a() {
        return new net.minecraft.g.c.i(this, a, b);
    }

    protected h h() {
        if (this.i == null) {
            this.i = net.minecraft.g.c.a.c.a().a("   ", "###", "~#~").a('#', net.minecraft.g.c.a.a(net.minecraft.g.c.a.i.a(p.aW))).a('~', net.minecraft.g.c.a.a(net.minecraft.g.c.a.e.a(net.minecraft.g.a.h.a))).b();
        }
        return this.i;
    }

    protected h i() {
        if (this.j == null) {
            this.j = net.minecraft.g.c.a.c.a().a("^^^", "###", "~#~").a('#', net.minecraft.g.c.a.a(net.minecraft.g.c.a.i.a(p.aW))).a('^', h).a('~', net.minecraft.g.c.a.a(net.minecraft.g.c.a.e.a(net.minecraft.g.a.h.a))).b();
        }
        return this.j;
    }
}

