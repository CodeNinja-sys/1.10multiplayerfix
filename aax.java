/*
 * Decompiled with CFR 0.150.
 */
public class aax
extends qa {
    private final float a;
    private final double K;
    private final double L;
    private final double M;

    protected aax(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.i = d5;
        this.j = d6;
        this.k = d7;
        this.f = d2;
        this.g = d3;
        this.h = d4;
        this.K = this.f;
        this.L = this.g;
        this.M = this.h;
        float f2 = this.q.nextFloat() * 0.6f + 0.4f;
        this.a = this.x = this.q.nextFloat() * 0.2f + 0.5f;
        this.z = f2 * 0.9f;
        this.A = f2 * 0.3f;
        this.B = f2;
        this.w = (int)(Math.random() * 10.0) + 40;
        this.d((int)(Math.random() * 8.0));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.v + f2) / (float)this.w;
        f8 = 1.0f - f8;
        f8 *= f8;
        f8 = 1.0f - f8;
        this.x = this.a * f8;
        super.a(bix2, cpk2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int a(float f2) {
        int n2 = super.a(f2);
        float f3 = (float)this.v / (float)this.w;
        f3 *= f3;
        f3 *= f3;
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n4 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n4 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void b() {
        float f2;
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        float f3 = f2 = (float)this.v / (float)this.w;
        f2 = -f2 + f2 * f2 * 2.0f;
        f2 = 1.0f - f2;
        this.f = this.K + this.i * (double)f2;
        this.g = this.L + this.j * (double)f2 + (double)(1.0f - f3);
        this.h = this.M + this.k * (double)f2;
        if (this.v++ >= this.w) {
            this.h();
        }
    }
}

