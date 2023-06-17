/*
 * Decompiled with CFR 0.150.
 */
public class kn
extends wq {
    private final boolean a;

    public kn(bid bid2) {
        this(bid2, false);
    }

    public kn(bid bid2, boolean bl2) {
        super(bid2, new csr(0.0f, bl2), 0.5f);
        this.a = bl2;
        this.a(new acl(this));
        this.a(new kl(this));
        this.a(new clr(this));
        this.a(new cid(this));
        this.a(new blh(this));
        this.a(new aot(this.b().e));
        this.a(new aog(this));
    }

    public csr b() {
        return (csr)super.c();
    }

    public void a(ciy ciy2, double d2, double d3, double d4, float f2, float f3) {
        if (ciy2.z() && this.g.c != ciy2) {
            return;
        }
        double d5 = d3;
        if (ciy2.ar_() && !(ciy2 instanceof ob)) {
            d5 -= 0.125;
        }
        this.d(ciy2);
        cja.a(asc.b);
        super.a(ciy2, d2, d5, d4, f2, f3);
        cja.b(asc.b);
    }

    private void d(ciy ciy2) {
        csr csr2 = this.b();
        if (ciy2.aL()) {
            csr2.a(false);
            csr2.e.j = true;
            csr2.f.j = true;
        } else {
            cga cga2;
            bhl bhl2 = ciy2.bt();
            bhl bhl3 = ciy2.bu();
            csr2.a(true);
            csr2.f.j = ciy2.a(bzk.g);
            csr2.u.j = ciy2.a(bzk.b);
            csr2.c.j = ciy2.a(bzk.e);
            csr2.d.j = ciy2.a(bzk.f);
            csr2.a.j = ciy2.a(bzk.c);
            csr2.b.j = ciy2.a(bzk.d);
            csr2.t = ciy2.ar_();
            ckq ckq2 = ckq.a;
            ckq ckq3 = ckq.a;
            if (bhl2 != null) {
                ckq2 = ckq.b;
                if (ciy2.bH() > 0) {
                    cga2 = bhl2.m();
                    if (cga2 == cga.d) {
                        ckq2 = ckq.c;
                    } else if (cga2 == cga.e) {
                        ckq2 = ckq.d;
                    }
                }
            }
            if (bhl3 != null) {
                ckq3 = ckq.b;
                if (ciy2.bH() > 0 && (cga2 = bhl3.m()) == cga.d) {
                    ckq3 = ckq.c;
                }
            }
            if (ciy2.aK() == s.b) {
                csr2.s = ckq2;
                csr2.r = ckq3;
            } else {
                csr2.s = ckq3;
                csr2.r = ckq2;
            }
        }
    }

    protected bpx a(ciy ciy2) {
        return ciy2.bQ();
    }

    @Override
    public void a() {
        cja.c(0.0f, 0.1875f, 0.0f);
    }

    protected void a(ciy ciy2, float f2) {
        float f3 = 0.9375f;
        cja.b(0.9375f, 0.9375f, 0.9375f);
    }

    protected void a(ciy ciy2, double d2, double d3, double d4, String string, double d5) {
        bzt bzt2;
        bhi bhi2;
        if (d5 < 100.0 && (bhi2 = (bzt2 = ciy2.aN()).a(2)) != null) {
            czu czu2 = bzt2.c(ciy2.i_(), bhi2);
            this.a((cpk)ciy2, czu2.b() + " " + bhi2.d(), d2, d3, d4, 64);
            d3 += (double)((float)this.f().a * 1.15f * 0.025f);
        }
        super.a((cpk)ciy2, d2, d3, d4, string, d5);
    }

    public void b(ciy ciy2) {
        float f2 = 1.0f;
        cja.d(1.0f, 1.0f, 1.0f);
        float f3 = 0.0625f;
        csr csr2 = this.b();
        this.d(ciy2);
        cja.l();
        csr2.l = 0.0f;
        csr2.t = false;
        csr2.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, ciy2);
        csr2.h.f = 0.0f;
        csr2.h.a(0.0625f);
        csr2.b.f = 0.0f;
        csr2.b.a(0.0625f);
        cja.k();
    }

    public void c(ciy ciy2) {
        float f2 = 1.0f;
        cja.d(1.0f, 1.0f, 1.0f);
        float f3 = 0.0625f;
        csr csr2 = this.b();
        this.d(ciy2);
        cja.l();
        csr2.t = false;
        csr2.l = 0.0f;
        csr2.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, ciy2);
        csr2.i.f = 0.0f;
        csr2.i.a(0.0625f);
        csr2.a.f = 0.0f;
        csr2.a.a(0.0625f);
        cja.k();
    }

    protected void a(ciy ciy2, double d2, double d3, double d4) {
        if (ciy2.bj() && ciy2.H_()) {
            super.a((bga)ciy2, d2 + (double)ciy2.D, d3 + (double)ciy2.E, d4 + (double)ciy2.F);
        } else {
            super.a((bga)ciy2, d2, d3, d4);
        }
    }

    protected void a(ciy ciy2, float f2, float f3, float f4) {
        if (ciy2.bj() && ciy2.H_()) {
            cja.b(ciy2.ar(), 0.0f, 1.0f, 0.0f);
            cja.b(this.a((bga)ciy2), 0.0f, 0.0f, 1.0f);
            cja.b(270.0f, 0.0f, 1.0f, 0.0f);
        } else if (ciy2.bL()) {
            super.a((bga)ciy2, f2, f3, f4);
            float f5 = (float)ciy2.bM() + f4;
            float f6 = cmk.a(f5 * f5 / 100.0f, 0.0f, 1.0f);
            cja.b(f6 * (-90.0f - ciy2.bb), 1.0f, 0.0f, 0.0f);
            amj amj2 = ciy2.l(f4);
            double d2 = ciy2.aX * ciy2.aX + ciy2.aZ * ciy2.aZ;
            double d3 = amj2.b * amj2.b + amj2.d * amj2.d;
            if (d2 > 0.0 && d3 > 0.0) {
                double d4 = (ciy2.aX * amj2.b + ciy2.aZ * amj2.d) / (Math.sqrt(d2) * Math.sqrt(d3));
                double d5 = ciy2.aX * amj2.d - ciy2.aZ * amj2.b;
                cja.b((float)(Math.signum(d5) * Math.acos(d4)) * 180.0f / (float)Math.PI, 0.0f, 1.0f, 0.0f);
            }
        } else {
            super.a((bga)ciy2, f2, f3, f4);
        }
    }

    @Override
    public /* synthetic */ axg c() {
        return this.b();
    }
}

