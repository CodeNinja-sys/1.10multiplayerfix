/*
 * Decompiled with CFR 0.150.
 */
public class bbd
implements czo {
    private final cbm a;

    public bbd(cbm cbm2) {
        this.a = cbm2;
    }

    public void a(hx hx2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (hx2.C() == 0) {
            return;
        }
        dfp dfp2 = bxy.B().ac();
        cja.A();
        cja.D();
        cja.b(5.0f + 180.0f * ((bba)this.a.c()).c.f / (float)Math.PI, 1.0f, 0.0f, 0.0f);
        cja.b(90.0f, 1.0f, 0.0f, 0.0f);
        cja.c(-0.9375f, -0.625f, -0.9375f);
        float f9 = 0.5f;
        cja.b(0.5f, -0.5f, 0.5f);
        int n2 = hx2.b(f4);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(dam.g);
        dfp2.a(blg.O.s(), 1.0f);
        cja.E();
        cja.B();
    }

    @Override
    public boolean a() {
        return false;
    }
}

