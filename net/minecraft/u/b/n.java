/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import java.util.Random;
import java.util.UUID;
import net.minecraft.u.b.t;

public class n {
    public static final float a;
    private static final float[] b;
    private static final Random c;
    private static final int[] d;
    private static final double e;
    private static final double[] f;
    private static final double[] g;

    static {
        int n2;
        a = n.c(2.0f);
        b = new float[65536];
        c = new Random();
        for (n2 = 0; n2 < 65536; ++n2) {
            n.b[n2] = (float)Math.sin((double)n2 * Math.PI * 2.0 / 65536.0);
        }
        int[] arrn = new int[32];
        arrn[1] = 1;
        arrn[2] = 28;
        arrn[3] = 2;
        arrn[4] = 29;
        arrn[5] = 14;
        arrn[6] = 24;
        arrn[7] = 3;
        arrn[8] = 30;
        arrn[9] = 22;
        arrn[10] = 20;
        arrn[11] = 15;
        arrn[12] = 25;
        arrn[13] = 17;
        arrn[14] = 4;
        arrn[15] = 8;
        arrn[16] = 31;
        arrn[17] = 27;
        arrn[18] = 13;
        arrn[19] = 23;
        arrn[20] = 21;
        arrn[21] = 19;
        arrn[22] = 16;
        arrn[23] = 7;
        arrn[24] = 26;
        arrn[25] = 12;
        arrn[26] = 18;
        arrn[27] = 6;
        arrn[28] = 11;
        arrn[29] = 5;
        arrn[30] = 10;
        arrn[31] = 9;
        d = arrn;
        e = Double.longBitsToDouble(4805340802404319232L);
        f = new double[257];
        g = new double[257];
        for (n2 = 0; n2 < 257; ++n2) {
            double d2 = (double)n2 / 256.0;
            double d3 = Math.asin(d2);
            n.g[n2] = Math.cos(d3);
            n.f[n2] = d3;
        }
    }

    public static float a(float f2) {
        return b[(int)(f2 * 10430.378f) & 0xFFFF];
    }

    public static float b(float f2) {
        return b[(int)(f2 * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static float c(float f2) {
        return (float)Math.sqrt(f2);
    }

    public static float a(double d2) {
        return (float)Math.sqrt(d2);
    }

    public static int d(float f2) {
        int n2 = (int)f2;
        return f2 < (float)n2 ? n2 - 1 : n2;
    }

    public static int b(double d2) {
        return (int)(d2 + 1024.0) - 1024;
    }

    public static int c(double d2) {
        int n2 = (int)d2;
        return d2 < (double)n2 ? n2 - 1 : n2;
    }

    public static long d(double d2) {
        long l2 = (long)d2;
        return d2 < (double)l2 ? l2 - 1L : l2;
    }

    public static int e(double d2) {
        return (int)(d2 >= 0.0 ? d2 : -d2 + 1.0);
    }

    public static float e(float f2) {
        return f2 >= 0.0f ? f2 : -f2;
    }

    public static int a(int n2) {
        return n2 >= 0 ? n2 : -n2;
    }

    public static int f(float f2) {
        int n2 = (int)f2;
        return f2 > (float)n2 ? n2 + 1 : n2;
    }

    public static int f(double d2) {
        int n2 = (int)d2;
        return d2 > (double)n2 ? n2 + 1 : n2;
    }

    public static int a(int n2, int n3, int n4) {
        return n2 < n3 ? n3 : (n2 > n4 ? n4 : n2);
    }

    public static float a(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : (f2 > f4 ? f4 : f2);
    }

    public static double a(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : (d2 > d4 ? d4 : d2);
    }

    public static double b(double d2, double d3, double d4) {
        return d4 < 0.0 ? d2 : (d4 > 1.0 ? d3 : d2 + (d3 - d2) * d4);
    }

    public static double a(double d2, double d3) {
        if (d2 < 0.0) {
            d2 = -d2;
        }
        if (d3 < 0.0) {
            d3 = -d3;
        }
        return d2 > d3 ? d2 : d3;
    }

    public static int a(int n2, int n3) {
        return n2 < 0 ? -((-n2 - 1) / n3) - 1 : n2 / n3;
    }

    public static int a(Random random, int n2, int n3) {
        return n2 >= n3 ? n2 : random.nextInt(n3 - n2 + 1) + n2;
    }

    public static float a(Random random, float f2, float f3) {
        return f2 >= f3 ? f2 : random.nextFloat() * (f3 - f2) + f2;
    }

    public static double a(Random random, double d2, double d3) {
        return d2 >= d3 ? d2 : random.nextDouble() * (d3 - d2) + d2;
    }

    public static double a(long[] arrl) {
        long l2 = 0L;
        long[] arrl2 = arrl;
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l3 = arrl2[i2];
            l2 += l3;
        }
        return (double)l2 / (double)arrl.length;
    }

    public static boolean a(float f2, float f3) {
        return n.e(f3 - f2) < 1.0E-5f;
    }

    public static int b(int n2, int n3) {
        return (n2 % n3 + n3) % n3;
    }

    public static float b(float f2, float f3) {
        return (f2 % f3 + f3) % f3;
    }

    public static float g(float f2) {
        if ((f2 %= 360.0f) >= 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    public static double g(double d2) {
        if ((d2 %= 360.0) >= 180.0) {
            d2 -= 360.0;
        }
        if (d2 < -180.0) {
            d2 += 360.0;
        }
        return d2;
    }

    public static int b(int n2) {
        if ((n2 %= 360) >= 180) {
            n2 -= 360;
        }
        if (n2 < -180) {
            n2 += 360;
        }
        return n2;
    }

    public static int a(String string, int n2) {
        try {
            return Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            return n2;
        }
    }

    public static int a(String string, int n2, int n3) {
        return Math.max(n3, n.a(string, n2));
    }

    public static double a(String string, double d2) {
        try {
            return Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            return d2;
        }
    }

    public static double a(String string, double d2, double d3) {
        return Math.max(d3, n.a(string, d2));
    }

    public static int c(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >> 1;
        n3 |= n3 >> 2;
        n3 |= n3 >> 4;
        n3 |= n3 >> 8;
        n3 |= n3 >> 16;
        return n3 + 1;
    }

    private static boolean g(int n2) {
        return n2 != 0 && (n2 & n2 - 1) == 0;
    }

    public static int d(int n2) {
        n2 = n.g(n2) ? n2 : n.c(n2);
        return d[(int)((long)n2 * 125613361L >> 27) & 0x1F];
    }

    public static int e(int n2) {
        return n.d(n2) - (n.g(n2) ? 0 : 1);
    }

    public static int c(int n2, int n3) {
        int n4;
        if (n3 == 0) {
            return 0;
        }
        if (n2 == 0) {
            return n3;
        }
        if (n2 < 0) {
            n3 *= -1;
        }
        return (n4 = n2 % n3) == 0 ? n2 : n2 + n3 - n4;
    }

    public static int b(float f2, float f3, float f4) {
        return n.b(n.d(f2 * 255.0f), n.d(f3 * 255.0f), n.d(f4 * 255.0f));
    }

    public static int b(int n2, int n3, int n4) {
        int n5 = (n2 << 8) + n3;
        n5 = (n5 << 8) + n4;
        return n5;
    }

    public static int d(int n2, int n3) {
        int n4 = (n2 & 0xFF0000) >> 16;
        int n5 = (n3 & 0xFF0000) >> 16;
        int n6 = (n2 & 0xFF00) >> 8;
        int n7 = (n3 & 0xFF00) >> 8;
        int n8 = (n2 & 0xFF) >> 0;
        int n9 = (n3 & 0xFF) >> 0;
        int n10 = (int)((float)n4 * (float)n5 / 255.0f);
        int n11 = (int)((float)n6 * (float)n7 / 255.0f);
        int n12 = (int)((float)n8 * (float)n9 / 255.0f);
        return n2 & 0xFF000000 | n10 << 16 | n11 << 8 | n12;
    }

    public static double h(double d2) {
        return d2 - Math.floor(d2);
    }

    public static long a(t t2) {
        return n.c(t2.cy_(), t2.k(), t2.l());
    }

    public static long c(int n2, int n3, int n4) {
        long l2 = (long)(n2 * 3129871) ^ (long)n4 * 116129781L ^ (long)n3;
        l2 = l2 * l2 * 42317861L + l2 * 11L;
        return l2;
    }

    public static UUID a(Random random) {
        long l2 = random.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l3 = random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l2, l3);
    }

    public static UUID a() {
        return n.a(c);
    }

    public static double c(double d2, double d3, double d4) {
        return (d2 - d3) / (d4 - d3);
    }

    public static double b(double d2, double d3) {
        double d4;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        double d5 = d3 * d3 + d2 * d2;
        if (Double.isNaN(d5)) {
            return Double.NaN;
        }
        boolean bl5 = bl4 = d2 < 0.0;
        if (bl4) {
            d2 = -d2;
        }
        boolean bl6 = bl3 = d3 < 0.0;
        if (bl3) {
            d3 = -d3;
        }
        boolean bl7 = bl2 = d2 > d3;
        if (bl2) {
            d4 = d3;
            d3 = d2;
            d2 = d4;
        }
        d4 = n.i(d5);
        double d6 = e + (d2 *= d4);
        int n2 = (int)Double.doubleToRawLongBits(d6);
        double d7 = f[n2];
        double d8 = g[n2];
        double d9 = d6 - e;
        double d10 = d2 * d8 - (d3 *= d4) * d9;
        double d11 = (6.0 + d10 * d10) * d10 * 0.16666666666666666;
        double d12 = d7 + d11;
        if (bl2) {
            d12 = 1.5707963267948966 - d12;
        }
        if (bl3) {
            d12 = Math.PI - d12;
        }
        if (bl4) {
            d12 = -d12;
        }
        return d12;
    }

    public static double i(double d2) {
        double d3 = 0.5 * d2;
        long l2 = Double.doubleToRawLongBits(d2);
        l2 = 6910469410427058090L - (l2 >> 1);
        d2 = Double.longBitsToDouble(l2);
        d2 *= 1.5 - d3 * d2 * d2;
        return d2;
    }

    public static int c(float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        int n2 = (int)(f2 * 6.0f) % 6;
        float f8 = f2 * 6.0f - (float)n2;
        float f9 = f4 * (1.0f - f3);
        float f10 = f4 * (1.0f - f8 * f3);
        float f11 = f4 * (1.0f - (1.0f - f8) * f3);
        switch (n2) {
            case 0: {
                f7 = f4;
                f6 = f11;
                f5 = f9;
                break;
            }
            case 1: {
                f7 = f10;
                f6 = f4;
                f5 = f9;
                break;
            }
            case 2: {
                f7 = f9;
                f6 = f4;
                f5 = f11;
                break;
            }
            case 3: {
                f7 = f9;
                f6 = f10;
                f5 = f4;
                break;
            }
            case 4: {
                f7 = f11;
                f6 = f9;
                f5 = f4;
                break;
            }
            case 5: {
                f7 = f4;
                f6 = f9;
                f5 = f10;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + f2 + ", " + f3 + ", " + f4);
            }
        }
        int n3 = n.a((int)(f7 * 255.0f), 0, 255);
        int n4 = n.a((int)(f6 * 255.0f), 0, 255);
        int n5 = n.a((int)(f5 * 255.0f), 0, 255);
        return n3 << 16 | n4 << 8 | n5;
    }

    public static int f(int n2) {
        n2 ^= n2 >>> 16;
        n2 *= -2048144789;
        n2 ^= n2 >>> 13;
        n2 *= -1028477387;
        n2 ^= n2 >>> 16;
        return n2;
    }
}

