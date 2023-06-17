/*
 * Decompiled with CFR 0.150.
 */
public class cum
extends qa {
    protected cum(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
        this.w = 4;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 0.25f;
        float f9 = 0.5f;
        float f10 = 0.125f;
        float f11 = 0.375f;
        float f12 = 7.1f * cmk.a(((float)this.v + f2 - 1.0f) * 0.25f * (float)Math.PI);
        this.d(0.6f - ((float)this.v + f2 - 1.0f) * 0.25f * 0.5f);
        float f13 = (float)(this.c + (this.f - this.c) * (double)f2 - G);
        float f14 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f15 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        int n2 = this.a(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        bix2.b((double)(f13 - f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 - f5 * f12 - f7 * f12)).a(0.5, 0.375).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
        bix2.b((double)(f13 - f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 - f5 * f12 + f7 * f12)).a(0.5, 0.125).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
        bix2.b((double)(f13 + f3 * f12 + f6 * f12), (double)(f14 + f4 * f12), (double)(f15 + f5 * f12 + f7 * f12)).a(0.25, 0.125).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
        bix2.b((double)(f13 + f3 * f12 - f6 * f12), (double)(f14 - f4 * f12), (double)(f15 + f5 * f12 - f7 * f12)).a(0.25, 0.375).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
    }
}

