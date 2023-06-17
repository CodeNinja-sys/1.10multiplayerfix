/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ft
extends bfa {
    public static final qf a = qf.a("age", 0, 5);

    protected ft() {
        super(ahk.k);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.a(zm.c);
        this.b(true);
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        int n2;
        int n3;
        if (!this.b(iu2, cmz2)) {
            iu2.b(cmz2, true);
            return;
        }
        cmz cmz3 = cmz2.g();
        if (!iu2.c(cmz3) || cmz3.b() >= 256) {
            return;
        }
        int n4 = (Integer)dbk2.b(a);
        if (n4 >= 5 || random.nextInt(1) != 0) {
            return;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        dbk dbk3 = iu2.n(cmz2.h());
        bfa bfa2 = dbk3.t();
        if (bfa2 == blg.bH) {
            bl2 = true;
        } else if (bfa2 == blg.cR) {
            n3 = 1;
            for (n2 = 0; n2 < 4; ++n2) {
                bfa bfa3 = iu2.n(cmz2.c(n3 + 1)).t();
                if (bfa3 == blg.cR) {
                    ++n3;
                    continue;
                }
                if (bfa3 != blg.bH) break;
                bl3 = true;
                break;
            }
            n2 = 4;
            if (bl3) {
                ++n2;
            }
            if (n3 < 2 || random.nextInt(n2) >= n3) {
                bl2 = true;
            }
        } else if (dbk3.a() == ahk.a) {
            bl2 = true;
        }
        if (bl2 && ft.b(iu2, cmz3, null) && iu2.c(cmz2.b(2))) {
            iu2.a(cmz2, blg.cR.s(), 2);
            this.a(iu2, cmz3, n4);
        } else if (n4 < 4) {
            n3 = random.nextInt(4);
            n2 = 0;
            if (bl3) {
                ++n3;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                bqk bqk2 = afj.a.a(random);
                cmz cmz4 = cmz2.c(bqk2);
                if (!iu2.c(cmz4) || !iu2.c(cmz4.h()) || !ft.b(iu2, cmz4, bqk2.e())) continue;
                this.a(iu2, cmz4, n4 + 1);
                n2 = 1;
            }
            if (n2 != 0) {
                iu2.a(cmz2, blg.cR.s(), 2);
            } else {
                this.c(iu2, cmz2);
            }
        } else if (n4 == 4) {
            this.c(iu2, cmz2);
        }
    }

    private void a(iu iu2, cmz cmz2, int n2) {
        iu2.a(cmz2, this.s().a(a, Integer.valueOf(n2)), 2);
        iu2.b(1033, cmz2, 0);
    }

    private void c(iu iu2, cmz cmz2) {
        iu2.a(cmz2, this.s().a(a, Integer.valueOf(5)), 2);
        iu2.b(1034, cmz2, 0);
    }

    private static boolean b(iu iu2, cmz cmz2, bqk bqk2) {
        for (bqk bqk3 : afj.a) {
            if (bqk3 == bqk2 || iu2.c(cmz2.c(bqk3))) continue;
            return false;
        }
        return true;
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
    public boolean a(iu iu2, cmz cmz2) {
        return super.a(iu2, cmz2) && this.b(iu2, cmz2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!this.b(iu2, cmz2)) {
            iu2.a(cmz2, (bfa)this, 1);
        }
    }

    public boolean b(iu iu2, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2.h());
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.cR || bfa2 == blg.bH) {
            return true;
        }
        if (dbk2.a() == ahk.a) {
            int n2 = 0;
            for (bqk bqk2 : afj.a) {
                dbk dbk3 = iu2.n(cmz2.c(bqk2));
                bfa bfa3 = dbk3.t();
                if (bfa3 == blg.cR) {
                    ++n2;
                    continue;
                }
                if (dbk3.a() == ahk.a) continue;
                return false;
            }
            return n2 == 1;
        }
        return false;
    }

    @Override
    public void a(iu iu2, bdl bdl2, cmz cmz2, dbk dbk2, bql bql2, bhl bhl2) {
        super.a(iu2, bdl2, cmz2, dbk2, bql2, bhl2);
        ft.a(iu2, cmz2, new bhl(azg.a(this)));
    }

    @Override
    protected bhl a_(dbk dbk2) {
        return null;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        super.a(iu2, cmz2, dbk2);
    }

    public static void a(iu iu2, cmz cmz2, Random random, int n2) {
        iu2.a(cmz2, blg.cR.s(), 2);
        ft.a(iu2, cmz2, random, cmz2, n2, 0);
    }

    private static void a(iu iu2, cmz cmz2, Random random, cmz cmz3, int n2, int n3) {
        int n4;
        int n5 = random.nextInt(4) + 1;
        if (n3 == 0) {
            ++n5;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            cmz cmz4 = cmz2.b(n4 + 1);
            if (!ft.b(iu2, cmz4, null)) {
                return;
            }
            iu2.a(cmz4, blg.cR.s(), 2);
        }
        n4 = 0;
        if (n3 < 4) {
            int n6 = random.nextInt(4);
            if (n3 == 0) {
                ++n6;
            }
            for (int i2 = 0; i2 < n6; ++i2) {
                bqk bqk2 = afj.a.a(random);
                cmz cmz5 = cmz2.b(n5).c(bqk2);
                if (Math.abs(cmz5.a() - cmz3.a()) >= n2 || Math.abs(cmz5.c() - cmz3.c()) >= n2 || !iu2.c(cmz5) || !iu2.c(cmz5.h()) || !ft.b(iu2, cmz5, bqk2.e())) continue;
                n4 = 1;
                iu2.a(cmz5, blg.cR.s(), 2);
                ft.a(iu2, cmz5, random, cmz3, n2, n3 + 1);
            }
        }
        if (n4 == 0) {
            iu2.a(cmz2.b(n5), blg.cS.s().a(a, Integer.valueOf(5)), 2);
        }
    }
}

