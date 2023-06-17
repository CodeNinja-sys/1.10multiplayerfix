/*
 * Decompiled with CFR 0.150.
 */
public class cfi
extends qa {
    protected cfi(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i *= (double)0.3f;
        this.j = Math.random() * (double)0.2f + (double)0.1f;
        this.k *= (double)0.3f;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.d(19);
        this.a(0.01f, 0.01f);
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.y = 0.0f;
        this.i = d5;
        this.j = d6;
        this.k = d7;
    }

    @Override
    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        this.j -= (double)this.y;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.98f;
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        int n2 = 60 - this.w;
        float f2 = (float)n2 * 0.001f;
        this.a(f2, f2);
        this.d(19 + n2 % 4);
        if (this.w-- <= 0) {
            this.h();
        }
    }
}

