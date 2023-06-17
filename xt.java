/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class xt
extends bfa {
    public static final yc a = cli.j;
    public static final ddi b = ddi.b("open");
    public static final byc c = byc.a("hinge", bjl.class);
    public static final ddi d = ddi.b("powered");
    public static final byc e = byc.a("half", em.class);
    protected static final cxt f = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.1875);
    protected static final cxt g = new cxt(0.0, 0.0, 0.8125, 1.0, 1.0, 1.0);
    protected static final cxt h = new cxt(0.8125, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt i = new cxt(0.0, 0.0, 0.0, 0.1875, 1.0, 1.0);

    protected xt(ahk ahk2) {
        super(ahk2);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)).a(c, (Comparable)((Object)bjl.a)).a(d, Boolean.valueOf(false)).a(e, (Comparable)((Object)em.b)));
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = dbk2.b(bnj2, cmz2);
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        boolean bl2 = (Boolean)dbk2.b(b) == false;
        boolean bl3 = dbk2.b(c) == bjl.b;
        switch (bqk2) {
            default: {
                return bl2 ? i : (bl3 ? g : f);
            }
            case d: {
                return bl2 ? f : (bl3 ? i : h);
            }
            case e: {
                return bl2 ? h : (bl3 ? f : g);
            }
            case c: 
        }
        return bl2 ? g : (bl3 ? h : i);
    }

    @Override
    public String az_() {
        return caf.a((this.n() + ".name").replaceAll("tile", "item"));
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(bnj bnj2, cmz cmz2) {
        return xt.d(xt.c(bnj2, cmz2));
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    private int h() {
        return this.L == ahk.f ? 1011 : 1012;
    }

    private int v() {
        return this.L == ahk.f ? 1005 : 1006;
    }

    @Override
    public bif a(dbk dbk2) {
        if (dbk2.t() == blg.aA) {
            return bif.h;
        }
        if (dbk2.t() == blg.ao) {
            return zg.a.c();
        }
        if (dbk2.t() == blg.ap) {
            return zg.b.c();
        }
        if (dbk2.t() == blg.aq) {
            return zg.c.c();
        }
        if (dbk2.t() == blg.ar) {
            return zg.d.c();
        }
        if (dbk2.t() == blg.as) {
            return zg.e.c();
        }
        if (dbk2.t() == blg.at) {
            return zg.f.c();
        }
        return super.a(dbk2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        dbk dbk3;
        if (this.L == ahk.f) {
            return true;
        }
        cmz cmz3 = dbk2.b(e) == em.b ? cmz2 : cmz2.h();
        dbk dbk4 = dbk3 = cmz2.equals(cmz3) ? dbk2 : iu2.n(cmz3);
        if (dbk3.t() != this) {
            return false;
        }
        dbk2 = dbk3.a(b);
        iu2.a(cmz3, dbk2, 10);
        iu2.b(cmz3, cmz2);
        iu2.a(bdl2, (Boolean)dbk2.b(b) != false ? this.v() : this.h(), cmz2, 0);
        return true;
    }

    public void a(iu iu2, cmz cmz2, boolean bl2) {
        dbk dbk2;
        dbk dbk3 = iu2.n(cmz2);
        if (dbk3.t() != this) {
            return;
        }
        cmz cmz3 = dbk3.b(e) == em.b ? cmz2 : cmz2.h();
        dbk dbk4 = dbk2 = cmz2 == cmz3 ? dbk3 : iu2.n(cmz3);
        if (dbk2.t() == this && (Boolean)dbk2.b(b) != bl2) {
            iu2.a(cmz3, dbk2.a(b, Boolean.valueOf(bl2)), 10);
            iu2.b(cmz3, cmz2);
            iu2.a(null, bl2 ? this.v() : this.h(), cmz2, 0);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (dbk2.b(e) == em.a) {
            cmz cmz3 = cmz2.h();
            dbk dbk3 = iu2.n(cmz3);
            if (dbk3.t() != this) {
                iu2.f(cmz2);
            } else if (bfa2 != this) {
                dbk3.a(iu2, cmz3, bfa2);
            }
        } else {
            boolean bl2 = false;
            cmz cmz4 = cmz2.g();
            dbk dbk4 = iu2.n(cmz4);
            if (dbk4.t() != this) {
                iu2.f(cmz2);
                bl2 = true;
            }
            if (!iu2.n(cmz2.h()).q()) {
                iu2.f(cmz2);
                bl2 = true;
                if (dbk4.t() == this) {
                    iu2.f(cmz4);
                }
            }
            if (bl2) {
                if (!iu2.C) {
                    this.b(iu2, cmz2, dbk2, 0);
                }
            } else {
                boolean bl3;
                boolean bl4 = bl3 = iu2.x(cmz2) || iu2.x(cmz4);
                if (bfa2 != this && (bl3 || bfa2.s().m()) && bl3 != (Boolean)dbk4.b(d)) {
                    iu2.a(cmz4, dbk4.a(d, Boolean.valueOf(bl3)), 2);
                    if (bl3 != (Boolean)dbk2.b(b)) {
                        iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(bl3)), 2);
                        iu2.b(cmz2, cmz2);
                        iu2.a(null, bl3 ? this.v() : this.h(), cmz2, 0);
                    }
                }
            }
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (dbk2.b(e) == em.a) {
            return null;
        }
        return this.w();
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        if (cmz2.b() >= 255) {
            return false;
        }
        return iu2.n(cmz2.h()).q() && super.a(iu2, cmz2) && super.a(iu2, cmz2.g());
    }

    @Override
    public bez j(dbk dbk2) {
        return bez.b;
    }

    public static int c(bnj bnj2, cmz cmz2) {
        dbk dbk2 = bnj2.n(cmz2);
        int n2 = dbk2.t().e(dbk2);
        boolean bl2 = xt.e(n2);
        dbk dbk3 = bnj2.n(cmz2.h());
        int n3 = dbk3.t().e(dbk3);
        int n4 = bl2 ? n3 : n2;
        dbk dbk4 = bnj2.n(cmz2.g());
        int n5 = dbk4.t().e(dbk4);
        int n6 = bl2 ? n2 : n5;
        boolean bl3 = (n6 & 1) != 0;
        boolean bl4 = (n6 & 2) != 0;
        return xt.b(n4) | (bl2 ? 8 : 0) | (bl3 ? 16 : 0) | (bl4 ? 32 : 0);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this.w());
    }

    private azg w() {
        if (this == blg.aA) {
            return hp.aD;
        }
        if (this == blg.ap) {
            return hp.at;
        }
        if (this == blg.aq) {
            return hp.au;
        }
        if (this == blg.ar) {
            return hp.av;
        }
        if (this == blg.as) {
            return hp.aw;
        }
        if (this == blg.at) {
            return hp.ax;
        }
        return hp.as;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        cmz cmz3 = cmz2.h();
        cmz cmz4 = cmz2.g();
        if (bdl2.G.d && dbk2.b(e) == em.a && iu2.n(cmz3).t() == this) {
            iu2.f(cmz3);
        }
        if (dbk2.b(e) == em.b && iu2.n(cmz4).t() == this) {
            if (bdl2.G.d) {
                iu2.f(cmz2);
            }
            iu2.f(cmz4);
        }
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (dbk2.b(e) == em.b) {
            dbk dbk3 = bnj2.n(cmz2.g());
            if (dbk3.t() == this) {
                dbk2 = dbk2.a(c, dbk3.b(c)).a(d, dbk3.b(d));
            }
        } else {
            dbk dbk4 = bnj2.n(cmz2.h());
            if (dbk4.t() == this) {
                dbk2 = dbk2.a(a, dbk4.b(a)).a(b, dbk4.b(b));
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        if (dbk2.b(e) != em.b) {
            return dbk2;
        }
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        if (cdk2 == cdk.a) {
            return dbk2;
        }
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a)))).a(c);
    }

    @Override
    public dbk a(int n2) {
        if ((n2 & 8) > 0) {
            return this.s().a(e, (Comparable)((Object)em.a)).a(c, (Comparable)((Object)((n2 & 1) > 0 ? bjl.b : bjl.a))).a(d, Boolean.valueOf((n2 & 2) > 0));
        }
        return this.s().a(e, (Comparable)((Object)em.b)).a(a, (Comparable)((Object)bqk.b(n2 & 3).g())).a(b, Boolean.valueOf((n2 & 4) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        if (dbk2.b(e) == em.a) {
            n2 |= 8;
            if (dbk2.b(c) == bjl.b) {
                n2 |= 1;
            }
            if (((Boolean)dbk2.b(d)).booleanValue()) {
                n2 |= 2;
            }
        } else {
            n2 |= ((bqk)((Object)dbk2.b(a))).f().c();
            if (((Boolean)dbk2.b(b)).booleanValue()) {
                n2 |= 4;
            }
        }
        return n2;
    }

    protected static int b(int n2) {
        return n2 & 7;
    }

    public static boolean d(bnj bnj2, cmz cmz2) {
        return xt.d(xt.c(bnj2, cmz2));
    }

    public static bqk e(bnj bnj2, cmz cmz2) {
        return xt.c(xt.c(bnj2, cmz2));
    }

    public static bqk c(int n2) {
        return bqk.b(n2 & 3).g();
    }

    protected static boolean d(int n2) {
        return (n2 & 4) != 0;
    }

    protected static boolean e(int n2) {
        return (n2 & 8) != 0;
    }

    @Override
    protected bkp a() {
        return new bkp(this, e, a, b, c, d);
    }
}

