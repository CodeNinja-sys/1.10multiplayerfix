/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.c;

import java.io.Serializable;

public final class b
implements Serializable {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 2;
    public static final int e = 1;
    public static final int f = 3;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 4;
    public static final int j = 7;
    public static final int k = 0;
    int l;
    int m;
    boolean n;
    int o;
    private static final int q = 1;
    private static final int r = 9;
    private static final boolean s = false;
    private static final int t = 4;
    private static final int u = 0;
    private static final int v = 999999999;
    private static final int[] w = new int[]{4, 7, 2, 1, 3, 5, 6, 0};
    private static final String[] x = new String[]{"ROUND_HALF_UP", "ROUND_UNNECESSARY", "ROUND_CEILING", "ROUND_DOWN", "ROUND_FLOOR", "ROUND_HALF_DOWN", "ROUND_HALF_EVEN", "ROUND_UP"};
    private static final long y = 7163376998892515376L;
    public static final b p = new b(9, 1, false, 4);

    public b(int n2) {
        this(n2, 1, false, 4);
    }

    public b(int n2, int n3) {
        this(n2, n3, false, 4);
    }

    public b(int n2, int n3, boolean bl2) {
        this(n2, n3, bl2, 4);
    }

    public b(int n2, int n3, boolean bl2, int n4) {
        if (n2 != 9) {
            if (n2 < 0) {
                throw new IllegalArgumentException("Digits too small: " + n2);
            }
            if (n2 > 999999999) {
                throw new IllegalArgumentException("Digits too large: " + n2);
            }
        }
        if (n3 != 1 && n3 != 2 && n3 != 0) {
            throw new IllegalArgumentException("Bad form value: " + n3);
        }
        if (!com.ibm.icu.c.b.a(n4)) {
            throw new IllegalArgumentException("Bad roundingMode value: " + n4);
        }
        this.l = n2;
        this.m = n3;
        this.n = bl2;
        this.o = n4;
    }

    public int a() {
        return this.l;
    }

    public int b() {
        return this.m;
    }

    public boolean c() {
        return this.n;
    }

    public int d() {
        return this.o;
    }

    public String toString() {
        String string = null;
        int n2 = 0;
        String string2 = null;
        string = this.m == 1 ? "SCIENTIFIC" : (this.m == 2 ? "ENGINEERING" : "PLAIN");
        int n3 = w.length;
        n2 = 0;
        while (n3 > 0) {
            if (this.o == w[n2]) {
                string2 = x[n2];
                break;
            }
            --n3;
            ++n2;
        }
        return "digits=" + this.l + " " + "form=" + string + " " + "lostDigits=" + (this.n ? "1" : "0") + " " + "roundingMode=" + string2;
    }

    private static boolean a(int n2) {
        int n3 = 0;
        int n4 = w.length;
        n3 = 0;
        while (n4 > 0) {
            if (n2 == w[n3]) {
                return true;
            }
            --n4;
            ++n3;
        }
        return false;
    }
}

