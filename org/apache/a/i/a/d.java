/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.a.b.m;
import org.apache.a.c;
import org.apache.a.f;
import org.apache.a.i.a.ac;
import org.apache.a.i.a.ag;
import org.apache.a.i.a.k;
import org.apache.a.k.n;
import org.apache.a.k.r;
import org.apache.a.n.a;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.u;

public class d
extends ac {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private boolean b;
    private static final int c = -1;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private String g;
    private long h;
    private String i;
    private String j;
    private String k;

    public d(Charset charset) {
        super(charset);
        this.b = false;
    }

    public d(m m2) {
        super(m2);
    }

    public d() {
        this(org.apache.a.c.f);
    }

    public void a(f f2) {
        super.a(f2);
        this.b = true;
    }

    public boolean d() {
        String string = this.a("stale");
        if ("true".equalsIgnoreCase(string)) {
            return false;
        }
        return this.b;
    }

    public String a() {
        return "digest";
    }

    public boolean c() {
        return false;
    }

    public void a(String string, String string2) {
        this.l().put(string, string2);
    }

    public f a(org.apache.a.b.o o2, u u2) {
        return this.a(o2, u2, new a());
    }

    public f a(org.apache.a.b.o o2, u u2, g g2) {
        org.apache.a.o.a.a(o2, "Credentials");
        org.apache.a.o.a.a(u2, "HTTP request");
        if (this.a("realm") == null) {
            throw new org.apache.a.b.k("missing realm in challenge");
        }
        if (this.a("nonce") == null) {
            throw new org.apache.a.b.k("missing nonce in challenge");
        }
        this.l().put("methodname", u2.g().a());
        this.l().put("uri", u2.g().c());
        String string = this.a("charset");
        if (string == null) {
            this.l().put("charset", this.a(u2));
        }
        return this.b(o2, u2);
    }

    private static MessageDigest b(String string) {
        try {
            return MessageDigest.getInstance(string);
        }
        catch (Exception exception) {
            throw new ag("Unsupported algorithm in HTTP Digest authentication: " + string);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private f b(org.apache.a.b.o o2, u u2) {
        Object object;
        Object object2;
        String string;
        MessageDigest messageDigest;
        String string2;
        Object object3;
        String string3 = this.a("uri");
        String string4 = this.a("realm");
        String string5 = this.a("nonce");
        String string6 = this.a("opaque");
        String string7 = this.a("methodname");
        String string8 = this.a("algorithm");
        if (string8 == null) {
            string8 = "MD5";
        }
        HashSet<String> hashSet = new HashSet<String>(8);
        int n2 = -1;
        String string9 = this.a("qop");
        if (string9 != null) {
            object3 = new StringTokenizer(string9, ",");
            while (((StringTokenizer)object3).hasMoreTokens()) {
                string2 = ((StringTokenizer)object3).nextToken().trim();
                hashSet.add(string2.toLowerCase(Locale.US));
            }
            if (u2 instanceof o && hashSet.contains("auth-int")) {
                n2 = 1;
            } else if (hashSet.contains("auth")) {
                n2 = 2;
            }
        } else {
            n2 = 0;
        }
        if (n2 == -1) {
            throw new org.apache.a.b.k("None of the qop methods is supported: " + string9);
        }
        object3 = this.a("charset");
        if (object3 == null) {
            object3 = "ISO-8859-1";
        }
        if ((string2 = string8).equalsIgnoreCase("MD5-sess")) {
            string2 = "MD5";
        }
        try {
            messageDigest = org.apache.a.i.a.d.b(string2);
        }
        catch (ag ag2) {
            throw new org.apache.a.b.k("Unsuppported digest algorithm: " + string2);
        }
        String string10 = o2.a().getName();
        String string11 = o2.b();
        if (string5.equals(this.g)) {
            ++this.h;
        } else {
            this.h = 1L;
            this.i = null;
            this.g = string5;
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        Formatter formatter = new Formatter(stringBuilder, Locale.US);
        formatter.format("%08x", this.h);
        formatter.close();
        String string12 = stringBuilder.toString();
        if (this.i == null) {
            this.i = org.apache.a.i.a.d.j();
        }
        this.j = null;
        this.k = null;
        if (string8.equalsIgnoreCase("MD5-sess")) {
            stringBuilder.setLength(0);
            stringBuilder.append(string10).append(':').append(string4).append(':').append(string11);
            string = org.apache.a.i.a.d.a(messageDigest.digest(org.apache.a.o.f.a(stringBuilder.toString(), (String)object3)));
            stringBuilder.setLength(0);
            stringBuilder.append(string).append(':').append(string5).append(':').append(this.i);
            this.j = stringBuilder.toString();
        } else {
            stringBuilder.setLength(0);
            stringBuilder.append(string10).append(':').append(string4).append(':').append(string11);
            this.j = stringBuilder.toString();
        }
        string = org.apache.a.i.a.d.a(messageDigest.digest(org.apache.a.o.f.a(this.j, (String)object3)));
        if (n2 == 2) {
            this.k = string7 + ':' + string3;
        } else if (n2 == 1) {
            object2 = null;
            if (u2 instanceof o) {
                object2 = ((o)u2).b();
            }
            if (object2 != null && !object2.a()) {
                if (!hashSet.contains("auth")) throw new org.apache.a.b.k("Qop auth-int cannot be used with a non-repeatable entity");
                n2 = 2;
                this.k = string7 + ':' + string3;
            } else {
                object = new k(messageDigest);
                try {
                    if (object2 != null) {
                        object2.a((OutputStream)object);
                    }
                    ((k)object).close();
                }
                catch (IOException iOException) {
                    throw new org.apache.a.b.k("I/O error reading entity content", iOException);
                }
                this.k = string7 + ':' + string3 + ':' + org.apache.a.i.a.d.a(((k)object).a());
            }
        } else {
            this.k = string7 + ':' + string3;
        }
        object2 = org.apache.a.i.a.d.a(messageDigest.digest(org.apache.a.o.f.a(this.k, (String)object3)));
        if (n2 == 0) {
            stringBuilder.setLength(0);
            stringBuilder.append(string).append(':').append(string5).append(':').append((String)object2);
            object = stringBuilder.toString();
        } else {
            stringBuilder.setLength(0);
            stringBuilder.append(string).append(':').append(string5).append(':').append(string12).append(':').append(this.i).append(':').append(n2 == 1 ? "auth-int" : "auth").append(':').append((String)object2);
            object = stringBuilder.toString();
        }
        String string13 = org.apache.a.i.a.d.a(messageDigest.digest(org.apache.a.o.f.a((String)object)));
        org.apache.a.o.d d2 = new org.apache.a.o.d(128);
        if (this.e()) {
            d2.a("Proxy-Authorization");
        } else {
            d2.a("Authorization");
        }
        d2.a(": Digest ");
        ArrayList<n> arrayList = new ArrayList<n>(20);
        arrayList.add(new n("username", string10));
        arrayList.add(new n("realm", string4));
        arrayList.add(new n("nonce", string5));
        arrayList.add(new n("uri", string3));
        arrayList.add(new n("response", string13));
        if (n2 != 0) {
            arrayList.add(new n("qop", n2 == 1 ? "auth-int" : "auth"));
            arrayList.add(new n("nc", string12));
            arrayList.add(new n("cnonce", this.i));
        }
        arrayList.add(new n("algorithm", string8));
        if (string6 != null) {
            arrayList.add(new n("opaque", string6));
        }
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            String string14;
            n n3 = (n)arrayList.get(i2);
            if (i2 > 0) {
                d2.a(", ");
            }
            boolean bl2 = "nc".equals(string14 = n3.a()) || "qop".equals(string14) || "algorithm".equals(string14);
            org.apache.a.k.f.b.a(d2, n3, !bl2);
        }
        return new r(d2);
    }

    String g() {
        return this.i;
    }

    String h() {
        return this.j;
    }

    String i() {
        return this.k;
    }

    static String a(byte[] arrby) {
        int n2 = arrby.length;
        char[] arrc = new char[n2 * 2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrby[i2] & 0xF;
            int n4 = (arrby[i2] & 0xF0) >> 4;
            arrc[i2 * 2] = a[n4];
            arrc[i2 * 2 + 1] = a[n3];
        }
        return new String(arrc);
    }

    public static String j() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] arrby = new byte[8];
        secureRandom.nextBytes(arrby);
        return org.apache.a.i.a.d.a(arrby);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DIGEST [complete=").append(this.b).append(", nonce=").append(this.g).append(", nc=").append(this.h).append("]");
        return stringBuilder.toString();
    }
}

