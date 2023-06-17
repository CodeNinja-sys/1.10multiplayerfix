/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bqi
extends bfa {
    private final boolean a;

    public bqi(boolean bl2) {
        super(ahk.e);
        if (bl2) {
            this.b(true);
        }
        this.a = bl2;
    }

    @Override
    public int a(iu iu2) {
        return 30;
    }

    @Override
    public void a(iu iu2, cmz cmz2, bdl bdl2) {
        this.c(iu2, cmz2);
        super.a(iu2, cmz2, bdl2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, cpk cpk2) {
        this.c(iu2, cmz2);
        super.a(iu2, cmz2, cpk2);
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        this.c(iu2, cmz2);
        return super.a(iu2, cmz2, dbk2, bdl2, bqp2, bhl2, bqk2, f2, f3, f4);
    }

    private void c(iu iu2, cmz cmz2) {
        this.d(iu2, cmz2);
        if (this == blg.aC) {
            iu2.a(cmz2, blg.aD.s());
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (this == blg.aD) {
            iu2.a(cmz2, blg.aC.s());
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return hp.aE;
    }

    @Override
    public int a(int n2, Random random) {
        return this.a(random) + random.nextInt(n2 + 1);
    }

    @Override
    public int a(Random random) {
        return 4 + random.nextInt(2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        super.a(iu2, cmz2, dbk2, f2, n2);
        if (this.a(dbk2, iu2.p, n2) != azg.a(this)) {
            int n3 = 1 + iu2.p.nextInt(5);
            this.b(iu2, cmz2, n3);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (this.a) {
            this.d(iu2, cmz2);
        }
    }

    private void d(iu iu2, cmz cmz2) {
        Random random = iu2.p;
        double d2 = 0.0625;
        for (int i2 = 0; i2 < 6; ++i2) {
            double d3 = (float)cmz2.a() + random.nextFloat();
            double d4 = (float)cmz2.b() + random.nextFloat();
            double d5 = (float)cmz2.c() + random.nextFloat();
            if (i2 == 0 && !iu2.n(cmz2.g()).p()) {
                d4 = (double)cmz2.b() + 0.0625 + 1.0;
            }
            if (i2 == 1 && !iu2.n(cmz2.h()).p()) {
                d4 = (double)cmz2.b() - 0.0625;
            }
            if (i2 == 2 && !iu2.n(cmz2.j()).p()) {
                d5 = (double)cmz2.c() + 0.0625 + 1.0;
            }
            if (i2 == 3 && !iu2.n(cmz2.i()).p()) {
                d5 = (double)cmz2.c() - 0.0625;
            }
            if (i2 == 4 && !iu2.n(cmz2.l()).p()) {
                d3 = (double)cmz2.a() + 0.0625 + 1.0;
            }
            if (i2 == 5 && !iu2.n(cmz2.k()).p()) {
                d3 = (double)cmz2.a() - 0.0625;
            }
            if (!(d3 < (double)cmz2.a() || d3 > (double)(cmz2.a() + 1) || d4 < 0.0 || d4 > (double)(cmz2.b() + 1) || d5 < (double)cmz2.c()) && !(d5 > (double)(cmz2.c() + 1))) continue;
            iu2.a(lz.E, d3, d4, d5, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected bhl a_(dbk dbk2) {
        return new bhl(blg.aC);
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(azg.a(blg.aC), 1, this.d(dbk2));
    }
}

