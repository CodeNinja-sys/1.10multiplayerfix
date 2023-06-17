/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class sg
extends bfa {
    public static final ddi a = ddi.b("snowy");

    protected sg() {
        super(ahk.b, bif.z);
        this.D(this.O.b().a(a, Boolean.valueOf(false)));
        this.b(true);
        this.a(zm.b);
    }

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        bfa bfa2 = bnj2.n(cmz2.g()).t();
        return dbk2.a(a, Boolean.valueOf(bfa2 == blg.aJ || bfa2 == blg.aH));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        if (iu2.j(cmz2.g()) < 4 && iu2.n(cmz2.g()).c() > 2) {
            iu2.a(cmz2, blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)));
            return;
        }
        if (iu2.j(cmz2.g()) >= 9) {
            for (int i2 = 0; i2 < 4; ++i2) {
                cmz cmz3 = cmz2.e(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                dbk dbk3 = iu2.n(cmz3);
                dbk dbk4 = iu2.n(cmz3.g());
                if (dbk3.t() != blg.d || dbk3.b(bwt.a) != dgu.a || iu2.j(cmz3.g()) < 4 || dbk4.c() > 2) continue;
                iu2.a(cmz3, this.s());
            }
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        super.a(dbk2, iu2, cmz2, random);
        if (random.nextInt(10) == 0) {
            iu2.a(lz.w, (double)((float)cmz2.a() + random.nextFloat()), (double)((float)cmz2.b() + 1.1f), (double)((float)cmz2.c() + random.nextFloat()), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return blg.d.a(blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)), random, n2);
    }

    @Override
    public int e(dbk dbk2) {
        return 0;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

