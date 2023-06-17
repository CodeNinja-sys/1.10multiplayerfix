/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.e;
import com.ibm.icu.a.q;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.util.Date;
import java.util.Locale;

public class bm
extends n {
    private static final long aN = -6253365474073869325L;
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
    private static final long aO = -42521587200000L;
    private static final int[][] aP = new int[][]{{0, 0, 0, 0}, {1, 1, 5000000, 5000000}, {0, 0, 11, 11}, {1, 1, 50, 51}, new int[0], {1, 1, 29, 30}, {1, 1, 354, 355}, new int[0], {-1, -1, 5, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {1, 1, 5000000, 5000000}, new int[0], {1, 1, 5000000, 5000000}, new int[0], new int[0]};
    private static e aQ = new e();
    private static q aR = new q();
    private boolean aS = true;

    public bm() {
        this(dj.p(), dn.a(dr.b));
    }

    public bm(dj dj2) {
        this(dj2, dn.a(dr.b));
    }

    public bm(Locale locale) {
        this(dj.p(), locale);
    }

    public bm(dn dn2) {
        this(dj.p(), dn2);
    }

    public bm(dj dj2, Locale locale) {
        super(dj2, locale);
        this.a(System.currentTimeMillis());
    }

    public bm(dj dj2, dn dn2) {
        super(dj2, dn2);
        this.a(System.currentTimeMillis());
    }

    public bm(Date date) {
        super(dj.p(), dn.a(dr.b));
        this.a(date);
    }

    public bm(int n2, int n3, int n4) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
    }

    public bm(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(dj.p(), dn.a(dr.b));
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
        this.d(13, n7);
    }

    public void b(boolean bl2) {
        if (this.aS != bl2) {
            long l2 = this.h();
            this.aS = bl2;
            this.i();
            this.a(l2);
        }
    }

    public boolean c() {
        return this.aS;
    }

    protected int a(int n2, int n3) {
        return aP[n2][n3];
    }

    private static final boolean C(int n2) {
        return (14 + 11 * n2) % 30 < 11;
    }

    private long D(int n2) {
        if (this.aS) {
            return (long)((n2 - 1) * 354) + (long)Math.floor((double)(3 + 11 * n2) / 30.0);
        }
        return bm.d(12 * (n2 - 1));
    }

    private long p(int n2, int n3) {
        int n4 = n2 + n3 / 12;
        int n5 = n3 % 12;
        if (this.aS) {
            return (long)Math.ceil(29.5 * (double)n5) + (long)((n4 - 1) * 354) + (long)Math.floor((double)(3 + 11 * n4) / 30.0);
        }
        return bm.d(12 * (n4 - 1) + n5);
    }

    private static final long d(long l2) {
        long l3 = aR.a(l2);
        if (l3 == com.ibm.icu.a.q.a) {
            long l4 = -42521587200000L + (long)Math.floor((double)l2 * 29.530588853) * 86400000L;
            double d2 = bm.c(l4);
            if (bm.c(l4) >= 0.0) {
                while ((d2 = bm.c(l4 -= 86400000L)) >= 0.0) {
                }
            } else {
                while ((d2 = bm.c(l4 += 86400000L)) < 0.0) {
                }
            }
            l3 = (l4 - -42521587200000L) / 86400000L + 1L;
            aR.a(l2, l3);
        }
        return l3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static final double c(long l2) {
        double d2 = 0.0;
        e e2 = aQ;
        synchronized (e2) {
            aQ.a(l2);
            d2 = aQ.j();
        }
        d2 = d2 * 180.0 / Math.PI;
        if (d2 > 180.0) {
            d2 -= 360.0;
        }
        return d2;
    }

    protected int b(int n2, int n3) {
        int n4 = 0;
        if (this.aS) {
            n4 = 29 + (n3 + 1) % 2;
            if (n3 == 11 && bm.C(n2)) {
                ++n4;
            }
        } else {
            n3 = 12 * (n2 - 1) + n3;
            n4 = (int)(bm.d(n3 + 1) - bm.d(n3));
        }
        return n4;
    }

    protected int v(int n2) {
        if (this.aS) {
            return 354 + (bm.C(n2) ? 1 : 0);
        }
        int n3 = 12 * (n2 - 1);
        return (int)(bm.d(n3 + 12) - bm.d(n3));
    }

    protected int a(int n2, int n3, boolean bl2) {
        return (int)this.p(n2, n3) + 1948439;
    }

    protected int a() {
        int n2 = this.i(19, 1) == 19 ? this.c(19, 1) : this.c(1, 1);
        return n2;
    }

    protected void a(int n2) {
        int n3;
        int n4;
        long l2 = n2 - 1948440;
        if (this.aS) {
            n4 = (int)Math.floor((double)(30L * l2 + 10646L) / 10631.0);
            n3 = (int)Math.ceil((double)(l2 - 29L - this.D(n4)) / 29.5);
            n3 = Math.min(n3, 11);
        } else {
            int n5 = (int)Math.floor((double)l2 / 29.530588853);
            long l3 = (long)Math.floor((double)n5 * 29.530588853 - 1.0);
            if (l2 - l3 >= 25L && bm.c(this.D()) > 0.0) {
                ++n5;
            }
            while ((l3 = bm.d(n5)) > l2) {
                --n5;
            }
            n4 = n5 / 12 + 1;
            n3 = n5 % 12;
        }
        int n6 = (int)(l2 - this.p(n4, n3)) + 1;
        int n7 = (int)(l2 - this.p(n4, 0) + 1L);
        this.l(0, 0);
        this.l(1, n4);
        this.l(19, n4);
        this.l(2, n3);
        this.l(5, n6);
        this.l(6, n7);
    }

    public String b() {
        if (this.aS) {
            return "islamic-civil";
        }
        return "islamic";
    }
}

