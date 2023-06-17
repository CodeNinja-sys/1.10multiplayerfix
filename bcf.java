/*
 * Decompiled with CFR 0.150.
 */
public abstract class bcf
extends wq {
    public bcf(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
    }

    protected boolean b(xy xy2) {
        return super.c(xy2) && (xy2.F_() || xy2.j_() && xy2 == this.g.d);
    }

    public boolean a(xy xy2, cct cct2, double d2, double d3, double d4) {
        if (super.a((cpk)xy2, cct2, d2, d3, d4)) {
            return true;
        }
        if (xy2.aG() && xy2.aH() != null) {
            cpk cpk2 = xy2.aH();
            return cct2.a(cpk2.M_());
        }
        return false;
    }

    public void a(xy xy2, double d2, double d3, double d4, float f2, float f3) {
        super.a(xy2, d2, d3, d4, f2, f3);
        if (!this.j) {
            this.b(xy2, d2, d3, d4, f2, f3);
        }
    }

    public void a(xy xy2, float f2) {
        int n2 = xy2.b(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
    }

    private double a(double d2, double d3, double d4) {
        return d2 + (d3 - d2) * d4;
    }

    protected void b(xy xy2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        int n2;
        cpk cpk2 = xy2.aH();
        if (cpk2 == null) {
            return;
        }
        d3 -= (1.6 - (double)xy2.bm) * 0.5;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        double d5 = this.a((double)cpk2.bc, (double)cpk2.ba, (double)(f3 * 0.5f)) * 0.01745329238474369;
        double d6 = this.a((double)cpk2.bd, (double)cpk2.bb, (double)(f3 * 0.5f)) * 0.01745329238474369;
        double d7 = Math.cos(d5);
        double d8 = Math.sin(d5);
        double d9 = Math.sin(d6);
        if (cpk2 instanceof gj) {
            d7 = 0.0;
            d8 = 0.0;
            d9 = -1.0;
        }
        double d10 = Math.cos(d6);
        double d11 = this.a(cpk2.aR, cpk2.aU, (double)f3) - d7 * 0.7 - d8 * 0.5 * d10;
        double d12 = this.a(cpk2.aS + (double)cpk2.A() * 0.7, cpk2.aV + (double)cpk2.A() * 0.7, (double)f3) - d9 * 0.5 - 0.25;
        double d13 = this.a(cpk2.aT, cpk2.aW, (double)f3) - d8 * 0.7 + d7 * 0.5 * d10;
        double d14 = this.a((double)xy2.ai, (double)xy2.ah, (double)f3) * 0.01745329238474369 + 1.5707963267948966;
        d7 = Math.cos(d14) * (double)xy2.bl * 0.4;
        d8 = Math.sin(d14) * (double)xy2.bl * 0.4;
        double d15 = this.a(xy2.aR, xy2.aU, (double)f3) + d7;
        double d16 = this.a(xy2.aS, xy2.aV, (double)f3);
        double d17 = this.a(xy2.aT, xy2.aW, (double)f3) + d8;
        d2 += d7;
        d4 += d8;
        double d18 = (float)(d11 - d15);
        double d19 = (float)(d12 - d16);
        double d20 = (float)(d13 - d17);
        cja.w();
        cja.f();
        cja.q();
        int n3 = 24;
        double d21 = 0.025;
        bix2.a(5, bxb.f);
        for (n2 = 0; n2 <= 24; ++n2) {
            f7 = 0.5f;
            f6 = 0.4f;
            f5 = 0.3f;
            if (n2 % 2 == 0) {
                f7 *= 0.7f;
                f6 *= 0.7f;
                f5 *= 0.7f;
            }
            f4 = (float)n2 / 24.0f;
            bix2.b(d2 + d18 * (double)f4 + 0.0, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d4 + d20 * (double)f4).a(f7, f6, f5, 1.0f).d();
            bix2.b(d2 + d18 * (double)f4 + 0.025, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f4).a(f7, f6, f5, 1.0f).d();
        }
        bha2.b();
        bix2.a(5, bxb.f);
        for (n2 = 0; n2 <= 24; ++n2) {
            f7 = 0.5f;
            f6 = 0.4f;
            f5 = 0.3f;
            if (n2 % 2 == 0) {
                f7 *= 0.7f;
                f6 *= 0.7f;
                f5 *= 0.7f;
            }
            f4 = (float)n2 / 24.0f;
            bix2.b(d2 + d18 * (double)f4 + 0.0, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f) + 0.025, d4 + d20 * (double)f4).a(f7, f6, f5, 1.0f).d();
            bix2.b(d2 + d18 * (double)f4 + 0.025, d3 + d19 * (double)(f4 * f4 + f4) * 0.5 + (double)((24.0f - (float)n2) / 18.0f + 0.125f), d4 + d20 * (double)f4 + 0.025).a(f7, f6, f5, 1.0f).d();
        }
        bha2.b();
        cja.e();
        cja.v();
        cja.p();
    }

    @Override
    protected /* synthetic */ boolean c(bga bga2) {
        return this.b((xy)bga2);
    }
}

