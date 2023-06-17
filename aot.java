/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;

public class aot
implements czo {
    private final abd a;

    public aot(abd abd2) {
        this.a = abd2;
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9;
        boolean bl2;
        bhl bhl2 = bga2.a(dfm.f);
        if (bhl2 == null || bhl2.a() == null) {
            return;
        }
        azg azg2 = bhl2.a();
        bxy bxy2 = bxy.B();
        cja.D();
        if (bga2.ar_()) {
            cja.c(0.0f, 0.2f, 0.0f);
        }
        boolean bl3 = bl2 = bga2 instanceof cwp || bga2 instanceof oe && ((oe)bga2).L();
        if (bga2.R_() && !(bga2 instanceof cwp)) {
            f9 = 2.0f;
            float f10 = 1.4f;
            cja.c(0.0f, 0.5f * f8, 0.0f);
            cja.b(0.7f, 0.7f, 0.7f);
            cja.c(0.0f, 16.0f * f8, 0.0f);
        }
        this.a.c(0.0625f);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        if (azg2 == hp.ch) {
            f9 = 1.1875f;
            cja.b(1.1875f, -1.1875f, -1.1875f);
            if (bl2) {
                cja.c(0.0f, 0.0625f, 0.0f);
            }
            e e2 = null;
            if (bhl2.n()) {
                String string;
                bvp bvp2 = bhl2.o();
                if (bvp2.b("SkullOwner", 10)) {
                    e2 = ayj.a(bvp2.o("SkullOwner"));
                } else if (bvp2.b("SkullOwner", 8) && !aco.b(string = bvp2.l("SkullOwner"))) {
                    e2 = tr.b(new e(null, string));
                    bvp2.a("SkullOwner", ayj.a(new bvp(), e2));
                }
            }
            fu.a.a(-0.5f, 0.0f, -0.5f, bqk.b, 180.0f, bhl2.h(), e2, -1, f2);
        } else if (!(azg2 instanceof uh) || ((uh)azg2).e() != dfm.f) {
            f9 = 0.625f;
            cja.c(0.0f, -0.25f, 0.0f);
            cja.b(180.0f, 0.0f, 1.0f, 0.0f);
            cja.b(0.625f, -0.625f, -0.625f);
            if (bl2) {
                cja.c(0.0f, 0.1875f, 0.0f);
            }
            bxy2.af().a(bga2, bhl2, cua.f);
        }
        cja.E();
    }

    @Override
    public boolean a() {
        return false;
    }
}

