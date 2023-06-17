/*
 * Decompiled with CFR 0.150.
 */
public class sq
extends bcf {
    public static final bpx a = new bpx("textures/entity/endercrystal/endercrystal_beam.png");
    private static final bpx k = new bpx("textures/entity/enderdragon/dragon_exploding.png");
    private static final bpx l = new bpx("textures/entity/enderdragon/dragon.png");
    protected cpr b;

    public sq(bid bid2) {
        super(bid2, new cpr(0.0f), 0.5f);
        this.b = (cpr)this.c;
        this.a(new cxs(this));
        this.a(new atg());
    }

    protected void a(brd brd2, float f2, float f3, float f4) {
        float f5 = (float)brd2.a(7, f4)[0];
        float f6 = (float)(brd2.a(5, f4)[1] - brd2.a(10, f4)[1]);
        cja.b(-f5, 0.0f, 1.0f, 0.0f);
        cja.b(f6 * 10.0f, 1.0f, 0.0f, 0.0f);
        cja.c(0.0f, 0.0f, 1.0f);
        if (brd2.V > 0) {
            float f7 = ((float)brd2.V + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f7 = cmk.c(f7)) > 1.0f) {
                f7 = 1.0f;
            }
            cja.b(f7 * this.a((bga)brd2), 0.0f, 0.0f, 1.0f);
        }
    }

    protected void a(brd brd2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (brd2.y > 0) {
            float f8 = (float)brd2.y / 200.0f;
            cja.c(515);
            cja.d();
            cja.a(516, f8);
            this.a(k);
            this.c.a(brd2, f2, f3, f4, f5, f6, f7);
            cja.a(516, 0.1f);
            cja.c(514);
        }
        this.e(brd2);
        this.c.a(brd2, f2, f3, f4, f5, f6, f7);
        if (brd2.S > 0) {
            cja.c(514);
            cja.w();
            cja.l();
            cja.a(bjt.l, afi.j);
            cja.c(1.0f, 0.0f, 0.0f, 0.5f);
            this.c.a(brd2, f2, f3, f4, f5, f6, f7);
            cja.v();
            cja.k();
            cja.c(515);
        }
    }

    public void a(brd brd2, double d2, double d3, double d4, float f2, float f3) {
        super.a(brd2, d2, d3, d4, f2, f3);
        if (brd2.z != null) {
            this.a(a);
            float f4 = cmk.a(((float)brd2.z.by + f3) * 0.2f) / 2.0f + 0.5f;
            f4 = (f4 * f4 + f4) * 0.2f;
            sq.a(d2, d3, d4, f3, brd2.aU + (brd2.aR - brd2.aU) * (double)(1.0f - f3), brd2.aV + (brd2.aS - brd2.aV) * (double)(1.0f - f3), brd2.aW + (brd2.aT - brd2.aW) * (double)(1.0f - f3), brd2.by, brd2.z.aU, (double)f4 + brd2.z.aV, brd2.z.aW);
        }
    }

    public static void a(double d2, double d3, double d4, float f2, double d5, double d6, double d7, int n2, double d8, double d9, double d10) {
        float f3 = (float)(d8 - d5);
        float f4 = (float)(d9 - 1.0 - d6);
        float f5 = (float)(d10 - d7);
        float f6 = cmk.c(f3 * f3 + f5 * f5);
        float f7 = cmk.c(f3 * f3 + f4 * f4 + f5 * f5);
        cja.D();
        cja.c((float)d2, (float)d3 + 2.0f, (float)d4);
        cja.b((float)(-Math.atan2(f5, f3)) * 57.295776f - 90.0f, 0.0f, 1.0f, 0.0f);
        cja.b((float)(-Math.atan2(f6, f4)) * 57.295776f - 90.0f, 1.0f, 0.0f, 0.0f);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bjr.a();
        cja.q();
        cja.j(7425);
        float f8 = 0.0f - ((float)n2 + f2) * 0.01f;
        float f9 = cmk.c(f3 * f3 + f4 * f4 + f5 * f5) / 32.0f - ((float)n2 + f2) * 0.01f;
        bix2.a(5, bxb.i);
        int n3 = 8;
        for (int i2 = 0; i2 <= 8; ++i2) {
            float f10 = cmk.a((float)(i2 % 8) * ((float)Math.PI * 2) / 8.0f) * 0.75f;
            float f11 = cmk.b((float)(i2 % 8) * ((float)Math.PI * 2) / 8.0f) * 0.75f;
            float f12 = (float)(i2 % 8) / 8.0f;
            bix2.b((double)(f10 * 0.2f), (double)(f11 * 0.2f), 0.0).a(f12, f8).b(0, 0, 0, 255).d();
            bix2.b((double)f10, (double)f11, (double)f7).a(f12, f9).b(255, 255, 255, 255).d();
        }
        bha2.b();
        cja.p();
        cja.j(7424);
        bjr.b();
        cja.E();
    }

    protected bpx a(brd brd2) {
        return l;
    }
}

