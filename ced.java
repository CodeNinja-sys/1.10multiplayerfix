/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

abstract class ced
extends pc {
    protected int g = -1;
    private int a;
    protected int h;
    protected boolean i;

    public ced() {
    }

    protected ced(yj yj2, int n2) {
        super(n2);
        if (yj2 != null) {
            this.h = yj2.h;
            this.i = yj2.i;
        }
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("HPos", this.g);
        bvp2.a("VCount", this.a);
        bvp2.a("Type", (byte)this.h);
        bvp2.a("Zombie", this.i);
    }

    @Override
    protected void b(bvp bvp2) {
        this.g = bvp2.h("HPos");
        this.a = bvp2.h("VCount");
        this.h = bvp2.f("Type");
        if (bvp2.p("Desert")) {
            this.h = 1;
        }
        this.i = bvp2.p("Zombie");
    }

    protected pc a(yj yj2, List list, Random random, int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                default: {
                    return ccv.a(yj2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, bqk.e, this.c());
                }
                case d: {
                    return ccv.a(yj2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, bqk.e, this.c());
                }
                case e: {
                    return ccv.a(yj2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, bqk.c, this.c());
                }
                case f: 
            }
            return ccv.a(yj2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, bqk.c, this.c());
        }
        return null;
    }

    protected pc b(yj yj2, List list, Random random, int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                default: {
                    return ccv.a(yj2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, bqk.f, this.c());
                }
                case d: {
                    return ccv.a(yj2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, bqk.f, this.c());
                }
                case e: {
                    return ccv.a(yj2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, bqk.d, this.c());
                }
                case f: 
            }
            return ccv.a(yj2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, bqk.d, this.c());
        }
        return null;
    }

    protected int b(iu iu2, awx awx2) {
        int n2 = 0;
        int n3 = 0;
        pj pj2 = new pj();
        for (int i2 = this.l.c; i2 <= this.l.f; ++i2) {
            for (int i3 = this.l.a; i3 <= this.l.d; ++i3) {
                pj2.a(i3, 64, i2);
                if (!awx2.a(pj2)) continue;
                n2 += Math.max(iu2.p(pj2).b(), iu2.q.j() - 1);
                ++n3;
            }
        }
        if (n3 == 0) {
            return -1;
        }
        return n2 / n3;
    }

    protected static boolean a(awx awx2) {
        return awx2 != null && awx2.b > 10;
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        if (this.a >= n5) {
            return;
        }
        for (int i2 = this.a; i2 < n5 && awx2.a(new cmz(n8 = this.a(n2 + i2, n4), n7 = this.a(n3), n6 = this.b(n2 + i2, n4))); ++i2) {
            cfl cfl2;
            ++this.a;
            if (this.i) {
                cfl2 = new oe(iu2);
                cfl2.a_((double)n8 + 0.5, n7, (double)n6 + 0.5, 0.0f, 0.0f);
                ((oe)cfl2).a(iu2.C(new cmz(cfl2)), null);
                ((oe)cfl2).a(cnf.b(this.c(i2, 0)));
                cfl2.aC();
                iu2.b(cfl2);
                continue;
            }
            cfl2 = new cwp(iu2);
            cfl2.a_((double)n8 + 0.5, n7, (double)n6 + 0.5, 0.0f, 0.0f);
            ((cwp)cfl2).a(iu2.C(new cmz(cfl2)), null);
            ((cwp)cfl2).d(this.c(i2, ((cwp)cfl2).T()));
            iu2.b(cfl2);
        }
    }

    protected int c(int n2, int n3) {
        return n3;
    }

    protected dbk a(dbk dbk2) {
        if (this.h == 1) {
            if (dbk2.t() == blg.r || dbk2.t() == blg.s) {
                return blg.A.s();
            }
            if (dbk2.t() == blg.e) {
                return blg.A.a(byr.a.b());
            }
            if (dbk2.t() == blg.f) {
                return blg.A.a(byr.c.b());
            }
            if (dbk2.t() == blg.ad) {
                return blg.bO.s().a(qi.a, dbk2.b(qi.a));
            }
            if (dbk2.t() == blg.aw) {
                return blg.bO.s().a(qi.a, dbk2.b(qi.a));
            }
            if (dbk2.t() == blg.n) {
                return blg.A.s();
            }
        } else if (this.h == 3) {
            if (dbk2.t() == blg.r || dbk2.t() == blg.s) {
                return blg.r.s().a(ff.a, (Comparable)((Object)zg.b)).a(bue.b, dbk2.b(bue.b));
            }
            if (dbk2.t() == blg.f) {
                return blg.f.s().a(adg.a, (Comparable)((Object)zg.b));
            }
            if (dbk2.t() == blg.ad) {
                return blg.bU.s().a(qi.a, dbk2.b(qi.a));
            }
            if (dbk2.t() == blg.aO) {
                return blg.aP.s();
            }
        } else if (this.h == 2) {
            if (dbk2.t() == blg.r || dbk2.t() == blg.s) {
                return blg.s.s().a(bjc.a, (Comparable)((Object)zg.e)).a(bue.b, dbk2.b(bue.b));
            }
            if (dbk2.t() == blg.f) {
                return blg.f.s().a(adg.a, (Comparable)((Object)zg.e));
            }
            if (dbk2.t() == blg.ad) {
                return blg.cC.s().a(qi.a, dbk2.b(qi.a));
            }
            if (dbk2.t() == blg.e) {
                return blg.s.s().a(bjc.a, (Comparable)((Object)zg.e)).a(bue.b, (Comparable)((Object)fy.b));
            }
            if (dbk2.t() == blg.aO) {
                return blg.aT.s();
            }
        }
        return dbk2;
    }

    protected xt f() {
        switch (this.h) {
            case 2: {
                return blg.as;
            }
            case 3: {
                return blg.ap;
            }
        }
        return blg.ao;
    }

    protected void a(iu iu2, awx awx2, Random random, int n2, int n3, int n4, bqk bqk2) {
        if (!this.i) {
            this.a(iu2, awx2, random, n2, n3, n4, bqk.c, this.f());
        }
    }

    protected void a(iu iu2, bqk bqk2, int n2, int n3, int n4, awx awx2) {
        if (!this.i) {
            this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk2)), n2, n3, n4, awx2);
        }
    }

    @Override
    protected void b(iu iu2, dbk dbk2, int n2, int n3, int n4, awx awx2) {
        dbk dbk3 = this.a(dbk2);
        super.b(iu2, dbk3, n2, n3, n4, awx2);
    }

    protected void b(int n2) {
        this.h = n2;
    }
}

