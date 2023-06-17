/*
 * Decompiled with CFR 0.150.
 */
public class blh
implements czo {
    private final kn a;

    public blh(kn kn2) {
        this.a = kn2;
    }

    public void a(ciy ciy2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!ciy2.bN() || ciy2.ct() || !ciy2.a(bzk.a) || ciy2.bR() == null) {
            return;
        }
        bhl bhl2 = ciy2.a(dfm.e);
        if (bhl2 != null && bhl2.a() == hp.cR) {
            return;
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(ciy2.bR());
        cja.D();
        cja.c(0.0f, 0.0f, 0.125f);
        double d2 = ciy2.v + (ciy2.y - ciy2.v) * (double)f4 - (ciy2.aR + (ciy2.aU - ciy2.aR) * (double)f4);
        double d3 = ciy2.w + (ciy2.z - ciy2.w) * (double)f4 - (ciy2.aS + (ciy2.aV - ciy2.aS) * (double)f4);
        double d4 = ciy2.x + (ciy2.A - ciy2.x) * (double)f4 - (ciy2.aT + (ciy2.aW - ciy2.aT) * (double)f4);
        float f9 = ciy2.ai + (ciy2.ah - ciy2.ai) * f4;
        double d5 = cmk.a(f9 * ((float)Math.PI / 180));
        double d6 = -cmk.b(f9 * ((float)Math.PI / 180));
        float f10 = (float)d3 * 10.0f;
        f10 = cmk.a(f10, -6.0f, 32.0f);
        float f11 = (float)(d2 * d5 + d4 * d6) * 100.0f;
        float f12 = (float)(d2 * d6 - d4 * d5) * 100.0f;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f13 = ciy2.s + (ciy2.t - ciy2.s) * f4;
        f10 += cmk.a((ciy2.bn + (ciy2.bo - ciy2.bn) * f4) * 6.0f) * 32.0f * f13;
        if (ciy2.ar_()) {
            f10 += 25.0f;
        }
        cja.b(6.0f + f11 / 2.0f + f10, 1.0f, 0.0f, 0.0f);
        cja.b(f12 / 2.0f, 0.0f, 0.0f, 1.0f);
        cja.b(-f12 / 2.0f, 0.0f, 1.0f, 0.0f);
        cja.b(180.0f, 0.0f, 1.0f, 0.0f);
        this.a.b().b(0.0625f);
        cja.E();
    }

    @Override
    public boolean a() {
        return false;
    }
}

