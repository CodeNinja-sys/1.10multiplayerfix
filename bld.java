/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.Random;

public class bld
extends to {
    private final dbk a;
    private final int b;
    private final cm c;

    public bld(dbk dbk2, int n2) {
        this(dbk2, n2, bqa.a(blg.b));
    }

    public bld(dbk dbk2, int n2, cm cm2) {
        this.a = dbk2;
        this.b = n2;
        this.c = cm2;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        float f2 = random.nextFloat() * (float)Math.PI;
        double d2 = (float)(cmz2.a() + 8) + cmk.a(f2) * (float)this.b / 8.0f;
        double d3 = (float)(cmz2.a() + 8) - cmk.a(f2) * (float)this.b / 8.0f;
        double d4 = (float)(cmz2.c() + 8) + cmk.b(f2) * (float)this.b / 8.0f;
        double d5 = (float)(cmz2.c() + 8) - cmk.b(f2) * (float)this.b / 8.0f;
        double d6 = cmz2.b() + random.nextInt(3) - 2;
        double d7 = cmz2.b() + random.nextInt(3) - 2;
        for (int i2 = 0; i2 < this.b; ++i2) {
            float f3 = (float)i2 / (float)this.b;
            double d8 = d2 + (d3 - d2) * (double)f3;
            double d9 = d6 + (d7 - d6) * (double)f3;
            double d10 = d4 + (d5 - d4) * (double)f3;
            double d11 = random.nextDouble() * (double)this.b / 16.0;
            double d12 = (double)(cmk.a((float)Math.PI * f3) + 1.0f) * d11 + 1.0;
            double d13 = (double)(cmk.a((float)Math.PI * f3) + 1.0f) * d11 + 1.0;
            int n2 = cmk.c(d8 - d12 / 2.0);
            int n3 = cmk.c(d9 - d13 / 2.0);
            int n4 = cmk.c(d10 - d12 / 2.0);
            int n5 = cmk.c(d8 + d12 / 2.0);
            int n6 = cmk.c(d9 + d13 / 2.0);
            int n7 = cmk.c(d10 + d12 / 2.0);
            for (int i3 = n2; i3 <= n5; ++i3) {
                double d14 = ((double)i3 + 0.5 - d8) / (d12 / 2.0);
                if (!(d14 * d14 < 1.0)) continue;
                for (int i4 = n3; i4 <= n6; ++i4) {
                    double d15 = ((double)i4 + 0.5 - d9) / (d13 / 2.0);
                    if (!(d14 * d14 + d15 * d15 < 1.0)) continue;
                    for (int i5 = n4; i5 <= n7; ++i5) {
                        cmz cmz3;
                        double d16 = ((double)i5 + 0.5 - d10) / (d12 / 2.0);
                        if (!(d14 * d14 + d15 * d15 + d16 * d16 < 1.0) || !this.c.a(iu2.n(cmz3 = new cmz(i3, i4, i5)))) continue;
                        iu2.a(cmz3, this.a, 2);
                    }
                }
            }
        }
        return true;
    }
}

