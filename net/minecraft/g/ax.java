/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.ak;
import net.minecraft.g.b.e;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.fh;
import net.minecraft.g.ht;
import net.minecraft.g.t;
import net.minecraft.m.ar;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.c;

public class ax
extends a {
    public static final g a = g.a("legacy_data", 0, 15);
    public static final e b = net.minecraft.g.b.e.a("contents", ht.class);
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.3125, 0.0, 0.3125, 0.6875, 0.375, 0.6875);
    private static /* synthetic */ int[] d;

    public ax() {
        super(h.q);
        this.z(this.O.b().a(b, (Comparable)((Object)ht.a)).a(a, Integer.valueOf(0)));
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a("item.flowerPot.name");
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return c;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (cu2 != null && cu2.a() instanceof ar) {
            net.minecraft.f.g g2 = this.c(k2, b2);
            if (g2 == null) {
                return false;
            }
            if (g2.b() != null) {
                return false;
            }
            cn cn2 = cn.a(cu2.a());
            if (!this.a(cn2, cu2.h())) {
                return false;
            }
            g2.a(cu2.a(), cu2.h());
            g2.C();
            k2.a(b2, b3, b3, 3);
            b4.a(o.V);
            if (!b4.J.d) {
                --cu2.b;
            }
            return true;
        }
        return false;
    }

    private boolean a(cn cn2, int n2) {
        return cn2 != p.N && cn2 != p.O && cn2 != p.aK && cn2 != p.P && cn2 != p.Q && cn2 != p.g && cn2 != p.I ? cn2 == p.H && n2 == t.c.b() : true;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        cu cu2;
        net.minecraft.f.g g2 = this.c(k2, b2);
        if (g2 != null && (cu2 = g2.a()) != null) {
            return cu2;
        }
        return new cu(net.minecraft.a.w.ca);
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) && k2.n(b2.c()).t();
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.n(b3.c()).t()) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        net.minecraft.f.g g2 = this.c(k2, b2);
        if (g2 != null && g2.b() != null) {
            ax.a(k2, b2, new cu(g2.b(), 1, g2.e()));
        }
        super.a(k2, b2, b3);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4) {
        net.minecraft.f.g g2;
        super.a(k2, b2, b3, b4);
        if (b4.J.d && (g2 = this.c(k2, b2)) != null) {
            g2.a(null, 0);
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.ca;
    }

    private net.minecraft.f.g c(k k2, net.minecraft.u.b.b b2) {
        ap ap2 = k2.q(b2);
        return ap2 instanceof net.minecraft.f.g ? (net.minecraft.f.g)ap2 : null;
    }

    @Override
    public ap a(k k2, int n2) {
        cn cn2 = null;
        int n3 = 0;
        switch (n2) {
            case 1: {
                cn2 = p.O;
                n3 = fh.b.c();
                break;
            }
            case 2: {
                cn2 = p.N;
                break;
            }
            case 3: {
                cn2 = p.g;
                n3 = net.minecraft.g.b.a.b();
                break;
            }
            case 4: {
                cn2 = p.g;
                n3 = net.minecraft.g.b.b.b();
                break;
            }
            case 5: {
                cn2 = p.g;
                n3 = net.minecraft.g.b.c.b();
                break;
            }
            case 6: {
                cn2 = p.g;
                n3 = net.minecraft.g.b.d.b();
                break;
            }
            case 7: {
                cn2 = p.Q;
                break;
            }
            case 8: {
                cn2 = p.P;
                break;
            }
            case 9: {
                cn2 = p.aK;
                break;
            }
            case 10: {
                cn2 = p.I;
                break;
            }
            case 11: {
                cn2 = p.H;
                n3 = t.c.b();
                break;
            }
            case 12: {
                cn2 = p.g;
                n3 = net.minecraft.g.b.e.b();
                break;
            }
            case 13: {
                cn2 = p.g;
                n3 = net.minecraft.g.b.f.b();
            }
        }
        return new net.minecraft.f.g(cg.a(cn2), n3);
    }

    @Override
    protected i a() {
        return new i(this, b, a);
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        net.minecraft.f.g g2;
        cg cg2;
        ht ht2 = ht.a;
        ap ap2 = n2.q(b3);
        if (ap2 instanceof net.minecraft.f.g && (cg2 = (g2 = (net.minecraft.f.g)ap2).b()) instanceof ar) {
            int n3 = g2.e();
            cn cn2 = cn.a(cg2);
            if (cn2 == p.g) {
                switch (ax.e()[net.minecraft.g.b.a(n3).ordinal()]) {
                    case 1: {
                        ht2 = ht.l;
                        break;
                    }
                    case 2: {
                        ht2 = ht.m;
                        break;
                    }
                    case 3: {
                        ht2 = ht.n;
                        break;
                    }
                    case 4: {
                        ht2 = ht.o;
                        break;
                    }
                    case 5: {
                        ht2 = ht.p;
                        break;
                    }
                    case 6: {
                        ht2 = ht.q;
                        break;
                    }
                    default: {
                        ht2 = ht.a;
                        break;
                    }
                }
            } else if (cn2 == p.H) {
                switch (n3) {
                    case 0: {
                        ht2 = ht.t;
                        break;
                    }
                    case 2: {
                        ht2 = ht.u;
                        break;
                    }
                    default: {
                        ht2 = ht.a;
                        break;
                    }
                }
            } else if (cn2 == p.N) {
                ht2 = ht.k;
            } else if (cn2 == p.O) {
                switch (fh.a(ak.b, n3)) {
                    case b: {
                        ht2 = ht.b;
                        break;
                    }
                    case c: {
                        ht2 = ht.c;
                        break;
                    }
                    case d: {
                        ht2 = ht.d;
                        break;
                    }
                    case e: {
                        ht2 = ht.e;
                        break;
                    }
                    case f: {
                        ht2 = ht.f;
                        break;
                    }
                    case g: {
                        ht2 = ht.g;
                        break;
                    }
                    case h: {
                        ht2 = ht.h;
                        break;
                    }
                    case i: {
                        ht2 = ht.i;
                        break;
                    }
                    case j: {
                        ht2 = ht.j;
                        break;
                    }
                    default: {
                        ht2 = ht.a;
                        break;
                    }
                }
            } else if (cn2 == p.Q) {
                ht2 = ht.r;
            } else if (cn2 == p.P) {
                ht2 = ht.s;
            } else if (cn2 == p.I) {
                ht2 = ht.t;
            } else if (cn2 == p.aK) {
                ht2 = ht.v;
            }
        }
        return b2.a(b, (Comparable)((Object)ht2));
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    static /* synthetic */ int[] e() {
        if (d != null) {
            return d;
        }
        int[] arrn = new int[net.minecraft.g.b.values().length];
        try {
            arrn[net.minecraft.g.b.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[net.minecraft.g.b.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        d = arrn;
        return arrn;
    }
}

