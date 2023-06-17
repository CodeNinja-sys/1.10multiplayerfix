/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class asf
extends cza {
    private static final dbk e = blg.r.s().a(ff.a, (Comparable)((Object)zg.b));
    private static final dbk f = blg.t.s().a(dbo.e, (Comparable)((Object)zg.b)).a(aai.b, Boolean.valueOf(false));
    private static final dbk g = blg.d.s().a(bwt.a, (Comparable)((Object)dgu.c));
    private final boolean h;

    public asf(boolean bl2, boolean bl3) {
        super(bl2, 13, 15, e, f);
        this.h = bl3;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2 = this.a(random);
        if (!this.a(iu2, random, cmz2, n2)) {
            return false;
        }
        this.a(iu2, cmz2.a(), cmz2.c(), cmz2.b() + n2, 0, random);
        for (int i2 = 0; i2 < n2; ++i2) {
            dbk dbk2 = iu2.n(cmz2.b(i2));
            if (dbk2.a() == ahk.a || dbk2.a() == ahk.j) {
                this.a(iu2, cmz2.b(i2), this.b);
            }
            if (i2 >= n2 - 1) continue;
            dbk2 = iu2.n(cmz2.e(1, i2, 0));
            if (dbk2.a() == ahk.a || dbk2.a() == ahk.j) {
                this.a(iu2, cmz2.e(1, i2, 0), this.b);
            }
            if ((dbk2 = iu2.n(cmz2.e(1, i2, 1))).a() == ahk.a || dbk2.a() == ahk.j) {
                this.a(iu2, cmz2.e(1, i2, 1), this.b);
            }
            if ((dbk2 = iu2.n(cmz2.e(0, i2, 1))).a() != ahk.a && dbk2.a() != ahk.j) continue;
            this.a(iu2, cmz2.e(0, i2, 1), this.b);
        }
        return true;
    }

    private void a(iu iu2, int n2, int n3, int n4, int n5, Random random) {
        int n6 = random.nextInt(5) + (this.h ? this.a : 3);
        int n7 = 0;
        for (int i2 = n4 - n6; i2 <= n4; ++i2) {
            int n8 = n4 - i2;
            int n9 = n5 + cmk.d((float)n8 / (float)n6 * 3.5f);
            this.a(iu2, new cmz(n2, i2, n3), n9 + (n8 > 0 && n9 == n7 && (i2 & 1) == 0 ? 1 : 0));
            n7 = n9;
        }
    }

    @Override
    public void b(iu iu2, Random random, cmz cmz2) {
        this.b(iu2, cmz2.k().i());
        this.b(iu2, cmz2.g(2).i());
        this.b(iu2, cmz2.k().e(2));
        this.b(iu2, cmz2.g(2).e(2));
        for (int i2 = 0; i2 < 5; ++i2) {
            int n2 = random.nextInt(64);
            int n3 = n2 % 8;
            int n4 = n2 / 8;
            if (n3 != 0 && n3 != 7 && n4 != 0 && n4 != 7) continue;
            this.b(iu2, cmz2.e(-3 + n3, 0, -3 + n4));
        }
    }

    private void b(iu iu2, cmz cmz2) {
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (Math.abs(i2) == 2 && Math.abs(i3) == 2) continue;
                this.c(iu2, cmz2.e(i2, 0, i3));
            }
        }
    }

    private void c(iu iu2, cmz cmz2) {
        for (int i2 = 2; i2 >= -3; --i2) {
            cmz cmz3 = cmz2.b(i2);
            dbk dbk2 = iu2.n(cmz3);
            bfa bfa2 = dbk2.t();
            if (bfa2 == blg.c || bfa2 == blg.d) {
                this.a(iu2, cmz3, g);
                break;
            }
            if (dbk2.a() != ahk.a && i2 < 0) break;
        }
    }
}

