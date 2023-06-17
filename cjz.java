/*
 * Decompiled with CFR 0.150.
 */
import java.nio.FloatBuffer;
import java.util.Random;

public class cjz
extends kh {
    private static final bpx d = new bpx("textures/environment/end_sky.png");
    private static final bpx e = new bpx("textures/entity/end_portal.png");
    private static final bpx f = new bpx("textures/entity/end_gateway_beam.png");
    private static final Random g = new Random(31100L);
    private static final FloatBuffer h = avj.e(16);
    private static final FloatBuffer i = avj.e(16);
    FloatBuffer a = avj.e(16);

    public void a(bii bii2, double d2, double d3, double d4, float f2, int n2) {
        int n3;
        cja.o();
        if (bii2.f() || bii2.g()) {
            cja.a(516, 0.1f);
            this.a(f);
            float f3 = bii2.f() ? bii2.h() : bii2.k();
            double d5 = bii2.f() ? 256.0 - d3 : 25.0;
            f3 = cmk.a(f3 * (float)Math.PI);
            n3 = cmk.c((double)f3 * d5);
            float[] arrf = ne.a(bii2.f() ? dck.c : dck.e);
            ep.a(d2, d3, d4, f2, f3, bii2.b_().z(), 0, n3, arrf, 0.15, 0.175);
            ep.a(d2, d3, d4, f2, f3, bii2.b_().z(), 0, -n3, arrf, 0.15, 0.175);
        }
        cja.f();
        g.setSeed(31100L);
        cja.c(2982, h);
        cja.c(2983, i);
        double d6 = d2 * d2 + d3 * d3 + d4 * d4;
        int n4 = d6 > 36864.0 ? 2 : (d6 > 25600.0 ? 4 : (d6 > 16384.0 ? 6 : (d6 > 9216.0 ? 8 : (d6 > 4096.0 ? 10 : (d6 > 1024.0 ? 12 : (d6 > 576.0 ? 14 : (d6 > 256.0 ? 15 : 16)))))));
        for (n3 = 0; n3 < n4; ++n3) {
            cja.D();
            float f4 = 2.0f / (float)(18 - n3);
            if (n3 == 0) {
                this.a(d);
                f4 = 0.15f;
                cja.l();
                cja.a(bjt.l, afi.j);
            }
            if (n3 >= 1) {
                this.a(e);
            }
            if (n3 == 1) {
                cja.l();
                cja.a(bjt.e, afi.e);
            }
            cja.a(awb.a, 9216);
            cja.a(awb.b, 9216);
            cja.a(awb.c, 9216);
            cja.a(awb.a, 9474, this.a(1.0f, 0.0f, 0.0f, 0.0f));
            cja.a(awb.b, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
            cja.a(awb.c, 9474, this.a(0.0f, 0.0f, 1.0f, 0.0f));
            cja.a(awb.a);
            cja.a(awb.b);
            cja.a(awb.c);
            cja.E();
            cja.l(5890);
            cja.D();
            cja.C();
            cja.c(0.5f, 0.5f, 0.0f);
            cja.b(0.5f, 0.5f, 1.0f);
            float f5 = n3 + 1;
            cja.c(17.0f / f5, (2.0f + f5 / 1.5f) * ((float)bxy.K() % 800000.0f / 800000.0f), 0.0f);
            cja.b((f5 * f5 * 4321.0f + f5 * 9.0f) * 2.0f, 0.0f, 0.0f, 1.0f);
            cja.b(4.5f - f5 / 4.0f, 4.5f - f5 / 4.0f, 1.0f);
            cja.a(i);
            cja.a(h);
            bha bha2 = bha.a();
            bix bix2 = bha2.c();
            bix2.a(7, bxb.f);
            float f6 = (g.nextFloat() * 0.5f + 0.1f) * f4;
            float f7 = (g.nextFloat() * 0.5f + 0.4f) * f4;
            float f8 = (g.nextFloat() * 0.5f + 0.5f) * f4;
            if (bii2.a(bqk.d)) {
                bix2.b(d2, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
            }
            if (bii2.a(bqk.c)) {
                bix2.b(d2, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3, d4).a(f6, f7, f8, 1.0f).d();
            }
            if (bii2.a(bqk.f)) {
                bix2.b(d2 + 1.0, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3, d4).a(f6, f7, f8, 1.0f).d();
            }
            if (bii2.a(bqk.e)) {
                bix2.b(d2, d3, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
            }
            if (bii2.a(bqk.a)) {
                bix2.b(d2, d3, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
            }
            if (bii2.a(bqk.b)) {
                bix2.b(d2, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2 + 1.0, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                bix2.b(d2, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
            }
            bha2.b();
            cja.E();
            cja.l(5888);
            this.a(d);
        }
        cja.k();
        cja.b(awb.a);
        cja.b(awb.b);
        cja.b(awb.c);
        cja.e();
        cja.n();
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.a.clear();
        this.a.put(f2).put(f3).put(f4).put(f5);
        this.a.flip();
        return this.a;
    }

    public boolean a(bii bii2) {
        return bii2.f() || bii2.g();
    }
}

