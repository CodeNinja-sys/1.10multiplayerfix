/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.io.UnsupportedEncodingException;
import org.apache.a.c;
import org.apache.a.o.a;

public final class f {
    public static String a(byte[] arrby, int n2, int n3, String string) {
        a.a(arrby, "Input");
        a.a(string, "Charset");
        try {
            return new String(arrby, n2, n3, string);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(arrby, n2, n3);
        }
    }

    public static String a(byte[] arrby, String string) {
        a.a(arrby, "Input");
        return f.a(arrby, 0, arrby.length, string);
    }

    public static byte[] a(String string, String string2) {
        a.a((Object)string, "Input");
        a.a(string2, "Charset");
        try {
            return string.getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    public static byte[] a(String string) {
        a.a((Object)string, "Input");
        try {
            return string.getBytes(c.f.name());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new Error("ASCII not supported");
        }
    }

    public static String a(byte[] arrby, int n2, int n3) {
        a.a(arrby, "Input");
        try {
            return new String(arrby, n2, n3, c.f.name());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new Error("ASCII not supported");
        }
    }

    public static String a(byte[] arrby) {
        a.a(arrby, "Input");
        return f.a(arrby, 0, arrby.length);
    }

    private f() {
    }
}

