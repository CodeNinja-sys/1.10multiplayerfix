/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;

public class a {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public a(double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = Math.min(d2, d5);
        this.b = Math.min(d3, d6);
        this.c = Math.min(d4, d7);
        this.d = Math.max(d2, d5);
        this.e = Math.max(d3, d6);
        this.f = Math.max(d4, d7);
    }

    public a(b b2) {
        this(b2.cy_(), b2.k(), b2.l(), b2.cy_() + 1, b2.k() + 1, b2.l() + 1);
    }

    public a(b b2, b b3) {
        this(b2.cy_(), b2.k(), b2.l(), b3.cy_(), b3.k(), b3.l());
    }

    public a(s s2, s s3) {
        this(s2.b, s2.c, s2.d, s3.b, s3.c, s3.d);
    }

    public a a(double d2) {
        return new a(this.a, this.b, this.c, this.d, d2, this.f);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return Double.compare(a2.a, this.a) != 0 ? false : (Double.compare(a2.b, this.b) != 0 ? false : (Double.compare(a2.c, this.c) != 0 ? false : (Double.compare(a2.d, this.d) != 0 ? false : (Double.compare(a2.e, this.e) != 0 ? false : Double.compare(a2.f, this.f) == 0))));
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

    public a a(double d2, double d3, double d4) {
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
        return new a(d5, d6, d7, d8, d9, d10);
    }

    public a b(double d2, double d3, double d4) {
        double d5 = this.a - d2;
        double d6 = this.b - d3;
        double d7 = this.c - d4;
        double d8 = this.d + d2;
        double d9 = this.e + d3;
        double d10 = this.f + d4;
        return new a(d5, d6, d7, d8, d9, d10);
    }

    public a b(double d2) {
        return this.b(d2, d2, d2);
    }

    public a a(a a2) {
        double d2 = Math.min(this.a, a2.a);
        double d3 = Math.min(this.b, a2.b);
        double d4 = Math.min(this.c, a2.c);
        double d5 = Math.max(this.d, a2.d);
        double d6 = Math.max(this.e, a2.e);
        double d7 = Math.max(this.f, a2.f);
        return new a(d2, d3, d4, d5, d6, d7);
    }

    public a c(double d2, double d3, double d4) {
        return new a(this.a + d2, this.b + d3, this.c + d4, this.d + d2, this.e + d3, this.f + d4);
    }

    public a a(b b2) {
        return new a(this.a + (double)b2.cy_(), this.b + (double)b2.k(), this.c + (double)b2.l(), this.d + (double)b2.cy_(), this.e + (double)b2.k(), this.f + (double)b2.l());
    }

    public double a(a a2, double d2) {
        if (a2.e > this.b && a2.b < this.e && a2.f > this.c && a2.c < this.f) {
            double d3;
            if (d2 > 0.0 && a2.d <= this.a) {
                double d4 = this.a - a2.d;
                if (d4 < d2) {
                    d2 = d4;
                }
            } else if (d2 < 0.0 && a2.a >= this.d && (d3 = this.d - a2.a) > d2) {
                d2 = d3;
            }
            return d2;
        }
        return d2;
    }

    public double b(a a2, double d2) {
        if (a2.d > this.a && a2.a < this.d && a2.f > this.c && a2.c < this.f) {
            double d3;
            if (d2 > 0.0 && a2.e <= this.b) {
                double d4 = this.b - a2.e;
                if (d4 < d2) {
                    d2 = d4;
                }
            } else if (d2 < 0.0 && a2.b >= this.e && (d3 = this.e - a2.b) > d2) {
                d2 = d3;
            }
            return d2;
        }
        return d2;
    }

    public double c(a a2, double d2) {
        if (a2.d > this.a && a2.a < this.d && a2.e > this.b && a2.b < this.e) {
            double d3;
            if (d2 > 0.0 && a2.f <= this.c) {
                double d4 = this.c - a2.f;
                if (d4 < d2) {
                    d2 = d4;
                }
            } else if (d2 < 0.0 && a2.c >= this.f && (d3 = this.f - a2.c) > d2) {
                d2 = d3;
            }
            return d2;
        }
        return d2;
    }

    public boolean b(a a2) {
        return this.a(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f);
    }

    public boolean a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.a < d5 && this.d > d2 && this.b < d6 && this.e > d3 && this.c < d7 && this.f > d4;
    }

    public boolean a(s s2, s s3) {
        return this.a(Math.min(s2.b, s3.b), Math.min(s2.c, s3.c), Math.min(s2.d, s3.d), Math.max(s2.b, s3.b), Math.max(s2.c, s3.c), Math.max(s2.d, s3.d));
    }

    public boolean a(s s2) {
        return s2.b > this.a && s2.b < this.d ? (s2.c > this.b && s2.c < this.e ? s2.d > this.c && s2.d < this.f : false) : false;
    }

    public double a() {
        double d2 = this.d - this.a;
        double d3 = this.e - this.b;
        double d4 = this.f - this.c;
        return (d2 + d3 + d4) / 3.0;
    }

    public a c(double d2) {
        return this.b(-d2);
    }

    public o b(s s2, s s3) {
        s s4 = this.a(this.a, s2, s3);
        ad ad2 = ad.e;
        s s5 = this.a(this.d, s2, s3);
        if (s5 != null && this.a(s2, s4, s5)) {
            s4 = s5;
            ad2 = ad.f;
        }
        if ((s5 = this.b(this.b, s2, s3)) != null && this.a(s2, s4, s5)) {
            s4 = s5;
            ad2 = ad.a;
        }
        if ((s5 = this.b(this.e, s2, s3)) != null && this.a(s2, s4, s5)) {
            s4 = s5;
            ad2 = ad.b;
        }
        if ((s5 = this.c(this.c, s2, s3)) != null && this.a(s2, s4, s5)) {
            s4 = s5;
            ad2 = ad.c;
        }
        if ((s5 = this.c(this.f, s2, s3)) != null && this.a(s2, s4, s5)) {
            s4 = s5;
            ad2 = ad.d;
        }
        return s4 == null ? null : new o(s4, ad2);
    }

    boolean a(s s2, s s3, s s4) {
        return s3 == null || s2.g(s4) < s2.g(s3);
    }

    s a(double d2, s s2, s s3) {
        s s4 = s2.a(s3, d2);
        return s4 != null && this.b(s4) ? s4 : null;
    }

    s b(double d2, s s2, s s3) {
        s s4 = s2.b(s3, d2);
        return s4 != null && this.c(s4) ? s4 : null;
    }

    s c(double d2, s s2, s s3) {
        s s4 = s2.c(s3, d2);
        return s4 != null && this.d(s4) ? s4 : null;
    }

    public boolean b(s s2) {
        return s2.c >= this.b && s2.c <= this.e && s2.d >= this.c && s2.d <= this.f;
    }

    public boolean c(s s2) {
        return s2.b >= this.a && s2.b <= this.d && s2.d >= this.c && s2.d <= this.f;
    }

    public boolean d(s s2) {
        return s2.b >= this.a && s2.b <= this.d && s2.c >= this.b && s2.c <= this.e;
    }

    public String toString() {
        return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
    }

    public boolean b() {
        return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
    }

    public s c() {
        return new s(this.a + (this.d - this.a) * 0.5, this.b + (this.e - this.b) * 0.5, this.c + (this.f - this.c) * 0.5);
    }
}

