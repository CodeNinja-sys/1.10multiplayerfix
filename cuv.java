/*
 * Decompiled with CFR 0.150.
 */
public class cuv
extends qa {
    float a;

    protected cuv(iu iu2, double d2, double d3, double d4, float f2, float f3, float f4) {
        this(iu2, d2, d3, d4, 1.0f, f2, f3, f4);
    }

    protected cuv(iu iu2, double d2, double d3, double d4, float f2, float f3, float f4, float f5) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i *= (double)0.1f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        if (f3 == 0.0f) {
            f3 = 1.0f;
        }
        float f6 = (float)Math.random() * 0.4f + 0.6f;
        this.z = ((float)(Math.random() * (double)0.2f) + 0.8f) * f3 * f6;
        this.A = ((float)(Math.random() * (double)0.2f) + 0.8f) * f4 * f6;
        this.B = ((float)(Math.random() * (double)0.2f) + 0.8f) * f5 * f6;
        this.x *= 0.75f;
        this.x *= f2;
        this.a = this.x;
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.w = (int)((float)this.w * f2);
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
        this.d(7 - this.v * 8 / this.w);
        this.a(this.i, this.j, this.k);
        if (this.g == this.d) {
            this.i *= 1.1;
            this.k *= 1.1;
        }
        this.i *= (double)0.96f;
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

