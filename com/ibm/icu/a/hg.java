/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.am;
import com.ibm.icu.a.hh;
import com.ibm.icu.a.hj;
import com.ibm.icu.a.ip;
import com.ibm.icu.b.b;
import com.ibm.icu.d.lf;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.MissingResourceException;

public final class hg {
    public static final hg a;
    public static final int b = 32;
    public int c = 0;
    int d = 0;
    private char[] f;
    private byte[] g;
    private char[] h;
    private byte[] i;
    private hh[] j;
    private char[] k = new char[33];
    private char[] l = new char[33];
    private static final String m = "data/icudt51b/unames.icu";
    private static final int n = 5;
    private static final int o = 31;
    private static final int p = 100000;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 11;
    private int[] t = new int[8];
    private int[] u = new int[8];
    private StringBuffer v = new StringBuffer();
    private int[] w = new int[2];
    private int x;
    private int y;
    private static final String[] z;
    private static final String A = "unknown";
    private static final int B = 30;
    private static final int C = 31;
    private static final int D = 32;
    static final int e = 33;

    public String a(int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF || n3 > 4) {
            return null;
        }
        String string = null;
        string = this.e(n2, n3);
        if (string == null || string.length() == 0) {
            string = n3 == 2 ? this.a(n2) : this.c(n2, n3);
        }
        return string;
    }

    public int a(int n2, String string) {
        if (n2 >= 4 || string == null || string.length() == 0) {
            return -1;
        }
        int n3 = hg.b(string.toLowerCase(Locale.ENGLISH), n2);
        if (n3 >= -1) {
            return n3;
        }
        String string2 = string.toUpperCase(Locale.ENGLISH);
        if (n2 == 0 || n2 == 2) {
            int n4 = 0;
            if (this.j != null) {
                n4 = this.j.length;
            }
            --n4;
            while (n4 >= 0) {
                n3 = this.j[n4].b(string2);
                if (n3 >= 0) {
                    return n3;
                }
                --n4;
            }
        }
        if (n2 == 2) {
            n3 = this.a(string2, 0);
            if (n3 == -1) {
                n3 = this.a(string2, 3);
            }
        } else {
            n3 = this.a(string2, n2);
        }
        return n3;
    }

    public int a(int n2, char[] arrc, char[] arrc2) {
        int n3 = 65535;
        byte by2 = 0;
        byte by3 = 0;
        int n4 = ip.a(this.h[(n2 *= this.d) + 1], this.h[n2 + 2]);
        arrc[0] = '\u0000';
        int n5 = 0;
        while (n5 < 32) {
            by2 = this.i[n4];
            for (int i2 = 4; i2 >= 0; i2 -= 4) {
                by3 = (byte)(by2 >> i2 & 0xF);
                if (n3 == 65535 && by3 > 11) {
                    n3 = (char)(by3 - 12 << 4);
                    continue;
                }
                arrc2[n5] = n3 != 65535 ? (char)((n3 | by3) + 12) : (char)by3;
                if (n5 < 32) {
                    arrc[n5 + 1] = (char)(arrc[n5] + arrc2[n5]);
                }
                n3 = 65535;
                ++n5;
            }
            ++n4;
        }
        return n4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String a(int n2, int n3, int n4) {
        int n5;
        if (n4 != 0 && n4 != 2) {
            if (59 >= this.f.length || this.f[59] == '\uffff') {
                int n6 = n4 == 4 ? 2 : n4;
                do {
                    n5 = n2;
                    n2 += ip.a(this.i, n2, n3, (byte)59);
                    n3 -= n2 - n5;
                } while (--n6 > 0);
            } else {
                n3 = 0;
            }
        }
        StringBuffer stringBuffer = this.v;
        synchronized (stringBuffer) {
            this.v.delete(0, this.v.length());
            int n7 = 0;
            while (n7 < n3) {
                n5 = this.i[n2 + n7];
                ++n7;
                if (n5 >= this.f.length) {
                    if (n5 == 59) break;
                    this.v.append(n5);
                    continue;
                }
                char c2 = this.f[n5 & 0xFF];
                if (c2 == '\ufffe') {
                    c2 = this.f[n5 << 8 | this.i[n2 + n7] & 0xFF];
                    ++n7;
                }
                if (c2 == '\uffff') {
                    if (n5 == 59) {
                        if (this.v.length() != 0 || n4 != 2) break;
                        continue;
                    }
                    this.v.append((char)(n5 & 0xFF));
                    continue;
                }
                ip.a(this.v, this.g, (int)c2);
            }
            if (this.v.length() > 0) {
                return this.v.toString();
            }
        }
        return null;
    }

    public String a(int n2) {
        String string = this.a(n2, 0);
        if (string == null && string == null) {
            string = this.c(n2);
        }
        return string;
    }

    public int b(int n2) {
        int n3 = this.c;
        int n4 = hg.e(n2);
        int n5 = 0;
        while (n5 < n3 - 1) {
            int n6 = n5 + n3 >> 1;
            if (n4 < this.d(n6)) {
                n3 = n6;
                continue;
            }
            n5 = n6;
        }
        return n5;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c(int n2) {
        String string = null;
        if (string == null) {
            int n3 = hg.l(n2);
            string = n3 >= z.length ? A : z[n3];
            StringBuffer stringBuffer = this.v;
            synchronized (stringBuffer) {
                this.v.delete(0, this.v.length());
                this.v.append('<');
                this.v.append(string);
                this.v.append('-');
                String string2 = Integer.toHexString(n2).toUpperCase(Locale.ENGLISH);
                for (int i2 = 4 - string2.length(); i2 > 0; --i2) {
                    this.v.append('0');
                }
                this.v.append(string2);
                this.v.append('>');
                string = this.v.toString();
            }
        }
        return string;
    }

    public int d(int n2) {
        if (n2 >= this.c) {
            return -1;
        }
        return this.h[n2 * this.d];
    }

    public static int e(int n2) {
        return n2 >> 5;
    }

    public static int f(int n2) {
        return (n2 << 5) + 32;
    }

    public static int g(int n2) {
        return n2 << 5;
    }

    public static int h(int n2) {
        return n2 & 0x1F;
    }

    public static int i(int n2) {
        return n2 & 0xFFFFFFE0;
    }

    public int a() {
        return this.j.length;
    }

    public int j(int n2) {
        return hh.a(this.j[n2]);
    }

    public int k(int n2) {
        return hh.b(this.j[n2]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String b(int n2, int n3) {
        String string = null;
        StringBuffer stringBuffer = this.v;
        synchronized (stringBuffer) {
            this.v.delete(0, this.v.length());
            this.j[n2].a(n3, this.v);
            string = this.v.toString();
        }
        return string;
    }

    public synchronized String c(int n2, int n3) {
        int n4;
        int n5 = hg.e(n2);
        if (n5 == this.h[(n4 = this.b(n2)) * this.d]) {
            int n6 = this.a(n4, this.k, this.l);
            int n7 = n2 & 0x1F;
            return this.a(n6 + this.k[n7], this.l[n7], n3);
        }
        return null;
    }

    public int b() {
        if (this.d()) {
            return this.y;
        }
        return 0;
    }

    public int c() {
        if (this.d()) {
            return this.x;
        }
        return 0;
    }

    public void a(lf lf2) {
        this.a(this.t, lf2);
    }

    public void b(lf lf2) {
        this.a(this.u, lf2);
    }

    boolean a(char[] arrc, byte[] arrby) {
        if (arrc != null && arrby != null && arrc.length > 0 && arrby.length > 0) {
            this.f = arrc;
            this.g = arrby;
            return true;
        }
        return false;
    }

    boolean a(hh[] arrhh) {
        if (arrhh != null && arrhh.length != 0) {
            this.j = arrhh;
            return true;
        }
        return false;
    }

    boolean d(int n2, int n3) {
        if (n2 <= 0 || n3 <= 0) {
            return false;
        }
        this.c = n2;
        this.d = n3;
        return true;
    }

    boolean b(char[] arrc, byte[] arrby) {
        if (arrc != null && arrby != null && arrc.length > 0 && arrby.length > 0) {
            this.h = arrc;
            this.i = arrby;
            return true;
        }
        return false;
    }

    private hg() {
        InputStream inputStream = am.c(m);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 100000);
        hj hj2 = new hj(bufferedInputStream);
        hj2.a(this);
        bufferedInputStream.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String e(int n2, int n3) {
        if (n3 == 0 || n3 == 2) {
            StringBuffer stringBuffer = this.v;
            synchronized (stringBuffer) {
                this.v.delete(0, this.v.length());
                for (int i2 = this.j.length - 1; i2 >= 0; --i2) {
                    if (!this.j[i2].a(n2)) continue;
                    this.j[i2].a(n2, this.v);
                    return this.v.toString();
                }
            }
        }
        return null;
    }

    private synchronized int a(String string, int n2) {
        for (int i2 = 0; i2 < this.c; ++i2) {
            int n3 = this.a(i2, this.k, this.l);
            int n4 = this.a(n3, this.l, string, n2);
            if (n4 == -1) continue;
            return this.h[i2 * this.d] << 5 | n4;
        }
        return -1;
    }

    private int a(int n2, char[] arrc, String string, int n3) {
        byte by2 = 0;
        int n4 = string.length();
        for (int i2 = 0; i2 <= 32; ++i2) {
            int n5 = 0;
            int n6 = arrc[i2];
            if (n3 != 0 && n3 != 2) {
                int n7 = n3 == 4 ? 2 : n3;
                do {
                    int n8 = n2;
                    n2 += ip.a(this.i, n2, n6, (byte)59);
                    n6 -= n2 - n8;
                } while (--n7 > 0);
            }
            int n9 = 0;
            while (n9 < n6 && n5 != -1 && n5 < n4) {
                by2 = this.i[n2 + n9];
                ++n9;
                if (by2 >= this.f.length) {
                    if (string.charAt(n5++) == (by2 & 0xFF)) continue;
                    n5 = -1;
                    continue;
                }
                char c2 = this.f[by2 & 0xFF];
                if (c2 == '\ufffe') {
                    c2 = this.f[by2 << 8 | this.i[n2 + n9] & 0xFF];
                    ++n9;
                }
                if (c2 == '\uffff') {
                    if (string.charAt(n5++) == (by2 & 0xFF)) continue;
                    n5 = -1;
                    continue;
                }
                n5 = ip.a(string, this.g, n5, c2);
            }
            if (n4 == n5 && (n9 == n6 || this.i[n2 + n9] == 59)) {
                return i2;
            }
            n2 += n6;
        }
        return -1;
    }

    private static int l(int n2) {
        if (ip.a(n2)) {
            return 30;
        }
        int n3 = com.ibm.icu.b.b.e(n2);
        if (n3 == 18) {
            n3 = n2 <= 56319 ? 31 : 32;
        }
        return n3;
    }

    private static int b(String string, int n2) {
        if (string.charAt(0) == '<') {
            int n3;
            int n4;
            if (n2 == 2 && string.charAt(n4 = string.length() - 1) == '>' && (n3 = string.lastIndexOf(45)) >= 0) {
                ++n3;
                int n5 = -1;
                try {
                    n5 = Integer.parseInt(string.substring(n3, n4), 16);
                }
                catch (NumberFormatException numberFormatException) {
                    return -1;
                }
                String string2 = string.substring(1, n3 - 1);
                int n6 = z.length;
                for (int i2 = 0; i2 < n6; ++i2) {
                    if (string2.compareTo(z[i2]) != 0) continue;
                    if (hg.l(n5) != i2) break;
                    return n5;
                }
            }
            return -1;
        }
        return -2;
    }

    private static void a(int[] arrn, char c2) {
        int n2 = c2 >>> 5;
        arrn[n2] = arrn[n2] | 1 << (c2 & 0x1F);
    }

    private static boolean b(int[] arrn, char c2) {
        return (arrn[c2 >>> 5] & 1 << (c2 & 0x1F)) != 0;
    }

    private static int b(int[] arrn, String string) {
        int n2 = string.length();
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            hg.a(arrn, string.charAt(i2));
        }
        return n2;
    }

    private static int b(int[] arrn, StringBuffer stringBuffer) {
        int n2 = stringBuffer.length();
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            hg.a(arrn, stringBuffer.charAt(i2));
        }
        return n2;
    }

    private int m(int n2) {
        int n3 = 0;
        for (int i2 = this.j.length - 1; i2 >= 0; --i2) {
            n3 = this.j[i2].a(this.t, n2);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    private int n(int n2) {
        for (int i2 = z.length - 1; i2 >= 0; --i2) {
            int n3 = 9 + hg.b(this.t, z[i2]);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int[] a(int n2, int n3, byte[] arrby, int[] arrn) {
        int n4 = 0;
        int n5 = 0;
        while (n5 < n3) {
            char c2 = (char)(this.i[n2 + n5] & 0xFF);
            ++n5;
            if (c2 == ';') break;
            if (c2 >= this.f.length) {
                hg.a(arrn, c2);
                ++n4;
                continue;
            }
            char c3 = this.f[c2 & 0xFF];
            if (c3 == '\ufffe') {
                c2 = (char)(c2 << 8 | this.i[n2 + n5] & 0xFF);
                c3 = this.f[c2];
                ++n5;
            }
            if (c3 == '\uffff') {
                hg.a(arrn, c2);
                ++n4;
                continue;
            }
            byte by2 = arrby[c2];
            if (by2 == 0) {
                StringBuffer stringBuffer = this.v;
                synchronized (stringBuffer) {
                    this.v.delete(0, this.v.length());
                    ip.a(this.v, this.g, (int)c3);
                    by2 = (byte)hg.b(arrn, this.v);
                }
                arrby[c2] = by2;
            }
            n4 += by2;
        }
        this.w[0] = n4;
        this.w[1] = n5;
        return this.w;
    }

    private void o(int n2) {
        int n3 = 0;
        char[] arrc = new char[34];
        char[] arrc2 = new char[34];
        byte[] arrby = new byte[this.f.length];
        for (int i2 = 0; i2 < this.c; ++i2) {
            int n4 = this.a(i2, arrc, arrc2);
            for (int i3 = 0; i3 < 32; ++i3) {
                int n5 = n4 + arrc[i3];
                int n6 = arrc2[i3];
                if (n6 == 0) continue;
                int[] arrn = this.a(n5, n6, arrby, this.t);
                if (arrn[0] > n2) {
                    n2 = arrn[0];
                }
                n5 += arrn[1];
                if (arrn[1] >= n6) continue;
                if ((arrn = this.a(n5, n6 -= arrn[1], arrby, this.t))[0] > n2) {
                    n2 = arrn[0];
                }
                n5 += arrn[1];
                if (arrn[1] >= n6 || (arrn = this.a(n5, n6 -= arrn[1], arrby, this.u))[1] <= n3) continue;
                n3 = n6;
            }
        }
        this.x = n3;
        this.y = n2;
    }

    private boolean d() {
        if (this.y > 0) {
            return true;
        }
        String string = "0123456789ABCDEF<>-";
        for (int i2 = string.length() - 1; i2 >= 0; --i2) {
            hg.a(this.t, string.charAt(i2));
        }
        this.y = this.m(0);
        this.y = this.n(this.y);
        this.o(this.y);
        return true;
    }

    private void a(int[] arrn, lf lf2) {
        lf2.g();
        if (!this.d()) {
            return;
        }
        for (char c2 = '\u00ff'; c2 > '\u0000'; c2 = (char)(c2 - '\u0001')) {
            if (!hg.b(arrn, c2)) continue;
            lf2.e(c2);
        }
    }

    static /* synthetic */ int a(int[] arrn, String string) {
        return hg.b(arrn, string);
    }

    static /* synthetic */ int a(int[] arrn, StringBuffer stringBuffer) {
        return hg.b(arrn, stringBuffer);
    }

    static {
        try {
            a = new hg();
        }
        catch (IOException iOException) {
            throw new MissingResourceException("Could not construct UCharacterName. Missing unames.icu", "", "");
        }
        z = new String[]{"unassigned", "uppercase letter", "lowercase letter", "titlecase letter", "modifier letter", "other letter", "non spacing mark", "enclosing mark", "combining spacing mark", "decimal digit number", "letter number", "other number", "space separator", "line separator", "paragraph separator", "control", "format", "private use area", "surrogate", "dash punctuation", "start punctuation", "end punctuation", "connector punctuation", "other punctuation", "math symbol", "currency symbol", "modifier symbol", "other symbol", "initial punctuation", "final punctuation", "noncharacter", "lead surrogate", "trail surrogate"};
    }
}

