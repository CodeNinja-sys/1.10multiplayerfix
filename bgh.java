/*
 * Decompiled with CFR 0.150.
 */
public class bgh
extends qa {
    float a;

    protected bgh(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        float f2;
        float f3 = 2.5f;
        this.i *= (double)0.1f;
        this.j *= (double)0.1f;
        this.k *= (double)0.1f;
        this.i += d5;
        this.j += d6;
        this.k += d7;
        this.z = f2 = 1.0f - (float)(Math.random() * (double)0.3f);
        this.A = f2;
        this.B = f2;
        this.x *= 0.75f;
        this.x *= 2.5f;
        this.a = this.x;
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.w = (int)((float)this.w * 2.5f);
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
        this.i *= (double)0.96f;
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        bdl bdl2 = this.b.a(this.f, this.g, this.h, 2.0, false);
        if (bdl2 != null) {
            cxt cxt2 = bdl2.cD();
            if (this.g > cxt2.b) {
                this.g += (cxt2.b - this.g) * 0.2;
                this.j += (bdl2.aY - this.j) * 0.2;
                this.b(this.f, this.g, this.h);
            }
        }
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

