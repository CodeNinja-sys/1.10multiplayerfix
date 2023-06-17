/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.b;

import com.ibm.icu.a.ck;
import com.ibm.icu.a.di;
import com.ibm.icu.a.gx;
import com.ibm.icu.a.ha;
import com.ibm.icu.a.hg;
import com.ibm.icu.a.hk;
import com.ibm.icu.a.ip;
import com.ibm.icu.a.iq;
import com.ibm.icu.b.e;
import com.ibm.icu.b.n;
import com.ibm.icu.b.o;
import com.ibm.icu.b.v;
import com.ibm.icu.b.w;
import com.ibm.icu.b.x;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.u;
import com.ibm.icu.util.VersionInfo;
import com.ibm.icu.util.ci;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.ed;
import java.util.Locale;

public final class b
implements v,
w {
    public static final int a = 0;
    public static final int b = 0x10FFFF;
    public static final int c = 65536;
    public static final int d = 65533;
    public static final double e = -1.23456789E8;
    public static final int f = 2;
    public static final int g = 36;
    public static final int h = 256;
    public static final int i = 512;
    public static final int j = 0;
    public static final int k = 1;
    public static final char l = '\ud800';
    public static final char m = '\udbff';
    public static final char n = '\udc00';
    public static final char o = '\udfff';
    public static final char p = '\ud800';
    public static final char q = '\udfff';
    public static final int r = 65536;
    public static final int s = 0x10FFFF;
    public static final int t = 0;
    private static final int ai = 65535;
    private static final int aj = 160;
    private static final int ak = 8199;
    private static final int al = 8239;
    private static final int am = 12295;
    private static final int an = 19968;
    private static final int ao = 20108;
    private static final int ap = 19977;
    private static final int aq = 22235;
    private static final int ar = 20116;
    private static final int as = 20845;
    private static final int at = 19971;
    private static final int au = 20843;
    private static final int av = 20061;
    private static final int aw = 159;
    private static final int ax = 31;
    private static final int ay = 127;
    private static final int az = 38646;
    private static final int aA = 22777;
    private static final int aB = 36019;
    private static final int aC = 21443;
    private static final int aD = 32902;
    private static final int aE = 20237;
    private static final int aF = 38520;
    private static final int aG = 26578;
    private static final int aH = 25420;
    private static final int aI = 29590;
    private static final int aJ = 21313;
    private static final int aK = 25342;
    private static final int aL = 30334;
    private static final int aM = 20336;
    private static final int aN = 21315;
    private static final int aO = 20191;
    private static final int aP = 33356;
    private static final int aQ = 20740;

    public static int a(int n2, int n3) {
        if (2 <= n3 && n3 <= 36) {
            int n4 = com.ibm.icu.b.b.a(n2);
            if (n4 < 0) {
                n4 = hk.h(n2);
            }
            return n4 < n3 ? n4 : -1;
        }
        return -1;
    }

    public static int a(int n2) {
        return hk.a.i(n2);
    }

    public static int b(int n2) {
        return hk.a.j(n2);
    }

    public static double c(int n2) {
        return hk.a.k(n2);
    }

    public static boolean d(int n2) {
        return n2 <= 32 && (n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13);
    }

    public static int e(int n2) {
        return hk.a.c(n2);
    }

    public static boolean f(int n2) {
        return com.ibm.icu.b.b.e(n2) != 0;
    }

    public static boolean g(int n2) {
        return com.ibm.icu.b.b.e(n2) == 9;
    }

    public static boolean h(int n2) {
        return n2 >= 0 && n2 <= 159 && (n2 <= 31 || n2 >= 127);
    }

    public static boolean i(int n2) {
        return (1 << com.ibm.icu.b.b.e(n2) & 0x3E) != 0;
    }

    public static boolean j(int n2) {
        return (1 << com.ibm.icu.b.b.e(n2) & 0x23E) != 0;
    }

    public static boolean k(int n2) {
        return com.ibm.icu.b.b.m(n2);
    }

    public static boolean l(int n2) {
        return com.ibm.icu.b.b.n(n2);
    }

    public static boolean m(int n2) {
        return Character.isJavaIdentifierStart((char)n2);
    }

    public static boolean n(int n2) {
        return Character.isJavaIdentifierPart((char)n2);
    }

    public static boolean o(int n2) {
        return com.ibm.icu.b.b.e(n2) == 2;
    }

    public static boolean p(int n2) {
        return (1 << com.ibm.icu.b.b.e(n2) & 0x7000) != 0 && n2 != 160 && n2 != 8199 && n2 != 8239 || n2 >= 9 && n2 <= 13 || n2 >= 28 && n2 <= 31;
    }

    public static boolean q(int n2) {
        return (1 << com.ibm.icu.b.b.e(n2) & 0x7000) != 0;
    }

    public static boolean r(int n2) {
        return com.ibm.icu.b.b.e(n2) == 3;
    }

    public static boolean s(int n2) {
        return (1 << com.ibm.icu.b.b.e(n2) & 0x40077E) != 0 || com.ibm.icu.b.b.u(n2);
    }

    public static boolean t(int n2) {
        return (1 << com.ibm.icu.b.b.e(n2) & 0x43E) != 0;
    }

    public static boolean u(int n2) {
        if (n2 <= 159) {
            return !(!com.ibm.icu.b.b.h(n2) || n2 >= 9 && n2 <= 13 || n2 >= 28 && n2 <= 31);
        }
        return com.ibm.icu.b.b.e(n2) == 16;
    }

    public static boolean v(int n2) {
        return com.ibm.icu.b.b.e(n2) == 1;
    }

    public static int w(int n2) {
        return ha.h.a(n2);
    }

    public static String x(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            return null;
        }
        if (n2 < 65536) {
            return String.valueOf((char)n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(kx.b(n2));
        stringBuilder.append(kx.c(n2));
        return stringBuilder.toString();
    }

    public static int y(int n2) {
        return ha.h.c(n2);
    }

    public static int z(int n2) {
        return ha.h.b(n2);
    }

    public static boolean A(int n2) {
        return n2 >= 65536 && n2 <= 0x10FFFF;
    }

    public static boolean B(int n2) {
        return n2 >= 0 && n2 <= 65535;
    }

    public static boolean C(int n2) {
        int n3 = com.ibm.icu.b.b.e(n2);
        return n3 != 0 && n3 != 15 && n3 != 16 && n3 != 17 && n3 != 18 && n3 != 0;
    }

    public static boolean D(int n2) {
        int n3 = com.ibm.icu.b.b.e(n2);
        return n3 == 9 || n3 == 11 || n3 == 10 || n3 == 1 || n3 == 2 || n3 == 3 || n3 == 4 || n3 == 5 || n3 == 6 || n3 == 7 || n3 == 8;
    }

    public static int E(int n2) {
        return gx.a.b(n2);
    }

    public static boolean F(int n2) {
        return gx.a.c(n2);
    }

    public static int G(int n2) {
        return gx.a.d(n2);
    }

    public static int H(int n2) {
        return di.a().c.f(n2);
    }

    public static boolean I(int n2) {
        if (n2 < 0) {
            return false;
        }
        if (n2 < 55296) {
            return true;
        }
        if (n2 <= 57343) {
            return false;
        }
        if (ip.a(n2)) {
            return false;
        }
        return n2 <= 0x10FFFF;
    }

    public static boolean a(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = kx.a(string, i2);
            if (!com.ibm.icu.b.b.I(n3)) {
                return false;
            }
            if (!com.ibm.icu.b.b.A(n3)) continue;
            ++i2;
        }
        return true;
    }

    public static VersionInfo a() {
        return hk.a.c;
    }

    public static String J(int n2) {
        return hg.a.a(n2, 0);
    }

    public static String a(String string, String string2) {
        int n2;
        if (string.length() == 1) {
            return com.ibm.icu.b.b.J(string.charAt(0));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); i2 += kx.a(n2)) {
            n2 = kx.a(string, i2);
            if (i2 != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(com.ibm.icu.b.b.J(n2));
        }
        return stringBuilder.toString();
    }

    public static String K(int n2) {
        return null;
    }

    public static String L(int n2) {
        return hg.a.a(n2, 2);
    }

    public static String M(int n2) {
        return hg.a.a(n2, 3);
    }

    public static String N(int n2) {
        return null;
    }

    public static int b(String string) {
        return hg.a.a(0, string);
    }

    public static int c(String string) {
        return -1;
    }

    public static int d(String string) {
        return hg.a.a(2, string);
    }

    public static int e(String string) {
        return hg.a.a(3, string);
    }

    public static String b(int n2, int n3) {
        return iq.a.a(n2, n3);
    }

    public static int a(CharSequence charSequence) {
        int n2 = iq.a.a(charSequence);
        if (n2 == -1) {
            throw new ck("Invalid name: " + charSequence);
        }
        return n2;
    }

    public static String a(int n2, int n3, int n4) {
        if ((n2 == 4098 || n2 == 4112 || n2 == 4113) && n3 >= com.ibm.icu.b.b.U(4098) && n3 <= com.ibm.icu.b.b.V(4098) && n4 >= 0 && n4 < 2) {
            try {
                return iq.a.a(n2, n3, n4);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        return iq.a.a(n2, n3, n4);
    }

    public static int a(int n2, CharSequence charSequence) {
        int n3 = iq.a.a(n2, charSequence);
        if (n3 == -1) {
            throw new ck("Invalid name: " + charSequence);
        }
        return n3;
    }

    public static int a(char c2, char c3) {
        if (kx.c(c2) && kx.b(c3)) {
            return hk.a(c2, c3);
        }
        throw new IllegalArgumentException("Illegal surrogate characters");
    }

    public static int a(char c2) {
        if (com.ibm.icu.b.b.I(c2)) {
            return c2;
        }
        throw new IllegalArgumentException("Illegal codepoint");
    }

    public static String f(String string) {
        return com.ibm.icu.b.b.a(dn.b(), string);
    }

    public static String g(String string) {
        return com.ibm.icu.b.b.b(dn.b(), string);
    }

    public static String a(String string, u u2) {
        return com.ibm.icu.b.b.a(dn.b(), string, u2);
    }

    public static String a(Locale locale, String string) {
        return com.ibm.icu.b.b.a(dn.a(locale), string);
    }

    public static String a(dn dn2, String string) {
        int n2;
        n n3 = new n(string);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int[] arrn = new int[1];
        if (dn2 == null) {
            dn2 = dn.b();
        }
        arrn[0] = 0;
        while ((n2 = n3.c()) >= 0) {
            if ((n2 = ha.h.b(n2, n3, stringBuilder, dn2, arrn)) < 0) {
                n2 ^= 0xFFFFFFFF;
            } else if (n2 <= 31) continue;
            stringBuilder.appendCodePoint(n2);
        }
        return stringBuilder.toString();
    }

    public static String b(Locale locale, String string) {
        return com.ibm.icu.b.b.b(dn.a(locale), string);
    }

    public static String b(dn dn2, String string) {
        int n2;
        n n3 = new n(string);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int[] arrn = new int[1];
        if (dn2 == null) {
            dn2 = dn.b();
        }
        arrn[0] = 0;
        while ((n2 = n3.c()) >= 0) {
            if ((n2 = ha.h.a(n2, n3, stringBuilder, dn2, arrn)) < 0) {
                n2 ^= 0xFFFFFFFF;
            } else if (n2 <= 31) continue;
            stringBuilder.appendCodePoint(n2);
        }
        return stringBuilder.toString();
    }

    public static String a(Locale locale, String string, u u2) {
        return com.ibm.icu.b.b.a(dn.a(locale), string, u2);
    }

    public static String a(dn dn2, String string, u u2) {
        return com.ibm.icu.b.b.a(dn2, string, u2, 0);
    }

    public static String a(dn dn2, String string, u u2, int n2) {
        n n3 = new n(string);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int[] arrn = new int[1];
        int n4 = string.length();
        if (dn2 == null) {
            dn2 = dn.b();
        }
        arrn[0] = 0;
        if (u2 == null) {
            u2 = u.a(dn2);
        }
        u2.a(string);
        boolean bl2 = dn2.f().equals("nl");
        boolean bl3 = true;
        int n5 = 0;
        boolean bl4 = true;
        while (n5 < n4) {
            int n6;
            if (bl4) {
                bl4 = false;
                n6 = u2.a();
            } else {
                n6 = u2.c();
            }
            if (n6 == -1 || n6 > n4) {
                n6 = n4;
            }
            if (n5 < n6) {
                int n7;
                n3.b(n6);
                int n8 = n3.c();
                if ((n2 & 0x200) == 0 && 0 == ha.h.d(n8)) {
                    while ((n8 = n3.c()) >= 0 && 0 == ha.h.d(n8)) {
                    }
                    n7 = n3.d();
                    if (n5 < n7) {
                        stringBuilder.append(string, n5, n7);
                    }
                } else {
                    n7 = n5;
                }
                if (n7 < n6) {
                    bl3 = true;
                    n8 = ha.h.c(n8, n3, stringBuilder, dn2, arrn);
                    while (true) {
                        if (n8 < 0) {
                            stringBuilder.appendCodePoint(n8 ^= 0xFFFFFFFF);
                        } else if (n8 > 31) {
                            stringBuilder.appendCodePoint(n8);
                        }
                        if ((n2 & 0x100) != 0) {
                            int n9 = n3.e();
                            if (n9 < n6) {
                                String string2 = string.substring(n9, n6);
                                if (bl2 && n8 == 73 && string2.startsWith("j")) {
                                    string2 = "J" + string2.substring(1);
                                }
                                stringBuilder.append(string2);
                            }
                            n3.b();
                            break;
                        }
                        int n10 = n3.c();
                        if (n10 < 0) break;
                        if (bl2 && (n10 == 74 || n10 == 106) && n8 == 73 && bl3) {
                            n8 = 74;
                            bl3 = false;
                            continue;
                        }
                        n8 = ha.h.a(n10, n3, stringBuilder, dn2, arrn);
                    }
                }
            }
            n5 = n6;
        }
        return stringBuilder.toString();
    }

    public static int a(int n2, boolean bl2) {
        return com.ibm.icu.b.b.c(n2, bl2 ? 0 : 1);
    }

    public static String a(String string, boolean bl2) {
        return com.ibm.icu.b.b.a(string, bl2 ? 0 : 1);
    }

    public static int c(int n2, int n3) {
        return ha.h.a(n2, n3);
    }

    public static final String a(String string, int n2) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n3 = string.length();
        int n4 = 0;
        while (n4 < n3) {
            int n5 = kx.a(string, n4);
            n4 += kx.a(n5);
            if ((n5 = ha.h.a(n5, stringBuilder, n2)) < 0) {
                n5 ^= 0xFFFFFFFF;
            } else if (n5 <= 31) continue;
            stringBuilder.appendCodePoint(n5);
        }
        return stringBuilder.toString();
    }

    public static int O(int n2) {
        switch (n2) {
            case 12295: 
            case 38646: {
                return 0;
            }
            case 19968: 
            case 22777: {
                return 1;
            }
            case 20108: 
            case 36019: {
                return 2;
            }
            case 19977: 
            case 21443: {
                return 3;
            }
            case 22235: 
            case 32902: {
                return 4;
            }
            case 20116: 
            case 20237: {
                return 5;
            }
            case 20845: 
            case 38520: {
                return 6;
            }
            case 19971: 
            case 26578: {
                return 7;
            }
            case 20843: 
            case 25420: {
                return 8;
            }
            case 20061: 
            case 29590: {
                return 9;
            }
            case 21313: 
            case 25342: {
                return 10;
            }
            case 20336: 
            case 30334: {
                return 100;
            }
            case 20191: 
            case 21315: {
                return 1000;
            }
            case 33356: {
                return 10000;
            }
            case 20740: {
                return 100000000;
            }
        }
        return -1;
    }

    public static ci b() {
        return new o();
    }

    public static ed c() {
        return new x(hg.a, 0);
    }

    public static ed d() {
        return new e(null);
    }

    public static ed e() {
        return new x(hg.a, 2);
    }

    public static VersionInfo P(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Codepoint out of bounds");
        }
        return hk.a.b(n2);
    }

    public static boolean d(int n2, int n3) {
        return hk.a.b(n2, n3);
    }

    public static boolean Q(int n2) {
        return com.ibm.icu.b.b.d(n2, 0);
    }

    public static boolean R(int n2) {
        return com.ibm.icu.b.b.d(n2, 22);
    }

    public static boolean S(int n2) {
        return com.ibm.icu.b.b.d(n2, 30);
    }

    public static boolean T(int n2) {
        return com.ibm.icu.b.b.d(n2, 31);
    }

    public static int e(int n2, int n3) {
        return hk.a.c(n2, n3);
    }

    public static String b(int n2, int n3, int n4) {
        if (n2 >= 0 && n2 < 57 || n2 >= 4096 && n2 < 4117) {
            return com.ibm.icu.b.b.a(n2, com.ibm.icu.b.b.e(n3, n2), n4);
        }
        if (n2 == 12288) {
            return String.valueOf(com.ibm.icu.b.b.c(n3));
        }
        switch (n2) {
            case 16384: {
                return com.ibm.icu.b.b.P(n3).toString();
            }
            case 16387: {
                return com.ibm.icu.b.b.N(n3);
            }
            case 16385: {
                return kx.d(com.ibm.icu.b.b.G(n3));
            }
            case 16386: {
                return com.ibm.icu.b.b.a(kx.d(n3), true);
            }
            case 16388: {
                return com.ibm.icu.b.b.g(kx.d(n3));
            }
            case 16389: {
                return com.ibm.icu.b.b.J(n3);
            }
            case 16390: {
                return kx.d(com.ibm.icu.b.b.a(n3, true));
            }
            case 16391: {
                return kx.d(com.ibm.icu.b.b.w(n3));
            }
            case 16392: {
                return kx.d(com.ibm.icu.b.b.y(n3));
            }
            case 16393: {
                return kx.d(com.ibm.icu.b.b.z(n3));
            }
            case 16394: {
                return com.ibm.icu.b.b.a(kx.d(n3), null);
            }
            case 16395: {
                return com.ibm.icu.b.b.K(n3);
            }
            case 16396: {
                return com.ibm.icu.b.b.f(kx.d(n3));
            }
        }
        throw new IllegalArgumentException("Illegal Property Enum");
    }

    public static int U(int n2) {
        return 0;
    }

    public static int V(int n2) {
        return hk.a.d(n2);
    }

    public static char f(int n2, int n3) {
        return Character.forDigit(n2, n3);
    }

    public static final boolean W(int n2) {
        return n2 >= 0 && n2 <= 0x10FFFF;
    }

    public static final boolean X(int n2) {
        return n2 >= 65536 && n2 <= 0x10FFFF;
    }

    public static boolean b(char c2) {
        return c2 >= '\ud800' && c2 <= '\udbff';
    }

    public static boolean c(char c2) {
        return c2 >= '\udc00' && c2 <= '\udfff';
    }

    public static final boolean b(char c2, char c3) {
        return com.ibm.icu.b.b.b(c2) && com.ibm.icu.b.b.c(c3);
    }

    public static int Y(int n2) {
        return kx.a(n2);
    }

    public static final int c(char c2, char c3) {
        return hk.a(c2, c3);
    }

    public static final int a(CharSequence charSequence, int n2) {
        char c2;
        char c3;
        if (com.ibm.icu.b.b.b(c3 = charSequence.charAt(n2++)) && n2 < charSequence.length() && com.ibm.icu.b.b.c(c2 = charSequence.charAt(n2))) {
            return com.ibm.icu.b.b.c(c3, c2);
        }
        return c3;
    }

    public static final int a(char[] arrc, int n2) {
        char c2;
        char c3;
        if (com.ibm.icu.b.b.b(c3 = arrc[n2++]) && n2 < arrc.length && com.ibm.icu.b.b.c(c2 = arrc[n2])) {
            return com.ibm.icu.b.b.c(c3, c2);
        }
        return c3;
    }

    public static final int a(char[] arrc, int n2, int n3) {
        char c2;
        char c3;
        if (n2 >= n3 || n3 > arrc.length) {
            throw new IndexOutOfBoundsException();
        }
        if (com.ibm.icu.b.b.b(c3 = arrc[n2++]) && n2 < n3 && com.ibm.icu.b.b.c(c2 = arrc[n2])) {
            return com.ibm.icu.b.b.c(c3, c2);
        }
        return c3;
    }

    public static final int b(CharSequence charSequence, int n2) {
        char c2;
        char c3;
        if (com.ibm.icu.b.b.c(c3 = charSequence.charAt(--n2)) && n2 > 0 && com.ibm.icu.b.b.b(c2 = charSequence.charAt(--n2))) {
            return com.ibm.icu.b.b.c(c2, c3);
        }
        return c3;
    }

    public static final int b(char[] arrc, int n2) {
        char c2;
        char c3;
        if (com.ibm.icu.b.b.c(c3 = arrc[--n2]) && n2 > 0 && com.ibm.icu.b.b.b(c2 = arrc[--n2])) {
            return com.ibm.icu.b.b.c(c2, c3);
        }
        return c3;
    }

    public static final int b(char[] arrc, int n2, int n3) {
        char c2;
        char c3;
        if (n2 <= n3 || n3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (com.ibm.icu.b.b.c(c3 = arrc[--n2]) && n2 > n3 && com.ibm.icu.b.b.b(c2 = arrc[--n2])) {
            return com.ibm.icu.b.b.c(c2, c3);
        }
        return c3;
    }

    public static final int a(int n2, char[] arrc, int n3) {
        if (n2 >= 0) {
            if (n2 < 65536) {
                arrc[n3] = (char)n2;
                return 1;
            }
            if (n2 <= 0x10FFFF) {
                arrc[n3] = kx.b(n2);
                arrc[n3 + 1] = kx.c(n2);
                return 2;
            }
        }
        throw new IllegalArgumentException();
    }

    public static final char[] Z(int n2) {
        if (n2 >= 0) {
            if (n2 < 65536) {
                return new char[]{(char)n2};
            }
            if (n2 <= 0x10FFFF) {
                return new char[]{kx.b(n2), kx.c(n2)};
            }
        }
        throw new IllegalArgumentException();
    }

    public static byte aa(int n2) {
        return (byte)com.ibm.icu.b.b.E(n2);
    }

    public static int a(CharSequence charSequence, int n2, int n3) {
        if (n2 < 0 || n3 < n2 || n3 > charSequence.length()) {
            throw new IndexOutOfBoundsException("start (" + n2 + ") or limit (" + n3 + ") invalid or out of range 0, " + charSequence.length());
        }
        int n4 = n3 - n2;
        block0: while (n3 > n2) {
            char c2 = charSequence.charAt(--n3);
            while (c2 >= '\udc00' && c2 <= '\udfff' && n3 > n2) {
                if ((c2 = charSequence.charAt(--n3)) < '\ud800' || c2 > '\udbff') continue;
                --n4;
                continue block0;
            }
        }
        return n4;
    }

    public static int c(char[] arrc, int n2, int n3) {
        if (n2 < 0 || n3 < n2 || n3 > arrc.length) {
            throw new IndexOutOfBoundsException("start (" + n2 + ") or limit (" + n3 + ") invalid or out of range 0, " + arrc.length);
        }
        int n4 = n3 - n2;
        block0: while (n3 > n2) {
            char c2 = arrc[--n3];
            while (c2 >= '\udc00' && c2 <= '\udfff' && n3 > n2) {
                if ((c2 = arrc[--n3]) < '\ud800' || c2 > '\udbff') continue;
                --n4;
                continue block0;
            }
        }
        return n4;
    }

    public static int b(CharSequence charSequence, int n2, int n3) {
        if (n2 < 0 || n2 > charSequence.length()) {
            throw new IndexOutOfBoundsException("index ( " + n2 + ") out of range 0, " + charSequence.length());
        }
        if (n3 < 0) {
            while (++n3 <= 0) {
                char c2 = charSequence.charAt(--n2);
                while (c2 >= '\udc00' && c2 <= '\udfff' && n2 > 0) {
                    if ((c2 = charSequence.charAt(--n2)) >= '\ud800' && c2 <= '\udbff' || ++n3 <= 0) continue;
                    return n2 + 1;
                }
            }
        } else {
            int n4 = charSequence.length();
            while (--n3 >= 0) {
                char c3 = charSequence.charAt(n2++);
                while (c3 >= '\ud800' && c3 <= '\udbff' && n2 < n4) {
                    if ((c3 = charSequence.charAt(n2++)) >= '\udc00' && c3 <= '\udfff' || --n3 >= 0) continue;
                    return n2 - 1;
                }
            }
        }
        return n2;
    }

    public static int a(char[] arrc, int n2, int n3, int n4, int n5) {
        int n6 = n2 + n3;
        if (n2 < 0 || n6 < n2 || n6 > arrc.length || n4 < n2 || n4 > n6) {
            throw new IndexOutOfBoundsException("index ( " + n4 + ") out of range " + n2 + ", " + n6 + " in array 0, " + arrc.length);
        }
        if (n5 < 0) {
            while (++n5 <= 0) {
                char c2 = arrc[--n4];
                if (n4 < n2) {
                    throw new IndexOutOfBoundsException("index ( " + n4 + ") < start (" + n2 + ")");
                }
                while (c2 >= '\udc00' && c2 <= '\udfff' && n4 > n2) {
                    if ((c2 = arrc[--n4]) >= '\ud800' && c2 <= '\udbff' || ++n5 <= 0) continue;
                    return n4 + 1;
                }
            }
        } else {
            while (--n5 >= 0) {
                char c3 = arrc[n4++];
                if (n4 > n6) {
                    throw new IndexOutOfBoundsException("index ( " + n4 + ") > limit (" + n6 + ")");
                }
                while (c3 >= '\ud800' && c3 <= '\udbff' && n4 < n6) {
                    if ((c3 = arrc[n4++]) >= '\udc00' && c3 <= '\udfff' || --n5 >= 0) continue;
                    return n4 - 1;
                }
            }
        }
        return n4;
    }

    private b() {
    }
}

