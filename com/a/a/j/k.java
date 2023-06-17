/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import java.math.BigInteger;

final class k {
    static int a(String string, int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException(string + " (" + n2 + ") must be > 0");
        }
        return n2;
    }

    static long a(String string, long l2) {
        if (l2 <= 0L) {
            throw new IllegalArgumentException(string + " (" + l2 + ") must be > 0");
        }
        return l2;
    }

    static BigInteger a(String string, BigInteger bigInteger) {
        if (bigInteger.signum() <= 0) {
            throw new IllegalArgumentException(string + " (" + bigInteger + ") must be > 0");
        }
        return bigInteger;
    }

    static int b(String string, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException(string + " (" + n2 + ") must be >= 0");
        }
        return n2;
    }

    static long b(String string, long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException(string + " (" + l2 + ") must be >= 0");
        }
        return l2;
    }

    static BigInteger b(String string, BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException(string + " (" + bigInteger + ") must be >= 0");
        }
        return bigInteger;
    }

    static double a(String string, double d2) {
        if (!(d2 >= 0.0)) {
            throw new IllegalArgumentException(string + " (" + d2 + ") must be >= 0");
        }
        return d2;
    }

    static void a(boolean bl2) {
        if (!bl2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void b(boolean bl2) {
        if (!bl2) {
            throw new ArithmeticException("not in range");
        }
    }

    static void c(boolean bl2) {
        if (!bl2) {
            throw new ArithmeticException("overflow");
        }
    }

    private k() {
    }
}

