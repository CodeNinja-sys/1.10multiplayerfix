/*
 * Decompiled with CFR 0.150.
 */
public class ape
extends qa {
    protected ape(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.d(32);
        this.a(0.02f, 0.02f);
        this.x *= this.q.nextFloat() * 0.6f + 0.2f;
        this.i = d5 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.j = d6 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.k = d7 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        this.j += 0.002;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.85f;
        this.j *= (double)0.85f;
        this.k *= (double)0.85f;
        if (this.b.n(new cmz(this.f, this.g, this.h)).a() != ahk.h) {
            this.h();
        }
        if (this.w-- <= 0) {
            this.h();
        }
    }
}

