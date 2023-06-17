/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class qa {
    private static final cxt a = new cxt(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    protected iu b;
    protected double c;
    protected double d;
    protected double e;
    protected double f;
    protected double g;
    protected double h;
    protected double i;
    protected double j;
    protected double k;
    private cxt K = a;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected float o = 0.6f;
    protected float p = 1.8f;
    protected Random q = new Random();
    protected int r;
    protected int s;
    protected float t;
    protected float u;
    protected int v;
    protected int w;
    protected float x;
    protected float y;
    protected float z;
    protected float A;
    protected float B;
    protected float C = 1.0f;
    protected ars D;
    protected float E;
    protected float F;
    public static double G;
    public static double H;
    public static double I;
    public static amj J;

    protected qa(iu iu2, double d2, double d3, double d4) {
        this.b = iu2;
        this.a(0.2f, 0.2f);
        this.b(d2, d3, d4);
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.t = this.q.nextFloat() * 3.0f;
        this.u = this.q.nextFloat() * 3.0f;
        this.x = (this.q.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.w = (int)(4.0f / (this.q.nextFloat() * 0.9f + 0.1f));
        this.v = 0;
        this.m = true;
    }

    public qa(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(iu2, d2, d3, d4);
        this.i = d5 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.j = d6 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.k = d7 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        float f2 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f3 = cmk.a(this.i * this.i + this.j * this.j + this.k * this.k);
        this.i = this.i / (double)f3 * (double)f2 * (double)0.4f;
        this.j = this.j / (double)f3 * (double)f2 * (double)0.4f + (double)0.1f;
        this.k = this.k / (double)f3 * (double)f2 * (double)0.4f;
    }

    public qa b(float f2) {
        this.i *= (double)f2;
        this.j = (this.j - (double)0.1f) * (double)f2 + (double)0.1f;
        this.k *= (double)f2;
        return this;
    }

    public qa c(float f2) {
        this.a(0.2f * f2, 0.2f * f2);
        this.x *= f2;
        return this;
    }

    public void a(float f2, float f3, float f4) {
        this.z = f2;
        this.A = f3;
        this.B = f4;
    }

    public void d(float f2) {
        this.C = f2;
    }

    public boolean a() {
        return false;
    }

    public float c() {
        return this.z;
    }

    public float d() {
        return this.A;
    }

    public float e() {
        return this.B;
    }

    public void c(int n2) {
        this.w = n2;
    }

    public void b() {
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        if (this.v++ >= this.w) {
            this.h();
        }
        this.j -= 0.04 * (double)this.y;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.98f;
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        if (this.l) {
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
    }

    public void a(bix bix2, cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = (float)this.r / 16.0f;
        float f9 = f8 + 0.0624375f;
        float f10 = (float)this.s / 16.0f;
        float f11 = f10 + 0.0624375f;
        float f12 = 0.1f * this.x;
        if (this.D != null) {
            f8 = this.D.e();
            f9 = this.D.f();
            f10 = this.D.g();
            f11 = this.D.h();
        }
        float f13 = (float)(this.c + (this.f - this.c) * (double)f2 - G);
        float f14 = (float)(this.d + (this.g - this.d) * (double)f2 - H);
        float f15 = (float)(this.e + (this.h - this.e) * (double)f2 - I);
        int n2 = this.a(f2);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        amj[] arramj = new amj[]{new amj(-f3 * f12 - f6 * f12, -f4 * f12, -f5 * f12 - f7 * f12), new amj(-f3 * f12 + f6 * f12, f4 * f12, -f5 * f12 + f7 * f12), new amj(f3 * f12 + f6 * f12, f4 * f12, f5 * f12 + f7 * f12), new amj(f3 * f12 - f6 * f12, -f4 * f12, f5 * f12 - f7 * f12)};
        if (this.E != 0.0f) {
            float f16 = this.E + (this.E - this.F) * f2;
            float f17 = cmk.b(f16 * 0.5f);
            float f18 = cmk.a(f16 * 0.5f) * (float)qa.J.b;
            float f19 = cmk.a(f16 * 0.5f) * (float)qa.J.c;
            float f20 = cmk.a(f16 * 0.5f) * (float)qa.J.d;
            amj amj2 = new amj(f18, f19, f20);
            for (int i2 = 0; i2 < 4; ++i2) {
                arramj[i2] = amj2.a(2.0 * arramj[i2].b(amj2)).e(arramj[i2].a((double)(f17 * f17) - amj2.b(amj2))).e(amj2.c(arramj[i2]).a((double)(2.0f * f17)));
            }
        }
        bix2.b((double)f13 + arramj[0].b, (double)f14 + arramj[0].c, (double)f15 + arramj[0].d).a(f9, f11).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
        bix2.b((double)f13 + arramj[1].b, (double)f14 + arramj[1].c, (double)f15 + arramj[1].d).a(f9, f10).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
        bix2.b((double)f13 + arramj[2].b, (double)f14 + arramj[2].c, (double)f15 + arramj[2].d).a(f8, f10).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
        bix2.b((double)f13 + arramj[3].b, (double)f14 + arramj[3].c, (double)f15 + arramj[3].d).a(f8, f11).a(this.z, this.A, this.B, this.C).a(n3, n4).d();
    }

    public int f() {
        return 0;
    }

    public void a(ars ars2) {
        int n2 = this.f();
        if (n2 != 1) {
            throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
        }
        this.D = ars2;
    }

    public void d(int n2) {
        if (this.f() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.r = n2 % 16;
        this.s = n2 / 16;
    }

    public void g() {
        ++this.r;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.f + "," + this.g + "," + this.h + "), RGBA (" + this.z + "," + this.A + "," + this.B + "," + this.C + "), Age " + this.v;
    }

    public void h() {
        this.n = true;
    }

    protected void a(float f2, float f3) {
        if (f2 != this.o || f3 != this.p) {
            this.o = f2;
            this.p = f3;
            cxt cxt2 = this.k();
            this.a(new cxt(cxt2.a, cxt2.b, cxt2.c, cxt2.a + (double)this.o, cxt2.b + (double)this.p, cxt2.c + (double)this.o));
        }
    }

    public void b(double d2, double d3, double d4) {
        this.f = d2;
        this.g = d3;
        this.h = d4;
        float f2 = this.o / 2.0f;
        float f3 = this.p;
        this.a(new cxt(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2));
    }

    public void a(double d2, double d3, double d4) {
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        if (this.m) {
            List list = this.b.a((cpk)null, this.k().a(d2, d3, d4));
            for (cxt cxt2 : list) {
                d3 = cxt2.b(this.k(), d3);
            }
            this.a(this.k().c(0.0, d3, 0.0));
            for (cxt cxt2 : list) {
                d2 = cxt2.a(this.k(), d2);
            }
            this.a(this.k().c(d2, 0.0, 0.0));
            for (cxt cxt2 : list) {
                d4 = cxt2.c(this.k(), d4);
            }
            this.a(this.k().c(0.0, 0.0, d4));
        } else {
            this.a(this.k().c(d2, d3, d4));
        }
        this.i();
        boolean bl2 = this.l = d6 != d3 && d6 < 0.0;
        if (d5 != d2) {
            this.i = 0.0;
        }
        if (d7 != d4) {
            this.k = 0.0;
        }
    }

    protected void i() {
        cxt cxt2 = this.k();
        this.f = (cxt2.a + cxt2.d) / 2.0;
        this.g = cxt2.b;
        this.h = (cxt2.c + cxt2.f) / 2.0;
    }

    public int a(float f2) {
        cmz cmz2 = new cmz(this.f, this.g, this.h);
        if (this.b.d(cmz2)) {
            return this.b.b(cmz2, 0);
        }
        return 0;
    }

    public boolean j() {
        return !this.n;
    }

    public cxt k() {
        return this.K;
    }

    public void a(cxt cxt2) {
        this.K = cxt2;
    }
}

