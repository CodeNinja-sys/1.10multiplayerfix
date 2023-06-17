/*
 * Decompiled with CFR 0.150.
 */
public abstract class buc {
    private static final bpx a = new bpx("textures/misc/shadow.png");
    protected final bid g;
    protected float h;
    protected float i = 1.0f;
    protected boolean j;

    protected buc(bid bid2) {
        this.g = bid2;
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }

    public boolean a(cpk cpk2, cct cct2, double d2, double d3, double d4) {
        cxt cxt2 = cpk2.M_().b(0.5);
        if (cxt2.b() || cxt2.a() == 0.0) {
            cxt2 = new cxt(cpk2.aU - 2.0, cpk2.aV - 2.0, cpk2.aW - 2.0, cpk2.aU + 2.0, cpk2.aV + 2.0, cpk2.aW + 2.0);
        }
        return cpk2.k(d2, d3, d4) && (cpk2.bN || cct2.a(cxt2));
    }

    public void a(cpk cpk2, double d2, double d3, double d4, float f2, float f3) {
        if (!this.j) {
            this.a(cpk2, d2, d3, d4);
        }
    }

    protected int d(cpk cpk2) {
        String string;
        int n2 = 0xFFFFFF;
        ef ef2 = (ef)cpk2.as_();
        if (ef2 != null && (string = deb.b(ef2.d())).length() >= 2) {
            n2 = this.f().b(string.charAt(1));
        }
        return n2;
    }

    protected void a(cpk cpk2, double d2, double d3, double d4) {
        if (!this.b(cpk2)) {
            return;
        }
        this.a(cpk2, cpk2.v().j(), d2, d3, d4, 64);
    }

    protected boolean b(cpk cpk2) {
        return cpk2.F_() && cpk2.j_();
    }

    protected void a(cpk cpk2, double d2, double d3, double d4, String string, double d5) {
        this.a(cpk2, string, d2, d3, d4, 64);
    }

    protected abstract bpx a(cpk var1);

    protected boolean e(cpk cpk2) {
        bpx bpx2 = this.a(cpk2);
        if (bpx2 == null) {
            return false;
        }
        this.a(bpx2);
        return true;
    }

    public void a(bpx bpx2) {
        this.g.a.a(bpx2);
    }

    private void a(cpk cpk2, double d2, double d3, double d4, float f2) {
        cja.f();
        dam dam2 = bxy.B().T();
        ars ars2 = dam2.a("minecraft:blocks/fire_layer_0");
        ars ars3 = dam2.a("minecraft:blocks/fire_layer_1");
        cja.D();
        cja.c((float)d2, (float)d3, (float)d4);
        float f3 = cpk2.bl * 1.4f;
        cja.b(f3, f3, f3);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = cpk2.bm / f3;
        float f7 = (float)(cpk2.aV - cpk2.cD().b);
        cja.b(-this.g.e, 0.0f, 1.0f, 0.0f);
        cja.c(0.0f, 0.0f, -0.3f + (float)((int)f6) * 0.02f);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f8 = 0.0f;
        int n2 = 0;
        bix2.a(7, bxb.g);
        while (f6 > 0.0f) {
            ars ars4 = n2 % 2 == 0 ? ars2 : ars3;
            this.a(dam.g);
            float f9 = ars4.e();
            float f10 = ars4.g();
            float f11 = ars4.f();
            float f12 = ars4.h();
            if (n2 / 2 % 2 == 0) {
                float f13 = f11;
                f11 = f9;
                f9 = f13;
            }
            bix2.b((double)(f4 - 0.0f), (double)(0.0f - f7), (double)f8).a(f11, f12).d();
            bix2.b((double)(-f4 - 0.0f), (double)(0.0f - f7), (double)f8).a(f9, f12).d();
            bix2.b((double)(-f4 - 0.0f), (double)(1.4f - f7), (double)f8).a(f9, f10).d();
            bix2.b((double)(f4 - 0.0f), (double)(1.4f - f7), (double)f8).a(f11, f10).d();
            f6 -= 0.45f;
            f7 -= 0.45f;
            f4 *= 0.9f;
            f8 += 0.03f;
            ++n2;
        }
        bha2.b();
        cja.E();
        cja.e();
    }

    private void d(cpk cpk2, double d2, double d3, double d4, float f2, float f3) {
        cja.l();
        cja.a(bjt.l, afi.j);
        this.g.a.a(a);
        iu iu2 = this.b();
        cja.a(false);
        float f4 = this.h;
        if (cpk2 instanceof xy) {
            xy xy2 = (xy)cpk2;
            f4 *= xy2.ay();
            if (xy2.R_()) {
                f4 *= 0.5f;
            }
        }
        double d5 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f3;
        double d6 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f3;
        double d7 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f3;
        int n2 = cmk.c(d5 - (double)f4);
        int n3 = cmk.c(d5 + (double)f4);
        int n4 = cmk.c(d6 - (double)f4);
        int n5 = cmk.c(d6);
        int n6 = cmk.c(d7 - (double)f4);
        int n7 = cmk.c(d7 + (double)f4);
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = d4 - d7;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.i);
        for (cmz cmz2 : cmz.b(new cmz(n2, n4, n6), new cmz(n3, n5, n7))) {
            dbk dbk2 = iu2.n(cmz2.h());
            if (dbk2.i() == cpb.a || iu2.j(cmz2) <= 3) continue;
            this.a(dbk2, d2, d3, d4, cmz2, f2, f4, d8, d9, d10);
        }
        bha2.b();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
        cja.a(true);
    }

    private iu b() {
        return this.g.b;
    }

    private void a(dbk dbk2, double d2, double d3, double d4, cmz cmz2, float f2, float f3, double d5, double d6, double d7) {
        if (!dbk2.h()) {
            return;
        }
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        double d8 = ((double)f2 - (d3 - ((double)cmz2.b() + d6)) / 2.0) * 0.5 * (double)this.b().m(cmz2);
        if (d8 < 0.0) {
            return;
        }
        if (d8 > 1.0) {
            d8 = 1.0;
        }
        cxt cxt2 = dbk2.c((bnj)this.b(), cmz2);
        double d9 = (double)cmz2.a() + cxt2.a + d5;
        double d10 = (double)cmz2.a() + cxt2.d + d5;
        double d11 = (double)cmz2.b() + cxt2.b + d6 + 0.015625;
        double d12 = (double)cmz2.c() + cxt2.c + d7;
        double d13 = (double)cmz2.c() + cxt2.f + d7;
        float f4 = (float)((d2 - d9) / 2.0 / (double)f3 + 0.5);
        float f5 = (float)((d2 - d10) / 2.0 / (double)f3 + 0.5);
        float f6 = (float)((d4 - d12) / 2.0 / (double)f3 + 0.5);
        float f7 = (float)((d4 - d13) / 2.0 / (double)f3 + 0.5);
        bix2.b(d9, d11, d12).a(f4, f6).a(1.0f, 1.0f, 1.0f, (float)d8).d();
        bix2.b(d9, d11, d13).a(f4, f7).a(1.0f, 1.0f, 1.0f, (float)d8).d();
        bix2.b(d10, d11, d13).a(f5, f7).a(1.0f, 1.0f, 1.0f, (float)d8).d();
        bix2.b(d10, d11, d12).a(f5, f6).a(1.0f, 1.0f, 1.0f, (float)d8).d();
    }

    public static void a(cxt cxt2, double d2, double d3, double d4) {
        cja.w();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        bix2.c(d2, d3, d4);
        bix2.a(7, bxb.h);
        bix2.b(cxt2.a, cxt2.e, cxt2.c).c(0.0f, 0.0f, -1.0f).d();
        bix2.b(cxt2.d, cxt2.e, cxt2.c).c(0.0f, 0.0f, -1.0f).d();
        bix2.b(cxt2.d, cxt2.b, cxt2.c).c(0.0f, 0.0f, -1.0f).d();
        bix2.b(cxt2.a, cxt2.b, cxt2.c).c(0.0f, 0.0f, -1.0f).d();
        bix2.b(cxt2.a, cxt2.b, cxt2.f).c(0.0f, 0.0f, 1.0f).d();
        bix2.b(cxt2.d, cxt2.b, cxt2.f).c(0.0f, 0.0f, 1.0f).d();
        bix2.b(cxt2.d, cxt2.e, cxt2.f).c(0.0f, 0.0f, 1.0f).d();
        bix2.b(cxt2.a, cxt2.e, cxt2.f).c(0.0f, 0.0f, 1.0f).d();
        bix2.b(cxt2.a, cxt2.b, cxt2.c).c(0.0f, -1.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.b, cxt2.c).c(0.0f, -1.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.b, cxt2.f).c(0.0f, -1.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.b, cxt2.f).c(0.0f, -1.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.e, cxt2.f).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.e, cxt2.f).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.e, cxt2.c).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.e, cxt2.c).c(0.0f, 1.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.b, cxt2.f).c(-1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.e, cxt2.f).c(-1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.e, cxt2.c).c(-1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.a, cxt2.b, cxt2.c).c(-1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.b, cxt2.c).c(1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.e, cxt2.c).c(1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.e, cxt2.f).c(1.0f, 0.0f, 0.0f).d();
        bix2.b(cxt2.d, cxt2.b, cxt2.f).c(1.0f, 0.0f, 0.0f).d();
        bha2.b();
        bix2.c(0.0, 0.0, 0.0);
        cja.v();
    }

    public void c(cpk cpk2, double d2, double d3, double d4, float f2, float f3) {
        double d5;
        float f4;
        if (this.g.g == null) {
            return;
        }
        if (this.g.g.M && this.h > 0.0f && !cpk2.ct() && this.g.a() && (f4 = (float)((1.0 - (d5 = this.g.b(cpk2.aU, cpk2.aV, cpk2.aW)) / 256.0) * (double)this.i)) > 0.0f) {
            this.d(cpk2, d2, d3, d4, f4, f3);
        }
        if (!(!cpk2.z_() || cpk2 instanceof bdl && ((bdl)cpk2).aL())) {
            this.a(cpk2, d2, d3, d4, f3);
        }
    }

    public deb f() {
        return this.g.c();
    }

    protected void a(cpk cpk2, String string, double d2, double d3, double d4, int n2) {
        double d5 = cpk2.l(this.g.c);
        if (d5 > (double)(n2 * n2)) {
            return;
        }
        boolean bl2 = cpk2.ar_();
        float f2 = this.g.e;
        float f3 = this.g.f;
        boolean bl3 = this.g.g.as == 2;
        float f4 = cpk2.bm + 0.5f - (bl2 ? 0.25f : 0.0f);
        int n3 = "deadmau5".equals(string) ? -10 : 0;
        cwz.a(this.f(), string, (float)d2, (float)d3 + f4, (float)d4, n3, f2, f3, bl3, bl2);
    }

    public bid g() {
        return this.g;
    }

    public boolean r_() {
        return false;
    }

    public void b(cpk cpk2, double d2, double d3, double d4, float f2, float f3) {
    }
}

