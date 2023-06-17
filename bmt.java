/*
 * Decompiled with CFR 0.150.
 */
public class bmt
extends qa {
    protected bmt(iu iu2, double d2, double d3, double d4, azg azg2) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.a(bxy.B().ae().a().a(azg2));
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
        this.y = 0.0f;
        this.w = 80;
    }

    @Override
    public int f() {
        return 1;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = this.D.e();
        float f9 = this.D.f();
        float f10 = this.D.g();
        float f11 = this.D.h();
        float f12 = 0.5f;
        float f13 = (float)(this.c + (this.f - this.c) * (double)f2 - G);
        float f14 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f15 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        int n2 = this.a(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        bix2.b((double)(f13 - f3 * 0.5f - f6 * 0.5f), (double)(f14 - f4 * 0.5f), (double)(f15 - f5 * 0.5f - f7 * 0.5f)).a(f9, f11).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
        bix2.b((double)(f13 - f3 * 0.5f + f6 * 0.5f), (double)(f14 + f4 * 0.5f), (double)(f15 - f5 * 0.5f + f7 * 0.5f)).a(f9, f10).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
        bix2.b((double)(f13 + f3 * 0.5f + f6 * 0.5f), (double)(f14 + f4 * 0.5f), (double)(f15 + f5 * 0.5f + f7 * 0.5f)).a(f8, f10).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
        bix2.b((double)(f13 + f3 * 0.5f - f6 * 0.5f), (double)(f14 - f4 * 0.5f), (double)(f15 + f5 * 0.5f - f7 * 0.5f)).a(f8, f11).a(this.z, this.A, this.B, 1.0f).a(n3, n4).d();
    }
}

