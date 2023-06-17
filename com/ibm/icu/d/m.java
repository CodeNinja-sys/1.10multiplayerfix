/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.b;
import com.ibm.icu.d.d;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.l;

final class m {
    static final char a = '\u200e';
    static final char b = '\u200f';
    static final int c = 8194;

    m() {
    }

    private static boolean a(int n2) {
        return (1 << n2 & 0x1C0) != 0;
    }

    private static String b(String string, int n2) {
        switch (n2 & 0xA) {
            case 0: {
                return string;
            }
            case 2: {
                int n3;
                StringBuffer stringBuffer = new StringBuffer(string.length());
                int n4 = 0;
                do {
                    n3 = kx.a(string, n4);
                    kx.f(stringBuffer, com.ibm.icu.b.b.G(n3));
                } while ((n4 += kx.a(n3)) < string.length());
                return stringBuffer.toString();
            }
            case 8: {
                StringBuilder stringBuilder = new StringBuilder(string.length());
                int n5 = 0;
                do {
                    char c2;
                    if (d.b(c2 = string.charAt(n5++))) continue;
                    stringBuilder.append(c2);
                } while (n5 < string.length());
                return stringBuilder.toString();
            }
        }
        StringBuffer stringBuffer = new StringBuffer(string.length());
        int n6 = 0;
        do {
            int n7 = kx.a(string, n6);
            n6 += kx.a(n7);
            if (d.b(n7)) continue;
            kx.f(stringBuffer, com.ibm.icu.b.b.G(n7));
        } while (n6 < string.length());
        return stringBuffer.toString();
    }

    private static String b(char[] arrc, int n2, int n3, int n4) {
        return m.b(new String(arrc, n2, n3 - n2), n4);
    }

    static String a(String string, int n2) {
        StringBuffer stringBuffer = new StringBuffer(string.length());
        switch (n2 & 0xB) {
            case 0: {
                int n3 = string.length();
                do {
                    int n4 = n3;
                    n3 -= kx.a(kx.a(string, n3 - 1));
                    stringBuffer.append(string.substring(n3, n4));
                } while (n3 > 0);
                break;
            }
            case 1: {
                int n5 = string.length();
                do {
                    int n6;
                    int n7 = n5;
                    while ((n5 -= kx.a(n6 = kx.a(string, n5 - 1))) > 0 && m.a(com.ibm.icu.b.b.e(n6))) {
                    }
                    stringBuffer.append(string.substring(n5, n7));
                } while (n5 > 0);
                break;
            }
            default: {
                int n8 = string.length();
                do {
                    int n9 = n8;
                    int n10 = kx.a(string, n8 - 1);
                    n8 -= kx.a(n10);
                    if ((n2 & 1) != 0) {
                        while (n8 > 0 && m.a(com.ibm.icu.b.b.e(n10))) {
                            n10 = kx.a(string, n8 - 1);
                            n8 -= kx.a(n10);
                        }
                    }
                    if ((n2 & 8) != 0 && d.b(n10)) continue;
                    int n11 = n8;
                    if ((n2 & 2) != 0) {
                        n10 = com.ibm.icu.b.b.G(n10);
                        kx.f(stringBuffer, n10);
                        n11 += kx.a(n10);
                    }
                    stringBuffer.append(string.substring(n11, n9));
                } while (n8 > 0);
            }
        }
        return stringBuffer.toString();
    }

    static String a(char[] arrc, int n2, int n3, int n4) {
        return m.a(new String(arrc, n2, n3 - n2), n4);
    }

    static String a(d d2, int n2) {
        char[] arrc = d2.ac;
        int n3 = d2.q();
        if ((d2.ao & 1) != 0) {
            n2 |= 4;
            n2 &= 0xFFFFFFF7;
        }
        if ((d2.ao & 2) != 0) {
            n2 |= 8;
            n2 &= 0xFFFFFFFB;
        }
        if (d2.an != 4 && d2.an != 5 && d2.an != 6 && d2.an != 3) {
            n2 &= 0xFFFFFFFB;
        }
        StringBuilder stringBuilder = new StringBuilder((n2 & 4) != 0 ? d2.ae * 2 : d2.ae);
        if ((n2 & 0x10) == 0) {
            if ((n2 & 4) == 0) {
                for (int i2 = 0; i2 < n3; ++i2) {
                    l l2 = d2.o(i2);
                    if (l2.f()) {
                        stringBuilder.append(m.b(arrc, l2.a, l2.b, n2 & 0xFFFFFFFD));
                        continue;
                    }
                    stringBuilder.append(m.a(arrc, l2.a, l2.b, n2));
                }
            } else {
                byte[] arrby = d2.ak;
                for (int i3 = 0; i3 < n3; ++i3) {
                    char c2;
                    l l3 = d2.o(i3);
                    int n4 = 0;
                    n4 = d2.aF[i3].c;
                    if (n4 < 0) {
                        n4 = 0;
                    }
                    if (l3.f()) {
                        if (d2.c() && arrby[l3.a] != 0) {
                            n4 |= 1;
                        }
                        if ((c2 = (n4 & 1) != 0 ? (char)'\u200e' : ((n4 & 4) != 0 ? (char)'\u200f' : '\u0000')) != '\u0000') {
                            stringBuilder.append(c2);
                        }
                        stringBuilder.append(m.b(arrc, l3.a, l3.b, n2 & 0xFFFFFFFD));
                        if (d2.c() && arrby[l3.b - 1] != 0) {
                            n4 |= 2;
                        }
                        if ((c2 = (n4 & 2) != 0 ? (char)'\u200e' : ((n4 & 8) != 0 ? (char)'\u200f' : '\u0000')) == '\u0000') continue;
                        stringBuilder.append(c2);
                        continue;
                    }
                    if (d2.c() && !d2.a(8194, l3.b - 1)) {
                        n4 |= 4;
                    }
                    if ((c2 = (n4 & 1) != 0 ? (char)'\u200e' : ((n4 & 4) != 0 ? (char)'\u200f' : '\u0000')) != '\u0000') {
                        stringBuilder.append(c2);
                    }
                    stringBuilder.append(m.a(arrc, l3.a, l3.b, n2));
                    if (d2.c() && (0x2002 & d.a(arrby[l3.a])) == 0) {
                        n4 |= 8;
                    }
                    if ((c2 = (n4 & 2) != 0 ? (char)'\u200e' : ((n4 & 8) != 0 ? (char)'\u200f' : '\u0000')) == '\u0000') continue;
                    stringBuilder.append(c2);
                }
            }
        } else if ((n2 & 4) == 0) {
            int n5 = n3;
            while (--n5 >= 0) {
                l l4 = d2.o(n5);
                if (l4.f()) {
                    stringBuilder.append(m.a(arrc, l4.a, l4.b, n2 & 0xFFFFFFFD));
                    continue;
                }
                stringBuilder.append(m.b(arrc, l4.a, l4.b, n2));
            }
        } else {
            byte[] arrby = d2.ak;
            int n6 = n3;
            while (--n6 >= 0) {
                l l5 = d2.o(n6);
                if (l5.f()) {
                    if (arrby[l5.b - 1] != 0) {
                        stringBuilder.append('\u200e');
                    }
                    stringBuilder.append(m.a(arrc, l5.a, l5.b, n2 & 0xFFFFFFFD));
                    if (arrby[l5.a] == 0) continue;
                    stringBuilder.append('\u200e');
                    continue;
                }
                if ((0x2002 & d.a(arrby[l5.a])) == 0) {
                    stringBuilder.append('\u200f');
                }
                stringBuilder.append(m.b(arrc, l5.a, l5.b, n2));
                if ((0x2002 & d.a(arrby[l5.b - 1])) != 0) continue;
                stringBuilder.append('\u200f');
            }
        }
        return stringBuilder.toString();
    }
}

