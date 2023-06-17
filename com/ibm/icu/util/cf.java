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

public class cf
extends n {
    private static final long a = -6727306982975111643L;
    private static final int[][] aC = new int[][]{{31, 31, 0}, {31, 31, 31}, {31, 31, 62}, {31, 31, 93}, {31, 31, 124}, {31, 31, 155}, {30, 30, 186}, {30, 30, 216}, {30, 30, 246}, {30, 30, 276}, {30, 30, 306}, {29, 30, 336}};
    private static final int aD = 1948320;
    private static final int[][] aE = new int[][]{{0, 0, 0, 0}, {-5000000, -5000000, 5000000, 5000000}, {0, 0, 11, 11}, {1, 1, 52, 53}, new int[0], {1, 1, 29, 31}, {1, 1, 365, 366}, new int[0], {-1, -1, 5, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], new int[0]};

    public cf() {
        this(dj.p(), dn.a(dr.b));
    }

    public cf(dj dj2) {
        this(dj2, dn.a(dr.b));
    }

    public cf(Locale locale) {
        this(dj.p(), locale);
    }

    public cf(dn dn2) {
        this(dj.p(), dn2);
    }

    public cf(dj dj2, Locale locale) {
        super(dj2, locale);
        this.a(System.currentTimeMillis());
    }

    public cf(dj dj2, dn dn2) {
        super(dj2, dn2);
        this.a(System.currentTimeMillis());
    }

    public cf(Date date) {
        super(dj.p(), dn.a(dr.b));
        this.a(date);
    }

    public cf(int n2, int n3, int n4) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
    }

    public cf(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
        this.d(13, n7);
    }

    protected int a(int n2, int n3) {
        return aE[n2][n3];
    }

    private static final boolean C(int n2) {
        int[] arrn = new int[1];
        cf.b(25 * n2 + 11, 33, arrn);
        return arrn[0] < 8;
    }

    protected int b(int n2, int n3) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += cf.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        return aC[n3][cf.C(n2) ? 1 : 0];
    }

    protected int v(int n2) {
        return cf.C(n2) ? 366 : 365;
    }

    protected int a(int n2, int n3, boolean bl2) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += cf.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        int n4 = 1948319 + 365 * (n2 - 1) + cf.o(8 * n2 + 21, 33);
        if (n3 != 0) {
            n4 += aC[n3][2];
        }
        return n4;
    }

    protected int a() {
        int n2 = this.i(19, 1) == 19 ? this.c(19, 1) : this.c(1, 1);
        return n2;
    }

    protected void a(int n2) {
        long l2 = n2 - 1948320;
        int n3 = 1 + (int)cf.a(33L * l2 + 3L, 12053L);
        long l3 = 365 * (n3 - 1) + cf.o(8 * n3 + 21, 33);
        int n4 = (int)(l2 - l3);
        int n5 = n4 < 216 ? n4 / 31 : (n4 - 6) / 30;
        int n6 = n4 - aC[n5][2] + 1;
        this.l(0, 0);
        this.l(1, n3);
        this.l(19, n3);
        this.l(2, n5);
        this.l(5, n6);
        this.l(6, ++n4);
    }

    public String b() {
        return "persian";
    }
}

