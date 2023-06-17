/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.fi;
import net.minecraft.g.fk;
import net.minecraft.g.fo;
import net.minecraft.g.ft;
import net.minecraft.g.gm;
import net.minecraft.g.gp;
import net.minecraft.g.t;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class bh
extends ft
implements fi {
    public static final e a = e.a("variant", gm.class);
    public static final e b = e.a("half", gp.class);
    public static final e c = de.j;

    public bh() {
        super(h.l);
        this.z(this.O.b().a(a, (Comparable)((Object)gm.a)).a(b, (Comparable)((Object)gp.b)).a(c, (Comparable)((Object)ad.c)));
        this.c(0.0f);
        this.a(fk.c);
        this.b("doublePlant");
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return x;
    }

    private gm a(n n2, net.minecraft.u.b.b b2, b b3) {
        if (b3.c() == this) {
            b3 = b3.b(n2, b2);
            return (gm)((Object)b3.a(a));
        }
        return gm.d;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) && k2.c(b2.b());
    }

    @Override
    public boolean b(n n2, net.minecraft.u.b.b b2) {
        b b3 = n2.n(b2);
        if (b3.c() != this) {
            return true;
        }
        gm gm2 = (gm)((Object)b3.b(n2, b2).a(a));
        return gm2 == gm.d || gm2 == gm.c;
    }

    @Override
    protected void b_(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.e(k2, b2, b3)) {
            bh bh2;
            boolean bl2 = b3.a(b) == gp.a;
            net.minecraft.u.b.b b4 = bl2 ? b2 : b2.b();
            net.minecraft.u.b.b b5 = bl2 ? b2.c() : b2;
            bh bh3 = bl2 ? this : k2.n(b4).c();
            cn cn2 = bh2 = bl2 ? k2.n(b5).c() : this;
            if (bh3 == this) {
                k2.a(b4, p.a.v(), 2);
            }
            if (bh2 == this) {
                k2.a(b5, p.a.v(), 3);
                if (!bl2) {
                    this.b(k2, b5, b3, 0);
                }
            }
        }
    }

    @Override
    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (b3.a(b) == gp.a) {
            return k2.n(b2.c()).c() == this;
        }
        b b4 = k2.n(b2.b());
        return b4.c() == this && super.e(k2, b2, b4);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        if (b2.a(b) == gp.a) {
            return null;
        }
        gm gm2 = (gm)((Object)b2.a(a));
        return gm2 == gm.d ? null : (gm2 == gm.c ? (random.nextInt(8) == 0 ? net.minecraft.a.w.P : null) : cg.a(this));
    }

    @Override
    public int k(b b2) {
        return b2.a(b) != gp.a && b2.a(a) != gm.c ? ((gm)((Object)b2.a(a))).b() : 0;
    }

    public void a(k k2, net.minecraft.u.b.b b2, gm gm2, int n2) {
        k2.a(b2, this.v().a(b, (Comparable)((Object)gp.b)).a(a, (Comparable)((Object)gm2)), n2);
        k2.a(b2.b(), this.v().a(b, (Comparable)((Object)gp.a)), n2);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        k2.a(b2.b(), this.v().a(b, (Comparable)((Object)gp.a)), 2);
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (k2.C || cu2 == null || cu2.a() != net.minecraft.a.w.bl || b4.a(b) != gp.b || !this.b(k2, b3, b4, b2)) {
            super.a(k2, b2, b3, b4, ap2, cu2);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        if (b3.a(b) == gp.a) {
            if (k2.n(b2.c()).c() == this) {
                if (b4.J.d) {
                    k2.f(b2.c());
                } else {
                    b b5 = k2.n(b2.c());
                    gm gm2 = (gm)((Object)b5.a(a));
                    if (gm2 != gm.d && gm2 != gm.c) {
                        k2.b(b2.c(), true);
                    } else if (k2.C) {
                        k2.f(b2.c());
                    } else if (b4.bC() != null && b4.bC().a() == net.minecraft.a.w.bl) {
                        this.b(k2, b2, b5, b4);
                        k2.f(b2.c());
                    } else {
                        k2.b(b2.c(), true);
                    }
                }
            }
        } else if (k2.n(b2.b()).c() == this) {
            k2.a(b2.b(), p.a.v(), 2);
        }
        super.a(k2, b2, b3, b4);
    }

    private boolean b(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        gm gm2 = (gm)((Object)b3.a(a));
        if (gm2 != gm.d && gm2 != gm.c) {
            return false;
        }
        b4.a(o.a(this));
        int n2 = (gm2 == gm.c ? t.b : t.c).b();
        bh.a(k2, b2, new cu(p.H, 2, n2));
        return true;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (gm gm2 : gm.values()) {
            list.add(new cu(cg2, 1, gm2.b()));
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this, 1, this.a((n)k2, b2, b3).b());
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        gm gm2 = this.a((n)k2, b2, b3);
        return gm2 != gm.c && gm2 != gm.d;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return true;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        bh.a(k2, b2, new cu(this, 1, this.a((n)k2, b2, b3).b()));
    }

    @Override
    public b a(int n2) {
        return (n2 & 8) > 0 ? this.v().a(b, (Comparable)((Object)gp.a)) : this.v().a(b, (Comparable)((Object)gp.b)).a(a, (Comparable)((Object)gm.a(n2 & 7)));
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        b b4;
        if (b2.a(b) == gp.a && (b4 = n2.n(b3.c())).c() == this) {
            b2 = b2.a(a, (Comparable)((Object)((gm)((Object)b4.a(a)))));
        }
        return b2;
    }

    @Override
    public int b(b b2) {
        return b2.a(b) == gp.a ? 8 | ((ad)((Object)b2.a(c))).c() : ((gm)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, b, a, c);
    }

    @Override
    public fo bS_() {
        return fo.b;
    }
}

