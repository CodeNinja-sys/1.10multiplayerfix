/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ast
extends lp
implements btz {
    protected static final cxt a = new cxt(0.3f, 0.0, 0.3f, 0.7f, 0.4f, 0.7f);

    protected ast() {
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
    }

    @Override
    public void a(iu iu2, cmz object, dbk dbk2, Random random) {
        if (random.nextInt(25) == 0) {
            int n2 = 5;
            int n3 = 4;
            for (cmz cmz2 : cmz.b(((cmz)object).e(-4, -1, -4), ((cmz)object).e(4, 1, 4))) {
                if (iu2.n(cmz2).t() != this || --n2 > 0) continue;
                return;
            }
            Object object2 = ((cmz)object).e(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i2 = 0; i2 < 4; ++i2) {
                if (iu2.c((cmz)object2) && this.e(iu2, (cmz)object2, this.s())) {
                    object = object2;
                }
                object2 = ((cmz)object).e(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (iu2.c((cmz)object2) && this.e(iu2, (cmz)object2, this.s())) {
                iu2.a((cmz)object2, this.s(), 2);
            }
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return super.a(iu2, cmz2) && this.e(iu2, cmz2, this.s());
    }

    @Override
    protected boolean m(dbk dbk2) {
        return dbk2.b();
    }

    @Override
    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (cmz2.b() < 0 || cmz2.b() >= 256) {
            return false;
        }
        dbk dbk3 = iu2.n(cmz2.h());
        if (dbk3.t() == blg.bw) {
            return true;
        }
        if (dbk3.t() == blg.d && dbk3.b(bwt.a) == dgu.c) {
            return true;
        }
        return iu2.i(cmz2) < 13 && this.m(dbk3);
    }

    public boolean c(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        iu2.f(cmz2);
        axx axx2 = null;
        if (this == blg.P) {
            axx2 = new axx(blg.bg);
        } else if (this == blg.Q) {
            axx2 = new axx(blg.bh);
        }
        if (axx2 != null && ((to)axx2).a(iu2, random, cmz2)) {
            return true;
        }
        iu2.a(cmz2, dbk2, 3);
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        this.c(iu2, cmz2, dbk2, random);
    }
}

