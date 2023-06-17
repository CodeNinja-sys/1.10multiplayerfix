/*
 * Decompiled with CFR 0.150.
 */
public class cid
implements czo {
    private final kn a;

    public cid(kn kn2) {
        this.a = kn2;
    }

    public void a(ciy ciy2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!"deadmau5".equals(ciy2.i_()) || !ciy2.bP() || ciy2.ct()) {
            return;
        }
        this.a.a(ciy2.bQ());
        for (int i2 = 0; i2 < 2; ++i2) {
            float f9 = ciy2.bc + (ciy2.ba - ciy2.bc) * f4 - (ciy2.ai + (ciy2.ah - ciy2.ai) * f4);
            float f10 = ciy2.bd + (ciy2.bb - ciy2.bd) * f4;
            cja.D();
            cja.b(f9, 0.0f, 1.0f, 0.0f);
            cja.b(f10, 1.0f, 0.0f, 0.0f);
            cja.c(0.375f * (float)(i2 * 2 - 1), 0.0f, 0.0f);
            cja.c(0.0f, -0.375f, 0.0f);
            cja.b(-f10, 1.0f, 0.0f, 0.0f);
            cja.b(-f9, 0.0f, 1.0f, 0.0f);
            float f11 = 1.3333334f;
            cja.b(1.3333334f, 1.3333334f, 1.3333334f);
            this.a.b().a(0.0625f);
            cja.E();
        }
    }

    @Override
    public boolean a() {
        return true;
    }
}

