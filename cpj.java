/*
 * Decompiled with CFR 0.150.
 */
public class cpj
extends buc {
    private static final bpx a = new bpx("textures/painting/paintings_kristoffer_zetterstrand.png");

    public cpj(bid bid2) {
        super(bid2);
    }

    public void a(cbk cbk2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cja.b(d2, d3, d4);
        cja.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        cja.A();
        this.e(cbk2);
        dgd dgd2 = cbk2.c;
        float f4 = 0.0625f;
        cja.b(0.0625f, 0.0625f, 0.0625f);
        if (this.j) {
            cja.g();
            cja.e(this.d(cbk2));
        }
        this.a(cbk2, dgd2.C, dgd2.D, dgd2.E, dgd2.F);
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.B();
        cja.E();
        super.a((cpk)cbk2, d2, d3, d4, f2, f3);
    }

    protected bpx a(cbk cbk2) {
        return a;
    }

    private void a(cbk cbk2, int n2, int n3, int n4, int n5) {
        float f2 = (float)(-n2) / 2.0f;
        float f3 = (float)(-n3) / 2.0f;
        float f4 = 0.5f;
        float f5 = 0.75f;
        float f6 = 0.8125f;
        float f7 = 0.0f;
        float f8 = 0.0625f;
        float f9 = 0.75f;
        float f10 = 0.8125f;
        float f11 = 0.001953125f;
        float f12 = 0.001953125f;
        float f13 = 0.7519531f;
        float f14 = 0.7519531f;
        float f15 = 0.0f;
        float f16 = 0.0625f;
        for (int i2 = 0; i2 < n2 / 16; ++i2) {
            for (int i3 = 0; i3 < n3 / 16; ++i3) {
                float f17 = f2 + (float)((i2 + 1) * 16);
                float f18 = f2 + (float)(i2 * 16);
                float f19 = f3 + (float)((i3 + 1) * 16);
                float f20 = f3 + (float)(i3 * 16);
                this.a(cbk2, (f17 + f18) / 2.0f, (f19 + f20) / 2.0f);
                float f21 = (float)(n4 + n2 - i2 * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - (i2 + 1) * 16) / 256.0f;
                float f23 = (float)(n5 + n3 - i3 * 16) / 256.0f;
                float f24 = (float)(n5 + n3 - (i3 + 1) * 16) / 256.0f;
                bha bha2 = bha.a();
                bix bix2 = bha2.c();
                bix2.a(7, bxb.j);
                bix2.b((double)f17, (double)f20, -0.5).a(f22, f23).c(0.0f, 0.0f, -1.0f).d();
                bix2.b((double)f18, (double)f20, -0.5).a(f21, f23).c(0.0f, 0.0f, -1.0f).d();
                bix2.b((double)f18, (double)f19, -0.5).a(f21, f24).c(0.0f, 0.0f, -1.0f).d();
                bix2.b((double)f17, (double)f19, -0.5).a(f22, f24).c(0.0f, 0.0f, -1.0f).d();
                bix2.b((double)f17, (double)f19, 0.5).a(0.75, 0.0).c(0.0f, 0.0f, 1.0f).d();
                bix2.b((double)f18, (double)f19, 0.5).a(0.8125, 0.0).c(0.0f, 0.0f, 1.0f).d();
                bix2.b((double)f18, (double)f20, 0.5).a(0.8125, 0.0625).c(0.0f, 0.0f, 1.0f).d();
                bix2.b((double)f17, (double)f20, 0.5).a(0.75, 0.0625).c(0.0f, 0.0f, 1.0f).d();
                bix2.b((double)f17, (double)f19, -0.5).a(0.75, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                bix2.b((double)f18, (double)f19, -0.5).a(0.8125, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                bix2.b((double)f18, (double)f19, 0.5).a(0.8125, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                bix2.b((double)f17, (double)f19, 0.5).a(0.75, 0.001953125).c(0.0f, 1.0f, 0.0f).d();
                bix2.b((double)f17, (double)f20, 0.5).a(0.75, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                bix2.b((double)f18, (double)f20, 0.5).a(0.8125, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                bix2.b((double)f18, (double)f20, -0.5).a(0.8125, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                bix2.b((double)f17, (double)f20, -0.5).a(0.75, 0.001953125).c(0.0f, -1.0f, 0.0f).d();
                bix2.b((double)f17, (double)f19, 0.5).a(0.751953125, 0.0).c(-1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f17, (double)f20, 0.5).a(0.751953125, 0.0625).c(-1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f17, (double)f20, -0.5).a(0.751953125, 0.0625).c(-1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f17, (double)f19, -0.5).a(0.751953125, 0.0).c(-1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f18, (double)f19, -0.5).a(0.751953125, 0.0).c(1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f18, (double)f20, -0.5).a(0.751953125, 0.0625).c(1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f18, (double)f20, 0.5).a(0.751953125, 0.0625).c(1.0f, 0.0f, 0.0f).d();
                bix2.b((double)f18, (double)f19, 0.5).a(0.751953125, 0.0).c(1.0f, 0.0f, 0.0f).d();
                bha2.b();
            }
        }
    }

    private void a(cbk cbk2, float f2, float f3) {
        int n2 = cmk.c(cbk2.aU);
        int n3 = cmk.c(cbk2.aV + (double)(f3 / 16.0f));
        int n4 = cmk.c(cbk2.aW);
        bqk bqk2 = cbk2.b;
        if (bqk2 == bqk.c) {
            n2 = cmk.c(cbk2.aU + (double)(f2 / 16.0f));
        }
        if (bqk2 == bqk.e) {
            n4 = cmk.c(cbk2.aW - (double)(f2 / 16.0f));
        }
        if (bqk2 == bqk.d) {
            n2 = cmk.c(cbk2.aU - (double)(f2 / 16.0f));
        }
        if (bqk2 == bqk.f) {
            n4 = cmk.c(cbk2.aW + (double)(f2 / 16.0f));
        }
        int n5 = this.g.b.b(new cmz(n2, n3, n4), 0);
        int n6 = n5 % 65536;
        int n7 = n5 / 65536;
        cjg.a(cjg.r, n6, (float)n7);
        cja.d(1.0f, 1.0f, 1.0f);
    }
}

