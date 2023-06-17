/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ep
extends kh {
    public static final bpx a = new bpx("textures/entity/beacon_beam.png");

    public void a(agq agq2, double d2, double d3, double d4, float f2, int n2) {
        this.a(d2, d3, d4, f2, agq2.k(), agq2.j(), agq2.b_().z());
    }

    public void a(double d2, double d3, double d4, double d5, double d6, List list, double d7) {
        cja.a(516, 0.1f);
        this.a(a);
        if (d6 > 0.0) {
            cja.o();
            int n2 = 0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                bke bke2 = (bke)list.get(i2);
                ep.a(d2, d3, d4, d5, d6, d7, n2, bke2.c(), bke2.b());
                n2 += bke2.c();
            }
            cja.n();
        }
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, int n2, int n3, float[] arrf) {
        ep.a(d2, d3, d4, d5, d6, d7, n2, n3, arrf, 0.2, 0.25);
    }

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7, int n2, int n3, float[] arrf, double d8, double d9) {
        int n4 = n2 + n3;
        cja.b(3553, 10242, 10497);
        cja.b(3553, 10243, 10497);
        cja.f();
        cja.q();
        cja.k();
        cja.a(true);
        cja.a(bjt.l, afi.e, bjt.e, afi.n);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        double d10 = d7 + d5;
        double d11 = n3 < 0 ? d10 : -d10;
        double d12 = cmk.h(d11 * 0.2 - (double)cmk.c(d11 * 0.1));
        float f2 = arrf[0];
        float f3 = arrf[1];
        float f4 = arrf[2];
        double d13 = d10 * 0.025 * -1.5;
        double d14 = 0.5 + Math.cos(d13 + 2.356194490192345) * d8;
        double d15 = 0.5 + Math.sin(d13 + 2.356194490192345) * d8;
        double d16 = 0.5 + Math.cos(d13 + 0.7853981633974483) * d8;
        double d17 = 0.5 + Math.sin(d13 + 0.7853981633974483) * d8;
        double d18 = 0.5 + Math.cos(d13 + 3.9269908169872414) * d8;
        double d19 = 0.5 + Math.sin(d13 + 3.9269908169872414) * d8;
        double d20 = 0.5 + Math.cos(d13 + 5.497787143782138) * d8;
        double d21 = 0.5 + Math.sin(d13 + 5.497787143782138) * d8;
        double d22 = 0.0;
        double d23 = 1.0;
        double d24 = -1.0 + d12;
        double d25 = (double)n3 * d6 * (0.5 / d8) + d24;
        bix2.a(7, bxb.i);
        bix2.b(d2 + d14, d3 + (double)n4, d4 + d15).a(1.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d14, d3 + (double)n2, d4 + d15).a(1.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d16, d3 + (double)n2, d4 + d17).a(0.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d16, d3 + (double)n4, d4 + d17).a(0.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d20, d3 + (double)n4, d4 + d21).a(1.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d20, d3 + (double)n2, d4 + d21).a(1.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d18, d3 + (double)n2, d4 + d19).a(0.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d18, d3 + (double)n4, d4 + d19).a(0.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d16, d3 + (double)n4, d4 + d17).a(1.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d16, d3 + (double)n2, d4 + d17).a(1.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d20, d3 + (double)n2, d4 + d21).a(0.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d20, d3 + (double)n4, d4 + d21).a(0.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d18, d3 + (double)n4, d4 + d19).a(1.0, d25).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d18, d3 + (double)n2, d4 + d19).a(1.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d14, d3 + (double)n2, d4 + d15).a(0.0, d24).a(f2, f3, f4, 1.0f).d();
        bix2.b(d2 + d14, d3 + (double)n4, d4 + d15).a(0.0, d25).a(f2, f3, f4, 1.0f).d();
        bha2.b();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.a(false);
        d13 = 0.5 - d9;
        d14 = 0.5 - d9;
        d15 = 0.5 + d9;
        d16 = 0.5 - d9;
        d17 = 0.5 - d9;
        d18 = 0.5 + d9;
        d19 = 0.5 + d9;
        d20 = 0.5 + d9;
        d21 = 0.0;
        d22 = 1.0;
        d23 = -1.0 + d12;
        d24 = (double)n3 * d6 + d23;
        bix2.a(7, bxb.i);
        bix2.b(d2 + d13, d3 + (double)n4, d4 + d14).a(1.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d13, d3 + (double)n2, d4 + d14).a(1.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d15, d3 + (double)n2, d4 + d16).a(0.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d15, d3 + (double)n4, d4 + d16).a(0.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d19, d3 + (double)n4, d4 + d20).a(1.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d19, d3 + (double)n2, d4 + d20).a(1.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d17, d3 + (double)n2, d4 + d18).a(0.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d17, d3 + (double)n4, d4 + d18).a(0.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d15, d3 + (double)n4, d4 + d16).a(1.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d15, d3 + (double)n2, d4 + d16).a(1.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d19, d3 + (double)n2, d4 + d20).a(0.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d19, d3 + (double)n4, d4 + d20).a(0.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d17, d3 + (double)n4, d4 + d18).a(1.0, d24).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d17, d3 + (double)n2, d4 + d18).a(1.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d13, d3 + (double)n2, d4 + d14).a(0.0, d23).a(f2, f3, f4, 0.125f).d();
        bix2.b(d2 + d13, d3 + (double)n4, d4 + d14).a(0.0, d24).a(f2, f3, f4, 0.125f).d();
        bha2.b();
        cja.e();
        cja.v();
        cja.a(true);
    }

    public boolean a(agq agq2) {
        return true;
    }
}

