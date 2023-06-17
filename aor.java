/*
 * Decompiled with CFR 0.150.
 */
public class aor
extends qa {
    float a;
    final float K;

    protected aor(iu iu2, double d2, double d3, double d4, float f2, float f3, float f4) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
        this.z = f2;
        this.A = f3;
        this.B = f4;
        float f5 = 0.9f;
        this.x *= 0.75f;
        this.x *= 0.9f;
        this.a = this.x;
        this.w = (int)(32.0 / (Math.random() * 0.8 + 0.2));
        this.w = (int)((float)this.w * 0.9f);
        this.K = ((float)Math.random() - 0.5f) * 0.1f;
        this.E = (float)Math.random() * ((float)Math.PI * 2);
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
        this.F = this.E;
        this.E += (float)Math.PI * this.K * 2.0f;
        if (this.l) {
            this.E = 0.0f;
            this.F = 0.0f;
        }
        this.d(7 - this.v * 8 / this.w);
        this.a(this.i, this.j, this.k);
        this.j -= (double)0.003f;
        this.j = Math.max(this.j, (double)-0.14f);
    }
}

