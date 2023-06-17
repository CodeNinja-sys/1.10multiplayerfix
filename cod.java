/*
 * Decompiled with CFR 0.150.
 */
public class cod
implements czo {
    private static final bpx a = new bpx("textures/entity/spider_eyes.png");
    private final wa b;

    public cod(wa wa2) {
        this.b = wa2;
    }

    public void a(yi yi2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b.a(a);
        cja.l();
        cja.c();
        cja.a(bjt.e, afi.e);
        if (yi2.ct()) {
            cja.a(false);
        } else {
            cja.a(true);
        }
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.c().a(yi2, f2, f3, f5, f6, f7, f8);
        n2 = yi2.b(f4);
        n3 = n2 % 65536;
        n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        this.b.a(yi2, f4);
        cja.k();
        cja.d();
    }

    @Override
    public boolean a() {
        return false;
    }
}

