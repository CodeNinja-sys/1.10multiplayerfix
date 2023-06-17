/*
 * Decompiled with CFR 0.150.
 */
public class asd
extends axg {
    public abd a;
    public abd b;
    public abd c;
    public abd d;
    public abd e;
    public abd f;
    abd g;
    abd h;

    public asd() {
        float f2 = 0.0f;
        float f3 = 13.5f;
        this.a = new abd(this, 0, 0);
        this.a.a(-2.0f, -3.0f, -2.0f, 6, 6, 4, 0.0f);
        this.a.a(-1.0f, 13.5f, -7.0f);
        this.b = new abd(this, 18, 14);
        this.b.a(-3.0f, -2.0f, -3.0f, 6, 9, 6, 0.0f);
        this.b.a(0.0f, 14.0f, 2.0f);
        this.h = new abd(this, 21, 0);
        this.h.a(-3.0f, -3.0f, -3.0f, 8, 6, 7, 0.0f);
        this.h.a(-1.0f, 14.0f, 2.0f);
        this.c = new abd(this, 0, 18);
        this.c.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.c.a(-2.5f, 16.0f, 7.0f);
        this.d = new abd(this, 0, 18);
        this.d.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.d.a(0.5f, 16.0f, 7.0f);
        this.e = new abd(this, 0, 18);
        this.e.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.e.a(-2.5f, 16.0f, -4.0f);
        this.f = new abd(this, 0, 18);
        this.f.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.f.a(0.5f, 16.0f, -4.0f);
        this.g = new abd(this, 9, 18);
        this.g.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.g.a(-1.0f, 12.0f, 8.0f);
        this.a.a(16, 14).a(-2.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.a.a(16, 14).a(2.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.a.a(0, 10).a(-0.5f, 0.0f, -5.0f, 3, 3, 4, 0.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(cpk2, f2, f3, f4, f5, f6, f7);
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        if (this.n) {
            float f8 = 2.0f;
            cja.D();
            cja.c(0.0f, 5.0f * f7, 2.0f * f7);
            this.a.b(f7);
            cja.E();
            cja.D();
            cja.b(0.5f, 0.5f, 0.5f);
            cja.c(0.0f, 24.0f * f7, 0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.b(f7);
            this.h.a(f7);
            cja.E();
        } else {
            this.a.b(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.b(f7);
            this.h.a(f7);
        }
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4) {
        cqw cqw2 = (cqw)bga2;
        this.g.g = cqw2.aQ() ? 0.0f : cmk.b(f2 * 0.6662f) * 1.4f * f3;
        if (cqw2.C()) {
            this.h.a(-1.0f, 16.0f, -3.0f);
            this.h.f = 1.2566371f;
            this.h.g = 0.0f;
            this.b.a(0.0f, 18.0f, 0.0f);
            this.b.f = 0.7853982f;
            this.g.a(-1.0f, 21.0f, 6.0f);
            this.c.a(-2.5f, 22.0f, 2.0f);
            this.c.f = 4.712389f;
            this.d.a(0.5f, 22.0f, 2.0f);
            this.d.f = 4.712389f;
            this.e.f = 5.811947f;
            this.e.a(-2.49f, 17.0f, -4.0f);
            this.f.f = 5.811947f;
            this.f.a(0.51f, 17.0f, -4.0f);
        } else {
            this.b.a(0.0f, 14.0f, 2.0f);
            this.b.f = 1.5707964f;
            this.h.a(-1.0f, 14.0f, -3.0f);
            this.h.f = this.b.f;
            this.g.a(-1.0f, 12.0f, 8.0f);
            this.c.a(-2.5f, 16.0f, 7.0f);
            this.d.a(0.5f, 16.0f, 7.0f);
            this.e.a(-2.5f, 16.0f, -4.0f);
            this.f.a(0.5f, 16.0f, -4.0f);
            this.c.f = cmk.b(f2 * 0.6662f) * 1.4f * f3;
            this.d.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.e.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.f.f = cmk.b(f2 * 0.6662f) * 1.4f * f3;
        }
        this.a.h = cqw2.p(f4) + cqw2.h(f4, 0.0f);
        this.h.h = cqw2.h(f4, -0.08f);
        this.b.h = cqw2.h(f4, -0.16f);
        this.g.h = cqw2.h(f4, -0.2f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.f = f6 * ((float)Math.PI / 180);
        this.a.g = f5 * ((float)Math.PI / 180);
        this.g.f = f4;
    }
}

