/*
 * Decompiled with CFR 0.150.
 */
public class bvr
extends qa {
    protected bvr(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3 - 0.125, d4, d5, d6, d7);
        this.z = 0.4f;
        this.A = 0.4f;
        this.B = 0.7f;
        this.d(0);
        this.a(0.01f, 0.01f);
        this.x *= this.q.nextFloat() * 0.6f + 0.2f;
        this.i = d5 * 0.0;
        this.j = d6 * 0.0;
        this.k = d7 * 0.0;
        this.w = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        this.a(this.i, this.j, this.k);
        if (this.b.n(new cmz(this.f, this.g, this.h)).a() != ahk.h) {
            this.h();
        }
        if (this.w-- <= 0) {
            this.h();
        }
    }
}

