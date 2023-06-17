/*
 * Decompiled with CFR 0.150.
 */
public class vi
implements czo {
    private final kg a;

    public vi(kg kg2) {
        this.a = kg2;
    }

    public void a(byl byl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        bhl bhl2 = byl2.bt();
        if (bhl2 == null) {
            return;
        }
        cja.d(1.0f, 1.0f, 1.0f);
        cja.D();
        if (this.a.c().n) {
            cja.c(0.0f, 0.625f, 0.0f);
            cja.b(-20.0f, -1.0f, 0.0f, 0.0f);
            float f9 = 0.5f;
            cja.b(0.5f, 0.5f, 0.5f);
        }
        ((czk)this.a.c()).f.c(0.0625f);
        cja.c(-0.0625f, 0.53125f, 0.21875f);
        azg azg2 = bhl2.a();
        bxy bxy2 = bxy.B();
        if (azg2 instanceof ge && bxy2.ac().a(bfa.a(azg2))) {
            cja.c(0.0f, 0.0625f, -0.25f);
            cja.b(30.0f, 1.0f, 0.0f, 0.0f);
            cja.b(-5.0f, 0.0f, 1.0f, 0.0f);
            float f10 = 0.375f;
            cja.b(0.375f, -0.375f, 0.375f);
        } else if (azg2 == hp.f) {
            cja.c(0.0f, 0.125f, -0.125f);
            cja.b(-45.0f, 0.0f, 1.0f, 0.0f);
            float f11 = 0.625f;
            cja.b(0.625f, -0.625f, 0.625f);
            cja.b(-100.0f, 1.0f, 0.0f, 0.0f);
            cja.b(-20.0f, 0.0f, 1.0f, 0.0f);
        } else if (azg2.aD_()) {
            if (azg2.n()) {
                cja.b(180.0f, 0.0f, 0.0f, 1.0f);
                cja.c(0.0f, -0.0625f, 0.0f);
            }
            this.a.a();
            cja.c(0.0625f, -0.125f, 0.0f);
            float f12 = 0.625f;
            cja.b(0.625f, -0.625f, 0.625f);
            cja.b(0.0f, 1.0f, 0.0f, 0.0f);
            cja.b(0.0f, 0.0f, 1.0f, 0.0f);
        } else {
            cja.c(0.1875f, 0.1875f, 0.0f);
            float f13 = 0.875f;
            cja.b(0.875f, 0.875f, 0.875f);
            cja.b(-20.0f, 0.0f, 0.0f, 1.0f);
            cja.b(-60.0f, 1.0f, 0.0f, 0.0f);
            cja.b(-30.0f, 0.0f, 0.0f, 1.0f);
        }
        cja.b(-15.0f, 1.0f, 0.0f, 0.0f);
        cja.b(40.0f, 0.0f, 0.0f, 1.0f);
        bxy2.af().a(byl2, bhl2, cua.c);
        cja.E();
    }

    @Override
    public boolean a() {
        return false;
    }
}

