/*
 * Decompiled with CFR 0.150.
 */
public class aal
extends axg {
    private final abd a;
    private final abd b = new abd(this, 22, 0);

    public aal() {
        this.b.a(-10.0f, 0.0f, 0.0f, 10, 20, 2, 1.0f);
        this.a = new abd(this, 22, 0);
        this.a.i = true;
        this.a.a(0.0f, 0.0f, 0.0f, 10, 20, 2, 1.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        cja.B();
        cja.q();
        this.b.a(f7);
        this.a.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        float f8 = 0.2617994f;
        float f9 = -0.2617994f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        if (cpk2 instanceof bga && ((bga)cpk2).bL()) {
            float f12 = 1.0f;
            if (cpk2.aY < 0.0) {
                amj amj2 = new amj(cpk2.aX, cpk2.aY, cpk2.aZ).a();
                f12 = 1.0f - (float)Math.pow(-amj2.c, 1.5);
            }
            f8 = f12 * 0.34906584f + (1.0f - f12) * f8;
            f9 = f12 * -1.5707964f + (1.0f - f12) * f9;
        } else if (cpk2.ar_()) {
            f8 = 0.6981317f;
            f9 = -0.7853982f;
            f10 = 3.0f;
            f11 = 0.08726646f;
        }
        this.b.c = 5.0f;
        this.b.d = f10;
        if (cpk2 instanceof ciy) {
            ciy ciy2 = (ciy)cpk2;
            ciy2.aK = (float)((double)ciy2.aK + (double)(f8 - ciy2.aK) * 0.1);
            ciy2.aL = (float)((double)ciy2.aL + (double)(f11 - ciy2.aL) * 0.1);
            ciy2.aM = (float)((double)ciy2.aM + (double)(f9 - ciy2.aM) * 0.1);
            this.b.f = ciy2.aK;
            this.b.g = ciy2.aL;
            this.b.h = ciy2.aM;
        } else {
            this.b.f = f8;
            this.b.h = f9;
            this.b.g = f11;
        }
        this.a.c = -this.b.c;
        this.a.g = -this.b.g;
        this.a.d = this.b.d;
        this.a.f = this.b.f;
        this.a.h = -this.b.h;
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4) {
        super.a(bga2, f2, f3, f4);
    }
}

