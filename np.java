/*
 * Decompiled with CFR 0.150.
 */
public class np
extends qa {
    private final float a;
    private boolean K;

    protected np(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.i = d5;
        this.j = d6;
        this.k = d7;
        this.z = cmk.a(this.q, 0.7176471f, 0.8745098f);
        this.A = cmk.a(this.q, 0.0f, 0.0f);
        this.B = cmk.a(this.q, 0.8235294f, 0.9764706f);
        this.x *= 0.75f;
        this.a = this.x;
        this.w = (int)(20.0 / ((double)this.q.nextFloat() * 0.8 + 0.2));
        this.K = false;
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        if (this.v++ >= this.w) {
            this.h();
            return;
        }
        this.d(3 * this.v / this.w + 5);
        if (this.l) {
            this.j = 0.0;
            this.K = true;
        }
        if (this.K) {
            this.j += 0.002;
        }
        this.a(this.i, this.j, this.k);
        if (this.g == this.d) {
            this.i *= 1.1;
            this.k *= 1.1;
        }
        this.i *= (double)0.96f;
        this.k *= (double)0.96f;
        if (this.K) {
            this.j *= (double)0.96f;
        }
    }

    @Override
    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.x = this.a * cmk.a(((float)this.v + f2) / (float)this.w * 32.0f, 0.0f, 1.0f);
        super.a(bix2, cpk2, f2, f3, f4, f5, f6, f7);
    }
}

