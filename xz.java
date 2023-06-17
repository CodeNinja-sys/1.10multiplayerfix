/*
 * Decompiled with CFR 0.150.
 */
public class xz
extends qa {
    float a;

    protected xz(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(iu2, d2, d3, d4, d5, d6, d7, 1.0f);
    }

    protected xz(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f3;
        this.i *= (double)0.1f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.i += d5 * 0.4;
        this.j += d6 * 0.4;
        this.k += d7 * 0.4;
        this.z = f3 = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.A = f3;
        this.B = f3;
        this.x *= 0.75f;
        this.x *= f2;
        this.a = this.x;
        this.w = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.w = (int)((float)this.w * f2);
        this.d(65);
        this.b();
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.v + f2) / (float)this.w * 32.0f;
        f8 = cmk.a(f8, 0.0f, 1.0f);
        this.x = this.a * f8;
        super.a(bix2, cpk2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        if (this.v++ >= this.w) {
            this.h();
        }
        this.a(this.i, this.j, this.k);
        this.A = (float)((double)this.A * 0.96);
        this.B = (float)((double)this.B * 0.9);
        this.i *= (double)0.7f;
        this.j *= (double)0.7f;
        this.k *= (double)0.7f;
        this.j -= (double)0.02f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

