/*
 * Decompiled with CFR 0.150.
 */
public class cxt {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public cxt(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = Math.min(d2, d5);
        this.b = Math.min(d3, d6);
        this.c = Math.min(d4, d7);
        this.d = Math.max(d2, d5);
        this.e = Math.max(d3, d6);
        this.f = Math.max(d4, d7);
    }

    public cxt(cmz cmz2) {
        this(cmz2.a(), cmz2.b(), cmz2.c(), cmz2.a() + 1, cmz2.b() + 1, cmz2.c() + 1);
    }

    public cxt(cmz cmz2, cmz cmz3) {
        this(cmz2.a(), cmz2.b(), cmz2.c(), cmz3.a(), cmz3.b(), cmz3.c());
    }

    public cxt(amj amj2, amj amj3) {
        this(amj2.b, amj2.c, amj2.d, amj3.b, amj3.c, amj3.d);
    }

    public cxt a(double d2) {
        return new cxt(this.a, this.b, this.c, this.d, d2, this.f);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cxt)) {
            return false;
        }
        cxt cxt2 = (cxt)object;
        if (Double.compare(cxt2.a, this.a) != 0) {
            return false;
        }
        if (Double.compare(cxt2.b, this.b) != 0) {
            return false;
        }
        if (Double.compare(cxt2.c, this.c) != 0) {
            return false;
        }
        if (Double.compare(cxt2.d, this.d) != 0) {
            return false;
        }
        if (Double.compare(cxt2.e, this.e) != 0) {
            return false;
        }
        return Double.compare(cxt2.f, this.f) == 0;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.a);
        int n2 = (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.b);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.c);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.d);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.e);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.f);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        return n2;
    }

    public cxt a(double d2, double d3, double d4) {
        double d5 = this.a;
        double d6 = this.b;
        double d7 = this.c;
        double d8 = this.d;
        double d9 = this.e;
        double d10 = this.f;
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        if (d4 < 0.0) {
            d7 += d4;
        } else if (d4 > 0.0) {
            d10 += d4;
        }
        return new cxt(d5, d6, d7, d8, d9, d10);
    }

    public cxt b(double d2, double d3, double d4) {
        double d5 = this.a - d2;
        double d6 = this.b - d3;
        double d7 = this.c - d4;
        double d8 = this.d + d2;
        double d9 = this.e + d3;
        double d10 = this.f + d4;
        return new cxt(d5, d6, d7, d8, d9, d10);
    }

    public cxt b(double d2) {
        return this.b(d2, d2, d2);
    }

    public cxt a(cxt cxt2) {
        double d2 = Math.min(this.a, cxt2.a);
        double d3 = Math.min(this.b, cxt2.b);
        double d4 = Math.min(this.c, cxt2.c);
        double d5 = Math.max(this.d, cxt2.d);
        double d6 = Math.max(this.e, cxt2.e);
        double d7 = Math.max(this.f, cxt2.f);
        return new cxt(d2, d3, d4, d5, d6, d7);
    }

    public cxt c(double d2, double d3, double d4) {
        return new cxt(this.a + d2, this.b + d3, this.c + d4, this.d + d2, this.e + d3, this.f + d4);
    }

    public cxt a(cmz cmz2) {
        return new cxt(this.a + (double)cmz2.a(), this.b + (double)cmz2.b(), this.c + (double)cmz2.c(), this.d + (double)cmz2.a(), this.e + (double)cmz2.b(), this.f + (double)cmz2.c());
    }

    public double a(cxt cxt2, double d2) {
        double d3;
        if (cxt2.e <= this.b || cxt2.b >= this.e || cxt2.f <= this.c || cxt2.c >= this.f) {
            return d2;
        }
        if (d2 > 0.0 && cxt2.d <= this.a) {
            double d4 = this.a - cxt2.d;
            if (d4 < d2) {
                d2 = d4;
            }
        } else if (d2 < 0.0 && cxt2.a >= this.d && (d3 = this.d - cxt2.a) > d2) {
            d2 = d3;
        }
        return d2;
    }

    public double b(cxt cxt2, double d2) {
        double d3;
        if (cxt2.d <= this.a || cxt2.a >= this.d || cxt2.f <= this.c || cxt2.c >= this.f) {
            return d2;
        }
        if (d2 > 0.0 && cxt2.e <= this.b) {
            double d4 = this.b - cxt2.e;
            if (d4 < d2) {
                d2 = d4;
            }
        } else if (d2 < 0.0 && cxt2.b >= this.e && (d3 = this.e - cxt2.b) > d2) {
            d2 = d3;
        }
        return d2;
    }

    public double c(cxt cxt2, double d2) {
        double d3;
        if (cxt2.d <= this.a || cxt2.a >= this.d || cxt2.e <= this.b || cxt2.b >= this.e) {
            return d2;
        }
        if (d2 > 0.0 && cxt2.f <= this.c) {
            double d4 = this.c - cxt2.f;
            if (d4 < d2) {
                d2 = d4;
            }
        } else if (d2 < 0.0 && cxt2.c >= this.f && (d3 = this.f - cxt2.c) > d2) {
            d2 = d3;
        }
        return d2;
    }

    public boolean b(cxt cxt2) {
        return this.a(cxt2.a, cxt2.b, cxt2.c, cxt2.d, cxt2.e, cxt2.f);
    }

    public boolean a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.a < d5 && this.d > d2 && this.b < d6 && this.e > d3 && this.c < d7 && this.f > d4;
    }

    public boolean a(amj amj2, amj amj3) {
        return this.a(Math.min(amj2.b, amj3.b), Math.min(amj2.c, amj3.c), Math.min(amj2.d, amj3.d), Math.max(amj2.b, amj3.b), Math.max(amj2.c, amj3.c), Math.max(amj2.d, amj3.d));
    }

    public boolean a(amj amj2) {
        if (amj2.b <= this.a || amj2.b >= this.d) {
            return false;
        }
        if (amj2.c <= this.b || amj2.c >= this.e) {
            return false;
        }
        return !(amj2.d <= this.c) && !(amj2.d >= this.f);
    }

    public double a() {
        double d2 = this.d - this.a;
        double d3 = this.e - this.b;
        double d4 = this.f - this.c;
        return (d2 + d3 + d4) / 3.0;
    }

    public cxt c(double d2) {
        return this.b(-d2);
    }

    public auu b(amj amj2, amj amj3) {
        amj amj4 = this.a(this.a, amj2, amj3);
        bqk bqk2 = bqk.e;
        amj amj5 = this.a(this.d, amj2, amj3);
        if (amj5 != null && this.a(amj2, amj4, amj5)) {
            amj4 = amj5;
            bqk2 = bqk.f;
        }
        if ((amj5 = this.b(this.b, amj2, amj3)) != null && this.a(amj2, amj4, amj5)) {
            amj4 = amj5;
            bqk2 = bqk.a;
        }
        if ((amj5 = this.b(this.e, amj2, amj3)) != null && this.a(amj2, amj4, amj5)) {
            amj4 = amj5;
            bqk2 = bqk.b;
        }
        if ((amj5 = this.c(this.c, amj2, amj3)) != null && this.a(amj2, amj4, amj5)) {
            amj4 = amj5;
            bqk2 = bqk.c;
        }
        if ((amj5 = this.c(this.f, amj2, amj3)) != null && this.a(amj2, amj4, amj5)) {
            amj4 = amj5;
            bqk2 = bqk.d;
        }
        return amj4 == null ? null : new auu(amj4, bqk2);
    }

    boolean a(amj amj2, amj amj3, amj amj4) {
        return amj3 == null || amj2.g(amj4) < amj2.g(amj3);
    }

    amj a(double d2, amj amj2, amj amj3) {
        amj amj4 = amj2.a(amj3, d2);
        return amj4 == null || !this.b(amj4) ? null : amj4;
    }

    amj b(double d2, amj amj2, amj amj3) {
        amj amj4 = amj2.b(amj3, d2);
        return amj4 == null || !this.c(amj4) ? null : amj4;
    }

    amj c(double d2, amj amj2, amj amj3) {
        amj amj4 = amj2.c(amj3, d2);
        return amj4 == null || !this.d(amj4) ? null : amj4;
    }

    public boolean b(amj amj2) {
        return amj2.c >= this.b && amj2.c <= this.e && amj2.d >= this.c && amj2.d <= this.f;
    }

    public boolean c(amj amj2) {
        return amj2.b >= this.a && amj2.b <= this.d && amj2.d >= this.c && amj2.d <= this.f;
    }

    public boolean d(amj amj2) {
        return amj2.b >= this.a && amj2.b <= this.d && amj2.c >= this.b && amj2.c <= this.e;
    }

    public String toString() {
        return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
    }

    public boolean b() {
        return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
    }

    public amj c() {
        return new amj(this.a + (this.d - this.a) * 0.5, this.b + (this.e - this.b) * 0.5, this.c + (this.f - this.c) * 0.5);
    }
}

