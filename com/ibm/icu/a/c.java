/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.ku;

public class c {
    private static final int a = 3;
    private static final int b = 255;
    private static final int c = 129;
    private static final int d = 253;
    private static final int e = 80;
    private static final int f = 42;
    private static final int g = 3;
    private static final int h = 80;
    private static final int i = -80;
    private static final int j = 10667;
    private static final int k = -10668;
    private static final int l = 192785;
    private static final int m = -192786;
    private static final int n = 210;
    private static final int o = 252;
    private static final int p = 49;
    private static final int q = 7;

    public static int a(String string, byte[] arrby, int n2) {
        int n3 = 0;
        ku ku2 = ku.b(string);
        int n4 = ku2.j();
        while (n4 != -1) {
            n3 = n3 < 19968 || n3 >= 40960 ? (n3 & 0xFFFFFF80) - -80 : 30292;
            n2 = com.ibm.icu.a.c.a(n4 - n3, arrby, n2);
            n3 = n4;
            n4 = ku2.j();
        }
        return n2;
    }

    public static int a(String string) {
        int n2 = 0;
        int n3 = 0;
        ku ku2 = ku.b(string);
        int n4 = ku2.j();
        while (n4 != -1) {
            n2 = n2 < 19968 || n2 >= 40960 ? (n2 & 0xFFFFFF80) - -80 : 30292;
            n4 = ku2.j();
            n3 += com.ibm.icu.a.c.a(n4 - n2);
            n2 = n4;
        }
        return n3;
    }

    private c() {
    }

    private static final long a(int n2, int n3) {
        int n4 = n2 % n3;
        long l2 = n2 / n3;
        if (n4 < 0) {
            --l2;
            n4 += n3;
        }
        return l2 << 32 | (long)n4;
    }

    private static final int a(int n2, byte[] arrby, int n3) {
        if (n2 >= -80) {
            if (n2 <= 80) {
                arrby[n3++] = (byte)(129 + n2);
            } else if (n2 <= 10667) {
                arrby[n3++] = (byte)(210 + n2 / 253);
                arrby[n3++] = (byte)(3 + n2 % 253);
            } else if (n2 <= 192785) {
                arrby[n3 + 2] = (byte)(3 + n2 % 253);
                arrby[n3 + 1] = (byte)(3 + (n2 /= 253) % 253);
                arrby[n3] = (byte)(252 + n2 / 253);
                n3 += 3;
            } else {
                arrby[n3 + 3] = (byte)(3 + n2 % 253);
                arrby[n3] = (byte)(3 + (n2 /= 253) % 253);
                arrby[n3 + 1] = (byte)(3 + (n2 /= 253) % 253);
                arrby[n3] = -1;
                n3 += 4;
            }
        } else {
            long l2 = com.ibm.icu.a.c.a(n2, 253);
            int n4 = (int)l2;
            if (n2 >= -10668) {
                n2 = (int)(l2 >> 32);
                arrby[n3++] = (byte)(49 + n2);
                arrby[n3++] = (byte)(3 + n4);
            } else if (n2 >= -192786) {
                arrby[n3 + 2] = (byte)(3 + n4);
                n2 = (int)(l2 >> 32);
                l2 = com.ibm.icu.a.c.a(n2, 253);
                n4 = (int)l2;
                n2 = (int)(l2 >> 32);
                arrby[n3 + 1] = (byte)(3 + n4);
                arrby[n3] = (byte)(7 + n2);
                n3 += 3;
            } else {
                arrby[n3 + 3] = (byte)(3 + n4);
                n2 = (int)(l2 >> 32);
                l2 = com.ibm.icu.a.c.a(n2, 253);
                n4 = (int)l2;
                n2 = (int)(l2 >> 32);
                arrby[n3 + 2] = (byte)(3 + n4);
                l2 = com.ibm.icu.a.c.a(n2, 253);
                n4 = (int)l2;
                arrby[n3 + 1] = (byte)(3 + n4);
                arrby[n3] = 3;
                n3 += 4;
            }
        }
        return n3;
    }

    private static final int a(int n2) {
        if (n2 >= -80) {
            if (n2 <= 80) {
                return 1;
            }
            if (n2 <= 10667) {
                return 2;
            }
            if (n2 <= 192785) {
                return 3;
            }
            return 4;
        }
        if (n2 >= -10668) {
            return 2;
        }
        if (n2 >= -192786) {
            return 3;
        }
        return 4;
    }
}

