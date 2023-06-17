/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.nio.FloatBuffer;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class wq
extends buc {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final cze b = new cze(16, 16);
    protected axg c;
    protected FloatBuffer d = avj.e(4);
    protected List e = ov.a();
    protected boolean f;

    public wq(bid bid2, axg axg2, float f2) {
        super(bid2);
        this.c = axg2;
        this.h = f2;
    }

    protected boolean a(czo czo2) {
        return this.e.add(czo2);
    }

    protected boolean b(czo czo2) {
        return this.e.remove(czo2);
    }

    public axg c() {
        return this.c;
    }

    protected float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void a() {
    }

    public void a(bga bga2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cja.q();
        this.c.l = this.d(bga2, f3);
        this.c.m = bga2.cp();
        this.c.n = bga2.R_();
        try {
            float f4;
            float f5 = this.a(bga2.ai, bga2.ah, f3);
            float f6 = this.a(bga2.ak, bga2.aj, f3);
            float f7 = f6 - f5;
            if (bga2.cp() && bga2.cL() instanceof bga) {
                bga bga3 = (bga)bga2.cL();
                f5 = this.a(bga3.ai, bga3.ah, f3);
                f7 = f6 - f5;
                f4 = cmk.g(f7);
                if (f4 < -85.0f) {
                    f4 = -85.0f;
                }
                if (f4 >= 85.0f) {
                    f4 = 85.0f;
                }
                f5 = f6 - f4;
                if (f4 * f4 > 2500.0f) {
                    f5 += f4 * 0.2f;
                }
            }
            float f8 = bga2.bd + (bga2.bb - bga2.bd) * f3;
            this.a(bga2, d2, d3, d4);
            f4 = this.e(bga2, f3);
            this.a(bga2, f4, f5, f3);
            float f9 = this.b(bga2, f3);
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (!bga2.cp()) {
                f10 = bga2.Z + (bga2.aa - bga2.Z) * f3;
                f11 = bga2.ab - bga2.aa * (1.0f - f3);
                if (bga2.R_()) {
                    f11 *= 3.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
            }
            cja.d();
            this.c.a(bga2, f11, f10, f3);
            this.c.a(f11, f10, f4, f7, f8, f9, bga2);
            if (this.j) {
                boolean bl2 = this.b(bga2);
                cja.g();
                cja.e(this.d(bga2));
                if (!this.f) {
                    this.a(bga2, f11, f10, f4, f7, f8, f9);
                }
                if (!(bga2 instanceof bdl) || !((bdl)bga2).aL()) {
                    this.a(bga2, f11, f10, f3, f4, f7, f8, f9);
                }
                cja.m();
                cja.h();
                if (bl2) {
                    this.d();
                }
            } else {
                boolean bl3 = this.c(bga2, f3);
                this.a(bga2, f11, f10, f4, f7, f8, f9);
                if (bl3) {
                    this.e();
                }
                cja.a(true);
                if (!(bga2 instanceof bdl) || !((bdl)bga2).aL()) {
                    this.a(bga2, f11, f10, f3, f4, f7, f8, f9);
                }
            }
            cja.B();
        }
        catch (Exception exception) {
            a.b("Couldn't render entity", (Throwable)exception);
        }
        cja.g(cjg.r);
        cja.v();
        cja.g(cjg.q);
        cja.p();
        cja.E();
        super.a((cpk)bga2, d2, d3, d4, f2, f3);
    }

    public float b(bga bga2, float f2) {
        cja.A();
        cja.b(-1.0f, -1.0f, 1.0f);
        this.a(bga2, f2);
        float f3 = 0.0625f;
        cja.c(0.0f, -1.501f, 0.0f);
        return 0.0625f;
    }

    protected boolean b(bga bga2) {
        cja.f();
        cja.g(cjg.r);
        cja.w();
        cja.g(cjg.q);
        return true;
    }

    protected void d() {
        cja.e();
        cja.g(cjg.r);
        cja.v();
        cja.g(cjg.q);
    }

    protected void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean bl2;
        boolean bl3 = !bga2.ct() || this.j;
        boolean bl4 = bl2 = !bl3 && !bga2.a_(bxy.B().h);
        if (bl3 || bl2) {
            if (!this.e(bga2)) {
                return;
            }
            if (bl2) {
                cja.a(asc.c);
            }
            this.c.a(bga2, f2, f3, f4, f5, f6, f7);
            if (bl2) {
                cja.b(asc.c);
            }
        }
    }

    protected boolean c(bga bga2, float f2) {
        return this.a(bga2, f2, true);
    }

    protected boolean a(bga bga2, float f2, boolean bl2) {
        boolean bl3;
        float f3 = bga2.a(f2);
        int n2 = this.a(bga2, f3, f2);
        boolean bl4 = (n2 >> 24 & 0xFF) > 0;
        boolean bl5 = bl3 = bga2.S > 0 || bga2.V > 0;
        if (bl4 || bl3) {
            if (!bl4 && !bl2) {
                return false;
            }
            cja.g(cjg.q);
            cja.v();
            cja.a(8960, 8704, cjg.t);
            cja.a(8960, cjg.y, 8448);
            cja.a(8960, cjg.z, cjg.q);
            cja.a(8960, cjg.A, cjg.v);
            cja.a(8960, cjg.C, 768);
            cja.a(8960, cjg.D, 768);
            cja.a(8960, cjg.F, 7681);
            cja.a(8960, cjg.G, cjg.q);
            cja.a(8960, cjg.J, 770);
            cja.g(cjg.r);
            cja.v();
            cja.a(8960, 8704, cjg.t);
            cja.a(8960, cjg.y, cjg.u);
            cja.a(8960, cjg.z, cjg.w);
            cja.a(8960, cjg.A, cjg.x);
            cja.a(8960, cjg.B, cjg.w);
            cja.a(8960, cjg.C, 768);
            cja.a(8960, cjg.D, 768);
            cja.a(8960, cjg.E, 770);
            cja.a(8960, cjg.F, 7681);
            cja.a(8960, cjg.G, cjg.x);
            cja.a(8960, cjg.J, 770);
            this.d.position(0);
            if (bl3) {
                this.d.put(1.0f);
                this.d.put(0.0f);
                this.d.put(0.0f);
                this.d.put(0.3f);
            } else {
                float f4 = (float)(n2 >> 24 & 0xFF) / 255.0f;
                float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f7 = (float)(n2 & 0xFF) / 255.0f;
                this.d.put(f5);
                this.d.put(f6);
                this.d.put(f7);
                this.d.put(1.0f - f4);
            }
            this.d.flip();
            cja.b(8960, 8705, this.d);
            cja.g(cjg.s);
            cja.v();
            cja.i(b.aF_());
            cja.a(8960, 8704, cjg.t);
            cja.a(8960, cjg.y, 8448);
            cja.a(8960, cjg.z, cjg.x);
            cja.a(8960, cjg.A, cjg.r);
            cja.a(8960, cjg.C, 768);
            cja.a(8960, cjg.D, 768);
            cja.a(8960, cjg.F, 7681);
            cja.a(8960, cjg.G, cjg.x);
            cja.a(8960, cjg.J, 770);
            cja.g(cjg.q);
            return true;
        }
        return false;
    }

    protected void e() {
        cja.g(cjg.q);
        cja.v();
        cja.a(8960, 8704, cjg.t);
        cja.a(8960, cjg.y, 8448);
        cja.a(8960, cjg.z, cjg.q);
        cja.a(8960, cjg.A, cjg.v);
        cja.a(8960, cjg.C, 768);
        cja.a(8960, cjg.D, 768);
        cja.a(8960, cjg.F, 8448);
        cja.a(8960, cjg.G, cjg.q);
        cja.a(8960, cjg.H, cjg.v);
        cja.a(8960, cjg.J, 770);
        cja.a(8960, cjg.K, 770);
        cja.g(cjg.r);
        cja.a(8960, 8704, cjg.t);
        cja.a(8960, cjg.y, 8448);
        cja.a(8960, cjg.C, 768);
        cja.a(8960, cjg.D, 768);
        cja.a(8960, cjg.z, 5890);
        cja.a(8960, cjg.A, cjg.x);
        cja.a(8960, cjg.F, 8448);
        cja.a(8960, cjg.J, 770);
        cja.a(8960, cjg.G, 5890);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.g(cjg.s);
        cja.w();
        cja.i(0);
        cja.a(8960, 8704, cjg.t);
        cja.a(8960, cjg.y, 8448);
        cja.a(8960, cjg.C, 768);
        cja.a(8960, cjg.D, 768);
        cja.a(8960, cjg.z, 5890);
        cja.a(8960, cjg.A, cjg.x);
        cja.a(8960, cjg.F, 8448);
        cja.a(8960, cjg.J, 770);
        cja.a(8960, cjg.G, 5890);
        cja.g(cjg.q);
    }

    protected void a(bga bga2, double d2, double d3, double d4) {
        cja.c((float)d2, (float)d3, (float)d4);
    }

    protected void a(bga bga2, float f2, float f3, float f4) {
        cja.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        if (bga2.V > 0) {
            float f5 = ((float)bga2.V + f4 - 1.0f) / 20.0f * 1.6f;
            if ((f5 = cmk.c(f5)) > 1.0f) {
                f5 = 1.0f;
            }
            cja.b(f5 * this.a(bga2), 0.0f, 0.0f, 1.0f);
        } else {
            String string = aug.a(bga2.i_());
            if (string != null && ("Dinnerbone".equals(string) || "Grumm".equals(string)) && (!(bga2 instanceof bdl) || ((bdl)bga2).a(bzk.a))) {
                cja.c(0.0f, bga2.bm + 0.1f, 0.0f);
                cja.b(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }

    protected float d(bga bga2, float f2) {
        return bga2.m(f2);
    }

    protected float e(bga bga2, float f2) {
        return (float)bga2.by + f2;
    }

    protected void a(bga bga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        for (czo czo2 : this.e) {
            boolean bl2 = this.a(bga2, f4, czo2.a());
            czo2.a(bga2, f2, f3, f4, f5, f6, f7, f8);
            if (!bl2) continue;
            this.e();
        }
    }

    protected float a(bga bga2) {
        return 90.0f;
    }

    protected int a(bga bga2, float f2, float f3) {
        return 0;
    }

    protected void a(bga bga2, float f2) {
    }

    public void b(bga bga2, double d2, double d3, double d4) {
        float f2;
        if (!this.c(bga2)) {
            return;
        }
        double d5 = bga2.l(this.g.c);
        float f3 = f2 = bga2.ar_() ? 32.0f : 64.0f;
        if (d5 >= (double)(f2 * f2)) {
            return;
        }
        String string = bga2.v().j();
        cja.a(516, 0.1f);
        this.a((cpk)bga2, d2, d3, d4, string, d5);
    }

    protected boolean c(bga bga2) {
        boolean bl2;
        ob ob2 = bxy.B().h;
        boolean bl3 = bl2 = !bga2.a_(ob2);
        if (bga2 != ob2) {
            ccw ccw2 = bga2.as_();
            ccw ccw3 = ob2.as_();
            if (ccw2 != null) {
                afb afb2 = ccw2.h();
                switch (afb2) {
                    case a: {
                        return bl2;
                    }
                    case b: {
                        return false;
                    }
                    case c: {
                        return ccw3 == null ? bl2 : ccw2.a(ccw3) && (ccw2.g() || bl2);
                    }
                    case d: {
                        return ccw3 == null ? bl2 : !ccw2.a(ccw3) && bl2;
                    }
                }
                return true;
            }
        }
        return bxy.y() && bga2 != this.g.c && bl2 && !bga2.cq();
    }

    @Override
    protected /* synthetic */ boolean b(cpk cpk2) {
        return this.c((bga)cpk2);
    }

    @Override
    public /* synthetic */ void a(cpk cpk2, double d2, double d3, double d4) {
        this.b((bga)cpk2, d2, d3, d4);
    }

    static {
        int[] arrn = b.c();
        for (int i2 = 0; i2 < 256; ++i2) {
            arrn[i2] = -1;
        }
        b.b();
    }
}

