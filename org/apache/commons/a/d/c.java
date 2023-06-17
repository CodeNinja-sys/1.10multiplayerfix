/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.d;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.BitSet;
import org.apache.commons.a.a;
import org.apache.commons.a.a.m;
import org.apache.commons.a.b;
import org.apache.commons.a.d;
import org.apache.commons.a.d.f;
import org.apache.commons.a.h;
import org.apache.commons.a.i;
import org.apache.commons.a.j;

public class c
implements a,
b,
i,
j {
    private final Charset a;
    private static final BitSet b;
    private static final byte c = 61;
    private static final byte d = 9;
    private static final byte e = 32;

    public c() {
        this(org.apache.commons.a.d.f);
    }

    public c(Charset charset) {
        this.a = charset;
    }

    public c(String string) {
        this(Charset.forName(string));
    }

    private static final void a(int n2, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char c2 = Character.toUpperCase(Character.forDigit(n2 >> 4 & 0xF, 16));
        char c3 = Character.toUpperCase(Character.forDigit(n2 & 0xF, 16));
        byteArrayOutputStream.write(c2);
        byteArrayOutputStream.write(c3);
    }

    public static final byte[] a(BitSet bitSet, byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = b;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int n2 : arrby) {
            int n3 = n2;
            if (n3 < 0) {
                n3 = 256 + n3;
            }
            if (bitSet.get(n3)) {
                byteArrayOutputStream.write(n3);
                continue;
            }
            org.apache.commons.a.d.c.a(n3, byteArrayOutputStream);
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
            if (by2 == 61) {
                try {
                    int n2 = f.a(arrby[++i2]);
                    int n3 = f.a(arrby[++i2]);
                    byteArrayOutputStream.write((char)((n2 << 4) + n3));
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw new org.apache.commons.a.f("Invalid quoted-printable encoding", arrayIndexOutOfBoundsException);
                }
            }
            byteArrayOutputStream.write(by2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public byte[] b(byte[] arrby) {
        return org.apache.commons.a.d.c.a(b, arrby);
    }

    @Override
    public byte[] a(byte[] arrby) {
        return org.apache.commons.a.d.c.c(arrby);
    }

    @Override
    public String b(String string) {
        return this.b(string, this.a());
    }

    public String a(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return new String(this.a(m.b(string)), charset);
    }

    public String a(String string, String string2) {
        if (string == null) {
            return null;
        }
        return new String(this.a(m.b(string)), string2);
    }

    @Override
    public String a(String string) {
        return this.a(string, this.a());
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
        throw new h("Objects of type " + object.getClass().getName() + " cannot be quoted-printable encoded");
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
        throw new org.apache.commons.a.f("Objects of type " + object.getClass().getName() + " cannot be quoted-printable decoded");
    }

    public Charset a() {
        return this.a;
    }

    public String b() {
        return this.a.name();
    }

    public String b(String string, Charset charset) {
        if (string == null) {
            return null;
        }
        return m.b(this.b(string.getBytes(charset)));
    }

    public String b(String string, String string2) {
        if (string == null) {
            return null;
        }
        return m.b(this.b(string.getBytes(string2)));
    }

    static {
        int n2;
        b = new BitSet(256);
        for (n2 = 33; n2 <= 60; ++n2) {
            b.set(n2);
        }
        for (n2 = 62; n2 <= 126; ++n2) {
            b.set(n2);
        }
        b.set(9);
        b.set(32);
    }
}

