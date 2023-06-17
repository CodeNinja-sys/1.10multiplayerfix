/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import com.a.a.d.aad;
import java.util.EnumSet;
import java.util.HashSet;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ct;
import net.minecraft.g.dj;
import net.minecraft.g.ey;
import net.minecraft.g.fm;
import net.minecraft.g.ga;
import net.minecraft.i.d;
import net.minecraft.i.g;
import net.minecraft.i.h;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;

public class f
extends d {
    private float j;

    @Override
    public void a(n n2, net.minecraft.w.f f2) {
        super.a(n2, f2);
        this.j = f2.a(net.minecraft.i.h.g);
    }

    @Override
    public void a() {
        this.b.a(net.minecraft.i.h.g, this.j);
        super.a();
    }

    @Override
    public g b() {
        Object object;
        net.minecraft.u.b.b b2;
        int n2;
        if (this.e() && this.b.cm()) {
            n2 = (int)this.b.cT().b;
            b2 = new net.minecraft.u.b.g(net.minecraft.u.b.n.c(this.b.aU), n2, net.minecraft.u.b.n.c(this.b.aW));
            object = this.a.n(b2).c();
            while (object == p.i || object == p.j) {
                ((net.minecraft.u.b.g)b2).b(net.minecraft.u.b.n.c(this.b.aU), ++n2, net.minecraft.u.b.n.c(this.b.aW));
                object = this.a.n(b2).c();
            }
        } else if (this.b.be) {
            n2 = net.minecraft.u.b.n.c(this.b.cT().b + 0.5);
        } else {
            b2 = new net.minecraft.u.b.b(this.b);
            while ((this.a.n(b2).d() == net.minecraft.g.a.h.a || this.a.n(b2).c().a(this.a, b2)) && b2.k() > 0) {
                b2 = b2.c();
            }
            n2 = b2.b().k();
        }
        b2 = new net.minecraft.u.b.b(this.b);
        object = this.a(this.b, b2.cy_(), n2, b2.l());
        if (this.b.a((h)((Object)object)) < 0.0f) {
            HashSet hashSet = aad.a();
            hashSet.add(new net.minecraft.u.b.b(this.b.cT().a, (double)n2, this.b.cT().c));
            hashSet.add(new net.minecraft.u.b.b(this.b.cT().a, (double)n2, this.b.cT().f));
            hashSet.add(new net.minecraft.u.b.b(this.b.cT().d, (double)n2, this.b.cT().c));
            hashSet.add(new net.minecraft.u.b.b(this.b.cT().d, (double)n2, this.b.cT().f));
            for (net.minecraft.u.b.b b3 : hashSet) {
                h h2 = this.a(this.b, b3);
                if (!(this.b.a(h2) >= 0.0f)) continue;
                return this.a(b3.cy_(), b3.k(), b3.l());
            }
        }
        return this.a(b2.cy_(), n2, b2.l());
    }

    @Override
    public g a(double d2, double d3, double d4) {
        return this.a(net.minecraft.u.b.n.c(d2 - (double)(this.b.bl / 2.0f)), net.minecraft.u.b.n.c(d3), net.minecraft.u.b.n.c(d4 - (double)(this.b.bl / 2.0f)));
    }

    @Override
    public int a(g[] arrg, g g2, g g3, float f2) {
        g g4;
        boolean bl2;
        int n2 = 0;
        int n3 = 0;
        h h2 = this.a(this.b, g2.a, g2.b + 1, g2.c);
        if (this.b.a(h2) >= 0.0f) {
            n3 = net.minecraft.u.b.n.d(Math.max(1.0f, this.b.bu));
        }
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(g2.a, g2.b, g2.c).c();
        double d2 = (double)g2.b - (1.0 - this.a.n((net.minecraft.u.b.b)b2).c((n)this.a, (net.minecraft.u.b.b)b2).e);
        g g5 = this.a(g2.a, g2.b, g2.c + 1, n3, d2, ad.d);
        g g6 = this.a(g2.a - 1, g2.b, g2.c, n3, d2, ad.e);
        g g7 = this.a(g2.a + 1, g2.b, g2.c, n3, d2, ad.f);
        g g8 = this.a(g2.a, g2.b, g2.c - 1, n3, d2, ad.c);
        if (g5 != null && !g5.i && g5.a(g3) < f2) {
            arrg[n2++] = g5;
        }
        if (g6 != null && !g6.i && g6.a(g3) < f2) {
            arrg[n2++] = g6;
        }
        if (g7 != null && !g7.i && g7.a(g3) < f2) {
            arrg[n2++] = g7;
        }
        if (g8 != null && !g8.i && g8.a(g3) < f2) {
            arrg[n2++] = g8;
        }
        boolean bl3 = g8 == null || g8.m == net.minecraft.i.h.b || g8.l != 0.0f;
        boolean bl4 = g5 == null || g5.m == net.minecraft.i.h.b || g5.l != 0.0f;
        boolean bl5 = g7 == null || g7.m == net.minecraft.i.h.b || g7.l != 0.0f;
        boolean bl6 = bl2 = g6 == null || g6.m == net.minecraft.i.h.b || g6.l != 0.0f;
        if (bl3 && bl2 && (g4 = this.a(g2.a - 1, g2.b, g2.c - 1, n3, d2, ad.c)) != null && !g4.i && g4.a(g3) < f2) {
            arrg[n2++] = g4;
        }
        if (bl3 && bl5 && (g4 = this.a(g2.a + 1, g2.b, g2.c - 1, n3, d2, ad.c)) != null && !g4.i && g4.a(g3) < f2) {
            arrg[n2++] = g4;
        }
        if (bl4 && bl2 && (g4 = this.a(g2.a - 1, g2.b, g2.c + 1, n3, d2, ad.d)) != null && !g4.i && g4.a(g3) < f2) {
            arrg[n2++] = g4;
        }
        if (bl4 && bl5 && (g4 = this.a(g2.a + 1, g2.b, g2.c + 1, n3, d2, ad.d)) != null && !g4.i && g4.a(g3) < f2) {
            arrg[n2++] = g4;
        }
        return n2;
    }

    private g a(int n2, int n3, int n4, int n5, double d2, ad ad2) {
        g g2 = null;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2, n3, n4);
        net.minecraft.u.b.b b3 = b2.c();
        double d3 = (double)n3 - (1.0 - this.a.n((net.minecraft.u.b.b)b3).c((n)this.a, (net.minecraft.u.b.b)b3).e);
        if (d3 - d2 > 1.125) {
            return null;
        }
        h h2 = this.a(this.b, n2, n3, n4);
        float f2 = this.b.a(h2);
        double d4 = (double)this.b.bl / 2.0;
        if (f2 >= 0.0f) {
            g2 = this.a(n2, n3, n4);
            g2.m = h2;
            g2.l = Math.max(g2.l, f2);
        }
        if (h2 == net.minecraft.i.h.c) {
            return g2;
        }
        if (g2 == null && n5 > 0 && h2 != net.minecraft.i.h.e && h2 != net.minecraft.i.h.d && (g2 = this.a(n2, n3 + 1, n4, n5 - 1, d2, ad2)) != null && (g2.m == net.minecraft.i.h.b || g2.m == net.minecraft.i.h.c) && this.b.bl < 1.0f) {
            double d5 = (double)(n2 - ad2.h()) + 0.5;
            double d6 = (double)(n4 - ad2.j()) + 0.5;
            a a2 = new a(d5 - d4, (double)n3 + 0.001, d6 - d4, d5 + d4, (float)n3 + this.b.bm, d6 + d4);
            a a3 = this.a.n(b2).c(this.a, b2);
            a a4 = a2.a(0.0, a3.e - 0.002, 0.0);
            if (this.b.aQ.b(a4)) {
                g2 = null;
            }
        }
        if (h2 == net.minecraft.i.h.b) {
            h h3;
            a a5 = new a((double)n2 - d4 + 0.5, (double)n3 + 0.001, (double)n4 - d4 + 0.5, (double)n2 + d4 + 0.5, (float)n3 + this.b.bm, (double)n4 + d4 + 0.5);
            if (this.b.aQ.b(a5)) {
                return null;
            }
            if (this.b.bl >= 1.0f && (h3 = this.a(this.b, n2, n3 - 1, n4)) == net.minecraft.i.h.a) {
                g2 = this.a(n2, n3, n4);
                g2.m = net.minecraft.i.h.c;
                g2.l = Math.max(g2.l, f2);
                return g2;
            }
            int n6 = 0;
            while (n3 > 0 && h2 == net.minecraft.i.h.b) {
                --n3;
                if (n6++ >= this.b.ck_()) {
                    return null;
                }
                h2 = this.a(this.b, n2, n3, n4);
                f2 = this.b.a(h2);
                if (h2 != net.minecraft.i.h.b && f2 >= 0.0f) {
                    g2 = this.a(n2, n3, n4);
                    g2.m = h2;
                    g2.l = Math.max(g2.l, f2);
                    break;
                }
                if (!(f2 < 0.0f)) continue;
                return null;
            }
        }
        return g2;
    }

    @Override
    public h a(n n2, int n3, int n4, int n5, net.minecraft.w.f f2, int n6, int n7, int n8, boolean bl2, boolean bl3) {
        EnumSet<h> enumSet = EnumSet.noneOf(h.class);
        h h2 = net.minecraft.i.h.a;
        double d2 = (double)f2.bl / 2.0;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(f2);
        for (int i2 = 0; i2 < n6; ++i2) {
            for (int i3 = 0; i3 < n7; ++i3) {
                for (int i4 = 0; i4 < n8; ++i4) {
                    int n9 = i2 + n3;
                    int n10 = i3 + n4;
                    int n11 = i4 + n5;
                    h h3 = this.a(n2, n9, n10, n11);
                    if (h3 == net.minecraft.i.h.p && bl2 && bl3) {
                        h3 = net.minecraft.i.h.c;
                    }
                    if (h3 == net.minecraft.i.h.o && !bl3) {
                        h3 = net.minecraft.i.h.a;
                    }
                    if (h3 == net.minecraft.i.h.h && !(n2.n(b2).c() instanceof dj) && !(n2.n(b2.c()).c() instanceof dj)) {
                        h3 = net.minecraft.i.h.e;
                    }
                    if (i2 == 0 && i3 == 0 && i4 == 0) {
                        h2 = h3;
                    }
                    enumSet.add(h3);
                }
            }
        }
        if (enumSet.contains((Object)net.minecraft.i.h.e)) {
            return net.minecraft.i.h.e;
        }
        h h4 = net.minecraft.i.h.a;
        for (h h5 : enumSet) {
            if (f2.a(h5) < 0.0f) {
                return h5;
            }
            if (!(f2.a(h5) >= f2.a(h4))) continue;
            h4 = h5;
        }
        if (h2 == net.minecraft.i.h.b && f2.a(h4) == 0.0f) {
            return net.minecraft.i.h.b;
        }
        return h4;
    }

    private h a(net.minecraft.w.f f2, net.minecraft.u.b.b b2) {
        return this.a(f2, b2.cy_(), b2.k(), b2.l());
    }

    private h a(net.minecraft.w.f f2, int n2, int n3, int n4) {
        return this.a(this.a, n2, n3, n4, f2, this.d, this.e, this.f, this.d(), this.c());
    }

    @Override
    public h a(n n2, int n3, int n4, int n5) {
        Object object;
        h h2 = this.b(n2, n3, n4, n5);
        if (h2 == net.minecraft.i.h.b && n4 >= 1) {
            object = n2.n(new net.minecraft.u.b.b(n3, n4 - 1, n5)).c();
            h h3 = this.b(n2, n3, n4 - 1, n5);
            h h4 = h2 = h3 != net.minecraft.i.h.c && h3 != net.minecraft.i.h.b && h3 != net.minecraft.i.h.g && h3 != net.minecraft.i.h.f ? net.minecraft.i.h.c : net.minecraft.i.h.b;
            if (h3 == net.minecraft.i.h.j || object == p.df) {
                h2 = net.minecraft.i.h.j;
            }
            if (h3 == net.minecraft.i.h.l) {
                h2 = net.minecraft.i.h.l;
            }
        }
        object = net.minecraft.u.b.h.m();
        if (h2 == net.minecraft.i.h.c) {
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    if (i2 == 0 && i3 == 0) continue;
                    cn cn2 = n2.n(((net.minecraft.u.b.h)object).d(i2 + n3, n4, i3 + n5)).c();
                    if (cn2 == p.aK) {
                        h2 = net.minecraft.i.h.k;
                        continue;
                    }
                    if (cn2 != p.ab) continue;
                    h2 = net.minecraft.i.h.i;
                }
            }
        }
        ((net.minecraft.u.b.h)object).n();
        return h2;
    }

    private h b(n n2, int n3, int n4, int n5) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n3, n4, n5);
        b b3 = n2.n(b2);
        cn cn2 = b3.c();
        net.minecraft.g.a.h h2 = b3.d();
        return h2 == net.minecraft.g.a.h.a ? net.minecraft.i.h.b : (cn2 != p.bd && cn2 != p.cw && cn2 != p.bx ? (cn2 == p.ab ? net.minecraft.i.h.j : (cn2 == p.aK ? net.minecraft.i.h.l : (cn2 instanceof ga && h2 == net.minecraft.g.a.h.d && !((Boolean)b3.a(ga.b)).booleanValue() ? net.minecraft.i.h.p : (cn2 instanceof ga && h2 == net.minecraft.g.a.h.f && !((Boolean)b3.a(ga.b)).booleanValue() ? net.minecraft.i.h.q : (cn2 instanceof ga && ((Boolean)b3.a(ga.b)).booleanValue() ? net.minecraft.i.h.o : (cn2 instanceof dj ? net.minecraft.i.h.h : (!(cn2 instanceof fm || cn2 instanceof ey || cn2 instanceof ct && !((Boolean)b3.a(ct.a)).booleanValue()) ? (h2 == net.minecraft.g.a.h.h ? net.minecraft.i.h.g : (h2 == net.minecraft.g.a.h.i ? net.minecraft.i.h.f : (cn2.a(n2, b2) ? net.minecraft.i.h.b : net.minecraft.i.h.a))) : net.minecraft.i.h.e))))))) : net.minecraft.i.h.d);
    }
}

