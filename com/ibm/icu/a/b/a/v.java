/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.w;
import java.util.Locale;

public class v {
    public static final Locale a(String string) {
        String string2 = string;
        String string3 = "";
        String string4 = "";
        int n2 = string2.indexOf("_");
        if (n2 != -1) {
            string3 = string2.substring(n2 + 1);
            string2 = string2.substring(0, n2);
        }
        if ((n2 = string3.indexOf("_")) != -1) {
            string4 = string3.substring(n2 + 1);
            string3 = string3.substring(0, n2);
        }
        return new Locale(string2, string3, string4);
    }

    public static String a(long l2, w w2) {
        int n2;
        if (l2 < 0L) {
            l2 = -l2;
        }
        if (l2 <= 10L) {
            if (l2 == 2L) {
                return String.valueOf(w2.d);
            }
            return String.valueOf(w2.a[(int)l2]);
        }
        char[] arrc = new char[40];
        char[] arrc2 = String.valueOf(l2).toCharArray();
        boolean bl2 = true;
        boolean bl3 = false;
        int n3 = arrc.length;
        int n4 = arrc2.length;
        int n5 = -1;
        int n6 = -1;
        while (--n4 >= 0) {
            if (n5 == -1) {
                if (n6 != -1) {
                    arrc[--n3] = w2.c[n6];
                    bl2 = true;
                    bl3 = false;
                }
                ++n5;
            } else {
                arrc[--n3] = w2.b[n5++];
                if (n5 == 3) {
                    n5 = -1;
                    ++n6;
                }
            }
            n2 = arrc2[n4] - 48;
            if (n2 == 0) {
                if (n3 < arrc.length - 1 && n5 != 0) {
                    arrc[n3] = 42;
                }
                if (bl2 || bl3) {
                    arrc[--n3] = 42;
                    continue;
                }
                arrc[--n3] = w2.a[0];
                bl2 = true;
                bl3 = n5 == 1;
                continue;
            }
            bl2 = false;
            arrc[--n3] = w2.a[n2];
        }
        if (l2 > 1000000L) {
            n4 = 1;
            n5 = arrc.length - 3;
            while (arrc[n5] != '0') {
                int n7 = n4 = n4 == 0 ? 1 : 0;
                if ((n5 -= 8) > n3) continue;
            }
            n5 = arrc.length - 7;
            do {
                if (arrc[n5] == w2.a[0] && n4 == 0) {
                    arrc[n5] = 42;
                }
                int n8 = n4 = n4 == 0 ? 1 : 0;
            } while ((n5 -= 8) > n3);
            if (l2 >= 100000000L) {
                n5 = arrc.length - 8;
                do {
                    n6 = 1;
                    int n9 = Math.max(n3 - 1, n5 - 8);
                    for (n2 = n5 - 1; n2 > n9; --n2) {
                        if (arrc[n2] == '*') continue;
                        n6 = 0;
                        break;
                    }
                    if (n6 == 0) continue;
                    arrc[n5] = arrc[n5 + 1] != '*' && arrc[n5 + 1] != w2.a[0] ? w2.a[0] : 42;
                } while ((n5 -= 8) > n3);
            }
        }
        for (n4 = n3; n4 < arrc.length; ++n4) {
            if (arrc[n4] != w2.a[2] || n4 < arrc.length - 1 && arrc[n4 + 1] == w2.b[0] || n4 > n3 && (arrc[n4 - 1] == w2.b[0] || arrc[n4 - 1] == w2.a[0] || arrc[n4 - 1] == '*')) continue;
            arrc[n4] = w2.d;
        }
        if (arrc[n3] == w2.a[1] && (w2.e || arrc[n3 + 1] == w2.b[0])) {
            ++n3;
        }
        n4 = n3;
        for (n5 = n3; n5 < arrc.length; ++n5) {
            if (arrc[n5] == '*') continue;
            arrc[n4++] = arrc[n5];
        }
        return new String(arrc, n3, n4 - n3);
    }
}

