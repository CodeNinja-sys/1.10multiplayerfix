/*
 * Decompiled with CFR 0.150.
 */
public class adh
extends axg {
    private final abd[] a;
    private final abd[] b;

    public adh(float f2) {
        this.p = 64;
        this.q = 64;
        this.a = new abd[3];
        this.a[0] = new abd(this, 0, 16);
        this.a[0].a(-10.0f, 3.9f, -0.5f, 20, 3, 3, f2);
        this.a[1] = new abd(this).b(this.p, this.q);
        this.a[1].a(-2.0f, 6.9f, -0.5f);
        this.a[1].a(0, 22).a(0.0f, 0.0f, 0.0f, 3, 10, 3, f2);
        this.a[1].a(24, 22).a(-4.0f, 1.5f, 0.5f, 11, 2, 2, f2);
        this.a[1].a(24, 22).a(-4.0f, 4.0f, 0.5f, 11, 2, 2, f2);
        this.a[1].a(24, 22).a(-4.0f, 6.5f, 0.5f, 11, 2, 2, f2);
        this.a[2] = new abd(this, 12, 22);
        this.a[2].a(0.0f, 0.0f, 0.0f, 3, 6, 3, f2);
        this.b = new abd[3];
        this.b[0] = new abd(this, 0, 0);
        this.b[0].a(-4.0f, -4.0f, -4.0f, 8, 8, 8, f2);
        this.b[1] = new abd(this, 32, 0);
        this.b[1].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f2);
        this.b[1].c = -8.0f;
        this.b[1].d = 4.0f;
        this.b[2] = new abd(this, 32, 0);
        this.b[2].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f2);
        this.b[2].c = 10.0f;
        this.b[2].d = 4.0f;
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        for (abd abd2 : this.b) {
            abd2.a(f7);
        }
        for (abd abd2 : this.a) {
            abd2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        float f8 = cmk.b(f4 * 0.1f);
        this.a[1].f = (0.065f + 0.05f * f8) * (float)Math.PI;
        this.a[2].a(-2.0f, 6.9f + cmk.b(this.a[1].f) * 10.0f, -0.5f + cmk.a(this.a[1].f) * 10.0f);
        this.a[2].f = (0.265f + 0.1f * f8) * (float)Math.PI;
        this.b[0].g = f5 * ((float)Math.PI / 180);
        this.b[0].f = f6 * ((float)Math.PI / 180);
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4) {
        dga dga2 = (dga)bga2;
        for (int i2 = 1; i2 < 3; ++i2) {
            this.b[i2].g = (dga2.d(i2 - 1) - bga2.ah) * ((float)Math.PI / 180);
            this.b[i2].f = dga2.f(i2 - 1) * ((float)Math.PI / 180);
        }
    }
}

