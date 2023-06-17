/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class md
extends bfa {
    protected static final cxt a = new cxt(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375);

    public md() {
        super(ahk.D, bif.E);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return a;
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
        this.c(iu2, cmz2);
    }

    private void c(iu iu2, cmz cmz2) {
        if (!cmy.n(iu2.n(cmz2.h())) || cmz2.b() < 0) {
            return;
        }
        int n2 = 32;
        if (cmy.f || !iu2.a(cmz2.e(-32, -32, -32), cmz2.e(32, 32, 32))) {
            iu2.f(cmz2);
            cmz cmz3 = cmz2;
            while (cmy.n(iu2.n(cmz3)) && cmz3.b() > 0) {
                cmz3 = cmz3.h();
            }
            if (cmz3.b() > 0) {
                iu2.a(cmz3, this.s(), 2);
            }
        } else {
            iu2.b(new azb(iu2, (float)cmz2.a() + 0.5f, cmz2.b(), (float)cmz2.c() + 0.5f, this.s()));
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        this.d(iu2, cmz2);
        return true;
    }

    @Override
    public void a(iu iu2, cmz cmz2, bdl bdl2) {
        this.d(iu2, cmz2);
    }

    private void d(iu iu2, cmz cmz2) {
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.t() != this) {
            return;
        }
        for (int i2 = 0; i2 < 1000; ++i2) {
            cmz cmz3 = cmz2.e(iu2.p.nextInt(16) - iu2.p.nextInt(16), iu2.p.nextInt(8) - iu2.p.nextInt(8), iu2.p.nextInt(16) - iu2.p.nextInt(16));
            if (iu2.n((cmz)cmz3).t().L != ahk.a) continue;
            if (iu2.C) {
                for (int i3 = 0; i3 < 128; ++i3) {
                    double d2 = iu2.p.nextDouble();
                    float f2 = (iu2.p.nextFloat() - 0.5f) * 0.2f;
                    float f3 = (iu2.p.nextFloat() - 0.5f) * 0.2f;
                    float f4 = (iu2.p.nextFloat() - 0.5f) * 0.2f;
                    double d3 = (double)cmz3.a() + (double)(cmz2.a() - cmz3.a()) * d2 + (iu2.p.nextDouble() - 0.5) + 0.5;
                    double d4 = (double)cmz3.b() + (double)(cmz2.b() - cmz3.b()) * d2 + iu2.p.nextDouble() - 0.5;
                    double d5 = (double)cmz3.c() + (double)(cmz2.c() - cmz3.c()) * d2 + (iu2.p.nextDouble() - 0.5) + 0.5;
                    iu2.a(lz.y, d3, d4, d5, (double)f2, (double)f3, (double)f4, new int[0]);
                }
            } else {
                iu2.a(cmz3, dbk2, 2);
                iu2.f(cmz2);
            }
            return;
        }
    }

    @Override
    public int a(iu iu2) {
        return 5;
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
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return true;
    }
}

