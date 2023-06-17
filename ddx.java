/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;

public class ddx {
    private static final bpx a = new bpx("textures/map/map_background.png");
    private static final bpx b = new bpx("textures/misc/underwater.png");
    private final bxy c;
    private bhl d;
    private bhl e;
    private float f;
    private float g;
    private float h;
    private float i;
    private final bid j;
    private final bth k;

    public ddx(bxy bxy2) {
        this.c = bxy2;
        this.j = bxy2.ad();
        this.k = bxy2.ae();
    }

    public void a(bga bga2, bhl bhl2, cua cua2) {
        this.a(bga2, bhl2, cua2, false);
    }

    public void a(bga bga2, bhl bhl2, cua cua2, boolean bl2) {
        boolean bl3;
        if (bhl2 == null) {
            return;
        }
        azg azg2 = bhl2.a();
        bfa bfa2 = bfa.a(azg2);
        cja.D();
        boolean bl4 = bl3 = this.k.a(bhl2) && this.a(bfa2);
        if (bl3) {
            cja.a(false);
        }
        this.k.a(bhl2, bga2, cua2, bl2);
        if (bl3) {
            cja.a(true);
        }
        cja.E();
    }

    private boolean a(bfa bfa2) {
        return bfa2 != null && bfa2.b() == kj.d;
    }

    private void a(float f2, float f3) {
        cja.D();
        cja.b(f2, 1.0f, 0.0f, 0.0f);
        cja.b(f3, 0.0f, 1.0f, 0.0f);
        bjr.b();
        cja.E();
    }

    private void b() {
        ob ob2 = this.c.h;
        int n2 = this.c.f.b(new cmz(ob2.aU, ob2.aV + (double)ob2.A(), ob2.aW), 0);
        float f2 = n2 & 0xFFFF;
        float f3 = n2 >> 16;
        cjg.a(cjg.r, f2, f3);
    }

    private void c(float f2) {
        ob ob2 = this.c.h;
        float f3 = ob2.i + (ob2.g - ob2.i) * f2;
        float f4 = ob2.h + (ob2.f - ob2.h) * f2;
        cja.b((ob2.bb - f3) * 0.1f, 1.0f, 0.0f, 0.0f);
        cja.b((ob2.ba - f4) * 0.1f, 0.0f, 1.0f, 0.0f);
    }

    private float d(float f2) {
        float f3 = 1.0f - f2 / 45.0f + 0.1f;
        f3 = cmk.a(f3, 0.0f, 1.0f);
        f3 = -cmk.b(f3 * (float)Math.PI) * 0.5f + 0.5f;
        return f3;
    }

    private void c() {
        if (this.c.h.ct()) {
            return;
        }
        cja.q();
        cja.D();
        cja.b(90.0f, 0.0f, 1.0f, 0.0f);
        this.a(s.b);
        this.a(s.a);
        cja.E();
        cja.p();
    }

    private void a(s s2) {
        this.c.P().a(this.c.h.bQ());
        buc buc2 = this.j.a(this.c.h);
        kn kn2 = (kn)buc2;
        cja.D();
        float f2 = s2 == s.b ? 1.0f : -1.0f;
        cja.b(92.0f, 0.0f, 1.0f, 0.0f);
        cja.b(45.0f, 1.0f, 0.0f, 0.0f);
        cja.b(f2 * -41.0f, 0.0f, 0.0f, 1.0f);
        cja.c(f2 * 0.3f, -1.1f, 0.45f);
        if (s2 == s.b) {
            kn2.b(this.c.h);
        } else {
            kn2.c(this.c.h);
        }
        cja.E();
    }

    private void a(float f2, s s2, float f3, bhl bhl2) {
        float f4 = s2 == s.b ? 1.0f : -1.0f;
        cja.c(f4 * 0.125f, -0.125f, 0.0f);
        if (!this.c.h.ct()) {
            cja.D();
            cja.b(f4 * 10.0f, 0.0f, 0.0f, 1.0f);
            this.a(f2, f3, s2);
            cja.E();
        }
        cja.D();
        cja.c(f4 * 0.51f, -0.08f + f2 * -1.2f, -0.75f);
        float f5 = cmk.c(f3);
        float f6 = cmk.a(f5 * (float)Math.PI);
        float f7 = -0.5f * f6;
        float f8 = 0.4f * cmk.a(f5 * ((float)Math.PI * 2));
        float f9 = -0.3f * cmk.a(f3 * (float)Math.PI);
        cja.c(f4 * f7, f8 - 0.3f * f6, f9);
        cja.b(f6 * -45.0f, 1.0f, 0.0f, 0.0f);
        cja.b(f4 * f6 * -30.0f, 0.0f, 1.0f, 0.0f);
        this.a(bhl2);
        cja.E();
    }

    private void a(float f2, float f3, float f4) {
        float f5 = cmk.c(f4);
        float f6 = -0.2f * cmk.a(f4 * (float)Math.PI);
        float f7 = -0.4f * cmk.a(f5 * (float)Math.PI);
        cja.c(0.0f, -f6 / 2.0f, f7);
        float f8 = this.d(f2);
        cja.c(0.0f, 0.04f + f3 * -1.2f + f8 * -0.5f, -0.72f);
        cja.b(f8 * -85.0f, 1.0f, 0.0f, 0.0f);
        this.c();
        float f9 = cmk.a(f5 * (float)Math.PI);
        cja.b(f9 * 20.0f, 1.0f, 0.0f, 0.0f);
        cja.b(2.0f, 2.0f, 2.0f);
        this.a(this.d);
    }

    private void a(bhl bhl2) {
        cja.b(180.0f, 0.0f, 1.0f, 0.0f);
        cja.b(180.0f, 0.0f, 0.0f, 1.0f);
        cja.b(0.38f, 0.38f, 0.38f);
        cja.f();
        this.c.P().a(a);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.c(-0.5f, -0.5f, 0.0f);
        cja.b(0.0078125f, 0.0078125f, 0.0078125f);
        bix2.a(7, bxb.g);
        bix2.b(-7.0, 135.0, 0.0).a(0.0, 1.0).d();
        bix2.b(135.0, 135.0, 0.0).a(1.0, 1.0).d();
        bix2.b(135.0, -7.0, 0.0).a(1.0, 0.0).d();
        bix2.b(-7.0, -7.0, 0.0).a(0.0, 0.0).d();
        bha2.b();
        aph aph2 = hp.bk.a(bhl2, this.c.f);
        if (aph2 != null) {
            this.c.o.i().a(aph2, false);
        }
        cja.e();
    }

    private void a(float f2, float f3, s s2) {
        boolean bl2 = s2 != s.a;
        float f4 = bl2 ? 1.0f : -1.0f;
        float f5 = cmk.c(f3);
        float f6 = -0.3f * cmk.a(f5 * (float)Math.PI);
        float f7 = 0.4f * cmk.a(f5 * ((float)Math.PI * 2));
        float f8 = -0.4f * cmk.a(f3 * (float)Math.PI);
        cja.c(f4 * (f6 + 0.64000005f), f7 + -0.6f + f2 * -0.6f, f8 + -0.71999997f);
        cja.b(f4 * 45.0f, 0.0f, 1.0f, 0.0f);
        float f9 = cmk.a(f3 * f3 * (float)Math.PI);
        float f10 = cmk.a(f5 * (float)Math.PI);
        cja.b(f4 * f10 * 70.0f, 0.0f, 1.0f, 0.0f);
        cja.b(f4 * f9 * -20.0f, 0.0f, 0.0f, 1.0f);
        ob ob2 = this.c.h;
        this.c.P().a(ob2.bQ());
        cja.c(f4 * -1.0f, 3.6f, 3.5f);
        cja.b(f4 * 120.0f, 0.0f, 0.0f, 1.0f);
        cja.b(200.0f, 1.0f, 0.0f, 0.0f);
        cja.b(f4 * -135.0f, 0.0f, 1.0f, 0.0f);
        cja.c(f4 * 5.6f, 0.0f, 0.0f);
        kn kn2 = (kn)this.j.a(ob2);
        cja.q();
        if (bl2) {
            kn2.b(ob2);
        } else {
            kn2.c(ob2);
        }
        cja.p();
    }

    private void a(float f2, s s2, bhl bhl2) {
        float f3;
        float f4 = (float)this.c.h.bH() - f2 + 1.0f;
        float f5 = f4 / (float)bhl2.l();
        if (f5 < 0.8f) {
            f3 = cmk.e(cmk.b(f4 / 4.0f * (float)Math.PI) * 0.1f);
            cja.c(0.0f, f3, 0.0f);
        }
        f3 = 1.0f - (float)Math.pow(f5, 27.0);
        int n2 = s2 == s.b ? 1 : -1;
        cja.c(f3 * 0.6f * (float)n2, f3 * -0.5f, f3 * 0.0f);
        cja.b((float)n2 * f3 * 90.0f, 0.0f, 1.0f, 0.0f);
        cja.b(f3 * 10.0f, 1.0f, 0.0f, 0.0f);
        cja.b((float)n2 * f3 * 30.0f, 0.0f, 0.0f, 1.0f);
    }

    private void a(s s2, float f2) {
        int n2 = s2 == s.b ? 1 : -1;
        float f3 = cmk.a(f2 * f2 * (float)Math.PI);
        cja.b((float)n2 * (45.0f + f3 * -20.0f), 0.0f, 1.0f, 0.0f);
        float f4 = cmk.a(cmk.c(f2) * (float)Math.PI);
        cja.b((float)n2 * f4 * -20.0f, 0.0f, 0.0f, 1.0f);
        cja.b(f4 * -80.0f, 1.0f, 0.0f, 0.0f);
        cja.b((float)n2 * -45.0f, 0.0f, 1.0f, 0.0f);
    }

    private void b(s s2, float f2) {
        int n2 = s2 == s.b ? 1 : -1;
        cja.c((float)n2 * 0.56f, -0.52f + f2 * -0.6f, -0.72f);
    }

    public void a(float f2) {
        bhl bhl2;
        ob ob2 = this.c.h;
        float f3 = ob2.m(f2);
        bqp bqp2 = (bqp)((Object)cc.b((Object)ob2.P, (Object)bqp.a));
        float f4 = ob2.bd + (ob2.bb - ob2.bd) * f2;
        float f5 = ob2.bc + (ob2.ba - ob2.bc) * f2;
        boolean bl2 = true;
        boolean bl3 = true;
        if (((bga)ob2).ag_() && (bhl2 = ob2.bG()).a() == hp.f) {
            bqp bqp3 = ((bga)ob2).ah_();
            bl2 = bqp3 == bqp.a;
            bl3 = !bl2;
        }
        this.a(f4, f5);
        this.b();
        this.c(f2);
        cja.A();
        if (bl2) {
            float f6 = bqp2 == bqp.a ? f3 : 0.0f;
            float f7 = 1.0f - (this.g + (this.f - this.g) * f2);
            this.a(ob2, f2, f4, bqp.a, f6, this.d, f7);
        }
        if (bl3) {
            float f8 = bqp2 == bqp.b ? f3 : 0.0f;
            float f9 = 1.0f - (this.i + (this.h - this.i) * f2);
            this.a(ob2, f2, f4, bqp.b, f8, this.e, f9);
        }
        cja.B();
        bjr.a();
    }

    public void a(ciy ciy2, float f2, float f3, bqp bqp2, float f4, bhl bhl2, float f5) {
        boolean bl2 = bqp2 == bqp.a;
        s s2 = bl2 ? ciy2.aK() : ciy2.aK().a();
        cja.D();
        if (bhl2 == null) {
            if (bl2 && !ciy2.ct()) {
                this.a(f5, f4, s2);
            }
        } else if (bhl2.a() == hp.bk) {
            if (bl2 && this.e == null) {
                this.a(f3, f5, f4);
            } else {
                this.a(f5, s2, f4, bhl2);
            }
        } else {
            boolean bl3;
            boolean bl4 = bl3 = s2 == s.b;
            if (ciy2.ag_() && ciy2.bH() > 0 && ciy2.ah_() == bqp2) {
                int n2 = bl3 ? 1 : -1;
                switch (bhl2.m()) {
                    case a: {
                        this.b(s2, f5);
                        break;
                    }
                    case b: 
                    case c: {
                        this.a(f2, s2, bhl2);
                        this.b(s2, f5);
                        break;
                    }
                    case d: {
                        this.b(s2, f5);
                        break;
                    }
                    case e: {
                        this.b(s2, f5);
                        cja.c((float)n2 * -0.2785682f, 0.18344387f, 0.15731531f);
                        cja.b(-13.935f, 1.0f, 0.0f, 0.0f);
                        cja.b((float)n2 * 35.3f, 0.0f, 1.0f, 0.0f);
                        cja.b((float)n2 * -9.785f, 0.0f, 0.0f, 1.0f);
                        float f6 = (float)bhl2.l() - ((float)this.c.h.bH() - f2 + 1.0f);
                        float f7 = f6 / 20.0f;
                        f7 = (f7 * f7 + f7 * 2.0f) / 3.0f;
                        if (f7 > 1.0f) {
                            f7 = 1.0f;
                        }
                        if (f7 > 0.1f) {
                            float f8 = cmk.a((f6 - 0.1f) * 1.3f);
                            float f9 = f7 - 0.1f;
                            float f10 = f8 * f9;
                            cja.c(f10 * 0.0f, f10 * 0.004f, f10 * 0.0f);
                        }
                        cja.c(f7 * 0.0f, f7 * 0.0f, f7 * 0.04f);
                        cja.b(1.0f, 1.0f, 1.0f + f7 * 0.2f);
                        cja.b((float)n2 * 45.0f, 0.0f, -1.0f, 0.0f);
                    }
                }
            } else {
                float f11 = -0.4f * cmk.a(cmk.c(f4) * (float)Math.PI);
                float f12 = 0.2f * cmk.a(cmk.c(f4) * ((float)Math.PI * 2));
                float f13 = -0.2f * cmk.a(f4 * (float)Math.PI);
                int n3 = bl3 ? 1 : -1;
                cja.c((float)n3 * f11, f12, f13);
                this.b(s2, f5);
                this.a(s2, f4);
            }
            this.a(ciy2, bhl2, bl3 ? cua.e : cua.d, !bl3);
        }
        cja.E();
    }

    public void b(float f2) {
        cja.c();
        if (this.c.h.K_()) {
            dbk dbk2 = this.c.f.n(new cmz(this.c.h));
            ob ob2 = this.c.h;
            for (int i2 = 0; i2 < 8; ++i2) {
                double d2 = ob2.aU + (double)(((float)((i2 >> 0) % 2) - 0.5f) * ob2.bl * 0.8f);
                double d3 = ob2.aV + (double)(((float)((i2 >> 1) % 2) - 0.5f) * 0.1f);
                double d4 = ob2.aW + (double)(((float)((i2 >> 2) % 2) - 0.5f) * ob2.bl * 0.8f);
                cmz cmz2 = new cmz(d2, d3 + (double)ob2.A(), d4);
                dbk dbk3 = this.c.f.n(cmz2);
                if (!dbk3.t().ay_()) continue;
                dbk2 = dbk3;
            }
            if (dbk2.i() != cpb.a) {
                this.a(f2, this.c.ac().a().a(dbk2));
            }
        }
        if (!this.c.h.aL()) {
            if (this.c.h.a(ahk.h)) {
                this.e(f2);
            }
            if (this.c.h.y_()) {
                this.f(f2);
            }
        }
        cja.d();
    }

    private void a(float f2, ars ars2) {
        this.c.P().a(dam.g);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f3 = 0.1f;
        cja.c(0.1f, 0.1f, 0.1f, 0.5f);
        cja.D();
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -1.0f;
        float f7 = 1.0f;
        float f8 = -0.5f;
        float f9 = ars2.e();
        float f10 = ars2.f();
        float f11 = ars2.g();
        float f12 = ars2.h();
        bix2.a(7, bxb.g);
        bix2.b(-1.0, -1.0, -0.5).a(f10, f12).d();
        bix2.b(1.0, -1.0, -0.5).a(f9, f12).d();
        bix2.b(1.0, 1.0, -0.5).a(f9, f11).d();
        bix2.b(-1.0, 1.0, -0.5).a(f10, f11).d();
        bha2.b();
        cja.E();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void e(float f2) {
        this.c.P().a(b);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        float f3 = this.c.h.a(f2);
        cja.c(f3, f3, f3, 0.5f);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.D();
        float f4 = 4.0f;
        float f5 = -1.0f;
        float f6 = 1.0f;
        float f7 = -1.0f;
        float f8 = 1.0f;
        float f9 = -0.5f;
        float f10 = -this.c.h.ba / 64.0f;
        float f11 = this.c.h.bb / 64.0f;
        bix2.a(7, bxb.g);
        bix2.b(-1.0, -1.0, -0.5).a(4.0f + f10, 4.0f + f11).d();
        bix2.b(1.0, -1.0, -0.5).a(0.0f + f10, 4.0f + f11).d();
        bix2.b(1.0, 1.0, -0.5).a(0.0f + f10, 0.0f + f11).d();
        bix2.b(-1.0, 1.0, -0.5).a(4.0f + f10, 0.0f + f11).d();
        bha2.b();
        cja.E();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
    }

    private void f(float f2) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.c(1.0f, 1.0f, 1.0f, 0.9f);
        cja.c(519);
        cja.a(false);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        float f3 = 1.0f;
        for (int i2 = 0; i2 < 2; ++i2) {
            cja.D();
            ars ars2 = this.c.T().a("minecraft:blocks/fire_layer_1");
            this.c.P().a(dam.g);
            float f4 = ars2.e();
            float f5 = ars2.f();
            float f6 = ars2.g();
            float f7 = ars2.h();
            float f8 = -0.5f;
            float f9 = 0.5f;
            float f10 = -0.5f;
            float f11 = 0.5f;
            float f12 = -0.5f;
            cja.c((float)(-(i2 * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            cja.b((float)(i2 * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            bix2.a(7, bxb.g);
            bix2.b(-0.5, -0.5, -0.5).a(f5, f7).d();
            bix2.b(0.5, -0.5, -0.5).a(f4, f7).d();
            bix2.b(0.5, 0.5, -0.5).a(f4, f6).d();
            bix2.b(-0.5, 0.5, -0.5).a(f5, f6).d();
            bha2.b();
            cja.E();
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.k();
        cja.a(true);
        cja.c(515);
    }

    public void a() {
        this.g = this.f;
        this.i = this.h;
        ob ob2 = this.c.h;
        bhl bhl2 = ob2.bt();
        bhl bhl3 = ob2.bu();
        if (ob2.S()) {
            this.f = cmk.a(this.f - 0.4f, 0.0f, 1.0f);
            this.h = cmk.a(this.h - 0.4f, 0.0f, 1.0f);
        } else {
            float f2 = ob2.j(1.0f);
            this.f += cmk.a((cc.a((Object)this.d, (Object)bhl2) ? f2 * f2 * f2 : 0.0f) - this.f, -0.4f, 0.4f);
            this.h += cmk.a((float)(cc.a((Object)this.e, (Object)bhl3) ? 1 : 0) - this.h, -0.4f, 0.4f);
        }
        if (this.f < 0.1f) {
            this.d = bhl2;
        }
        if (this.h < 0.1f) {
            this.e = bhl3;
        }
    }

    public void a(bqp bqp2) {
        if (bqp2 == bqp.a) {
            this.f = 0.0f;
        } else {
            this.h = 0.0f;
        }
    }
}

