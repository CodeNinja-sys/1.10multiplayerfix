/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.d;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.BitSet;
import org.apache.commons.a.d;
import org.apache.commons.a.d.c;
import org.apache.commons.a.f;
import org.apache.commons.a.h;
import org.apache.commons.a.i;
import org.apache.commons.a.j;

public class b
extends org.apache.commons.a.d.d
implements i,
j {
    private final Charset d;
    private static final BitSet e;
    private static final byte f = 32;
    private static final byte g = 95;
    private boolean h = false;

    public b() {
        this(org.apache.commons.a.d.f);
    }

    public b(Charset charset) {
        this.d = charset;
    }

    public b(String string) {
        this(Charset.forName(string));
    }

    @Override
    protected String a() {
        return "Q";
    }

    @Override
    protected byte[] a(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        byte[] arrby2 = org.apache.commons.a.d.c.a(e, arrby);
        if (this.h) {
            for (int i2 = 0; i2 < arrby2.length; ++i2) {
                if (arrby2[i2] != 32) continue;
                arrby2[i2] = 95;
            }
        }
        return arrby2;
    }

    @Override
    protected byte[] b(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        boolean bl2 = false;
        for (byte by2 : arrby) {
            if (by2 != 95) continue;
            bl2 = true;
            break;
        }
        if (bl2) {
            byte[] arrby2 = new byte[arrby.length];
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                int n2 = arrby[i2];
                arrby2[i2] = n2 != 95 ? n2 : 32;
            }
            return org.apache.commons.a.d.c.c(arrby2);
        }
        return org.apache.commons.a.d.c.c(arrby);
    }

    public String a(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return this.b(string, charset);
    }

    public String a(String string, String string2) {
        if (string == null) {
            return null;
        }
        try {
            return this.b(string, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new h(unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    @Override
    public String b(String string) {
        if (string == null) {
            return null;
        }
        return this.a(string, this.b());
    }

    @Override
    public String a(String string) {
        if (string == null) {
            return null;
        }
        try {
            return this.c(string);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new f(unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    @Override
    public Object b(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof String) {
            return this.b((String)object);
        }
        throw new h("Objects of type " + object.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override
    public Object a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof String) {
            return this.a((String)object);
        }
        throw new f("Objects of type " + object.getClass().getName() + " cannot be decoded using Q codec");
    }

    public Charset b() {
        return this.d;
    }

    public String c() {
        return this.d.name();
    }

    public boolean d() {
        return this.h;
    }

    public void a(boolean bl2) {
        this.h = bl2;
    }

    static {
        int n2;
        e = new BitSet(256);
        e.set(32);
        e.set(33);
        e.set(34);
        e.set(35);
        e.set(36);
        e.set(37);
        e.set(38);
        e.set(39);
        e.set(40);
        e.set(41);
        e.set(42);
        e.set(43);
        e.set(44);
        e.set(45);
        e.set(46);
        e.set(47);
        for (n2 = 48; n2 <= 57; ++n2) {
            e.set(n2);
        }
        e.set(58);
        e.set(59);
        e.set(60);
        e.set(62);
        e.set(64);
        for (n2 = 65; n2 <= 90; ++n2) {
            e.set(n2);
        }
        e.set(91);
        e.set(92);
        e.set(93);
        e.set(94);
        e.set(96);
        for (n2 = 97; n2 <= 122; ++n2) {
            e.set(n2);
        }
        e.set(123);
        e.set(124);
        e.set(125);
        e.set(126);
    }
}

