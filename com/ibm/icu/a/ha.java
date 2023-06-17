/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.am;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.gs;
import com.ibm.icu.a.hc;
import com.ibm.icu.a.hd;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.dn;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ha {
    private static final byte[] i = new byte[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 4, 5, 5, 6, 5, 6, 6, 7, 5, 6, 6, 7, 6, 7, 7, 8};
    public static final int a = 31;
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final String n = "i\u0307";
    private static final String o = "j\u0307";
    private static final String p = "\u012f\u0307";
    private static final String q = "i\u0307\u0300";
    private static final String r = "i\u0307\u0301";
    private static final String s = "i\u0307\u0303";
    private static final int t = 255;
    private static final int[] u = new int[]{1};
    public static final StringBuilder b = new StringBuilder();
    private int[] v;
    private char[] w;
    private char[] x;
    private gs y;
    private static final String z = "ucase";
    private static final String A = "icu";
    private static final String B = "ucase.icu";
    private static final byte[] C = new byte[]{99, 65, 83, 69};
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;
    private static final int G = 16;
    public static final int c = 3;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    private static final int H = 8;
    private static final int I = 16;
    private static final int J = 96;
    private static final int K = 32;
    private static final int L = 64;
    private static final int M = 96;
    private static final int N = 7;
    private static final int O = 5;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 2;
    private static final int S = 3;
    private static final int T = 6;
    private static final int U = 7;
    private static final int V = 256;
    private static final int W = 7;
    private static final int X = 16384;
    private static final int Y = 32768;
    private static final int Z = 15;
    private static final int aa = 15;
    private static final int ab = 0;
    private static final int ac = 1;
    private static final int ad = 2;
    public static final ha h;

    private ha() {
        InputStream inputStream = am.c("data/icudt51b/ucase.icu");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 4096);
        this.a(bufferedInputStream);
        bufferedInputStream.close();
        inputStream.close();
    }

    private final void a(InputStream inputStream) {
        int n2;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ag.a(dataInputStream, C, new hd(null));
        int n3 = dataInputStream.readInt();
        if (n3 < 16) {
            throw new IOException("indexes[0] too small in ucase.icu");
        }
        this.v = new int[n3];
        this.v[0] = n3;
        for (n2 = 1; n2 < n3; ++n2) {
            this.v[n2] = dataInputStream.readInt();
        }
        this.y = gs.b(dataInputStream);
        int n4 = this.v[2];
        int n5 = this.y.b();
        if (n5 > n4) {
            throw new IOException("ucase.icu: not enough bytes for the trie");
        }
        dataInputStream.skipBytes(n4 - n5);
        n3 = this.v[3];
        if (n3 > 0) {
            this.w = new char[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.w[n2] = dataInputStream.readChar();
            }
        }
        if ((n3 = this.v[4]) > 0) {
            this.x = new char[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.x[n2] = dataInputStream.readChar();
            }
        }
    }

    public final void a(lf lf2) {
        for (gl gl2 : this.y) {
            if (gl2.d) break;
            lf2.e(gl2.a);
        }
    }

    private static final int i(int n2) {
        return n2 >> 5;
    }

    private static final boolean j(int n2) {
        return (n2 & 0x10) != 0;
    }

    private static final boolean c(int n2, int n3) {
        return (n2 & 1 << n3) != 0;
    }

    private static final byte d(int n2, int n3) {
        return i[n2 & (1 << n3) - 1];
    }

    private final long a(int n2, int n3, int n4) {
        long l2;
        if ((n2 & 0x100) == 0) {
            l2 = this.w[n4 += ha.d(n2, n3)];
        } else {
            n4 += 2 * ha.d(n2, n3);
            l2 = this.w[n4++];
            l2 = l2 << 16 | (long)this.w[n4];
        }
        return l2 | (long)n4 << 32;
    }

    private final int b(int n2, int n3, int n4) {
        int n5;
        if ((n2 & 0x100) == 0) {
            n5 = this.w[n4 += ha.d(n2, n3)];
        } else {
            n4 += 2 * ha.d(n2, n3);
            n5 = this.w[n4++];
            n5 = n5 << 16 | this.w[n4];
        }
        return n5;
    }

    public final int a(int n2) {
        int n3 = this.y.a(n2);
        if (!ha.j(n3)) {
            if (ha.k(n3) >= 2) {
                n2 += ha.m(n3);
            }
        } else {
            char c2;
            int n4 = ha.i(n3);
            if (ha.c(c2 = this.w[n4++], 0)) {
                n2 = this.b(c2, 0, n4);
            }
        }
        return n2;
    }

    public final int b(int n2) {
        int n3 = this.y.a(n2);
        if (!ha.j(n3)) {
            if (ha.k(n3) == 1) {
                n2 += ha.m(n3);
            }
        } else {
            char c2;
            int n4 = ha.i(n3);
            if (ha.c(c2 = this.w[n4++], 2)) {
                n2 = this.b(c2, 2, n4);
            }
        }
        return n2;
    }

    public final int c(int n2) {
        int n3 = this.y.a(n2);
        if (!ha.j(n3)) {
            if (ha.k(n3) == 1) {
                n2 += ha.m(n3);
            }
        } else {
            int n4;
            char c2;
            int n5 = ha.i(n3);
            if (ha.c(c2 = this.w[n5++], 3)) {
                n4 = 3;
            } else if (ha.c(c2, 2)) {
                n4 = 2;
            } else {
                return n2;
            }
            n2 = this.b(c2, n4, n5);
        }
        return n2;
    }

    public final void a(int n2, lf lf2) {
        switch (n2) {
            case 73: {
                lf2.e(105);
                return;
            }
            case 105: {
                lf2.e(73);
                return;
            }
            case 304: {
                lf2.a((CharSequence)n);
                return;
            }
            case 305: {
                return;
            }
        }
        int n3 = this.y.a(n2);
        if (!ha.j(n3)) {
            int n4;
            if (ha.k(n3) != 0 && (n4 = ha.m(n3)) != 0) {
                lf2.e(n2 + n4);
            }
        } else {
            int n5;
            int n6;
            long l2;
            int n7;
            int n8 = ha.i(n3);
            char c2 = this.w[n8++];
            int n9 = n8;
            for (n7 = 0; n7 <= 3; ++n7) {
                if (!ha.c(c2, n7)) continue;
                n8 = n9;
                n2 = this.b(c2, n7, n8);
                lf2.e(n2);
            }
            if (ha.c(c2, 6)) {
                n8 = n9;
                l2 = this.a((int)c2, 6, n8);
                n6 = (int)l2 & 0xF;
                n5 = (int)(l2 >> 32) + 1;
            } else {
                n6 = 0;
                n5 = 0;
            }
            if (ha.c(c2, 7)) {
                n8 = n9;
                l2 = this.a((int)c2, 7, n8);
                int n10 = (int)l2;
                n8 = (int)(l2 >> 32) + 1;
                n8 += (n10 &= 0xFFFF) & 0xF;
                int n11 = (n10 >>= 4) & 0xF;
                if (n11 != 0) {
                    lf2.a((CharSequence)new String(this.w, n8, n11));
                    n8 += n11;
                }
                n8 += (n10 >>= 4) & 0xF;
                n5 = n8 += (n10 >>= 4);
            }
            for (n7 = 0; n7 < n6; n7 += kx.a(n2)) {
                n2 = kx.a(this.w, n5, this.w.length, n7);
                lf2.e(n2);
            }
        }
    }

    private final int a(String string, int n2, int n3) {
        int n4 = string.length();
        n3 -= n4;
        int n5 = 0;
        do {
            char c2;
            int n6 = string.charAt(n5++);
            if ((c2 = this.x[n2++]) == '\u0000') {
                return 1;
            }
            if ((n6 -= c2) == 0) continue;
            return n6;
        } while (--n4 > 0);
        if (n3 == 0 || this.x[n2] == '\u0000') {
            return 0;
        }
        return -n3;
    }

    public final boolean a(String string, lf lf2) {
        if (this.x == null || string == null) {
            return false;
        }
        int n2 = string.length();
        if (n2 <= 1) {
            return false;
        }
        int n3 = this.x[0];
        char c2 = this.x[1];
        int n4 = this.x[2];
        if (n2 > n4) {
            return false;
        }
        int n5 = 0;
        int n6 = n3;
        while (n5 < n6) {
            int n7 = (n5 + n6) / 2;
            int n8 = (n7 + 1) * c2;
            int n9 = this.a(string, n8, n4);
            if (n9 == 0) {
                int n10;
                for (n7 = n4; n7 < c2 && this.x[n8 + n7] != '\u0000'; n7 += kx.a(n10)) {
                    n10 = kx.a(this.x, n8, this.x.length, n7);
                    lf2.e(n10);
                    this.a(n10, lf2);
                }
                return true;
            }
            if (n9 < 0) {
                n6 = n7;
                continue;
            }
            n5 = n7 + 1;
        }
        return false;
    }

    public final int d(int n2) {
        return ha.k(this.y.a(n2));
    }

    public final int e(int n2) {
        return ha.l(this.y.a(n2));
    }

    public final int f(int n2) {
        int n3 = this.y.a(n2);
        if (!ha.j(n3)) {
            return n3 & 0x60;
        }
        return this.w[ha.i(n3)] >> 7 & 0x60;
    }

    public final boolean g(int n2) {
        return this.f(n2) == 32;
    }

    public final boolean h(int n2) {
        return (this.y.a(n2) & 8) != 0;
    }

    private static final int a(dn dn2, int[] arrn) {
        int n2;
        if (arrn != null && (n2 = arrn[0]) != 0) {
            return n2;
        }
        n2 = 1;
        String string = dn2.f();
        if (string.equals("tr") || string.equals("tur") || string.equals("az") || string.equals("aze")) {
            n2 = 2;
        } else if (string.equals("lt") || string.equals("lit")) {
            n2 = 3;
        }
        if (arrn != null) {
            arrn[0] = n2;
        }
        return n2;
    }

    private final boolean a(hc hc2, int n2) {
        int n3;
        if (hc2 == null) {
            return false;
        }
        hc2.a(n2);
        while ((n3 = hc2.a()) >= 0) {
            int n4 = this.e(n3);
            if ((n4 & 4) != 0) continue;
            return n4 != 0;
        }
        return false;
    }

    private final boolean a(hc hc2) {
        int n2;
        if (hc2 == null) {
            return false;
        }
        hc2.a(-1);
        while ((n2 = hc2.a()) >= 0) {
            int n3 = this.f(n2);
            if (n3 == 32) {
                return true;
            }
            if (n3 == 96) continue;
            return false;
        }
        return false;
    }

    private final boolean b(hc hc2) {
        int n2;
        if (hc2 == null) {
            return false;
        }
        hc2.a(-1);
        while ((n2 = hc2.a()) >= 0) {
            if (n2 == 73) {
                return true;
            }
            int n3 = this.f(n2);
            if (n3 == 96) continue;
            return false;
        }
        return false;
    }

    private final boolean c(hc hc2) {
        int n2;
        if (hc2 == null) {
            return false;
        }
        hc2.a(1);
        while ((n2 = hc2.a()) >= 0) {
            int n3 = this.f(n2);
            if (n3 == 64) {
                return true;
            }
            if (n3 == 96) continue;
            return false;
        }
        return false;
    }

    private final boolean d(hc hc2) {
        int n2;
        if (hc2 == null) {
            return false;
        }
        hc2.a(1);
        while ((n2 = hc2.a()) >= 0) {
            if (n2 == 775) {
                return true;
            }
            int n3 = this.f(n2);
            if (n3 == 96) continue;
            return false;
        }
        return false;
    }

    public final int a(int n2, hc hc2, StringBuilder stringBuilder, dn dn2, int[] arrn) {
        int n3 = n2;
        int n4 = this.y.a(n2);
        if (!ha.j(n4)) {
            if (ha.k(n4) >= 2) {
                n3 = n2 + ha.m(n4);
            }
        } else {
            long l2;
            int n5;
            int n6 = ha.i(n4);
            char c2 = this.w[n6++];
            int n7 = n6;
            if ((c2 & 0x4000) != 0) {
                int n8 = ha.a(dn2, arrn);
                if (n8 == 3 && ((n2 == 73 || n2 == 74 || n2 == 302) && this.c(hc2) || n2 == 204 || n2 == 205 || n2 == 296)) {
                    switch (n2) {
                        case 73: {
                            stringBuilder.append(n);
                            return 2;
                        }
                        case 74: {
                            stringBuilder.append(o);
                            return 2;
                        }
                        case 302: {
                            stringBuilder.append(p);
                            return 2;
                        }
                        case 204: {
                            stringBuilder.append(q);
                            return 3;
                        }
                        case 205: {
                            stringBuilder.append(r);
                            return 3;
                        }
                        case 296: {
                            stringBuilder.append(s);
                            return 3;
                        }
                    }
                    return 0;
                }
                if (n8 == 2 && n2 == 304) {
                    return 105;
                }
                if (n8 == 2 && n2 == 775 && this.b(hc2)) {
                    return 0;
                }
                if (n8 == 2 && n2 == 73 && !this.d(hc2)) {
                    return 305;
                }
                if (n2 == 304) {
                    stringBuilder.append(n);
                    return 2;
                }
                if (n2 == 931 && !this.a(hc2, 1) && this.a(hc2, -1)) {
                    return 962;
                }
            } else if (ha.c(c2, 7) && (n5 = (int)(l2 = this.a((int)c2, 7, n6)) & 0xF) != 0) {
                n6 = (int)(l2 >> 32) + 1;
                stringBuilder.append(this.w, n6, n5);
                return n5;
            }
            if (ha.c(c2, 0)) {
                n3 = this.b(c2, 0, n7);
            }
        }
        return n3 == n2 ? ~n3 : n3;
    }

    private final int a(int n2, hc hc2, StringBuilder stringBuilder, dn dn2, int[] arrn, boolean bl2) {
        int n3 = n2;
        int n4 = this.y.a(n2);
        if (!ha.j(n4)) {
            if (ha.k(n4) == 1) {
                n3 = n2 + ha.m(n4);
            }
        } else {
            int n5;
            int n6 = ha.i(n4);
            char c2 = this.w[n6++];
            int n7 = n6;
            if ((c2 & 0x4000) != 0) {
                int n8 = ha.a(dn2, arrn);
                if (n8 == 2 && n2 == 105) {
                    return 304;
                }
                if (n8 == 3 && n2 == 775 && this.a(hc2)) {
                    return 0;
                }
            } else if (ha.c(c2, 7)) {
                long l2 = this.a((int)c2, 7, n6);
                int n9 = (int)l2 & 0xFFFF;
                n6 = (int)(l2 >> 32) + 1;
                n6 += n9 & 0xF;
                n6 += (n9 >>= 4) & 0xF;
                n9 >>= 4;
                if (bl2) {
                    n9 &= 0xF;
                } else {
                    n6 += n9 & 0xF;
                    n9 = n9 >> 4 & 0xF;
                }
                if (n9 != 0) {
                    stringBuilder.append(this.w, n6, n9);
                    return n9;
                }
            }
            if (!bl2 && ha.c(c2, 3)) {
                n5 = 3;
            } else if (ha.c(c2, 2)) {
                n5 = 2;
            } else {
                return ~n2;
            }
            n3 = this.b(c2, n5, n7);
        }
        return n3 == n2 ? ~n3 : n3;
    }

    public final int b(int n2, hc hc2, StringBuilder stringBuilder, dn dn2, int[] arrn) {
        return this.a(n2, hc2, stringBuilder, dn2, arrn, true);
    }

    public final int c(int n2, hc hc2, StringBuilder stringBuilder, dn dn2, int[] arrn) {
        return this.a(n2, hc2, stringBuilder, dn2, arrn, false);
    }

    public final int a(int n2, int n3) {
        int n4 = this.y.a(n2);
        if (!ha.j(n4)) {
            if (ha.k(n4) >= 2) {
                n2 += ha.m(n4);
            }
        } else {
            int n5;
            char c2;
            int n6 = ha.i(n4);
            if (((c2 = this.w[n6++]) & 0x8000) != 0) {
                if ((n3 & 0xFF) == 0) {
                    if (n2 == 73) {
                        return 105;
                    }
                    if (n2 == 304) {
                        return n2;
                    }
                } else {
                    if (n2 == 73) {
                        return 305;
                    }
                    if (n2 == 304) {
                        return 105;
                    }
                }
            }
            if (ha.c(c2, 1)) {
                n5 = 1;
            } else if (ha.c(c2, 0)) {
                n5 = 0;
            } else {
                return n2;
            }
            n2 = this.b(c2, n5, n6);
        }
        return n2;
    }

    public final int a(int n2, StringBuilder stringBuilder, int n3) {
        int n4 = n2;
        int n5 = this.y.a(n2);
        if (!ha.j(n5)) {
            if (ha.k(n5) >= 2) {
                n4 = n2 + ha.m(n5);
            }
        } else {
            int n6;
            int n7 = ha.i(n5);
            char c2 = this.w[n7++];
            int n8 = n7;
            if ((c2 & 0x8000) != 0) {
                if ((n3 & 0xFF) == 0) {
                    if (n2 == 73) {
                        return 105;
                    }
                    if (n2 == 304) {
                        stringBuilder.append(n);
                        return 2;
                    }
                } else {
                    if (n2 == 73) {
                        return 305;
                    }
                    if (n2 == 304) {
                        return 105;
                    }
                }
            } else if (ha.c(c2, 7)) {
                long l2 = this.a((int)c2, 7, n7);
                int n9 = (int)l2 & 0xFFFF;
                n7 = (int)(l2 >> 32) + 1;
                n7 += n9 & 0xF;
                if ((n9 = n9 >> 4 & 0xF) != 0) {
                    stringBuilder.append(this.w, n7, n9);
                    return n9;
                }
            }
            if (ha.c(c2, 1)) {
                n6 = 1;
            } else if (ha.c(c2, 0)) {
                n6 = 0;
            } else {
                return ~n2;
            }
            n4 = this.b(c2, n6, n8);
        }
        return n4 == n2 ? ~n4 : n4;
    }

    public final boolean b(int n2, int n3) {
        switch (n3) {
            case 22: {
                return 1 == this.d(n2);
            }
            case 30: {
                return 2 == this.d(n2);
            }
            case 27: {
                return this.g(n2);
            }
            case 34: {
                return this.h(n2);
            }
            case 49: {
                return 0 != this.d(n2);
            }
            case 50: {
                return this.e(n2) >> 2 != 0;
            }
            case 51: {
                b.setLength(0);
                return this.a(n2, null, b, dn.v, u) >= 0;
            }
            case 52: {
                b.setLength(0);
                return this.b(n2, null, b, dn.v, u) >= 0;
            }
            case 53: {
                b.setLength(0);
                return this.c(n2, null, b, dn.v, u) >= 0;
            }
            case 55: {
                b.setLength(0);
                return this.a(n2, null, b, dn.v, u) >= 0 || this.b(n2, null, b, dn.v, u) >= 0 || this.c(n2, null, b, dn.v, u) >= 0;
            }
        }
        return false;
    }

    private static final int k(int n2) {
        return n2 & 3;
    }

    private static final int l(int n2) {
        return n2 & 7;
    }

    private static final int m(int n2) {
        return (short)n2 >> 7;
    }

    static {
        try {
            h = new ha();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

