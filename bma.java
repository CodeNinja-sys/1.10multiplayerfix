/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bma
extends cza {
    public bma(boolean bl2, int n2, int n3, dbk dbk2, dbk dbk3) {
        super(bl2, n2, n3, dbk2, dbk3);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        int n2 = this.a(random);
        if (!this.a(iu2, random, cmz2, n2)) {
            return false;
        }
        this.c(iu2, cmz2.b(n2), 2);
        for (int i2 = cmz2.b() + n2 - 2 - random.nextInt(4); i2 > cmz2.b() + n2 / 2; i2 -= 2 + random.nextInt(4)) {
            int n3;
            float f2 = random.nextFloat() * ((float)Math.PI * 2);
            int n4 = cmz2.a() + (int)(0.5f + cmk.b(f2) * 4.0f);
            int n5 = cmz2.c() + (int)(0.5f + cmk.a(f2) * 4.0f);
            for (n3 = 0; n3 < 5; ++n3) {
                n4 = cmz2.a() + (int)(1.5f + cmk.b(f2) * (float)n3);
                n5 = cmz2.c() + (int)(1.5f + cmk.a(f2) * (float)n3);
                this.a(iu2, new cmz(n4, i2 - 3 + n3 / 2, n5), this.b);
            }
            n3 = 1 + random.nextInt(2);
            int n6 = i2;
            for (int i3 = n6 - n3; i3 <= n6; ++i3) {
                int n7 = i3 - n6;
                this.b(iu2, new cmz(n4, i3, n5), 1 - n7);
            }
        }
        for (int i4 = 0; i4 < n2; ++i4) {
            cmz cmz3;
            cmz cmz4;
            cmz cmz5 = cmz2.b(i4);
            if (this.a(iu2.n(cmz5).t())) {
                this.a(iu2, cmz5, this.b);
                if (i4 > 0) {
                    this.a(iu2, random, cmz5.k(), ju.c);
                    this.a(iu2, random, cmz5.i(), ju.d);
                }
            }
            if (i4 >= n2 - 1) continue;
            cmz cmz6 = cmz5.l();
            if (this.a(iu2.n(cmz6).t())) {
                this.a(iu2, cmz6, this.b);
                if (i4 > 0) {
                    this.a(iu2, random, cmz6.l(), ju.e);
                    this.a(iu2, random, cmz6.i(), ju.d);
                }
            }
            if (this.a(iu2.n(cmz4 = cmz5.j().l()).t())) {
                this.a(iu2, cmz4, this.b);
                if (i4 > 0) {
                    this.a(iu2, random, cmz4.l(), ju.e);
                    this.a(iu2, random, cmz4.j(), ju.b);
                }
            }
            if (!this.a(iu2.n(cmz3 = cmz5.j()).t())) continue;
            this.a(iu2, cmz3, this.b);
            if (i4 <= 0) continue;
            this.a(iu2, random, cmz3.k(), ju.c);
            this.a(iu2, random, cmz3.j(), ju.b);
        }
        return true;
    }

    private void a(iu iu2, Random random, cmz cmz2, ddi ddi2) {
        if (random.nextInt(3) > 0 && iu2.c(cmz2)) {
            this.a(iu2, cmz2, blg.bn.s().a(ddi2, Boolean.valueOf(true)));
        }
    }

    private void c(iu iu2, cmz cmz2, int n2) {
        int n3 = 2;
        for (int i2 = -2; i2 <= 0; ++i2) {
            this.a(iu2, cmz2.b(i2), n2 + 1 - i2);
        }
    }
}

