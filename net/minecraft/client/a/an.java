/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.ax;
import net.minecraft.client.a.bg;
import net.minecraft.client.a.cb;
import net.minecraft.client.a.f;
import net.minecraft.client.g.g;
import net.minecraft.client.r;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.m;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;
import net.minecraft.u.bv;

public class an
extends cb {
    private int b;
    private final f L;
    private q M;
    boolean a;

    public an(k k2, double d2, double d3, double d4, double d5, double d6, double d7, f f2, e e2) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.L = f2;
        this.x = 8;
        if (e2 != null) {
            this.M = e2.c("Explosions", 10);
            if (this.M.c()) {
                this.M = null;
            } else {
                this.x = this.M.e() * 2 - 1;
                for (int i2 = 0; i2 < this.M.e(); ++i2) {
                    e e3 = this.M.b(i2);
                    if (!e3.p("Flicker")) continue;
                    this.a = true;
                    this.x += 15;
                    break;
                }
            }
        }
    }

    @Override
    public void a(g g2, net.minecraft.w.n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void b() {
        int n2;
        if (this.b == 0 && this.M != null) {
            n2 = this.l();
            boolean bl2 = false;
            if (this.M.e() >= 3) {
                bl2 = true;
            } else {
                for (int i2 = 0; i2 < this.M.e(); ++i2) {
                    e e2 = this.M.b(i2);
                    if (e2.f("Type") != 1) continue;
                    bl2 = true;
                    break;
                }
            }
            bv bv2 = bl2 ? (n2 != 0 ? net.minecraft.a.f.br : net.minecraft.a.f.bq) : (n2 != 0 ? net.minecraft.a.f.bp : net.minecraft.a.f.bo);
            this.c.a(this.g, this.h, this.i, bv2, bu.i, 20.0f, 0.95f + this.r.nextFloat() * 0.1f, true);
        }
        if (this.b % 2 == 0 && this.M != null && this.b / 2 < this.M.e()) {
            n2 = this.b / 2;
            e e3 = this.M.b(n2);
            byte by2 = e3.f("Type");
            boolean bl3 = e3.p("Trail");
            boolean bl4 = e3.p("Flicker");
            int[] arrn = e3.n("Colors");
            int[] arrn2 = e3.n("FadeColors");
            if (arrn.length == 0) {
                arrn = new int[]{net.minecraft.m.m.a[0]};
            }
            if (by2 == 1) {
                this.a(0.5, 4, arrn, arrn2, bl3, bl4);
            } else if (by2 == 2) {
                this.a(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, arrn, arrn2, bl3, bl4, false);
            } else if (by2 == 3) {
                this.a(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, arrn, arrn2, bl3, bl4, true);
            } else if (by2 == 4) {
                this.a(arrn, arrn2, bl3, bl4);
            } else {
                this.a(0.25, 2, arrn, arrn2, bl3, bl4);
            }
            int n3 = arrn[0];
            float f2 = (float)((n3 & 0xFF0000) >> 16) / 255.0f;
            float f3 = (float)((n3 & 0xFF00) >> 8) / 255.0f;
            float f4 = (float)((n3 & 0xFF) >> 0) / 255.0f;
            bg bg2 = new bg(this.c, this.g, this.h, this.i);
            bg2.a(f2, f3, f4);
            this.L.a(bg2);
        }
        ++this.b;
        if (this.b > this.x) {
            if (this.a) {
                n2 = this.l() ? 1 : 0;
                bv bv3 = n2 != 0 ? net.minecraft.a.f.bv : net.minecraft.a.f.bu;
                this.c.a(this.g, this.h, this.i, bv3, bu.i, 20.0f, 0.9f + this.r.nextFloat() * 0.15f, true);
            }
            this.h();
        }
    }

    private boolean l() {
        r r2 = net.minecraft.client.r.z();
        return r2 == null || r2.Z() == null || r2.Z().h(this.g, this.h, this.i) >= 256.0;
    }

    private void a(double d2, double d3, double d4, double d5, double d6, double d7, int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        ax ax2 = new ax(this.c, d2, d3, d4, d5, d6, d7, this.L);
        ax2.d(0.99f);
        ax2.a(bl2);
        ax2.b(bl3);
        int n2 = this.r.nextInt(arrn.length);
        ax2.a(arrn[n2]);
        if (arrn2 != null && arrn2.length > 0) {
            ax2.b(arrn2[this.r.nextInt(arrn2.length)]);
        }
        this.L.a(ax2);
    }

    private void a(double d2, int n2, int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        double d3 = this.g;
        double d4 = this.h;
        double d5 = this.i;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    double d6 = (double)i3 + (this.r.nextDouble() - this.r.nextDouble()) * 0.5;
                    double d7 = (double)i2 + (this.r.nextDouble() - this.r.nextDouble()) * 0.5;
                    double d8 = (double)i4 + (this.r.nextDouble() - this.r.nextDouble()) * 0.5;
                    double d9 = (double)net.minecraft.u.b.n.a(d6 * d6 + d7 * d7 + d8 * d8) / d2 + this.r.nextGaussian() * 0.05;
                    this.a(d3, d4, d5, d6 / d9, d7 / d9, d8 / d9, arrn, arrn2, bl2, bl3);
                    if (i2 == -n2 || i2 == n2 || i3 == -n2 || i3 == n2) continue;
                    i4 += n2 * 2 - 1;
                }
            }
        }
    }

    private void a(double d2, double[][] arrd, int[] arrn, int[] arrn2, boolean bl2, boolean bl3, boolean bl4) {
        double d3 = arrd[0][0];
        double d4 = arrd[0][1];
        this.a(this.g, this.h, this.i, d3 * d2, d4 * d2, 0.0, arrn, arrn2, bl2, bl3);
        float f2 = this.r.nextFloat() * (float)Math.PI;
        double d5 = bl4 ? 0.034 : 0.34;
        for (int i2 = 0; i2 < 3; ++i2) {
            double d6 = (double)f2 + (double)((float)i2 * (float)Math.PI) * d5;
            double d7 = d3;
            double d8 = d4;
            for (int i3 = 1; i3 < arrd.length; ++i3) {
                double d9 = arrd[i3][0];
                double d10 = arrd[i3][1];
                for (double d11 = 0.25; d11 <= 1.0; d11 += 0.25) {
                    double d12 = (d7 + (d9 - d7) * d11) * d2;
                    double d13 = (d8 + (d10 - d8) * d11) * d2;
                    double d14 = d12 * Math.sin(d6);
                    d12 *= Math.cos(d6);
                    for (double d15 = -1.0; d15 <= 1.0; d15 += 2.0) {
                        this.a(this.g, this.h, this.i, d12 * d15, d13, d14 * d15, arrn, arrn2, bl2, bl3);
                    }
                }
                d7 = d9;
                d8 = d10;
            }
        }
    }

    private void a(int[] arrn, int[] arrn2, boolean bl2, boolean bl3) {
        double d2 = this.r.nextGaussian() * 0.05;
        double d3 = this.r.nextGaussian() * 0.05;
        for (int i2 = 0; i2 < 70; ++i2) {
            double d4 = this.j * 0.5 + this.r.nextGaussian() * 0.15 + d2;
            double d5 = this.l * 0.5 + this.r.nextGaussian() * 0.15 + d3;
            double d6 = this.k * 0.5 + this.r.nextDouble() * 0.5;
            this.a(this.g, this.h, this.i, d4, d6, d5, arrn, arrn2, bl2, bl3);
        }
    }

    @Override
    public int a() {
        return 0;
    }
}

