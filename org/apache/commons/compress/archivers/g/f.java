/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.g;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.g.g;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;

public class f {
    private static final int c = 255;
    static final am a = an.a(null);
    static final am b = new g();

    private f() {
    }

    public static long a(byte[] arrby, int n2, int n3) {
        int n4;
        long l2 = 0L;
        int n5 = n2 + n3;
        if (n3 < 2) {
            throw new IllegalArgumentException("Length " + n3 + " must be at least 2");
        }
        if (arrby[n4] == 0) {
            return 0L;
        }
        for (n4 = n2; n4 < n5 && arrby[n4] == 32; ++n4) {
        }
        byte by2 = arrby[n5 - 1];
        while (n4 < n5 && (by2 == 0 || by2 == 32)) {
            by2 = arrby[--n5 - 1];
        }
        while (n4 < n5) {
            byte by3 = arrby[n4];
            if (by3 < 48 || by3 > 55) {
                throw new IllegalArgumentException(f.a(arrby, n2, n3, n4, by3));
            }
            l2 = (l2 << 3) + (long)(by3 - 48);
            ++n4;
        }
        return l2;
    }

    public static long b(byte[] arrby, int n2, int n3) {
        boolean bl2;
        if ((arrby[n2] & 0x80) == 0) {
            return f.a(arrby, n2, n3);
        }
        boolean bl3 = bl2 = arrby[n2] == -1;
        if (n3 < 9) {
            return f.a(arrby, n2, n3, bl2);
        }
        return f.b(arrby, n2, n3, bl2);
    }

    private static long a(byte[] arrby, int n2, int n3, boolean bl2) {
        if (n3 >= 9) {
            throw new IllegalArgumentException("At offset " + n2 + ", " + n3 + " byte binary number" + " exceeds maximum signed long" + " value");
        }
        long l2 = 0L;
        for (int i2 = 1; i2 < n3; ++i2) {
            l2 = (l2 << 8) + (long)(arrby[n2 + i2] & 0xFF);
        }
        if (bl2) {
            --l2;
            l2 ^= (long)Math.pow(2.0, (n3 - 1) * 8) - 1L;
        }
        return bl2 ? -l2 : l2;
    }

    private static long b(byte[] arrby, int n2, int n3, boolean bl2) {
        byte[] arrby2 = new byte[n3 - 1];
        System.arraycopy(arrby, n2 + 1, arrby2, 0, n3 - 1);
        BigInteger bigInteger = new BigInteger(arrby2);
        if (bl2) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + n2 + ", " + n3 + " byte binary number" + " exceeds maximum signed long" + " value");
        }
        return bl2 ? -bigInteger.longValue() : bigInteger.longValue();
    }

    public static boolean a(byte[] arrby, int n2) {
        return arrby[n2] == 1;
    }

    private static String a(byte[] arrby, int n2, int n3, int n4, byte by2) {
        String string = new String(arrby, n2, n3);
        string = string.replaceAll("\u0000", "{NUL}");
        String string2 = "Invalid byte " + by2 + " at offset " + (n4 - n2) + " in '" + string + "' len=" + n3;
        return string2;
    }

    public static String c(byte[] arrby, int n2, int n3) {
        try {
            return f.a(arrby, n2, n3, a);
        }
        catch (IOException iOException) {
            try {
                return f.a(arrby, n2, n3, b);
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public static String a(byte[] arrby, int n2, int n3, am am2) {
        int n4;
        for (n4 = n3; n4 > 0 && arrby[n2 + n4 - 1] == 0; --n4) {
        }
        if (n4 > 0) {
            byte[] arrby2 = new byte[n4];
            System.arraycopy(arrby, n2, arrby2, 0, n4);
            return am2.a(arrby2);
        }
        return "";
    }

    public static int a(String string, byte[] arrby, int n2, int n3) {
        try {
            return f.a(string, arrby, n2, n3, a);
        }
        catch (IOException iOException) {
            try {
                return f.a(string, arrby, n2, n3, b);
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public static int a(String string, byte[] arrby, int n2, int n3, am am2) {
        int n4 = string.length();
        ByteBuffer byteBuffer = am2.b(string);
        while (byteBuffer.limit() > n3 && n4 > 0) {
            byteBuffer = am2.b(string.substring(0, --n4));
        }
        int n5 = byteBuffer.limit() - byteBuffer.position();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), arrby, n2, n5);
        for (int i2 = n5; i2 < n3; ++i2) {
            arrby[n2 + i2] = 0;
        }
        return n2 + n3;
    }

    public static void a(long l2, byte[] arrby, int n2, int n3) {
        int n4 = n3;
        --n4;
        if (l2 == 0L) {
            arrby[n2 + n4--] = 48;
        } else {
            long l3;
            for (l3 = l2; n4 >= 0 && l3 != 0L; l3 >>>= 3, --n4) {
                arrby[n2 + n4] = (byte)(48 + (byte)(l3 & 7L));
            }
            if (l3 != 0L) {
                throw new IllegalArgumentException(l2 + "=" + Long.toOctalString(l2) + " will not fit in octal number buffer of length " + n3);
            }
        }
        while (n4 >= 0) {
            arrby[n2 + n4] = 48;
            --n4;
        }
    }

    public static int b(long l2, byte[] arrby, int n2, int n3) {
        int n4 = n3 - 2;
        f.a(l2, arrby, n2, n4);
        arrby[n2 + n4++] = 32;
        arrby[n2 + n4] = 0;
        return n2 + n3;
    }

    public static int c(long l2, byte[] arrby, int n2, int n3) {
        int n4 = n3 - 1;
        f.a(l2, arrby, n2, n4);
        arrby[n2 + n4] = 32;
        return n2 + n3;
    }

    public static int d(long l2, byte[] arrby, int n2, int n3) {
        boolean bl2;
        long l3 = n3 == 8 ? 0x1FFFFFL : 0x1FFFFFFFFL;
        boolean bl3 = bl2 = l2 < 0L;
        if (!bl2 && l2 <= l3) {
            return f.c(l2, arrby, n2, n3);
        }
        if (n3 < 9) {
            f.a(l2, arrby, n2, n3, bl2);
        }
        f.b(l2, arrby, n2, n3, bl2);
        arrby[n2] = (byte)(bl2 ? 255 : 128);
        return n2 + n3;
    }

    private static void a(long l2, byte[] arrby, int n2, int n3, boolean bl2) {
        int n4 = (n3 - 1) * 8;
        long l3 = 1L << n4;
        long l4 = Math.abs(l2);
        if (l4 >= l3) {
            throw new IllegalArgumentException("Value " + l2 + " is too large for " + n3 + " byte field.");
        }
        if (bl2) {
            l4 ^= l3 - 1L;
            l4 |= (long)(255 << n4);
            ++l4;
        }
        for (int i2 = n2 + n3 - 1; i2 >= n2; --i2) {
            arrby[i2] = (byte)l4;
            l4 >>= 8;
        }
    }

    private static void b(long l2, byte[] arrby, int n2, int n3, boolean bl2) {
        BigInteger bigInteger = BigInteger.valueOf(l2);
        byte[] arrby2 = bigInteger.toByteArray();
        int n4 = arrby2.length;
        int n5 = n2 + n3 - n4;
        System.arraycopy(arrby2, 0, arrby, n5, n4);
        byte by2 = (byte)(bl2 ? 255 : 0);
        for (int i2 = n2 + 1; i2 < n5; ++i2) {
            arrby[i2] = by2;
        }
    }

    public static int e(long l2, byte[] arrby, int n2, int n3) {
        int n4 = n3 - 2;
        f.a(l2, arrby, n2, n4);
        arrby[n2 + n4++] = 0;
        arrby[n2 + n4] = 32;
        return n2 + n3;
    }

    public static long a(byte[] arrby) {
        long l2 = 0L;
        for (byte by2 : arrby) {
            l2 += (long)(0xFF & by2);
        }
        return l2;
    }

    public static boolean b(byte[] arrby) {
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int n2 = 0;
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n3 = arrby[i2];
            if (148 <= i2 && i2 < 156) {
                if (48 <= n3 && n3 <= 55 && n2++ < 6) {
                    l2 = l2 * 8L + (long)n3 - 48L;
                } else if (n2 > 0) {
                    n2 = 6;
                }
                n3 = 32;
            }
            l3 += (long)(0xFF & n3);
            l4 += (long)n3;
        }
        return l2 == l3 || l2 == l4 || l2 > l3;
    }
}

