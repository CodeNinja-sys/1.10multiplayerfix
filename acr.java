/*
 * Decompiled with CFR 0.150.
 */
public class acr
extends axg {
    public abd a = new abd(this, 0, 0);
    public abd b;
    public abd c;
    public abd d;
    public abd e;
    public abd f;
    protected float g = 8.0f;
    protected float h = 4.0f;

    public acr(int n2, float f2) {
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f2);
        this.a.a(0.0f, 18 - n2, -6.0f);
        this.b = new abd(this, 28, 8);
        this.b.a(-5.0f, -10.0f, -7.0f, 10, 16, 8, f2);
        this.b.a(0.0f, 17 - n2, 2.0f);
        this.c = new abd(this, 0, 16);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.c.a(-3.0f, 24 - n2, 7.0f);
        this.d = new abd(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.d.a(3.0f, 24 - n2, 7.0f);
        this.e = new abd(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.e.a(-3.0f, 24 - n2, -5.0f);
        this.f = new abd(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.f.a(3.0f, 24 - n2, -5.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        if (this.n) {
            float f8 = 2.0f;
            cja.D();
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
        this.a.f = f6 * ((float)Math.PI / 180);
        this.a.g = f5 * ((float)Math.PI / 180);
        this.b.f = 1.5707964f;
        this.c.f = cmk.b(f2 * 0.6662f) * 1.4f * f3;
        this.d.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.e.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.f.f = cmk.b(f2 * 0.6662f) * 1.4f * f3;
    }
}

