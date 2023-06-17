/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import com.a.a.b.cl;
import com.a.a.j.k;
import java.math.RoundingMode;

public final class g {
    static final int a = -1257966797;
    static final byte[] b = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] c = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] d = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    static final int e = 46340;
    private static final int[] g = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] f = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean a(int n2) {
        return n2 > 0 & (n2 & n2 - 1) == 0;
    }

    static int a(int n2, int n3) {
        return ~(~(n2 - n3)) >>> 31;
    }

    public static int a(int n2, RoundingMode roundingMode) {
        k.a("x", n2);
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(com.a.a.j.g.a(n2));
            }
            case DOWN: 
            case FLOOR: {
                return 31 - Integer.numberOfLeadingZeros(n2);
            }
            case UP: 
            case CEILING: {
                return 32 - Integer.numberOfLeadingZeros(n2 - 1);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n3 = Integer.numberOfLeadingZeros(n2);
                int n4 = -1257966797 >>> n3;
                int n5 = 31 - n3;
                return n5 + com.a.a.j.g.a(n4, n2);
            }
        }
        throw new AssertionError();
    }

    public static int b(int n2, RoundingMode roundingMode) {
        k.a("x", n2);
        int n3 = com.a.a.j.g.c(n2);
        int n4 = c[n3];
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(n2 == n4);
            }
            case DOWN: 
            case FLOOR: {
                return n3;
            }
            case UP: 
            case CEILING: {
                return n3 + com.a.a.j.g.a(n4, n2);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                return n3 + com.a.a.j.g.a(d[n3], n2);
            }
        }
        throw new AssertionError();
    }

    private static int c(int n2) {
        byte by2 = b[Integer.numberOfLeadingZeros(n2)];
        return by2 - com.a.a.j.g.a(n2, c[by2]);
    }

    public static int b(int n2, int n3) {
        k.b("exponent", n3);
        switch (n2) {
            case 0: {
                return n3 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            case -1: {
                return (n3 & 1) == 0 ? 1 : -1;
            }
            case 2: {
                return n3 < 32 ? 1 << n3 : 0;
            }
            case -2: {
                if (n3 < 32) {
                    return (n3 & 1) == 0 ? 1 << n3 : -(1 << n3);
                }
                return 0;
            }
        }
        int n4 = 1;
        while (true) {
            switch (n3) {
                case 0: {
                    return n4;
                }
                case 1: {
                    return n2 * n4;
                }
            }
            n4 *= (n3 & 1) == 0 ? 1 : n2;
            n2 *= n2;
            n3 >>= 1;
        }
    }

    public static int c(int n2, RoundingMode roundingMode) {
        k.b("x", n2);
        int n3 = com.a.a.j.g.d(n2);
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(n3 * n3 == n2);
            }
            case DOWN: 
            case FLOOR: {
                return n3;
            }
            case UP: 
            case CEILING: {
                return n3 + com.a.a.j.g.a(n3 * n3, n2);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n4 = n3 * n3 + n3;
                return n3 + com.a.a.j.g.a(n4, n2);
            }
        }
        throw new AssertionError();
    }

    private static int d(int n2) {
        return (int)Math.sqrt(n2);
    }

    public static int a(int n2, int n3, RoundingMode roundingMode) {
        boolean bl2;
        cl.a((Object)roundingMode);
        if (n3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int n4 = n2 / n3;
        int n5 = n2 - n3 * n4;
        if (n5 == 0) {
            return n4;
        }
        int n6 = 1 | (n2 ^ n3) >> 31;
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(n5 == 0);
            }
            case DOWN: {
                bl2 = false;
                break;
            }
            case UP: {
                bl2 = true;
                break;
            }
            case CEILING: {
                bl2 = n6 > 0;
                break;
            }
            case FLOOR: {
                bl2 = n6 < 0;
                break;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n7 = Math.abs(n5);
                int n8 = n7 - (Math.abs(n3) - n7);
                if (n8 == 0) {
                    bl2 = roundingMode == RoundingMode.HALF_UP || roundingMode == RoundingMode.HALF_EVEN & (n4 & 1) != 0;
                    break;
                }
                bl2 = n8 > 0;
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        return bl2 ? n4 + n6 : n4;
    }

    public static int c(int n2, int n3) {
        if (n3 <= 0) {
            throw new ArithmeticException("Modulus " + n3 + " must be > 0");
        }
        int n4 = n2 % n3;
        return n4 >= 0 ? n4 : n4 + n3;
    }

    public static int d(int n2, int n3) {
        k.b("a", n2);
        k.b("b", n3);
        if (n2 == 0) {
            return n3;
        }
        if (n3 == 0) {
            return n2;
        }
        int n4 = Integer.numberOfTrailingZeros(n2);
        n2 >>= n4;
        int n5 = Integer.numberOfTrailingZeros(n3);
        n3 >>= n5;
        while (n2 != n3) {
            int n6 = n2 - n3;
            int n7 = n6 & n6 >> 31;
            n2 = n6 - n7 - n7;
            n3 += n7;
            n2 >>= Integer.numberOfTrailingZeros(n2);
        }
        return n2 << Math.min(n4, n5);
    }

    public static int e(int n2, int n3) {
        long l2 = (long)n2 + (long)n3;
        k.c(l2 == (long)((int)l2));
        return (int)l2;
    }

    public static int f(int n2, int n3) {
        long l2 = (long)n2 - (long)n3;
        k.c(l2 == (long)((int)l2));
        return (int)l2;
    }

    public static int g(int n2, int n3) {
        long l2 = (long)n2 * (long)n3;
        k.c(l2 == (long)((int)l2));
        return (int)l2;
    }

    public static int h(int n2, int n3) {
        k.b("exponent", n3);
        switch (n2) {
            case 0: {
                return n3 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            case -1: {
                return (n3 & 1) == 0 ? 1 : -1;
            }
            case 2: {
                k.c(n3 < 31);
                return 1 << n3;
            }
            case -2: {
                k.c(n3 < 32);
                return (n3 & 1) == 0 ? 1 << n3 : -1 << n3;
            }
        }
        int n4 = 1;
        while (true) {
            switch (n3) {
                case 0: {
                    return n4;
                }
                case 1: {
                    return com.a.a.j.g.g(n4, n2);
                }
            }
            if ((n3 & 1) != 0) {
                n4 = com.a.a.j.g.g(n4, n2);
            }
            if ((n3 >>= 1) <= 0) continue;
            k.c(-46340 <= n2 & n2 <= 46340);
            n2 *= n2;
        }
    }

    public static int b(int n2) {
        k.b("n", n2);
        return n2 < g.length ? g[n2] : Integer.MAX_VALUE;
    }

    public static int i(int n2, int n3) {
        k.b("n", n2);
        k.b("k", n3);
        cl.a(n3 <= n2, "k (%s) > n (%s)", new Object[]{n3, n2});
        if (n3 > n2 >> 1) {
            n3 = n2 - n3;
        }
        if (n3 >= f.length || n2 > f[n3]) {
            return Integer.MAX_VALUE;
        }
        switch (n3) {
            case 0: {
                return 1;
            }
            case 1: {
                return n2;
            }
        }
        long l2 = 1L;
        for (int i2 = 0; i2 < n3; ++i2) {
            l2 *= (long)(n2 - i2);
            l2 /= (long)(i2 + 1);
        }
        return (int)l2;
    }

    public static int j(int n2, int n3) {
        return (n2 & n3) + ((n2 ^ n3) >> 1);
    }

    private g() {
    }
}

