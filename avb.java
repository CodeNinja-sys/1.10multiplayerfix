/*
 * Decompiled with CFR 0.150.
 */
public class avb
implements czo {
    private final byy a;

    public avb(byy byy2) {
        this.a = byy2;
    }

    public void a(cce cce2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (cce2.ct() || cce2.T()) {
            return;
        }
        cja.D();
        this.a.b().c.c(0.0625f);
        float f9 = 0.625f;
        cja.c(0.0f, -0.34375f, 0.0f);
        cja.b(180.0f, 0.0f, 1.0f, 0.0f);
        cja.b(0.625f, -0.625f, -0.625f);
        bxy.B().af().a(cce2, new bhl(blg.aU, 1), cua.f);
        cja.E();
    }

    @Override
    public boolean a() {
        return true;
    }
}

