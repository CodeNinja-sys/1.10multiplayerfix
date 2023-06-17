/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.c;

import java.io.UnsupportedEncodingException;

public class a {
    private a() {
    }

    public static String a(org.apache.commons.compress.archivers.a a2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a2.isDirectory() ? (char)'d' : '-');
        String string = Long.toString(a2.getSize());
        stringBuilder.append(' ');
        for (int i2 = 7; i2 > string.length(); --i2) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(string);
        stringBuilder.append(' ').append(a2.getName());
        return stringBuilder.toString();
    }

    public static boolean a(String string, byte[] arrby, int n2, int n3) {
        byte[] arrby2;
        try {
            arrby2 = string.getBytes("US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
        return a.a(arrby2, 0, arrby2.length, arrby, n2, n3, false);
    }

    public static boolean a(String string, byte[] arrby) {
        return a.a(string, arrby, 0, arrby.length);
    }

    public static byte[] a(String string) {
        try {
            return string.getBytes("US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public static String a(byte[] arrby) {
        try {
            return new String(arrby, "US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public static String a(byte[] arrby, int n2, int n3) {
        try {
            return new String(arrby, n2, n3, "US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public static boolean a(byte[] arrby, int n2, int n3, byte[] arrby2, int n4, int n5, boolean bl2) {
        int n6;
        int n7 = n3 < n5 ? n3 : n5;
        for (n6 = 0; n6 < n7; ++n6) {
            if (arrby[n2 + n6] == arrby2[n4 + n6]) continue;
            return false;
        }
        if (n3 == n5) {
            return true;
        }
        if (bl2) {
            if (n3 > n5) {
                for (n6 = n5; n6 < n3; ++n6) {
                    if (arrby[n2 + n6] == 0) continue;
                    return false;
                }
            } else {
                for (n6 = n3; n6 < n5; ++n6) {
                    if (arrby2[n4 + n6] == 0) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(byte[] arrby, int n2, int n3, byte[] arrby2, int n4, int n5) {
        return a.a(arrby, n2, n3, arrby2, n4, n5, false);
    }

    public static boolean a(byte[] arrby, byte[] arrby2) {
        return a.a(arrby, 0, arrby.length, arrby2, 0, arrby2.length, false);
    }

    public static boolean a(byte[] arrby, byte[] arrby2, boolean bl2) {
        return a.a(arrby, 0, arrby.length, arrby2, 0, arrby2.length, bl2);
    }

    public static boolean b(byte[] arrby, int n2, int n3, byte[] arrby2, int n4, int n5) {
        return a.a(arrby, n2, n3, arrby2, n4, n5, true);
    }

    public static boolean a(byte[] arrby, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrby[i2] == 0) continue;
            return false;
        }
        return true;
    }
}

