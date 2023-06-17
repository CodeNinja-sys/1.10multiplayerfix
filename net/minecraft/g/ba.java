/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.o;
import net.minecraft.a.w;
import net.minecraft.d.m;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.ao;
import net.minecraft.m.br;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;

public class ba
extends cn {
    public static final g a = g.a("level", 0, 3);
    protected static final a b = new a(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0);
    protected static final a c = new a(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
    protected static final a d = new a(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
    protected static final a e = new a(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final a f = new a(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);

    public ba() {
        super(h.f, net.minecraft.g.a.e.m);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        ba.a(b3, a2, list, b);
        ba.a(b3, a2, list, f);
        ba.a(b3, a2, list, c);
        ba.a(b3, a2, list, e);
        ba.a(b3, a2, list, d);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return x;
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
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.n n2) {
        int n3 = (Integer)b3.a(a);
        float f2 = (float)b2.k() + (6.0f + (float)(3 * n3)) / 16.0f;
        if (!k2.C && n2.cy() && n3 > 0 && n2.cT().b <= (double)f2) {
            n2.ce();
            this.a(k2, b2, b3, n3 - 1);
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        Object object;
        if (cu2 == null) {
            return true;
        }
        int n2 = (Integer)b3.a(a);
        cg cg2 = cu2.a();
        if (cg2 == net.minecraft.a.w.az) {
            if (n2 < 3 && !k2.C) {
                if (!b4.J.d) {
                    b4.a(ah2, new cu(net.minecraft.a.w.ay));
                }
                b4.a(net.minecraft.r.o.K);
                this.a(k2, b2, b3, 3);
            }
            return true;
        }
        if (cg2 == net.minecraft.a.w.ay) {
            if (n2 == 3 && !k2.C) {
                if (!b4.J.d) {
                    --cu2.b;
                    if (cu2.b == 0) {
                        b4.a(ah2, new cu(net.minecraft.a.w.az));
                    } else if (!b4.q.c(new cu(net.minecraft.a.w.az))) {
                        b4.a(new cu(net.minecraft.a.w.az), false);
                    }
                }
                b4.a(net.minecraft.r.o.L);
                this.a(k2, b2, b3, 0);
            }
            return true;
        }
        if (cg2 == net.minecraft.a.w.bJ) {
            if (n2 > 0 && !k2.C) {
                if (!b4.J.d) {
                    cu cu3 = m.a(new cu(net.minecraft.a.w.bG), o.b);
                    b4.a(net.minecraft.r.o.L);
                    if (--cu2.b == 0) {
                        b4.a(ah2, cu3);
                    } else if (!b4.q.c(cu3)) {
                        b4.a(cu3, false);
                    } else if (b4 instanceof net.minecraft.w.a.g) {
                        ((net.minecraft.w.a.g)b4).a(b4.r);
                    }
                }
                this.a(k2, b2, b3, n2 - 1);
            }
            return true;
        }
        if (n2 > 0 && cg2 instanceof dn && ((dn)(object = (dn)cg2)).g() == br.a && ((dn)object).h(cu2) && !k2.C) {
            ((dn)object).k(cu2);
            this.a(k2, b2, b3, n2 - 1);
            b4.a(net.minecraft.r.o.M);
            return true;
        }
        if (n2 > 0 && cg2 instanceof ao) {
            if (net.minecraft.f.w.c(cu2) > 0 && !k2.C) {
                object = cu2.j();
                ((cu)object).b = 1;
                net.minecraft.f.w.d((cu)object);
                b4.a(net.minecraft.r.o.N);
                if (!b4.J.d) {
                    --cu2.b;
                }
                if (cu2.b == 0) {
                    b4.a(ah2, (cu)object);
                } else if (!b4.q.c((cu)object)) {
                    b4.a((cu)object, false);
                } else if (b4 instanceof net.minecraft.w.a.g) {
                    ((net.minecraft.w.a.g)b4).a(b4.r);
                }
                if (!b4.J.d) {
                    this.a(k2, b2, b3, n2 - 1);
                }
            }
            return true;
        }
        return false;
    }

    public void a(k k2, net.minecraft.u.b.b b2, b b3, int n2) {
        k2.a(b2, b3.a(a, Integer.valueOf(net.minecraft.u.b.n.a(n2, 0, 3))), 2);
        k2.f(b2, this);
    }

    @Override
    public void b_(k k2, net.minecraft.u.b.b b2) {
        if (k2.p.nextInt(20) == 1) {
            b b3;
            float f2 = k2.a(b2).c(b2);
            if (k2.k().a(f2, b2.k()) >= 0.15f && (Integer)(b3 = k2.n(b2)).a(a) < 3) {
                k2.a(b2, b3.b(a), 2);
            }
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.bQ;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.bQ);
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return (Integer)b2.a(a);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return true;
    }
}

