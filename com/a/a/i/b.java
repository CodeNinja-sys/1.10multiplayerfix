/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.b.m;
import com.a.a.i.aj;
import com.a.a.i.ak;
import com.a.a.i.br;
import com.a.a.i.by;
import com.a.a.i.bz;
import com.a.a.i.c;
import com.a.a.i.ca;
import com.a.a.i.cb;
import com.a.a.i.d;
import com.a.a.i.e;
import com.a.a.i.f;
import com.a.a.i.h;
import com.a.a.i.j;
import com.a.a.i.p;
import com.a.a.i.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public abstract class b {
    private static final b a = new j("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final b b = new j("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    private static final b c = new j("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final b d = new j("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final b e = new j("base16()", "0123456789ABCDEF", null);

    b() {
    }

    public String a(byte[] arrby) {
        return this.a((byte[])cl.a(arrby), 0, arrby.length);
    }

    public final String a(byte[] arrby, int n2, int n3) {
        cl.a(arrby);
        cl.a(n2, n2 + n3, arrby.length);
        cb cb2 = br.a(this.a(n3));
        bz bz2 = this.a(cb2);
        try {
            for (int i2 = 0; i2 < n3; ++i2) {
                bz2.a(arrby[n2 + i2]);
            }
            bz2.b();
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)"impossible");
        }
        return cb2.toString();
    }

    public final OutputStream a(Writer writer) {
        return br.a(this.a(br.a(writer)));
    }

    public final p a(aj aj2) {
        cl.a(aj2);
        return new c(this, aj2);
    }

    private static byte[] a(byte[] arrby, int n2) {
        if (n2 == arrby.length) {
            return arrby;
        }
        byte[] arrby2 = new byte[n2];
        System.arraycopy(arrby, 0, arrby2, 0, n2);
        return arrby2;
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            return this.b(charSequence);
        }
        catch (h h2) {
            throw new IllegalArgumentException(h2);
        }
    }

    final byte[] b(CharSequence charSequence) {
        charSequence = this.a().m(charSequence);
        by by2 = this.a(br.a(charSequence));
        byte[] arrby = new byte[this.b(charSequence.length())];
        int n2 = 0;
        try {
            int n3 = by2.a();
            while (n3 != -1) {
                arrby[n2++] = (byte)n3;
                n3 = by2.a();
            }
        }
        catch (h h2) {
            throw h2;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
        return com.a.a.i.b.a(arrby, n2);
    }

    public final InputStream a(Reader reader) {
        return br.a(this.a(br.a(reader)));
    }

    public final s a(ak ak2) {
        cl.a(ak2);
        return new d(this, ak2);
    }

    abstract int a(int var1);

    abstract bz a(cb var1);

    abstract int b(int var1);

    abstract by a(ca var1);

    abstract m a();

    public abstract b b();

    public abstract b a(char var1);

    public abstract b a(String var1, int var2);

    public abstract b c();

    public abstract b d();

    public static b e() {
        return a;
    }

    public static b f() {
        return b;
    }

    public static b g() {
        return c;
    }

    public static b h() {
        return d;
    }

    public static b i() {
        return e;
    }

    static ca a(ca ca2, m m2) {
        cl.a(ca2);
        cl.a(m2);
        return new e(ca2, m2);
    }

    static cb a(cb cb2, String string, int n2) {
        cl.a(cb2);
        cl.a(string);
        cl.a(n2 > 0);
        return new f(n2, string, cb2);
    }
}

