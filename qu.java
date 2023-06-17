/*
 * Decompiled with CFR 0.150.
 */
public class qu
extends axg
implements dgq {
    public abd[] a = new abd[5];
    public abd[] b = new abd[2];
    public abd c;
    private final int d = avj.a(1);

    public qu() {
        this.a[0] = new abd(this, 0, 0).b(128, 64);
        this.a[1] = new abd(this, 0, 19).b(128, 64);
        this.a[2] = new abd(this, 0, 27).b(128, 64);
        this.a[3] = new abd(this, 0, 35).b(128, 64);
        this.a[4] = new abd(this, 0, 43).b(128, 64);
        int n2 = 32;
        int n3 = 6;
        int n4 = 20;
        int n5 = 4;
        int n6 = 28;
        this.a[0].a(-14.0f, -9.0f, -3.0f, 28, 16, 3, 0.0f);
        this.a[0].a(0.0f, 3.0f, 1.0f);
        this.a[1].a(-13.0f, -7.0f, -1.0f, 18, 6, 2, 0.0f);
        this.a[1].a(-15.0f, 4.0f, 4.0f);
        this.a[2].a(-8.0f, -7.0f, -1.0f, 16, 6, 2, 0.0f);
        this.a[2].a(15.0f, 4.0f, 0.0f);
        this.a[3].a(-14.0f, -7.0f, -1.0f, 28, 6, 2, 0.0f);
        this.a[3].a(0.0f, 4.0f, -9.0f);
        this.a[4].a(-14.0f, -7.0f, -1.0f, 28, 6, 2, 0.0f);
        this.a[4].a(0.0f, 4.0f, 9.0f);
        this.a[0].f = 1.5707964f;
        this.a[1].g = 4.712389f;
        this.a[2].g = 1.5707964f;
        this.a[3].g = (float)Math.PI;
        this.b[0] = this.a(true);
        this.b[0].a(3.0f, -5.0f, 9.0f);
        this.b[1] = this.a(false);
        this.b[1].a(3.0f, -5.0f, -9.0f);
        this.b[1].g = (float)Math.PI;
        this.b[0].h = 0.19634955f;
        this.b[1].h = 0.19634955f;
        this.c = new abd(this, 0, 0).b(128, 64);
        this.c.a(-14.0f, -9.0f, -3.0f, 28, 16, 3, 0.0f);
        this.c.a(0.0f, -3.0f, 1.0f);
        this.c.f = 1.5707964f;
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        cja.b(90.0f, 0.0f, 1.0f, 0.0f);
        cor cor2 = (cor)cpk2;
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        for (int i2 = 0; i2 < 5; ++i2) {
            this.a[i2].a(f7);
        }
        this.a(cor2, 0, f7, f2);
        this.a(cor2, 1, f7, f2);
    }

    @Override
    public void b(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        cja.b(90.0f, 0.0f, 1.0f, 0.0f);
        cja.a(false, false, false, false);
        this.c.a(f7);
        cja.a(true, true, true, true);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
    }

    abd a(boolean bl2) {
        abd abd2 = new abd(this, 62, bl2 ? 0 : 20).b(128, 64);
        int n2 = 20;
        int n3 = 7;
        int n4 = 6;
        float f2 = -5.0f;
        abd2.a(-1.0f, 0.0f, -5.0f, 2, 2, 18);
        abd2.a(bl2 ? -1.001f : 0.001f, -3.0f, 8.0f, 1, 6, 7);
        return abd2;
    }

    void a(cor cor2, int n2, float f2, float f3) {
        float f4 = 40.0f;
        float f5 = cor2.a(n2, f3) * 40.0f;
        abd abd2 = this.b[n2];
        abd2.f = (float)cmk.b(-1.0471975803375244, -0.2617993950843811, (double)((cmk.a(-f5) + 1.0f) / 2.0f));
        abd2.g = (float)cmk.b(-0.7853981852531433, 0.7853981852531433, (double)((cmk.a(-f5 + 1.0f) + 1.0f) / 2.0f));
        if (n2 == 1) {
            abd2.g = (float)Math.PI - abd2.g;
        }
        abd2.a(f2);
    }
}

