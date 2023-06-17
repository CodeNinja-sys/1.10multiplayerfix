/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import com.a.a.b.cl;
import com.a.a.j.c;
import com.a.a.j.f;
import com.a.a.j.g;
import com.a.a.j.i;
import com.a.a.j.k;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public final class a {
    static final int a = 256;
    static final BigInteger b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double c = Math.log(10.0);
    private static final double d = Math.log(2.0);

    public static boolean a(BigInteger bigInteger) {
        cl.a(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    public static int a(BigInteger bigInteger, RoundingMode roundingMode) {
        k.a("x", (BigInteger)cl.a(bigInteger));
        int n2 = bigInteger.bitLength() - 1;
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(com.a.a.j.a.a(bigInteger));
            }
            case DOWN: 
            case FLOOR: {
                return n2;
            }
            case UP: 
            case CEILING: {
                return com.a.a.j.a.a(bigInteger) ? n2 : n2 + 1;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                if (n2 < 256) {
                    BigInteger bigInteger2 = b.shiftRight(256 - n2);
                    if (bigInteger.compareTo(bigInteger2) <= 0) {
                        return n2;
                    }
                    return n2 + 1;
                }
                BigInteger bigInteger3 = bigInteger.pow(2);
                int n3 = bigInteger3.bitLength() - 1;
                return n3 < 2 * n2 + 1 ? n2 : n2 + 1;
            }
        }
        throw new AssertionError();
    }

    public static int b(BigInteger bigInteger, RoundingMode roundingMode) {
        k.a("x", bigInteger);
        if (com.a.a.j.a.b(bigInteger)) {
            return i.b(bigInteger.longValue(), roundingMode);
        }
        int n2 = (int)((double)com.a.a.j.a.a(bigInteger, RoundingMode.FLOOR) * d / c);
        BigInteger bigInteger2 = BigInteger.TEN.pow(n2);
        int n3 = bigInteger2.compareTo(bigInteger);
        if (n3 > 0) {
            do {
                --n2;
            } while ((n3 = (bigInteger2 = bigInteger2.divide(BigInteger.TEN)).compareTo(bigInteger)) > 0);
        } else {
            BigInteger bigInteger3 = BigInteger.TEN.multiply(bigInteger2);
            int n4 = bigInteger3.compareTo(bigInteger);
            while (n4 <= 0) {
                ++n2;
                bigInteger2 = bigInteger3;
                n3 = n4;
                bigInteger3 = BigInteger.TEN.multiply(bigInteger2);
                n4 = bigInteger3.compareTo(bigInteger);
            }
        }
        int n5 = n2;
        BigInteger bigInteger4 = bigInteger2;
        int n6 = n3;
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(n6 == 0);
            }
            case DOWN: 
            case FLOOR: {
                return n5;
            }
            case UP: 
            case CEILING: {
                return bigInteger4.equals(bigInteger) ? n5 : n5 + 1;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                BigInteger bigInteger5 = bigInteger.pow(2);
                BigInteger bigInteger6 = bigInteger4.pow(2).multiply(BigInteger.TEN);
                return bigInteger5.compareTo(bigInteger6) <= 0 ? n5 : n5 + 1;
            }
        }
        throw new AssertionError();
    }

    public static BigInteger c(BigInteger bigInteger, RoundingMode roundingMode) {
        k.b("x", bigInteger);
        if (com.a.a.j.a.b(bigInteger)) {
            return BigInteger.valueOf(i.c(bigInteger.longValue(), roundingMode));
        }
        BigInteger bigInteger2 = com.a.a.j.a.c(bigInteger);
        switch (roundingMode) {
            case UNNECESSARY: {
                k.a(bigInteger2.pow(2).equals(bigInteger));
            }
            case DOWN: 
            case FLOOR: {
                return bigInteger2;
            }
            case UP: 
            case CEILING: {
                int n2 = bigInteger2.intValue();
                boolean bl2 = n2 * n2 == bigInteger.intValue() && bigInteger2.pow(2).equals(bigInteger);
                return bl2 ? bigInteger2 : bigInteger2.add(BigInteger.ONE);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                BigInteger bigInteger3 = bigInteger2.pow(2).add(bigInteger2);
                return bigInteger3.compareTo(bigInteger) >= 0 ? bigInteger2 : bigInteger2.add(BigInteger.ONE);
            }
        }
        throw new AssertionError();
    }

    private static BigInteger c(BigInteger bigInteger) {
        BigInteger bigInteger2;
        int n2 = com.a.a.j.a.a(bigInteger, RoundingMode.FLOOR);
        if (n2 < 1023) {
            bigInteger2 = com.a.a.j.a.d(bigInteger);
        } else {
            int n3 = n2 - 52 & 0xFFFFFFFE;
            bigInteger2 = com.a.a.j.a.d(bigInteger.shiftRight(n3)).shiftLeft(n3 >> 1);
        }
        BigInteger bigInteger3 = bigInteger2.add(bigInteger.divide(bigInteger2)).shiftRight(1);
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger2;
        }
        while ((bigInteger3 = (bigInteger2 = bigInteger3).add(bigInteger.divide(bigInteger2)).shiftRight(1)).compareTo(bigInteger2) < 0) {
        }
        return bigInteger2;
    }

    private static BigInteger d(BigInteger bigInteger) {
        return com.a.a.j.c.d(Math.sqrt(f.a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        BigDecimal bigDecimal = new BigDecimal(bigInteger);
        BigDecimal bigDecimal2 = new BigDecimal(bigInteger2);
        return bigDecimal.divide(bigDecimal2, 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger a(int n2) {
        k.b("n", n2);
        if (n2 < i.f.length) {
            return BigInteger.valueOf(i.f[n2]);
        }
        int n3 = g.a(n2 * g.a(n2, RoundingMode.CEILING), 64, RoundingMode.CEILING);
        ArrayList<BigInteger> arrayList = new ArrayList<BigInteger>(n3);
        int n4 = i.f.length;
        long l2 = i.f[n4 - 1];
        int n5 = Long.numberOfTrailingZeros(l2);
        int n6 = i.a(l2 >>= n5, RoundingMode.FLOOR) + 1;
        int n7 = i.a((long)n4, RoundingMode.FLOOR) + 1;
        int n8 = 1 << n7 - 1;
        for (long i2 = (long)n4; i2 <= (long)n2; ++i2) {
            if ((i2 & (long)n8) != 0L) {
                n8 <<= 1;
                ++n7;
            }
            int n9 = Long.numberOfTrailingZeros(i2);
            long l3 = i2 >> n9;
            n5 += n9;
            int n10 = n7 - n9;
            if (n10 + n6 >= 64) {
                arrayList.add(BigInteger.valueOf(l2));
                l2 = 1L;
                n6 = 0;
            }
            n6 = i.a(l2 *= l3, RoundingMode.FLOOR) + 1;
        }
        if (l2 > 1L) {
            arrayList.add(BigInteger.valueOf(l2));
        }
        return com.a.a.j.a.a(arrayList).shiftLeft(n5);
    }

    static BigInteger a(List list) {
        return com.a.a.j.a.a(list, 0, list.size());
    }

    static BigInteger a(List list, int n2, int n3) {
        switch (n3 - n2) {
            case 0: {
                return BigInteger.ONE;
            }
            case 1: {
                return (BigInteger)list.get(n2);
            }
            case 2: {
                return ((BigInteger)list.get(n2)).multiply((BigInteger)list.get(n2 + 1));
            }
            case 3: {
                return ((BigInteger)list.get(n2)).multiply((BigInteger)list.get(n2 + 1)).multiply((BigInteger)list.get(n2 + 2));
            }
        }
        int n4 = n3 + n2 >>> 1;
        return com.a.a.j.a.a(list, n2, n4).multiply(com.a.a.j.a.a(list, n4, n3));
    }

    public static BigInteger a(int n2, int n3) {
        int n4;
        k.b("n", n2);
        k.b("k", n3);
        cl.a(n3 <= n2, "k (%s) > n (%s)", new Object[]{n3, n2});
        if (n3 > n2 >> 1) {
            n3 = n2 - n3;
        }
        if (n3 < i.g.length && n2 <= i.g[n3]) {
            return BigInteger.valueOf(i.a(n2, n3));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long l2 = n2;
        long l3 = 1L;
        int n5 = n4 = i.a((long)n2, RoundingMode.CEILING);
        for (int i2 = 1; i2 < n3; ++i2) {
            int n6 = n2 - i2;
            int n7 = i2 + 1;
            if (n5 + n4 >= 63) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(l2)).divide(BigInteger.valueOf(l3));
                l2 = n6;
                l3 = n7;
                n5 = n4;
                continue;
            }
            l2 *= (long)n6;
            l3 *= (long)n7;
            n5 += n4;
        }
        return bigInteger.multiply(BigInteger.valueOf(l2)).divide(BigInteger.valueOf(l3));
    }

    static boolean b(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    private a() {
    }
}

