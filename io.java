/*
 * Decompiled with CFR 0.150.
 */
public class io
extends axg {
    private final abd b;
    private final abd c;
    public abd a;

    public io() {
        this.q = 64;
        this.p = 64;
        this.c = new abd(this);
        this.b = new abd(this);
        this.a = new abd(this);
        this.c.a(0, 0).a(-8.0f, -16.0f, -8.0f, 16, 12, 16);
        this.c.a(0.0f, 24.0f, 0.0f);
        this.b.a(0, 28).a(-8.0f, -8.0f, -8.0f, 16, 8, 16);
        this.b.a(0.0f, 24.0f, 0.0f);
        this.a.a(0, 52).a(-3.0f, 0.0f, -3.0f, 6, 6, 6);
        this.a.a(0.0f, 12.0f, 0.0f);
    }

    public int a() {
        return 28;
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4) {
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        aoa aoa2 = (aoa)cpk2;
        float f8 = f4 - (float)aoa2.by;
        float f9 = (0.5f + aoa2.d(f8)) * (float)Math.PI;
        float f10 = -1.0f + cmk.a(f9);
        float f11 = 0.0f;
        if (f9 > (float)Math.PI) {
            f11 = cmk.a(f4 * 0.1f) * 0.7f;
        }
        this.c.a(0.0f, 16.0f + cmk.a(f9) * 8.0f + f11, 0.0f);
        this.c.g = aoa2.d(f8) > 0.3f ? f10 * f10 * f10 * f10 * (float)Math.PI * 0.125f : 0.0f;
        this.a.f = f6 * ((float)Math.PI / 180);
        this.a.g = f5 * ((float)Math.PI / 180);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.b.a(f7);
        this.c.a(f7);
    }
}

