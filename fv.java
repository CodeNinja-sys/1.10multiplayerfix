/*
 * Decompiled with CFR 0.150.
 */
public class fv
extends axg {
    private final abd a;
    private final abd b;
    private final abd c;
    private final abd d;
    private final abd e;
    private final abd f;

    public fv() {
        this.p = 64;
        this.q = 64;
        this.a = new abd(this, 0, 0);
        this.a.a(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        abd abd2 = new abd(this, 24, 0);
        abd2.a(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(abd2);
        abd abd3 = new abd(this, 24, 0);
        abd3.i = true;
        abd3.a(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(abd3);
        this.b = new abd(this, 0, 16);
        this.b.a(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.b.a(0, 34).a(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.c = new abd(this, 42, 0);
        this.c.a(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.e = new abd(this, 24, 16);
        this.e.a(-12.0f, 1.0f, 1.5f);
        this.e.a(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.d = new abd(this, 42, 0);
        this.d.i = true;
        this.d.a(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.f = new abd(this, 24, 16);
        this.f.i = true;
        this.f.a(12.0f, 1.0f, 1.5f);
        this.f.a(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.b.a(this.c);
        this.b.a(this.d);
        this.c.a(this.e);
        this.d.a(this.f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.a(f7);
        this.b.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        if (((azc)cpk2).T()) {
            this.a.f = f6 * ((float)Math.PI / 180);
            this.a.g = (float)Math.PI - f5 * ((float)Math.PI / 180);
            this.a.h = (float)Math.PI;
            this.a.a(0.0f, -2.0f, 0.0f);
            this.c.a(-3.0f, 0.0f, 3.0f);
            this.d.a(3.0f, 0.0f, 3.0f);
            this.b.f = (float)Math.PI;
            this.c.f = -0.15707964f;
            this.c.g = -1.2566371f;
            this.e.g = -1.7278761f;
            this.d.f = this.c.f;
            this.d.g = -this.c.g;
            this.f.g = -this.e.g;
        } else {
            this.a.f = f6 * ((float)Math.PI / 180);
            this.a.g = f5 * ((float)Math.PI / 180);
            this.a.h = 0.0f;
            this.a.a(0.0f, 0.0f, 0.0f);
            this.c.a(0.0f, 0.0f, 0.0f);
            this.d.a(0.0f, 0.0f, 0.0f);
            this.b.f = 0.7853982f + cmk.b(f4 * 0.1f) * 0.15f;
            this.b.g = 0.0f;
            this.c.g = cmk.b(f4 * 1.3f) * (float)Math.PI * 0.25f;
            this.d.g = -this.c.g;
            this.e.g = this.c.g * 0.5f;
            this.f.g = -this.c.g * 0.5f;
        }
    }
}

