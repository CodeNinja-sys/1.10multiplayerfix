/*
 * Decompiled with CFR 0.150.
 */
public class bwv
extends axg {
    public abd a;
    public abd b;
    public abd c;
    public abd d;
    public abd e;
    public abd f;

    public bwv(float f2) {
        this(f2, 0.0f, 64, 64);
    }

    public bwv(float f2, float f3, int n2, int n3) {
        this.a = new abd(this).b(n2, n3);
        this.a.a(0.0f, 0.0f + f3, 0.0f);
        this.a.a(0, 0).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
        this.f = new abd(this).b(n2, n3);
        this.f.a(0.0f, f3 - 2.0f, 0.0f);
        this.f.a(24, 0).a(-1.0f, -1.0f, -6.0f, 2, 4, 2, f2);
        this.a.a(this.f);
        this.b = new abd(this).b(n2, n3);
        this.b.a(0.0f, 0.0f + f3, 0.0f);
        this.b.a(16, 20).a(-4.0f, 0.0f, -3.0f, 8, 12, 6, f2);
        this.b.a(0, 38).a(-4.0f, 0.0f, -3.0f, 8, 18, 6, f2 + 0.5f);
        this.c = new abd(this).b(n2, n3);
        this.c.a(0.0f, 0.0f + f3 + 2.0f, 0.0f);
        this.c.a(44, 22).a(-8.0f, -2.0f, -2.0f, 4, 8, 4, f2);
        this.c.a(44, 22).a(4.0f, -2.0f, -2.0f, 4, 8, 4, f2);
        this.c.a(40, 38).a(-4.0f, 2.0f, -2.0f, 8, 4, 4, f2);
        this.d = new abd(this, 0, 22).b(n2, n3);
        this.d.a(-2.0f, 12.0f + f3, 0.0f);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.e = new abd(this, 0, 22).b(n2, n3);
        this.e.i = true;
        this.e.a(2.0f, 12.0f + f3, 0.0f);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.a(f7);
        this.b.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.c.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        this.c.d = 3.0f;
        this.c.e = -1.0f;
        this.c.f = -0.75f;
        this.d.f = cmk.b(f2 * 0.6662f) * 1.4f * f3 * 0.5f;
        this.e.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3 * 0.5f;
        this.d.g = 0.0f;
        this.e.g = 0.0f;
    }
}

