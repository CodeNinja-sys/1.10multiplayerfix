/*
 * Decompiled with CFR 0.150.
 */
public class bqw {
    public final apx a;
    public final apx b;
    public final apx c;
    public final apx d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public bqw(bxy bxy2) {
        this.a = new dy(bxy2);
        this.b = new ae(bxy2);
        this.c = new aau(bxy2);
        this.d = new aws(bxy2);
    }

    public boolean a() {
        return this.e || this.f || this.g;
    }

    public boolean b() {
        this.e = !this.e;
        return this.e;
    }

    public void a(float f2, long l2) {
        if (this.f) {
            this.a.a(f2, l2);
        }
        if (this.e && !bxy.B().am()) {
            this.c.a(f2, l2);
        }
        if (this.g) {
            this.b.a(f2, l2);
        }
        if (this.h) {
            this.d.a(f2, l2);
        }
    }

    public static void a(String string, double d2, double d3, double d4, float f2, int n2) {
        bxy bxy2 = bxy.B();
        if (bxy2.h == null || bxy2.ad() == null || bxy2.ad().g == null) {
            return;
        }
        deb deb2 = bxy2.k;
        ob ob2 = bxy2.h;
        double d5 = ob2.br + (ob2.aU - ob2.br) * (double)f2;
        double d6 = ob2.bs + (ob2.aV - ob2.bs) * (double)f2;
        double d7 = ob2.bt + (ob2.aW - ob2.bt) * (double)f2;
        cja.D();
        cja.c((float)(d2 - d5), (float)(d3 - d6) + 0.07f, (float)(d4 - d7));
        cja.a(0.0f, 1.0f, 0.0f);
        cja.b(0.02f, -0.02f, 0.02f);
        bid bid2 = bxy2.ad();
        cja.b(-bid2.e, 0.0f, 1.0f, 0.0f);
        cja.b((float)(bid2.g.as == 2 ? 1 : -1) * bid2.f, 1.0f, 0.0f, 0.0f);
        cja.f();
        cja.v();
        cja.j();
        cja.a(true);
        cja.b(-1.0f, 1.0f, 1.0f);
        deb2.a(string, -deb2.a(string) / 2, 0, n2);
        cja.e();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.E();
    }
}

