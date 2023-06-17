/*
 * Decompiled with CFR 0.150.
 */
public class cel {
    protected final xy a;
    protected double b;
    protected double c;
    protected double d;
    protected double e;
    protected float f;
    protected float g;
    protected azu h = azu.a;

    public cel(xy xy2) {
        this.a = xy2;
    }

    public boolean b() {
        return this.h == azu.b;
    }

    public double c() {
        return this.e;
    }

    public void a(double d2, double d3, double d4, double d5) {
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.h = azu.b;
    }

    public void a(float f2, float f3) {
        this.h = azu.c;
        this.f = f2;
        this.g = f3;
        this.e = 0.25;
    }

    public void a(cel cel2) {
        this.h = cel2.h;
        this.b = cel2.b;
        this.c = cel2.c;
        this.d = cel2.d;
        this.e = Math.max(cel2.e, 1.0);
        this.f = cel2.f;
        this.g = cel2.g;
    }

    public void a() {
        if (this.h == azu.c) {
            um um2;
            float f2 = (float)this.a.a(cgz.d).e();
            float f3 = (float)this.e * f2;
            float f4 = this.f;
            float f5 = this.g;
            float f6 = cmk.c(f4 * f4 + f5 * f5);
            if (f6 < 1.0f) {
                f6 = 1.0f;
            }
            f6 = f3 / f6;
            float f7 = cmk.a(this.a.ba * ((float)Math.PI / 180));
            float f8 = cmk.b(this.a.ba * ((float)Math.PI / 180));
            float f9 = (f4 *= f6) * f8 - (f5 *= f6) * f7;
            float f10 = f5 * f8 + f4 * f7;
            dct dct2 = this.a.ap();
            if (dct2 != null && (um2 = dct2.p()) != null && um2.a(this.a.aQ, cmk.c(this.a.aU + (double)f9), cmk.c(this.a.aV), cmk.c(this.a.aW + (double)f10)) != cfh.c) {
                this.f = 1.0f;
                this.g = 0.0f;
                f3 = f2;
            }
            this.a.i(f3);
            this.a.g(this.f);
            this.a.h(this.g);
            this.h = azu.a;
        } else if (this.h == azu.b) {
            this.h = azu.a;
            double d2 = this.b - this.a.aU;
            double d3 = this.c - this.a.aV;
            double d4 = this.d - this.a.aW;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if (d5 < 2.500000277905201E-7) {
                this.a.g(0.0f);
                return;
            }
            float f11 = (float)(cmk.b(d4, d2) * 57.2957763671875) - 90.0f;
            this.a.ba = this.a(this.a.ba, f11, 90.0f);
            this.a.i((float)(this.e * this.a.a(cgz.d).e()));
            if (d3 > (double)this.a.bu && d2 * d2 + d4 * d4 < (double)Math.max(1.0f, this.a.bl)) {
                this.a.ao().a();
            }
        } else {
            this.a.g(0.0f);
        }
    }

    protected float a(float f2, float f3, float f4) {
        float f5;
        float f6 = cmk.g(f3 - f2);
        if (f6 > f4) {
            f6 = f4;
        }
        if (f6 < -f4) {
            f6 = -f4;
        }
        if ((f5 = f2 + f6) < 0.0f) {
            f5 += 360.0f;
        } else if (f5 > 360.0f) {
            f5 -= 360.0f;
        }
        return f5;
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.d;
    }
}

