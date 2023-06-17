/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.util.e;
import java.nio.charset.Charset;

final class l {
    public static final int a = 8096;
    public static final String b = "Content-Disposition";
    public static final String c = "name";
    public static final String d = "filename";
    public static final String e = "form-data";
    public static final String f = "attachment";
    public static final String g = "file";
    public static final String h = "multipart/mixed";
    public static final Charset i = io.netty.util.e.e;
    public static final Charset j = io.netty.util.e.f;
    public static final String k = "application/octet-stream";
    public static final String l = "text/plain";

    private l() {
    }

    static int a(String string, int n2) {
        int n3;
        for (n3 = n2; n3 < string.length() && Character.isWhitespace(string.charAt(n3)); ++n3) {
        }
        return n3;
    }

    static int b(String string, int n2) {
        int n3;
        for (n3 = n2; n3 < string.length() && !Character.isWhitespace(string.charAt(n3)); ++n3) {
        }
        return n3;
    }

    static int a(String string) {
        int n2;
        for (n2 = string.length(); n2 > 0 && Character.isWhitespace(string.charAt(n2 - 1)); --n2) {
        }
        return n2;
    }
}

