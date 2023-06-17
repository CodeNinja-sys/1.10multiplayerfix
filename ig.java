/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ig
extends ar {
    protected ig(ahk ahk2) {
        super(ahk2);
        this.a(1.0f);
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new bii();
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        dbk dbk3 = bnj2.n(cmz2.c(bqk2));
        bfa bfa2 = dbk3.t();
        return !dbk3.p() && bfa2 != blg.db;
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
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof bii)) {
            return;
        }
        int n2 = ((bii)bql2).o();
        for (int i2 = 0; i2 < n2; ++i2) {
            double d2 = (float)cmz2.a() + random.nextFloat();
            double d3 = (float)cmz2.b() + random.nextFloat();
            double d4 = (float)cmz2.c() + random.nextFloat();
            double d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d7 = ((double)random.nextFloat() - 0.5) * 0.5;
            int n3 = random.nextInt(2) * 2 - 1;
            if (random.nextBoolean()) {
                d4 = (double)cmz2.c() + 0.5 + 0.25 * (double)n3;
                d7 = random.nextFloat() * 2.0f * (float)n3;
            } else {
                d2 = (double)cmz2.a() + 0.5 + 0.25 * (double)n3;
                d5 = random.nextFloat() * 2.0f * (float)n3;
            }
            iu2.a(lz.y, d2, d3, d4, d5, d6, d7, new int[0]);
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return null;
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.E;
    }
}

