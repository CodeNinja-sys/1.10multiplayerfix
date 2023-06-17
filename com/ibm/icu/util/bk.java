/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.util.Date;
import java.util.Locale;

public class bk
extends n {
    private static final long aO = 3617859668165014834L;
    public static final int a = 0;
    public static final int aC = 1;
    public static final int aD = 2;
    public static final int aE = 3;
    public static final int aF = 4;
    public static final int aG = 5;
    public static final int aH = 6;
    public static final int aI = 7;
    public static final int aJ = 8;
    public static final int aK = 9;
    public static final int aL = 10;
    public static final int aM = 11;
    public static final int aN = 0;
    private static final int aP = 78;
    private static final int aQ = 80;
    private static final int[][] aR = new int[][]{{0, 0, 0, 0}, {-5000000, -5000000, 5000000, 5000000}, {0, 0, 11, 11}, {1, 1, 52, 53}, new int[0], {1, 1, 30, 31}, {1, 1, 365, 366}, new int[0], {-1, -1, 5, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], new int[0]};

    public bk() {
        this(dj.p(), dn.a(dr.b));
    }

    public bk(dj dj2) {
        this(dj2, dn.a(dr.b));
    }

    public bk(Locale locale) {
        this(dj.p(), locale);
    }

    public bk(dn dn2) {
        this(dj.p(), dn2);
    }

    public bk(dj dj2, Locale locale) {
        super(dj2, locale);
        this.a(System.currentTimeMillis());
    }

    public bk(dj dj2, dn dn2) {
        super(dj2, dn2);
        this.a(System.currentTimeMillis());
    }

    public bk(Date date) {
        super(dj.p(), dn.a(dr.b));
        this.a(date);
    }

    public bk(int n2, int n3, int n4) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
    }

    public bk(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
        this.d(13, n7);
    }

    protected int a() {
        int n2 = this.i(19, 1) == 19 ? this.c(19, 1) : this.c(1, 1);
        return n2;
    }

    protected int v(int n2) {
        return super.v(n2);
    }

    protected int b(int n2, int n3) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += bk.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        if (bk.C(n2 + 78) && n3 == 0) {
            return 31;
        }
        if (n3 >= 1 && n3 <= 5) {
            return 31;
        }
        return 30;
    }

    protected void a(int n2) {
        int n3;
        int n4;
        int n5;
        int[] arrn = bk.a(n2);
        int n6 = arrn[0] - 78;
        double d2 = bk.f(arrn[0], 1, 1);
        int n7 = (int)((double)n2 - d2);
        if (n7 < 80) {
            --n6;
            n5 = bk.C(arrn[0] - 1) ? 31 : 30;
            n7 += n5 + 155 + 90 + 10;
        } else {
            n5 = bk.C(arrn[0]) ? 31 : 30;
            n7 -= 80;
        }
        if (n7 < n5) {
            n4 = 0;
            n3 = n7 + 1;
        } else {
            int n8 = n7 - n5;
            if (n8 < 155) {
                n4 = n8 / 31 + 1;
                n3 = n8 % 31 + 1;
            } else {
                n4 = (n8 -= 155) / 30 + 6;
                n3 = n8 % 30 + 1;
            }
        }
        this.l(0, 0);
        this.l(19, n6);
        this.l(1, n6);
        this.l(2, n4);
        this.l(5, n3);
        this.l(6, n7 + 1);
    }

    protected int a(int n2, int n3) {
        return aR[n2][n3];
    }

    protected int a(int n2, int n3, boolean bl2) {
        if (n3 < 0 || n3 > 11) {
            n2 += n3 / 12;
            n3 %= 12;
        }
        int n4 = n3 == 12 ? 1 : n3 + 1;
        double d2 = bk.e(n2, n4, 1);
        return (int)d2;
    }

    private static double e(int n2, int n3, int n4) {
        double d2;
        double d3;
        int n5;
        int n6 = n2 + 78;
        if (bk.C(n6)) {
            n5 = 31;
            d3 = bk.f(n6, 3, 21);
        } else {
            n5 = 30;
            d3 = bk.f(n6, 3, 22);
        }
        if (n3 == 1) {
            d2 = d3 + (double)(n4 - 1);
        } else {
            d2 = d3 + (double)n5;
            int n7 = n3 - 2;
            n7 = Math.min(n7, 5);
            d2 += (double)(n7 * 31);
            if (n3 >= 8) {
                n7 = n3 - 7;
                d2 += (double)(n7 * 30);
            }
            d2 += (double)(n4 - 1);
        }
        return d2;
    }

    private static double f(int n2, int n3, int n4) {
        double d2 = 1721425.5;
        int n5 = n2 - 1;
        int n6 = 365 * n5 + n5 / 4 - n5 / 100 + n5 / 400 + (367 * n3 - 362) / 12 + (n3 <= 2 ? 0 : (bk.C(n2) ? -1 : -2)) + n4;
        return (double)(n6 - 1) + d2;
    }

    private static int[] a(double d2) {
        double d3 = 1721425.5;
        double d4 = Math.floor(d2 - 0.5) + 0.5;
        double d5 = d4 - d3;
        double d6 = Math.floor(d5 / 146097.0);
        double d7 = d5 % 146097.0;
        double d8 = Math.floor(d7 / 36524.0);
        double d9 = d7 % 36524.0;
        double d10 = Math.floor(d9 / 1461.0);
        double d11 = d9 % 1461.0;
        double d12 = Math.floor(d11 / 365.0);
        int n2 = (int)(d6 * 400.0 + d8 * 100.0 + d10 * 4.0 + d12);
        if (d8 != 4.0 && d12 != 4.0) {
            ++n2;
        }
        double d13 = d4 - bk.f(n2, 1, 1);
        double d14 = d4 < bk.f(n2, 3, 1) ? 0 : (bk.C(n2) ? 1 : 2);
        int n3 = (int)Math.floor(((d13 + d14) * 12.0 + 373.0) / 367.0);
        int n4 = (int)(d4 - bk.f(n2, n3, 1)) + 1;
        int[] arrn = new int[]{n2, n3, n4};
        return arrn;
    }

    private static boolean C(int n2) {
        return n2 % 4 == 0 && (n2 % 100 != 0 || n2 % 400 == 0);
    }

    public String b() {
        return "indian";
    }
}

