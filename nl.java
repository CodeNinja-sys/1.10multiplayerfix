/*
 * Decompiled with CFR 0.150.
 */
public class nl
extends acr {
    public nl() {
        super(12, 0.0f);
        this.p = 128;
        this.q = 64;
        this.a = new abd(this, 0, 0);
        this.a.a(-3.5f, -3.0f, -3.0f, 7, 7, 7, 0.0f);
        this.a.a(0.0f, 10.0f, -16.0f);
        this.a.a(0, 44).a(-2.5f, 1.0f, -6.0f, 5, 3, 3, 0.0f);
        this.a.a(26, 0).a(-4.5f, -4.0f, -1.0f, 2, 2, 1, 0.0f);
        abd abd2 = this.a.a(26, 0);
        abd2.i = true;
        abd2.a(2.5f, -4.0f, -1.0f, 2, 2, 1, 0.0f);
        this.b = new abd(this);
        this.b.a(0, 19).a(-5.0f, -13.0f, -7.0f, 14, 14, 11, 0.0f);
        this.b.a(39, 0).a(-4.0f, -25.0f, -7.0f, 12, 12, 10, 0.0f);
        this.b.a(-2.0f, 9.0f, 12.0f);
        int n2 = 10;
        this.c = new abd(this, 50, 22);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, 10, 8, 0.0f);
        this.c.a(-3.5f, 14.0f, 6.0f);
        this.d = new abd(this, 50, 22);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 10, 8, 0.0f);
        this.d.a(3.5f, 14.0f, 6.0f);
        this.e = new abd(this, 50, 40);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 10, 6, 0.0f);
        this.e.a(-2.5f, 14.0f, -7.0f);
        this.f = new abd(this, 50, 40);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 10, 6, 0.0f);
        this.f.a(2.5f, 14.0f, -7.0f);
        this.c.c -= 1.0f;
        this.d.c += 1.0f;
        this.c.e += 0.0f;
        this.d.e += 0.0f;
        this.e.c -= 1.0f;
        this.f.c += 1.0f;
        this.e.e -= 1.0f;
        this.f.e -= 1.0f;
        this.h += 2.0f;
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        if (this.n) {
            float f8 = 2.0f;
            this.g = 16.0f;
            this.h = 4.0f;
            cja.D();
            cja.b(0.6666667f, 0.6666667f, 0.6666667f);
            cja.c(0.0f, this.g * f7, this.h * f7);
            this.a.a(f7);
            cja.E();
            cja.D();
            cja.b(0.5f, 0.5f, 0.5f);
            cja.c(0.0f, 24.0f * f7, 0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            cja.E();
        } else {
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        float f8 = f4 - (float)cpk2.by;
        float f9 = ((cmg)cpk2).d(f8);
        f9 *= f9;
        float f10 = 1.0f - f9;
        this.b.f = 1.5707964f - f9 * (float)Math.PI * 0.35f;
        this.b.d = 9.0f * f10 + 11.0f * f9;
        this.e.d = 14.0f * f10 + -6.0f * f9;
        this.e.e = -8.0f * f10 + -4.0f * f9;
        this.e.f -= f9 * (float)Math.PI * 0.45f;
        this.f.d = this.e.d;
        this.f.e = this.e.e;
        this.f.f -= f9 * (float)Math.PI * 0.45f;
        this.a.d = 10.0f * f10 + -12.0f * f9;
        this.a.e = -16.0f * f10 + -3.0f * f9;
        this.a.f += f9 * (float)Math.PI * 0.15f;
    }
}

