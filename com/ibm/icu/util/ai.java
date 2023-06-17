/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.m;
import java.util.Date;
import java.util.Locale;

public final class ai
extends m {
    private static final long aO = 5903818751846742911L;
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
    public static final int aN = 12;
    private static final int aP = 1824665;
    private static final int aQ = 0;
    private static final int aR = 1;

    public ai() {
    }

    public ai(dj dj2) {
        super(dj2);
    }

    public ai(Locale locale) {
        super(locale);
    }

    public ai(dn dn2) {
        super(dn2);
    }

    public ai(dj dj2, Locale locale) {
        super(dj2, locale);
    }

    public ai(dj dj2, dn dn2) {
        super(dj2, dn2);
    }

    public ai(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public ai(Date date) {
        super(date);
    }

    public ai(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
    }

    public String b() {
        return "coptic";
    }

    protected int a() {
        int n2;
        int n3 = this.i(19, 1) == 19 ? this.c(19, 1) : ((n2 = this.c(0, 1)) == 0 ? 1 - this.c(1, 1) : this.c(1, 1));
        return n3;
    }

    protected void a(int n2) {
        int n3;
        int n4;
        int[] arrn = new int[3];
        com.ibm.icu.util.ai.a(n2, this.c(), arrn);
        if (arrn[0] <= 0) {
            n4 = 0;
            n3 = 1 - arrn[0];
        } else {
            n4 = 1;
            n3 = arrn[0];
        }
        this.l(19, arrn[0]);
        this.l(0, n4);
        this.l(1, n3);
        this.l(2, arrn[1]);
        this.l(5, arrn[2]);
        this.l(6, 30 * arrn[1] + arrn[2]);
    }

    protected int c() {
        return 1824665;
    }

    public static int a(long l2, int n2, int n3) {
        return com.ibm.icu.util.ai.a(l2, n2, n3, 1824665);
    }
}

