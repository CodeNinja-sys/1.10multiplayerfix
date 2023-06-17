/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import com.a.a.b.cm;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.n;

public class y
extends aj {
    private final b a;
    private final int b;
    private final cm c;

    public y(b b2, int n2) {
        this(b2, n2, net.minecraft.g.c.a.b.a(p.b));
    }

    public y(b b2, int n2, cm cm2) {
        this.a = b2;
        this.b = n2;
        this.c = cm2;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        float f2 = random.nextFloat() * (float)Math.PI;
        double d2 = (float)(b2.cy_() + 8) + n.a(f2) * (float)this.b / 8.0f;
        double d3 = (float)(b2.cy_() + 8) - n.a(f2) * (float)this.b / 8.0f;
        double d4 = (float)(b2.l() + 8) + n.b(f2) * (float)this.b / 8.0f;
        double d5 = (float)(b2.l() + 8) - n.b(f2) * (float)this.b / 8.0f;
        double d6 = b2.k() + random.nextInt(3) - 2;
        double d7 = b2.k() + random.nextInt(3) - 2;
        for (int i2 = 0; i2 < this.b; ++i2) {
            float f3 = (float)i2 / (float)this.b;
            double d8 = d2 + (d3 - d2) * (double)f3;
            double d9 = d6 + (d7 - d6) * (double)f3;
            double d10 = d4 + (d5 - d4) * (double)f3;
            double d11 = random.nextDouble() * (double)this.b / 16.0;
            double d12 = (double)(n.a((float)Math.PI * f3) + 1.0f) * d11 + 1.0;
            double d13 = (double)(n.a((float)Math.PI * f3) + 1.0f) * d11 + 1.0;
            int n2 = n.c(d8 - d12 / 2.0);
            int n3 = n.c(d9 - d13 / 2.0);
            int n4 = n.c(d10 - d12 / 2.0);
            int n5 = n.c(d8 + d12 / 2.0);
            int n6 = n.c(d9 + d13 / 2.0);
            int n7 = n.c(d10 + d12 / 2.0);
            for (int i3 = n2; i3 <= n5; ++i3) {
                double d14 = ((double)i3 + 0.5 - d8) / (d12 / 2.0);
                if (!(d14 * d14 < 1.0)) continue;
                for (int i4 = n3; i4 <= n6; ++i4) {
                    double d15 = ((double)i4 + 0.5 - d9) / (d13 / 2.0);
                    if (!(d14 * d14 + d15 * d15 < 1.0)) continue;
                    for (int i5 = n4; i5 <= n7; ++i5) {
                        net.minecraft.u.b.b b3;
                        double d16 = ((double)i5 + 0.5 - d10) / (d12 / 2.0);
                        if (!(d14 * d14 + d15 * d15 + d16 * d16 < 1.0) || !this.c.a(k2.n(b3 = new net.minecraft.u.b.b(i3, i4, i5)))) continue;
                        k2.a(b3, this.a, 2);
                    }
                }
            }
        }
        return true;
    }
}

