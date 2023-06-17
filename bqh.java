/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class bqh
extends lp
implements btz {
    public static final byc a = byc.a("type", zg.class);
    public static final qf c = qf.a("stage", 0, 1);
    protected static final cxt d = new cxt(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);

    protected bqh() {
        this.D(this.O.b().a(a, (Comparable)((Object)zg.a)).a(c, Integer.valueOf(0)));
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return d;
    }

    @Override
    public String az_() {
        return caf.a(this.n() + "." + zg.a.d() + ".name");
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        super.a(iu2, cmz2, dbk2, random);
        if (iu2.j(cmz2.g()) >= 9 && random.nextInt(7) == 0) {
            this.c(iu2, cmz2, dbk2, random);
        }
    }

    public void c(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if ((Integer)dbk2.b(c) == 0) {
            iu2.a(cmz2, dbk2.a(c), 4);
        } else {
            this.d(iu2, cmz2, dbk2, random);
        }
    }

    public void d(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        dbk dbk3;
        ko ko2 = random.nextInt(10) == 0 ? new hl(true) : new ctj(true);
        int n2 = 0;
        int n3 = 0;
        boolean bl2 = false;
        switch ((zg)((Object)dbk2.b(a))) {
            case b: {
                block7: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(iu2, cmz2, n2, n3, zg.b)) continue;
                        ko2 = new asf(false, random.nextBoolean());
                        bl2 = true;
                        break block7;
                    }
                }
                if (bl2) break;
                n2 = 0;
                n3 = 0;
                ko2 = new akf(true);
                break;
            }
            case c: {
                ko2 = new bpb(true, false);
                break;
            }
            case d: {
                dbk3 = blg.r.s().a(ff.a, (Comparable)((Object)zg.d));
                dbk dbk4 = blg.t.s().a(dbo.e, (Comparable)((Object)zg.d)).a(aai.b, Boolean.valueOf(false));
                block9: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(iu2, cmz2, n2, n3, zg.d)) continue;
                        ko2 = new bma(true, 10, 20, dbk3, dbk4);
                        bl2 = true;
                        break block9;
                    }
                }
                if (bl2) break;
                n2 = 0;
                n3 = 0;
                ko2 = new ctj(true, 4 + random.nextInt(7), dbk3, dbk4, false);
                break;
            }
            case e: {
                ko2 = new bmc(true);
                break;
            }
            case f: {
                block11: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(iu2, cmz2, n2, n3, zg.f)) continue;
                        ko2 = new ddz(true);
                        bl2 = true;
                        break block11;
                    }
                }
                if (bl2) break;
                return;
            }
        }
        dbk3 = blg.a.s();
        if (bl2) {
            iu2.a(cmz2.e(n2, 0, n3), dbk3, 4);
            iu2.a(cmz2.e(n2 + 1, 0, n3), dbk3, 4);
            iu2.a(cmz2.e(n2, 0, n3 + 1), dbk3, 4);
            iu2.a(cmz2.e(n2 + 1, 0, n3 + 1), dbk3, 4);
        } else {
            iu2.a(cmz2, dbk3, 4);
        }
        if (!((to)ko2).a(iu2, random, cmz2.e(n2, 0, n3))) {
            if (bl2) {
                iu2.a(cmz2.e(n2, 0, n3), dbk2, 4);
                iu2.a(cmz2.e(n2 + 1, 0, n3), dbk2, 4);
                iu2.a(cmz2.e(n2, 0, n3 + 1), dbk2, 4);
                iu2.a(cmz2.e(n2 + 1, 0, n3 + 1), dbk2, 4);
            } else {
                iu2.a(cmz2, dbk2, 4);
            }
        }
    }

    private boolean a(iu iu2, cmz cmz2, int n2, int n3, zg zg2) {
        return this.a(iu2, cmz2.e(n2, 0, n3), zg2) && this.a(iu2, cmz2.e(n2 + 1, 0, n3), zg2) && this.a(iu2, cmz2.e(n2, 0, n3 + 1), zg2) && this.a(iu2, cmz2.e(n2 + 1, 0, n3 + 1), zg2);
    }

    public boolean a(iu iu2, cmz cmz2, zg zg2) {
        dbk dbk2 = iu2.n(cmz2);
        return dbk2.t() == this && dbk2.b(a) == zg2;
    }

    @Override
    public int d(dbk dbk2) {
        return ((zg)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (zg zg2 : zg.values()) {
            list.add(new bhl(azg2, 1, zg2.b()));
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return (double)iu2.p.nextFloat() < 0.45;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        this.c(iu2, cmz2, dbk2, random);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)zg.a(n2 & 7))).a(c, Integer.valueOf((n2 & 8) >> 3));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((zg)((Object)dbk2.b(a))).b();
        return n2 |= (Integer)dbk2.b(c) << 3;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, c);
    }
}

