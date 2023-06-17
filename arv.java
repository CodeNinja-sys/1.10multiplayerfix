/*
 * Decompiled with CFR 0.150.
 */
public class arv
extends axg {
    private final abd a;
    private final abd b;
    private final abd[] c;
    private final abd[] d;

    public arv() {
        this.p = 64;
        this.q = 64;
        this.c = new abd[12];
        this.a = new abd(this);
        this.a.a(0, 0).a(-6.0f, 10.0f, -8.0f, 12, 12, 16);
        this.a.a(0, 28).a(-8.0f, 10.0f, -6.0f, 2, 12, 12);
        this.a.a(0, 28).a(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        this.a.a(16, 40).a(-6.0f, 8.0f, -6.0f, 12, 2, 12);
        this.a.a(16, 40).a(-6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = new abd(this, 0, 0);
            this.c[i2].a(-1.0f, -4.5f, -1.0f, 2, 9, 2);
            this.a.a(this.c[i2]);
        }
        this.b = new abd(this, 8, 0);
        this.b.a(-1.0f, 15.0f, 0.0f, 2, 2, 1);
        this.a.a(this.b);
        this.d = new abd[3];
        this.d[0] = new abd(this, 40, 0);
        this.d[0].a(-2.0f, 14.0f, 7.0f, 4, 4, 8);
        this.d[1] = new abd(this, 0, 54);
        this.d[1].a(0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.d[2] = new abd(this);
        this.d[2].a(41, 32).a(0.0f, 14.0f, 0.0f, 2, 2, 6);
        this.d[2].a(25, 19).a(1.0f, 10.5f, 3.0f, 1, 9, 9);
        this.a.a(this.d[0]);
        this.d[0].a(this.d[1]);
        this.d[1].a(this.d[2]);
    }

    public int a() {
        return 54;
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        bym bym2 = (bym)cpk2;
        float f8 = f4 - (float)bym2.by;
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        float[] arrf = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
        float[] arrf2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
        float[] arrf3 = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
        float[] arrf4 = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
        float[] arrf5 = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
        float[] arrf6 = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
        float f9 = (1.0f - bym2.j(f8)) * 0.55f;
        for (int i2 = 0; i2 < 12; ++i2) {
            this.c[i2].f = (float)Math.PI * arrf[i2];
            this.c[i2].g = (float)Math.PI * arrf2[i2];
            this.c[i2].h = (float)Math.PI * arrf3[i2];
            this.c[i2].c = arrf4[i2] * (1.0f + cmk.b(f4 * 1.5f + (float)i2) * 0.01f - f9);
            this.c[i2].d = 16.0f + arrf5[i2] * (1.0f + cmk.b(f4 * 1.5f + (float)i2) * 0.01f - f9);
            this.c[i2].e = arrf6[i2] * (1.0f + cmk.b(f4 * 1.5f + (float)i2) * 0.01f - f9);
        }
        this.b.e = -8.25f;
        cpk cpk3 = bxy.B().ab();
        if (bym2.aQ()) {
            cpk3 = bym2.aR();
        }
        if (cpk3 != null) {
            amj amj2 = cpk3.q(0.0f);
            amj amj3 = cpk2.q(0.0f);
            double d2 = amj2.c - amj3.c;
            this.b.d = d2 > 0.0 ? 0.0f : 1.0f;
            amj amj4 = cpk2.l(0.0f);
            amj4 = new amj(amj4.b, 0.0, amj4.d);
            amj amj5 = new amj(amj3.b - amj2.b, 0.0, amj3.d - amj2.d).a().b(1.5707964f);
            double d3 = amj4.b(amj5);
            this.b.c = cmk.c((float)Math.abs(d3)) * 2.0f * (float)Math.signum(d3);
        }
        this.b.j = true;
        float f10 = bym2.d(f8);
        this.d[0].g = cmk.a(f10) * (float)Math.PI * 0.05f;
        this.d[1].g = cmk.a(f10) * (float)Math.PI * 0.1f;
        this.d[1].c = -1.5f;
        this.d[1].d = 0.5f;
        this.d[1].e = 14.0f;
        this.d[2].g = cmk.a(f10) * (float)Math.PI * 0.15f;
        this.d[2].c = 0.5f;
        this.d[2].d = 0.5f;
        this.d[2].e = 6.0f;
    }
}

