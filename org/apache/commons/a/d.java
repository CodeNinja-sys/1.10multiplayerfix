/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a;

import java.nio.charset.Charset;

public class d {
    public static final Charset a = Charset.forName("ISO-8859-1");
    public static final Charset b = Charset.forName("US-ASCII");
    public static final Charset c = Charset.forName("UTF-16");
    public static final Charset d = Charset.forName("UTF-16BE");
    public static final Charset e = Charset.forName("UTF-16LE");
    public static final Charset f = Charset.forName("UTF-8");

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

    public static Charset a(String string) {
        return string == null ? Charset.defaultCharset() : Charset.forName(string);
    }
}

