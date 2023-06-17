/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a;

public class g {
    public static final Object a = new Object();
    private static final int b = -1640531527;
    private static final int c = 340573321;
    private static final long d = -7046029254386353131L;
    private static final long e = -1018231460777725123L;

    protected g() {
    }

    public static final int a(int n2) {
        n2 ^= n2 >>> 16;
        n2 *= -2048144789;
        n2 ^= n2 >>> 13;
        n2 *= -1028477387;
        n2 ^= n2 >>> 16;
        return n2;
    }

    public static final long a(long l2) {
        l2 ^= l2 >>> 33;
        l2 *= -49064778989728563L;
        l2 ^= l2 >>> 33;
        l2 *= -4265267296055464877L;
        l2 ^= l2 >>> 33;
        return l2;
    }

    public static final int b(int n2) {
        int n3 = n2 * -1640531527;
        return n3 ^ n3 >>> 16;
    }

    public static final int c(int n2) {
        return (n2 ^ n2 >>> 16) * 340573321;
    }

    public static final long b(long l2) {
        long l3 = l2 * -7046029254386353131L;
        l3 ^= l3 >>> 32;
        return l3 ^ l3 >>> 16;
    }

    public static final long c(long l2) {
        l2 ^= l2 >>> 32;
        l2 ^= l2 >>> 16;
        return (l2 ^ l2 >>> 32) * -1018231460777725123L;
    }

    public static final int a(float f2) {
        return Float.floatToRawIntBits(f2);
    }

    public static final int a(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        return (int)(l2 ^ l2 >>> 32);
    }

    public static final int d(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static int d(int n2) {
        if (n2 == 0) {
            return 1;
        }
        --n2;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        return (n2 | n2 >> 16) + 1;
    }

    public static long e(long l2) {
        if (l2 == 0L) {
            return 1L;
        }
        --l2;
        l2 |= l2 >> 1;
        l2 |= l2 >> 2;
        l2 |= l2 >> 4;
        l2 |= l2 >> 8;
        l2 |= l2 >> 16;
        return (l2 | l2 >> 32) + 1L;
    }

    public static int a(int n2, float f2) {
        return Math.min((int)Math.ceil((float)n2 * f2), n2 - 1);
    }

    public static long a(long l2, float f2) {
        return Math.min((long)Math.ceil((float)l2 * f2), l2 - 1L);
    }

    public static int b(int n2, float f2) {
        long l2 = Math.max(2L, g.e((long)Math.ceil((float)n2 / f2)));
        if (l2 > 0x40000000L) {
            throw new IllegalArgumentException("Too large (" + n2 + " expected elements with load factor " + f2 + ")");
        }
        return (int)l2;
    }

    public static long b(long l2, float f2) {
        return g.e((long)Math.ceil((float)l2 / f2));
    }
}

