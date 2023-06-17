/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.a.h.a;
import org.apache.a.h.g;
import org.apache.a.n.f;

public class m
extends a
implements Cloneable {
    protected final byte[] e;

    public m(String string, g g2) {
        Charset charset;
        org.apache.a.o.a.a((Object)string, "Source string");
        Charset charset2 = charset = g2 != null ? g2.b() : null;
        if (charset == null) {
            charset = f.t;
        }
        try {
            this.e = string.getBytes(charset.name());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new UnsupportedCharsetException(charset.name());
        }
        if (g2 != null) {
            this.a(g2.toString());
        }
    }

    public m(String string, String string2, String string3) {
        org.apache.a.o.a.a((Object)string, "Source string");
        String string4 = string2 != null ? string2 : "text/plain";
        String string5 = string3 != null ? string3 : "ISO-8859-1";
        this.e = string.getBytes(string5);
        this.a(string4 + "; charset=" + string5);
    }

    public m(String string, String string2) {
        this(string, g.a(g.j.a(), string2));
    }

    public m(String string, Charset charset) {
        this(string, g.a(g.j.a(), charset));
    }

    public m(String string) {
        this(string, g.m);
    }

    public boolean a() {
        return true;
    }

    public long c() {
        return this.e.length;
    }

    public InputStream f() {
        return new ByteArrayInputStream(this.e);
    }

    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        outputStream.write(this.e);
        outputStream.flush();
    }

    public boolean g() {
        return false;
    }

    public Object clone() {
        return super.clone();
    }
}

