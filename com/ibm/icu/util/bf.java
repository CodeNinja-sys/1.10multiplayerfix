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

public class bf
extends n {
    private static final long a = 9199388694351062137L;
    public static final int aC = 0;
    public static final int aD = 1;
    private static final int aG = 1970;
    private static final int[][] aH = new int[][]{{31, 31, 0, 0}, {28, 29, 31, 31}, {31, 31, 59, 60}, {30, 30, 90, 91}, {31, 31, 120, 121}, {30, 30, 151, 152}, {31, 31, 181, 182}, {31, 31, 212, 213}, {30, 30, 243, 244}, {31, 31, 273, 274}, {30, 30, 304, 305}, {31, 31, 334, 335}};
    private static final int[][] aI = new int[][]{{0, 0, 1, 1}, {1, 1, 5828963, 5838270}, {0, 0, 11, 11}, {1, 1, 52, 53}, new int[0], {1, 1, 28, 31}, {1, 1, 365, 366}, new int[0], {-1, -1, 4, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {-5838270, -5838270, 5828964, 5838271}, new int[0], {-5838269, -5838269, 5828963, 5838270}, new int[0], new int[0]};
    private long aJ = -12219292800000L;
    private transient int aK = 2299161;
    private transient int aL = 1582;
    protected transient boolean aE;
    protected transient boolean aF;

    protected int a(int n2, int n3) {
        return aI[n2][n3];
    }

    public bf() {
        this(dj.p(), dn.a(dr.b));
    }

    public bf(dj dj2) {
        this(dj2, dn.a(dr.b));
    }

    public bf(Locale locale) {
        this(dj.p(), locale);
    }

    public bf(dn dn2) {
        this(dj.p(), dn2);
    }

    public bf(dj dj2, Locale locale) {
        super(dj2, locale);
        this.a(System.currentTimeMillis());
    }

    public bf(dj dj2, dn dn2) {
        super(dj2, dn2);
        this.a(System.currentTimeMillis());
    }

    public bf(int n2, int n3, int n4) {
        super(dj.p(), dn.a(dr.b));
        this.d(0, 1);
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
    }

    public bf(int n2, int n3, int n4, int n5, int n6) {
        super(dj.p(), dn.a(dr.b));
        this.d(0, 1);
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
    }

    public bf(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(dj.p(), dn.a(dr.b));
        this.d(0, 1);
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
        this.d(13, n7);
    }

    public void c(Date date) {
        this.aJ = date.getTime();
        if (this.aJ <= -184303902528000000L) {
            this.aK = Integer.MIN_VALUE;
            this.aL = Integer.MIN_VALUE;
        } else if (this.aJ >= 183882168921600000L) {
            this.aK = Integer.MAX_VALUE;
            this.aL = Integer.MAX_VALUE;
        } else {
            this.aK = (int)bf.a(this.aJ, 86400000L);
            bf bf2 = new bf(this.k());
            bf2.a(date);
            this.aL = bf2.b(19);
        }
    }

    public final Date c() {
        return new Date(this.aJ);
    }

    public boolean C(int n2) {
        return n2 >= this.aL ? n2 % 4 == 0 && (n2 % 100 != 0 || n2 % 400 == 0) : n2 % 4 == 0;
    }

    public boolean a(n n2) {
        return super.a(n2) && this.aJ == ((bf)n2).aJ;
    }

    public int hashCode() {
        return super.hashCode() ^ (int)this.aJ;
    }

    public void e(int n2, int n3) {
        switch (n2) {
            case 3: {
                int n4 = this.b(3);
                int n5 = this.b(17);
                int n6 = this.c(6);
                if (this.c(2) == 0) {
                    if (n4 >= 52) {
                        n6 += this.v(n5);
                    }
                } else if (n4 == 1) {
                    n6 -= this.v(n5 - 1);
                }
                if ((n4 += n3) < 1 || n4 > 52) {
                    int n7 = this.v(n5);
                    int n8 = (n7 - n6 + this.c(7) - this.o()) % 7;
                    if (n8 < 0) {
                        n8 += 7;
                    }
                    if (6 - n8 >= this.p()) {
                        n7 -= 7;
                    }
                    int n9 = this.g(n7, n8 + 1);
                    n4 = (n4 + n9 - 1) % n9 + 1;
                }
                this.d(3, n4);
                this.d(1, n5);
                return;
            }
        }
        super.e(n2, n3);
    }

    public int g(int n2) {
        return this.m(n2);
    }

    public int f(int n2) {
        switch (n2) {
            case 1: {
                n n3 = (n)this.clone();
                n3.a(true);
                int n4 = n3.b(0);
                Date date = n3.g();
                int n5 = aI[1][1];
                int n6 = aI[1][2] + 1;
                while (n5 + 1 < n6) {
                    int n7 = (n5 + n6) / 2;
                    n3.d(1, n7);
                    if (n3.b(1) == n7 && n3.b(0) == n4) {
                        n5 = n7;
                        continue;
                    }
                    n6 = n7;
                    n3.a(date);
                }
                return n5;
            }
        }
        return super.f(n2);
    }

    boolean G() {
        if (!this.k().b()) {
            return false;
        }
        this.j();
        return this.c(16) != 0;
    }

    protected int b(int n2, int n3) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += bf.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        return aH[n3][this.C(n2) ? 1 : 0];
    }

    protected int v(int n2) {
        return this.C(n2) ? 366 : 365;
    }

    protected void a(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (n2 >= this.aK) {
            n6 = this.z();
            n5 = this.B();
            n4 = this.A();
            n3 = this.y();
        } else {
            int n7;
            long l2 = n2 - 1721424;
            n3 = (int)bf.a(4L * l2 + 1464L, 1461L);
            long l3 = 365 * (n3 - 1) + bf.o(n3 - 1, 4);
            n4 = (int)(l2 - l3);
            boolean bl2 = (n3 & 3) == 0;
            int n8 = 0;
            int n9 = n7 = bl2 ? 60 : 59;
            if (n4 >= n7) {
                n8 = bl2 ? 1 : 2;
            }
            n6 = (12 * (n4 + n8) + 6) / 367;
            n5 = n4 - aH[n6][bl2 ? 3 : 2] + 1;
            ++n4;
        }
        this.l(2, n6);
        this.l(5, n5);
        this.l(6, n4);
        this.l(19, n3);
        int n10 = 1;
        if (n3 < 1) {
            n10 = 0;
            n3 = 1 - n3;
        }
        this.l(0, n10);
        this.l(1, n3);
    }

    protected int a() {
        int n2;
        int n3 = this.i(19, 1) == 19 ? this.c(19, 1970) : ((n2 = this.c(0, 1)) == 0 ? 1 - this.c(1, 1) : this.c(1, 1970));
        return n3;
    }

    protected int x(int n2) {
        this.aF = false;
        int n3 = super.x(n2);
        if (this.aE != n3 >= this.aK) {
            this.aF = true;
            n3 = super.x(n2);
        }
        return n3;
    }

    protected int a(int n2, int n3, boolean bl2) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += bf.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        boolean bl3 = n2 % 4 == 0;
        int n4 = n2 - 1;
        int n5 = 365 * n4 + bf.o(n4, 4) + 1721423;
        boolean bl4 = this.aE = n2 >= this.aL;
        if (this.aF) {
            boolean bl5 = this.aE = !this.aE;
        }
        if (this.aE) {
            bl3 = bl3 && (n2 % 100 != 0 || n2 % 400 == 0);
            n5 += bf.o(n4, 400) - bf.o(n4, 100) + 2;
        }
        if (n3 != 0) {
            n5 += aH[n3][bl3 ? 3 : 2];
        }
        return n5;
    }

    public String b() {
        return "gregorian";
    }
}

