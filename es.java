/*
 * Decompiled with CFR 0.150.
 */
import java.nio.FloatBuffer;
import java.util.Random;

public class es
extends kh {
    private static final bpx d = new bpx("textures/environment/end_sky.png");
    private static final bpx e = new bpx("textures/entity/end_portal.png");
    private static final Random f = new Random(31100L);
    FloatBuffer a = avj.e(16);

    public void a(alv alv2, double d2, double d3, double d4, float f2, int n2) {
        float f3 = (float)this.c.k;
        float f4 = (float)this.c.l;
        float f5 = (float)this.c.m;
        cja.f();
        f.setSeed(31100L);
        float f6 = 0.75f;
        for (int i2 = 0; i2 < 16; ++i2) {
            cja.D();
            float f7 = 16 - i2;
            float f8 = 0.0625f;
            float f9 = 1.0f / (f7 + 1.0f);
            if (i2 == 0) {
                this.a(d);
                f9 = 0.1f;
                f7 = 65.0f;
                f8 = 0.125f;
                cja.l();
                cja.a(bjt.l, afi.j);
            }
            if (i2 >= 1) {
                this.a(e);
            }
            if (i2 == 1) {
                cja.l();
                cja.a(bjt.e, afi.e);
                f8 = 0.5f;
            }
            float f10 = (float)(-(d3 + 0.75));
            float f11 = f10 + (float)bsx.a().c;
            float f12 = f10 + f7 + (float)bsx.a().c;
            float f13 = f11 / f12;
            f13 = (float)(d3 + 0.75) + f13;
            cja.c(f3, f13, f5);
            cja.a(awb.a, 9217);
            cja.a(awb.b, 9217);
            cja.a(awb.c, 9217);
            cja.a(awb.d, 9216);
            cja.a(awb.a, 9473, this.a(1.0f, 0.0f, 0.0f, 0.0f));
            cja.a(awb.b, 9473, this.a(0.0f, 0.0f, 1.0f, 0.0f));
            cja.a(awb.c, 9473, this.a(0.0f, 0.0f, 0.0f, 1.0f));
            cja.a(awb.d, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
            cja.a(awb.a);
            cja.a(awb.b);
            cja.a(awb.c);
            cja.a(awb.d);
            cja.E();
            cja.l(5890);
            cja.D();
            cja.C();
            cja.c(0.0f, (float)(bxy.K() % 700000L) / 700000.0f, 0.0f);
            cja.b(f8, f8, f8);
            cja.c(0.5f, 0.5f, 0.0f);
            cja.b((float)(i2 * i2 * 4321 + i2 * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
            cja.c(-0.5f, -0.5f, 0.0f);
            cja.c(-f3, -f5, -f4);
            f11 = f10 + (float)bsx.a().c;
            cja.c((float)bsx.a().b * f7 / f11, (float)bsx.a().d * f7 / f11, -f4);
            bha bha2 = bha.a();
            bix bix2 = bha2.c();
            bix2.a(7, bxb.f);
            float f14 = (f.nextFloat() * 0.5f + 0.1f) * f9;
            float f15 = (f.nextFloat() * 0.5f + 0.4f) * f9;
            float f16 = (f.nextFloat() * 0.5f + 0.5f) * f9;
            bix2.b(d2, d3 + 0.75, d4).a(f14, f15, f16, 1.0f).d();
            bix2.b(d2, d3 + 0.75, d4 + 1.0).a(f14, f15, f16, 1.0f).d();
            bix2.b(d2 + 1.0, d3 + 0.75, d4 + 1.0).a(f14, f15, f16, 1.0f).d();
            bix2.b(d2 + 1.0, d3 + 0.75, d4).a(f14, f15, f16, 1.0f).d();
            bha2.b();
            cja.E();
            cja.l(5888);
            this.a(d);
        }
        cja.k();
        cja.b(awb.a);
        cja.b(awb.b);
        cja.b(awb.c);
        cja.b(awb.d);
        cja.e();
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.a.clear();
        this.a.put(f2).put(f3).put(f4).put(f5);
        this.a.flip();
        return this.a;
    }
}

