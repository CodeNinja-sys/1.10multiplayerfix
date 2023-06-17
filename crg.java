/*
 * Decompiled with CFR 0.150.
 */
public class crg
extends kh {
    private final asb a = new asb();

    public void a(cwd cwd2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        boolean bl2 = cwd2.b_() != null;
        boolean bl3 = !bl2 || cwd2.z() == blg.cK;
        int n3 = bl2 ? cwd2.x() : 0;
        long l2 = bl2 ? cwd2.b_().z() : 0L;
        cja.D();
        float f4 = 0.6666667f;
        if (bl3) {
            cja.c((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            float f5 = (float)(n3 * 360) / 16.0f;
            cja.b(-f5, 0.0f, 1.0f, 0.0f);
            this.a.b.j = true;
        } else {
            int n4 = n3;
            f3 = 0.0f;
            if (n4 == 2) {
                f3 = 180.0f;
            }
            if (n4 == 4) {
                f3 = 90.0f;
            }
            if (n4 == 5) {
                f3 = -90.0f;
            }
            cja.c((float)d2 + 0.5f, (float)d3 - 0.16666667f, (float)d4 + 0.5f);
            cja.b(-f3, 0.0f, 1.0f, 0.0f);
            cja.c(0.0f, -0.3125f, -0.4375f);
            this.a.b.j = false;
        }
        cmz cmz2 = cwd2.y();
        f3 = (float)(cmz2.a() * 7 + cmz2.b() * 9 + cmz2.c() * 13) + (float)l2 + f2;
        this.a.a.f = (-0.0125f + 0.01f * cmk.b(f3 * (float)Math.PI * 0.02f)) * (float)Math.PI;
        cja.A();
        bpx bpx2 = this.a(cwd2);
        if (bpx2 != null) {
            this.a(bpx2);
            cja.D();
            cja.b(0.6666667f, -0.6666667f, -0.6666667f);
            this.a.a();
            cja.E();
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.E();
    }

    private bpx a(cwd cwd2) {
        return amb.a.a(cwd2.n(), cwd2.g(), cwd2.k());
    }
}

