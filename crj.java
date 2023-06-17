/*
 * Decompiled with CFR 0.150.
 */
public class crj
extends kh {
    public void a(i i2, double d2, double d3, double d4, float f2, int n2) {
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        if (!bxy.B().h.aU() && !bxy.B().h.aL()) {
            return;
        }
        super.a((bql)i2, d2, d3, d4, f2, n2);
        cmz cmz2 = i2.d();
        cmz cmz3 = i2.e();
        if (cmz3.a() < 1 || cmz3.b() < 1 || cmz3.c() < 1) {
            return;
        }
        if (i2.i() != cfk.a && i2.i() != cfk.b) {
            return;
        }
        double d11 = 0.01;
        double d12 = cmz2.a();
        double d13 = cmz2.c();
        double d14 = d3 + (double)cmz2.b() - 0.01;
        double d15 = d14 + (double)cmz3.b() + 0.02;
        switch (i2.f()) {
            case b: {
                d10 = (double)cmz3.a() + 0.02;
                d9 = -((double)cmz3.c() + 0.02);
                break;
            }
            case c: {
                d10 = -((double)cmz3.a() + 0.02);
                d9 = (double)cmz3.c() + 0.02;
                break;
            }
            default: {
                d10 = (double)cmz3.a() + 0.02;
                d9 = (double)cmz3.c() + 0.02;
            }
        }
        switch (i2.g()) {
            case b: {
                d8 = d2 + (d9 < 0.0 ? d12 - 0.01 : d12 + 1.0 + 0.01);
                d7 = d4 + (d10 < 0.0 ? d13 + 1.0 + 0.01 : d13 - 0.01);
                d6 = d8 - d9;
                d5 = d7 + d10;
                break;
            }
            case c: {
                d8 = d2 + (d10 < 0.0 ? d12 - 0.01 : d12 + 1.0 + 0.01);
                d7 = d4 + (d9 < 0.0 ? d13 - 0.01 : d13 + 1.0 + 0.01);
                d6 = d8 - d10;
                d5 = d7 - d9;
                break;
            }
            case d: {
                d8 = d2 + (d9 < 0.0 ? d12 + 1.0 + 0.01 : d12 - 0.01);
                d7 = d4 + (d10 < 0.0 ? d13 - 0.01 : d13 + 1.0 + 0.01);
                d6 = d8 + d9;
                d5 = d7 - d10;
                break;
            }
            default: {
                d8 = d2 + (d10 < 0.0 ? d12 + 1.0 + 0.01 : d12 - 0.01);
                d7 = d4 + (d9 < 0.0 ? d13 + 1.0 + 0.01 : d13 - 0.01);
                d6 = d8 + d10;
                d5 = d7 + d9;
            }
        }
        int n3 = 255;
        int n4 = 223;
        int n5 = 127;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.o();
        cja.f();
        cja.w();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        this.a(true);
        if (i2.i() == cfk.a || i2.u()) {
            this.a(bha2, bix2, d8, d14, d7, d6, d15, d5, 255, 223, 127);
        }
        if (i2.i() == cfk.a && i2.t()) {
            this.a(i2, d2, d3, d4, cmz2, bha2, bix2, true);
            this.a(i2, d2, d3, d4, cmz2, bha2, bix2, false);
        }
        this.a(false);
        cja.d(1.0f);
        cja.e();
        cja.v();
        cja.j();
        cja.a(true);
        cja.n();
    }

    private void a(i i2, double d2, double d3, double d4, cmz cmz2, bha bha2, bix bix2, boolean bl2) {
        cja.d(bl2 ? 3.0f : 1.0f);
        bix2.a(3, bxb.f);
        iu iu2 = i2.b_();
        cmz cmz3 = i2.y();
        cmz cmz4 = cmz3.g(cmz2);
        for (cmz cmz5 : pj.a(cmz4, cmz4.g(i2.e()).e(-1, -1, -1))) {
            boolean bl3;
            dbk dbk2 = iu2.n(cmz5);
            boolean bl4 = dbk2 == blg.a.s();
            boolean bl5 = bl3 = dbk2 == blg.dj.s();
            if (!bl4 && !bl3) continue;
            float f2 = bl4 ? 0.05f : 0.0f;
            double d5 = (double)((float)(cmz5.a() - cmz3.a()) + 0.45f) + d2 - (double)f2;
            double d6 = (double)((float)(cmz5.b() - cmz3.b()) + 0.45f) + d3 - (double)f2;
            double d7 = (double)((float)(cmz5.c() - cmz3.c()) + 0.45f) + d4 - (double)f2;
            double d8 = (double)((float)(cmz5.a() - cmz3.a()) + 0.55f) + d2 + (double)f2;
            double d9 = (double)((float)(cmz5.b() - cmz3.b()) + 0.55f) + d3 + (double)f2;
            double d10 = (double)((float)(cmz5.c() - cmz3.c()) + 0.55f) + d4 + (double)f2;
            if (bl2) {
                fr.a(bix2, d5, d6, d7, d8, d9, d10, 0.0f, 0.0f, 0.0f, 1.0f);
                continue;
            }
            if (bl4) {
                fr.a(bix2, d5, d6, d7, d8, d9, d10, 0.5f, 0.5f, 1.0f, 1.0f);
                continue;
            }
            fr.a(bix2, d5, d6, d7, d8, d9, d10, 1.0f, 0.25f, 0.25f, 1.0f);
        }
        bha2.b();
    }

    private void a(bha bha2, bix bix2, double d2, double d3, double d4, double d5, double d6, double d7, int n2, int n3, int n4) {
        cja.d(2.0f);
        bix2.a(3, bxb.f);
        bix2.b(d2, d3, d4).a((float)n3, (float)n3, (float)n3, 0.0f).d();
        bix2.b(d2, d3, d4).b(n3, n3, n3, n2).d();
        bix2.b(d5, d3, d4).b(n3, n4, n4, n2).d();
        bix2.b(d5, d3, d7).b(n3, n3, n3, n2).d();
        bix2.b(d2, d3, d7).b(n3, n3, n3, n2).d();
        bix2.b(d2, d3, d4).b(n4, n4, n3, n2).d();
        bix2.b(d2, d6, d4).b(n4, n3, n4, n2).d();
        bix2.b(d5, d6, d4).b(n3, n3, n3, n2).d();
        bix2.b(d5, d6, d7).b(n3, n3, n3, n2).d();
        bix2.b(d2, d6, d7).b(n3, n3, n3, n2).d();
        bix2.b(d2, d6, d4).b(n3, n3, n3, n2).d();
        bix2.b(d2, d6, d7).b(n3, n3, n3, n2).d();
        bix2.b(d2, d3, d7).b(n3, n3, n3, n2).d();
        bix2.b(d5, d3, d7).b(n3, n3, n3, n2).d();
        bix2.b(d5, d6, d7).b(n3, n3, n3, n2).d();
        bix2.b(d5, d6, d4).b(n3, n3, n3, n2).d();
        bix2.b(d5, d3, d4).b(n3, n3, n3, n2).d();
        bix2.b(d5, d3, d4).a((float)n3, (float)n3, (float)n3, 0.0f).d();
        bha2.b();
        cja.d(1.0f);
    }

    public boolean a(i i2) {
        return true;
    }
}

