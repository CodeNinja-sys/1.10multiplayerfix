/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cbr
extends kh {
    private static final bpx a = new bpx("textures/entity/sign.png");
    private final atw d = new atw();

    public void a(bxr bxr2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        bfa bfa2 = bxr2.z();
        cja.D();
        float f4 = 0.6666667f;
        if (bfa2 == blg.an) {
            cja.c((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            float f5 = (float)(bxr2.x() * 360) / 16.0f;
            cja.b(-f5, 0.0f, 1.0f, 0.0f);
            this.d.b.j = true;
        } else {
            int n3 = bxr2.x();
            f3 = 0.0f;
            if (n3 == 2) {
                f3 = 180.0f;
            }
            if (n3 == 4) {
                f3 = 90.0f;
            }
            if (n3 == 5) {
                f3 = -90.0f;
            }
            cja.c((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            cja.b(-f3, 0.0f, 1.0f, 0.0f);
            cja.c(0.0f, -0.3125f, -0.4375f);
            this.d.b.j = false;
        }
        if (n2 >= 0) {
            this.a(b[n2]);
            cja.l(5890);
            cja.D();
            cja.b(4.0f, 2.0f, 1.0f);
            cja.c(0.0625f, 0.0625f, 0.0625f);
            cja.l(5888);
        } else {
            this.a(a);
        }
        cja.A();
        cja.D();
        cja.b(0.6666667f, -0.6666667f, -0.6666667f);
        this.d.a();
        cja.E();
        deb deb2 = this.b();
        f3 = 0.010416667f;
        cja.c(0.0f, 0.33333334f, 0.046666667f);
        cja.b(0.010416667f, -0.010416667f, 0.010416667f);
        cja.a(0.0f, 0.0f, -0.010416667f);
        cja.a(false);
        boolean bl2 = false;
        if (n2 < 0) {
            for (int i2 = 0; i2 < bxr2.a.length; ++i2) {
                String string;
                if (bxr2.a[i2] == null) continue;
                cbg cbg2 = bxr2.a[i2];
                List list = cma.a(cbg2, 90, deb2, false, true);
                String string2 = string = list != null && !list.isEmpty() ? ((cbg)list.get(0)).j() : "";
                if (i2 == bxr2.b) {
                    string = "> " + string + " <";
                    deb2.a(string, -deb2.a(string) / 2, i2 * 10 - bxr2.a.length * 5, 0);
                    continue;
                }
                deb2.a(string, -deb2.a(string) / 2, i2 * 10 - bxr2.a.length * 5, 0);
            }
        }
        cja.a(true);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.E();
        if (n2 >= 0) {
            cja.l(5890);
            cja.E();
            cja.l(5888);
        }
    }
}

