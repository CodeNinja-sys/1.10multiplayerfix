/*
 * Decompiled with CFR 0.150.
 */
public class asz
extends qa {
    protected asz(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        float f2;
        this.z = f2 = this.q.nextFloat() * 0.1f + 0.2f;
        this.A = f2;
        this.B = f2;
        this.d(0);
        this.a(0.02f, 0.02f);
        this.x *= this.q.nextFloat() * 0.6f + 0.5f;
        this.i *= (double)0.02f;
        this.j *= (double)0.02f;
        this.k *= (double)0.02f;
        this.w = (int)(20.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a(this.k().c(d2, d3, d4));
        this.i();
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        this.a(this.i, this.j, this.k);
        this.i *= 0.99;
        this.j *= 0.99;
        this.k *= 0.99;
        if (this.w-- <= 0) {
            this.h();
        }
    }
}

