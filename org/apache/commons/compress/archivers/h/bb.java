/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.h.a;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.archivers.h.ay;
import org.apache.commons.compress.archivers.h.az;
import org.apache.commons.compress.archivers.h.o;
import org.apache.commons.compress.archivers.h.p;
import org.apache.commons.compress.archivers.h.u;
import org.apache.commons.compress.archivers.h.v;

public abstract class bb {
    private static final byte[] a = ay.a(8448L);

    public static ay a(Date date) {
        return new ay(bb.a(date.getTime()));
    }

    public static byte[] a(long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l2);
        int n2 = calendar.get(1);
        if (n2 < 1980) {
            return bb.b(a);
        }
        int n3 = calendar.get(2) + 1;
        long l3 = n2 - 1980 << 25 | n3 << 21 | calendar.get(5) << 16 | calendar.get(11) << 11 | calendar.get(12) << 5 | calendar.get(13) >> 1;
        return ay.a(l3);
    }

    public static long a(int n2) {
        if (n2 < 0) {
            return 0x100000000L + (long)n2;
        }
        return n2;
    }

    public static byte[] a(byte[] arrby) {
        int n2 = arrby.length - 1;
        for (int i2 = 0; i2 < arrby.length / 2; ++i2) {
            byte by2 = arrby[i2];
            arrby[i2] = arrby[n2 - i2];
            arrby[n2 - i2] = by2;
        }
        return arrby;
    }

    static long a(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new NumberFormatException("The BigInteger cannot fit inside a 64 bit java long: [" + bigInteger + "]");
    }

    static BigInteger b(long l2) {
        if (l2 < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Negative longs < -2^31 not permitted: [" + l2 + "]");
        }
        if (l2 < 0L && l2 >= Integer.MIN_VALUE) {
            l2 = bb.a((int)l2);
        }
        return BigInteger.valueOf(l2);
    }

    public static int a(byte by2) {
        if (by2 >= 0) {
            return by2;
        }
        return 256 + by2;
    }

    public static byte b(int n2) {
        if (n2 > 255 || n2 < 0) {
            throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + n2 + "]");
        }
        if (n2 < 128) {
            return (byte)n2;
        }
        return (byte)(n2 - 256);
    }

    public static Date a(ay ay2) {
        long l2 = ay2.b();
        return new Date(bb.c(l2));
    }

    public static long c(long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, (int)(l2 >> 25 & 0x7FL) + 1980);
        calendar.set(2, (int)(l2 >> 21 & 0xFL) - 1);
        calendar.set(5, (int)(l2 >> 16) & 0x1F);
        calendar.set(11, (int)(l2 >> 11) & 0x1F);
        calendar.set(12, (int)(l2 >> 5) & 0x3F);
        calendar.set(13, (int)(l2 << 1) & 0x3E);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    static void a(ab ab2, byte[] arrby, byte[] arrby2) {
        o o2;
        String string;
        p p2 = (p)ab2.b(p.a);
        String string2 = ab2.getName();
        String string3 = bb.a(p2, arrby);
        if (string3 != null && !string2.equals(string3)) {
            ab2.a(string3);
        }
        if (arrby2 != null && arrby2.length > 0 && (string = bb.a(o2 = (o)ab2.b(o.a), arrby2)) != null) {
            ab2.setComment(string);
        }
    }

    private static String a(a a2, byte[] arrby) {
        if (a2 != null) {
            CRC32 cRC32 = new CRC32();
            cRC32.update(arrby);
            long l2 = cRC32.getValue();
            if (l2 == a2.a()) {
                try {
                    return an.b.a(a2.b());
                }
                catch (IOException iOException) {
                    return null;
                }
            }
        }
        return null;
    }

    static byte[] b(byte[] arrby) {
        if (arrby != null) {
            byte[] arrby2 = new byte[arrby.length];
            System.arraycopy(arrby, 0, arrby2, 0, arrby2.length);
            return arrby2;
        }
        return null;
    }

    static boolean a(ab ab2) {
        return bb.c(ab2) && bb.d(ab2);
    }

    private static boolean c(ab ab2) {
        return !ab2.p().c();
    }

    private static boolean d(ab ab2) {
        return ab2.getMethod() == 0 || ab2.getMethod() == az.b.a() || ab2.getMethod() == az.g.a() || ab2.getMethod() == 8;
    }

    static void b(ab ab2) {
        if (!bb.c(ab2)) {
            throw new u(v.a, ab2);
        }
        if (!bb.d(ab2)) {
            az az2 = az.a(ab2.getMethod());
            if (az2 == null) {
                throw new u(v.b, ab2);
            }
            throw new u(az2, ab2);
        }
    }
}

