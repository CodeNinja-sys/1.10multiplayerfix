/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.m;
import java.util.Date;
import java.util.Locale;

public final class ay
extends m {
    private static final long aO = -2438495771339315608L;
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
    private static final int aP = 1723856;
    private static final int aQ = 5500;
    private static final int aR = 0;
    private static final int aS = 1;
    private static final int aT = 0;
    private static final int aU = 1;
    private int aV = 0;

    public ay() {
    }

    public ay(dj dj2) {
        super(dj2);
    }

    public ay(Locale locale) {
        super(locale);
    }

    public ay(dn dn2) {
        super(dn2);
    }

    public ay(dj dj2, Locale locale) {
        super(dj2, locale);
    }

    public ay(dj dj2, dn dn2) {
        super(dj2, dn2);
    }

    public ay(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public ay(Date date) {
        super(date);
    }

    public ay(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
    }

    public String b() {
        if (this.G()) {
            return "ethiopic-amete-alem";
        }
        return "ethiopic";
    }

    public void b(boolean bl2) {
        this.aV = bl2 ? 1 : 0;
    }

    public boolean G() {
        return this.aV == 1;
    }

    protected int a() {
        int n2;
        int n3 = this.i(19, 1) == 19 ? this.c(19, 1) : (this.G() ? this.c(1, 5501) - 5500 : ((n2 = this.c(0, 1)) == 1 ? this.c(1, 1) : this.c(1, 1) - 5500));
        return n3;
    }

    protected void a(int n2) {
        int n3;
        int n4;
        int[] arrn = new int[3];
        com.ibm.icu.util.ay.a(n2, this.c(), arrn);
        if (this.G()) {
            n4 = 0;
            n3 = arrn[0] + 5500;
        } else if (arrn[0] > 0) {
            n4 = 1;
            n3 = arrn[0];
        } else {
            n4 = 0;
            n3 = arrn[0] + 5500;
        }
        this.l(19, arrn[0]);
        this.l(0, n4);
        this.l(1, n3);
        this.l(2, arrn[1]);
        this.l(5, arrn[2]);
        this.l(6, 30 * arrn[1] + arrn[2]);
    }

    protected int a(int n2, int n3) {
        if (this.G() && n2 == 0) {
            return 0;
        }
        return super.a(n2, n3);
    }

    protected int c() {
        return 1723856;
    }

    public static int a(long l2, int n2, int n3) {
        return com.ibm.icu.util.ay.a(l2, n2, n3, 1723856);
    }
}

