/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dx
extends cli {
    public static final byc a = byc.a("part", ahh.class);
    public static final ddi b = ddi.b("occupied");
    protected static final cxt c = new cxt(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);

    public dx() {
        super(ahk.n);
        this.D(this.O.b().a(a, (Comparable)((Object)ahh.b)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        Object object;
        if (iu2.C) {
            return true;
        }
        if (dbk2.b(a) != ahh.a && (dbk2 = iu2.n(cmz2 = cmz2.c((bqk)((Object)dbk2.b(j))))).t() != this) {
            return true;
        }
        if (!iu2.q.f() || iu2.a(cmz2) == cff.j) {
            iu2.f(cmz2);
            cmz cmz3 = cmz2.c(((bqk)((Object)dbk2.b(j))).e());
            if (iu2.n(cmz3).t() == this) {
                iu2.f(cmz3);
            }
            iu2.a(null, (double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, 5.0f, true, true);
            return true;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            object = this.c(iu2, cmz2);
            if (object == null) {
                dbk2 = dbk2.a(b, Boolean.valueOf(false));
                iu2.a(cmz2, dbk2, 4);
            } else {
                bdl2.b(new du("tile.bed.occupied", new Object[0]));
                return true;
            }
        }
        if ((object = bdl2.a(cmz2)) == bqd.a) {
            dbk2 = dbk2.a(b, Boolean.valueOf(true));
            iu2.a(cmz2, dbk2, 4);
            return true;
        }
        if (object == bqd.c) {
            bdl2.b(new du("tile.bed.noSleep", new Object[0]));
        } else if (object == bqd.f) {
            bdl2.b(new du("tile.bed.notSafe", new Object[0]));
        }
        return true;
    }

    private bdl c(iu iu2, cmz cmz2) {
        for (bdl bdl2 : iu2.g) {
            if (!bdl2.H_() || !bdl2.C.equals(cmz2)) continue;
            return bdl2;
        }
        return null;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(j));
        if (dbk2.b(a) == ahh.a) {
            if (iu2.n(cmz2.c(bqk2.e())).t() != this) {
                iu2.f(cmz2);
            }
        } else if (iu2.n(cmz2.c(bqk2)).t() != this) {
            iu2.f(cmz2);
            if (!iu2.C) {
                this.b(iu2, cmz2, dbk2, 0);
            }
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (dbk2.b(a) == ahh.a) {
            return null;
        }
        return hp.bh;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c;
    }

    public static cmz a(iu iu2, cmz cmz2, int n2) {
        bqk bqk2 = (bqk)((Object)iu2.n(cmz2).b(j));
        int n3 = cmz2.a();
        int n4 = cmz2.b();
        int n5 = cmz2.c();
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n6 = n3 - bqk2.h() * i2 - 1;
            int n7 = n5 - bqk2.j() * i2 - 1;
            int n8 = n6 + 2;
            int n9 = n7 + 2;
            for (int i3 = n6; i3 <= n8; ++i3) {
                for (int i4 = n7; i4 <= n9; ++i4) {
                    cmz cmz3 = new cmz(i3, n4, i4);
                    if (!dx.b(iu2, cmz3)) continue;
                    if (n2 > 0) {
                        --n2;
                        continue;
                    }
                    return cmz3;
                }
            }
        }
        return null;
    }

    protected static boolean b(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.h()).q() && !iu2.n(cmz2).a().a() && !iu2.n(cmz2.g()).a().a();
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        if (dbk2.b(a) == ahh.b) {
            super.a(iu2, cmz2, dbk2, f2, 0);
        }
    }

    @Override
    public bez j(dbk dbk2) {
        return bez.b;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(hp.bh);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2) {
        cmz cmz3;
        if (bdl2.G.d && dbk2.b(a) == ahh.a && iu2.n(cmz3 = cmz2.c(((bqk)((Object)dbk2.b(j))).e())).t() == this) {
            iu2.f(cmz3);
        }
    }

    @Override
    public dbk a(int n2) {
        bqk bqk2 = bqk.b(n2);
        if ((n2 & 8) > 0) {
            return this.s().a(a, (Comparable)((Object)ahh.a)).a(j, (Comparable)((Object)bqk2)).a(b, Boolean.valueOf((n2 & 4) > 0));
        }
        return this.s().a(a, (Comparable)((Object)ahh.b)).a(j, (Comparable)((Object)bqk2));
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        dbk dbk3;
        if (dbk2.b(a) == ahh.b && (dbk3 = bnj2.n(cmz2.c((bqk)((Object)dbk2.b(j))))).t() == this) {
            dbk2 = dbk2.a(b, dbk3.b(b));
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(j, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(j)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(j))));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(j))).c();
        if (dbk2.b(a) == ahh.a) {
            n2 |= 8;
            if (((Boolean)dbk2.b(b)).booleanValue()) {
                n2 |= 4;
            }
        }
        return n2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, j, a, b);
    }
}

