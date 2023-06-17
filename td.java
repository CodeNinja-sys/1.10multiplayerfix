/*
 * Decompiled with CFR 0.150.
 */
public class td
extends axg {
    public abd a = new abd(this).a(0, 0).a(-6.0f, -5.0f, 0.0f, 6, 10, 0);
    public abd b = new abd(this).a(16, 0).a(0.0f, -5.0f, 0.0f, 6, 10, 0);
    public abd c;
    public abd d;
    public abd e;
    public abd f;
    public abd g = new abd(this).a(12, 0).a(-1.0f, -5.0f, 0.0f, 2, 10, 0);

    public td() {
        this.c = new abd(this).a(0, 10).a(0.0f, -4.0f, -0.99f, 5, 8, 1);
        this.d = new abd(this).a(12, 10).a(0.0f, -4.0f, -0.01f, 5, 8, 1);
        this.e = new abd(this).a(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.f = new abd(this).a(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.a.a(0.0f, 0.0f, -1.0f);
        this.b.a(0.0f, 0.0f, 1.0f);
        this.g.g = 1.5707964f;
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.a(f7);
        this.b.a(f7);
        this.g.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        float f8 = (cmk.a(f2 * 0.02f) * 0.1f + 1.25f) * f5;
        this.a.g = (float)Math.PI + f8;
        this.b.g = -f8;
        this.c.g = f8;
        this.d.g = -f8;
        this.e.g = f8 - f8 * 2.0f * f3;
        this.f.g = f8 - f8 * 2.0f * f4;
        this.c.c = cmk.a(f8);
        this.d.c = cmk.a(f8);
        this.e.c = cmk.a(f8);
        this.f.c = cmk.a(f8);
    }
}

