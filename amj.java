/*
 * Decompiled with CFR 0.150.
 */
public class amj {
    public static final amj a = new amj(0.0, 0.0, 0.0);
    public final double b;
    public final double c;
    public final double d;

    public amj(double d2, double d3, double d4) {
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        if (d4 == -0.0) {
            d4 = 0.0;
        }
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public amj(cjx cjx2) {
        this(cjx2.a(), cjx2.b(), cjx2.c());
    }

    public amj a(amj amj2) {
        return new amj(amj2.b - this.b, amj2.c - this.c, amj2.d - this.d);
    }

    public amj a() {
        double d2 = cmk.a(this.b * this.b + this.c * this.c + this.d * this.d);
        if (d2 < 1.0E-4) {
            return a;
        }
        return new amj(this.b / d2, this.c / d2, this.d / d2);
    }

    public double b(amj amj2) {
        return this.b * amj2.b + this.c * amj2.c + this.d * amj2.d;
    }

    public amj c(amj amj2) {
        return new amj(this.c * amj2.d - this.d * amj2.c, this.d * amj2.b - this.b * amj2.d, this.b * amj2.c - this.c * amj2.b);
    }

    public amj d(amj amj2) {
        return this.a(amj2.b, amj2.c, amj2.d);
    }

    public amj a(double d2, double d3, double d4) {
        return this.b(-d2, -d3, -d4);
    }

    public amj e(amj amj2) {
        return this.b(amj2.b, amj2.c, amj2.d);
    }

    public amj b(double d2, double d3, double d4) {
        return new amj(this.b + d2, this.c + d3, this.d + d4);
    }

    public double f(amj amj2) {
        double d2 = amj2.b - this.b;
        double d3 = amj2.c - this.c;
        double d4 = amj2.d - this.d;
        return cmk.a(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double g(amj amj2) {
        double d2 = amj2.b - this.b;
        double d3 = amj2.c - this.c;
        double d4 = amj2.d - this.d;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public double c(double d2, double d3, double d4) {
        double d5 = d2 - this.b;
        double d6 = d3 - this.c;
        double d7 = d4 - this.d;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public amj a(double d2) {
        return new amj(this.b * d2, this.c * d2, this.d * d2);
    }

    public double b() {
        return cmk.a(this.b * this.b + this.c * this.c + this.d * this.d);
    }

    public double c() {
        return this.b * this.b + this.c * this.c + this.d * this.d;
    }

    public amj a(amj amj2, double d2) {
        double d3 = amj2.b - this.b;
        double d4 = amj2.c - this.c;
        double d5 = amj2.d - this.d;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.b) / d3;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return new amj(this.b + d3 * d6, this.c + d4 * d6, this.d + d5 * d6);
    }

    public amj b(amj amj2, double d2) {
        double d3 = amj2.b - this.b;
        double d4 = amj2.c - this.c;
        double d5 = amj2.d - this.d;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.c) / d4;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return new amj(this.b + d3 * d6, this.c + d4 * d6, this.d + d5 * d6);
    }

    public amj c(amj amj2, double d2) {
        double d3 = amj2.b - this.b;
        double d4 = amj2.c - this.c;
        double d5 = amj2.d - this.d;
        if (d5 * d5 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.d) / d5;
        if (d6 < 0.0 || d6 > 1.0) {
            return null;
        }
        return new amj(this.b + d3 * d6, this.c + d4 * d6, this.d + d5 * d6);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof amj)) {
            return false;
        }
        amj amj2 = (amj)object;
        if (Double.compare(amj2.b, this.b) != 0) {
            return false;
        }
        if (Double.compare(amj2.c, this.c) != 0) {
            return false;
        }
        return Double.compare(amj2.d, this.d) == 0;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.b);
        int n2 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.c);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.d);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        return n2;
    }

    public String toString() {
        return "(" + this.b + ", " + this.c + ", " + this.d + ")";
    }

    public amj a(float f2) {
        float f3 = cmk.b(f2);
        float f4 = cmk.a(f2);
        double d2 = this.b;
        double d3 = this.c * (double)f3 + this.d * (double)f4;
        double d4 = this.d * (double)f3 - this.c * (double)f4;
        return new amj(d2, d3, d4);
    }

    public amj b(float f2) {
        float f3 = cmk.b(f2);
        float f4 = cmk.a(f2);
        double d2 = this.b * (double)f3 + this.d * (double)f4;
        double d3 = this.c;
        double d4 = this.d * (double)f3 - this.b * (double)f4;
        return new amj(d2, d3, d4);
    }

    public static amj a(afo afo2) {
        return amj.a(afo2.i, afo2.j);
    }

    public static amj a(float f2, float f3) {
        float f4 = cmk.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = cmk.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -cmk.b(-f2 * ((float)Math.PI / 180));
        float f7 = cmk.a(-f2 * ((float)Math.PI / 180));
        return new amj(f5 * f6, f7, f4 * f6);
    }
}

