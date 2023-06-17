/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import java.util.Random;

public class cr
extends bfa {
    public static final yc a = cli.j;
    public static final ddi b = ddi.b("powered");
    public static final ddi c = ddi.b("attached");
    protected static final cxt d = new cxt(0.3125, 0.0, 0.625, 0.6875, 0.625, 1.0);
    protected static final cxt e = new cxt(0.3125, 0.0, 0.0, 0.6875, 0.625, 0.375);
    protected static final cxt f = new cxt(0.625, 0.0, 0.3125, 1.0, 0.625, 0.6875);
    protected static final cxt g = new cxt(0.0, 0.0, 0.3125, 0.375, 0.625, 0.6875);

    public cr() {
        super(ahk.q);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
        this.a(zm.d);
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((bqk)((Object)dbk2.b(a))) {
            default: {
                return g;
            }
            case e: {
                return f;
            }
            case d: {
                return e;
            }
            case c: 
        }
        return d;
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
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
    public boolean a_(iu iu2, cmz cmz2, bqk bqk2) {
        return bqk2.l().d() && iu2.n(cmz2.c(bqk2.e())).l();
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        for (bqk bqk2 : afj.a) {
            if (!iu2.n(cmz2.c(bqk2)).l()) continue;
            return true;
        }
        return false;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        dbk dbk2 = this.s().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
        if (bqk2.l().d()) {
            dbk2 = dbk2.a(a, (Comparable)((Object)bqk2));
        }
        return dbk2;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        this.a(iu2, cmz2, dbk2, false, false, -1, null);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bqk bqk2;
        if (bfa2 == this) {
            return;
        }
        if (this.e(iu2, cmz2, dbk2) && !iu2.n(cmz2.c((bqk2 = (bqk)((Object)dbk2.b(a))).e())).l()) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
        }
    }

    public void a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2, boolean bl3, int n2, dbk dbk3) {
        Object object;
        cmz cmz3;
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        boolean bl4 = (Boolean)dbk2.b(c);
        boolean bl5 = (Boolean)dbk2.b(b);
        boolean bl6 = !bl2;
        boolean bl7 = false;
        int n3 = 0;
        dbk[] arrdbk = new dbk[42];
        for (int i2 = 1; i2 < 42; ++i2) {
            cmz3 = cmz2.c(bqk2, i2);
            object = iu2.n(cmz3);
            if (object.t() == blg.bR) {
                if (object.b(a) != bqk2.e()) break;
                n3 = i2;
                break;
            }
            if (object.t() == blg.bS || i2 == n2) {
                if (i2 == n2) {
                    object = (dbk)cc.b(dbk3, object);
                }
                boolean bl8 = (Boolean)object.b(uk.c) == false;
                boolean bl9 = (Boolean)object.b(uk.a);
                bl7 |= bl8 && bl9;
                arrdbk[i2] = object;
                if (i2 != n2) continue;
                iu2.a(cmz2, (bfa)this, this.a(iu2));
                bl6 &= bl8;
                continue;
            }
            arrdbk[i2] = null;
            bl6 = false;
        }
        dbk dbk4 = this.s().a(c, Boolean.valueOf(bl6)).a(b, Boolean.valueOf(bl7 &= (bl6 &= n3 > 1)));
        if (n3 > 0) {
            cmz3 = cmz2.c(bqk2, n3);
            object = bqk2.e();
            iu2.a(cmz3, dbk4.a(a, (Comparable)object), 3);
            this.b(iu2, cmz3, (bqk)object);
            this.a(iu2, cmz3, bl6, bl7, bl4, bl5);
        }
        this.a(iu2, cmz2, bl6, bl7, bl4, bl5);
        if (!bl2) {
            iu2.a(cmz2, dbk4.a(a, (Comparable)((Object)bqk2)), 3);
            if (bl3) {
                this.b(iu2, cmz2, bqk2);
            }
        }
        if (bl4 != bl6) {
            for (int i3 = 1; i3 < n3; ++i3) {
                object = cmz2.c(bqk2, i3);
                dbk dbk5 = arrdbk[i3];
                if (dbk5 == null || iu2.n((cmz)object).a() == ahk.a) continue;
                iu2.a((cmz)object, dbk5.a(c, Boolean.valueOf(bl6)), 3);
            }
        }
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        this.a(iu2, cmz2, dbk2, false, true, -1, null);
    }

    private void a(iu iu2, cmz cmz2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        if (bl3 && !bl5) {
            iu2.a(null, cmz2, dah.gC, csg.e, 0.4f, 0.6f);
        } else if (!bl3 && bl5) {
            iu2.a(null, cmz2, dah.gB, csg.e, 0.4f, 0.5f);
        } else if (bl2 && !bl4) {
            iu2.a(null, cmz2, dah.gA, csg.e, 0.4f, 0.7f);
        } else if (!bl2 && bl4) {
            iu2.a(null, cmz2, dah.gD, csg.e, 0.4f, 1.2f / (iu2.p.nextFloat() * 0.2f + 0.9f));
        }
    }

    private void b(iu iu2, cmz cmz2, bqk bqk2) {
        iu2.b(cmz2, this);
        iu2.b(cmz2.c(bqk2.e()), this);
    }

    private boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (!this.a(iu2, cmz2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
            return false;
        }
        return true;
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2) {
        boolean bl2 = (Boolean)dbk2.b(c);
        boolean bl3 = (Boolean)dbk2.b(b);
        if (bl2 || bl3) {
            this.a(iu2, cmz2, dbk2, true, false, -1, null);
        }
        if (bl3) {
            iu2.b(cmz2, this);
            iu2.b(cmz2.c(((bqk)((Object)dbk2.b(a))).e()), this);
        }
        super.b(iu2, cmz2, dbk2);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return (Boolean)dbk2.b(b) != false ? 15 : 0;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!((Boolean)dbk2.b(b)).booleanValue()) {
            return 0;
        }
        if (dbk2.b(a) == bqk2) {
            return 15;
        }
        return 0;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public kj b() {
        return kj.b;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bqk.b(n2 & 3))).a(b, Boolean.valueOf((n2 & 8) > 0)).a(c, Boolean.valueOf((n2 & 4) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).c();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        if (((Boolean)dbk2.b(c)).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c);
    }
}

