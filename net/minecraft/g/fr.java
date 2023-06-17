/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.f.n;
import net.minecraft.f.q;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.f;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cr;
import net.minecraft.g.id;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.g;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.bw;
import net.minecraft.w.l;

public class fr
extends a {
    public static final f a = cr.o;
    public static final c b = c.b("conditional");

    public fr(e e2) {
        super(h.f, e2);
        this.z(this.O.b().a(a, (Comparable)((Object)ad.c)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public ap a(k k2, int n2) {
        net.minecraft.f.h h2 = new net.minecraft.f.h();
        h2.b(this == p.dd);
        return h2;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b3)) instanceof net.minecraft.f.h) {
            net.minecraft.f.h h2 = (net.minecraft.f.h)ap2;
            boolean bl2 = k2.x(b3);
            boolean bl3 = h2.f();
            boolean bl4 = h2.g();
            if (bl2 && !bl3) {
                h2.a(true);
                if (h2.j() != n.a && !bl4) {
                    boolean bl5 = !h2.k() || this.e(k2, b3, b2);
                    h2.c(bl5);
                    k2.a(b3, (cn)this, this.a(k2));
                    if (bl5) {
                        this.c(k2, b3);
                    }
                }
            } else if (!bl2 && bl3) {
                h2.a(false);
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        ap ap2;
        if (!k2.C && (ap2 = k2.q(b2)) instanceof net.minecraft.f.h) {
            net.minecraft.f.h h2 = (net.minecraft.f.h)ap2;
            q q2 = h2.b();
            boolean bl2 = !bw.b(q2.c());
            n n2 = h2.j();
            boolean bl3 = !h2.k() || this.e(k2, b2, b3);
            boolean bl4 = h2.h();
            boolean bl5 = false;
            if (n2 != n.a && bl4 && bl2) {
                q2.a(k2);
                bl5 = true;
            }
            if (h2.f() || h2.g()) {
                if (n2 == n.a && bl3 && bl2) {
                    q2.a(k2);
                    bl5 = true;
                }
                if (n2 == n.b) {
                    k2.a(b2, (cn)this, this.a(k2));
                    if (bl3) {
                        this.c(k2, b2);
                    }
                }
            }
            if (!bl5) {
                q2.a(0);
            }
            h2.c(bl3);
            k2.f(b2, this);
        }
    }

    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        ad ad2 = (ad)((Object)b3.a(a));
        ap ap2 = k2.q(b2.a(ad2.e()));
        return ap2 instanceof net.minecraft.f.h && ((net.minecraft.f.h)ap2).b().a() > 0;
    }

    @Override
    public int a(k k2) {
        return 1;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof net.minecraft.f.h && b4.aN()) {
            b4.a((net.minecraft.f.h)ap2);
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
        ap ap2 = k2.q(b3);
        return ap2 instanceof net.minecraft.f.h ? ((net.minecraft.f.h)ap2).b().a() : 0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof net.minecraft.f.h) {
            net.minecraft.f.h h2 = (net.minecraft.f.h)ap2;
            q q2 = h2.b();
            if (cu2.s()) {
                q2.b(cu2.q());
            }
            if (!k2.C) {
                net.minecraft.e.e e2 = cu2.o();
                if (e2 == null || !e2.b("BlockEntityTag", 10)) {
                    q2.a(k2.G().b("sendCommandFeedback"));
                    h2.b(this == p.dd);
                }
                if (h2.j() == n.a) {
                    boolean bl2 = k2.x(b2);
                    h2.a(bl2);
                }
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ad.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) != 0));
    }

    @Override
    public int b(b b2) {
        return ((ad)((Object)b2.a(a))).b() | ((Boolean)b2.a(b) != false ? 8 : 0);
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

    @Override
    public b a(k k2, net.minecraft.u.b.b b2, ad ad2, float f2, float f3, float f4, int n2, l l2) {
        return this.v().a(a, (Comparable)((Object)id.a(b2, l2))).a(b, Boolean.valueOf(false));
    }

    public void c(k k2, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        if (b3.c() == p.bX || b3.c() == p.dc) {
            g g2 = new g(b2);
            g2.b((ad)((Object)b3.a(a)));
            ap ap2 = k2.q(g2);
            while (ap2 instanceof net.minecraft.f.h) {
                b b4;
                cn cn2;
                net.minecraft.f.h h2 = (net.minecraft.f.h)ap2;
                if (h2.j() != n.a || (cn2 = (b4 = k2.n(g2)).c()) != p.dd || k2.e((net.minecraft.u.b.b)g2, cn2)) break;
                k2.a(new net.minecraft.u.b.b(g2), cn2, this.a(k2));
                g2.b((ad)((Object)b4.a(a)));
                ap2 = k2.q(g2);
            }
        }
    }
}

