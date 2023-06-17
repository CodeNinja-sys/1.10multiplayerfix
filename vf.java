/*
 * Decompiled with CFR 0.150.
 */
public class vf
implements czo {
    private static final bpx a = new bpx("textures/entity/enderman/enderman_eyes.png");
    private final abg b;

    public vf(abg abg2) {
        this.b = abg2;
    }

    public void a(bgv bgv2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b.a(a);
        cja.l();
        cja.c();
        cja.a(bjt.e, afi.e);
        cja.f();
        cja.a(!bgv2.ct());
        int n2 = 61680;
        int n3 = 61680;
        boolean bl2 = false;
        cjg.a(cjg.r, 61680.0f, 0.0f);
        cja.e();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.c().a(bgv2, f2, f3, f5, f6, f7, f8);
        this.b.a(bgv2, f4);
        cja.a(true);
        cja.k();
        cja.d();
    }

    @Override
    public boolean a() {
        return false;
    }
}

