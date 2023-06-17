/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.g.d;
import net.minecraft.client.g.i.al;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.ap;
import net.minecraft.w.j;
import net.minecraft.w.l;

public abstract class n
extends al {
    public n(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
    }

    protected boolean b(net.minecraft.w.f f2) {
        return super.a(f2) && (f2.at() || f2.bO_() && f2 == this.c.d);
    }

    public boolean a(net.minecraft.w.f f2, d d2, double d3, double d4, double d5) {
        if (super.a((net.minecraft.w.n)f2, d2, d3, d4, d5)) {
            return true;
        }
        if (f2.aO() && f2.aQ() != null) {
            net.minecraft.w.n n2 = f2.aQ();
            return d2.a(n2.cU());
        }
        return false;
    }

    public void a(net.minecraft.w.f f2, double d2, double d3, double d4, float f3, float f4) {
        super.a(f2, d2, d3, d4, f3, f4);
        if (!this.f) {
            this.b(f2, d2, d3, d4, f3, f4);
        }
    }

    public void a(net.minecraft.w.f f2, float f3) {
        int n2 = f2.m(f3);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        ay.a(ay.r, n3, (float)n4);
    }

    private double a(double d2, double d3, double d4) {
        return d2 + (d3 - d2) * d4;
    }

    protected void b(net.minecraft.w.f f2, double d2, double d3, double d4, float f3, float f4) {
        net.minecraft.w.n n2 = f2.aQ();
        if (n2 != null) {
            float f5;
            float f6;
            float f7;
            float f8;
            int n3;
            d3 -= (1.6 - (double)f2.bm) * 0.5;
            ci ci2 = ci.a();
            g g2 = ci2.c();
            double d5 = this.a((double)n2.bc, (double)n2.ba, (double)(f4 * 0.5f)) * 0.01745329238474369;
            double d6 = this.a((double)n2.bd, (double)n2.bb, (double)(f4 * 0.5f)) * 0.01745329238474369;
            double d7 = Math.cos(d5);
            double d8 = Math.sin(d5);
            double d9 = Math.sin(d6);
            if (n2 instanceof j) {
                d7 = 0.0;
                d8 = 0.0;
                d9 = -1.0;
            }
            double d10 = Math.cos(d6);
            double d11 = this.a(n2.aR, n2.aU, (double)f4) - d7 * 0.7 - d8 * 0.5 * d10;
            double d12 = this.a(n2.aS + (double)n2.ce_() * 0.7, n2.aV + (double)n2.ce_() * 0.7, (double)f4) - d9 * 0.5 - 0.25;
            double d13 = this.a(n2.aT, n2.aW, (double)f4) - d8 * 0.7 + d7 * 0.5 * d10;
            double d14 = this.a((double)f2.al, (double)f2.ak, (double)f4) * 0.01745329238474369 + 1.5707963267948966;
            d7 = Math.cos(d14) * (double)f2.bl * 0.4;
            d8 = Math.sin(d14) * (double)f2.bl * 0.4;
            double d15 = this.a(f2.aR, f2.aU, (double)f4) + d7;
            double d16 = this.a(f2.aS, f2.aV, (double)f4);
            double d17 = this.a(f2.aT, f2.aW, (double)f4) + d8;
            d2 += d7;
            d4 += d8;
            double d18 = (float)(d11 - d15);
            double d19 = (float)(d12 - d16);
            double d20 = (float)(d13 - d17);
            bd.w();
            bd.f();
            bd.q();
            int n4 = 24;
            double d21 = 0.025;
            g2.a(5, b.f);
            for (n3 = 0; n3 <= 24; ++n3) {
                f8 = 0.5f;
                f7 = 0.4f;
                f6 = 0.3f;
                if (n3 % 2 == 0) {
                    f8 *= 0.7f;
                    f7 *= 0.7f;
                    f6 *= 0.7f;
                }
                f5 = (float)n3 / 24.0f;
                g2.b(d2 + d18 * (double)f5 + 0.0, d3 + d19 * (double)(f5 * f5 + f5) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f), d4 + d20 * (double)f5).a(f8, f7, f6, 1.0f).d();
                g2.b(d2 + d18 * (double)f5 + 0.025, d3 + d19 * (double)(f5 * f5 + f5) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f5).a(f8, f7, f6, 1.0f).d();
            }
            ci2.b();
            g2.a(5, b.f);
            for (n3 = 0; n3 <= 24; ++n3) {
                f8 = 0.5f;
                f7 = 0.4f;
                f6 = 0.3f;
                if (n3 % 2 == 0) {
                    f8 *= 0.7f;
                    f7 *= 0.7f;
                    f6 *= 0.7f;
                }
                f5 = (float)n3 / 24.0f;
                g2.b(d2 + d18 * (double)f5 + 0.0, d3 + d19 * (double)(f5 * f5 + f5) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f5).a(f8, f7, f6, 1.0f).d();
                g2.b(d2 + d18 * (double)f5 + 0.025, d3 + d19 * (double)(f5 * f5 + f5) * 0.5 + (double)((24.0f - (float)n3) / 18.0f + 0.125f), d4 + d20 * (double)f5 + 0.025).a(f8, f7, f6, 1.0f).d();
            }
            ci2.b();
            bd.e();
            bd.v();
            bd.p();
        }
    }

    @Override
    protected /* synthetic */ boolean a(l l2) {
        return this.b((net.minecraft.w.f)l2);
    }
}

