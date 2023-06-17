/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ju
extends bfa {
    public static final ddi a = ddi.b("up");
    public static final ddi b = ddi.b("north");
    public static final ddi c = ddi.b("east");
    public static final ddi d = ddi.b("south");
    public static final ddi e = ddi.b("west");
    public static final ddi[] f = new ddi[]{a, b, d, e, c};
    protected static final cxt g = new cxt(0.0, 0.9375, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt h = new cxt(0.0, 0.0, 0.0, 0.0625, 1.0, 1.0);
    protected static final cxt i = new cxt(0.9375, 0.0, 0.0, 1.0, 1.0, 1.0);
    protected static final cxt j = new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 0.0625);
    protected static final cxt k = new cxt(0.0, 0.0, 0.9375, 1.0, 1.0, 1.0);

    public ju() {
        super(ahk.l);
        this.D(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
        this.b(true);
        this.a(zm.c);
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk2 = dbk2.b(bnj2, cmz2);
        int n2 = 0;
        cxt cxt2 = x;
        if (((Boolean)dbk2.b(a)).booleanValue()) {
            cxt2 = g;
            ++n2;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            cxt2 = j;
            ++n2;
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            cxt2 = i;
            ++n2;
        }
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            cxt2 = k;
            ++n2;
        }
        if (((Boolean)dbk2.b(e)).booleanValue()) {
            cxt2 = h;
            ++n2;
        }
        return n2 == 1 ? cxt2 : x;
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return dbk2.a(a, Boolean.valueOf(bnj2.n(cmz2.g()).k()));
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a_(bnj bnj2, cmz cmz2) {
        return true;
    }

    @Override
    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        switch (bqk2) {
            case b: {
                return this.n(iu2.n(cmz2.g()));
            }
            case c: 
            case d: 
            case f: 
            case e: {
                return this.n(iu2.n(cmz2.c(bqk2.e())));
            }
        }
        return false;
    }

    private boolean n(dbk dbk2) {
        return dbk2.h() && dbk2.a().c();
    }

    private boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        dbk dbk3 = dbk2;
        for (bqk bqk2 : afj.a) {
            dbk dbk4;
            ddi ddi2 = ju.a(bqk2);
            if (!((Boolean)dbk2.b(ddi2)).booleanValue() || this.n(iu2.n(cmz2.c(bqk2))) || (dbk4 = iu2.n(cmz2.g())).t() == this && ((Boolean)dbk4.b(ddi2)).booleanValue()) continue;
            dbk2 = dbk2.a(ddi2, Boolean.valueOf(false));
        }
        if (ju.m(dbk2) == 0) {
            return false;
        }
        if (dbk3 != dbk2) {
            iu2.a(cmz2, dbk2, 2);
        }
        return true;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!iu2.C && !this.e(iu2, cmz2, dbk2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (iu2.p.nextInt(4) != 0) {
            return;
        }
        int n2 = 4;
        int n3 = 5;
        boolean bl2 = false;
        block0: for (int i2 = -4; i2 <= 4; ++i2) {
            for (int i3 = -4; i3 <= 4; ++i3) {
                for (int i4 = -1; i4 <= 1; ++i4) {
                    if (iu2.n(cmz2.e(i2, i4, i3)).t() != this || --n3 > 0) continue;
                    bl2 = true;
                    break block0;
                }
            }
        }
        bqk bqk2 = bqk.a(random);
        cmz cmz3 = cmz2.g();
        if (bqk2 == bqk.b && cmz2.b() < 255 && iu2.c(cmz3)) {
            if (bl2) {
                return;
            }
            dbk dbk3 = dbk2;
            for (bqk bqk3 : afj.a) {
                if (!random.nextBoolean() && this.n(iu2.n(cmz3.c(bqk3)))) continue;
                dbk3 = dbk3.a(ju.a(bqk3), Boolean.valueOf(false));
            }
            if (((Boolean)dbk3.b(b)).booleanValue() || ((Boolean)dbk3.b(c)).booleanValue() || ((Boolean)dbk3.b(d)).booleanValue() || ((Boolean)dbk3.b(e)).booleanValue()) {
                iu2.a(cmz3, dbk3, 2);
            }
            return;
        }
        if (bqk2.l().d() && !((Boolean)dbk2.b(ju.a(bqk2))).booleanValue()) {
            if (bl2) {
                return;
            }
            cmz cmz4 = cmz2.c(bqk2);
            dbk dbk4 = iu2.n(cmz4);
            bfa bfa2 = dbk4.t();
            if (bfa2.L == ahk.a) {
                bqk bqk4 = bqk2.f();
                bqk bqk5 = bqk2.g();
                boolean bl3 = (Boolean)dbk2.b(ju.a(bqk4));
                boolean bl4 = (Boolean)dbk2.b(ju.a(bqk5));
                cmz cmz5 = cmz4.c(bqk4);
                cmz cmz6 = cmz4.c(bqk5);
                if (bl3 && this.n(iu2.n(cmz5))) {
                    iu2.a(cmz4, this.s().a(ju.a(bqk4), Boolean.valueOf(true)), 2);
                } else if (bl4 && this.n(iu2.n(cmz6))) {
                    iu2.a(cmz4, this.s().a(ju.a(bqk5), Boolean.valueOf(true)), 2);
                } else if (bl3 && iu2.c(cmz5) && this.n(iu2.n(cmz2.c(bqk4)))) {
                    iu2.a(cmz5, this.s().a(ju.a(bqk2.e()), Boolean.valueOf(true)), 2);
                } else if (bl4 && iu2.c(cmz6) && this.n(iu2.n(cmz2.c(bqk5)))) {
                    iu2.a(cmz6, this.s().a(ju.a(bqk2.e()), Boolean.valueOf(true)), 2);
                } else if (this.n(iu2.n(cmz4.g()))) {
                    iu2.a(cmz4, this.s(), 2);
                }
            } else if (bfa2.L.j() && dbk4.h()) {
                iu2.a(cmz2, dbk2.a(ju.a(bqk2), Boolean.valueOf(true)), 2);
            }
            return;
        }
        if (cmz2.b() > 1) {
            cmz cmz7 = cmz2.h();
            dbk dbk5 = iu2.n(cmz7);
            bfa bfa3 = dbk5.t();
            if (bfa3.L == ahk.a) {
                dbk dbk6 = dbk2;
                for (bqk bqk6 : afj.a) {
                    if (!random.nextBoolean()) continue;
                    dbk6 = dbk6.a(ju.a(bqk6), Boolean.valueOf(false));
                }
                if (((Boolean)dbk6.b(b)).booleanValue() || ((Boolean)dbk6.b(c)).booleanValue() || ((Boolean)dbk6.b(d)).booleanValue() || ((Boolean)dbk6.b(e)).booleanValue()) {
                    iu2.a(cmz7, dbk6, 2);
                }
            } else if (bfa3 == this) {
                dbk dbk7 = dbk5;
                for (bqk bqk7 : afj.a) {
                    ddi ddi2 = ju.a(bqk7);
                    if (!random.nextBoolean() || !((Boolean)dbk2.b(ddi2)).booleanValue()) continue;
                    dbk7 = dbk7.a(ddi2, Boolean.valueOf(true));
                }
                if (((Boolean)dbk7.b(b)).booleanValue() || ((Boolean)dbk7.b(c)).booleanValue() || ((Boolean)dbk7.b(d)).booleanValue() || ((Boolean)dbk7.b(e)).booleanValue()) {
                    iu2.a(cmz7, dbk7, 2);
                }
            }
        }
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        dbk dbk2 = this.s().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false));
        if (bqk2.l().d()) {
            return dbk2.a(ju.a(bqk2.e()), Boolean.valueOf(true));
        }
        return dbk2;
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        if (!iu2.C && bhl2 != null && bhl2.a() == hp.bl) {
            bdl2.a(bpv.a(this));
            ju.a(iu2, cmz2, new bhl(blg.bn, 1, 0));
        } else {
            super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
        }
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(d, Boolean.valueOf((n2 & 1) > 0)).a(e, Boolean.valueOf((n2 & 2) > 0)).a(b, Boolean.valueOf((n2 & 4) > 0)).a(c, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        if (((Boolean)dbk2.b(d)).booleanValue()) {
            n2 |= 1;
        }
        if (((Boolean)dbk2.b(e)).booleanValue()) {
            n2 |= 2;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 4;
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c, d, e);
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                return dbk2.a(b, dbk2.b(d)).a(c, dbk2.b(e)).a(d, dbk2.b(b)).a(e, dbk2.b(c));
            }
            case d: {
                return dbk2.a(b, dbk2.b(c)).a(c, dbk2.b(d)).a(d, dbk2.b(e)).a(e, dbk2.b(b));
            }
            case b: {
                return dbk2.a(b, dbk2.b(e)).a(c, dbk2.b(b)).a(d, dbk2.b(c)).a(e, dbk2.b(d));
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        switch (cdk2) {
            case b: {
                return dbk2.a(b, dbk2.b(d)).a(d, dbk2.b(b));
            }
            case c: {
                return dbk2.a(c, dbk2.b(e)).a(e, dbk2.b(c));
            }
        }
        return super.a(dbk2, cdk2);
    }

    public static ddi a(bqk bqk2) {
        switch (bqk2) {
            case b: {
                return a;
            }
            case c: {
                return b;
            }
            case d: {
                return d;
            }
            case e: {
                return e;
            }
            case f: {
                return c;
            }
        }
        throw new IllegalArgumentException(bqk2 + " is an invalid choice");
    }

    public static int m(dbk dbk2) {
        int n2 = 0;
        for (ddi ddi2 : f) {
            if (!((Boolean)dbk2.b(ddi2)).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }
}

