/*
 * Decompiled with CFR 0.150.
 */
public class dfu
extends bcf {
    private static final bpx b = new bpx("textures/entity/guardian.png");
    private static final bpx k = new bpx("textures/entity/guardian_elder.png");
    private static final bpx l = new bpx("textures/entity/guardian_beam.png");
    int a;

    public dfu(bid bid2) {
        super(bid2, new arv(), 0.5f);
        this.a = ((arv)this.c).a();
    }

    public boolean a(bym bym2, cct cct2, double d2, double d3, double d4) {
        bga bga2;
        if (super.a(bym2, cct2, d2, d3, d4)) {
            return true;
        }
        if (bym2.aQ() && (bga2 = bym2.aR()) != null) {
            amj amj2 = this.a(bga2, (double)bga2.bm * 0.5, 1.0f);
            amj amj3 = this.a((bga)bym2, (double)bym2.A(), 1.0f);
            if (cct2.a(new cxt(amj3.b, amj3.c, amj3.d, amj2.b, amj2.c, amj2.d))) {
                return true;
            }
        }
        return false;
    }

    private amj a(bga bga2, double d2, float f2) {
        double d3 = bga2.br + (bga2.aU - bga2.br) * (double)f2;
        double d4 = d2 + bga2.bs + (bga2.aV - bga2.bs) * (double)f2;
        double d5 = bga2.bt + (bga2.aW - bga2.bt) * (double)f2;
        return new amj(d3, d4, d5);
    }

    public void a(bym bym2, double d2, double d3, double d4, float f2, float f3) {
        if (this.a != ((arv)this.c).a()) {
            this.c = new arv();
            this.a = ((arv)this.c).a();
        }
        super.a(bym2, d2, d3, d4, f2, f3);
        bga bga2 = bym2.aR();
        if (bga2 != null) {
            float f4 = bym2.p(f3);
            bha bha2 = bha.a();
            bix bix2 = bha2.c();
            this.a(l);
            cja.b(3553, 10242, 10497);
            cja.b(3553, 10243, 10497);
            cja.f();
            cja.q();
            cja.k();
            cja.a(true);
            float f5 = 240.0f;
            cjg.a(cjg.r, 240.0f, 240.0f);
            cja.a(bjt.l, afi.e, bjt.e, afi.n);
            float f6 = (float)bym2.aQ.z() + f3;
            float f7 = f6 * 0.5f % 1.0f;
            float f8 = bym2.A();
            cja.D();
            cja.c((float)d2, (float)d3 + f8, (float)d4);
            amj amj2 = this.a(bga2, (double)bga2.bm * 0.5, f3);
            amj amj3 = this.a((bga)bym2, (double)f8, f3);
            amj amj4 = amj2.d(amj3);
            double d5 = amj4.b() + 1.0;
            amj4 = amj4.a();
            float f9 = (float)Math.acos(amj4.c);
            float f10 = (float)Math.atan2(amj4.d, amj4.b);
            cja.b((1.5707964f + -f10) * 57.295776f, 0.0f, 1.0f, 0.0f);
            cja.b(f9 * 57.295776f, 1.0f, 0.0f, 0.0f);
            boolean bl2 = true;
            double d6 = (double)f6 * 0.05 * -1.5;
            bix2.a(7, bxb.i);
            float f11 = f4 * f4;
            int n2 = 64 + (int)(f11 * 191.0f);
            int n3 = 32 + (int)(f11 * 191.0f);
            int n4 = 128 - (int)(f11 * 64.0f);
            double d7 = 0.2;
            double d8 = 0.282;
            double d9 = 0.0 + Math.cos(d6 + 2.356194490192345) * 0.282;
            double d10 = 0.0 + Math.sin(d6 + 2.356194490192345) * 0.282;
            double d11 = 0.0 + Math.cos(d6 + 0.7853981633974483) * 0.282;
            double d12 = 0.0 + Math.sin(d6 + 0.7853981633974483) * 0.282;
            double d13 = 0.0 + Math.cos(d6 + 3.9269908169872414) * 0.282;
            double d14 = 0.0 + Math.sin(d6 + 3.9269908169872414) * 0.282;
            double d15 = 0.0 + Math.cos(d6 + 5.497787143782138) * 0.282;
            double d16 = 0.0 + Math.sin(d6 + 5.497787143782138) * 0.282;
            double d17 = 0.0 + Math.cos(d6 + Math.PI) * 0.2;
            double d18 = 0.0 + Math.sin(d6 + Math.PI) * 0.2;
            double d19 = 0.0 + Math.cos(d6 + 0.0) * 0.2;
            double d20 = 0.0 + Math.sin(d6 + 0.0) * 0.2;
            double d21 = 0.0 + Math.cos(d6 + 1.5707963267948966) * 0.2;
            double d22 = 0.0 + Math.sin(d6 + 1.5707963267948966) * 0.2;
            double d23 = 0.0 + Math.cos(d6 + 4.71238898038469) * 0.2;
            double d24 = 0.0 + Math.sin(d6 + 4.71238898038469) * 0.2;
            double d25 = d5;
            double d26 = 0.0;
            double d27 = 0.4999;
            double d28 = -1.0f + f7;
            double d29 = d5 * 2.5 + d28;
            bix2.b(d17, d25, d18).a(0.4999, d29).b(n2, n3, n4, 255).d();
            bix2.b(d17, 0.0, d18).a(0.4999, d28).b(n2, n3, n4, 255).d();
            bix2.b(d19, 0.0, d20).a(0.0, d28).b(n2, n3, n4, 255).d();
            bix2.b(d19, d25, d20).a(0.0, d29).b(n2, n3, n4, 255).d();
            bix2.b(d21, d25, d22).a(0.4999, d29).b(n2, n3, n4, 255).d();
            bix2.b(d21, 0.0, d22).a(0.4999, d28).b(n2, n3, n4, 255).d();
            bix2.b(d23, 0.0, d24).a(0.0, d28).b(n2, n3, n4, 255).d();
            bix2.b(d23, d25, d24).a(0.0, d29).b(n2, n3, n4, 255).d();
            double d30 = 0.0;
            if (bym2.by % 2 == 0) {
                d30 = 0.5;
            }
            bix2.b(d9, d25, d10).a(0.5, d30 + 0.5).b(n2, n3, n4, 255).d();
            bix2.b(d11, d25, d12).a(1.0, d30 + 0.5).b(n2, n3, n4, 255).d();
            bix2.b(d15, d25, d16).a(1.0, d30).b(n2, n3, n4, 255).d();
            bix2.b(d13, d25, d14).a(0.5, d30).b(n2, n3, n4, 255).d();
            bha2.b();
            cja.E();
        }
    }

    protected void a(bym bym2, float f2) {
        if (bym2.aM()) {
            cja.b(2.35f, 2.35f, 2.35f);
        }
    }

    protected bpx a(bym bym2) {
        return bym2.aM() ? k : b;
    }
}

