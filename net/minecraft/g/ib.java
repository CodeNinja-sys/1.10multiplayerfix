/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.aq;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.al;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.ag;
import net.minecraft.u.ah;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class ib
extends a {
    public static final f a = de.j;
    protected static final net.minecraft.u.b.a b = new net.minecraft.u.b.a(0.0625, 0.0, 0.0, 0.9375, 0.875, 0.9375);
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.0625, 0.0, 0.0625, 0.9375, 0.875, 1.0);
    protected static final net.minecraft.u.b.a d = new net.minecraft.u.b.a(0.0, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
    protected static final net.minecraft.u.b.a e = new net.minecraft.u.b.a(0.0625, 0.0, 0.0625, 1.0, 0.875, 0.9375);
    protected static final net.minecraft.u.b.a f = new net.minecraft.u.b.a(0.0625, 0.0, 0.0625, 0.9375, 0.875, 0.9375);
    public final aq g;

    protected ib(aq aq2) {
        super(h.d);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)));
        this.g = aq2;
        this.a(aq2 == aq.b ? net.minecraft.v.d.d : net.minecraft.v.d.c);
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
    public ac a(b b2) {
        return ac.c;
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return n2.n(b3.d()).c() == this ? b : (n2.n(b3.e()).c() == this ? c : (n2.n(b3.f()).c() == this ? d : (n2.n(b3.g()).c() == this ? e : f)));
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
        for (ad ad2 : ag.a) {
            net.minecraft.u.b.b b4 = b2.a(ad2);
            b b5 = k2.n(b4);
            if (b5.c() != this) continue;
            this.e(k2, b4, b5);
        }
    }

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)l2.cl_()));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        boolean bl2;
        ad ad2 = ad.b(net.minecraft.u.b.n.c((double)(l2.ba * 4.0f / 360.0f) + 0.5) & 3).e();
        b3 = b3.a(a, (Comparable)((Object)ad2));
        net.minecraft.u.b.b b4 = b2.d();
        net.minecraft.u.b.b b5 = b2.e();
        net.minecraft.u.b.b b6 = b2.f();
        net.minecraft.u.b.b b7 = b2.g();
        boolean bl3 = this == k2.n(b4).c();
        boolean bl4 = this == k2.n(b5).c();
        boolean bl5 = this == k2.n(b6).c();
        boolean bl6 = bl2 = this == k2.n(b7).c();
        if (!(bl3 || bl4 || bl5 || bl2)) {
            k2.a(b2, b3, 3);
        } else if (ad2.l() != ae.a || !bl3 && !bl4) {
            if (ad2.l() == ae.c && (bl5 || bl2)) {
                if (bl5) {
                    k2.a(b6, b3, 3);
                } else {
                    k2.a(b7, b3, 3);
                }
                k2.a(b2, b3, 3);
            }
        } else {
            if (bl3) {
                k2.a(b4, b3, 3);
            } else {
                k2.a(b5, b3, 3);
            }
            k2.a(b2, b3, 3);
        }
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof u) {
            ((u)ap2).a(cu2.q());
        }
    }

    public b e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (k2.C) {
            return b3;
        }
        b b4 = k2.n(b2.d());
        b b5 = k2.n(b2.e());
        b b6 = k2.n(b2.f());
        b b7 = k2.n(b2.g());
        ad ad2 = (ad)((Object)b3.a(a));
        if (b4.c() != this && b5.c() != this) {
            boolean bl2 = b4.e();
            boolean bl3 = b5.e();
            if (b6.c() == this || b7.c() == this) {
                net.minecraft.u.b.b b8 = b6.c() == this ? b2.f() : b2.g();
                b b9 = k2.n(b8.d());
                b b10 = k2.n(b8.e());
                ad2 = ad.d;
                ad ad3 = b6.c() == this ? (ad)((Object)b6.a(a)) : (ad)((Object)b7.a(a));
                if (ad3 == ad.c) {
                    ad2 = ad.c;
                }
                if ((bl2 || b9.e()) && !bl3 && !b10.e()) {
                    ad2 = ad.d;
                }
                if ((bl3 || b10.e()) && !bl2 && !b9.e()) {
                    ad2 = ad.c;
                }
            }
        } else {
            net.minecraft.u.b.b b11 = b4.c() == this ? b2.d() : b2.e();
            b b12 = k2.n(b11.f());
            b b13 = k2.n(b11.g());
            ad2 = ad.f;
            ad ad4 = b4.c() == this ? (ad)((Object)b4.a(a)) : (ad)((Object)b5.a(a));
            if (ad4 == ad.e) {
                ad2 = ad.e;
            }
            if ((b6.e() || b12.e()) && !b7.e() && !b13.e()) {
                ad2 = ad.f;
            }
            if ((b7.e() || b13.e()) && !b6.e() && !b12.e()) {
                ad2 = ad.e;
            }
        }
        b3 = b3.a(a, (Comparable)((Object)ad2));
        k2.a(b2, b3, 3);
        return b3;
    }

    public b f(k k2, net.minecraft.u.b.b b2, b b3) {
        ad ad22;
        ad ad3 = null;
        for (ad ad22 : ag.a) {
            b b4 = k2.n(b2.a(ad22));
            if (b4.c() == this) {
                return b3;
            }
            if (!b4.e()) continue;
            if (ad3 != null) {
                ad3 = null;
                break;
            }
            ad3 = ad22;
        }
        if (ad3 != null) {
            return b3.a(a, (Comparable)((Object)ad3.e()));
        }
        ad22 = (ad)((Object)b3.a(a));
        if (k2.n(b2.a(ad22)).e()) {
            ad22 = ad22.e();
        }
        if (k2.n(b2.a(ad22)).e()) {
            ad22 = ad22.f();
        }
        if (k2.n(b2.a(ad22)).e()) {
            ad22 = ad22.e();
        }
        return b3.a(a, (Comparable)((Object)ad22));
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        int n2 = 0;
        net.minecraft.u.b.b b3 = b2.f();
        net.minecraft.u.b.b b4 = b2.g();
        net.minecraft.u.b.b b5 = b2.d();
        net.minecraft.u.b.b b6 = b2.e();
        if (k2.n(b3).c() == this) {
            if (this.d(k2, b3)) {
                return false;
            }
            ++n2;
        }
        if (k2.n(b4).c() == this) {
            if (this.d(k2, b4)) {
                return false;
            }
            ++n2;
        }
        if (k2.n(b5).c() == this) {
            if (this.d(k2, b5)) {
                return false;
            }
            ++n2;
        }
        if (k2.n(b6).c() == this) {
            if (this.d(k2, b6)) {
                return false;
            }
            ++n2;
        }
        return n2 <= 1;
    }

    private boolean d(k k2, net.minecraft.u.b.b b2) {
        if (k2.n(b2).c() != this) {
            return false;
        }
        for (ad ad2 : ag.a) {
            if (k2.n(b2.a(ad2)).c() != this) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        super.a(b2, k2, b3, cn2);
        ap ap2 = k2.q(b3);
        if (ap2 instanceof u) {
            ap2.bN_();
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof y) {
            net.minecraft.h.a.a(k2, b2, (y)((Object)ap2));
            k2.f(b2, this);
        }
        super.a(k2, b2, b3);
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        al al2 = this.c(k2, b2);
        if (al2 != null) {
            b4.a(al2);
            if (this.g == aq.a) {
                b4.a(o.ac);
            } else if (this.g == aq.b) {
                b4.a(o.W);
            }
        }
        return true;
    }

    public al c(k k2, net.minecraft.u.b.b b2) {
        return this.a(k2, b2, false);
    }

    public al a(k k2, net.minecraft.u.b.b b2, boolean bl2) {
        ap ap2 = k2.q(b2);
        if (!(ap2 instanceof u)) {
            return null;
        }
        al al2 = (u)ap2;
        if (!bl2 && this.e(k2, b2)) {
            return null;
        }
        for (ad ad2 : ag.a) {
            net.minecraft.u.b.b b3 = b2.a(ad2);
            cn cn2 = k2.n(b3).c();
            if (cn2 != this) continue;
            if (this.e(k2, b3)) {
                return null;
            }
            ap ap3 = k2.q(b3);
            if (!(ap3 instanceof u)) continue;
            al2 = ad2 != ad.e && ad2 != ad.c ? new net.minecraft.h.f("container.chestDouble", al2, (u)ap3) : new net.minecraft.h.f("container.chestDouble", (u)ap3, al2);
        }
        return al2;
    }

    @Override
    public ap a(k k2, int n2) {
        return new u();
    }

    @Override
    public boolean f(b b2) {
        return this.g == aq.b;
    }

    @Override
    public int b(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        if (!b2.p()) {
            return 0;
        }
        int n3 = 0;
        ap ap2 = n2.q(b3);
        if (ap2 instanceof u) {
            n3 = ((u)ap2).j;
        }
        return net.minecraft.u.b.n.a(n3, 0, 15);
    }

    @Override
    public int c(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2 == ad.b ? b2.a(n2, b3, ad2) : 0;
    }

    private boolean e(k k2, net.minecraft.u.b.b b2) {
        return this.f(k2, b2) || this.g(k2, b2);
    }

    private boolean f(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.b()).o();
    }

    private boolean g(k k2, net.minecraft.u.b.b b2) {
        for (net.minecraft.w.n n2 : k2.a(net.minecraft.w.h.u.class, new net.minecraft.u.b.a(b2.cy_(), b2.k() + 1, b2.l(), b2.cy_() + 1, b2.k() + 2, b2.l() + 1))) {
            net.minecraft.w.h.u u2 = (net.minecraft.w.h.u)n2;
            if (!u2.E()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return net.minecraft.h.aq.b(this.c(k2, b3));
    }

    @Override
    public b a(int n2) {
        ad ad2 = ad.a(n2);
        if (ad2.l() == ae.b) {
            ad2 = ad.c;
        }
        return this.v().a(a, (Comparable)((Object)ad2));
    }

    @Override
    public int b(b b2) {
        return ((ad)((Object)b2.a(a))).b();
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
        return new i(this, a);
    }
}

