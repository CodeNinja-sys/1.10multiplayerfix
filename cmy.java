/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cmy
extends bfa {
    public static boolean f;

    public cmy() {
        super(ahk.p);
        this.a(zm.b);
    }

    public cmy(ahk ahk2) {
        super(ahk2);
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        iu2.a(cmz2, (bfa)this, this.a(iu2));
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        iu2.a(cmz2, (bfa)this, this.a(iu2));
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (!iu2.C) {
            this.c(iu2, cmz2);
        }
    }

    private void c(iu iu2, cmz cmz2) {
        if (!cmy.n(iu2.n(cmz2.h())) || cmz2.b() < 0) {
            return;
        }
        int n2 = 32;
        if (f || !iu2.a(cmz2.e(-32, -32, -32), cmz2.e(32, 32, 32))) {
            iu2.f(cmz2);
            cmz cmz3 = cmz2.h();
            while (cmy.n(iu2.n(cmz3)) && cmz3.b() > 0) {
                cmz3 = cmz3.h();
            }
            if (cmz3.b() > 0) {
                iu2.a(cmz3.g(), this.s());
            }
        } else if (!iu2.C) {
            azb azb2 = new azb(iu2, (double)cmz2.a() + 0.5, cmz2.b(), (double)cmz2.c() + 0.5, iu2.n(cmz2));
            this.a(azb2);
            iu2.b(azb2);
        }
    }

    protected void a(azb azb2) {
    }

    @Override
    public int a(iu iu2) {
        return 2;
    }

    public static boolean n(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        ahk ahk2 = dbk2.a();
        return bfa2 == blg.ab || ahk2 == ahk.a || ahk2 == ahk.h || ahk2 == ahk.i;
    }

    public void b(iu iu2, cmz cmz2) {
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        cmz cmz3;
        if (random.nextInt(16) == 0 && cmy.n(iu2.n(cmz3 = cmz2.h()))) {
            double d2 = (float)cmz2.a() + random.nextFloat();
            double d3 = (double)cmz2.b() - 0.05;
            double d4 = (float)cmz2.c() + random.nextFloat();
            iu2.a(lz.U, d2, d3, d4, 0.0, 0.0, 0.0, bfa.u(dbk2));
        }
    }

    public int m(dbk dbk2) {
        return -16777216;
    }
}

