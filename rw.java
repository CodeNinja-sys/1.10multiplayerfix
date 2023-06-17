/*
 * Decompiled with CFR 0.150.
 */
public class rw
extends qa {
    protected rw(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        float f2;
        this.i = d5 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.j = d6 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.k = d7 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.z = f2 = this.q.nextFloat() * 0.3f + 0.7f;
        this.A = f2;
        this.B = f2;
        this.x = this.q.nextFloat() * this.q.nextFloat() * 6.0f + 1.0f;
        this.w = (int)(16.0 / ((double)this.q.nextFloat() * 0.8 + 0.2)) + 2;
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
        this.j += 0.004;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.9f;
        this.j *= (double)0.9f;
        this.k *= (double)0.9f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }
}

