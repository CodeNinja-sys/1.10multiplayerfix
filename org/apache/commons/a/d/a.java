/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.d;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.a.d;
import org.apache.commons.a.f;
import org.apache.commons.a.h;
import org.apache.commons.a.i;
import org.apache.commons.a.j;

public class a
extends org.apache.commons.a.d.d
implements i,
j {
    private final Charset d;

    public a() {
        this(org.apache.commons.a.d.f);
    }

    public a(Charset charset) {
        this.d = charset;
    }

    public a(String string) {
        this(Charset.forName(string));
    }

    @Override
    protected String a() {
        return "B";
    }

    @Override
    protected byte[] a(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        return org.apache.commons.a.a.d.e(arrby);
    }

    @Override
    protected byte[] b(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        return org.apache.commons.a.a.d.j(arrby);
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
        throw new h("Objects of type " + object.getClass().getName() + " cannot be encoded using BCodec");
    }

    @Override
    public Object a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof String) {
            return this.a((String)object);
        }
        throw new f("Objects of type " + object.getClass().getName() + " cannot be decoded using BCodec");
    }

    public Charset b() {
        return this.d;
    }

    public String c() {
        return this.d.name();
    }
}

