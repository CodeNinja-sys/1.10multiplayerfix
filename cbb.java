/*
 * Decompiled with CFR 0.150.
 */
public class cbb
extends qa {
    protected cbb(iu iu2, double d2, double d3, double d4, azg azg2) {
        this(iu2, d2, d3, d4, azg2, 0);
    }

    protected cbb(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, azg azg2, int n2) {
        this(iu2, d2, d3, d4, azg2, n2);
        this.i *= (double)0.1f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.i += d5;
        this.j += d6;
        this.k += d7;
    }

    protected cbb(iu iu2, double d2, double d3, double d4, azg azg2, int n2) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.a(bxy.B().ae().a().a(azg2, n2));
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.y = blg.aJ.K;
        this.x /= 2.0f;
    }

    @Override
    public int f() {
        return 1;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.r + this.t / 4.0f) / 16.0f;
        float f9 = f8 + 0.015609375f;
        float f10 = ((float)this.s + this.u / 4.0f) / 16.0f;
        float f11 = f10 + 0.015609375f;
        float f12 = 0.1f * this.x;
        if (this.D != null) {
            f8 = this.D.a((double)(this.t / 4.0f * 16.0f));
            f9 = this.D.a((double)((this.t + 1.0f) / 4.0f * 16.0f));
            f10 = this.D.b((double)(this.u / 4.0f * 16.0f));
            f11 = this.D.b((double)((this.u + 1.0f) / 4.0f * 16.0f));
        }
        float f13 = (float)(this.c + (this.f - this.c) * (double)f2 - G);
        float f14 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f15 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        int n2 = this.a(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        bix2.b((double)(f13 - f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 - f5 * f12 - f7 * f12)).a(f8, f11).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
        bix2.b((double)(f13 - f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 - f5 * f12 + f7 * f12)).a(f8, f10).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
        bix2.b((double)(f13 + f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 + f5 * f12 + f7 * f12)).a(f9, f10).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
        bix2.b((double)(f13 + f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 + f5 * f12 - f7 * f12)).a(f9, f11).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
    }
}

