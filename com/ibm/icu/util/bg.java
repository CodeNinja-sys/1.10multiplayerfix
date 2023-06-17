/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.q;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.util.Date;
import java.util.Locale;

public class bg
extends n {
    private static final long aO = -1952524560588825816L;
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
    private static final int[][] aP = new int[][]{{0, 0, 0, 0}, {-5000000, -5000000, 5000000, 5000000}, {0, 0, 12, 12}, {1, 1, 51, 56}, new int[0], {1, 1, 29, 30}, {1, 1, 353, 385}, new int[0], {-1, -1, 5, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], new int[0]};
    private static final int[][] aQ = new int[][]{{30, 30, 30}, {29, 29, 30}, {29, 30, 30}, {29, 29, 29}, {30, 30, 30}, {30, 30, 30}, {29, 29, 29}, {30, 30, 30}, {29, 29, 29}, {30, 30, 30}, {29, 29, 29}, {30, 30, 30}, {29, 29, 29}};
    private static final int[][] aR = new int[][]{{0, 0, 0}, {30, 30, 30}, {59, 59, 60}, {88, 89, 90}, {117, 118, 119}, {147, 148, 149}, {147, 148, 149}, {176, 177, 178}, {206, 207, 208}, {235, 236, 237}, {265, 266, 267}, {294, 295, 296}, {324, 325, 326}, {353, 354, 355}};
    private static final int[][] aS = new int[][]{{0, 0, 0}, {30, 30, 30}, {59, 59, 60}, {88, 89, 90}, {117, 118, 119}, {147, 148, 149}, {177, 178, 179}, {206, 207, 208}, {236, 237, 238}, {265, 266, 267}, {295, 296, 297}, {324, 325, 326}, {354, 355, 356}, {383, 384, 385}};
    private static q aT = new q();
    private static final long aU = 1080L;
    private static final long aV = 25920L;
    private static final int aW = 29;
    private static final long aX = 13753L;
    private static final long aY = 765433L;
    private static final long aZ = 12084L;

    public bg() {
        this(dj.p(), dn.a(dr.b));
    }

    public bg(dj dj2) {
        this(dj2, dn.a(dr.b));
    }

    public bg(Locale locale) {
        this(dj.p(), locale);
    }

    public bg(dn dn2) {
        this(dj.p(), dn2);
    }

    public bg(dj dj2, Locale locale) {
        super(dj2, locale);
        this.a(System.currentTimeMillis());
    }

    public bg(dj dj2, dn dn2) {
        super(dj2, dn2);
        this.a(System.currentTimeMillis());
    }

    public bg(int n2, int n3, int n4) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
    }

    public bg(Date date) {
        super(dj.p(), dn.a(dr.b));
        this.a(date);
    }

    public bg(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
        this.d(13, n7);
    }

    public void f(int n2, int n3) {
        switch (n2) {
            case 2: {
                int n4 = this.b(2);
                int n5 = this.b(1);
                if (n3 > 0) {
                    boolean bl2 = n4 < 5;
                    n4 += n3;
                    while (true) {
                        if (bl2 && n4 >= 5 && !bg.C(n5)) {
                            ++n4;
                        }
                        if (n4 > 12) {
                            n4 -= 13;
                            ++n5;
                            bl2 = true;
                            continue;
                        }
                        break;
                    }
                } else {
                    boolean bl3 = n4 > 5;
                    n4 += n3;
                    while (true) {
                        if (bl3 && n4 <= 5 && !bg.C(n5)) {
                            --n4;
                        }
                        if (n4 >= 0) break;
                        n4 += 13;
                        --n5;
                        bl3 = true;
                    }
                }
                this.d(2, n4);
                this.d(1, n5);
                this.h(5);
                break;
            }
            default: {
                super.f(n2, n3);
            }
        }
    }

    public void e(int n2, int n3) {
        switch (n2) {
            case 2: {
                int n4 = this.b(2);
                int n5 = this.b(1);
                boolean bl2 = bg.C(n5);
                int n6 = bg.F(n5);
                int n7 = n4 + n3 % n6;
                if (!bl2) {
                    if (n3 > 0 && n4 < 5 && n7 >= 5) {
                        ++n7;
                    } else if (n3 < 0 && n4 > 5 && n7 <= 5) {
                        --n7;
                    }
                }
                this.d(2, (n7 + 13) % 13);
                this.h(5);
                return;
            }
        }
        super.e(n2, n3);
    }

    private static long D(int n2) {
        long l2 = aT.a((long)n2);
        if (l2 == com.ibm.icu.a.q.a) {
            int n3 = (235 * n2 - 234) / 19;
            long l3 = (long)n3 * 13753L + 12084L;
            l2 = (long)(n3 * 29) + l3 / 25920L;
            l3 %= 25920L;
            int n4 = (int)(l2 % 7L);
            if (n4 == 2 || n4 == 4 || n4 == 6) {
                n4 = (int)(++l2 % 7L);
            }
            if (n4 == 1 && l3 > 16404L && !bg.C(n2)) {
                l2 += 2L;
            } else if (n4 == 0 && l3 > 23269L && bg.C(n2 - 1)) {
                ++l2;
            }
            aT.a(n2, l2);
        }
        return l2;
    }

    private final int E(int n2) {
        int n3 = this.v(n2);
        if (n3 > 380) {
            n3 -= 30;
        }
        int n4 = 0;
        switch (n3) {
            case 353: {
                n4 = 0;
                break;
            }
            case 354: {
                n4 = 1;
                break;
            }
            case 355: {
                n4 = 2;
                break;
            }
            default: {
                throw new IllegalArgumentException("Illegal year length " + n3 + " in year " + n2);
            }
        }
        return n4;
    }

    public static boolean C(int n2) {
        int n3;
        return n3 >= ((n3 = (n2 * 12 + 17) % 19) < 0 ? -7 : 12);
    }

    private static int F(int n2) {
        return bg.C(n2) ? 13 : 12;
    }

    protected int a(int n2, int n3) {
        return aP[n2][n3];
    }

    protected int b(int n2, int n3) {
        while (n3 < 0) {
            n3 += bg.F(--n2);
        }
        while (n3 > 12) {
            n3 -= bg.F(n2++);
        }
        switch (n3) {
            case 1: 
            case 2: {
                return aQ[n3][this.E(n2)];
            }
        }
        return aQ[n3][0];
    }

    protected int v(int n2) {
        return (int)(bg.D(n2 + 1) - bg.D(n2));
    }

    protected void a(int n2) {
        long l2 = n2 - 347997;
        long l3 = l2 * 25920L / 765433L;
        int n3 = (int)((19L * l3 + 234L) / 235L) + 1;
        long l4 = bg.D(n3);
        int n4 = (int)(l2 - l4);
        while (n4 < 1) {
            l4 = bg.D(--n3);
            n4 = (int)(l2 - l4);
        }
        int n5 = this.E(n3);
        int[][] arrn = bg.C(n3) ? aS : aR;
        int n6 = 0;
        while (n4 > arrn[n6][n5]) {
            ++n6;
        }
        int n7 = n4 - arrn[--n6][n5];
        this.l(0, 0);
        this.l(1, n3);
        this.l(19, n3);
        this.l(2, n6);
        this.l(5, n7);
        this.l(6, n4);
    }

    protected int a() {
        int n2 = this.i(19, 1) == 19 ? this.c(19, 1) : this.c(1, 1);
        return n2;
    }

    protected int a(int n2, int n3, boolean bl2) {
        while (n3 < 0) {
            n3 += bg.F(--n2);
        }
        while (n3 > 12) {
            n3 -= bg.F(n2++);
        }
        long l2 = bg.D(n2);
        if (n3 != 0) {
            l2 = bg.C(n2) ? (l2 += (long)aS[n3][this.E(n2)]) : (l2 += (long)aR[n3][this.E(n2)]);
        }
        return (int)(l2 + 347997L);
    }

    public String b() {
        return "hebrew";
    }
}

