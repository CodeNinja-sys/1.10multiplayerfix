/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.nio.charset.Charset;
import org.apache.commons.a.a;
import org.apache.commons.a.b;
import org.apache.commons.a.d;
import org.apache.commons.a.f;
import org.apache.commons.a.h;

public class l
implements a,
b {
    public static final Charset a = org.apache.commons.a.d.f;
    public static final String b = "UTF-8";
    private static final char[] c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final Charset e;

    public static byte[] a(char[] arrc) {
        int n2 = arrc.length;
        if ((n2 & 1) != 0) {
            throw new f("Odd number of characters.");
        }
        byte[] arrby = new byte[n2 >> 1];
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            int n5 = l.a(arrc[n4], n4) << 4;
            n5 |= l.a(arrc[++n4], n4);
            ++n4;
            arrby[n3] = (byte)(n5 & 0xFF);
            ++n3;
        }
        return arrby;
    }

    public static char[] c(byte[] arrby) {
        return l.a(arrby, true);
    }

    public static char[] a(byte[] arrby, boolean bl2) {
        return l.a(arrby, bl2 ? c : d);
    }

    protected static char[] a(byte[] arrby, char[] arrc) {
        int n2 = arrby.length;
        char[] arrc2 = new char[n2 << 1];
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrc2[n3++] = arrc[(0xF0 & arrby[i2]) >>> 4];
            arrc2[n3++] = arrc[0xF & arrby[i2]];
        }
        return arrc2;
    }

    public static String d(byte[] arrby) {
        return new String(l.c(arrby));
    }

    protected static int a(char c2, int n2) {
        int n3 = Character.digit(c2, 16);
        if (n3 == -1) {
            throw new f("Illegal hexadecimal character " + c2 + " at index " + n2);
        }
        return n3;
    }

    public l() {
        this.e = a;
    }

    public l(Charset charset) {
        this.e = charset;
    }

    public l(String string) {
        this(Charset.forName(string));
    }

    @Override
    public byte[] a(byte[] arrby) {
        return l.a(new String(arrby, this.a()).toCharArray());
    }

    @Override
    public Object a(Object object) {
        try {
            char[] arrc = object instanceof String ? ((String)object).toCharArray() : (char[])object;
            return l.a(arrc);
        }
        catch (ClassCastException classCastException) {
            throw new f(classCastException.getMessage(), classCastException);
        }
    }

    @Override
    public byte[] b(byte[] arrby) {
        return l.d(arrby).getBytes(this.a());
    }

    @Override
    public Object b(Object object) {
        try {
            byte[] arrby = object instanceof String ? ((String)object).getBytes(this.a()) : (byte[])object;
            return l.c(arrby);
        }
        catch (ClassCastException classCastException) {
            throw new h(classCastException.getMessage(), classCastException);
        }
    }

    public Charset a() {
        return this.e;
    }

    public String b() {
        return this.e.name();
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.e + "]";
    }
}

