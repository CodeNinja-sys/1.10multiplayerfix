/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.e;

import java.math.BigInteger;

public final class a
extends Number
implements Comparable {
    private static final long m = 65382027393090L;
    public static final a a = new a(0, 1);
    public static final a b = new a(1, 1);
    public static final a c = new a(1, 2);
    public static final a d = new a(1, 3);
    public static final a e = new a(2, 3);
    public static final a f = new a(1, 4);
    public static final a g = new a(2, 4);
    public static final a h = new a(3, 4);
    public static final a i = new a(1, 5);
    public static final a j = new a(2, 5);
    public static final a k = new a(3, 5);
    public static final a l = new a(4, 5);
    private final int n;
    private final int o;
    private transient int p = 0;
    private transient String q = null;
    private transient String r = null;

    private a(int n2, int n3) {
        this.n = n2;
        this.o = n3;
    }

    public static a a(int n2, int n3) {
        if (n3 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (n3 < 0) {
            if (n2 == Integer.MIN_VALUE || n3 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            n2 = -n2;
            n3 = -n3;
        }
        return new a(n2, n3);
    }

    public static a a(int n2, int n3, int n4) {
        if (n4 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (n4 < 0) {
            throw new ArithmeticException("The denominator must not be negative");
        }
        if (n3 < 0) {
            throw new ArithmeticException("The numerator must not be negative");
        }
        long l2 = n2 < 0 ? (long)n2 * (long)n4 - (long)n3 : (long)n2 * (long)n4 + (long)n3;
        if (l2 < Integer.MIN_VALUE || l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("Numerator too large to represent as an Integer.");
        }
        return new a((int)l2, n4);
    }

    public static a b(int n2, int n3) {
        if (n3 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (n2 == 0) {
            return a;
        }
        if (n3 == Integer.MIN_VALUE && (n2 & 1) == 0) {
            n2 /= 2;
            n3 /= 2;
        }
        if (n3 < 0) {
            if (n2 == Integer.MIN_VALUE || n3 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            n2 = -n2;
            n3 = -n3;
        }
        int n4 = org.apache.commons.c.e.a.c(n2, n3);
        return new a(n2 /= n4, n3 /= n4);
    }

    public static a a(double d2) {
        double d3;
        int n2 = d2 < 0.0 ? -1 : 1;
        if ((d2 = Math.abs(d2)) > 2.147483647E9 || Double.isNaN(d2)) {
            throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        int n3 = (int)d2;
        int n4 = 0;
        int n5 = 1;
        int n6 = 1;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = (int)(d2 -= (double)n3);
        int n11 = 0;
        double d4 = 1.0;
        double d5 = 0.0;
        double d6 = d2 - (double)n10;
        double d7 = 0.0;
        double d8 = Double.MAX_VALUE;
        int n12 = 1;
        do {
            d3 = d8;
            n11 = (int)(d4 / d6);
            d5 = d6;
            d7 = d4 - (double)n11 * d6;
            n8 = n10 * n6 + n4;
            n9 = n10 * n7 + n5;
            double d9 = (double)n8 / (double)n9;
            d8 = Math.abs(d2 - d9);
            n10 = n11;
            d4 = d5;
            d6 = d7;
            n4 = n6;
            n5 = n7;
            n6 = n8;
            n7 = n9;
        } while (d3 > d8 && n9 <= 10000 && n9 > 0 && ++n12 < 25);
        if (n12 == 25) {
            throw new ArithmeticException("Unable to convert double to fraction");
        }
        return org.apache.commons.c.e.a.b((n4 + n3 * n5) * n2, n5);
    }

    public static a a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("The string must not be null");
        }
        int n2 = string.indexOf(46);
        if (n2 >= 0) {
            return org.apache.commons.c.e.a.a(Double.parseDouble(string));
        }
        n2 = string.indexOf(32);
        if (n2 > 0) {
            int n3 = Integer.parseInt(string.substring(0, n2));
            if ((n2 = (string = string.substring(n2 + 1)).indexOf(47)) < 0) {
                throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            }
            int n4 = Integer.parseInt(string.substring(0, n2));
            int n5 = Integer.parseInt(string.substring(n2 + 1));
            return org.apache.commons.c.e.a.a(n3, n4, n5);
        }
        n2 = string.indexOf(47);
        if (n2 < 0) {
            return org.apache.commons.c.e.a.a(Integer.parseInt(string), 1);
        }
        int n6 = Integer.parseInt(string.substring(0, n2));
        int n7 = Integer.parseInt(string.substring(n2 + 1));
        return org.apache.commons.c.e.a.a(n6, n7);
    }

    public int a() {
        return this.n;
    }

    public int b() {
        return this.o;
    }

    public int c() {
        return Math.abs(this.n % this.o);
    }

    public int d() {
        return this.n / this.o;
    }

    @Override
    public int intValue() {
        return this.n / this.o;
    }

    @Override
    public long longValue() {
        return (long)this.n / (long)this.o;
    }

    @Override
    public float floatValue() {
        return (float)this.n / (float)this.o;
    }

    @Override
    public double doubleValue() {
        return (double)this.n / (double)this.o;
    }

    public a e() {
        if (this.n == 0) {
            return this.equals(a) ? this : a;
        }
        int n2 = org.apache.commons.c.e.a.c(Math.abs(this.n), this.o);
        if (n2 == 1) {
            return this;
        }
        return org.apache.commons.c.e.a.a(this.n / n2, this.o / n2);
    }

    public a f() {
        if (this.n == 0) {
            throw new ArithmeticException("Unable to invert zero.");
        }
        if (this.n == Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow: can't negate numerator");
        }
        if (this.n < 0) {
            return new a(-this.o, -this.n);
        }
        return new a(this.o, this.n);
    }

    public a g() {
        if (this.n == Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow: too large to negate");
        }
        return new a(-this.n, this.o);
    }

    public a h() {
        if (this.n >= 0) {
            return this;
        }
        return this.g();
    }

    public a a(int n2) {
        if (n2 == 1) {
            return this;
        }
        if (n2 == 0) {
            return b;
        }
        if (n2 < 0) {
            if (n2 == Integer.MIN_VALUE) {
                return this.f().a(2).a(-(n2 / 2));
            }
            return this.f().a(-n2);
        }
        a a2 = this.c(this);
        if (n2 % 2 == 0) {
            return a2.a(n2 / 2);
        }
        return a2.a(n2 / 2).c(this);
    }

    private static int c(int n2, int n3) {
        int n4;
        int n5;
        if (n2 == 0 || n3 == 0) {
            if (n2 == Integer.MIN_VALUE || n3 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: gcd is 2^31");
            }
            return Math.abs(n2) + Math.abs(n3);
        }
        if (Math.abs(n2) == 1 || Math.abs(n3) == 1) {
            return 1;
        }
        if (n2 > 0) {
            n2 = -n2;
        }
        if (n3 > 0) {
            n3 = -n3;
        }
        for (n5 = 0; (n2 & 1) == 0 && (n3 & 1) == 0 && n5 < 31; ++n5) {
            n2 /= 2;
            n3 /= 2;
        }
        if (n5 == 31) {
            throw new ArithmeticException("overflow: gcd is 2^31");
        }
        int n6 = n4 = (n2 & 1) == 1 ? n3 : -(n2 / 2);
        while (true) {
            if ((n4 & 1) == 0) {
                n4 /= 2;
                continue;
            }
            if (n4 > 0) {
                n2 = -n4;
            } else {
                n3 = n4;
            }
            if ((n4 = (n3 - n2) / 2) == 0) break;
        }
        return -n2 * (1 << n5);
    }

    private static int d(int n2, int n3) {
        long l2 = (long)n2 * (long)n3;
        if (l2 < Integer.MIN_VALUE || l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("overflow: mul");
        }
        return (int)l2;
    }

    private static int e(int n2, int n3) {
        long l2 = (long)n2 * (long)n3;
        if (l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("overflow: mulPos");
        }
        return (int)l2;
    }

    private static int f(int n2, int n3) {
        long l2 = (long)n2 + (long)n3;
        if (l2 < Integer.MIN_VALUE || l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("overflow: add");
        }
        return (int)l2;
    }

    private static int g(int n2, int n3) {
        long l2 = (long)n2 - (long)n3;
        if (l2 < Integer.MIN_VALUE || l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("overflow: add");
        }
        return (int)l2;
    }

    public a a(a a2) {
        return this.a(a2, true);
    }

    public a b(a a2) {
        return this.a(a2, false);
    }

    private a a(a a2, boolean bl2) {
        int n2;
        int n3;
        if (a2 == null) {
            throw new IllegalArgumentException("The fraction must not be null");
        }
        if (this.n == 0) {
            return bl2 ? a2 : a2.g();
        }
        if (a2.n == 0) {
            return this;
        }
        int n4 = org.apache.commons.c.e.a.c(this.o, a2.o);
        if (n4 == 1) {
            int n5 = org.apache.commons.c.e.a.d(this.n, a2.o);
            int n6 = org.apache.commons.c.e.a.d(a2.n, this.o);
            return new a(bl2 ? org.apache.commons.c.e.a.f(n5, n6) : org.apache.commons.c.e.a.g(n5, n6), org.apache.commons.c.e.a.e(this.o, a2.o));
        }
        BigInteger bigInteger = BigInteger.valueOf(this.n).multiply(BigInteger.valueOf(a2.o / n4));
        BigInteger bigInteger2 = BigInteger.valueOf(a2.n).multiply(BigInteger.valueOf(this.o / n4));
        BigInteger bigInteger3 = bl2 ? bigInteger.add(bigInteger2) : bigInteger.subtract(bigInteger2);
        BigInteger bigInteger4 = bigInteger3.divide(BigInteger.valueOf(n3 = (n2 = bigInteger3.mod(BigInteger.valueOf(n4)).intValue()) == 0 ? n4 : org.apache.commons.c.e.a.c(n2, n4)));
        if (bigInteger4.bitLength() > 31) {
            throw new ArithmeticException("overflow: numerator too large after multiply");
        }
        return new a(bigInteger4.intValue(), org.apache.commons.c.e.a.e(this.o / n4, a2.o / n3));
    }

    public a c(a a2) {
        if (a2 == null) {
            throw new IllegalArgumentException("The fraction must not be null");
        }
        if (this.n == 0 || a2.n == 0) {
            return a;
        }
        int n2 = org.apache.commons.c.e.a.c(this.n, a2.o);
        int n3 = org.apache.commons.c.e.a.c(a2.n, this.o);
        return org.apache.commons.c.e.a.b(org.apache.commons.c.e.a.d(this.n / n2, a2.n / n3), org.apache.commons.c.e.a.e(this.o / n3, a2.o / n2));
    }

    public a d(a a2) {
        if (a2 == null) {
            throw new IllegalArgumentException("The fraction must not be null");
        }
        if (a2.n == 0) {
            throw new ArithmeticException("The fraction to divide by must not be zero");
        }
        return this.c(a2.f());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.a() == a2.a() && this.b() == a2.b();
    }

    public int hashCode() {
        if (this.p == 0) {
            this.p = 37 * (629 + this.a()) + this.b();
        }
        return this.p;
    }

    public int e(a a2) {
        if (this == a2) {
            return 0;
        }
        if (this.n == a2.n && this.o == a2.o) {
            return 0;
        }
        long l2 = (long)this.n * (long)a2.o;
        long l3 = (long)a2.n * (long)this.o;
        if (l2 == l3) {
            return 0;
        }
        if (l2 < l3) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        if (this.q == null) {
            this.q = new StringBuilder(32).append(this.a()).append('/').append(this.b()).toString();
        }
        return this.q;
    }

    public String i() {
        if (this.r == null) {
            int n2;
            this.r = this.n == 0 ? "0" : (this.n == this.o ? "1" : (this.n == -1 * this.o ? "-1" : ((this.n > 0 ? -this.n : this.n) < -this.o ? ((n2 = this.c()) == 0 ? Integer.toString(this.d()) : new StringBuilder(32).append(this.d()).append(' ').append(n2).append('/').append(this.b()).toString()) : new StringBuilder(32).append(this.a()).append('/').append(this.b()).toString())));
        }
        return this.r;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.e((a)object);
    }
}

