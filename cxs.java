/*
 * Decompiled with CFR 0.150.
 */
public class cxs
implements czo {
    private static final bpx a = new bpx("textures/entity/enderdragon/dragon_eyes.png");
    private final sq b;

    public cxs(sq sq2) {
        this.b = sq2;
    }

    public void a(brd brd2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b.a(a);
        cja.l();
        cja.c();
        cja.a(bjt.e, afi.e);
        cja.f();
        cja.c(514);
        int n2 = 61680;
        int n3 = 61680;
        boolean bl2 = false;
        cjg.a(cjg.r, 61680.0f, 0.0f);
        cja.e();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.c().a(brd2, f2, f3, f5, f6, f7, f8);
        this.b.a(brd2, f4);
        cja.k();
        cja.d();
        cja.c(515);
    }

    @Override
    public boolean a() {
        return false;
    }
}

