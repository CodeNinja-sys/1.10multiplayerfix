/*
 * Decompiled with CFR 0.150.
 */
public class kl
implements czo {
    protected final wq a;

    public kl(wq wq2) {
        this.a = wq2;
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        bhl bhl2;
        boolean bl2 = bga2.aK() == s.b;
        bhl bhl3 = bl2 ? bga2.bu() : bga2.bt();
        bhl bhl4 = bhl2 = bl2 ? bga2.bt() : bga2.bu();
        if (bhl3 == null && bhl2 == null) {
            return;
        }
        cja.D();
        if (this.a.c().n) {
            float f9 = 0.5f;
            cja.c(0.0f, 0.625f, 0.0f);
            cja.b(-20.0f, -1.0f, 0.0f, 0.0f);
            cja.b(0.5f, 0.5f, 0.5f);
        }
        this.a(bga2, bhl2, cua.c, s.b);
        this.a(bga2, bhl3, cua.b, s.a);
        cja.E();
    }

    private void a(bga bga2, bhl bhl2, cua cua2, s s2) {
        if (bhl2 == null) {
            return;
        }
        cja.D();
        ((chu)this.a.c()).a(0.0625f, s2);
        if (bga2.ar_()) {
            cja.c(0.0f, 0.2f, 0.0f);
        }
        cja.b(-90.0f, 1.0f, 0.0f, 0.0f);
        cja.b(180.0f, 0.0f, 1.0f, 0.0f);
        boolean bl2 = s2 == s.a;
        cja.c((float)(bl2 ? -1 : 1) / 16.0f, 0.125f, -0.625f);
        bxy.B().af().a(bga2, bhl2, cua2, bl2);
        cja.E();
    }

    @Override
    public boolean a() {
        return false;
    }
}

