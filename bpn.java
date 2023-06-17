/*
 * Decompiled with CFR 0.150.
 */
public class bpn
extends qa {
    private final float a;

    protected bpn(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i *= (double)0.8f;
        this.j *= (double)0.8f;
        this.k *= (double)0.8f;
        this.j = this.q.nextFloat() * 0.4f + 0.05f;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.x *= this.q.nextFloat() * 2.0f + 0.2f;
        this.a = this.x;
        this.w = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.d(49);
    }

    @Override
    public int a(float f2) {
        int n2 = super.a(f2);
        int n3 = 240;
        int n4 = n2 >> 16 & 0xFF;
        return 0xF0 | n4 << 16;
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.v + f2) / (float)this.w;
        this.x = this.a * (1.0f - f8 * f8);
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
        float f2 = (float)this.v / (float)this.w;
        if (this.q.nextFloat() > f2) {
            this.b.a(lz.l, this.f, this.g, this.h, this.i, this.j, this.k, new int[0]);
        }
        this.j -= 0.03;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.999f;
        this.j *= (double)0.999f;
        this.k *= (double)0.999f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

