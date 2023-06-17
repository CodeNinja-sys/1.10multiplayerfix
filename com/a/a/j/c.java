/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import com.a.a.b.cl;
import com.a.a.j.e;
import com.a.a.j.f;
import com.a.a.j.i;
import com.a.a.j.k;
import com.a.a.l.a;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

public final class c {
    private static final double c = -2.147483648E9;
    private static final double d = 2.147483647E9;
    private static final double e = -9.223372036854776E18;
    private static final double f = 9.223372036854776E18;
    private static final double g = Math.log(2.0);
    static final int a = 170;
    static final double[] b = new double[]{1.0, 2.0922789888E13, 2.631308369336935E35, 1.2413915592536073E61, 1.2688693218588417E89, 7.156945704626381E118, 9.916779348709496E149, 1.974506857221074E182, 3.856204823625804E215, 5.5502938327393044E249, 4.7147236359920616E284};

    static double a(double d2, RoundingMode roundingMode) {
        if (!com.a.a.j.f.c(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(com.a.a.j.c.c(d2));
                return d2;
            }
            case FLOOR: {
                if (d2 >= 0.0 || com.a.a.j.c.c(d2)) {
                    return d2;
                }
                return d2 - 1.0;
            }
            case CEILING: {
                if (d2 <= 0.0 || com.a.a.j.c.c(d2)) {
                    return d2;
                }
                return d2 + 1.0;
            }
            case DOWN: {
                return d2;
            }
            case UP: {
                if (com.a.a.j.c.c(d2)) {
                    return d2;
                }
                return d2 + Math.copySign(1.0, d2);
            }
            case HALF_EVEN: {
                return Math.rint(d2);
            }
            case HALF_UP: {
                double d3 = Math.rint(d2);
                if (Math.abs(d2 - d3) == 0.5) {
                    return d2 + Math.copySign(0.5, d2);
                }
                return d3;
            }
            case HALF_DOWN: {
                double d4 = Math.rint(d2);
                if (Math.abs(d2 - d4) == 0.5) {
                    return d2;
                }
                return d4;
            }
        }
        throw new AssertionError();
    }

    public static int b(double d2, RoundingMode roundingMode) {
        double d3 = com.a.a.j.c.a(d2, roundingMode);
        k.b(d3 > -2.147483649E9 & d3 < 2.147483648E9);
        return (int)d3;
    }

    public static long c(double d2, RoundingMode roundingMode) {
        double d3 = com.a.a.j.c.a(d2, roundingMode);
        k.b(-9.223372036854776E18 - d3 < 1.0 & d3 < 9.223372036854776E18);
        return (long)d3;
    }

    public static BigInteger d(double d2, RoundingMode roundingMode) {
        if (-9.223372036854776E18 - (d2 = com.a.a.j.c.a(d2, roundingMode)) < 1.0 & d2 < 9.223372036854776E18) {
            return BigInteger.valueOf((long)d2);
        }
        int n2 = Math.getExponent(d2);
        long l2 = com.a.a.j.f.b(d2);
        BigInteger bigInteger = BigInteger.valueOf(l2).shiftLeft(n2 - 52);
        return d2 < 0.0 ? bigInteger.negate() : bigInteger;
    }

    public static boolean a(double d2) {
        return d2 > 0.0 && com.a.a.j.f.c(d2) && i.a(com.a.a.j.f.b(d2));
    }

    public static double b(double d2) {
        return Math.log(d2) / g;
    }

    public static int e(double d2, RoundingMode roundingMode) {
        boolean bl2;
        cl.a(d2 > 0.0 && com.a.a.j.f.c(d2), (Object)"x must be positive and finite");
        int n2 = Math.getExponent(d2);
        if (!com.a.a.j.f.d(d2)) {
            return com.a.a.j.c.e(d2 * 4.503599627370496E15, roundingMode) - 52;
        }
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(com.a.a.j.c.a(d2));
            }
            case FLOOR: {
                bl2 = false;
                break;
            }
            case CEILING: {
                bl2 = !com.a.a.j.c.a(d2);
                break;
            }
            case DOWN: {
                bl2 = n2 < 0 & !com.a.a.j.c.a(d2);
                break;
            }
            case UP: {
                bl2 = n2 >= 0 & !com.a.a.j.c.a(d2);
                break;
            }
            case HALF_EVEN: 
            case HALF_UP: 
            case HALF_DOWN: {
                double d3 = com.a.a.j.f.e(d2);
                bl2 = d3 * d3 > 2.0;
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        return bl2 ? n2 + 1 : n2;
    }

    public static boolean c(double d2) {
        return com.a.a.j.f.c(d2) && (d2 == 0.0 || 52 - Long.numberOfTrailingZeros(com.a.a.j.f.b(d2)) <= Math.getExponent(d2));
    }

    public static double a(int n2) {
        k.b("n", n2);
        if (n2 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0;
        for (int i2 = 1 + (n2 & 0xFFFFFFF0); i2 <= n2; ++i2) {
            d2 *= (double)i2;
        }
        return d2 * b[n2 >> 4];
    }

    public static boolean a(double d2, double d3, double d4) {
        k.a("tolerance", d4);
        return Math.copySign(d2 - d3, 1.0) <= d4 || d2 == d3 || Double.isNaN(d2) && Double.isNaN(d3);
    }

    public static int b(double d2, double d3, double d4) {
        if (com.a.a.j.c.a(d2, d3, d4)) {
            return 0;
        }
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        return com.a.a.l.a.a(Double.isNaN(d2), Double.isNaN(d3));
    }

    public static double a(double ... arrd) {
        e e2 = new e(null);
        for (double d2 : arrd) {
            e2.a(d2);
        }
        return e2.a();
    }

    public static double a(int ... arrn) {
        e e2 = new e(null);
        for (int n2 : arrn) {
            e2.a(n2);
        }
        return e2.a();
    }

    public static double a(long ... arrl) {
        e e2 = new e(null);
        for (long l2 : arrl) {
            e2.a(l2);
        }
        return e2.a();
    }

    public static double a(Iterable iterable) {
        e e2 = new e(null);
        for (Number number : iterable) {
            e2.a(number.doubleValue());
        }
        return e2.a();
    }

    public static double a(Iterator iterator) {
        e e2 = new e(null);
        while (iterator.hasNext()) {
            e2.a(((Number)iterator.next()).doubleValue());
        }
        return e2.a();
    }

    private c() {
    }
}

