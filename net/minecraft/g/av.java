/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.g.a.b;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.b.e;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.de;
import net.minecraft.g.dv;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.u.d.l;

public class av
extends de {
    public static final e a = e.a("part", dv.class);
    public static final c b = net.minecraft.g.b.c.b("occupied");
    protected static final a c = new a(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);

    public av() {
        super(h.n);
        this.z(this.O.b().a(a, (Comparable)((Object)dv.b)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        if (b3.a(a) != dv.a && (b3 = k2.n(b2 = b2.a((ad)((Object)b3.a(j))))).c() != this) {
            return true;
        }
        if (k2.q.f() && k2.a(b2) != net.minecraft.a.i.j) {
            Object object;
            if (((Boolean)b3.a(b)).booleanValue()) {
                object = this.c(k2, b2);
                if (object != null) {
                    b4.b(new l("tile.bed.occupied", new Object[0]));
                    return true;
                }
                b3 = b3.a(b, Boolean.valueOf(false));
                k2.a(b2, b3, 4);
            }
            if ((object = b4.a(b2)) == net.minecraft.w.a.h.a) {
                b3 = b3.a(b, Boolean.valueOf(true));
                k2.a(b2, b3, 4);
                return true;
            }
            if (object == net.minecraft.w.a.h.c) {
                b4.b(new l("tile.bed.noSleep", new Object[0]));
            } else if (object == net.minecraft.w.a.h.f) {
                b4.b(new l("tile.bed.notSafe", new Object[0]));
            }
            return true;
        }
        k2.f(b2);
        net.minecraft.u.b.b b5 = b2.a(((ad)((Object)b3.a(j))).e());
        if (k2.n(b5).c() == this) {
            k2.f(b5);
        }
        k2.a(null, (double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5, 5.0f, true, true);
        return true;
    }

    private net.minecraft.w.a.b c(k k2, net.minecraft.u.b.b b2) {
        for (net.minecraft.w.a.b b3 : k2.g) {
            if (!b3.ae() || !b3.F.equals(b2)) continue;
            return b3;
        }
        return null;
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean d(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ad ad2 = (ad)((Object)b2.a(j));
        if (b2.a(a) == dv.a) {
            if (k2.n(b3.a(ad2.e())).c() != this) {
                k2.f(b3);
            }
        } else if (k2.n(b3.a(ad2)).c() != this) {
            k2.f(b3);
            if (!k2.C) {
                this.b(k2, b3, b2, 0);
            }
        }
    }

    @Override
    public cg a(net.minecraft.g.c.b b2, Random random, int n2) {
        return b2.a(a) == dv.a ? null : net.minecraft.a.w.bh;
    }

    @Override
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        return c;
    }

    public static net.minecraft.u.b.b a(k k2, net.minecraft.u.b.b b2, int n2) {
        ad ad2 = (ad)((Object)k2.n(b2).a(j));
        int n3 = b2.cy_();
        int n4 = b2.k();
        int n5 = b2.l();
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n6 = n3 - ad2.h() * i2 - 1;
            int n7 = n5 - ad2.j() * i2 - 1;
            int n8 = n6 + 2;
            int n9 = n7 + 2;
            for (int i3 = n6; i3 <= n8; ++i3) {
                for (int i4 = n7; i4 <= n9; ++i4) {
                    net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(i3, n4, i4);
                    if (!av.b(k2, b3)) continue;
                    if (n2 <= 0) {
                        return b3;
                    }
                    --n2;
                }
            }
        }
        return null;
    }

    protected static boolean b(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).t() && !k2.n(b2).d().a() && !k2.n(b2.b()).d().a();
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, float f2, int n2) {
        if (b3.a(a) == dv.b) {
            super.a(k2, b2, b3, f2, 0);
        }
    }

    @Override
    public b a_(net.minecraft.g.c.b b2) {
        return net.minecraft.g.a.b.b;
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return new cu(net.minecraft.a.w.bh);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.w.a.b b4) {
        net.minecraft.u.b.b b5;
        if (b4.J.d && b3.a(a) == dv.a && k2.n(b5 = b2.a(((ad)((Object)b3.a(j))).e())).c() == this) {
            k2.f(b5);
        }
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        ad ad2 = ad.b(n2);
        return (n2 & 8) > 0 ? this.v().a(a, (Comparable)((Object)dv.a)).a(j, (Comparable)((Object)ad2)).a(b, Boolean.valueOf((n2 & 4) > 0)) : this.v().a(a, (Comparable)((Object)dv.b)).a(j, (Comparable)((Object)ad2));
    }

    @Override
    public net.minecraft.g.c.b b(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        net.minecraft.g.c.b b4;
        if (b2.a(a) == dv.b && (b4 = n2.n(b3.a((ad)((Object)b2.a(j))))).c() == this) {
            b2 = b2.a(b, (Boolean)b4.a(b));
        }
        return b2;
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bq bq2) {
        return b2.a(j, (Comparable)((Object)bq2.a((ad)((Object)b2.a(j)))));
    }

    @Override
    public net.minecraft.g.c.b a(net.minecraft.g.c.b b2, bi bi2) {
        return b2.a(bi2.a((ad)((Object)b2.a(j))));
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        n2 |= ((ad)((Object)b2.a(j))).c();
        if (b2.a(a) == dv.a) {
            n2 |= 8;
            if (((Boolean)b2.a(b)).booleanValue()) {
                n2 |= 4;
            }
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, j, a, b);
    }
}

