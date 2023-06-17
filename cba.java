/*
 * Decompiled with CFR 0.150.
 */
public class cba
extends qa {
    private final dbk a;
    private cmz K;

    protected cba(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, dbk dbk2) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.a = dbk2;
        this.a(bxy.B().ac().a().a(dbk2));
        this.y = dbk2.t().K;
        this.z = 0.6f;
        this.A = 0.6f;
        this.B = 0.6f;
        this.x /= 2.0f;
    }

    public cba a(cmz cmz2) {
        this.K = cmz2;
        if (this.a.t() == blg.c) {
            return this;
        }
        this.b(cmz2);
        return this;
    }

    public cba l() {
        this.K = new cmz(this.f, this.g, this.h);
        bfa bfa2 = this.a.t();
        if (bfa2 == blg.c) {
            return this;
        }
        this.b(null);
        return this;
    }

    protected void b(cmz cmz2) {
        int n2 = bxy.B().al().a(this.a, this.b, cmz2, 0);
        this.z *= (float)(n2 >> 16 & 0xFF) / 255.0f;
        this.A *= (float)(n2 >> 8 & 0xFF) / 255.0f;
        this.B *= (float)(n2 & 0xFF) / 255.0f;
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

    @Override
    public int a(float f2) {
        int n2 = super.a(f2);
        int n3 = 0;
        if (this.b.d(this.K)) {
            n3 = this.b.b(this.K, 0);
        }
        return n2 == 0 ? n3 : n2;
    }
}

