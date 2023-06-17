/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.b.b;
import com.ibm.icu.d.jw;
import com.ibm.icu.d.kx;

public final class ej {
    private static final int b = 36;
    private static final int c = 1;
    private static final int d = 26;
    private static final int e = 38;
    private static final int f = 700;
    private static final int g = 72;
    private static final int h = 128;
    private static final int i = 45;
    private static final int j = 45;
    private static final int k = 48;
    private static final int l = 97;
    private static final int m = 122;
    private static final int n = 65;
    private static final int o = 90;
    private static final int p = 200;
    static final int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private static int a(int n2, int n3, boolean bl2) {
        n2 = bl2 ? (n2 /= 700) : (n2 /= 2);
        n2 += n2 / n3;
        int n4 = 0;
        while (n2 > 455) {
            n2 /= 35;
            n4 += 36;
        }
        return n4 + 36 * n2 / (n2 + 38);
    }

    private static char a(char c2, boolean bl2) {
        if (bl2) {
            if ('a' <= c2 && c2 <= 'z') {
                c2 = (char)(c2 - 32);
            }
        } else if ('A' <= c2 && c2 <= 'Z') {
            c2 = (char)(c2 + 32);
        }
        return c2;
    }

    private static char a(int n2, boolean bl2) {
        if (n2 < 26) {
            if (bl2) {
                return (char)(65 + n2);
            }
            return (char)(97 + n2);
        }
        return (char)(22 + n2);
    }

    public static StringBuilder a(CharSequence charSequence, boolean[] arrbl) {
        int n2;
        int n3;
        int[] arrn = new int[200];
        int n4 = charSequence.length();
        int n5 = 200;
        char[] arrc = new char[n5];
        StringBuilder stringBuilder = new StringBuilder();
        int n6 = 0;
        int n7 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            char c2;
            if (n7 == 200) {
                throw new IndexOutOfBoundsException();
            }
            char c3 = charSequence.charAt(n3);
            if (ej.a(c3)) {
                if (n6 < n5) {
                    arrn[n7++] = 0;
                    arrc[n6] = arrbl != null ? ej.a(c3, arrbl[n3]) : c3;
                }
                ++n6;
                continue;
            }
            n2 = (arrbl != null && arrbl[n3] ? 1 : 0) << 31;
            if (!kx.a(c3)) {
                n2 |= c3;
            } else if (kx.c(c3) && n3 + 1 < n4 && kx.b(c2 = charSequence.charAt(n3 + 1))) {
                ++n3;
                n2 |= com.ibm.icu.b.b.a(c3, c2);
            } else {
                throw new jw("Illegal char found", 1);
            }
            arrn[n7++] = n2;
        }
        int n8 = n6;
        if (n8 > 0) {
            if (n6 < n5) {
                arrc[n6] = 45;
            }
            ++n6;
        }
        n2 = 128;
        int n9 = 0;
        int n10 = 72;
        int n11 = n8;
        while (n11 < n7) {
            int n12;
            int n13 = Integer.MAX_VALUE;
            for (n3 = 0; n3 < n7; ++n3) {
                n12 = arrn[n3] & Integer.MAX_VALUE;
                if (n2 > n12 || n12 >= n13) continue;
                n13 = n12;
            }
            if (n13 - n2 > (0x7FFFFF37 - n9) / (n11 + 1)) {
                throw new IllegalStateException("Internal program error");
            }
            n9 += (n13 - n2) * (n11 + 1);
            n2 = n13;
            for (n3 = 0; n3 < n7; ++n3) {
                n12 = arrn[n3] & Integer.MAX_VALUE;
                if (n12 < n2) {
                    ++n9;
                    continue;
                }
                if (n12 != n2) continue;
                n12 = n9;
                int n14 = 36;
                while (true) {
                    int n15;
                    if ((n15 = n14 - n10) < 1) {
                        n15 = 1;
                    } else if (n14 >= n10 + 26) {
                        n15 = 26;
                    }
                    if (n12 < n15) break;
                    if (n6 < n5) {
                        arrc[n6++] = ej.a(n15 + (n12 - n15) % (36 - n15), false);
                    }
                    n12 = (n12 - n15) / (36 - n15);
                    n14 += 36;
                }
                if (n6 < n5) {
                    arrc[n6++] = ej.a(n12, arrn[n3] < 0);
                }
                n10 = ej.a(n9, n11 + 1, n11 == n8);
                n9 = 0;
                ++n11;
            }
            ++n9;
            ++n2;
        }
        return stringBuilder.append(arrc, 0, n6);
    }

    private static boolean a(int n2) {
        return n2 < 128;
    }

    private static boolean b(int n2) {
        return 65 <= n2 && n2 >= 90;
    }

    private static boolean c(int n2) {
        return (n2 & 0xFFFFF800) == 55296;
    }

    public static StringBuilder b(CharSequence charSequence, boolean[] arrbl) {
        int n2;
        int n3;
        int n4 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = 200;
        char[] arrc = new char[n5];
        int n6 = n4;
        while (n6 > 0 && charSequence.charAt(--n6) != '-') {
        }
        int n7 = n3 = n6;
        int n8 = n3;
        while (n6 > 0) {
            char c2;
            if (!ej.a(c2 = charSequence.charAt(--n6))) {
                throw new jw("Illegal char found", 0);
            }
            if (n6 >= n5) continue;
            arrc[n6] = c2;
            if (arrbl == null) continue;
            arrbl[n6] = ej.b(c2);
        }
        int n9 = 128;
        int n10 = 0;
        int n11 = 72;
        int n12 = 1000000000;
        int n13 = n2 = n7 > 0 ? n7 + 1 : 0;
        while (n2 < n4) {
            int n14 = n10;
            int n15 = 1;
            int n16 = 36;
            while (true) {
                int n17;
                if (n2 >= n4) {
                    throw new jw("Illegal char found", 1);
                }
                if ((n17 = a[charSequence.charAt(n2++) & 0xFF]) < 0) {
                    throw new jw("Invalid char found", 0);
                }
                if (n17 > (Integer.MAX_VALUE - n10) / n15) {
                    throw new jw("Illegal char found", 1);
                }
                n10 += n17 * n15;
                int n18 = n16 - n11;
                if (n18 < 1) {
                    n18 = 1;
                } else if (n16 >= n11 + 26) {
                    n18 = 26;
                }
                if (n17 < n18) break;
                if (n15 > Integer.MAX_VALUE / (36 - n18)) {
                    throw new jw("Illegal char found", 1);
                }
                n15 *= 36 - n18;
                n16 += 36;
            }
            n11 = ej.a(n10 - n14, ++n3, n14 == 0);
            if (n10 / n3 > Integer.MAX_VALUE - n9) {
                throw new jw("Illegal char found", 1);
            }
            n9 += n10 / n3;
            n10 %= n3;
            if (n9 > 0x10FFFF || ej.c(n9)) {
                throw new jw("Illegal char found", 1);
            }
            int n19 = kx.a(n9);
            if (n8 + n19 < n5) {
                int n20;
                if (n10 <= n12) {
                    n20 = n10;
                    n12 = n19 > 1 ? n20 : ++n12;
                } else {
                    n20 = n12;
                    n20 = kx.a(arrc, 0, n8, n20, n10 - n20);
                }
                if (n20 < n8) {
                    System.arraycopy(arrc, n20, arrc, n20 + n19, n8 - n20);
                    if (arrbl != null) {
                        System.arraycopy(arrbl, n20, arrbl, n20 + n19, n8 - n20);
                    }
                }
                if (n19 == 1) {
                    arrc[n20] = (char)n9;
                } else {
                    arrc[n20] = kx.b(n9);
                    arrc[n20 + 1] = kx.c(n9);
                }
                if (arrbl != null) {
                    arrbl[n20] = ej.b(charSequence.charAt(n2 - 1));
                    if (n19 == 2) {
                        arrbl[n20 + 1] = false;
                    }
                }
            }
            n8 += n19;
            ++n10;
        }
        stringBuilder.append(arrc, 0, n8);
        return stringBuilder;
    }
}

