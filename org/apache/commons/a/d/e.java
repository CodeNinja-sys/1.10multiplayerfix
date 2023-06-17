/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.d;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.a.a;
import org.apache.commons.a.a.m;
import org.apache.commons.a.b;
import org.apache.commons.a.d.f;
import org.apache.commons.a.h;
import org.apache.commons.a.i;
import org.apache.commons.a.j;

public class e
implements a,
b,
i,
j {
    static final int a = 16;
    protected String b;
    protected static final byte c = 37;
    protected static final BitSet d;

    public e() {
        this("UTF-8");
    }

    public e(String string) {
        this.b = string;
    }

    public static final byte[] a(BitSet bitSet, byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int n2 : arrby) {
            int n3 = n2;
            if (n3 < 0) {
                n3 = 256 + n3;
            }
            if (bitSet.get(n3)) {
                if (n3 == 32) {
                    n3 = 43;
                }
                byteArrayOutputStream.write(n3);
                continue;
            }
            byteArrayOutputStream.write(37);
            char c2 = Character.toUpperCase(Character.forDigit(n3 >> 4 & 0xF, 16));
            char c3 = Character.toUpperCase(Character.forDigit(n3 & 0xF, 16));
            byteArrayOutputStream.write(c2);
            byteArrayOutputStream.write(c3);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] c(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            byte by2 = arrby[i2];
            if (by2 == 43) {
                byteArrayOutputStream.write(32);
                continue;
            }
            if (by2 == 37) {
                try {
                    int n2 = f.a(arrby[++i2]);
                    int n3 = f.a(arrby[++i2]);
                    byteArrayOutputStream.write((char)((n2 << 4) + n3));
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw new org.apache.commons.a.f("Invalid URL encoding: ", arrayIndexOutOfBoundsException);
                }
            }
            byteArrayOutputStream.write(by2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public byte[] b(byte[] arrby) {
        return e.a(d, arrby);
    }

    @Override
    public byte[] a(byte[] arrby) {
        return e.c(arrby);
    }

    public String a(String string, String string2) {
        if (string == null) {
            return null;
        }
        return m.b(this.b(string.getBytes(string2)));
    }

    @Override
    public String b(String string) {
        if (string == null) {
            return null;
        }
        try {
            return this.a(string, this.a());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new h(unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    public String b(String string, String string2) {
        if (string == null) {
            return null;
        }
        return new String(this.a(m.b(string)), string2);
    }

    @Override
    public String a(String string) {
        if (string == null) {
            return null;
        }
        try {
            return this.b(string, this.a());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new org.apache.commons.a.f(unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    @Override
    public Object b(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            return this.b((byte[])object);
        }
        if (object instanceof String) {
            return this.b((String)object);
        }
        throw new h("Objects of type " + object.getClass().getName() + " cannot be URL encoded");
    }

    @Override
    public Object a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            return this.a((byte[])object);
        }
        if (object instanceof String) {
            return this.a((String)object);
        }
        throw new org.apache.commons.a.f("Objects of type " + object.getClass().getName() + " cannot be URL decoded");
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.b;
    }

    static {
        int n2;
        d = new BitSet(256);
        for (n2 = 97; n2 <= 122; ++n2) {
            d.set(n2);
        }
        for (n2 = 65; n2 <= 90; ++n2) {
            d.set(n2);
        }
        for (n2 = 48; n2 <= 57; ++n2) {
            d.set(n2);
        }
        d.set(45);
        d.set(95);
        d.set(46);
        d.set(42);
        d.set(32);
    }
}

