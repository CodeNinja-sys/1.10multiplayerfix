/*
 * Decompiled with CFR 0.150.
 */
public class cdq
extends buc {
    private static final bpx a = new bpx("textures/map/map_background.png");
    private final bxy b = bxy.B();
    private final up c = new up("item_frame", "normal");
    private final up d = new up("item_frame", "map");
    private final bth e;

    public cdq(bid bid2, bth bth2) {
        super(bid2);
        this.e = bth2;
    }

    public void a(cvr cvr2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cmz cmz2 = cvr2.p();
        double d5 = (double)cmz2.a() - cvr2.aU + d2;
        double d6 = (double)cmz2.b() - cvr2.aV + d3;
        double d7 = (double)cmz2.c() - cvr2.aW + d4;
        cja.b(d5 + 0.5, d6 + 0.5, d7 + 0.5);
        cja.b(180.0f - cvr2.ba, 0.0f, 1.0f, 0.0f);
        this.g.a.a(dam.g);
        dfp dfp2 = this.b.ac();
        wm wm2 = dfp2.a().b();
        bpi bpi2 = cvr2.w() != null && cvr2.w().a() == hp.bk ? wm2.a(this.d) : wm2.a(this.c);
        cja.D();
        cja.c(-0.5f, -0.5f, -0.5f);
        if (this.j) {
            cja.g();
            cja.e(this.d(cvr2));
        }
        dfp2.b().a(bpi2, 1.0f, 1.0f, 1.0f, 1.0f);
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.E();
        cja.c(0.0f, 0.0f, 0.4375f);
        this.b(cvr2);
        cja.E();
        this.a(cvr2, d2 + (double)((float)cvr2.b.h() * 0.3f), d3 - 0.25, d4 + (double)((float)cvr2.b.j() * 0.3f));
    }

    protected bpx a(cvr cvr2) {
        return null;
    }

    private void b(cvr cvr2) {
        bhl bhl2 = cvr2.w();
        if (bhl2 == null) {
            return;
        }
        er er2 = new er(cvr2.aQ, 0.0, 0.0, 0.0, bhl2);
        azg azg2 = er2.h().a();
        er2.h().b = 1;
        er2.a = 0.0f;
        cja.D();
        cja.f();
        int n2 = cvr2.B();
        if (azg2 == hp.bk) {
            n2 = n2 % 4 * 2;
        }
        cja.b((float)n2 * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
        if (azg2 == hp.bk) {
            this.g.a.a(a);
            cja.b(180.0f, 0.0f, 0.0f, 1.0f);
            float f2 = 0.0078125f;
            cja.b(0.0078125f, 0.0078125f, 0.0078125f);
            cja.c(-64.0f, -64.0f, 0.0f);
            aph aph2 = hp.bk.a(er2.h(), cvr2.aQ);
            cja.c(0.0f, 0.0f, -1.0f);
            if (aph2 != null) {
                this.b.o.i().a(aph2, true);
            }
        } else {
            cja.b(0.5f, 0.5f, 0.5f);
            if (!this.e.a(er2.h()) || azg2 instanceof crl) {
                cja.b(180.0f, 0.0f, 1.0f, 0.0f);
            }
            cja.a();
            bjr.b();
            this.e.a(er2.h(), cua.i);
            bjr.a();
            cja.b();
        }
        cja.e();
        cja.E();
    }

    protected void a(cvr cvr2, double d2, double d3, double d4) {
        float f2;
        if (!bxy.y() || cvr2.w() == null || !cvr2.w().s() || this.g.d != cvr2) {
            return;
        }
        double d5 = cvr2.l(this.g.c);
        float f3 = f2 = cvr2.ar_() ? 32.0f : 64.0f;
        if (d5 >= (double)(f2 * f2)) {
            return;
        }
        String string = cvr2.w().q();
        this.a((cpk)cvr2, string, d2, d3, d4, 64);
    }
}

