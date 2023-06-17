/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import java.util.Random;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.u.bp;
import net.minecraft.w.g.a;
import net.minecraft.w.n;

public class br
extends aa {
    public br(f f2) {
        super(f2);
    }

    public void a(a a2, double d2, double d3, double d4, float f2, float f3) {
        int n2;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        bd.w();
        bd.f();
        bd.l();
        bd.a(ad.l, bc.e);
        double[] arrd = new double[8];
        double[] arrd2 = new double[8];
        double d5 = 0.0;
        double d6 = 0.0;
        Random random = new Random(a2.a);
        for (n2 = 7; n2 >= 0; --n2) {
            arrd[n2] = d5;
            arrd2[n2] = d6;
            d5 += (double)(random.nextInt(11) - 5);
            d6 += (double)(random.nextInt(11) - 5);
        }
        for (n2 = 0; n2 < 4; ++n2) {
            Random random2 = new Random(a2.a);
            for (int i2 = 0; i2 < 3; ++i2) {
                int n3 = 7;
                int n4 = 0;
                if (i2 > 0) {
                    n3 = 7 - i2;
                }
                if (i2 > 0) {
                    n4 = n3 - 2;
                }
                double d7 = arrd[n3] - d5;
                double d8 = arrd2[n3] - d6;
                for (int i3 = n3; i3 >= n4; --i3) {
                    double d9 = d7;
                    double d10 = d8;
                    if (i2 == 0) {
                        d7 += (double)(random2.nextInt(11) - 5);
                        d8 += (double)(random2.nextInt(11) - 5);
                    } else {
                        d7 += (double)(random2.nextInt(31) - 15);
                        d8 += (double)(random2.nextInt(31) - 15);
                    }
                    g2.a(5, b.f);
                    float f4 = 0.5f;
                    float f5 = 0.45f;
                    float f6 = 0.45f;
                    float f7 = 0.5f;
                    double d11 = 0.1 + (double)n2 * 0.2;
                    if (i2 == 0) {
                        d11 *= (double)i3 * 0.1 + 1.0;
                    }
                    double d12 = 0.1 + (double)n2 * 0.2;
                    if (i2 == 0) {
                        d12 *= (double)(i3 - 1) * 0.1 + 1.0;
                    }
                    for (int i4 = 0; i4 < 5; ++i4) {
                        double d13 = d2 + 0.5 - d11;
                        double d14 = d4 + 0.5 - d11;
                        if (i4 == 1 || i4 == 2) {
                            d13 += d11 * 2.0;
                        }
                        if (i4 == 2 || i4 == 3) {
                            d14 += d11 * 2.0;
                        }
                        double d15 = d2 + 0.5 - d12;
                        double d16 = d4 + 0.5 - d12;
                        if (i4 == 1 || i4 == 2) {
                            d15 += d12 * 2.0;
                        }
                        if (i4 == 2 || i4 == 3) {
                            d16 += d12 * 2.0;
                        }
                        g2.b(d15 + d7, d3 + (double)(i3 * 16), d16 + d8).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                        g2.b(d13 + d9, d3 + (double)((i3 + 1) * 16), d14 + d10).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                    }
                    ci2.b();
                }
            }
        }
        bd.k();
        bd.e();
        bd.v();
    }

    protected bp a(a a2) {
        return null;
    }

    @Override
    protected /* synthetic */ bp a(n n2) {
        return this.a((a)n2);
    }
}

