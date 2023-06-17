/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class kd
extends lp
implements btz {
    public static final qf a = qf.a("age", 0, 7);
    private static final cxt[] c = new cxt[]{new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.625, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.75, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.875, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 1.0, 1.0)};

    protected kd() {
        this.D(this.O.b().a(this.d(), Integer.valueOf(0)));
        this.b(true);
        this.a((zm)null);
        this.c(0.0f);
        this.a(acv.c);
        this.p();
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c[(Integer)dbk2.b(this.d())];
    }

    @Override
    protected boolean m(dbk dbk2) {
        return dbk2.t() == blg.ak;
    }

    protected qf d() {
        return a;
    }

    public int e() {
        return 7;
    }

    protected int n(dbk dbk2) {
        return (Integer)dbk2.b(this.d());
    }

    public dbk b(int n2) {
        return this.s().a(this.d(), Integer.valueOf(n2));
    }

    public boolean o(dbk dbk2) {
        return (Integer)dbk2.b(this.d()) >= this.e();
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        float f2;
        int n2;
        super.a(iu2, cmz2, dbk2, random);
        if (iu2.j(cmz2.g()) >= 9 && (n2 = this.n(dbk2)) < this.e() && random.nextInt((int)(25.0f / (f2 = kd.a(this, iu2, cmz2))) + 1) == 0) {
            iu2.a(cmz2, this.b(n2 + 1), 2);
        }
    }

    public void d(iu iu2, cmz cmz2, dbk dbk2) {
        int n2;
        int n3 = this.n(dbk2) + this.b(iu2);
        if (n3 > (n2 = this.e())) {
            n3 = n2;
        }
        iu2.a(cmz2, this.b(n3), 2);
    }

    protected int b(iu iu2) {
        return cmk.a(iu2.p, 2, 5);
    }

    protected static float a(bfa bfa2, iu iu2, cmz cmz2) {
        boolean bl2;
        Object object;
        float f2 = 1.0f;
        cmz cmz3 = cmz2.h();
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                float f3 = 0.0f;
                object = iu2.n(cmz3.e(i2, 0, i3));
                if (object.t() == blg.ak) {
                    f3 = 1.0f;
                    if ((Integer)object.b(dgf.a) > 0) {
                        f3 = 3.0f;
                    }
                }
                if (i2 != 0 || i3 != 0) {
                    f3 /= 4.0f;
                }
                f2 += f3;
            }
        }
        cmz cmz4 = cmz2.i();
        cmz cmz5 = cmz2.j();
        cmz cmz6 = cmz2.k();
        object = cmz2.l();
        boolean bl3 = bfa2 == iu2.n(cmz6).t() || bfa2 == iu2.n((cmz)object).t();
        boolean bl4 = bl2 = bfa2 == iu2.n(cmz4).t() || bfa2 == iu2.n(cmz5).t();
        if (bl3 && bl2) {
            f2 /= 2.0f;
        } else {
            boolean bl5;
            boolean bl6 = bl5 = bfa2 == iu2.n(cmz6.i()).t() || bfa2 == iu2.n(((cmz)object).i()).t() || bfa2 == iu2.n(((cmz)object).j()).t() || bfa2 == iu2.n(cmz6.j()).t();
            if (bl5) {
                f2 /= 2.0f;
            }
        }
        return f2;
    }

    @Override
    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        return (iu2.i(cmz2) >= 8 || iu2.g(cmz2)) && this.m(iu2.n(cmz2.h()));
    }

    protected azg f() {
        return hp.P;
    }

    protected azg g() {
        return hp.Q;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        super.a(iu2, cmz2, dbk2, f2, 0);
        if (iu2.C) {
            return;
        }
        int n3 = this.n(dbk2);
        if (n3 >= this.e()) {
            int n4 = 3 + n2;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (iu2.p.nextInt(2 * this.e()) > n3) continue;
                kd.a(iu2, cmz2, new bhl(this.f()));
            }
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        if (this.o(dbk2)) {
            return this.g();
        }
        return this.f();
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return new bhl(this.f());
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        return !this.o(dbk2);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        return true;
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2, dbk dbk2) {
        this.d(iu2, cmz2, dbk2);
    }

    @Override
    public dbk a(int n2) {
        return this.b(n2);
    }

    @Override
    public int e(dbk dbk2) {
        return this.n(dbk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

