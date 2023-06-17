/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.a.d;

public class m {
    private static byte[] a(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return string.getBytes(charset);
    }

    public static byte[] a(String string) {
        return m.a(string, d.a);
    }

    public static byte[] a(String string, String string2) {
        if (string == null) {
            return null;
        }
        try {
            return string.getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw m.a(string2, unsupportedEncodingException);
        }
    }

    public static byte[] b(String string) {
        return m.a(string, d.b);
    }

    public static byte[] c(String string) {
        return m.a(string, d.c);
    }

    public static byte[] d(String string) {
        return m.a(string, d.d);
    }

    public static byte[] e(String string) {
        return m.a(string, d.e);
    }

    public static byte[] f(String string) {
        return m.a(string, d.f);
    }

    private static IllegalStateException a(String string, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(string + ": " + unsupportedEncodingException);
    }

    private static String a(byte[] arrby, Charset charset) {
        return arrby == null ? null : new String(arrby, charset);
    }

    public static String a(byte[] arrby, String string) {
        if (arrby == null) {
            return null;
        }
        try {
            return new String(arrby, string);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw m.a(string, unsupportedEncodingException);
        }
    }

    public static String a(byte[] arrby) {
        return new String(arrby, d.a);
    }

    public static String b(byte[] arrby) {
        return new String(arrby, d.b);
    }

    public static String c(byte[] arrby) {
        return new String(arrby, d.c);
    }

    public static String d(byte[] arrby) {
        return new String(arrby, d.d);
    }

    public static String e(byte[] arrby) {
        return new String(arrby, d.e);
    }

    public static String f(byte[] arrby) {
        return m.a(arrby, d.f);
    }
}

