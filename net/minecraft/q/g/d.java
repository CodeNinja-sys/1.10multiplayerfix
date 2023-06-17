/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.q.f.e;
import net.minecraft.q.g.u;
import net.minecraft.q.k;
import net.minecraft.u.b.n;

public class d
extends u {
    protected static final b a = p.a.v();

    protected void a(long l2, int n2, int n3, e e2, double d2, double d3, double d4) {
        this.a(l2, n2, n3, e2, d2, d3, d4, 1.0f + this.f.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    protected void a(long l2, int n2, int n3, e e2, double d2, double d3, double d4, float f2, float f3, float f4, int n4, int n5, double d5) {
        int n6;
        double d6 = n2 * 16 + 8;
        double d7 = n3 * 16 + 8;
        float f5 = 0.0f;
        float f6 = 0.0f;
        Random random = new Random(l2);
        if (n5 <= 0) {
            n6 = this.e * 16 - 16;
            n5 = n6 - random.nextInt(n6 / 4);
        }
        n6 = 0;
        if (n4 == -1) {
            n4 = n5 / 2;
            n6 = 1;
        }
        int n7 = random.nextInt(n5 / 2) + n5 / 4;
        boolean bl2 = random.nextInt(6) == 0;
        while (n4 < n5) {
            double d8 = 1.5 + (double)(n.a((float)n4 * (float)Math.PI / (float)n5) * f2);
            double d9 = d8 * d5;
            float f7 = n.b(f4);
            float f8 = n.a(f4);
            d2 += (double)(n.b(f3) * f7);
            d3 += (double)f8;
            d4 += (double)(n.a(f3) * f7);
            f4 = bl2 ? (f4 *= 0.92f) : (f4 *= 0.7f);
            f4 += f6 * 0.1f;
            f3 += f5 * 0.1f;
            f6 *= 0.9f;
            f5 *= 0.75f;
            f6 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (n6 == 0 && n4 == n7 && f2 > 1.0f) {
                this.a(random.nextLong(), n2, n3, e2, d2, d3, d4, random.nextFloat() * 0.5f + 0.5f, f3 - 1.5707964f, f4 / 3.0f, n4, n5, 1.0);
                this.a(random.nextLong(), n2, n3, e2, d2, d3, d4, random.nextFloat() * 0.5f + 0.5f, f3 + 1.5707964f, f4 / 3.0f, n4, n5, 1.0);
                return;
            }
            if (n6 != 0 || random.nextInt(4) != 0) {
                double d10 = d2 - d6;
                double d11 = d4 - d7;
                double d12 = n5 - n4;
                double d13 = f2 + 2.0f + 16.0f;
                if (d10 * d10 + d11 * d11 - d12 * d12 > d13 * d13) {
                    return;
                }
                if (d2 >= d6 - 16.0 - d8 * 2.0 && d4 >= d7 - 16.0 - d8 * 2.0 && d2 <= d6 + 16.0 + d8 * 2.0 && d4 <= d7 + 16.0 + d8 * 2.0) {
                    int n8;
                    int n9 = n.c(d2 - d8) - n2 * 16 - 1;
                    int n10 = n.c(d2 + d8) - n2 * 16 + 1;
                    int n11 = n.c(d3 - d9) - 1;
                    int n12 = n.c(d3 + d9) + 1;
                    int n13 = n.c(d4 - d8) - n3 * 16 - 1;
                    int n14 = n.c(d4 + d8) - n3 * 16 + 1;
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 > 16) {
                        n10 = 16;
                    }
                    if (n11 < 1) {
                        n11 = 1;
                    }
                    if (n12 > 120) {
                        n12 = 120;
                    }
                    if (n13 < 0) {
                        n13 = 0;
                    }
                    if (n14 > 16) {
                        n14 = 16;
                    }
                    boolean bl3 = false;
                    for (n8 = n9; !bl3 && n8 < n10; ++n8) {
                        for (int i2 = n13; !bl3 && i2 < n14; ++i2) {
                            for (int i3 = n12 + 1; !bl3 && i3 >= n11 - 1; --i3) {
                                if (i3 < 0 || i3 >= 128) continue;
                                b b2 = e2.a(n8, i3, i2);
                                if (b2.c() == p.k || b2.c() == p.l) {
                                    bl3 = true;
                                }
                                if (i3 == n11 - 1 || n8 == n9 || n8 == n10 - 1 || i2 == n13 || i2 == n14 - 1) continue;
                                i3 = n11;
                            }
                        }
                    }
                    if (!bl3) {
                        for (n8 = n9; n8 < n10; ++n8) {
                            double d14 = ((double)(n8 + n2 * 16) + 0.5 - d2) / d8;
                            for (int i4 = n13; i4 < n14; ++i4) {
                                double d15 = ((double)(i4 + n3 * 16) + 0.5 - d4) / d8;
                                for (int i5 = n12; i5 > n11; --i5) {
                                    b b3;
                                    double d16 = ((double)(i5 - 1) + 0.5 - d3) / d9;
                                    if (!(d16 > -0.7) || !(d14 * d14 + d16 * d16 + d15 * d15 < 1.0) || (b3 = e2.a(n8, i5, i4)).c() != p.aV && b3.c() != p.d && b3.c() != p.c) continue;
                                    e2.a(n8, i5, i4, a);
                                }
                            }
                        }
                        if (n6 != 0) break;
                    }
                }
            }
            ++n4;
        }
    }

    @Override
    protected void a(k k2, int n2, int n3, int n4, int n5, e e2) {
        int n6 = this.f.nextInt(this.f.nextInt(this.f.nextInt(10) + 1) + 1);
        if (this.f.nextInt(5) != 0) {
            n6 = 0;
        }
        for (int i2 = 0; i2 < n6; ++i2) {
            double d2 = n2 * 16 + this.f.nextInt(16);
            double d3 = this.f.nextInt(128);
            double d4 = n3 * 16 + this.f.nextInt(16);
            int n7 = 1;
            if (this.f.nextInt(4) == 0) {
                this.a(this.f.nextLong(), n4, n5, e2, d2, d3, d4);
                n7 += this.f.nextInt(4);
            }
            for (int i3 = 0; i3 < n7; ++i3) {
                float f2 = this.f.nextFloat() * ((float)Math.PI * 2);
                float f3 = (this.f.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f4 = this.f.nextFloat() * 2.0f + this.f.nextFloat();
                this.a(this.f.nextLong(), n4, n5, e2, d2, d3, d4, f4 * 2.0f, f2, f3, 0, 0, 0.5);
            }
        }
    }
}

