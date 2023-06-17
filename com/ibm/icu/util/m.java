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

abstract class m
extends n {
    private static final long a = -999547623066414271L;
    private static final int[][] aC = new int[][]{{0, 0, 1, 1}, {1, 1, 5000000, 5000000}, {0, 0, 12, 12}, {1, 1, 52, 53}, new int[0], {1, 1, 5, 30}, {1, 1, 365, 366}, new int[0], {-1, -1, 1, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], new int[0]};

    protected m() {
        this(dj.p(), dn.a(dr.b));
    }

    protected m(dj dj2) {
        this(dj2, dn.a(dr.b));
    }

    protected m(Locale locale) {
        this(dj.p(), locale);
    }

    protected m(dn dn2) {
        this(dj.p(), dn2);
    }

    protected m(dj dj2, Locale locale) {
        super(dj2, locale);
        this.a(System.currentTimeMillis());
    }

    protected m(dj dj2, dn dn2) {
        super(dj2, dn2);
        this.a(System.currentTimeMillis());
    }

    protected m(int n2, int n3, int n4) {
        super(dj.p(), dn.a(dr.b));
        this.a(n2, n3, n4);
    }

    protected m(Date date) {
        super(dj.p(), dn.a(dr.b));
        this.a(date);
    }

    protected m(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(dj.p(), dn.a(dr.b));
        this.a(n2, n3, n4, n5, n6, n7);
    }

    protected abstract int c();

    protected int a(int n2, int n3, boolean bl2) {
        return com.ibm.icu.util.m.a(n2, n3, 0, this.c());
    }

    protected int a(int n2, int n3) {
        return aC[n2][n3];
    }

    protected int b(int n2, int n3) {
        if ((n3 + 1) % 13 != 0) {
            return 30;
        }
        return n2 % 4 / 3 + 5;
    }

    public static int a(long l2, int n2, int n3, int n4) {
        if (n2 >= 0) {
            l2 += (long)(n2 / 13);
            n2 %= 13;
        } else {
            l2 += (long)(++n2 / 13 - 1);
            n2 = n2 % 13 + 12;
        }
        return (int)((long)n4 + 365L * l2 + com.ibm.icu.util.m.a(l2, 4L) + (long)(30 * n2) + (long)n3 - 1L);
    }

    public static void a(int n2, int n3, int[] arrn) {
        int[] arrn2 = new int[1];
        int n4 = com.ibm.icu.util.m.b(n2 - n3, 1461, arrn2);
        arrn[0] = 4 * n4 + (arrn2[0] / 365 - arrn2[0] / 1460);
        int n5 = arrn2[0] == 1460 ? 365 : arrn2[0] % 365;
        arrn[1] = n5 / 30;
        arrn[2] = n5 % 30 + 1;
    }
}

