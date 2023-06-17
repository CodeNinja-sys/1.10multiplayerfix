/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.k;

import com.a.a.b.aj;
import com.a.a.b.bl;
import com.a.a.b.bx;
import com.a.a.b.cb;
import com.a.a.b.cc;
import com.a.a.b.cg;
import com.a.a.b.cl;
import com.a.a.b.e;
import com.a.a.b.m;
import com.a.a.d.jr;
import com.a.a.d.js;
import com.a.a.d.lo;
import com.a.a.d.mq;
import com.a.a.d.ou;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.we;
import com.a.a.k.h;
import com.a.a.k.i;
import com.a.a.k.j;
import java.nio.charset.Charset;
import java.util.Map;

public final class g {
    private static final String ay = "charset";
    private static final jr az = jr.d("charset", com.a.a.b.e.a(com.a.a.b.aj.c.name()));
    private static final m aA = com.a.a.b.m.b.a(com.a.a.b.m.i.a()).a(com.a.a.b.m.b(' ')).a(com.a.a.b.m.b("()<>@,;:\\\"/[]?="));
    private static final m aB = com.a.a.b.m.b.a(com.a.a.b.m.b("\"\\\r"));
    private static final m aC = com.a.a.b.m.a(" \t\r\n");
    private static final String aD = "application";
    private static final String aE = "audio";
    private static final String aF = "image";
    private static final String aG = "text";
    private static final String aH = "video";
    private static final String aI = "*";
    private static final Map aJ = sz.c();
    public static final g a = com.a.a.k.g.c("*", "*");
    public static final g b = com.a.a.k.g.c("text", "*");
    public static final g c = com.a.a.k.g.c("image", "*");
    public static final g d = com.a.a.k.g.c("audio", "*");
    public static final g e = com.a.a.k.g.c("video", "*");
    public static final g f = com.a.a.k.g.c("application", "*");
    public static final g g = com.a.a.k.g.d("text", "cache-manifest");
    public static final g h = com.a.a.k.g.d("text", "css");
    public static final g i = com.a.a.k.g.d("text", "csv");
    public static final g j = com.a.a.k.g.d("text", "html");
    public static final g k = com.a.a.k.g.d("text", "calendar");
    public static final g l = com.a.a.k.g.d("text", "plain");
    public static final g m = com.a.a.k.g.d("text", "javascript");
    public static final g n = com.a.a.k.g.d("text", "tab-separated-values");
    public static final g o = com.a.a.k.g.d("text", "vcard");
    public static final g p = com.a.a.k.g.d("text", "vnd.wap.wml");
    public static final g q = com.a.a.k.g.d("text", "xml");
    public static final g r = com.a.a.k.g.c("image", "bmp");
    public static final g s = com.a.a.k.g.c("image", "x-canon-crw");
    public static final g t = com.a.a.k.g.c("image", "gif");
    public static final g u = com.a.a.k.g.c("image", "vnd.microsoft.icon");
    public static final g v = com.a.a.k.g.c("image", "jpeg");
    public static final g w = com.a.a.k.g.c("image", "png");
    public static final g x = com.a.a.k.g.c("image", "vnd.adobe.photoshop");
    public static final g y = com.a.a.k.g.d("image", "svg+xml");
    public static final g z = com.a.a.k.g.c("image", "tiff");
    public static final g A = com.a.a.k.g.c("image", "webp");
    public static final g B = com.a.a.k.g.c("audio", "mp4");
    public static final g C = com.a.a.k.g.c("audio", "mpeg");
    public static final g D = com.a.a.k.g.c("audio", "ogg");
    public static final g E = com.a.a.k.g.c("audio", "webm");
    public static final g F = com.a.a.k.g.c("video", "mp4");
    public static final g G = com.a.a.k.g.c("video", "mpeg");
    public static final g H = com.a.a.k.g.c("video", "ogg");
    public static final g I = com.a.a.k.g.c("video", "quicktime");
    public static final g J = com.a.a.k.g.c("video", "webm");
    public static final g K = com.a.a.k.g.c("video", "x-ms-wmv");
    public static final g L = com.a.a.k.g.d("application", "xml");
    public static final g M = com.a.a.k.g.d("application", "atom+xml");
    public static final g N = com.a.a.k.g.c("application", "x-bzip2");
    public static final g O = com.a.a.k.g.c("application", "vnd.ms-fontobject");
    public static final g P = com.a.a.k.g.c("application", "epub+zip");
    public static final g Q = com.a.a.k.g.c("application", "x-www-form-urlencoded");
    public static final g R = com.a.a.k.g.c("application", "pkcs12");
    public static final g S = com.a.a.k.g.c("application", "binary");
    public static final g T = com.a.a.k.g.c("application", "x-gzip");
    public static final g U = com.a.a.k.g.d("application", "javascript");
    public static final g V = com.a.a.k.g.d("application", "json");
    public static final g W = com.a.a.k.g.c("application", "vnd.google-earth.kml+xml");
    public static final g X = com.a.a.k.g.c("application", "vnd.google-earth.kmz");
    public static final g Y = com.a.a.k.g.c("application", "mbox");
    public static final g Z = com.a.a.k.g.c("application", "vnd.ms-excel");
    public static final g aa = com.a.a.k.g.c("application", "vnd.ms-powerpoint");
    public static final g ab = com.a.a.k.g.c("application", "msword");
    public static final g ac = com.a.a.k.g.c("application", "octet-stream");
    public static final g ad = com.a.a.k.g.c("application", "ogg");
    public static final g ae = com.a.a.k.g.c("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final g af = com.a.a.k.g.c("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final g ag = com.a.a.k.g.c("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final g ah = com.a.a.k.g.c("application", "vnd.oasis.opendocument.graphics");
    public static final g ai = com.a.a.k.g.c("application", "vnd.oasis.opendocument.presentation");
    public static final g aj = com.a.a.k.g.c("application", "vnd.oasis.opendocument.spreadsheet");
    public static final g ak = com.a.a.k.g.c("application", "vnd.oasis.opendocument.text");
    public static final g al = com.a.a.k.g.c("application", "pdf");
    public static final g am = com.a.a.k.g.c("application", "postscript");
    public static final g an = com.a.a.k.g.c("application", "protobuf");
    public static final g ao = com.a.a.k.g.d("application", "rdf+xml");
    public static final g ap = com.a.a.k.g.d("application", "rtf");
    public static final g aq = com.a.a.k.g.c("application", "font-sfnt");
    public static final g ar = com.a.a.k.g.c("application", "x-shockwave-flash");
    public static final g as = com.a.a.k.g.c("application", "vnd.sketchup.skp");
    public static final g at = com.a.a.k.g.c("application", "x-tar");
    public static final g au = com.a.a.k.g.c("application", "font-woff");
    public static final g av = com.a.a.k.g.d("application", "xhtml+xml");
    public static final g aw = com.a.a.k.g.d("application", "xrd+xml");
    public static final g ax = com.a.a.k.g.c("application", "zip");
    private final String aK;
    private final String aL;
    private final jr aM;
    private static final cb aN = bx.a("; ").c("=");

    private static g c(String string, String string2) {
        return com.a.a.k.g.b(new g(string, string2, jr.a()));
    }

    private static g d(String string, String string2) {
        return com.a.a.k.g.b(new g(string, string2, az));
    }

    private static g b(g g2) {
        aJ.put(g2, g2);
        return g2;
    }

    private g(String string, String string2, jr jr2) {
        this.aK = string;
        this.aL = string2;
        this.aM = jr2;
    }

    public String a() {
        return this.aK;
    }

    public String b() {
        return this.aL;
    }

    public jr c() {
        return this.aM;
    }

    private Map h() {
        return sz.a((Map)this.aM.y(), (bl)new h(this));
    }

    public cg d() {
        lo lo2 = lo.a(this.aM.e(ay));
        switch (lo2.size()) {
            case 0: {
                return cg.f();
            }
            case 1: {
                return cg.b(Charset.forName((String)mq.d(lo2)));
            }
        }
        throw new IllegalStateException("Multiple charset values defined: " + lo2);
    }

    public g e() {
        return this.aM.o() ? this : com.a.a.k.g.b(this.aK, this.aL);
    }

    public g a(vi vi2) {
        return com.a.a.k.g.a(this.aK, this.aL, vi2);
    }

    public g a(String string, String string2) {
        cl.a(string);
        cl.a(string2);
        String string3 = com.a.a.k.g.h(string);
        js js2 = jr.b();
        for (Map.Entry entry : this.aM.z()) {
            String string4 = (String)entry.getKey();
            if (string3.equals(string4)) continue;
            js2.a((Object)string4, entry.getValue());
        }
        js2.a((Object)string3, (Object)com.a.a.k.g.e(string3, string2));
        g g2 = new g(this.aK, this.aL, js2.a());
        return (g)cc.b(aJ.get(g2), g2);
    }

    public g a(Charset charset) {
        cl.a(charset);
        return this.a(ay, charset.name());
    }

    public boolean f() {
        return aI.equals(this.aK) || aI.equals(this.aL);
    }

    public boolean a(g g2) {
        return !(!g2.aK.equals(aI) && !g2.aK.equals(this.aK) || !g2.aL.equals(aI) && !g2.aL.equals(this.aL) || !this.aM.z().containsAll(g2.aM.z()));
    }

    public static g b(String string, String string2) {
        return com.a.a.k.g.a(string, string2, jr.a());
    }

    static g a(String string) {
        return com.a.a.k.g.b(aD, string);
    }

    static g b(String string) {
        return com.a.a.k.g.b(aE, string);
    }

    static g c(String string) {
        return com.a.a.k.g.b(aF, string);
    }

    static g d(String string) {
        return com.a.a.k.g.b(aG, string);
    }

    static g e(String string) {
        return com.a.a.k.g.b(aH, string);
    }

    private static g a(String string, String string2, vi vi2) {
        cl.a(string);
        cl.a(string2);
        cl.a(vi2);
        String string3 = com.a.a.k.g.h(string);
        String string4 = com.a.a.k.g.h(string2);
        cl.a(!aI.equals(string3) || aI.equals(string4), (Object)"A wildcard type cannot be used with a non-wildcard subtype");
        js js2 = jr.b();
        for (Map.Entry entry : vi2.l()) {
            String string5 = com.a.a.k.g.h((String)entry.getKey());
            js2.a((Object)string5, (Object)com.a.a.k.g.e(string5, (String)entry.getValue()));
        }
        g g2 = new g(string3, string4, js2.a());
        return (g)cc.b(aJ.get(g2), g2);
    }

    private static String h(String string) {
        cl.a(aA.d(string));
        return com.a.a.b.e.a(string);
    }

    private static String e(String string, String string2) {
        return ay.equals(string) ? com.a.a.b.e.a(string2) : string2;
    }

    public static g f(String string) {
        cl.a(string);
        j j2 = new j(string);
        try {
            String string2 = j2.b(aA);
            j2.a('/');
            String string3 = j2.b(aA);
            js js2 = jr.b();
            while (j2.b()) {
                String string4;
                j2.a(';');
                j2.a(aC);
                String string5 = j2.b(aA);
                j2.a('=');
                if ('\"' == j2.a()) {
                    j2.a('\"');
                    StringBuilder stringBuilder = new StringBuilder();
                    while ('\"' != j2.a()) {
                        if ('\\' == j2.a()) {
                            j2.a('\\');
                            stringBuilder.append(j2.c(com.a.a.b.m.b));
                            continue;
                        }
                        stringBuilder.append(j2.b(aB));
                    }
                    string4 = stringBuilder.toString();
                    j2.a('\"');
                } else {
                    string4 = j2.b(aA);
                }
                js2.a((Object)string5, (Object)string4);
            }
            return com.a.a.k.g.a(string2, string3, js2.a());
        }
        catch (IllegalStateException illegalStateException) {
            throw new IllegalArgumentException("Could not parse '" + string + "'", illegalStateException);
        }
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)object;
            return this.aK.equals(g2.aK) && this.aL.equals(g2.aL) && this.h().equals(g2.h());
        }
        return false;
    }

    public int hashCode() {
        return cc.a(this.aK, this.aL, this.h());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().append(this.aK).append('/').append(this.aL);
        if (!this.aM.o()) {
            stringBuilder.append("; ");
            ou ou2 = we.a((ou)this.aM, (bl)new i(this));
            aN.a(stringBuilder, (Iterable)ou2.l());
        }
        return stringBuilder.toString();
    }

    private static String i(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() + 16).append('\"');
        for (char c2 : string.toCharArray()) {
            if (c2 == '\r' || c2 == '\\' || c2 == '\"') {
                stringBuilder.append('\\');
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.append('\"').toString();
    }

    static /* synthetic */ m g() {
        return aA;
    }

    static /* synthetic */ String g(String string) {
        return com.a.a.k.g.i(string);
    }
}

