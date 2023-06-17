/*
 * Decompiled with CFR 0.150.
 */
public class aui
extends qa {
    private final float a;
    private final double K;
    private final double L;
    private final double M;

    protected aui(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.i = d5;
        this.j = d6;
        this.k = d7;
        this.K = d2;
        this.L = d3;
        this.M = d4;
        this.c = d2 + d5;
        this.d = d3 + d6;
        this.e = d4 + d7;
        this.f = this.c;
        this.g = this.d;
        this.h = this.e;
        float f2 = this.q.nextFloat() * 0.6f + 0.4f;
        this.a = this.x = this.q.nextFloat() * 0.5f + 0.2f;
        this.z = 0.9f * f2;
        this.A = 0.9f * f2;
        this.B = f2;
        this.w = (int)(Math.random() * 10.0) + 30;
        this.d((int)(Math.random() * 26.0 + 1.0 + 224.0));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
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
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        float f2 = (float)this.v / (float)this.w;
        f2 = 1.0f - f2;
        float f3 = 1.0f - f2;
        f3 *= f3;
        f3 *= f3;
        this.f = this.K + this.i * (double)f2;
        this.g = this.L + this.j * (double)f2 - (double)(f3 * 1.2f);
        this.h = this.M + this.k * (double)f2;
        if (this.v++ >= this.w) {
            this.h();
        }
    }
}

