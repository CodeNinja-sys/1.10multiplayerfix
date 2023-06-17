/*
 * Decompiled with CFR 0.150.
 */
public class wj
implements czo {
    private static final bpx a = new bpx("textures/entity/wither/wither_armor.png");
    private final aft b;
    private final adh c = new adh(0.5f);

    public wj(aft aft2) {
        this.b = aft2;
    }

    public void a(dga dga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!dga2.aM()) {
            return;
        }
        cja.a(!dga2.ct());
        this.b.a(a);
        cja.l(5890);
        cja.C();
        float f9 = (float)dga2.by + f4;
        float f10 = cmk.b(f9 * 0.02f) * 3.0f;
        float f11 = f9 * 0.01f;
        cja.c(f10, f11, 0.0f);
        cja.l(5888);
        cja.l();
        float f12 = 0.5f;
        cja.c(0.5f, 0.5f, 0.5f, 1.0f);
        cja.f();
        cja.a(bjt.e, afi.e);
        this.c.a(dga2, f2, f3, f4);
        this.c.a(this.b.c());
        this.c.a(dga2, f2, f3, f5, f6, f7, f8);
        cja.l(5890);
        cja.C();
        cja.l(5888);
        cja.e();
        cja.k();
    }

    @Override
    public boolean a() {
        return false;
    }
}

