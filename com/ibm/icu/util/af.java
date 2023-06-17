/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.e;
import com.ibm.icu.a.q;
import com.ibm.icu.d.cu;
import com.ibm.icu.util.cq;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Locale;

public class af
extends n {
    private static final long aC = 7312110751940929420L;
    private int aD;
    private dj aE;
    private transient e aF = new e();
    private transient q aG = new q();
    private transient q aH = new q();
    private transient boolean aI;
    private static final int[][] aJ = new int[][]{{1, 1, 83333, 83333}, {1, 1, 60, 60}, {0, 0, 11, 11}, {1, 1, 50, 55}, new int[0], {1, 1, 29, 30}, {1, 1, 353, 385}, new int[0], {-1, -1, 5, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], {-5000000, -5000000, 5000000, 5000000}, new int[0], new int[0], {0, 0, 1, 1}};
    static final int[][][] a = new int[][][]{new int[][]{{5}, {3, 7}, {4, 7}, {8, 7}, {3, 18}, {4, 18}, {8, 18}, {6}, {37, 22}}, new int[][]{{3}, {4}, {8}, {40, 7}, {40, 18}}};
    private static final int aK = -2636;
    private static final dj aL = new cq(28800000, "CHINA_ZONE").g();
    private static final int aM = 25;

    public af() {
        this(dj.p(), dn.a(dr.b), -2636, aL);
    }

    public af(Date date) {
        this(dj.p(), dn.a(dr.b), -2636, aL);
        this.a(date);
    }

    public af(int n2, int n3, int n4, int n5) {
        this(n2, n3, n4, n5, 0, 0, 0);
    }

    public af(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this(dj.p(), dn.a(dr.b), -2636, aL);
        this.d(14, 0);
        this.d(1, n2);
        this.d(2, n3);
        this.d(22, n4);
        this.d(5, n5);
        this.d(11, n6);
        this.d(12, n7);
        this.d(13, n8);
    }

    public af(int n2, int n3, int n4, int n5, int n6) {
        this(n2, n3, n4, n5, 0, 0, 0);
    }

    public af(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this(dj.p(), dn.a(dr.b), -2636, aL);
        this.d(14, 0);
        this.d(0, n2);
        this.d(1, n3);
        this.d(2, n4);
        this.d(22, n5);
        this.d(5, n6);
        this.d(11, n7);
        this.d(12, n8);
        this.d(13, n9);
    }

    public af(Locale locale) {
        this(dj.p(), dn.a(locale), -2636, aL);
    }

    public af(dj dj2) {
        this(dj2, dn.a(dr.b), -2636, aL);
    }

    public af(dj dj2, Locale locale) {
        this(dj2, dn.a(locale), -2636, aL);
    }

    public af(dn dn2) {
        this(dj.p(), dn2, -2636, aL);
    }

    public af(dj dj2, dn dn2) {
        this(dj2, dn2, -2636, aL);
    }

    protected af(dj dj2, dn dn2, int n2, dj dj3) {
        super(dj2, dn2);
        this.aD = n2;
        this.aE = dj3;
        this.a(System.currentTimeMillis());
    }

    protected int a(int n2, int n3) {
        return aJ[n2][n3];
    }

    protected int a() {
        int n2;
        if (this.c(0, 1, 0) <= this.t(19)) {
            n2 = this.c(19, 1);
        } else {
            int n3 = this.c(0, 1) - 1;
            n2 = n3 * 60 + this.c(1, 1) - (this.aD - -2636);
        }
        return n2;
    }

    protected int b(int n2, int n3) {
        int n4 = this.a(n2, n3, true) - 2440588 + 1;
        int n5 = this.c(n4 + 25, true);
        return n5 - n4;
    }

    protected cu a(String string, String string2, dn dn2) {
        return super.a(string, string2, dn2);
    }

    protected int[][][] w() {
        return a;
    }

    private void e(int n2, int n3, int n4) {
        n2 += (int)(29.530588853 * ((double)n4 - 0.5));
        n2 = this.c(n2, true);
        int n5 = n2 + 2440588 - 1 + n3;
        if (n3 > 29) {
            this.d(20, n5 - 1);
            this.j();
            if (this.f(5) >= n3) {
                this.d(20, n5);
            }
        } else {
            this.d(20, n5);
        }
    }

    public void f(int n2, int n3) {
        switch (n2) {
            case 2: {
                if (n3 == 0) break;
                int n4 = this.b(5);
                int n5 = this.b(20) - 2440588;
                int n6 = n5 - n4 + 1;
                this.e(n6, n4, n3);
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
                int n4;
                int n5;
                if (n3 == 0) break;
                int n6 = this.b(5);
                int n7 = this.b(20) - 2440588;
                int n8 = n7 - n6 + 1;
                int n9 = this.b(2);
                if (this.aI) {
                    if (this.b(22) == 1) {
                        ++n9;
                    } else {
                        n5 = n8 - (int)(29.530588853 * ((double)n9 - 0.5));
                        if (this.q(n5 = this.c(n5, true), n8)) {
                            ++n9;
                        }
                    }
                }
                if ((n4 = (n9 + n3) % (n5 = this.aI ? 13 : 12)) < 0) {
                    n4 += n5;
                }
                if (n4 == n9) break;
                this.e(n8, n6, n4 - n9);
                break;
            }
            default: {
                super.e(n2, n3);
            }
        }
    }

    private final long C(int n2) {
        long l2 = (long)n2 * 86400000L;
        return l2 - (long)this.aE.c(l2);
    }

    private final int c(long l2) {
        return (int)com.ibm.icu.util.af.a(l2 + (long)this.aE.c(l2), 86400000L);
    }

    private int D(int n2) {
        long l2 = this.aG.a((long)n2);
        if (l2 == com.ibm.icu.a.q.a) {
            long l3 = this.C(this.k(n2, 11) + 1 - 2440588);
            this.aF.a(l3);
            long l4 = this.aF.a(com.ibm.icu.a.e.t, true);
            l2 = this.c(l4);
            this.aG.a(n2, l2);
        }
        return (int)l2;
    }

    private int c(int n2, boolean bl2) {
        this.aF.a(this.C(n2));
        long l2 = this.aF.a(com.ibm.icu.a.e.C, bl2);
        return this.c(l2);
    }

    private int p(int n2, int n3) {
        return (int)Math.round((double)(n3 - n2) / 29.530588853);
    }

    private int E(int n2) {
        this.aF.a(this.C(n2));
        int n3 = ((int)Math.floor(6.0 * this.aF.g() / Math.PI) + 2) % 12;
        if (n3 < 1) {
            n3 += 12;
        }
        return n3;
    }

    private boolean F(int n2) {
        int n3;
        int n4;
        int n5 = this.E(n2);
        return n5 == (n4 = this.E(n3 = this.c(n2 + 25, true)));
    }

    private boolean q(int n2, int n3) {
        if (this.p(n2, n3) >= 50) {
            throw new IllegalArgumentException("isLeapMonthBetween(" + n2 + ", " + n3 + "): Invalid parameters");
        }
        return n3 >= n2 && (this.q(n2, this.c(n3 - 25, false)) || this.F(n3));
    }

    protected void a(int n2) {
        this.a(n2 - 2440588, this.y(), this.z(), true);
    }

    private void a(int n2, int n3, int n4, boolean bl2) {
        int n5;
        int n6 = this.D(n3);
        if (n2 < n6) {
            n5 = this.D(n3 - 1);
        } else {
            n5 = n6;
            n6 = this.D(n3 + 1);
        }
        int n7 = this.c(n5 + 1, true);
        int n8 = this.c(n6 + 1, false);
        int n9 = this.c(n2 + 1, false);
        this.aI = this.p(n7, n8) == 12;
        int n10 = this.p(n7, n9);
        if (this.aI && this.q(n7, n9)) {
            --n10;
        }
        if (n10 < 1) {
            n10 += 12;
        }
        boolean bl3 = this.aI && this.F(n9) && !this.q(n7, this.c(n9 - 25, false));
        this.l(2, n10 - 1);
        this.l(22, bl3 ? 1 : 0);
        if (bl2) {
            int n11 = n3 - this.aD;
            int n12 = n3 - -2636;
            if (n10 < 11 || n4 >= 6) {
                ++n11;
                ++n12;
            }
            int n13 = n2 - n9 + 1;
            this.l(19, n11);
            int[] arrn = new int[1];
            int n14 = com.ibm.icu.util.af.b(n12 - 1, 60, arrn);
            this.l(0, n14 + 1);
            this.l(1, arrn[0] + 1);
            this.l(5, n13);
            int n15 = this.G(n3);
            if (n2 < n15) {
                n15 = this.G(n3 - 1);
            }
            this.l(6, n2 - n15 + 1);
        }
    }

    private int G(int n2) {
        long l2 = this.aH.a((long)n2);
        if (l2 == com.ibm.icu.a.q.a) {
            int n3 = this.D(n2 - 1);
            int n4 = this.D(n2);
            int n5 = this.c(n3 + 1, true);
            int n6 = this.c(n5 + 25, true);
            int n7 = this.c(n4 + 1, false);
            l2 = this.p(n5, n7) == 12 && (this.F(n5) || this.F(n6)) ? (long)this.c(n6 + 25, true) : (long)n6;
            this.aH.a(n2, l2);
        }
        return (int)l2;
    }

    protected int a(int n2, int n3, boolean bl2) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += com.ibm.icu.util.af.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        int n4 = n2 + this.aD - 1;
        int n5 = this.G(n4);
        int n6 = this.c(n5 + n3 * 29, true);
        int n7 = n6 + 2440588;
        int n8 = this.c(2);
        int n9 = this.c(22);
        int n10 = bl2 ? n9 : 0;
        this.s(n7);
        this.a(n6, this.y(), this.z(), false);
        if (n3 != this.c(2) || n10 != this.c(22)) {
            n6 = this.c(n6 + 25, true);
            n7 = n6 + 2440588;
        }
        this.l(2, n8);
        this.l(22, n9);
        return n7 - 1;
    }

    public String b() {
        return "chinese";
    }

    private void a(ObjectInputStream objectInputStream) {
        this.aD = -2636;
        this.aE = aL;
        objectInputStream.defaultReadObject();
        this.aF = new e();
        this.aG = new q();
        this.aH = new q();
    }
}

