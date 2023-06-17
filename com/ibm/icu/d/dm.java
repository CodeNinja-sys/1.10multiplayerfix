/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ak;
import com.ibm.icu.a.eb;
import com.ibm.icu.a.jd;
import com.ibm.icu.b.b;
import com.ibm.icu.c.a;
import com.ibm.icu.d.ct;
import com.ibm.icu.d.dn;
import com.ibm.icu.d.do;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.du;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.gr;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.aj;
import com.ibm.icu.util.ao;
import com.ibm.icu.util.dr;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class dm
extends gq {
    private static double L = 1.0E-11;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = 3;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 2;
    private static final int S = 3;
    private static final lf T = new lf(46, 46, 8228, 8228, 12290, 12290, 65042, 65042, 65106, 65106, 65294, 65294, 65377, 65377).l();
    private static final lf U = new lf(44, 44, 1548, 1548, 1643, 1643, 12289, 12289, 65040, 65041, 65104, 65105, 65292, 65292, 65380, 65380).l();
    private static final lf V = new lf(46, 46, 8228, 8228, 65106, 65106, 65294, 65294, 65377, 65377).l();
    private static final lf W = new lf(44, 44, 1643, 1643, 65040, 65040, 65104, 65104, 65292, 65292).l();
    private static final lf X = new lf(32, 32, 39, 39, 44, 44, 46, 46, 160, 160, 1548, 1548, 1643, 1644, 8192, 8202, 8216, 8217, 8228, 8228, 8239, 8239, 8287, 8287, 12288, 12290, 65040, 65042, 65104, 65106, 65287, 65287, 65292, 65292, 65294, 65294, 65377, 65377, 65380, 65380).l();
    private static final lf Y = new lf(32, 32, 39, 39, 44, 44, 46, 46, 160, 160, 1643, 1644, 8192, 8202, 8216, 8217, 8228, 8228, 8239, 8239, 8287, 8287, 12288, 12288, 65040, 65040, 65104, 65104, 65106, 65106, 65287, 65287, 65292, 65292, 65294, 65294, 65377, 65377).l();
    private int Z = 1000;
    static final double a = 1.0E-9;
    private transient du aa = new du();
    private String ab = "";
    private String ac = "";
    private String ad = "-";
    private String ae = "";
    private String af;
    private String ag;
    private String ah;
    private String ai;
    private ChoiceFormat aj;
    private int ak = 1;
    private byte al = (byte)3;
    private byte am = 0;
    private boolean an = false;
    private dp ao = null;
    private boolean ap = false;
    private int aq = 1;
    private int ar = 6;
    private boolean as;
    private byte at;
    private boolean au = false;
    private BigDecimal av = null;
    private transient a aw = null;
    private transient double ax = 0.0;
    private transient double ay = 0.0;
    private int az = 6;
    private com.ibm.icu.c.b aA = new com.ibm.icu.c.b(0, 0);
    private int aB = 0;
    private char aC = (char)32;
    private int aD = 0;
    private boolean aE = false;
    static final int b = 3;
    private int aF = 3;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    static final char g = '0';
    static final char h = '1';
    static final char i = '2';
    static final char j = '3';
    static final char k = '4';
    static final char l = '5';
    static final char m = '6';
    static final char n = '7';
    static final char o = '8';
    static final char p = '9';
    static final char q = ',';
    static final char r = '.';
    static final char s = '#';
    static final char t = '@';
    static final char u = 'E';
    static final char v = '+';
    private static final char aG = '\u2030';
    private static final char aH = '%';
    static final char w = '*';
    private static final char aI = '-';
    private static final char aJ = ';';
    private static final char aK = '\u00a4';
    private static final char aL = '\'';
    static final int x = 309;
    static final int y = 340;
    static final int z = 8;
    private static final long aM = 864413376551465018L;
    private ArrayList aN = new ArrayList();
    private String aO = "";
    private int aP = 0;
    private int aQ = 0;
    private transient Set aR = null;
    private transient boolean aS = false;
    private ct aT = null;
    static final do A = new do("", "");

    public dm() {
        com.ibm.icu.util.dn dn2 = com.ibm.icu.util.dn.a(dr.b);
        String string = dm.c(dn2, 0);
        this.ao = new dp(dn2);
        this.a(com.ibm.icu.util.aj.a(dn2));
        this.b(string, false);
        if (this.aQ == 3) {
            this.aT = new ct(dn2);
        } else {
            this.j(null);
        }
    }

    public dm(String string) {
        com.ibm.icu.util.dn dn2 = com.ibm.icu.util.dn.a(dr.b);
        this.ao = new dp(dn2);
        this.a(com.ibm.icu.util.aj.a(dn2));
        this.b(string, false);
        if (this.aQ == 3) {
            this.aT = new ct(dn2);
        } else {
            this.j(null);
        }
    }

    public dm(String string, dp dp2) {
        this.a(string, dp2);
    }

    private void a(String string, dp dp2) {
        this.ao = (dp)dp2.clone();
        this.T();
        this.b(string, false);
        if (this.aQ == 3) {
            this.aT = new ct(this.ao.A());
        } else {
            this.j(null);
        }
    }

    public dm(String string, dp dp2, ct ct2, int n2) {
        ct ct3 = ct2;
        if (n2 == 6) {
            ct3 = (ct)ct2.clone();
        }
        this.a(string, dp2, ct3, n2);
    }

    private void a(String string, dp dp2, ct ct2, int n2) {
        if (n2 != 6) {
            this.a(string, dp2);
        } else {
            this.ao = (dp)dp2.clone();
            this.aT = ct2;
            String string2 = this.aT.a("other");
            this.b(string2, false);
            this.T();
        }
        this.aP = n2;
    }

    dm(String string, dp dp2, int n2) {
        ct ct2 = null;
        if (n2 == 6) {
            ct2 = new ct(dp2.A());
        }
        this.a(string, dp2, ct2, n2);
    }

    public StringBuffer a(double d2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(d2, stringBuffer, fieldPosition, false);
    }

    private boolean e(double d2) {
        return d2 < 0.0 || d2 == 0.0 && 1.0 / d2 < 0.0;
    }

    private double f(double d2) {
        boolean bl2 = this.e(d2);
        if (bl2) {
            d2 = -d2;
        }
        if (this.ax > 0.0) {
            return dm.a(d2, this.ax, this.ay, this.az, bl2);
        }
        return d2;
    }

    private double g(double d2) {
        if (this.ak != 1) {
            return d2 * (double)this.ak;
        }
        return d2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private StringBuffer a(double d2, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2) {
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        if (Double.isNaN(d2)) {
            if (fieldPosition.getField() == 0) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            } else if (fieldPosition.getFieldAttribute() == gr.c) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            }
            stringBuffer.append(this.ao.o());
            if (bl2) {
                this.a(gr.c, stringBuffer.length() - this.ao.o().length(), stringBuffer.length());
            }
            if (fieldPosition.getField() == 0) {
                fieldPosition.setEndIndex(stringBuffer.length());
            } else if (fieldPosition.getFieldAttribute() == gr.c) {
                fieldPosition.setEndIndex(stringBuffer.length());
            }
            this.a(stringBuffer, fieldPosition, 0, 0);
            return stringBuffer;
        }
        d2 = this.g(d2);
        boolean bl3 = this.e(d2);
        if (Double.isInfinite(d2 = this.f(d2))) {
            int n2 = this.a(stringBuffer, bl3, true, bl2);
            if (fieldPosition.getField() == 0) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            } else if (fieldPosition.getFieldAttribute() == gr.c) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            }
            stringBuffer.append(this.ao.n());
            if (bl2) {
                this.a(gr.c, stringBuffer.length() - this.ao.n().length(), stringBuffer.length());
            }
            if (fieldPosition.getField() == 0) {
                fieldPosition.setEndIndex(stringBuffer.length());
            } else if (fieldPosition.getFieldAttribute() == gr.c) {
                fieldPosition.setEndIndex(stringBuffer.length());
            }
            int n3 = this.a(stringBuffer, bl3, false, bl2);
            this.a(stringBuffer, fieldPosition, n2, n3);
            return stringBuffer;
        }
        du du2 = this.aa;
        synchronized (du2) {
            this.aa.a(d2, this.i(false), !this.as && !this.A());
            return this.a(d2, stringBuffer, fieldPosition, bl3, false, bl2);
        }
    }

    double a(double d2) {
        if (Double.isNaN(d2)) {
            return d2;
        }
        if (Double.isInfinite(d2 = this.f(this.g(d2)))) {
            return d2;
        }
        du du2 = new du();
        du2.a(d2, this.i(false), false);
        return du2.b();
    }

    boolean b(double d2) {
        if (Double.isNaN(d2)) {
            return false;
        }
        return this.e(this.g(d2));
    }

    private static double a(double d2, double d3, double d4, int n2, boolean bl2) {
        double d5 = d4 == 0.0 ? d2 / d3 : d2 * d4;
        block0 : switch (n2) {
            case 2: {
                d5 = bl2 ? Math.floor(d5 + L) : Math.ceil(d5 - L);
                break;
            }
            case 3: {
                d5 = bl2 ? Math.ceil(d5 - L) : Math.floor(d5 + L);
                break;
            }
            case 1: {
                d5 = Math.floor(d5 + L);
                break;
            }
            case 0: {
                d5 = Math.ceil(d5 - L);
                break;
            }
            case 7: {
                if (d5 != Math.floor(d5)) {
                    throw new ArithmeticException("Rounding necessary");
                }
                return d2;
            }
            default: {
                double d6 = Math.ceil(d5);
                double d7 = d6 - d5;
                double d8 = Math.floor(d5);
                double d9 = d5 - d8;
                switch (n2) {
                    case 6: {
                        if (d9 + L < d7) {
                            d5 = d8;
                            break block0;
                        }
                        if (d7 + L < d9) {
                            d5 = d6;
                            break block0;
                        }
                        double d10 = d8 / 2.0;
                        d5 = d10 == Math.floor(d10) ? d8 : d6;
                        break block0;
                    }
                    case 5: {
                        d5 = d9 <= d7 + L ? d8 : d6;
                        break block0;
                    }
                    case 4: {
                        d5 = d7 <= d9 + L ? d6 : d8;
                        break block0;
                    }
                }
                throw new IllegalArgumentException("Invalid rounding mode: " + n2);
            }
        }
        d2 = d4 == 0.0 ? d5 * d3 : d5 / d4;
        return d2;
    }

    public StringBuffer a(long l2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(l2, stringBuffer, fieldPosition, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private StringBuffer a(long l2, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2) {
        boolean bl3;
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        if (this.aw != null) {
            return this.a(com.ibm.icu.c.a.a(l2), stringBuffer, fieldPosition);
        }
        boolean bl4 = bl3 = l2 < 0L;
        if (bl3) {
            l2 = -l2;
        }
        if (this.ak != 1) {
            boolean bl5 = false;
            if (l2 < 0L) {
                long l3 = Long.MIN_VALUE / (long)this.ak;
                bl5 = l2 <= l3;
            } else {
                long l4 = Long.MAX_VALUE / (long)this.ak;
                boolean bl6 = bl5 = l2 > l4;
            }
            if (bl5) {
                return this.a(BigInteger.valueOf(bl3 ? -l2 : l2), stringBuffer, fieldPosition, bl2);
            }
        }
        l2 *= (long)this.ak;
        du du2 = this.aa;
        synchronized (du2) {
            this.aa.a(l2, this.i(true));
            return this.a(l2, stringBuffer, fieldPosition, bl3, true, bl2);
        }
    }

    public StringBuffer a(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(bigInteger, stringBuffer, fieldPosition, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private StringBuffer a(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2) {
        if (this.aw != null) {
            return this.a(new a(bigInteger), stringBuffer, fieldPosition);
        }
        if (this.ak != 1) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(this.ak));
        }
        du du2 = this.aa;
        synchronized (du2) {
            this.aa.a(bigInteger, this.i(true));
            return this.a(bigInteger.intValue(), stringBuffer, fieldPosition, bigInteger.signum() < 0, true, bl2);
        }
    }

    public StringBuffer a(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(bigDecimal, stringBuffer, fieldPosition, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private StringBuffer a(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2) {
        if (this.ak != 1) {
            bigDecimal = bigDecimal.multiply(BigDecimal.valueOf(this.ak));
        }
        if (this.av != null) {
            bigDecimal = bigDecimal.divide(this.av, 0, this.az).multiply(this.av);
        }
        du du2 = this.aa;
        synchronized (du2) {
            this.aa.a(bigDecimal, this.i(false), !this.as && !this.A());
            return this.a(bigDecimal.doubleValue(), stringBuffer, fieldPosition, bigDecimal.signum() < 0, false, bl2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public StringBuffer a(a a2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (this.ak != 1) {
            a2 = a2.g(com.ibm.icu.c.a.a(this.ak), this.aA);
        }
        if (this.aw != null) {
            a2 = a2.a(this.aw, 0, this.az).g(this.aw, this.aA);
        }
        du du2 = this.aa;
        synchronized (du2) {
            this.aa.a(a2, this.i(false), !this.as && !this.A());
            return this.a(a2.doubleValue(), stringBuffer, fieldPosition, a2.i() < 0, false, false);
        }
    }

    private boolean o(int n2) {
        boolean bl2 = false;
        if (this.O() && n2 > 0 && this.al > 0) {
            bl2 = this.am > 0 && n2 > this.al ? (n2 - this.al) % this.am == 0 : n2 % this.al == 0;
        }
        return bl2;
    }

    private int i(boolean bl2) {
        if (this.A()) {
            return this.z();
        }
        if (this.as) {
            return this.b() + this.P();
        }
        return bl2 ? 0 : this.P();
    }

    private StringBuffer a(int n2, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2, boolean bl3, boolean bl4) {
        if (this.aQ == 3) {
            return this.a(this.aT.a(n2), stringBuffer, fieldPosition, bl2, bl3, bl4);
        }
        return this.a(stringBuffer, fieldPosition, bl2, bl3, bl4);
    }

    private StringBuffer a(double d2, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2, boolean bl3, boolean bl4) {
        if (this.aQ == 3) {
            return this.a(this.aT.a(d2), stringBuffer, fieldPosition, bl2, bl3, bl4);
        }
        return this.a(stringBuffer, fieldPosition, bl2, bl3, bl4);
    }

    private StringBuffer a(String string, StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2, boolean bl3, boolean bl4) {
        String string2;
        if (this.aP == 6 && !this.aO.equals(string2 = this.aT.a(string))) {
            this.b(string2, false);
        }
        this.j(string);
        return this.a(stringBuffer, fieldPosition, bl2, bl3, bl4);
    }

    private StringBuffer a(StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2, boolean bl3, boolean bl4) {
        if (this.aa.a()) {
            this.aa.c = 0;
        }
        int n2 = this.a(stringBuffer, bl2, true, bl4);
        if (this.as) {
            this.a(stringBuffer, fieldPosition, bl4);
        } else {
            this.a(stringBuffer, fieldPosition, bl3, bl4);
        }
        int n3 = this.a(stringBuffer, bl2, false, bl4);
        this.a(stringBuffer, fieldPosition, n2, n3);
        return stringBuffer;
    }

    private void a(StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2, boolean bl3) {
        boolean bl4;
        int n2;
        int n3;
        char[] arrc = this.ao.f();
        char c2 = this.aQ > 0 ? this.ao.u() : this.ao.h();
        char c3 = this.aQ > 0 ? this.ao.t() : this.ao.i();
        boolean bl5 = this.A();
        int n4 = this.a();
        int n5 = this.b();
        int n6 = stringBuffer.length();
        if (fieldPosition.getField() == 0) {
            fieldPosition.setBeginIndex(stringBuffer.length());
        } else if (fieldPosition.getFieldAttribute() == gr.c) {
            fieldPosition.setBeginIndex(stringBuffer.length());
        }
        int n7 = 0;
        int n8 = this.y();
        int n9 = this.z();
        if (!bl5) {
            n8 = 0;
            n9 = Integer.MAX_VALUE;
        }
        int n10 = n3 = bl5 ? Math.max(1, this.aa.c) : n5;
        if (this.aa.c > 0 && n3 < this.aa.c) {
            n3 = this.aa.c;
        }
        int n11 = 0;
        if (n3 > n4 && n4 >= 0) {
            n3 = n4;
            n11 = this.aa.c - n3;
        }
        int n12 = stringBuffer.length();
        for (n2 = n3 - 1; n2 >= 0; --n2) {
            if (n2 < this.aa.c && n11 < this.aa.d && n7 < n9) {
                stringBuffer.append(arrc[this.aa.b(n11++)]);
                ++n7;
            } else {
                stringBuffer.append(arrc[0]);
                if (n7 > 0) {
                    ++n7;
                }
            }
            if (!this.o(n2)) continue;
            stringBuffer.append(c2);
            if (!bl3) continue;
            this.a(gr.i, stringBuffer.length() - 1, stringBuffer.length());
        }
        if (fieldPosition.getField() == 0) {
            fieldPosition.setEndIndex(stringBuffer.length());
        } else if (fieldPosition.getFieldAttribute() == gr.c) {
            fieldPosition.setEndIndex(stringBuffer.length());
        }
        boolean bl6 = !bl2 && n11 < this.aa.d || (bl5 ? n7 < n8 : this.Q() > 0) ? true : (bl4 = false);
        if (!bl4 && stringBuffer.length() == n12) {
            stringBuffer.append(arrc[0]);
        }
        if (bl3) {
            this.a(gr.c, n6, stringBuffer.length());
        }
        if (this.an || bl4) {
            if (fieldPosition.getFieldAttribute() == gr.h) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            }
            stringBuffer.append(c3);
            if (fieldPosition.getFieldAttribute() == gr.h) {
                fieldPosition.setEndIndex(stringBuffer.length());
            }
            if (bl3) {
                this.a(gr.h, stringBuffer.length() - 1, stringBuffer.length());
            }
        }
        if (fieldPosition.getField() == 1) {
            fieldPosition.setBeginIndex(stringBuffer.length());
        } else if (fieldPosition.getFieldAttribute() == gr.d) {
            fieldPosition.setBeginIndex(stringBuffer.length());
        }
        int n13 = stringBuffer.length();
        int n14 = n3 = bl5 ? Integer.MAX_VALUE : this.P();
        if (bl5 && (n7 == n9 || n7 >= n8 && n11 == this.aa.d)) {
            n3 = 0;
        }
        for (n2 = 0; n2 < n3 && (bl5 || n2 < this.Q() || !bl2 && n11 < this.aa.d); ++n2) {
            if (-1 - n2 > this.aa.c - 1) {
                stringBuffer.append(arrc[0]);
                continue;
            }
            if (!bl2 && n11 < this.aa.d) {
                stringBuffer.append(arrc[this.aa.b(n11++)]);
            } else {
                stringBuffer.append(arrc[0]);
            }
            if (bl5 && (++n7 == n9 || n11 == this.aa.d && n7 >= n8)) break;
        }
        if (fieldPosition.getField() == 1) {
            fieldPosition.setEndIndex(stringBuffer.length());
        } else if (fieldPosition.getFieldAttribute() == gr.d) {
            fieldPosition.setEndIndex(stringBuffer.length());
        }
        if (bl3 && (this.an || bl4)) {
            this.a(gr.d, n13, stringBuffer.length());
        }
    }

    private void a(StringBuffer stringBuffer, FieldPosition fieldPosition, boolean bl2) {
        int n2;
        int n3;
        int n4;
        char[] arrc = this.ao.f();
        char c2 = this.aQ > 0 ? this.ao.t() : this.ao.i();
        boolean bl3 = this.A();
        int n5 = this.a();
        int n6 = this.b();
        if (fieldPosition.getField() == 0) {
            fieldPosition.setBeginIndex(stringBuffer.length());
            fieldPosition.setEndIndex(-1);
        } else if (fieldPosition.getField() == 1) {
            fieldPosition.setBeginIndex(-1);
        } else if (fieldPosition.getFieldAttribute() == gr.c) {
            fieldPosition.setBeginIndex(stringBuffer.length());
            fieldPosition.setEndIndex(-1);
        } else if (fieldPosition.getFieldAttribute() == gr.d) {
            fieldPosition.setBeginIndex(-1);
        }
        int n7 = stringBuffer.length();
        int n8 = -1;
        int n9 = -1;
        int n10 = 0;
        if (bl3) {
            n6 = 1;
            n5 = 1;
            n10 = this.y() - 1;
        } else {
            n10 = this.Q();
            if (n5 > 8 && (n5 = 1) < n6) {
                n5 = n6;
            }
            if (n5 > n6) {
                n6 = 1;
            }
        }
        int n11 = this.aa.c;
        if (n5 > 1 && n5 != n6) {
            n11 = n11 > 0 ? (n11 - 1) / n5 : n11 / n5 - 1;
            n11 *= n5;
        } else {
            n11 -= n6 > 0 || n10 > 0 ? n6 : 1;
        }
        int n12 = n6 + n10;
        int n13 = this.aa.a() ? n6 : this.aa.c - n11;
        int n14 = this.aa.d;
        if (n12 > n14) {
            n14 = n12;
        }
        if (n13 > n14) {
            n14 = n13;
        }
        for (n4 = 0; n4 < n14; ++n4) {
            if (n4 == n13) {
                if (fieldPosition.getField() == 0) {
                    fieldPosition.setEndIndex(stringBuffer.length());
                } else if (fieldPosition.getFieldAttribute() == gr.c) {
                    fieldPosition.setEndIndex(stringBuffer.length());
                }
                if (bl2) {
                    n8 = stringBuffer.length();
                    this.a(gr.c, n7, stringBuffer.length());
                }
                stringBuffer.append(c2);
                if (bl2) {
                    n3 = stringBuffer.length() - 1;
                    this.a(gr.h, n3, stringBuffer.length());
                    n9 = stringBuffer.length();
                }
                if (fieldPosition.getField() == 1) {
                    fieldPosition.setBeginIndex(stringBuffer.length());
                } else if (fieldPosition.getFieldAttribute() == gr.d) {
                    fieldPosition.setBeginIndex(stringBuffer.length());
                }
            }
            stringBuffer.append(n4 < this.aa.d ? arrc[this.aa.b(n4)] : arrc[0]);
        }
        if (this.aa.a() && n14 == 0) {
            stringBuffer.append(arrc[0]);
        }
        if (fieldPosition.getField() == 0) {
            if (fieldPosition.getEndIndex() < 0) {
                fieldPosition.setEndIndex(stringBuffer.length());
            }
        } else if (fieldPosition.getField() == 1) {
            if (fieldPosition.getBeginIndex() < 0) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            }
            fieldPosition.setEndIndex(stringBuffer.length());
        } else if (fieldPosition.getFieldAttribute() == gr.c) {
            if (fieldPosition.getEndIndex() < 0) {
                fieldPosition.setEndIndex(stringBuffer.length());
            }
        } else if (fieldPosition.getFieldAttribute() == gr.d) {
            if (fieldPosition.getBeginIndex() < 0) {
                fieldPosition.setBeginIndex(stringBuffer.length());
            }
            fieldPosition.setEndIndex(stringBuffer.length());
        }
        if (bl2) {
            if (n8 < 0) {
                this.a(gr.c, n7, stringBuffer.length());
            }
            if (n9 > 0) {
                this.a(gr.d, n9, stringBuffer.length());
            }
        }
        stringBuffer.append(this.ao.w());
        if (bl2) {
            this.a(gr.g, stringBuffer.length() - this.ao.w().length(), stringBuffer.length());
        }
        if (this.aa.a()) {
            n11 = 0;
        }
        int n15 = n3 = n11 < 0 ? 1 : 0;
        if (n3 != 0) {
            n11 = -n11;
            stringBuffer.append(this.ao.p());
            if (bl2) {
                this.a(gr.f, stringBuffer.length() - 1, stringBuffer.length());
            }
        } else if (this.au) {
            stringBuffer.append(this.ao.x());
            if (bl2) {
                n2 = stringBuffer.length() - 1;
                this.a(gr.f, n2, stringBuffer.length());
            }
        }
        n2 = stringBuffer.length();
        this.aa.a((long)n11);
        byte by2 = this.at;
        if (this.as && by2 < 1) {
            by2 = 1;
        }
        for (n4 = this.aa.c; n4 < by2; ++n4) {
            stringBuffer.append(arrc[0]);
        }
        for (n4 = 0; n4 < this.aa.c; ++n4) {
            stringBuffer.append(n4 < this.aa.d ? arrc[this.aa.b(n4)] : arrc[0]);
        }
        if (bl2) {
            this.a(gr.e, n2, stringBuffer.length());
        }
    }

    private final void a(StringBuffer stringBuffer, FieldPosition fieldPosition, int n2, int n3) {
        int n4;
        if (this.aB > 0 && (n4 = this.aB - stringBuffer.length()) > 0) {
            char[] arrc = new char[n4];
            for (int i2 = 0; i2 < n4; ++i2) {
                arrc[i2] = this.aC;
            }
            switch (this.aD) {
                case 1: {
                    stringBuffer.insert(n2, arrc);
                    break;
                }
                case 0: {
                    stringBuffer.insert(0, arrc);
                    break;
                }
                case 2: {
                    stringBuffer.insert(stringBuffer.length() - n3, arrc);
                    break;
                }
                case 3: {
                    stringBuffer.append(arrc);
                }
            }
            if (this.aD == 0 || this.aD == 1) {
                fieldPosition.setBeginIndex(fieldPosition.getBeginIndex() + n4);
                fieldPosition.setEndIndex(fieldPosition.getEndIndex() + n4);
            }
        }
    }

    public Number a(String string, ParsePosition parsePosition) {
        return (Number)this.a(string, parsePosition, null);
    }

    public ao a(CharSequence charSequence, ParsePosition parsePosition) {
        aj[] arraj = new aj[1];
        return (ao)this.a(((Object)charSequence).toString(), parsePosition, arraj);
    }

    private Object a(String string, ParsePosition parsePosition, aj[] arraj) {
        int n2;
        int n3 = n2 = parsePosition.getIndex();
        if (this.aB > 0 && (this.aD == 0 || this.aD == 1)) {
            n3 = this.a(string, n3);
        }
        if (string.regionMatches(n3, this.ao.o(), 0, this.ao.o().length())) {
            n3 += this.ao.o().length();
            if (this.aB > 0 && (this.aD == 2 || this.aD == 3)) {
                n3 = this.a(string, n3);
            }
            parsePosition.setIndex(n3);
            return new Double(Double.NaN);
        }
        n3 = n2;
        boolean[] arrbl = new boolean[3];
        if (this.aQ > 0) {
            if (!this.a(string, parsePosition, arraj, arrbl)) {
                return null;
            }
        } else if (!this.a(string, parsePosition, this.aa, arrbl, arraj, this.ah, this.ai, this.af, this.ag, 0)) {
            parsePosition.setIndex(n2);
            return null;
        }
        Number number = null;
        if (arrbl[0]) {
            number = new Double(arrbl[1] ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
        } else if (arrbl[2]) {
            number = arrbl[1] ? new Double("0.0") : new Double("-0.0");
        } else if (!arrbl[1] && this.aa.a()) {
            number = new Double("-0.0");
        } else {
            int n4 = this.ak;
            while (n4 % 10 == 0) {
                --this.aa.c;
                n4 /= 10;
            }
            if (!this.aE && n4 == 1 && this.aa.d()) {
                if (this.aa.c < 12) {
                    long l2 = 0L;
                    if (this.aa.d > 0) {
                        int n5 = 0;
                        while (n5 < this.aa.d) {
                            l2 = l2 * 10L + (long)((char)this.aa.e[n5++]) - 48L;
                        }
                        while (n5++ < this.aa.c) {
                            l2 *= 10L;
                        }
                        if (!arrbl[1]) {
                            l2 = -l2;
                        }
                    }
                    number = l2;
                } else {
                    BigInteger bigInteger = this.aa.a(arrbl[1]);
                    number = bigInteger.bitLength() < 64 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
                }
            } else {
                a a2 = this.aa.c(arrbl[1]);
                number = a2;
                if (n4 != 1) {
                    number = a2.c(com.ibm.icu.c.a.a(n4), this.aA);
                }
            }
        }
        return arraj != null ? new ao(number, arraj[0]) : number;
    }

    private boolean a(String string, ParsePosition parsePosition, aj[] arraj, boolean[] arrbl) {
        int n2;
        int n3;
        int n4 = parsePosition.getIndex();
        if (!this.aS) {
            n3 = this.aQ;
            this.S();
            if (n3 == 3) {
                this.b(this.aO, false);
            } else {
                this.a(this.aO, false);
            }
            this.aS = true;
        }
        n3 = n4;
        int n5 = -1;
        boolean[] arrbl2 = null;
        boolean[] arrbl3 = new boolean[3];
        ParsePosition parsePosition2 = new ParsePosition(n4);
        du du2 = new du();
        boolean bl2 = this.aP == 6 ? this.a(string, parsePosition2, du2, arrbl3, arraj, this.ah, this.ai, this.af, this.ag, 1) : this.a(string, parsePosition2, du2, arrbl3, arraj, this.ah, this.ai, this.af, this.ag, 0);
        if (bl2) {
            if (parsePosition2.getIndex() > n3) {
                n3 = parsePosition2.getIndex();
                arrbl2 = arrbl3;
                this.aa = du2;
            }
        } else {
            n5 = parsePosition2.getErrorIndex();
        }
        Iterator iterator = this.aR.iterator();
        while (iterator.hasNext()) {
            parsePosition2 = new ParsePosition(n4);
            du2 = new du();
            arrbl3 = new boolean[3];
            dn dn2 = (dn)iterator.next();
            n2 = this.a(string, parsePosition2, du2, arrbl3, arraj, dn2.a(), dn2.b(), dn2.c(), dn2.d(), dn2.e());
            if (n2 != 0) {
                bl2 = true;
                if (parsePosition2.getIndex() <= n3) continue;
                n3 = parsePosition2.getIndex();
                arrbl2 = arrbl3;
                this.aa = du2;
                continue;
            }
            n5 = parsePosition2.getErrorIndex() > n5 ? parsePosition2.getErrorIndex() : n5;
        }
        arrbl3 = new boolean[3];
        parsePosition2 = new ParsePosition(n4);
        du2 = new du();
        int n6 = this.aQ;
        this.aQ = -1;
        boolean bl3 = this.a(string, parsePosition2, du2, arrbl3, arraj, this.ad, this.ae, this.ab, this.ac, 0);
        this.aQ = n6;
        if (bl3) {
            if (parsePosition2.getIndex() > n3) {
                n3 = parsePosition2.getIndex();
                arrbl2 = arrbl3;
                this.aa = du2;
            }
            bl2 = true;
        } else {
            int n7 = n5 = parsePosition2.getErrorIndex() > n5 ? parsePosition2.getErrorIndex() : n5;
        }
        if (!bl2) {
            parsePosition.setErrorIndex(n5);
        } else {
            parsePosition.setIndex(n3);
            parsePosition.setErrorIndex(-1);
            for (n2 = 0; n2 < 3; ++n2) {
                arrbl[n2] = arrbl2[n2];
            }
        }
        return bl2;
    }

    private void S() {
        if (this.aT == null) {
            this.aT = new ct(this.ao.A());
        }
        this.aR = new HashSet();
        String string = this.aO;
        this.b(dm.c(this.ao.A(), 1), false);
        dn dn2 = new dn(this.ah, this.ai, this.af, this.ag, 0);
        this.aR.add(dn2);
        Iterator iterator = this.aT.d();
        HashSet<String> hashSet = new HashSet<String>();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = this.aT.a(string2);
            if (string3 == null || hashSet.contains(string3)) continue;
            hashSet.add(string3);
            this.b(string3, false);
            dn2 = new dn(this.ah, this.ai, this.af, this.ag, 1);
            this.aR.add(dn2);
        }
        this.aO = string;
    }

    private final boolean a(String string, ParsePosition parsePosition, du du2, boolean[] arrbl, aj[] arraj, String string2, String string3, String string4, String string5, int n2) {
        int n3 = parsePosition.getIndex();
        int n4 = parsePosition.getIndex();
        if (this.aB > 0 && this.aD == 0) {
            n3 = this.a(string, n3);
        }
        int n5 = this.a(string, n3, false, true, string4, n2, arraj);
        int n6 = this.a(string, n3, true, true, string2, n2, arraj);
        if (n5 >= 0 && n6 >= 0) {
            if (n5 > n6) {
                n6 = -1;
            } else if (n6 > n5) {
                n5 = -1;
            }
        }
        if (n5 >= 0) {
            n3 += n5;
        } else if (n6 >= 0) {
            n3 += n6;
        } else {
            parsePosition.setErrorIndex(n3);
            return false;
        }
        if (this.aB > 0 && this.aD == 1) {
            n3 = this.a(string, n3);
        }
        arrbl[0] = false;
        if (string.regionMatches(n3, this.ao.n(), 0, this.ao.n().length())) {
            n3 += this.ao.n().length();
            arrbl[0] = true;
        } else {
            lf lf2;
            du2.d = 0;
            du2.c = 0;
            char[] arrc = this.ao.f();
            char c2 = this.aQ == 0 ? this.ao.i() : this.ao.t();
            char c3 = this.ao.h();
            String string6 = this.ao.w();
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            long l2 = 0L;
            int n7 = 0;
            boolean bl6 = this.F();
            boolean bl7 = false;
            int n8 = -1;
            int n9 = n3;
            byte by2 = this.am == 0 ? this.al : this.am;
            boolean bl8 = com.ibm.icu.a.ak.a("com.ibm.icu.text.DecimalFormat.SkipExtendedSeparatorParsing", "false").equals("true");
            lf lf3 = lf2 = bl8 ? lf.a : this.a(c2, bl6);
            lf lf4 = bl8 ? lf.a : (bl6 ? Y : X);
            int n10 = 0;
            int n11 = -1;
            while (n3 < string.length()) {
                int n12 = kx.a(string, n3);
                n7 = n12 - arrc[0];
                if (n7 < 0 || n7 > 9) {
                    n7 = com.ibm.icu.b.b.a(n12, 10);
                }
                if (n7 < 0 || n7 > 9) {
                    for (n7 = 0; n7 < 10 && n12 != arrc[n7]; ++n7) {
                    }
                }
                if (n7 == 0) {
                    if (bl6 && n11 != -1) {
                        if (n8 != -1 && this.b(string, n8, n11) - 1 != by2 || n8 == -1 && this.b(string, n9, n3) - 1 > by2) {
                            bl7 = true;
                            break;
                        }
                        n8 = n11;
                    }
                    n11 = -1;
                    bl5 = true;
                    if (du2.d == 0) {
                        if (bl2) {
                            --du2.c;
                        }
                    } else {
                        ++n10;
                        du2.a((char)(n7 + 48));
                    }
                } else if (n7 > 0 && n7 <= 9) {
                    if (bl6 && n11 != -1) {
                        if (n8 != -1 && this.b(string, n8, n11) - 1 != by2 || n8 == -1 && this.b(string, n9, n3) - 1 > by2) {
                            bl7 = true;
                            break;
                        }
                        n8 = n11;
                    }
                    bl5 = true;
                    ++n10;
                    du2.a((char)(n7 + 48));
                    n11 = -1;
                } else if (n12 == c2) {
                    if (bl6 && (n11 != -1 || n8 != -1 && this.b(string, n8, n3) != this.al + 1)) {
                        bl7 = true;
                        break;
                    }
                    if (this.E() || bl2) break;
                    du2.c = n10;
                    bl2 = true;
                } else if (this.O() && n12 == c3) {
                    if (bl2) break;
                    if (bl6 && (!bl5 || n11 != -1)) {
                        bl7 = true;
                        break;
                    }
                    n11 = n3;
                    bl3 = true;
                } else if (!bl2 && lf2.b(n12)) {
                    if (bl6 && (n11 != -1 || n8 != -1 && this.b(string, n8, n3) != this.al + 1)) {
                        bl7 = true;
                        break;
                    }
                    if (this.E()) break;
                    du2.c = n10;
                    c2 = (char)n12;
                    bl2 = true;
                } else if (this.O() && !bl3 && lf4.b(n12)) {
                    if (bl2) break;
                    if (bl6 && (!bl5 || n11 != -1)) {
                        bl7 = true;
                        break;
                    }
                    c3 = (char)n12;
                    n11 = n3;
                    bl3 = true;
                } else {
                    if (bl4 || !string.regionMatches(true, n3, string6, 0, string6.length())) break;
                    boolean bl9 = false;
                    int n13 = n3 + string6.length();
                    if (n13 < string.length()) {
                        n12 = kx.a(string, n13);
                        if (n12 == this.ao.x()) {
                            ++n13;
                        } else if (n12 == this.ao.p()) {
                            ++n13;
                            bl9 = true;
                        }
                    }
                    du du3 = new du();
                    du3.d = 0;
                    while (n13 < string.length()) {
                        n7 = kx.a(string, n13) - arrc[0];
                        if (n7 < 0 || n7 > 9) {
                            n7 = com.ibm.icu.b.b.a(kx.a(string, n13), 10);
                        }
                        if (n7 < 0 || n7 > 9) break;
                        du3.a((char)(n7 + 48));
                        n13 += kx.a(kx.a(string, n13));
                    }
                    if (du3.d <= 0) break;
                    if (bl6 && (n11 != -1 || n8 != -1)) {
                        bl7 = true;
                        break;
                    }
                    if (du3.d > 10) {
                        if (bl9) {
                            arrbl[2] = true;
                        } else {
                            arrbl[0] = true;
                        }
                    } else {
                        du3.c = du3.d;
                        l2 = du3.c();
                        if (bl9) {
                            l2 = -l2;
                        }
                    }
                    n3 = n13;
                    bl4 = true;
                    break;
                }
                n3 += kx.a(n12);
            }
            if (n11 != -1) {
                n3 = n11;
            }
            if (!bl2) {
                du2.c = n10;
            }
            if (bl6 && !bl2 && n8 != -1 && this.b(string, n8, n3) != this.al + 1) {
                bl7 = true;
            }
            if (bl7) {
                parsePosition.setIndex(n4);
                parsePosition.setErrorIndex(n3);
                return false;
            }
            if ((l2 += (long)du2.c) < (long)(-this.D())) {
                arrbl[2] = true;
            } else if (l2 > (long)this.D()) {
                arrbl[0] = true;
            } else {
                du2.c = (int)l2;
            }
            if (!bl5 && n10 == 0) {
                parsePosition.setIndex(n4);
                parsePosition.setErrorIndex(n4);
                return false;
            }
        }
        if (this.aB > 0 && this.aD == 2) {
            n3 = this.a(string, n3);
        }
        if (n5 >= 0) {
            n5 = this.a(string, n3, false, false, string5, n2, arraj);
        }
        if (n6 >= 0) {
            n6 = this.a(string, n3, true, false, string3, n2, arraj);
        }
        if (n5 >= 0 && n6 >= 0) {
            if (n5 > n6) {
                n6 = -1;
            } else if (n6 > n5) {
                n5 = -1;
            }
        }
        if (n5 >= 0 == n6 >= 0) {
            parsePosition.setErrorIndex(n3);
            return false;
        }
        n3 += n5 >= 0 ? n5 : n6;
        if (this.aB > 0 && this.aD == 3) {
            n3 = this.a(string, n3);
        }
        parsePosition.setIndex(n3);
        boolean bl10 = arrbl[1] = n5 >= 0;
        if (parsePosition.getIndex() == n4) {
            parsePosition.setErrorIndex(n3);
            return false;
        }
        return true;
    }

    private int b(String string, int n2, int n3) {
        int n4 = 0;
        for (int i2 = n2; i2 < n3; i2 += kx.a(kx.a(string, i2))) {
            ++n4;
        }
        return n4;
    }

    private lf a(char c2, boolean bl2) {
        lf lf2 = lf.a;
        if (bl2) {
            if (V.b(c2)) {
                lf2 = V;
            } else if (W.b(c2)) {
                lf2 = W;
            }
        } else if (T.b(c2)) {
            lf2 = T;
        } else if (U.b(c2)) {
            lf2 = U;
        }
        return lf2;
    }

    private final int a(String string, int n2) {
        while (n2 < string.length() && string.charAt(n2) == this.aC) {
            ++n2;
        }
        return n2;
    }

    private int a(String string, int n2, boolean bl2, boolean bl3, String string2, int n3, aj[] arraj) {
        if (arraj != null || this.aj != null || this.aQ > 0) {
            return this.a(string2, string, n2, n3, arraj);
        }
        if (bl3) {
            return dm.a(bl2 ? this.ad : this.ab, string, n2);
        }
        return dm.a(bl2 ? this.ae : this.ac, string, n2);
    }

    private static int a(String string, String string2, int n2) {
        int n3 = n2;
        int n4 = 0;
        while (n4 < string.length()) {
            int n5 = kx.a(string, n4);
            int n6 = kx.a(n5);
            if (eb.c(n5)) {
                boolean bl2 = false;
                while (n2 < string2.length() && kx.a(string2, n2) == n5) {
                    bl2 = true;
                    n2 += n6;
                    if ((n4 += n6) == string.length()) break;
                    n5 = kx.a(string, n4);
                    n6 = kx.a(n5);
                    if (eb.c(n5)) continue;
                }
                n4 = dm.b(string, n4);
                int n7 = n2;
                if ((n2 = dm.c(string2, n2)) == n7 && !bl2) {
                    return -1;
                }
                n4 = dm.c(string, n4);
                continue;
            }
            if (n2 < string2.length() && kx.a(string2, n2) == n5) {
                n4 += n6;
                n2 += n6;
                continue;
            }
            return -1;
        }
        return n2 - n3;
    }

    private static int b(String string, int n2) {
        int n3;
        while (n2 < string.length() && eb.c(n3 = kx.a(string, n2))) {
            n2 += kx.a(n3);
        }
        return n2;
    }

    private static int c(String string, int n2) {
        int n3;
        while (n2 < string.length() && com.ibm.icu.b.b.T(n3 = kx.a(string, n2))) {
            n2 += kx.a(n3);
        }
        return n2;
    }

    private int a(String string, String string2, int n2, int n3, aj[] arraj) {
        int n4 = n2;
        int n5 = 0;
        block6: while (n5 < string.length() && n2 >= 0) {
            int n6;
            char c2;
            if ((c2 = string.charAt(n5++)) == '\'') {
                while (true) {
                    if ((n6 = string.indexOf(39, n5)) == n5) {
                        n2 = dm.a(string2, n2, 39);
                        n5 = n6 + 1;
                        continue block6;
                    }
                    if (n6 <= n5) break;
                    n2 = dm.a(string2, n2, string.substring(n5, n6));
                    n5 = n6 + 1;
                    if (n5 >= string.length() || string.charAt(n5) != '\'') continue block6;
                    n2 = dm.a(string2, n2, 39);
                    ++n5;
                }
                throw new RuntimeException();
            }
            switch (c2) {
                case '\u00a4': {
                    ParsePosition parsePosition;
                    String string3;
                    com.ibm.icu.util.dn dn2;
                    boolean bl2;
                    int n7 = n6 = n5 < string.length() && string.charAt(n5) == '\u00a4' ? 1 : 0;
                    if (n6 != 0) {
                        ++n5;
                    }
                    boolean bl3 = bl2 = n5 < string.length() && string.charAt(n5) == '\u00a4';
                    if (bl2) {
                        ++n5;
                        n6 = 0;
                    }
                    if ((dn2 = this.a(com.ibm.icu.util.dn.x)) == null) {
                        dn2 = this.ao.a(com.ibm.icu.util.dn.x);
                    }
                    if ((string3 = com.ibm.icu.util.aj.a(dn2, string2, n3, parsePosition = new ParsePosition(n2))) != null) {
                        if (arraj != null) {
                            arraj[0] = com.ibm.icu.util.aj.a(string3);
                        } else {
                            aj aj2 = this.B();
                            if (string3.compareTo(aj2.d()) != 0) {
                                n2 = -1;
                                continue block6;
                            }
                        }
                        n2 = parsePosition.getIndex();
                        continue block6;
                    }
                    n2 = -1;
                    continue block6;
                }
                case '%': {
                    c2 = this.ao.k();
                    break;
                }
                case '\u2030': {
                    c2 = this.ao.j();
                    break;
                }
                case '-': {
                    c2 = this.ao.p();
                }
            }
            n2 = dm.a(string2, n2, (int)c2);
            if (!eb.c(c2)) continue;
            n5 = dm.b(string, n5);
        }
        return n2 - n4;
    }

    static final int a(String string, int n2, int n3) {
        if (n2 >= string.length()) {
            return -1;
        }
        if (eb.c(n3)) {
            int n4 = n2;
            if ((n2 = dm.b(string, n2)) == n4) {
                return -1;
            }
            return n2;
        }
        return n2 >= 0 && kx.a(string, n2) == n3 ? n2 + kx.a(n3) : -1;
    }

    static final int a(String string, int n2, String string2) {
        int n3;
        for (int i2 = 0; i2 < string2.length() && n2 >= 0; i2 += kx.a(n3)) {
            n3 = kx.a(string2, i2);
            n2 = dm.a(string, n2, n3);
            if (!eb.c(n3)) continue;
            i2 = dm.b(string2, i2);
        }
        return n2;
    }

    public dp c() {
        try {
            return (dp)this.ao.clone();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void a(dp dp2) {
        this.ao = (dp)dp2.clone();
        this.T();
        this.i(null);
    }

    private void T() {
        dp dp2 = new dp(this.ao.A());
        if (this.ao.q().equals(dp2.q()) && this.ao.r().equals(dp2.r())) {
            this.a(com.ibm.icu.util.aj.a(this.ao.A()));
        } else {
            this.a((aj)null);
        }
    }

    public String d() {
        return this.ab;
    }

    public void a(String string) {
        this.ab = string;
        this.af = null;
    }

    public String e() {
        return this.ad;
    }

    public void b(String string) {
        this.ad = string;
        this.ah = null;
    }

    public String f() {
        return this.ac;
    }

    public void c(String string) {
        this.ac = string;
        this.ag = null;
    }

    public String g() {
        return this.ae;
    }

    public void d(String string) {
        this.ae = string;
        this.ai = null;
    }

    public int h() {
        return this.ak;
    }

    public void c(int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Bad multiplier: " + n2);
        }
        this.ak = n2;
    }

    public BigDecimal i() {
        if (this.aw == null) {
            return null;
        }
        return this.aw.j();
    }

    public void a(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            this.a((a)null);
        } else {
            this.a(new a(bigDecimal));
        }
    }

    public void a(a a2) {
        int n2;
        int n3 = n2 = a2 == null ? 0 : a2.b(com.ibm.icu.c.a.a);
        if (n2 < 0) {
            throw new IllegalArgumentException("Illegal rounding increment");
        }
        if (n2 == 0) {
            this.c((a)null);
        } else {
            this.c(a2);
        }
        this.U();
    }

    public void c(double d2) {
        if (d2 < 0.0) {
            throw new IllegalArgumentException("Illegal rounding increment");
        }
        this.ax = d2;
        this.ay = 0.0;
        if (d2 == 0.0) {
            this.a((a)null);
        } else {
            this.ax = d2;
            if (this.ax < 1.0) {
                double d3 = 1.0 / this.ax;
                this.h(d3);
            }
            this.c(new a(d2));
        }
    }

    private void h(double d2) {
        this.ay = Math.rint(d2);
        if (Math.abs(d2 - this.ay) > 1.0E-9) {
            this.ay = 0.0;
        }
    }

    public int j() {
        return this.az;
    }

    public void d(int n2) {
        if (n2 < 0 || n2 > 7) {
            throw new IllegalArgumentException("Invalid rounding mode: " + n2);
        }
        this.az = n2;
        if (this.i() == null) {
            this.c(Math.pow(10.0, -this.P()));
        }
    }

    public int k() {
        return this.aB;
    }

    public void e(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Illegal format width");
        }
        this.aB = n2;
    }

    public char l() {
        return this.aC;
    }

    public void a(char c2) {
        this.aC = c2;
    }

    public int m() {
        return this.aD;
    }

    public void f(int n2) {
        if (n2 < 0 || n2 > 3) {
            throw new IllegalArgumentException("Illegal pad position");
        }
        this.aD = n2;
    }

    public boolean n() {
        return this.as;
    }

    public void a(boolean bl2) {
        this.as = bl2;
    }

    public byte o() {
        return this.at;
    }

    public void a(byte by2) {
        if (by2 < 1) {
            throw new IllegalArgumentException("Exponent digits must be >= 1");
        }
        this.at = by2;
    }

    public boolean p() {
        return this.au;
    }

    public void b(boolean bl2) {
        this.au = bl2;
    }

    public int q() {
        return this.al;
    }

    public void g(int n2) {
        this.al = (byte)n2;
    }

    public int r() {
        return this.am;
    }

    public void h(int n2) {
        this.am = (byte)n2;
    }

    public com.ibm.icu.c.b s() {
        return this.aA;
    }

    public MathContext t() {
        try {
            return this.aA == null ? null : new MathContext(this.aA.a(), RoundingMode.valueOf(this.aA.d()));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void a(com.ibm.icu.c.b b2) {
        this.aA = b2;
    }

    public void a(MathContext mathContext) {
        this.aA = new com.ibm.icu.c.b(mathContext.getPrecision(), 1, false, mathContext.getRoundingMode().ordinal());
    }

    public boolean u() {
        return this.an;
    }

    public void c(boolean bl2) {
        this.an = bl2;
    }

    public ct v() {
        try {
            return this.aT == null ? null : (ct)this.aT.clone();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void a(ct ct2) {
        this.aT = (ct)ct2.clone();
        this.aS = false;
    }

    public Object clone() {
        try {
            dm dm2 = (dm)super.clone();
            dm2.ao = (dp)this.ao.clone();
            dm2.aa = new du();
            if (this.aT != null) {
                dm2.aT = (ct)this.aT.clone();
            }
            dm2.aN = new ArrayList();
            return dm2;
        }
        catch (Exception exception) {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        dm dm2 = (dm)object;
        return this.aQ == dm2.aQ && (this.aP != 6 || this.a(this.af, dm2.af) && this.a(this.ag, dm2.ag) && this.a(this.ah, dm2.ah) && this.a(this.ai, dm2.ai)) && this.ak == dm2.ak && this.al == dm2.al && this.am == dm2.am && this.an == dm2.an && this.as == dm2.as && (!this.as || this.at == dm2.at) && this.ap == dm2.ap && (!this.ap || this.aq == dm2.aq && this.ar == dm2.ar) && this.ao.equals(dm2.ao) && jd.b(this.aT, dm2.aT);
    }

    private boolean a(String string, String string2) {
        if (string == null || string2 == null) {
            return string == null && string2 == null;
        }
        if (string.equals(string2)) {
            return true;
        }
        return this.h(string).equals(this.h(string2));
    }

    private String h(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n2 = 0;
        while (n2 < string.length()) {
            char c2;
            if ((c2 = string.charAt(n2++)) == '\'') continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        return super.hashCode() * 37 + this.ab.hashCode();
    }

    public String w() {
        if (this.aP == 6) {
            return this.aO;
        }
        return this.j(false);
    }

    public String x() {
        if (this.aP == 6) {
            return this.aO;
        }
        return this.j(true);
    }

    private void i(String string) {
        this.aj = null;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.af != null) {
            this.a(this.af, string, stringBuffer, false);
            this.ab = stringBuffer.toString();
        }
        if (this.ag != null) {
            this.a(this.ag, string, stringBuffer, false);
            this.ac = stringBuffer.toString();
        }
        if (this.ah != null) {
            this.a(this.ah, string, stringBuffer, false);
            this.ad = stringBuffer.toString();
        }
        if (this.ai != null) {
            this.a(this.ai, string, stringBuffer, false);
            this.ae = stringBuffer.toString();
        }
    }

    /*
     * Exception decompiling
     */
    private void a(String var1_1, String var2_2, StringBuffer var3_3, boolean var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private int a(StringBuffer stringBuffer, boolean bl2, boolean bl3, boolean bl4) {
        if (this.aj != null) {
            String string = null;
            string = bl3 ? (bl2 ? this.ah : this.af) : (bl2 ? this.ai : this.ag);
            StringBuffer stringBuffer2 = new StringBuffer();
            this.a(string, null, stringBuffer2, true);
            stringBuffer.append(stringBuffer2);
            return stringBuffer2.length();
        }
        String string = null;
        if (bl3) {
            string = bl2 ? this.ad : this.ab;
        } else {
            String string2 = string = bl2 ? this.ae : this.ac;
        }
        if (bl4) {
            int n2 = string.indexOf(this.ao.q());
            if (-1 == n2 && -1 == (n2 = string.indexOf(this.ao.k()))) {
                n2 = 0;
            }
            this.c(string, stringBuffer.length() + n2, stringBuffer.length() + string.length());
        }
        stringBuffer.append(string);
        return string.length();
    }

    private void c(String string, int n2, int n3) {
        if (string.indexOf(this.ao.q()) > -1) {
            this.a(gr.l, n2, n3);
        } else if (string.indexOf(this.ao.p()) > -1) {
            this.a(gr.b, n2, n3);
        } else if (string.indexOf(this.ao.k()) > -1) {
            this.a(gr.j, n2, n3);
        } else if (string.indexOf(this.ao.j()) > -1) {
            this.a(gr.k, n2, n3);
        }
    }

    private void a(gr gr2, int n2, int n3) {
        FieldPosition fieldPosition = new FieldPosition(gr2);
        fieldPosition.setBeginIndex(n2);
        fieldPosition.setEndIndex(n3);
        this.aN.add(fieldPosition);
    }

    public AttributedCharacterIterator formatToCharacterIterator(Object object) {
        return this.a(object, A);
    }

    AttributedCharacterIterator a(Object object, do do_) {
        if (!(object instanceof Number)) {
            throw new IllegalArgumentException();
        }
        Number number = (Number)object;
        StringBuffer stringBuffer = new StringBuffer();
        do_.b(stringBuffer);
        this.aN.clear();
        if (object instanceof BigInteger) {
            this.a((BigInteger)number, stringBuffer, new FieldPosition(0), true);
        } else if (object instanceof BigDecimal) {
            this.a((BigDecimal)number, stringBuffer, new FieldPosition(0), true);
        } else if (object instanceof Double) {
            this.a(number.doubleValue(), stringBuffer, new FieldPosition(0), true);
        } else if (object instanceof Integer || object instanceof Long) {
            this.a(number.longValue(), stringBuffer, new FieldPosition(0), true);
        } else {
            throw new IllegalArgumentException();
        }
        do_.a(stringBuffer);
        AttributedString attributedString = new AttributedString(stringBuffer.toString());
        for (int i2 = 0; i2 < this.aN.size(); ++i2) {
            FieldPosition fieldPosition = (FieldPosition)this.aN.get(i2);
            Format.Field field = fieldPosition.getFieldAttribute();
            attributedString.addAttribute(field, field, fieldPosition.getBeginIndex(), fieldPosition.getEndIndex());
        }
        return attributedString.getIterator();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(StringBuffer stringBuffer, boolean bl2, boolean bl3, boolean bl4) {
        String string = null;
        if (bl3) {
            string = bl2 ? this.ah : this.af;
        } else {
            String string2 = string = bl2 ? this.ai : this.ag;
        }
        if (string == null) {
            String string3 = null;
            string3 = bl3 ? (bl2 ? this.ad : this.ab) : (bl2 ? this.ae : this.ac);
            stringBuffer.append('\'');
            int n2 = 0;
            while (true) {
                if (n2 >= string3.length()) {
                    stringBuffer.append('\'');
                    return;
                }
                char c2 = string3.charAt(n2);
                if (c2 == '\'') {
                    stringBuffer.append(c2);
                }
                stringBuffer.append(c2);
                ++n2;
            }
        }
        if (!bl4) {
            stringBuffer.append(string);
            return;
        }
        int n3 = 0;
        while (n3 < string.length()) {
            block17: {
                char c3 = string.charAt(n3);
                switch (c3) {
                    case '\'': {
                        int n4 = string.indexOf(39, n3 + 1);
                        if (n4 < 0) {
                            throw new IllegalArgumentException("Malformed affix pattern: " + string);
                        }
                        stringBuffer.append(string.substring(n3, n4 + 1));
                        n3 = n4;
                        break block17;
                    }
                    case '\u2030': {
                        c3 = this.ao.j();
                        break;
                    }
                    case '%': {
                        c3 = this.ao.k();
                        break;
                    }
                    case '-': {
                        c3 = this.ao.p();
                    }
                }
                if (c3 == this.ao.i() || c3 == this.ao.h()) {
                    stringBuffer.append('\'');
                    stringBuffer.append(c3);
                    stringBuffer.append('\'');
                } else {
                    stringBuffer.append(c3);
                }
            }
            ++n3;
        }
    }

    private String j(boolean bl2) {
        int n2;
        String string;
        int n3;
        StringBuffer stringBuffer = new StringBuffer();
        char c2 = bl2 ? (char)this.ao.d() : (char)'0';
        char c3 = bl2 ? (char)this.ao.l() : (char)'#';
        char c4 = '\u0000';
        boolean bl3 = this.A();
        if (bl3) {
            c4 = bl2 ? (char)this.ao.g() : (char)'@';
        }
        char c5 = bl2 ? (char)this.ao.h() : (char)',';
        int n4 = 0;
        String string2 = null;
        int n5 = n3 = this.aB > 0 ? this.aD : -1;
        String string3 = this.aB > 0 ? new StringBuffer(2).append(bl2 ? this.ao.y() : (char)'*').append(this.aC).toString() : (string = null);
        if (this.aw != null) {
            n2 = this.aw.g();
            string2 = this.aw.b(n2).toString();
            n4 = string2.length() - n2;
        }
        for (int i2 = 0; i2 < 2; ++i2) {
            int n6;
            int n7;
            if (n3 == 0) {
                stringBuffer.append(string);
            }
            this.b(stringBuffer, i2 != 0, true, bl2);
            if (n3 == 1) {
                stringBuffer.append(string);
            }
            int n8 = stringBuffer.length();
            int n9 = n7 = this.O() ? Math.max(0, this.al) : 0;
            if (n7 > 0 && this.am > 0 && this.am != this.al) {
                n7 += this.am;
            }
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            if (bl3) {
                n11 = this.y();
                n10 = n12 = this.z();
            } else {
                n11 = this.b();
                n10 = this.a();
            }
            if (this.as) {
                if (n10 > 8) {
                    n10 = 1;
                }
            } else {
                n10 = bl3 ? Math.max(n10, n7 + 1) : Math.max(Math.max(n7, this.b()), n4) + 1;
            }
            for (n2 = n10; n2 > 0; --n2) {
                if (!this.as && n2 < n10 && this.o(n2)) {
                    stringBuffer.append(c5);
                }
                if (bl3) {
                    stringBuffer.append(n12 >= n2 && n2 > n12 - n11 ? c4 : c3);
                    continue;
                }
                if (string2 != null && (n6 = n4 - n2) >= 0 && n6 < string2.length()) {
                    stringBuffer.append((char)(string2.charAt(n6) - 48 + c2));
                    continue;
                }
                stringBuffer.append(n2 <= n11 ? c2 : c3);
            }
            if (!bl3) {
                if (this.P() > 0 || this.an) {
                    stringBuffer.append(bl2 ? this.ao.i() : (char)'.');
                }
                n6 = n4;
                for (n2 = 0; n2 < this.P(); ++n2) {
                    if (string2 != null && n6 < string2.length()) {
                        stringBuffer.append(n6 < 0 ? c2 : (char)(string2.charAt(n6) - 48 + c2));
                        ++n6;
                        continue;
                    }
                    stringBuffer.append(n2 < this.Q() ? c2 : c3);
                }
            }
            if (this.as) {
                if (bl2) {
                    stringBuffer.append(this.ao.w());
                } else {
                    stringBuffer.append('E');
                }
                if (this.au) {
                    stringBuffer.append(bl2 ? this.ao.x() : (char)'+');
                }
                for (n2 = 0; n2 < this.at; ++n2) {
                    stringBuffer.append(c2);
                }
            }
            if (string != null && !this.as) {
                n6 = this.aB - stringBuffer.length() + n8 - (i2 == 0 ? this.ab.length() + this.ac.length() : this.ad.length() + this.ae.length());
                while (n6 > 0) {
                    stringBuffer.insert(n8, c3);
                    if (--n6 <= 1 || !this.o(++n10)) continue;
                    stringBuffer.insert(n8, c5);
                    --n6;
                }
            }
            if (n3 == 2) {
                stringBuffer.append(string);
            }
            this.b(stringBuffer, i2 != 0, false, bl2);
            if (n3 == 3) {
                stringBuffer.append(string);
            }
            if (i2 != 0) continue;
            if (this.ae.equals(this.ac) && this.ad.equals('-' + this.ab)) break;
            stringBuffer.append(bl2 ? this.ao.m() : (char)';');
        }
        return stringBuffer.toString();
    }

    public void e(String string) {
        this.a(string, false);
    }

    public void f(String string) {
        this.a(string, true);
    }

    private void a(String string, boolean bl2) {
        this.b(string, bl2);
        this.j(null);
    }

    private void j(String string) {
        this.i(string);
        if (this.aB > 0) {
            this.aB += this.ab.length() + this.ac.length();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(String string, boolean bl2) {
        char c2 = '0';
        char c3 = '@';
        char c4 = ',';
        char c5 = '.';
        char c6 = '%';
        char c7 = '\u2030';
        char c8 = '#';
        char c9 = ';';
        String string2 = String.valueOf('E');
        char c10 = '+';
        char c11 = '*';
        char c12 = '-';
        if (bl2) {
            c2 = this.ao.d();
            c3 = this.ao.g();
            c4 = this.ao.h();
            c5 = this.ao.i();
            c6 = this.ao.k();
            c7 = this.ao.j();
            c8 = this.ao.l();
            c9 = this.ao.m();
            string2 = this.ao.w();
            c10 = this.ao.x();
            c11 = this.ao.y();
            c12 = this.ao.p();
        }
        char c13 = (char)(c2 + 9);
        boolean bl3 = false;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            char c14;
            char c15;
            int n4;
            StringBuilder stringBuilder;
            int n5;
            boolean bl4;
            int n6;
            long l2;
            char c16;
            char c17;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            char c18;
            int n13;
            char c19;
            StringBuilder stringBuilder2;
            StringBuilder stringBuilder3;
            int n14;
            int n15;
            int n16;
            int n17;
            if (n3 < 2 && n2 < string.length()) {
                n17 = 1;
                n16 = 0;
                n15 = 0;
                n14 = 0;
                stringBuilder3 = new StringBuilder();
                stringBuilder2 = new StringBuilder();
                c19 = '\uffffffff';
                n13 = 1;
                c18 = '\u0000';
                n12 = 0;
                n11 = 0;
                n10 = 0;
                n9 = -1;
                n8 = -1;
                n7 = -1;
                c17 = '\u0000';
                c16 = '\uffffffff';
                l2 = 0L;
                n6 = -1;
                bl4 = false;
                n5 = 0;
                stringBuilder = stringBuilder3;
                n4 = n2;
            } else {
                if (string.length() == 0) {
                    this.ag = "";
                    this.af = "";
                    this.b(0);
                    this.a(309);
                    this.l(0);
                    this.k(340);
                }
                if (!bl3 || this.ah.equals(this.af) && this.ai.equals(this.ag)) {
                    this.ai = this.ag;
                    this.ah = '-' + this.af;
                }
                this.a((com.ibm.icu.util.dn)null, (com.ibm.icu.util.dn)null);
                this.aO = string;
                if (this.aQ > 0) {
                    aj aj2 = this.R();
                    if (aj2 != null) {
                        this.c(aj2.i());
                        n17 = aj2.h();
                        this.l(n17);
                        this.k(n17);
                    }
                    if (this.aQ == 3 && this.aT == null) {
                        this.aT = new ct(this.ao.A());
                    }
                }
                return;
            }
            block6: while (n2 < string.length()) {
                c15 = string.charAt(n2);
                switch (n17) {
                    case 0: {
                        if (c15 == c8) {
                            if (n12 > 0 || n10 > 0) {
                                ++n11;
                            } else {
                                ++c18;
                            }
                            if (n9 < 0 || c19 >= '\u0000') break;
                            n9 = (byte)(n9 + 1);
                            break;
                        }
                        if (c15 >= c2 && c15 <= c13 || c15 == c3) {
                            if (n11 > 0) {
                                this.b("Unexpected '" + c15 + '\'', string);
                            }
                            if (c15 == c3) {
                                ++n10;
                            } else {
                                ++n12;
                                if (c15 != c2) {
                                    c14 = c18 + n12 + n11;
                                    if (c16 >= '\u0000') {
                                        while (c16 < c14) {
                                            l2 *= 10L;
                                            ++c16;
                                        }
                                    } else {
                                        c16 = c14;
                                    }
                                    l2 += (long)(c15 - c2);
                                }
                            }
                            if (n9 < 0 || c19 >= '\u0000') break;
                            n9 = (byte)(n9 + 1);
                            break;
                        }
                        if (c15 == c4) {
                            if (c15 == '\'' && n2 + 1 < string.length() && (c14 = (char)string.charAt(n2 + 1)) != c8 && (c14 < c2 || c14 > c13)) {
                                if (c14 == '\'') {
                                    ++n2;
                                } else {
                                    if (n9 < 0) {
                                        n17 = 3;
                                        break;
                                    }
                                    n17 = 2;
                                    stringBuilder = stringBuilder2;
                                    n15 = n2--;
                                    break;
                                }
                            }
                            if (c19 >= '\u0000') {
                                this.b("Grouping separator after decimal", string);
                            }
                            n8 = n9;
                            n9 = 0;
                            break;
                        }
                        if (c15 == c5) {
                            if (c19 >= '\u0000') {
                                this.b("Multiple decimal separators", string);
                            }
                            c19 = c18 + n12 + n11;
                            break;
                        }
                        if (string.regionMatches(n2, string2, 0, string2.length())) {
                            if (n6 >= 0) {
                                this.b("Multiple exponential symbols", string);
                            }
                            if (n9 >= 0) {
                                this.b("Grouping separator in exponential", string);
                            }
                            if ((n2 += string2.length()) < string.length() && string.charAt(n2) == c10) {
                                bl4 = true;
                                ++n2;
                            }
                            n6 = 0;
                            while (n2 < string.length() && string.charAt(n2) == c2) {
                                n6 = (byte)(n6 + 1);
                                ++n2;
                            }
                            if (c18 + n12 < 1 && n10 + n11 < 1 || n10 > 0 && c18 > '\u0000' || n6 < 1) {
                                this.b("Malformed exponential", string);
                            }
                        }
                        n17 = 2;
                        stringBuilder = stringBuilder2;
                        n15 = n2--;
                        break;
                    }
                    case 1: 
                    case 2: {
                        if (c15 == c8 || c15 == c4 || c15 == c5 || c15 >= c2 && c15 <= c13 || c15 == c3) {
                            if (n17 == 1) {
                                n17 = 0;
                                n16 = n2--;
                                break;
                            }
                            if (c15 == '\'') {
                                if (n2 + 1 < string.length() && string.charAt(n2 + 1) == '\'') {
                                    ++n2;
                                    stringBuilder.append(c15);
                                    break;
                                }
                                n17 += 2;
                                break;
                            }
                            this.b("Unquoted special character '" + c15 + '\'', string);
                        } else if (c15 == '\u00a4') {
                            char c20 = c14 = n2 + 1 < string.length() && string.charAt(n2 + 1) == '\u00a4' ? (char)'\u0001' : '\u0000';
                            if (c14 != '\u0000') {
                                stringBuilder.append(c15);
                                if (++n2 + 1 < string.length() && string.charAt(n2 + 1) == '\u00a4') {
                                    ++n2;
                                    stringBuilder.append(c15);
                                    n5 = 3;
                                } else {
                                    n5 = 2;
                                }
                            } else {
                                n5 = 1;
                            }
                        } else if (c15 == '\'') {
                            if (n2 + 1 < string.length() && string.charAt(n2 + 1) == '\'') {
                                ++n2;
                                stringBuilder.append(c15);
                            } else {
                                n17 += 2;
                            }
                        } else {
                            if (c15 == c9) {
                                if (n17 == 1 || n3 == 1) {
                                    this.b("Unquoted special character '" + c15 + '\'', string);
                                }
                                n14 = n2++;
                                break block6;
                            }
                            if (c15 == c6 || c15 == c7) {
                                if (n13 != 1) {
                                    this.b("Too many percent/permille characters", string);
                                }
                                n13 = c15 == c6 ? 100 : 1000;
                                c15 = c15 == c6 ? (char)'%' : '\u2030';
                            } else if (c15 == c12) {
                                c15 = '-';
                            } else if (c15 == c11) {
                                if (n7 >= 0) {
                                    this.b("Multiple pad specifiers", string);
                                }
                                if (n2 + 1 == string.length()) {
                                    this.b("Invalid pad specifier", string);
                                }
                                n7 = n2++;
                                c17 = string.charAt(n2);
                                break;
                            }
                        }
                        stringBuilder.append(c15);
                        break;
                    }
                    case 3: 
                    case 4: {
                        if (c15 == '\'') {
                            if (n2 + 1 < string.length() && string.charAt(n2 + 1) == '\'') {
                                ++n2;
                                stringBuilder.append(c15);
                            } else {
                                n17 -= 2;
                            }
                        }
                        stringBuilder.append(c15);
                    }
                }
                ++n2;
            }
            if (n17 == 3 || n17 == 4) {
                this.b("Unterminated quote", string);
            }
            if (n15 == 0) {
                n15 = string.length();
            }
            if (n14 == 0) {
                n14 = string.length();
            }
            if (n12 == 0 && n10 == 0 && c18 > '\u0000' && c19 >= '\u0000') {
                c15 = c19;
                if (c15 == '\u0000') {
                    ++c15;
                }
                n11 = c18 - c15;
                c18 = c15 - 1;
                n12 = 1;
            }
            if (c19 < '\u0000' && n11 > 0 && n10 == 0 || c19 >= '\u0000' && (n10 > 0 || c19 < c18 || c19 > c18 + n12) || n9 == 0 || n8 == 0 || n10 > 0 && n12 > 0 || n17 > 2) {
                this.b("Malformed pattern", string);
            }
            if (n7 >= 0) {
                if (n7 == n4) {
                    n7 = 0;
                } else if (n7 + 2 == n16) {
                    n7 = 1;
                } else if (n7 == n15) {
                    n7 = 2;
                } else if (n7 + 2 == n14) {
                    n7 = 3;
                } else {
                    this.b("Illegal pad position", string);
                }
            }
            if (n3 == 0) {
                int n18;
                this.af = this.ah = stringBuilder3.toString();
                this.ag = this.ai = stringBuilder2.toString();
                boolean bl5 = this.as = n6 >= 0;
                if (this.as) {
                    this.at = (byte)n6;
                    this.au = bl4;
                }
                c15 = c18 + n12 + n11;
                c14 = c19 >= '\u0000' ? c19 : c15;
                boolean bl6 = n10 > 0;
                this.d(bl6);
                if (bl6) {
                    this.i(n10);
                    this.j(n10 + n11);
                } else {
                    n18 = c14 - c18;
                    this.b(n18);
                    this.a(this.as ? c18 + n18 : 309);
                    this.k(c19 >= '\u0000' ? c15 - c19 : 0);
                    this.l(c19 >= '\u0000' ? c18 + n12 - c19 : 0);
                }
                this.h(n9 > 0);
                this.al = (byte)(n9 > 0 ? n9 : 0);
                this.am = n8 > 0 && n8 != n9 ? n8 : 0;
                this.ak = n13;
                this.c(c19 == '\u0000' || c19 == c15);
                if (n7 >= 0) {
                    this.aD = n7;
                    this.aB = n15 - n16;
                    this.aC = c17;
                } else {
                    this.aB = 0;
                }
                if (l2 != 0L) {
                    n18 = c16 - c14;
                    this.aw = com.ibm.icu.c.a.a(l2, n18 > 0 ? n18 : 0);
                    if (n18 < 0) {
                        this.aw = this.aw.b(-n18);
                    }
                    this.U();
                    this.az = 6;
                } else {
                    this.a((a)null);
                }
                this.aQ = n5;
            } else {
                this.ah = stringBuilder3.toString();
                this.ai = stringBuilder2.toString();
                bl3 = true;
            }
            ++n3;
        }
    }

    private void U() {
        if (this.aw == null) {
            this.ax = 0.0;
            this.ay = 0.0;
        } else {
            this.ax = this.aw.doubleValue();
            this.h(1.0 / this.ax);
        }
    }

    private void b(String string, String string2) {
        throw new IllegalArgumentException(string + " in pattern \"" + string2 + '\"');
    }

    public void a(int n2) {
        super.a(Math.min(n2, 309));
    }

    public void b(int n2) {
        super.b(Math.min(n2, 309));
    }

    public int y() {
        return this.aq;
    }

    public int z() {
        return this.ar;
    }

    public void i(int n2) {
        if (n2 < 1) {
            n2 = 1;
        }
        int n3 = Math.max(this.ar, n2);
        this.aq = n2;
        this.ar = n3;
    }

    public void j(int n2) {
        int n3;
        if (n2 < 1) {
            n2 = 1;
        }
        this.aq = n3 = Math.min(this.aq, n2);
        this.ar = n2;
    }

    public boolean A() {
        return this.ap;
    }

    public void d(boolean bl2) {
        this.ap = bl2;
    }

    public void a(aj aj2) {
        super.a(aj2);
        if (aj2 != null) {
            boolean[] arrbl = new boolean[1];
            String string = aj2.a(this.ao.A(), 0, arrbl);
            this.ao.a(aj2);
            this.ao.c(string);
        }
        if (this.aQ > 0) {
            if (aj2 != null) {
                this.c(aj2.i());
                int n2 = aj2.h();
                this.l(n2);
                this.k(n2);
            }
            if (this.aQ != 3) {
                this.i(null);
            }
        }
    }

    protected aj B() {
        aj aj2 = this.R();
        if (aj2 == null) {
            aj2 = com.ibm.icu.util.aj.a(this.ao.r());
        }
        return aj2;
    }

    public void k(int n2) {
        super.k(Math.min(n2, 340));
    }

    public void l(int n2) {
        super.l(Math.min(n2, 340));
    }

    public void e(boolean bl2) {
        this.aE = bl2;
    }

    public boolean C() {
        return this.aE;
    }

    public void m(int n2) {
        if (n2 > 0) {
            this.Z = n2;
        }
    }

    public int D() {
        return this.Z;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        this.aN.clear();
        objectOutputStream.defaultWriteObject();
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.a() > 309) {
            this.a(309);
        }
        if (this.P() > 340) {
            this.k(340);
        }
        if (this.aF < 2) {
            this.au = false;
            this.c((a)null);
            this.U();
            this.az = 6;
            this.aB = 0;
            this.aC = (char)32;
            this.aD = 0;
            if (this.aF < 1) {
                this.as = false;
            }
        }
        if (this.aF < 3) {
            this.T();
        }
        this.aF = 3;
        this.aa = new du();
        if (this.av != null) {
            this.c(new a(this.av));
            this.U();
        }
    }

    private void c(a a2) {
        this.aw = a2;
        this.av = a2 == null ? null : a2.j();
    }
}

