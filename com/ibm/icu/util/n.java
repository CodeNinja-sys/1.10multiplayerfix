/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.cu;
import com.ibm.icu.d.cw;
import com.ibm.icu.d.eo;
import com.ibm.icu.d.iz;
import com.ibm.icu.util.af;
import com.ibm.icu.util.ai;
import com.ibm.icu.util.as;
import com.ibm.icu.util.ay;
import com.ibm.icu.util.b;
import com.ibm.icu.util.bf;
import com.ibm.icu.util.bg;
import com.ibm.icu.util.bk;
import com.ibm.icu.util.bm;
import com.ibm.icu.util.bn;
import com.ibm.icu.util.c;
import com.ibm.icu.util.cf;
import com.ibm.icu.util.df;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dm;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.du;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.p;
import com.ibm.icu.util.q;
import com.ibm.icu.util.r;
import com.ibm.icu.util.s;
import com.ibm.icu.util.t;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;

public abstract class n
implements Serializable,
Cloneable,
Comparable {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 11;
    public static final int o = 12;
    public static final int p = 13;
    public static final int q = 14;
    public static final int r = 15;
    public static final int s = 16;
    public static final int t = 17;
    public static final int u = 18;
    public static final int v = 19;
    public static final int w = 20;
    public static final int x = 21;
    public static final int y = 22;
    protected static final int z = 23;
    protected static final int A = 32;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 4;
    public static final int F = 5;
    public static final int G = 6;
    public static final int H = 7;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    public static final int N = 5;
    public static final int O = 6;
    public static final int P = 7;
    public static final int Q = 8;
    public static final int R = 9;
    public static final int S = 10;
    public static final int T = 11;
    public static final int U = 12;
    public static final int V = 0;
    public static final int W = 1;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int aa = 3;
    public static final int ab = 0;
    public static final int ac = 1;
    public static final int ad = 2;
    protected static final int ae = 1000;
    protected static final int af = 60000;
    protected static final int ag = 3600000;
    protected static final long ah = 86400000L;
    protected static final long ai = 604800000L;
    protected static final int aj = 1721426;
    protected static final int ak = 2440588;
    protected static final int al = -2130706432;
    protected static final long am = -184303902528000000L;
    protected static final Date an = new Date(-184303902528000000L);
    protected static final int ao = 0x7F000000;
    protected static final long ap = 183882168921600000L;
    protected static final Date aq = new Date(183882168921600000L);
    private transient int[] a;
    private transient int[] aC;
    private long aD;
    private transient boolean aE;
    private transient boolean aF;
    private transient boolean aG;
    private transient boolean aH;
    private boolean aI = true;
    private dj aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ = 0;
    private int aR = 0;
    private static aj aS = new ew();
    protected static final int ar = 0;
    protected static final int as = 1;
    protected static final int at = 2;
    private transient int aT = 2;
    private static final long aU = 6222646104888790989L;
    private transient int aV;
    private transient int aW;
    private transient int aX;
    private transient int aY;
    private transient int aZ;
    private static int ba = 10000;
    private static final String[] bb = new String[]{"gregorian", "japanese", "buddhist", "roc", "persian", "islamic-civil", "islamic", "hebrew", "chinese", "indian", "coptic", "ethiopic", "ethiopic-amete-alem", "iso8601", "dangi"};
    private static final int bc = 0;
    private static final int bd = 1;
    private static final int be = 2;
    private static final int bf = 3;
    private static final int bg = 4;
    private static final int bh = 5;
    private static final int bi = 6;
    private static final int bj = 7;
    private static final int bk = 8;
    private static final int bl = 9;
    private static final int bm = 10;
    private static final int bn = 11;
    private static final int bo = 12;
    private static final int bp = 13;
    private static final int bq = 14;
    private static final int br = -1;
    private static q bs;
    private static final aj bt;
    private static final String[] bu;
    private static final char bv = '\'';
    private static final int bw = Integer.MAX_VALUE;
    private static final int[][] bx;
    protected static final int au = 0;
    protected static final int av = 1;
    protected static final int aw = 2;
    protected static final int ax = 3;
    protected static final int ay = 32;
    static final int[][][] az;
    static final int[][][] aA;
    private static final int[] by;
    private static final int[][] bz;
    private static final String[] bA;
    private dn bB;
    private dn bC;

    protected n() {
        this(dj.p(), dn.a(dr.b));
    }

    protected n(dj dj2, Locale locale) {
        this(dj2, dn.a(locale));
    }

    protected n(dj dj2, dn dn2) {
        this.aJ = dj2;
        this.e(dn2);
        this.G();
    }

    private void c() {
        this.aT = 1;
        for (int i2 = 0; i2 < this.aC.length; ++i2) {
            int n2 = ba;
            int n3 = -1;
            for (int i3 = 0; i3 < this.aC.length; ++i3) {
                if (this.aC[i3] <= this.aT || this.aC[i3] >= n2) continue;
                n2 = this.aC[i3];
                n3 = i3;
            }
            if (n3 < 0) break;
            this.aC[n3] = ++this.aT;
        }
        ++this.aT;
    }

    private void G() {
        this.a = this.x();
        if (this.a == null || this.a.length < 23 || this.a.length > 32) {
            throw new IllegalStateException("Invalid fields[]");
        }
        this.aC = new int[this.a.length];
        int n2 = 4718695;
        for (int i2 = 23; i2 < this.a.length; ++i2) {
            n2 |= 1 << i2;
        }
        this.aV = n2;
    }

    public static synchronized n d() {
        return com.ibm.icu.util.n.b(null, null);
    }

    public static synchronized n a(dj dj2) {
        return com.ibm.icu.util.n.b(dj2, null);
    }

    public static synchronized n a(Locale locale) {
        return com.ibm.icu.util.n.b(null, dn.a(locale));
    }

    public static synchronized n a(dn dn2) {
        return com.ibm.icu.util.n.b(null, dn2);
    }

    public static synchronized n a(dj dj2, Locale locale) {
        return com.ibm.icu.util.n.b(dj2, dn.a(locale));
    }

    public static synchronized n a(dj dj2, dn dn2) {
        return com.ibm.icu.util.n.b(dj2, dn2);
    }

    private static n b(dj dj2, dn dn2) {
        if (dn2 == null) {
            dn2 = dn.a(dr.b);
        }
        if (dj2 == null) {
            dj2 = dj.p();
        }
        n n2 = com.ibm.icu.util.n.H().a(dn2);
        n2.b(dj2);
        n2.a(System.currentTimeMillis());
        return n2;
    }

    private static int d(dn dn2) {
        String string = com.ibm.icu.a.s.a(dn2);
        if (string != null) {
            string = string.toLowerCase(Locale.ENGLISH);
            for (int i2 = 0; i2 < bb.length; ++i2) {
                if (!string.equals(bb[i2])) continue;
                return i2;
            }
        }
        return -1;
    }

    public static Locale[] e() {
        if (bs == null) {
            return com.ibm.icu.a.bc.f();
        }
        return com.ibm.icu.util.n.H().a();
    }

    public static dn[] f() {
        if (bs == null) {
            return com.ibm.icu.a.bc.e();
        }
        return com.ibm.icu.util.n.H().b();
    }

    private static q H() {
        if (bs == null) {
            try {
                Class<?> class_ = Class.forName("com.ibm.icu.util.u");
                bs = (q)class_.newInstance();
            }
            catch (MissingResourceException missingResourceException) {
                throw missingResourceException;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.getMessage());
            }
        }
        return bs;
    }

    static n b(dn dn2) {
        n n2 = null;
        dj dj2 = dj.p();
        int n3 = com.ibm.icu.util.n.d(dn2);
        if (n3 == -1) {
            n3 = 0;
        }
        switch (n3) {
            case 0: {
                n2 = new bf(dj2, dn2);
                break;
            }
            case 1: {
                n2 = new bn(dj2, dn2);
                break;
            }
            case 2: {
                n2 = new c(dj2, dn2);
                break;
            }
            case 3: {
                n2 = new df(dj2, dn2);
                break;
            }
            case 4: {
                n2 = new cf(dj2, dn2);
                break;
            }
            case 5: {
                n2 = new bm(dj2, dn2);
                break;
            }
            case 6: {
                n2 = new bm(dj2, dn2);
                ((bm)n2).b(false);
                break;
            }
            case 7: {
                n2 = new bg(dj2, dn2);
                break;
            }
            case 8: {
                n2 = new af(dj2, dn2);
                break;
            }
            case 9: {
                n2 = new bk(dj2, dn2);
                break;
            }
            case 10: {
                n2 = new ai(dj2, dn2);
                break;
            }
            case 11: {
                n2 = new ay(dj2, dn2);
                break;
            }
            case 12: {
                n2 = new ay(dj2, dn2);
                ((ay)n2).b(true);
                break;
            }
            case 14: {
                n2 = new as(dj2, dn2);
                break;
            }
            case 13: {
                n2 = new bf(dj2, dn2);
                n2.k(2);
                n2.l(4);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown calendar type");
            }
        }
        return n2;
    }

    static Object a(p p2) {
        if (p2 == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        return com.ibm.icu.util.n.H().a(p2);
    }

    static boolean a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("registryKey must not be null");
        }
        if (bs == null) {
            return false;
        }
        return bs.a(object);
    }

    public static final String[] a(String string, dn dn2, boolean bl2) {
        int n2;
        Serializable serializable;
        String string2 = dn2.h();
        if (string2.length() == 0) {
            serializable = dn.j(dn2);
            string2 = ((dn)serializable).h();
        }
        serializable = new ArrayList();
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "supplementalData", com.ibm.icu.a.bc.n);
        dv dv3 = dv2.l("calendarPreferenceData");
        dv dv4 = null;
        try {
            dv4 = dv3.l(string2);
        }
        catch (MissingResourceException missingResourceException) {
            dv4 = dv3.l("001");
        }
        String[] arrstring = dv4.u();
        if (bl2) {
            return arrstring;
        }
        for (n2 = 0; n2 < arrstring.length; ++n2) {
            ((ArrayList)serializable).add(arrstring[n2]);
        }
        for (n2 = 0; n2 < bb.length; ++n2) {
            if (((ArrayList)serializable).contains(bb[n2])) continue;
            ((ArrayList)serializable).add(bb[n2]);
        }
        return ((ArrayList)serializable).toArray(new String[((ArrayList)serializable).size()]);
    }

    public final Date g() {
        return new Date(this.h());
    }

    public final void a(Date date) {
        this.a(date.getTime());
    }

    public long h() {
        if (!this.aE) {
            this.I();
        }
        return this.aD;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(long l2) {
        if (l2 > 183882168921600000L) {
            if (!this.l()) throw new IllegalArgumentException("millis value greater than upper bounds for a Calendar : " + l2);
            l2 = 183882168921600000L;
        } else if (l2 < -184303902528000000L) {
            if (!this.l()) throw new IllegalArgumentException("millis value less than lower bounds for a Calendar : " + l2);
            l2 = -184303902528000000L;
        }
        this.aD = l2;
        this.aG = false;
        this.aF = false;
        this.aH = true;
        this.aE = true;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.aC[i2] = 0;
            this.a[i2] = 0;
        }
    }

    public final int b(int n2) {
        this.j();
        return this.a[n2];
    }

    protected final int c(int n2) {
        return this.a[n2];
    }

    protected final int c(int n2, int n3) {
        return this.aC[n2] > 0 ? this.a[n2] : n3;
    }

    public final void d(int n2, int n3) {
        if (this.aH) {
            this.r();
        }
        this.a[n2] = n3;
        if (this.aT == ba) {
            this.c();
        }
        ++this.aT;
        this.aH = false;
        this.aF = false;
        this.aE = false;
    }

    public final void a(int n2, int n3, int n4) {
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6) {
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.d(1, n2);
        this.d(2, n3);
        this.d(5, n4);
        this.d(11, n5);
        this.d(12, n6);
        this.d(13, n7);
    }

    public final void i() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.aC[i2] = 0;
            this.a[i2] = 0;
        }
        this.aH = false;
        this.aG = false;
        this.aF = false;
        this.aE = false;
    }

    public final void d(int n2) {
        if (this.aH) {
            this.r();
        }
        this.a[n2] = 0;
        this.aC[n2] = 0;
        this.aH = false;
        this.aG = false;
        this.aF = false;
        this.aE = false;
    }

    public final boolean e(int n2) {
        return this.aH || this.aC[n2] != 0;
    }

    protected void j() {
        if (!this.aE) {
            this.I();
        }
        if (!this.aF) {
            this.r();
            this.aF = true;
            this.aG = true;
        }
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        n n2 = (n)object;
        return this.a(n2) && this.h() == n2.g().getTime();
    }

    public boolean a(n n2) {
        return this.getClass() == n2.getClass() && this.l() == n2.l() && this.o() == n2.o() && this.p() == n2.p() && this.k().equals(n2.k()) && this.m() == n2.m() && this.n() == n2.n();
    }

    public int hashCode() {
        return (this.aI ? 1 : 0) | this.aK << 1 | this.aL << 4 | this.aQ << 7 | this.aR << 9 | this.aJ.hashCode() << 11;
    }

    private long d(Object object) {
        long l2;
        if (object instanceof n) {
            l2 = ((n)object).h();
        } else if (object instanceof Date) {
            l2 = ((Date)object).getTime();
        } else {
            throw new IllegalArgumentException(object + "is not a Calendar or Date");
        }
        return this.h() - l2;
    }

    public boolean b(Object object) {
        return this.d(object) < 0L;
    }

    public boolean c(Object object) {
        return this.d(object) > 0L;
    }

    public int f(int n2) {
        int n3;
        switch (n2) {
            case 5: {
                n n4 = (n)this.clone();
                n4.a(true);
                n4.a(n2, false);
                n3 = this.b(n4.b(19), n4.b(2));
                break;
            }
            case 6: {
                n n5 = (n)this.clone();
                n5.a(true);
                n5.a(n2, false);
                n3 = this.v(n5.b(19));
                break;
            }
            case 0: 
            case 7: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 21: {
                n3 = this.n(n2);
                break;
            }
            default: {
                n3 = this.e(n2, this.p(n2), this.n(n2));
            }
        }
        return n3;
    }

    public int g(int n2) {
        int n3;
        switch (n2) {
            case 7: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 21: {
                n3 = this.m(n2);
                break;
            }
            default: {
                n3 = this.e(n2, this.o(n2), this.m(n2));
            }
        }
        return n3;
    }

    protected void a(int n2, boolean bl2) {
        this.d(21, 0);
        switch (n2) {
            case 1: 
            case 19: {
                this.d(6, this.o(6));
                break;
            }
            case 17: {
                this.d(3, this.o(3));
                break;
            }
            case 2: {
                this.d(5, this.o(5));
                break;
            }
            case 8: {
                this.d(5, 1);
                this.d(7, this.b(7));
                break;
            }
            case 3: 
            case 4: {
                int n3 = this.aK;
                if (bl2 && (n3 = (n3 + 6) % 7) < 1) {
                    n3 += 7;
                }
                this.d(7, n3);
            }
        }
        this.d(n2, this.o(n2));
    }

    private int e(int n2, int n3, int n4) {
        if (n3 == n4) {
            return n3;
        }
        int n5 = n4 > n3 ? 1 : -1;
        n n6 = (n)this.clone();
        n6.j();
        n6.a(true);
        n6.a(n2, n5 < 0);
        n6.d(n2, n3);
        if (n6.b(n2) != n3 && n2 != 4 && n5 > 0) {
            return n3;
        }
        int n7 = n3;
        do {
            n6.f(n2, n5);
            if (n6.b(n2) != (n3 += n5)) break;
            n7 = n3;
        } while (n3 != n4);
        return n7;
    }

    public final void b(int n2, boolean bl2) {
        this.e(n2, bl2 ? 1 : -1);
    }

    public void e(int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        this.j();
        switch (n2) {
            case 0: 
            case 5: 
            case 9: 
            case 12: 
            case 13: 
            case 14: 
            case 21: {
                int n4 = this.g(n2);
                int n5 = this.f(n2);
                int n6 = n5 - n4 + 1;
                int n7 = this.c(n2) + n3;
                n7 = (n7 - n4) % n6;
                if (n7 < 0) {
                    n7 += n6;
                }
                this.d(n2, n7 += n4);
                return;
            }
            case 10: 
            case 11: {
                long l2 = this.h();
                int n8 = this.c(n2);
                int n9 = this.n(n2);
                int n10 = (n8 + n3) % (n9 + 1);
                if (n10 < 0) {
                    n10 += n9 + 1;
                }
                this.a(l2 + 3600000L * ((long)n10 - (long)n8));
                return;
            }
            case 2: {
                int n11 = this.f(2);
                int n12 = (this.c(2) + n3) % (n11 + 1);
                if (n12 < 0) {
                    n12 += n11 + 1;
                }
                this.d(2, n12);
                this.h(5);
                return;
            }
            case 1: 
            case 17: {
                String string;
                boolean bl2 = false;
                int n13 = this.b(0);
                if (n13 == 0 && ((string = this.b()).equals("gregorian") || string.equals("roc") || string.equals("coptic"))) {
                    n3 = -n3;
                    bl2 = true;
                }
                int n14 = this.c(n2) + n3;
                if (n13 > 0 || n14 >= 1) {
                    int n15 = this.f(n2);
                    if (n15 < 32768) {
                        if (n14 < 1) {
                            n14 = n15 - -n14 % n15;
                        } else if (n14 > n15) {
                            n14 = (n14 - 1) % n15 + 1;
                        }
                    } else if (n14 < 1) {
                        n14 = 1;
                    }
                } else if (bl2) {
                    n14 = 1;
                }
                this.d(n2, n14);
                this.h(2);
                this.h(5);
                return;
            }
            case 19: {
                this.d(n2, this.c(n2) + n3);
                this.h(2);
                this.h(5);
                return;
            }
            case 4: {
                int n16;
                int n17 = this.c(7) - this.o();
                if (n17 < 0) {
                    n17 += 7;
                }
                if ((n16 = (n17 - this.c(5) + 1) % 7) < 0) {
                    n16 += 7;
                }
                int n18 = 7 - n16 < this.p() ? 8 - n16 : 1 - n16;
                int n19 = this.f(5);
                int n20 = (n19 - this.c(5) + n17) % 7;
                int n21 = n19 + 7 - n20;
                int n22 = n21 - n18;
                int n23 = (this.c(5) + n3 * 7 - n18) % n22;
                if (n23 < 0) {
                    n23 += n22;
                }
                if ((n23 += n18) < 1) {
                    n23 = 1;
                }
                if (n23 > n19) {
                    n23 = n19;
                }
                this.d(5, n23);
                return;
            }
            case 3: {
                int n24;
                int n25 = this.c(7) - this.o();
                if (n25 < 0) {
                    n25 += 7;
                }
                if ((n24 = (n25 - this.c(6) + 1) % 7) < 0) {
                    n24 += 7;
                }
                int n26 = 7 - n24 < this.p() ? 8 - n24 : 1 - n24;
                int n27 = this.f(6);
                int n28 = (n27 - this.c(6) + n25) % 7;
                int n29 = n27 + 7 - n28;
                int n30 = n29 - n26;
                int n31 = (this.c(6) + n3 * 7 - n26) % n30;
                if (n31 < 0) {
                    n31 += n30;
                }
                if ((n31 += n26) < 1) {
                    n31 = 1;
                }
                if (n31 > n27) {
                    n31 = n27;
                }
                this.d(6, n31);
                this.d(2);
                return;
            }
            case 6: {
                long l3 = (long)n3 * 86400000L;
                long l4 = this.aD - (long)(this.c(6) - 1) * 86400000L;
                int n32 = this.f(6);
                this.aD = (this.aD + l3 - l4) % ((long)n32 * 86400000L);
                if (this.aD < 0L) {
                    this.aD += (long)n32 * 86400000L;
                }
                this.a(this.aD + l4);
                return;
            }
            case 7: 
            case 18: {
                long l5 = (long)n3 * 86400000L;
                int n33 = this.c(n2);
                if ((n33 -= n2 == 7 ? this.o() : 1) < 0) {
                    n33 += 7;
                }
                long l6 = this.aD - (long)n33 * 86400000L;
                this.aD = (this.aD + l5 - l6) % 604800000L;
                if (this.aD < 0L) {
                    this.aD += 604800000L;
                }
                this.a(this.aD + l6);
                return;
            }
            case 8: {
                long l7 = (long)n3 * 604800000L;
                int n34 = (this.c(5) - 1) / 7;
                int n35 = (this.f(5) - this.c(5)) / 7;
                long l8 = this.aD - (long)n34 * 604800000L;
                long l9 = 604800000L * (long)(n34 + n35 + 1);
                this.aD = (this.aD + l7 - l8) % l9;
                if (this.aD < 0L) {
                    this.aD += l9;
                }
                this.a(this.aD + l8);
                return;
            }
            case 20: {
                this.d(n2, this.c(n2) + n3);
                return;
            }
        }
        throw new IllegalArgumentException("Calendar.roll(" + this.z(n2) + ") not supported");
    }

    public void f(int n2, int n3) {
        long l2;
        int n4;
        int n5;
        if (n3 == 0) {
            return;
        }
        long l3 = n3;
        boolean bl2 = true;
        switch (n2) {
            case 0: {
                this.d(n2, this.b(n2) + n3);
                this.h(0);
                return;
            }
            case 1: 
            case 17: {
                String string;
                int bl3 = this.b(0);
                if (bl3 == 0 && ((string = this.b()).equals("gregorian") || string.equals("roc") || string.equals("coptic"))) {
                    n3 = -n3;
                }
            }
            case 2: 
            case 19: {
                boolean n52 = this.l();
                this.a(true);
                this.d(n2, this.b(n2) + n3);
                this.h(5);
                if (!n52) {
                    this.j();
                    this.a(n52);
                }
                return;
            }
            case 3: 
            case 4: 
            case 8: {
                l3 *= 604800000L;
                break;
            }
            case 9: {
                l3 *= 43200000L;
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 18: 
            case 20: {
                l3 *= 86400000L;
                break;
            }
            case 10: 
            case 11: {
                l3 *= 3600000L;
                bl2 = false;
                break;
            }
            case 12: {
                l3 *= 60000L;
                bl2 = false;
                break;
            }
            case 13: {
                l3 *= 1000L;
                bl2 = false;
                break;
            }
            case 14: 
            case 21: {
                bl2 = false;
                break;
            }
            default: {
                throw new IllegalArgumentException("Calendar.add(" + this.z(n2) + ") not supported");
            }
        }
        boolean bl3 = false;
        int n6 = 0;
        if (bl2) {
            n5 = this.b(16) + this.b(15);
            n6 = this.c(11);
        }
        this.a(this.h() + l3);
        if (bl2 && (n4 = this.b(16) + this.b(15)) != n5 && (l2 = (long)(n5 - n4) % 86400000L) != 0L) {
            long l4 = this.aD;
            this.a(this.aD + l2);
            if (this.b(11) != n6) {
                this.a(l4);
            }
        }
    }

    public String b(Locale locale) {
        return this.getClass().getName();
    }

    public String c(dn dn2) {
        return this.getClass().getName();
    }

    public int b(n n2) {
        long l2 = this.h() - n2.h();
        return l2 < 0L ? -1 : (l2 > 0L ? 1 : 0);
    }

    public cu a(int n2, int n3, Locale locale) {
        return com.ibm.icu.util.n.a(this, dn.a(locale), n2, n3);
    }

    public cu a(int n2, int n3, dn dn2) {
        return com.ibm.icu.util.n.a(this, dn2, n2, n3);
    }

    protected cu a(String string, Locale locale) {
        return this.a(string, null, dn.a(locale));
    }

    protected cu a(String string, String string2, Locale locale) {
        return this.a(string, string2, dn.a(locale));
    }

    protected cu a(String string, dn dn2) {
        return this.a(string, null, dn2);
    }

    protected cu a(String string, String string2, dn dn2) {
        r r2 = new r(null);
        com.ibm.icu.util.r.a(r2, string);
        com.ibm.icu.util.r.b(r2, string2);
        com.ibm.icu.util.r.a(r2, new cw(this, dn2));
        com.ibm.icu.util.r.a(r2, dn2);
        com.ibm.icu.util.r.a(r2, this);
        return iz.a(r2);
    }

    private static cu a(n n2, dn dn2, int n3, int n4) {
        Object object;
        s s2 = com.ibm.icu.util.s.a(n2, dn2);
        String string = null;
        String string2 = null;
        if (n4 >= 0 && n3 >= 0) {
            string2 = eo.a(com.ibm.icu.util.s.a(s2, n3), com.ibm.icu.util.s.a(s2)[n4], com.ibm.icu.util.s.a(s2)[n3 + 4]);
            if (com.ibm.icu.util.s.b(s2) != null) {
                object = com.ibm.icu.util.s.b(s2)[n3 + 4];
                String string3 = com.ibm.icu.util.s.b(s2)[n4];
                string = com.ibm.icu.util.n.a(com.ibm.icu.util.s.a(s2)[n3 + 4], com.ibm.icu.util.s.a(s2)[n4], (String)object, string3);
            }
        } else if (n4 >= 0) {
            string2 = com.ibm.icu.util.s.a(s2)[n4];
            if (com.ibm.icu.util.s.b(s2) != null) {
                string = com.ibm.icu.util.s.b(s2)[n4];
            }
        } else if (n3 >= 0) {
            string2 = com.ibm.icu.util.s.a(s2)[n3 + 4];
            if (com.ibm.icu.util.s.b(s2) != null) {
                string = com.ibm.icu.util.s.b(s2)[n3 + 4];
            }
        } else {
            throw new IllegalArgumentException("No date or time style specified");
        }
        object = n2.a(string2, string, dn2);
        ((cu)object).a(n2);
        return object;
    }

    public static String a(n n2, dn dn2, int n3) {
        s s2 = com.ibm.icu.util.s.a(n2, dn2);
        return com.ibm.icu.util.s.a(s2, n3);
    }

    private static String a(String string, String string2, String string3, String string4) {
        if (string3 == null && string4 == null) {
            return null;
        }
        if (string3 == null) {
            return com.ibm.icu.util.n.a(string2, string4);
        }
        if (string4 == null) {
            return com.ibm.icu.util.n.a(string, string3);
        }
        if (string3.equals(string4)) {
            return string3;
        }
        return com.ibm.icu.util.n.a(string, string3) + ";" + com.ibm.icu.util.n.a(string2, string4);
    }

    private static String a(String string, String string2) {
        if (string2.indexOf(61) >= 0) {
            return string2;
        }
        boolean bl2 = false;
        char c2 = ' ';
        StringBuilder stringBuilder = new StringBuilder();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(string);
        char c3 = stringCharacterIterator.first();
        while (c3 != '\uffff') {
            if (c3 == '\'') {
                bl2 = !bl2;
                c2 = c3;
            } else {
                if (!bl2 && c3 != c2) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(";");
                    }
                    stringBuilder.append(c3);
                    stringBuilder.append("=");
                    stringBuilder.append(string2);
                }
                c2 = c3;
            }
            c3 = stringCharacterIterator.next();
        }
        return stringBuilder.toString();
    }

    protected void h(int n2) {
        int n3 = this.f(n2);
        int n4 = this.g(n2);
        if (this.a[n2] > n3) {
            this.d(n2, n3);
        } else if (this.a[n2] < n4) {
            this.d(n2, n4);
        }
    }

    protected int b(int n2, int n3, int n4) {
        int n5 = (n4 - this.o() - n3 + 1) % 7;
        if (n5 < 0) {
            n5 += 7;
        }
        int n6 = (n2 + n5 - 1) / 7;
        if (7 - n5 >= this.p()) {
            ++n6;
        }
        return n6;
    }

    protected final int g(int n2, int n3) {
        return this.b(n2, n2, n3);
    }

    public int a(Date date, int n2) {
        long l2;
        int n3 = 0;
        long l3 = this.h();
        if (l3 < (l2 = date.getTime())) {
            int n4;
            block13: {
                n4 = 1;
                while (true) {
                    this.a(l3);
                    this.f(n2, n4);
                    long l4 = this.h();
                    if (l4 == l2) {
                        return n4;
                    }
                    if (l4 > l2) break block13;
                    if (n4 >= Integer.MAX_VALUE) break;
                    n3 = n4;
                    if ((n4 <<= 1) >= 0) continue;
                    n4 = Integer.MAX_VALUE;
                }
                throw new RuntimeException();
            }
            while (n4 - n3 > 1) {
                int n5 = n3 + (n4 - n3) / 2;
                this.a(l3);
                this.f(n2, n5);
                long l5 = this.h();
                if (l5 == l2) {
                    return n5;
                }
                if (l5 > l2) {
                    n4 = n5;
                    continue;
                }
                n3 = n5;
            }
        } else if (l3 > l2) {
            int n6;
            block14: {
                n6 = -1;
                do {
                    this.a(l3);
                    this.f(n2, n6);
                    long l6 = this.h();
                    if (l6 == l2) {
                        return n6;
                    }
                    if (l6 < l2) break block14;
                    n3 = n6;
                } while ((n6 <<= 1) != 0);
                throw new RuntimeException();
            }
            while (n3 - n6 > 1) {
                int n7 = n3 + (n6 - n3) / 2;
                this.a(l3);
                this.f(n2, n7);
                long l7 = this.h();
                if (l7 == l2) {
                    return n7;
                }
                if (l7 < l2) {
                    n6 = n7;
                    continue;
                }
                n3 = n7;
            }
        }
        this.a(l3);
        this.f(n2, n3);
        return n3;
    }

    public void b(dj dj2) {
        this.aJ = dj2;
        this.aF = false;
    }

    public dj k() {
        return this.aJ;
    }

    public void a(boolean bl2) {
        this.aI = bl2;
    }

    public boolean l() {
        return this.aI;
    }

    public void i(int n2) {
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException("Illegal repeated wall time option - " + n2);
        }
        this.aQ = n2;
    }

    public int m() {
        return this.aQ;
    }

    public void j(int n2) {
        if (n2 != 0 && n2 != 1 && n2 != 2) {
            throw new IllegalArgumentException("Illegal skipped wall time option - " + n2);
        }
        this.aR = n2;
    }

    public int n() {
        return this.aR;
    }

    public void k(int n2) {
        if (this.aK != n2) {
            if (n2 < 1 || n2 > 7) {
                throw new IllegalArgumentException("Invalid day of week");
            }
            this.aK = n2;
            this.aF = false;
        }
    }

    public int o() {
        return this.aK;
    }

    public void l(int n2) {
        if (n2 < 1) {
            n2 = 1;
        } else if (n2 > 7) {
            n2 = 7;
        }
        if (this.aL != n2) {
            this.aL = n2;
            this.aF = false;
        }
    }

    public int p() {
        return this.aL;
    }

    protected abstract int a(int var1, int var2);

    protected int h(int n2, int n3) {
        switch (n2) {
            case 7: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 21: 
            case 22: {
                return bx[n2][n3];
            }
            case 4: {
                int n4;
                if (n3 == 0) {
                    n4 = this.p() == 1 ? 1 : 0;
                } else if (n3 == 1) {
                    n4 = 1;
                } else {
                    int n5 = this.p();
                    int n6 = this.a(5, n3);
                    n4 = n3 == 2 ? (n6 + (7 - n5)) / 7 : (n6 + 6 + (7 - n5)) / 7;
                }
                return n4;
            }
        }
        return this.a(n2, n3);
    }

    public final int m(int n2) {
        return this.h(n2, 0);
    }

    public final int n(int n2) {
        return this.h(n2, 3);
    }

    public final int o(int n2) {
        return this.h(n2, 1);
    }

    public final int p(int n2) {
        return this.h(n2, 2);
    }

    public int q(int n2) {
        if (n2 < 1 || n2 > 7) {
            throw new IllegalArgumentException("Invalid day of week");
        }
        if (this.aM < this.aO ? n2 < this.aM || n2 > this.aO : n2 > this.aO && n2 < this.aM) {
            return 0;
        }
        if (n2 == this.aM) {
            return this.aN == 0 ? 1 : 2;
        }
        if (n2 == this.aO) {
            return this.aP == 0 ? 0 : 3;
        }
        return 1;
    }

    public int r(int n2) {
        if (n2 == this.aM) {
            return this.aN;
        }
        if (n2 == this.aO) {
            return this.aP;
        }
        throw new IllegalArgumentException("Not weekend transition day");
    }

    public boolean b(Date date) {
        this.a(date);
        return this.q();
    }

    public boolean q() {
        int n2 = this.b(7);
        int n3 = this.q(n2);
        switch (n3) {
            case 0: {
                return false;
            }
            case 1: {
                return true;
            }
        }
        int n4 = this.c(14) + 1000 * (this.c(13) + 60 * (this.c(12) + 60 * this.c(11)));
        int n5 = this.r(n2);
        return n3 == 2 ? n4 >= n5 : n4 < n5;
    }

    public Object clone() {
        try {
            n n2 = (n)super.clone();
            n2.a = new int[this.a.length];
            n2.aC = new int[this.a.length];
            System.arraycopy(this.a, 0, n2.a, 0, this.a.length);
            System.arraycopy(this.aC, 0, n2.aC, 0, this.a.length);
            n2.aJ = (dj)this.aJ.clone();
            return n2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("[time=");
        stringBuilder.append(this.aE ? String.valueOf(this.aD) : "?");
        stringBuilder.append(",areFieldsSet=");
        stringBuilder.append(this.aF);
        stringBuilder.append(",areAllFieldsSet=");
        stringBuilder.append(this.aG);
        stringBuilder.append(",lenient=");
        stringBuilder.append(this.aI);
        stringBuilder.append(",zone=");
        stringBuilder.append(this.aJ);
        stringBuilder.append(",firstDayOfWeek=");
        stringBuilder.append(this.aK);
        stringBuilder.append(",minimalDaysInFirstWeek=");
        stringBuilder.append(this.aL);
        stringBuilder.append(",repeatedWallTime=");
        stringBuilder.append(this.aQ);
        stringBuilder.append(",skippedWallTime=");
        stringBuilder.append(this.aR);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            stringBuilder.append(',').append(this.z(i2)).append('=');
            stringBuilder.append(this.e(i2) ? String.valueOf(this.a[i2]) : "?");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private void e(dn dn2) {
        dn dn3;
        t t2 = (t)aS.a(dn2);
        if (t2 == null) {
            Object object;
            Object object2;
            com.ibm.icu.a.r r2 = new com.ibm.icu.a.r(dn2, this.b());
            dn dn4 = dn.k(r2.c());
            if (dn4.h().length() > 0) {
                dn3 = dn4;
            } else {
                object2 = dn.j(dn4);
                object = new StringBuilder();
                ((StringBuilder)object).append(dn4.f());
                if (dn4.g().length() > 0) {
                    ((StringBuilder)object).append("_" + dn4.g());
                }
                if (((dn)object2).h().length() > 0) {
                    ((StringBuilder)object).append("_" + ((dn)object2).h());
                }
                if (dn4.i().length() > 0) {
                    ((StringBuilder)object).append("_" + dn4.i());
                }
                dn3 = new dn(((StringBuilder)object).toString());
            }
            object2 = dv.b("com/ibm/icu/impl/data/icudt51b", "supplementalData", com.ibm.icu.a.bc.n);
            object = ((dv)object2).l("weekData");
            dv dv2 = null;
            try {
                dv2 = ((dv)object).l(dn3.h());
            }
            catch (MissingResourceException missingResourceException) {
                dv2 = ((dv)object).l("001");
            }
            int[] arrn = dv2.z();
            t2 = new t(arrn[0], arrn[1], arrn[2], arrn[3], arrn[4], arrn[5], r2.c());
            aS.a(dn2, t2);
        }
        this.k(t2.a);
        this.l(t2.b);
        this.aM = t2.c;
        this.aN = t2.d;
        this.aO = t2.e;
        this.aP = t2.f;
        dn3 = t2.g;
        this.a(dn3, dn3);
    }

    private void I() {
        this.t();
        if (this.l() || !this.aG) {
            this.aF = false;
        }
        this.aE = true;
        this.aH = false;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        if (!this.aE) {
            try {
                this.I();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        objectOutputStream.defaultWriteObject();
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.G();
        this.aE = true;
        this.aG = false;
        this.aF = false;
        this.aH = true;
        this.aT = 2;
    }

    protected void r() {
        int n2;
        int[] arrn = new int[2];
        this.k().a(this.aD, false, arrn);
        long l2 = this.aD + (long)arrn[0] + (long)arrn[1];
        int n3 = this.aV;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.aC[i2] = (n3 & 1) == 0 ? 1 : 0;
            n3 >>= 1;
        }
        long l3 = com.ibm.icu.util.n.a(l2, 86400000L);
        this.a[20] = (int)l3 + 2440588;
        this.C(this.a[20]);
        this.a(this.a[20]);
        this.J();
        this.a[21] = n2 = (int)(l2 - l3 * 86400000L);
        this.a[14] = n2 % 1000;
        this.a[13] = (n2 /= 1000) % 60;
        this.a[12] = (n2 /= 60) % 60;
        this.a[11] = n2 /= 60;
        this.a[9] = n2 / 12;
        this.a[10] = n2 % 12;
        this.a[15] = arrn[0];
        this.a[16] = arrn[1];
    }

    private final void C(int n2) {
        this.s(n2);
        int n3 = this.a[7] = com.ibm.icu.util.n.B(n2);
        int n4 = n3 - this.o() + 1;
        if (n4 < 1) {
            n4 += 7;
        }
        this.a[18] = n4;
    }

    protected final void s(int n2) {
        int n3;
        long l2 = n2 - 1721426;
        int[] arrn = new int[1];
        int n4 = com.ibm.icu.util.n.a(l2, 146097, arrn);
        int n5 = com.ibm.icu.util.n.b(arrn[0], 36524, arrn);
        int n6 = com.ibm.icu.util.n.b(arrn[0], 1461, arrn);
        int n7 = com.ibm.icu.util.n.b(arrn[0], 365, arrn);
        int n8 = 400 * n4 + 100 * n5 + 4 * n6 + n7;
        int n9 = arrn[0];
        if (n5 == 4 || n7 == 4) {
            n9 = 365;
        } else {
            ++n8;
        }
        boolean bl2 = (n8 & 3) == 0 && (n8 % 100 != 0 || n8 % 400 == 0);
        int n10 = 0;
        int n11 = n3 = bl2 ? 60 : 59;
        if (n9 >= n3) {
            n10 = bl2 ? 1 : 2;
        }
        int n12 = (12 * (n9 + n10) + 6) / 367;
        int n13 = n9 - bz[n12][bl2 ? 3 : 2] + 1;
        this.aW = n8;
        this.aX = n12;
        this.aZ = n13;
        this.aY = n9 + 1;
    }

    private final void J() {
        int n2;
        int n3 = this.a[19];
        int n4 = this.a[7];
        int n5 = this.a[6];
        int n6 = n3;
        int n7 = (n4 + 7 - this.o()) % 7;
        int n8 = (n4 - n5 + 7001 - this.o()) % 7;
        int n9 = (n5 - 1 + n8) / 7;
        if (7 - n8 >= this.p()) {
            ++n9;
        }
        if (n9 == 0) {
            n2 = n5 + this.v(n3 - 1);
            n9 = this.g(n2, n4);
        } else {
            n2 = this.v(n3);
            if (n5 >= n2 - 5) {
                int n10 = (n7 + n2 - n5) % 7;
                if (n10 < 0) {
                    n10 += 7;
                }
                if (6 - n10 >= this.p() && n5 + 7 - n7 > n2) {
                    n9 = 1;
                    ++n6;
                }
            }
        }
        this.a[3] = n9;
        this.a[17] = --n6;
        n2 = this.a[5];
        this.a[4] = this.g(n2, n4);
        this.a[8] = (n2 - 1) / 7 + 1;
    }

    protected int a(int[][][] arrn) {
        int n2 = -1;
        for (int i2 = 0; i2 < arrn.length && n2 < 0; ++i2) {
            int[][] arrn2 = arrn[i2];
            int n3 = 0;
            block1: for (int i3 = 0; i3 < arrn2.length; ++i3) {
                int n4;
                int[] arrn3 = arrn2[i3];
                int n5 = 0;
                int n6 = n4 = arrn3[0] >= 32 ? 1 : 0;
                while (n4 < arrn3.length) {
                    int n7 = this.aC[arrn3[n4]];
                    if (n7 == 0) continue block1;
                    n5 = Math.max(n5, n7);
                    ++n4;
                }
                if (n5 <= n3) continue;
                int n8 = arrn3[0];
                if (n8 >= 32) {
                    if ((n8 &= 0x1F) != 5 || this.aC[4] < this.aC[n8]) {
                        n2 = n8;
                    }
                } else {
                    n2 = n8;
                }
                if (n2 != n8) continue;
                n3 = n5;
            }
        }
        return n2 >= 32 ? n2 & 0x1F : n2;
    }

    protected int c(int n2, int n3, int n4) {
        int n5 = n4;
        for (int i2 = n2; i2 <= n3; ++i2) {
            if (this.aC[i2] <= n5) continue;
            n5 = this.aC[i2];
        }
        return n5;
    }

    protected final int t(int n2) {
        return this.aC[n2];
    }

    protected int i(int n2, int n3) {
        if (this.aC[n3] > this.aC[n2]) {
            return n3;
        }
        return n2;
    }

    protected void s() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.aC[i2] < 2) continue;
            this.u(i2);
        }
    }

    protected void u(int n2) {
        switch (n2) {
            case 5: {
                int n3 = this.a();
                this.d(n2, 1, this.b(n3, this.c(2)));
                break;
            }
            case 6: {
                int n4 = this.a();
                this.d(n2, 1, this.v(n4));
                break;
            }
            case 8: {
                if (this.c(n2) == 0) {
                    throw new IllegalArgumentException("DAY_OF_WEEK_IN_MONTH cannot be zero");
                }
                this.d(n2, this.m(n2), this.n(n2));
                break;
            }
            default: {
                this.d(n2, this.m(n2), this.n(n2));
            }
        }
    }

    protected final void d(int n2, int n3, int n4) {
        int n5 = this.a[n2];
        if (n5 < n3 || n5 > n4) {
            throw new IllegalArgumentException(this.z(n2) + '=' + n5 + ", valid range=" + n3 + ".." + n4);
        }
    }

    protected void t() {
        if (!this.l()) {
            this.s();
        }
        int n2 = this.v();
        long l2 = com.ibm.icu.util.n.A(n2);
        int n3 = this.aC[21] >= 2 && this.c(9, 14, 0) <= this.aC[21] ? this.c(21) : this.u();
        if (this.aC[15] >= 2 || this.aC[16] >= 2) {
            this.aD = l2 + (long)n3 - (long)(this.c(15) + this.c(16));
        } else if (!this.aI || this.aR == 2) {
            long l3;
            int n4;
            int n5 = this.a(l2, n3);
            if (n5 != (n4 = this.aJ.c(l3 = l2 + (long)n3 - (long)n5))) {
                if (!this.aI) {
                    throw new IllegalArgumentException("The specified wall time does not exist due to time zone offset transition.");
                }
                assert (this.aR == 2) : this.aR;
                if (this.aJ instanceof b) {
                    dm dm2 = ((b)this.aJ).b(l3, true);
                    if (dm2 == null) {
                        throw new RuntimeException("Could not locate previous zone transition");
                    }
                    this.aD = dm2.a();
                } else {
                    Long l4 = this.a(this.aJ, l3, 0x6DDD00L);
                    if (l4 == null && (l4 = this.a(this.aJ, l3, 108000000L)) == null) {
                        throw new RuntimeException("Could not locate previous zone transition within 30 hours from " + l3);
                    }
                    this.aD = l4;
                }
            } else {
                this.aD = l3;
            }
        } else {
            this.aD = l2 + (long)n3 - (long)this.a(l2, n3);
        }
    }

    private Long a(dj dj2, long l2, long l3) {
        int n2;
        assert (l3 > 0L);
        long l4 = l2;
        long l5 = l2 - l3 - 1L;
        int n3 = dj2.c(l4);
        if (n3 == (n2 = dj2.c(l5))) {
            return null;
        }
        return this.a(dj2, n3, l4, l5);
    }

    private Long a(dj dj2, int n2, long l2, long l3) {
        boolean bl2 = false;
        long l4 = 0L;
        for (int n3 : by) {
            long l5 = l2 / (long)n3;
            long l6 = l3 / (long)n3;
            if (l5 <= l6) continue;
            l4 = (l6 + l5 + 1L >>> 1) * (long)n3;
            bl2 = true;
            break;
        }
        if (!bl2) {
            l4 = l2 + l3 >>> 1;
        }
        if (bl2) {
            if (l4 != l2) {
                int n4 = dj2.c(l4);
                if (n4 != n2) {
                    return this.a(dj2, n2, l2, l4);
                }
                l2 = l4;
            }
            --l4;
        } else {
            l4 = l2 + l3 >>> 1;
        }
        if (l4 == l3) {
            return l2;
        }
        int n5 = dj2.c(l4);
        if (n5 != n2) {
            if (bl2) {
                return l2;
            }
            return this.a(dj2, n2, l2, l4);
        }
        return this.a(dj2, n2, l4, l3);
    }

    protected int u() {
        int n2;
        int n3 = 0;
        int n4 = this.aC[11];
        int n5 = Math.max(this.aC[10], this.aC[9]);
        int n6 = n2 = n5 > n4 ? n5 : n4;
        if (n2 != 0) {
            if (n2 == n4) {
                n3 += this.c(11);
            } else {
                n3 += this.c(10);
                n3 += 12 * this.c(9);
            }
        }
        n3 *= 60;
        n3 += this.c(12);
        n3 *= 60;
        n3 += this.c(13);
        n3 *= 1000;
        return n3 += this.c(14);
    }

    protected int a(long l2, int n2) {
        int[] arrn = new int[2];
        long l3 = l2 + (long)n2;
        if (this.aJ instanceof b) {
            int n3 = this.aQ == 1 ? 4 : 12;
            int n4 = this.aR == 1 ? 12 : 4;
            ((b)this.aJ).a(l3, n4, n3, arrn);
        } else {
            long l4;
            this.aJ.a(l3, true, arrn);
            boolean bl2 = false;
            if (this.aQ == 1) {
                l4 = l3 - (long)(arrn[0] + arrn[1]);
                int n5 = this.aJ.c(l4 - 21600000L);
                int n6 = arrn[0] + arrn[1] - n5;
                assert (n6 < -21600000) : n6;
                if (n6 < 0) {
                    bl2 = true;
                    this.aJ.a(l3 + (long)n6, true, arrn);
                }
            }
            if (!bl2 && this.aR == 1) {
                l4 = l3 - (long)(arrn[0] + arrn[1]);
                this.aJ.a(l4, false, arrn);
            }
        }
        return arrn[0] + arrn[1];
    }

    protected int v() {
        int n2;
        if (this.aC[20] >= 2) {
            n2 = this.c(0, 8, 0);
            if ((n2 = this.c(17, 19, n2)) <= this.aC[20]) {
                return this.c(20);
            }
        }
        if ((n2 = this.a(this.w())) < 0) {
            n2 = 5;
        }
        return this.x(n2);
    }

    protected int[][][] w() {
        return az;
    }

    protected abstract int a(int var1, int var2, boolean var3);

    protected abstract int a();

    protected int b(int n2, int n3) {
        return this.a(n2, n3 + 1, true) - this.a(n2, n3, true);
    }

    protected int v(int n2) {
        return this.a(n2 + 1, 0, false) - this.a(n2, 0, false);
    }

    protected int[] x() {
        return new int[23];
    }

    protected int w(int n2) {
        return 0;
    }

    protected int j(int n2, int n3) {
        return 1;
    }

    protected int x(int n2) {
        boolean bl2 = n2 == 5 || n2 == 4 || n2 == 8;
        int n3 = n2 == 3 ? this.c(17, this.a()) : this.a();
        this.l(19, n3);
        int n4 = bl2 ? this.c(2, this.w(n3)) : 0;
        int n5 = this.a(n3, n4, bl2);
        if (n2 == 5) {
            if (this.e(5)) {
                return n5 + this.c(5, this.j(n3, n4));
            }
            return n5 + this.j(n3, n4);
        }
        if (n2 == 6) {
            return n5 + this.c(6);
        }
        int n6 = this.o();
        int n7 = com.ibm.icu.util.n.B(n5 + 1) - n6;
        if (n7 < 0) {
            n7 += 7;
        }
        int n8 = 0;
        switch (this.a(aA)) {
            case 7: {
                n8 = this.c(7) - n6;
                break;
            }
            case 18: {
                n8 = this.c(18) - 1;
            }
        }
        if ((n8 %= 7) < 0) {
            n8 += 7;
        }
        int n9 = 1 - n7 + n8;
        if (n2 == 8) {
            int n10;
            if (n9 < 1) {
                n9 += 7;
            }
            if ((n10 = this.c(8, 1)) >= 0) {
                n9 += 7 * (n10 - 1);
            } else {
                int n11 = this.c(2, 0);
                int n12 = this.b(n3, n11);
                n9 += ((n12 - n9) / 7 + n10 + 1) * 7;
            }
        } else {
            if (7 - n7 < this.p()) {
                n9 += 7;
            }
            n9 += 7 * (this.c(n2) - 1);
        }
        return n5 + n9;
    }

    protected int k(int n2, int n3) {
        if (n3 < 0 || n3 > 11) {
            int[] arrn = new int[1];
            n2 += com.ibm.icu.util.n.b(n3, 12, arrn);
            n3 = arrn[0];
        }
        boolean bl2 = n2 % 4 == 0 && (n2 % 100 != 0 || n2 % 400 == 0);
        int n4 = n2 - 1;
        int n5 = 365 * n4 + com.ibm.icu.util.n.o(n4, 4) - com.ibm.icu.util.n.o(n4, 100) + com.ibm.icu.util.n.o(n4, 400) + 1721426 - 1;
        if (n3 != 0) {
            n5 += bz[n3][bl2 ? 3 : 2];
        }
        return n5;
    }

    protected void a(int n2) {
        this.l(2, this.z());
        this.l(5, this.B());
        this.l(6, this.A());
        int n3 = this.y();
        this.l(19, n3);
        int n4 = 1;
        if (n3 < 1) {
            n4 = 0;
            n3 = 1 - n3;
        }
        this.l(0, n4);
        this.l(1, n3);
    }

    protected final int y() {
        return this.aW;
    }

    protected final int z() {
        return this.aX;
    }

    protected final int A() {
        return this.aY;
    }

    protected final int B() {
        return this.aZ;
    }

    public final int C() {
        return this.a.length;
    }

    protected final void l(int n2, int n3) {
        if ((1 << n2 & this.aV) == 0) {
            throw new IllegalStateException("Subclass cannot set " + this.z(n2));
        }
        this.a[n2] = n3;
        this.aC[n2] = 1;
    }

    protected static final boolean y(int n2) {
        return n2 % 4 == 0 && (n2 % 100 != 0 || n2 % 400 == 0);
    }

    protected static final int m(int n2, int n3) {
        return bz[n3][com.ibm.icu.util.n.y(n2) ? 1 : 0];
    }

    protected static final int n(int n2, int n3) {
        return n3 > 0 ? com.ibm.icu.util.n.m(n2, n3 - 1) : 31;
    }

    protected static final long a(long l2, long l3) {
        return l2 >= 0L ? l2 / l3 : (l2 + 1L) / l3 - 1L;
    }

    protected static final int o(int n2, int n3) {
        return n2 >= 0 ? n2 / n3 : (n2 + 1) / n3 - 1;
    }

    protected static final int b(int n2, int n3, int[] arrn) {
        if (n2 >= 0) {
            arrn[0] = n2 % n3;
            return n2 / n3;
        }
        int n4 = (n2 + 1) / n3 - 1;
        arrn[0] = n2 - n4 * n3;
        return n4;
    }

    protected static final int a(long l2, int n2, int[] arrn) {
        if (l2 >= 0L) {
            arrn[0] = (int)(l2 % (long)n2);
            return (int)(l2 / (long)n2);
        }
        int n3 = (int)((l2 + 1L) / (long)n2 - 1L);
        arrn[0] = (int)(l2 - (long)n3 * (long)n2);
        return n3;
    }

    protected String z(int n2) {
        try {
            return bA[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return "Field " + n2;
        }
    }

    protected static final int b(long l2) {
        return (int)(2440588L + com.ibm.icu.util.n.a(l2, 86400000L));
    }

    protected static final long A(int n2) {
        return (long)(n2 - 2440588) * 86400000L;
    }

    protected static final int B(int n2) {
        int n3 = (n2 + 2) % 7;
        if (n3 < 1) {
            n3 += 7;
        }
        return n3;
    }

    protected final long D() {
        return this.aD;
    }

    public String b() {
        return "unknown";
    }

    public final dn a(du du2) {
        return du2 == dn.w ? this.bC : this.bB;
    }

    final void a(dn dn2, dn dn3) {
        if (dn2 == null != (dn3 == null)) {
            throw new IllegalArgumentException();
        }
        this.bB = dn2;
        this.bC = dn3;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.b((n)object);
    }

    static /* synthetic */ aj E() {
        return bt;
    }

    static /* synthetic */ String[] F() {
        return bu;
    }

    static {
        bt = new ew();
        bu = new String[]{"HH:mm:ss z", "HH:mm:ss z", "HH:mm:ss", "HH:mm", "EEEE, yyyy MMMM dd", "yyyy MMMM d", "yyyy MMM d", "yy/MM/dd", "{1} {0}", "{1} {0}", "{1} {0}", "{1} {0}", "{1} {0}"};
        bx = new int[][]{new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {1, 1, 7, 7}, new int[0], {0, 0, 1, 1}, {0, 0, 11, 11}, {0, 0, 23, 23}, {0, 0, 59, 59}, {0, 0, 59, 59}, {0, 0, 999, 999}, {-43200000, -43200000, 43200000, 43200000}, {0, 0, 3600000, 3600000}, new int[0], {1, 1, 7, 7}, new int[0], {-2130706432, -2130706432, 0x7F000000, 0x7F000000}, {0, 0, 86399999, 86399999}, {0, 0, 1, 1}};
        az = new int[][][]{new int[][]{{5}, {3, 7}, {4, 7}, {8, 7}, {3, 18}, {4, 18}, {8, 18}, {6}, {37, 1}, {35, 17}}, new int[][]{{3}, {4}, {8}, {40, 7}, {40, 18}}};
        aA = new int[][][]{new int[][]{{7}, {18}}};
        by = new int[]{3600000, 1800000, 60000, 1000};
        bz = new int[][]{{31, 31, 0, 0}, {28, 29, 31, 31}, {31, 31, 59, 60}, {30, 30, 90, 91}, {31, 31, 120, 121}, {30, 30, 151, 152}, {31, 31, 181, 182}, {31, 31, 212, 213}, {30, 30, 243, 244}, {31, 31, 273, 274}, {30, 30, 304, 305}, {31, 31, 334, 335}};
        bA = new String[]{"ERA", "YEAR", "MONTH", "WEEK_OF_YEAR", "WEEK_OF_MONTH", "DAY_OF_MONTH", "DAY_OF_YEAR", "DAY_OF_WEEK", "DAY_OF_WEEK_IN_MONTH", "AM_PM", "HOUR", "HOUR_OF_DAY", "MINUTE", "SECOND", "MILLISECOND", "ZONE_OFFSET", "DST_OFFSET", "YEAR_WOY", "DOW_LOCAL", "EXTENDED_YEAR", "JULIAN_DAY", "MILLISECONDS_IN_DAY"};
    }
}

