/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import org.apache.commons.a.a;
import org.apache.commons.a.b;
import org.apache.commons.a.f;
import org.apache.commons.a.h;

public class k
implements a,
b {
    private static final char[] a = new char[0];
    private static final byte[] b = new byte[0];
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 4;
    private static final int f = 8;
    private static final int g = 16;
    private static final int h = 32;
    private static final int i = 64;
    private static final int j = 128;
    private static final int[] k = new int[]{1, 2, 4, 8, 16, 32, 64, 128};

    @Override
    public byte[] b(byte[] arrby) {
        return org.apache.commons.a.a.k.d(arrby);
    }

    @Override
    public Object b(Object object) {
        if (!(object instanceof byte[])) {
            throw new h("argument not a byte array");
        }
        return org.apache.commons.a.a.k.e((byte[])object);
    }

    @Override
    public Object a(Object object) {
        if (object == null) {
            return b;
        }
        if (object instanceof byte[]) {
            return org.apache.commons.a.a.k.c((byte[])object);
        }
        if (object instanceof char[]) {
            return org.apache.commons.a.a.k.a((char[])object);
        }
        if (object instanceof String) {
            return org.apache.commons.a.a.k.a(((String)object).toCharArray());
        }
        throw new f("argument not a byte array");
    }

    @Override
    public byte[] a(byte[] arrby) {
        return org.apache.commons.a.a.k.c(arrby);
    }

    public byte[] a(String string) {
        if (string == null) {
            return b;
        }
        return org.apache.commons.a.a.k.a(string.toCharArray());
    }

    public static byte[] a(char[] arrc) {
        if (arrc == null || arrc.length == 0) {
            return b;
        }
        byte[] arrby = new byte[arrc.length >> 3];
        int n2 = 0;
        int n3 = arrc.length - 1;
        while (n2 < arrby.length) {
            for (int i2 = 0; i2 < k.length; ++i2) {
                if (arrc[n3 - i2] != '1') continue;
                int n4 = n2;
                arrby[n4] = (byte)(arrby[n4] | k[i2]);
            }
            ++n2;
            n3 -= 8;
        }
        return arrby;
    }

    public static byte[] c(byte[] arrby) {
        if (org.apache.commons.a.a.k.g(arrby)) {
            return b;
        }
        byte[] arrby2 = new byte[arrby.length >> 3];
        int n2 = 0;
        int n3 = arrby.length - 1;
        while (n2 < arrby2.length) {
            for (int i2 = 0; i2 < k.length; ++i2) {
                if (arrby[n3 - i2] != 49) continue;
                int n4 = n2;
                arrby2[n4] = (byte)(arrby2[n4] | k[i2]);
            }
            ++n2;
            n3 -= 8;
        }
        return arrby2;
    }

    private static boolean g(byte[] arrby) {
        return arrby == null || arrby.length == 0;
    }

    public static byte[] d(byte[] arrby) {
        if (org.apache.commons.a.a.k.g(arrby)) {
            return b;
        }
        byte[] arrby2 = new byte[arrby.length << 3];
        int n2 = 0;
        int n3 = arrby2.length - 1;
        while (n2 < arrby.length) {
            for (int i2 = 0; i2 < k.length; ++i2) {
                arrby2[n3 - i2] = (arrby[n2] & k[i2]) == 0 ? 48 : 49;
            }
            ++n2;
            n3 -= 8;
        }
        return arrby2;
    }

    public static char[] e(byte[] arrby) {
        if (org.apache.commons.a.a.k.g(arrby)) {
            return a;
        }
        char[] arrc = new char[arrby.length << 3];
        int n2 = 0;
        int n3 = arrc.length - 1;
        while (n2 < arrby.length) {
            for (int i2 = 0; i2 < k.length; ++i2) {
                arrc[n3 - i2] = (arrby[n2] & k[i2]) == 0 ? 48 : 49;
            }
            ++n2;
            n3 -= 8;
        }
        return arrc;
    }

    public static String f(byte[] arrby) {
        return new String(org.apache.commons.a.a.k.e(arrby));
    }
}

