/*
 * Decompiled with CFR 0.150.
 */
public class axw
implements czo {
    private final abg a;

    public axw(abg abg2) {
        this.a = abg2;
    }

    public void a(bgv bgv2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        dbk dbk2 = bgv2.aL();
        if (dbk2 == null) {
            return;
        }
        dfp dfp2 = bxy.B().ac();
        cja.A();
        cja.D();
        cja.c(0.0f, 0.6875f, -0.75f);
        cja.b(20.0f, 1.0f, 0.0f, 0.0f);
        cja.b(45.0f, 0.0f, 1.0f, 0.0f);
        cja.c(0.25f, 0.1875f, 0.25f);
        float f9 = 0.5f;
        cja.b(-0.5f, -0.5f, 0.5f);
        int n2 = bgv2.b(f4);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(dam.g);
        dfp2.a(dbk2, 1.0f);
        cja.E();
        cja.B();
    }

    @Override
    public boolean a() {
        return false;
    }
}

