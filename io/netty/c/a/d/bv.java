/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.ac;
import io.netty.c.a.d.bw;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

public class bv {
    private final Charset a;
    private final String b;
    private final List c = new ArrayList();

    public bv(String string) {
        this(string, ac.j);
    }

    public bv(String string, Charset charset) {
        if (string == null) {
            throw new NullPointerException("getUri");
        }
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.b = string;
        this.a = charset;
    }

    public void a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        this.c.add(new bw(string, string2));
    }

    public URI a() {
        return new URI(this.toString());
    }

    public String toString() {
        if (this.c.isEmpty()) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder(this.b).append('?');
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            bw bw2 = (bw)this.c.get(i2);
            stringBuilder.append(bv.a(bw2.a, this.a));
            if (bw2.b != null) {
                stringBuilder.append('=');
                stringBuilder.append(bv.a(bw2.b, this.a));
            }
            if (i2 == this.c.size() - 1) continue;
            stringBuilder.append('&');
        }
        return stringBuilder.toString();
    }

    private static String a(String string, Charset charset) {
        try {
            return URLEncoder.encode(string, charset.name()).replace("+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new UnsupportedCharsetException(charset.name());
        }
    }
}

