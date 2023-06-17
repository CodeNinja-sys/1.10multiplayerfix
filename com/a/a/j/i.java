/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import com.a.a.b.cl;
import com.a.a.j.g;
import com.a.a.j.k;
import java.math.RoundingMode;

public final class i {
    static final long a = -5402926248376769404L;
    static final byte[] b = new byte[]{19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    static final long[] c = new long[]{1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    static final long[] d = new long[]{3L, 31L, 316L, 3162L, 31622L, 316227L, 3162277L, 31622776L, 316227766L, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long e = 3037000499L;
    static final long[] f = new long[]{1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] g = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    static final int[] h = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    public static boolean a(long l2) {
        return l2 > 0L & (l2 & l2 - 1L) == 0L;
    }

    static int a(long l2, long l3) {
        return (int)((l2 - l3 ^ 0xFFFFFFFFFFFFFFFFL ^ 0xFFFFFFFFFFFFFFFFL) >>> 63);
    }

    public static int a(long l2, RoundingMode roundingMode) {
        k.a("x", l2);
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(i.a(l2));
            }
            case DOWN: 
            case FLOOR: {
                return 63 - Long.numberOfLeadingZeros(l2);
            }
            case UP: 
            case CEILING: {
                return 64 - Long.numberOfLeadingZeros(l2 - 1L);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n2 = Long.numberOfLeadingZeros(l2);
                long l3 = -5402926248376769404L >>> n2;
                int n3 = 63 - n2;
                return n3 + i.a(l3, l2);
            }
        }
        throw new AssertionError((Object)"impossible");
    }

    public static int b(long l2, RoundingMode roundingMode) {
        k.a("x", l2);
        int n2 = i.b(l2);
        long l3 = c[n2];
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(l2 == l3);
            }
            case DOWN: 
            case FLOOR: {
                return n2;
            }
            case UP: 
            case CEILING: {
                return n2 + i.a(l3, l2);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                return n2 + i.a(d[n2], l2);
            }
        }
        throw new AssertionError();
    }

    static int b(long l2) {
        byte by2 = b[Long.numberOfLeadingZeros(l2)];
        return by2 - i.a(l2, c[by2]);
    }

    public static long a(long l2, int n2) {
        k.b("exponent", n2);
        if (-2L <= l2 && l2 <= 2L) {
            switch ((int)l2) {
                case 0: {
                    return n2 == 0 ? 1L : 0L;
                }
                case 1: {
                    return 1L;
                }
                case -1: {
                    return (n2 & 1) == 0 ? 1L : -1L;
                }
                case 2: {
                    return n2 < 64 ? 1L << n2 : 0L;
                }
                case -2: {
                    if (n2 < 64) {
                        return (n2 & 1) == 0 ? 1L << n2 : -(1L << n2);
                    }
                    return 0L;
                }
            }
            throw new AssertionError();
        }
        long l3 = 1L;
        while (true) {
            switch (n2) {
                case 0: {
                    return l3;
                }
                case 1: {
                    return l3 * l2;
                }
            }
            l3 *= (n2 & 1) == 0 ? 1L : l2;
            l2 *= l2;
            n2 >>= 1;
        }
    }

    public static long c(long l2, RoundingMode roundingMode) {
        k.b("x", l2);
        if (i.c(l2)) {
            return com.a.a.j.g.c((int)l2, roundingMode);
        }
        long l3 = (long)Math.sqrt(l2);
        long l4 = l3 * l3;
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(l4 == l2);
                return l3;
            }
            case DOWN: 
            case FLOOR: {
                if (l2 < l4) {
                    return l3 - 1L;
                }
                return l3;
            }
            case UP: 
            case CEILING: {
                if (l2 > l4) {
                    return l3 + 1L;
                }
                return l3;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                long l5 = l3 - (long)(l2 < l4 ? 1 : 0);
                long l6 = l5 * l5 + l5;
                return l5 + (long)i.a(l6, l2);
            }
        }
        throw new AssertionError();
    }

    public static long a(long l2, long l3, RoundingMode roundingMode) {
        boolean bl2;
        cl.a((Object)roundingMode);
        long l4 = l2 / l3;
        long l5 = l2 - l3 * l4;
        if (l5 == 0L) {
            return l4;
        }
        int n2 = 1 | (int)((l2 ^ l3) >> 63);
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(l5 == 0L);
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
                bl2 = n2 > 0;
                break;
            }
            case FLOOR: {
                bl2 = n2 < 0;
                break;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                long l6 = Math.abs(l5);
                long l7 = l6 - (Math.abs(l3) - l6);
                if (l7 == 0L) {
                    bl2 = roundingMode == RoundingMode.HALF_UP | roundingMode == RoundingMode.HALF_EVEN & (l4 & 1L) != 0L;
                    break;
                }
                bl2 = l7 > 0L;
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        return bl2 ? l4 + (long)n2 : l4;
    }

    public static int b(long l2, int n2) {
        return (int)i.b(l2, (long)n2);
    }

    public static long b(long l2, long l3) {
        if (l3 <= 0L) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long l4 = l2 % l3;
        return l4 >= 0L ? l4 : l4 + l3;
    }

    public static long c(long l2, long l3) {
        k.b("a", l2);
        k.b("b", l3);
        if (l2 == 0L) {
            return l3;
        }
        if (l3 == 0L) {
            return l2;
        }
        int n2 = Long.numberOfTrailingZeros(l2);
        l2 >>= n2;
        int n3 = Long.numberOfTrailingZeros(l3);
        l3 >>= n3;
        while (l2 != l3) {
            long l4 = l2 - l3;
            long l5 = l4 & l4 >> 63;
            l2 = l4 - l5 - l5;
            l3 += l5;
            l2 >>= Long.numberOfTrailingZeros(l2);
        }
        return l2 << Math.min(n2, n3);
    }

    public static long d(long l2, long l3) {
        long l4 = l2 + l3;
        k.c((l2 ^ l3) < 0L | (l2 ^ l4) >= 0L);
        return l4;
    }

    public static long e(long l2, long l3) {
        long l4 = l2 - l3;
        k.c((l2 ^ l3) >= 0L | (l2 ^ l4) >= 0L);
        return l4;
    }

    public static long f(long l2, long l3) {
        int n2 = Long.numberOfLeadingZeros(l2) + Long.numberOfLeadingZeros(l2 ^ 0xFFFFFFFFFFFFFFFFL) + Long.numberOfLeadingZeros(l3) + Long.numberOfLeadingZeros(l3 ^ 0xFFFFFFFFFFFFFFFFL);
        if (n2 > 65) {
            return l2 * l3;
        }
        k.c(n2 >= 64);
        k.c(l2 >= 0L | l3 != Long.MIN_VALUE);
        long l4 = l2 * l3;
        k.c(l2 == 0L || l4 / l2 == l3);
        return l4;
    }

    public static long c(long l2, int n2) {
        k.b("exponent", n2);
        if (l2 >= -2L & l2 <= 2L) {
            switch ((int)l2) {
                case 0: {
                    return n2 == 0 ? 1L : 0L;
                }
                case 1: {
                    return 1L;
                }
                case -1: {
                    return (n2 & 1) == 0 ? 1L : -1L;
                }
                case 2: {
                    k.c(n2 < 63);
                    return 1L << n2;
                }
                case -2: {
                    k.c(n2 < 64);
                    return (n2 & 1) == 0 ? 1L << n2 : -1L << n2;
                }
            }
            throw new AssertionError();
        }
        long l3 = 1L;
        while (true) {
            switch (n2) {
                case 0: {
                    return l3;
                }
                case 1: {
                    return i.f(l3, l2);
                }
            }
            if ((n2 & 1) != 0) {
                l3 = i.f(l3, l2);
            }
            if ((n2 >>= 1) <= 0) continue;
            k.c(l2 <= 3037000499L);
            l2 *= l2;
        }
    }

    public static long a(int n2) {
        k.b("n", n2);
        return n2 < f.length ? f[n2] : Long.MAX_VALUE;
    }

    public static long a(int n2, int n3) {
        k.b("n", n2);
        k.b("k", n3);
        cl.a(n3 <= n2, "k (%s) > n (%s)", new Object[]{n3, n2});
        if (n3 > n2 >> 1) {
            n3 = n2 - n3;
        }
        switch (n3) {
            case 0: {
                return 1L;
            }
            case 1: {
                return n2;
            }
        }
        if (n2 < f.length) {
            return f[n2] / (f[n3] * f[n2 - n3]);
        }
        if (n3 >= g.length || n2 > g[n3]) {
            return Long.MAX_VALUE;
        }
        if (n3 < h.length && n2 <= h[n3]) {
            long l2 = n2--;
            for (int i2 = 2; i2 <= n3; ++i2) {
                l2 *= (long)n2;
                l2 /= (long)i2;
                --n2;
            }
            return l2;
        }
        int n4 = i.a((long)n2, RoundingMode.CEILING);
        long l3 = 1L;
        long l4 = n2--;
        long l5 = 1L;
        int n5 = n4;
        int n6 = 2;
        while (n6 <= n3) {
            if (n5 + n4 < 63) {
                l4 *= (long)n2;
                l5 *= (long)n6;
                n5 += n4;
            } else {
                l3 = i.a(l3, l4, l5);
                l4 = n2;
                l5 = n6;
                n5 = n4;
            }
            ++n6;
            --n2;
        }
        return i.a(l3, l4, l5);
    }

    static long a(long l2, long l3, long l4) {
        if (l2 == 1L) {
            return l3 / l4;
        }
        long l5 = i.c(l2, l4);
        return (l2 /= l5) * (l3 / (l4 /= l5));
    }

    static boolean c(long l2) {
        return (long)((int)l2) == l2;
    }

    public static long g(long l2, long l3) {
        return (l2 & l3) + ((l2 ^ l3) >> 1);
    }

    private i() {
    }
}

