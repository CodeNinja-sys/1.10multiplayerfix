/*
 * Decompiled with CFR 0.150.
 */
public class alo {
    public static final bpx n = new bpx("textures/gui/options_background.png");
    public static final bpx o = new bpx("textures/gui/container/stats_icons.png");
    public static final bpx p = new bpx("textures/gui/icons.png");
    protected float q;

    protected void a(int n2, int n3, int n4, int n5) {
        if (n3 < n2) {
            int n6 = n2;
            n2 = n3;
            n3 = n6;
        }
        alo.a(n2, n4, n3 + 1, n4 + 1, n5);
    }

    protected void b(int n2, int n3, int n4, int n5) {
        if (n4 < n3) {
            int n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        alo.a(n2, n3 + 1, n2 + 1, n4, n5);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (n2 < n4) {
            n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        if (n3 < n5) {
            n7 = n3;
            n3 = n5;
            n5 = n7;
        }
        float f2 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n6 & 0xFF) / 255.0f;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.l();
        cja.w();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c(f3, f4, f5, f2);
        bix2.a(7, bxb.e);
        bix2.b((double)n2, (double)n5, 0.0).d();
        bix2.b((double)n4, (double)n5, 0.0).d();
        bix2.b((double)n4, (double)n3, 0.0).d();
        bix2.b((double)n2, (double)n3, 0.0).d();
        bha2.b();
        cja.v();
        cja.k();
    }

    protected void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f2 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n6 & 0xFF) / 255.0f;
        float f6 = (float)(n7 >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n7 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n7 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n7 & 0xFF) / 255.0f;
        cja.w();
        cja.l();
        cja.c();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.j(7425);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.f);
        bix2.b((double)n4, (double)n3, (double)this.q).a(f3, f4, f5, f2).d();
        bix2.b((double)n2, (double)n3, (double)this.q).a(f3, f4, f5, f2).d();
        bix2.b((double)n2, (double)n5, (double)this.q).a(f7, f8, f9, f6).d();
        bix2.b((double)n4, (double)n5, (double)this.q).a(f7, f8, f9, f6).d();
        bha2.b();
        cja.j(7424);
        cja.k();
        cja.d();
        cja.v();
    }

    public void a(deb deb2, String string, int n2, int n3, int n4) {
        deb2.a(string, (float)(n2 - deb2.a(string) / 2), (float)n3, n4);
    }

    public void b(deb deb2, String string, int n2, int n3, int n4) {
        deb2.a(string, (float)n2, (float)n3, n4);
    }

    public void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)(n2 + 0), (double)(n3 + n7), (double)this.q).a((float)(n4 + 0) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).d();
        bix2.b((double)(n2 + n6), (double)(n3 + n7), (double)this.q).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).d();
        bix2.b((double)(n2 + n6), (double)(n3 + 0), (double)this.q).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + 0) * 0.00390625f).d();
        bix2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.q).a((float)(n4 + 0) * 0.00390625f, (float)(n5 + 0) * 0.00390625f).d();
        bha2.b();
    }

    public void a(float f2, float f3, int n2, int n3, int n4, int n5) {
        float f4 = 0.00390625f;
        float f5 = 0.00390625f;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)(f2 + 0.0f), (double)(f3 + (float)n5), (double)this.q).a((float)(n2 + 0) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).d();
        bix2.b((double)(f2 + (float)n4), (double)(f3 + (float)n5), (double)this.q).a((float)(n2 + n4) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).d();
        bix2.b((double)(f2 + (float)n4), (double)(f3 + 0.0f), (double)this.q).a((float)(n2 + n4) * 0.00390625f, (float)(n3 + 0) * 0.00390625f).d();
        bix2.b((double)(f2 + 0.0f), (double)(f3 + 0.0f), (double)this.q).a((float)(n2 + 0) * 0.00390625f, (float)(n3 + 0) * 0.00390625f).d();
        bha2.b();
    }

    public void a(int n2, int n3, ars ars2, int n4, int n5) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)(n2 + 0), (double)(n3 + n5), (double)this.q).a(ars2.e(), ars2.h()).d();
        bix2.b((double)(n2 + n4), (double)(n3 + n5), (double)this.q).a(ars2.f(), ars2.h()).d();
        bix2.b((double)(n2 + n4), (double)(n3 + 0), (double)this.q).a(ars2.f(), ars2.g()).d();
        bix2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.q).a(ars2.e(), ars2.g()).d();
        bha2.b();
    }

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, float f4, float f5) {
        float f6 = 1.0f / f4;
        float f7 = 1.0f / f5;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)n2, (double)(n3 + n5), 0.0).a(f2 * f6, (f3 + (float)n5) * f7).d();
        bix2.b((double)(n2 + n4), (double)(n3 + n5), 0.0).a((f2 + (float)n4) * f6, (f3 + (float)n5) * f7).d();
        bix2.b((double)(n2 + n4), (double)n3, 0.0).a((f2 + (float)n4) * f6, f3 * f7).d();
        bix2.b((double)n2, (double)n3, 0.0).a(f2 * f6, f3 * f7).d();
        bha2.b();
    }

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, int n6, int n7, float f4, float f5) {
        float f6 = 1.0f / f4;
        float f7 = 1.0f / f5;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.g);
        bix2.b((double)n2, (double)(n3 + n7), 0.0).a(f2 * f6, (f3 + (float)n5) * f7).d();
        bix2.b((double)(n2 + n6), (double)(n3 + n7), 0.0).a((f2 + (float)n4) * f6, (f3 + (float)n5) * f7).d();
        bix2.b((double)(n2 + n6), (double)n3, 0.0).a((f2 + (float)n4) * f6, f3 * f7).d();
        bix2.b((double)n2, (double)n3, 0.0).a(f2 * f6, f3 * f7).d();
        bha2.b();
    }
}

