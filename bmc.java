/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bmc
extends ko {
    private static final dbk a = blg.s.s().a(bjc.a, (Comparable)((Object)zg.e));
    private static final dbk b = blg.u.s().a(bfy.e, (Comparable)((Object)zg.e)).a(aai.b, Boolean.valueOf(false));

    public bmc(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2;
        int n3;
        int n4;
        int n5 = random.nextInt(3) + random.nextInt(3) + 5;
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n5 + 1 > 256) {
            return false;
        }
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n5; ++i2) {
            int n6 = 1;
            if (i2 == cmz2.b()) {
                n6 = 0;
            }
            if (i2 >= cmz2.b() + 1 + n5 - 2) {
                n6 = 2;
            }
            pj pj2 = new pj();
            for (n4 = cmz2.a() - n6; n4 <= cmz2.a() + n6 && bl2; ++n4) {
                for (n3 = cmz2.c() - n6; n3 <= cmz2.c() + n6 && bl2; ++n3) {
                    if (i2 >= 0 && i2 < 256) {
                        if (this.a(iu2.n(pj2.a(n4, i2, n3)).t())) continue;
                        bl2 = false;
                        continue;
                    }
                    bl2 = false;
                }
            }
        }
        if (!bl2) {
            return false;
        }
        bfa bfa2 = iu2.n(cmz2.h()).t();
        if (bfa2 != blg.c && bfa2 != blg.d || cmz2.b() >= 256 - n5 - 1) {
            return false;
        }
        this.a(iu2, cmz2.h());
        bqk bqk2 = afj.a.a(random);
        int n7 = n5 - random.nextInt(4) - 1;
        n4 = 3 - random.nextInt(3);
        n3 = cmz2.a();
        int n8 = cmz2.c();
        int n9 = 0;
        for (int i3 = 0; i3 < n5; ++i3) {
            cmz cmz3;
            ahk ahk2;
            n2 = cmz2.b() + i3;
            if (i3 >= n7 && n4 > 0) {
                n3 += bqk2.h();
                n8 += bqk2.j();
                --n4;
            }
            if ((ahk2 = iu2.n(cmz3 = new cmz(n3, n2, n8)).a()) != ahk.a && ahk2 != ahk.j) continue;
            this.b(iu2, cmz3);
            n9 = n2;
        }
        Object object = new cmz(n3, n9, n8);
        for (n2 = -3; n2 <= 3; ++n2) {
            for (int i4 = -3; i4 <= 3; ++i4) {
                if (Math.abs(n2) == 3 && Math.abs(i4) == 3) continue;
                this.c(iu2, ((cmz)object).e(n2, 0, i4));
            }
        }
        object = ((cmz)object).g();
        for (n2 = -1; n2 <= 1; ++n2) {
            for (int i5 = -1; i5 <= 1; ++i5) {
                this.c(iu2, ((cmz)object).e(n2, 0, i5));
            }
        }
        this.c(iu2, ((cmz)object).g(2));
        this.c(iu2, ((cmz)object).f(2));
        this.c(iu2, ((cmz)object).e(2));
        this.c(iu2, ((cmz)object).d(2));
        n3 = cmz2.a();
        n8 = cmz2.c();
        object = afj.a.a(random);
        if (object != bqk2) {
            int n10;
            n2 = n7 - random.nextInt(2) - 1;
            int n11 = 1 + random.nextInt(3);
            n9 = 0;
            for (int i6 = n2; i6 < n5 && n11 > 0; ++i6, --n11) {
                if (i6 < 1) continue;
                n10 = cmz2.b() + i6;
                cmz cmz4 = new cmz(n3 += ((bqk)object).h(), n10, n8 += ((bqk)object).j());
                ahk ahk3 = iu2.n(cmz4).a();
                if (ahk3 != ahk.a && ahk3 != ahk.j) continue;
                this.b(iu2, cmz4);
                n9 = n10;
            }
            if (n9 > 0) {
                cmz cmz5 = new cmz(n3, n9, n8);
                for (n10 = -2; n10 <= 2; ++n10) {
                    for (int i7 = -2; i7 <= 2; ++i7) {
                        if (Math.abs(n10) == 2 && Math.abs(i7) == 2) continue;
                        this.c(iu2, cmz5.e(n10, 0, i7));
                    }
                }
                cmz5 = cmz5.g();
                for (n10 = -1; n10 <= 1; ++n10) {
                    for (int i8 = -1; i8 <= 1; ++i8) {
                        this.c(iu2, cmz5.e(n10, 0, i8));
                    }
                }
            }
        }
        return true;
    }

    private void b(iu iu2, cmz cmz2) {
        this.a(iu2, cmz2, a);
    }

    private void c(iu iu2, cmz cmz2) {
        ahk ahk2 = iu2.n(cmz2).a();
        if (ahk2 == ahk.a || ahk2 == ahk.j) {
            this.a(iu2, cmz2, b);
        }
    }
}

