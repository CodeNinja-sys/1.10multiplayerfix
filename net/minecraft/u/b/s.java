/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.u.b.n;
import net.minecraft.u.b.r;
import net.minecraft.u.b.t;

public class s {
    public static final s a = new s(0.0, 0.0, 0.0);
    public final double b;
    public final double c;
    public final double d;

    public s(double d2, double d3, double d4) {
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

    public s(t t2) {
        this(t2.cy_(), t2.k(), t2.l());
    }

    public s a(s s2) {
        return new s(s2.b - this.b, s2.c - this.c, s2.d - this.d);
    }

    public s a() {
        double d2 = n.a(this.b * this.b + this.c * this.c + this.d * this.d);
        return d2 < 1.0E-4 ? a : new s(this.b / d2, this.c / d2, this.d / d2);
    }

    public double b(s s2) {
        return this.b * s2.b + this.c * s2.c + this.d * s2.d;
    }

    public s c(s s2) {
        return new s(this.c * s2.d - this.d * s2.c, this.d * s2.b - this.b * s2.d, this.b * s2.c - this.c * s2.b);
    }

    public s d(s s2) {
        return this.a(s2.b, s2.c, s2.d);
    }

    public s a(double d2, double d3, double d4) {
        return this.b(-d2, -d3, -d4);
    }

    public s e(s s2) {
        return this.b(s2.b, s2.c, s2.d);
    }

    public s b(double d2, double d3, double d4) {
        return new s(this.b + d2, this.c + d3, this.d + d4);
    }

    public double f(s s2) {
        double d2 = s2.b - this.b;
        double d3 = s2.c - this.c;
        double d4 = s2.d - this.d;
        return n.a(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double g(s s2) {
        double d2 = s2.b - this.b;
        double d3 = s2.c - this.c;
        double d4 = s2.d - this.d;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    public double c(double d2, double d3, double d4) {
        double d5 = d2 - this.b;
        double d6 = d3 - this.c;
        double d7 = d4 - this.d;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public s a(double d2) {
        return new s(this.b * d2, this.c * d2, this.d * d2);
    }

    public double b() {
        return n.a(this.b * this.b + this.c * this.c + this.d * this.d);
    }

    public double c() {
        return this.b * this.b + this.c * this.c + this.d * this.d;
    }

    public s a(s s2, double d2) {
        double d3 = s2.b - this.b;
        double d4 = s2.c - this.c;
        double d5 = s2.d - this.d;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.b) / d3;
        return d6 >= 0.0 && d6 <= 1.0 ? new s(this.b + d3 * d6, this.c + d4 * d6, this.d + d5 * d6) : null;
    }

    public s b(s s2, double d2) {
        double d3 = s2.b - this.b;
        double d4 = s2.c - this.c;
        double d5 = s2.d - this.d;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.c) / d4;
        return d6 >= 0.0 && d6 <= 1.0 ? new s(this.b + d3 * d6, this.c + d4 * d6, this.d + d5 * d6) : null;
    }

    public s c(s s2, double d2) {
        double d3 = s2.b - this.b;
        double d4 = s2.c - this.c;
        double d5 = s2.d - this.d;
        if (d5 * d5 < (double)1.0E-7f) {
            return null;
        }
        double d6 = (d2 - this.d) / d5;
        return d6 >= 0.0 && d6 <= 1.0 ? new s(this.b + d3 * d6, this.c + d4 * d6, this.d + d5 * d6) : null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        return Double.compare(s2.b, this.b) != 0 ? false : (Double.compare(s2.c, this.c) != 0 ? false : Double.compare(s2.d, this.d) == 0);
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

    public s a(float f2) {
        float f3 = n.b(f2);
        float f4 = n.a(f2);
        double d2 = this.b;
        double d3 = this.c * (double)f3 + this.d * (double)f4;
        double d4 = this.d * (double)f3 - this.c * (double)f4;
        return new s(d2, d3, d4);
    }

    public s b(float f2) {
        float f3 = n.b(f2);
        float f4 = n.a(f2);
        double d2 = this.b * (double)f3 + this.d * (double)f4;
        double d3 = this.c;
        double d4 = this.d * (double)f3 - this.b * (double)f4;
        return new s(d2, d3, d4);
    }

    public static s a(r r2) {
        return s.a(r2.i, r2.j);
    }

    public static s a(float f2, float f3) {
        float f4 = n.b(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = n.a(-f3 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = -n.b(-f2 * ((float)Math.PI / 180));
        float f7 = n.a(-f2 * ((float)Math.PI / 180));
        return new s(f5 * f6, f7, f4 * f6);
    }
}

