/*
 * Decompiled with CFR 0.150.
 */
public class dds
extends qa {
    float a;

    protected dds(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(iu2, d2, d3, d4, d5, d6, d7, 2.0f);
    }

    protected dds(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, float f2) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i *= (double)0.01f;
        this.j *= (double)0.01f;
        this.k *= (double)0.01f;
        this.j += 0.1;
        this.x *= 0.75f;
        this.x *= f2;
        this.a = this.x;
        this.w = 16;
        this.d(80);
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
        if (this.g == this.d) {
            this.i *= 1.1;
            this.k *= 1.1;
        }
        this.i *= (double)0.86f;
        this.j *= (double)0.86f;
        this.k *= (double)0.86f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

