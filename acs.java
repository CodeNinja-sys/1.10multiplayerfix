/*
 * Decompiled with CFR 0.150.
 */
public class acs
extends kh {
    private static final bpx a = new bpx("textures/entity/chest/ender.png");
    private final bcd d = new bcd();

    public void a(abn abn2, double d2, double d3, double d4, float f2, int n2) {
        int n3 = 0;
        if (abn2.w()) {
            n3 = abn2.x();
        }
        if (n2 >= 0) {
            this.a(b[n2]);
            cja.l(5890);
            cja.D();
            cja.b(4.0f, 4.0f, 1.0f);
            cja.c(0.0625f, 0.0625f, 0.0625f);
            cja.l(5888);
        } else {
            this.a(a);
        }
        cja.D();
        cja.A();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.c((float)d2, (float)d3 + 1.0f, (float)d4 + 1.0f);
        cja.b(1.0f, -1.0f, -1.0f);
        cja.c(0.5f, 0.5f, 0.5f);
        int n4 = 0;
        if (n3 == 2) {
            n4 = 180;
        }
        if (n3 == 3) {
            n4 = 0;
        }
        if (n3 == 4) {
            n4 = 90;
        }
        if (n3 == 5) {
            n4 = -90;
        }
        cja.b((float)n4, 0.0f, 1.0f, 0.0f);
        cja.c(-0.5f, -0.5f, -0.5f);
        float f3 = abn2.b + (abn2.a - abn2.b) * f2;
        f3 = 1.0f - f3;
        f3 = 1.0f - f3 * f3 * f3;
        this.d.a.f = -(f3 * 1.5707964f);
        this.d.a();
        cja.B();
        cja.E();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        if (n2 >= 0) {
            cja.l(5890);
            cja.E();
            cja.l(5888);
        }
    }
}

