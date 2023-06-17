/*
 * Decompiled with CFR 0.150.
 */
public class lj
extends qa {
    private final float a;

    protected lj(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.i = this.i * (double)0.01f + d5;
        this.j = this.j * (double)0.01f + d6;
        this.k = this.k * (double)0.01f + d7;
        this.f += (double)((this.q.nextFloat() - this.q.nextFloat()) * 0.05f);
        this.g += (double)((this.q.nextFloat() - this.q.nextFloat()) * 0.05f);
        this.h += (double)((this.q.nextFloat() - this.q.nextFloat()) * 0.05f);
        this.a = this.x;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.d(48);
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.v + f2) / (float)this.w;
        this.x = this.a * (1.0f - f8 * f8 * 0.5f);
        super.a(bix2, cpk2, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public int a(float f2) {
        float f3 = ((float)this.v + f2) / (float)this.w;
        f3 = cmk.a(f3, 0.0f, 1.0f);
        int n2 = super.a(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
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
        this.i *= (double)0.96f;
        this.j *= (double)0.96f;
        this.k *= (double)0.96f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

