/*
 * Decompiled with CFR 0.150.
 */
public class of
extends axg {
    private final abd[] a = new abd[12];
    private final abd b;

    public of() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new abd(this, 0, 16);
            this.a[i2].a(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.b = new abd(this, 0, 0);
        this.b.a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.b.a(f7);
        for (abd abd2 : this.a) {
            abd2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        int n2;
        float f8 = f4 * (float)Math.PI * -0.1f;
        for (n2 = 0; n2 < 4; ++n2) {
            this.a[n2].d = -2.0f + cmk.b(((float)(n2 * 2) + f4) * 0.25f);
            this.a[n2].c = cmk.b(f8) * 9.0f;
            this.a[n2].e = cmk.a(f8) * 9.0f;
            f8 += 1.5707964f;
        }
        f8 = 0.7853982f + f4 * (float)Math.PI * 0.03f;
        for (n2 = 4; n2 < 8; ++n2) {
            this.a[n2].d = 2.0f + cmk.b(((float)(n2 * 2) + f4) * 0.25f);
            this.a[n2].c = cmk.b(f8) * 7.0f;
            this.a[n2].e = cmk.a(f8) * 7.0f;
            f8 += 1.5707964f;
        }
        f8 = 0.47123894f + f4 * (float)Math.PI * -0.05f;
        for (n2 = 8; n2 < 12; ++n2) {
            this.a[n2].d = 11.0f + cmk.b(((float)n2 * 1.5f + f4) * 0.5f);
            this.a[n2].c = cmk.b(f8) * 5.0f;
            this.a[n2].e = cmk.a(f8) * 5.0f;
            f8 += 1.5707964f;
        }
        this.b.g = f5 * ((float)Math.PI / 180);
        this.b.f = f6 * ((float)Math.PI / 180);
    }
}

