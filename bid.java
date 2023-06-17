/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class bid {
    private final Map k = sz.c();
    private final Map l = sz.c();
    private final kn m;
    private deb n;
    private double o;
    private double p;
    private double q;
    public bnm a;
    public iu b;
    public cpk c;
    public cpk d;
    public float e;
    public float f;
    public cmx g;
    public double h;
    public double i;
    public double j;
    private boolean r;
    private boolean s = true;
    private boolean t;

    public bid(bnm bnm2, bth bth2) {
        this.a = bnm2;
        this.k.put(bys.class, new deo(this));
        this.k.put(yi.class, new wa(this));
        this.k.put(cna.class, new aev(this, new cru(), 0.7f));
        this.k.put(ne.class, new axr(this, new cqo(), 0.7f));
        this.k.put(cof.class, new eh(this, new bwq(), 0.7f));
        this.k.put(blx.class, new adx(this, new bwq(), 0.7f));
        this.k.put(cqw.class, new bad(this, new asd(), 0.5f));
        this.k.put(jp.class, new anf(this, new tm(), 0.3f));
        this.k.put(fl.class, new so(this, new bpu(), 0.4f));
        this.k.put(amq.class, new buy(this, new bpp(), 0.3f));
        this.k.put(zv.class, new ty(this));
        this.k.put(cjo.class, new pv(this));
        this.k.put(ddh.class, new arp(this));
        this.k.put(bgv.class, new abg(this));
        this.k.put(cce.class, new byy(this));
        this.k.put(azy.class, new agf(this));
        this.k.put(byl.class, new kg(this));
        this.k.put(abs.class, new gl(this));
        this.k.put(csq.class, new rv(this));
        this.k.put(oe.class, new axf(this));
        this.k.put(akr.class, new ard(this, new cie(16), 0.25f));
        this.k.put(clw.class, new ws(this));
        this.k.put(aah.class, new adi(this, new chh(), 0.5f, 6.0f));
        this.k.put(ha.class, new chd(this));
        this.k.put(aqc.class, new ahd(this, new bmo(), 0.7f));
        this.k.put(cwp.class, new cks(this));
        this.k.put(hx.class, new cbm(this));
        this.k.put(azc.class, new uu(this));
        this.k.put(bym.class, new dfu(this));
        this.k.put(aoa.class, new cmn(this, new io()));
        this.k.put(cmg.class, new bu(this, new nl(), 0.7f));
        this.k.put(brd.class, new sq(this));
        this.k.put(abi.class, new aes(this));
        this.k.put(dga.class, new aft(this));
        this.k.put(cpk.class, new dak(this));
        this.k.put(cbk.class, new cpj(this));
        this.k.put(cvr.class, new cdq(this, bth2));
        this.k.put(ahe.class, new cgm(this));
        this.k.put(bib.class, new ak(this));
        this.k.put(bno.class, new blj(this));
        this.k.put(bef.class, new adu(this, hp.aF, bth2));
        this.k.put(ddg.class, new adu(this, hp.bB, bth2));
        this.k.put(cnd.class, new adu(this, hp.bR, bth2));
        this.k.put(xe.class, new adu(this, hp.aW, bth2));
        this.k.put(tp.class, new adm(this, bth2));
        this.k.put(bgc.class, new adu(this, hp.bU, bth2));
        this.k.put(p.class, new adu(this, hp.cl, bth2));
        this.k.put(cyk.class, new cvd(this, 2.0f));
        this.k.put(bx.class, new cvd(this, 0.5f));
        this.k.put(ckd.class, new aiy(this));
        this.k.put(nm.class, new cmp(this));
        this.k.put(dcg.class, new ady(this));
        this.k.put(er.class, new cfa(this, bth2));
        this.k.put(cvs.class, new boa(this));
        this.k.put(cgg.class, new ek(this));
        this.k.put(azb.class, new rm(this));
        this.k.put(bdi.class, new cuq(this));
        this.k.put(ji.class, new fx(this));
        this.k.put(bnc.class, new amy(this));
        this.k.put(cef.class, new dfo(this));
        this.k.put(cor.class, new rr(this));
        this.k.put(cvo.class, new og(this));
        this.k.put(gw.class, new dp(this));
        this.k.put(it.class, new dgz(this, new boi(), 0.75f));
        this.k.put(tz.class, new aka(this));
        this.m = new kn(this);
        this.l.put("default", this.m);
        this.l.put("slim", new kn(this, true));
    }

    public void a(double d2, double d3, double d4) {
        this.o = d2;
        this.p = d3;
        this.q = d4;
    }

    public buc a(Class class_) {
        buc buc2 = (buc)this.k.get(class_);
        if (buc2 == null && class_ != cpk.class) {
            buc2 = this.a(class_.getSuperclass());
            this.k.put(class_, buc2);
        }
        return buc2;
    }

    public buc a(cpk cpk2) {
        if (cpk2 instanceof ciy) {
            String string = ((ciy)cpk2).bU();
            kn kn2 = (kn)this.l.get(string);
            if (kn2 != null) {
                return kn2;
            }
            return this.m;
        }
        return this.a(cpk2.getClass());
    }

    public void a(iu iu2, deb deb2, cpk cpk2, cpk cpk3, cmx cmx2, float f2) {
        this.b = iu2;
        this.g = cmx2;
        this.c = cpk2;
        this.d = cpk3;
        this.n = deb2;
        if (cpk2 instanceof bga && ((bga)cpk2).H_()) {
            dbk dbk2 = iu2.n(new cmz(cpk2));
            bfa bfa2 = dbk2.t();
            if (bfa2 == blg.C) {
                int n2 = ((bqk)((Object)dbk2.b(dx.j))).c();
                this.e = n2 * 90 + 180;
                this.f = 0.0f;
            }
        } else {
            this.e = cpk2.bc + (cpk2.ba - cpk2.bc) * f2;
            this.f = cpk2.bd + (cpk2.bb - cpk2.bd) * f2;
        }
        if (cmx2.as == 2) {
            this.e += 180.0f;
        }
        this.h = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        this.i = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        this.j = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public boolean a() {
        return this.s;
    }

    public void a(boolean bl2) {
        this.s = bl2;
    }

    public void b(boolean bl2) {
        this.t = bl2;
    }

    public boolean b() {
        return this.t;
    }

    public boolean b(cpk cpk2) {
        return this.a(cpk2).r_();
    }

    public boolean a(cpk cpk2, cct cct2, double d2, double d3, double d4) {
        buc buc2 = this.a(cpk2);
        return buc2 != null && buc2.a(cpk2, cct2, d2, d3, d4);
    }

    public void a(cpk cpk2, float f2, boolean bl2) {
        if (cpk2.by == 0) {
            cpk2.br = cpk2.aU;
            cpk2.bs = cpk2.aV;
            cpk2.bt = cpk2.aW;
        }
        double d2 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        double d3 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        double d4 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        float f3 = cpk2.bc + (cpk2.ba - cpk2.bc) * f2;
        int n2 = cpk2.b(f2);
        if (cpk2.y_()) {
            n2 = 0xF000F0;
        }
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(cpk2, d2 - this.o, d3 - this.p, d4 - this.q, f3, f2, bl2);
    }

    public void a(cpk cpk2, double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        block9: {
            buc buc2 = null;
            try {
                buc2 = this.a(cpk2);
                if (buc2 == null || this.a == null) break block9;
                try {
                    buc2.a(this.r);
                    buc2.a(cpk2, d2, d3, d4, f2, f3);
                }
                catch (Throwable throwable) {
                    throw new oz(cet.a(throwable, "Rendering entity in world"));
                }
                try {
                    if (!this.r) {
                        buc2.c(cpk2, d2, d3, d4, f2, f3);
                    }
                }
                catch (Throwable throwable) {
                    throw new oz(cet.a(throwable, "Post-rendering entity in world"));
                }
                if (!this.t || cpk2.ct() || bl2 || bxy.B().am()) break block9;
                try {
                    this.a(cpk2, d2, d3, d4, f2, f3);
                }
                catch (Throwable throwable) {
                    throw new oz(cet.a(throwable, "Rendering entity hitbox in world"));
                }
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Rendering entity in world");
                sx sx2 = cet2.a("Entity being rendered");
                cpk2.a(sx2);
                sx sx3 = cet2.a("Renderer details");
                sx3.a("Assigned renderer", buc2);
                sx3.a("Location", sx.a(d2, d3, d4));
                sx3.a("Rotation", Float.valueOf(f2));
                sx3.a("Delta", Float.valueOf(f3));
                throw new oz(cet2);
            }
        }
    }

    public void a(cpk cpk2, float f2) {
        if (cpk2.by == 0) {
            cpk2.br = cpk2.aU;
            cpk2.bs = cpk2.aV;
            cpk2.bt = cpk2.aW;
        }
        double d2 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        double d3 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        double d4 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        float f3 = cpk2.bc + (cpk2.ba - cpk2.bc) * f2;
        int n2 = cpk2.b(f2);
        if (cpk2.y_()) {
            n2 = 0xF000F0;
        }
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        cjg.a(cjg.r, n3, (float)n4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        buc buc2 = this.a(cpk2);
        if (buc2 != null && this.a != null) {
            buc2.b(cpk2, d2 - this.o, d3 - this.p, d4 - this.q, f3, f2);
        }
    }

    private void a(cpk cpk2, double d2, double d3, double d4, float f2, float f3) {
        cja.a(false);
        cja.w();
        cja.f();
        cja.q();
        cja.k();
        float f4 = cpk2.bl / 2.0f;
        cxt cxt2 = cpk2.cD();
        fr.a(cxt2.a - cpk2.aU + d2, cxt2.b - cpk2.aV + d3, cxt2.c - cpk2.aW + d4, cxt2.d - cpk2.aU + d2, cxt2.e - cpk2.aV + d3, cxt2.f - cpk2.aW + d4, 1.0f, 1.0f, 1.0f, 1.0f);
        if (cpk2 instanceof bga) {
            float f5 = 0.01f;
            fr.a(d2 - (double)f4, d3 + (double)cpk2.A() - (double)0.01f, d4 - (double)f4, d2 + (double)f4, d3 + (double)cpk2.A() + (double)0.01f, d4 + (double)f4, 1.0f, 0.0f, 0.0f, 1.0f);
        }
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        amj amj2 = cpk2.l(f3);
        bix2.a(3, bxb.f);
        bix2.b(d2, d3 + (double)cpk2.A(), d4).b(0, 0, 255, 255).d();
        bix2.b(d2 + amj2.b * 2.0, d3 + (double)cpk2.A() + amj2.c * 2.0, d4 + amj2.d * 2.0).b(0, 0, 255, 255).d();
        bha2.b();
        cja.v();
        cja.e();
        cja.p();
        cja.k();
        cja.a(true);
    }

    public void a(iu iu2) {
        this.b = iu2;
        if (iu2 == null) {
            this.c = null;
        }
    }

    public double b(double d2, double d3, double d4) {
        double d5 = d2 - this.h;
        double d6 = d3 - this.i;
        double d7 = d4 - this.j;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public deb c() {
        return this.n;
    }

    public void c(boolean bl2) {
        this.r = bl2;
    }
}

