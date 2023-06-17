/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class acb
extends ar {
    protected static final cxt a = new cxt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

    protected acb() {
        super(ahk.e, bif.D);
        this.h(0);
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        super.a(dbk2, iu2, cmz2, random);
        for (int i2 = -2; i2 <= 2; ++i2) {
            block1: for (int i3 = -2; i3 <= 2; ++i3) {
                if (i2 > -2 && i2 < 2 && i3 == -1) {
                    i3 = 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int i4 = 0; i4 <= 1; ++i4) {
                    cmz cmz3 = cmz2.e(i2, i4, i3);
                    if (iu2.n(cmz3).t() != blg.X) continue;
                    if (!iu2.c(cmz2.e(i2 / 2, 0, i3 / 2))) continue block1;
                    iu2.a(lz.z, (double)cmz2.a() + 0.5, (double)cmz2.b() + 2.0, (double)cmz2.c() + 0.5, (double)((float)i2 + random.nextFloat()) - 0.5, (double)((float)i4 - random.nextFloat() - 1.0f), (double)((float)i3 + random.nextFloat()) - 0.5, new int[0]);
                }
            }
        }
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public bql a(iu iu2, int n2) {
        return new app();
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (iu2.C) {
            return true;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof app) {
            bdl2.a((app)bql2);
        }
        return true;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2;
        super.a(iu2, cmz2, dbk2, bga2, bhl2);
        if (bhl2.s() && (bql2 = iu2.q(cmz2)) instanceof app) {
            ((app)bql2).a(bhl2.q());
        }
    }
}

