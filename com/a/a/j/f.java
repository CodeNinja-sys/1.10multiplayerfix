/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import com.a.a.b.cl;
import java.math.BigInteger;

final class f {
    static final long a = 0xFFFFFFFFFFFFFL;
    static final long b = 0x7FF0000000000000L;
    static final long c = Long.MIN_VALUE;
    static final int d = 52;
    static final int e = 1023;
    static final long f = 0x10000000000000L;
    private static final long g = Double.doubleToRawLongBits(1.0);

    private f() {
    }

    static double a(double d2) {
        return -Math.nextUp(-d2);
    }

    static long b(double d2) {
        cl.a(com.a.a.j.f.c(d2), (Object)"not a normal value");
        int n2 = Math.getExponent(d2);
        long l2 = Double.doubleToRawLongBits(d2);
        return n2 == -1023 ? l2 << 1 : (l2 &= 0xFFFFFFFFFFFFFL) | 0x10000000000000L;
    }

    static boolean c(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    static boolean d(double d2) {
        return Math.getExponent(d2) >= -1022;
    }

    static double e(double d2) {
        long l2 = Double.doubleToRawLongBits(d2) & 0xFFFFFFFFFFFFFL;
        return Double.longBitsToDouble(l2 | g);
    }

    static double a(BigInteger bigInteger) {
        BigInteger bigInteger2 = bigInteger.abs();
        int n2 = bigInteger2.bitLength() - 1;
        if (n2 < 63) {
            return bigInteger.longValue();
        }
        if (n2 > 1023) {
            return (double)bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int n3 = n2 - 52 - 1;
        long l2 = bigInteger2.shiftRight(n3).longValue();
        long l3 = l2 >> 1;
        boolean bl2 = (l2 & 1L) != 0L && (((l3 &= 0xFFFFFFFFFFFFFL) & 1L) != 0L || bigInteger2.getLowestSetBit() < n3);
        long l4 = bl2 ? l3 + 1L : l3;
        long l5 = (long)(n2 + 1023) << 52;
        l5 += l4;
        return Double.longBitsToDouble(l5 |= (long)bigInteger.signum() & Long.MIN_VALUE);
    }

    static double f(double d2) {
        cl.a(!Double.isNaN(d2));
        if (d2 > 0.0) {
            return d2;
        }
        return 0.0;
    }
}

