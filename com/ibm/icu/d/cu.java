/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.ek;
import com.ibm.icu.d.dd;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.iz;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.n;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;

public abstract class cu
extends kv {
    protected n d;
    protected gq e;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 8;
    public static final int o = 8;
    public static final int p = 9;
    public static final int q = 10;
    public static final int r = 11;
    public static final int s = 12;
    public static final int t = 13;
    public static final int u = 14;
    public static final int v = 15;
    public static final int w = 16;
    public static final int x = 17;
    public static final int y = 18;
    public static final int z = 19;
    public static final int A = 20;
    public static final int B = 21;
    public static final int C = 22;
    public static final int D = 23;
    public static final int E = 24;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 28;
    public static final int J = 29;
    public static final int K = 30;
    public static final int L = 31;
    public static final int M = 32;
    public static final int N = 33;
    public static final int O = 34;
    private static final long a = 7218322306649953788L;
    public static final int P = -1;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 2;
    public static final int V = 128;
    public static final int W = 128;
    public static final int X = 129;
    public static final int Y = 130;
    public static final int Z = 131;
    public static final int aa = 130;
    public static final String ab = "y";
    public static final String ac = "QQQQ";
    public static final String ad = "QQQ";
    public static final String ae = "yQQQQ";
    public static final String af = "yQQQ";
    public static final String ag = "MMMM";
    public static final String ah = "MMM";
    public static final String ai = "M";
    public static final String aj = "yMMMM";
    public static final String ak = "yMMM";
    public static final String al = "yM";
    public static final String am = "d";
    public static final String an = "yMMMMd";
    public static final String ao = "yMMMd";
    public static final String ap = "yMd";
    public static final String aq = "EEEE";
    public static final String ar = "E";
    public static final String as = "yMMMMEEEEd";
    public static final String at = "yMMMEd";
    public static final String au = "yMEd";
    public static final String av = "MMMMd";
    public static final String aw = "MMMd";
    public static final String ax = "Md";
    public static final String ay = "MMMMEEEEd";
    public static final String az = "MMMEd";
    public static final String aA = "MEd";
    public static final String aB = "j";
    public static final String aC = "H";
    public static final String aD = "m";
    public static final String aE = "jm";
    public static final String aF = "Hm";
    public static final String aG = "s";
    public static final String aH = "jms";
    public static final String aI = "Hms";
    public static final String aJ = "ms";
    public static final String aK = "VVVV";
    public static final String aL = "vvvv";
    public static final String aM = "v";
    public static final String aN = "zzzz";
    public static final String aO = "z";
    public static final String aP = "ZZZZ";
    public static final String aQ = "LLLL";
    public static final String aR = "LLL";
    public static final String aS = "jmv";
    public static final String aT = "jmz";
    public static final String aU = "jv";
    public static final String aV = "jz";

    public final StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (object instanceof n) {
            return this.a((n)object, stringBuffer, fieldPosition);
        }
        if (object instanceof Date) {
            return this.a((Date)object, stringBuffer, fieldPosition);
        }
        if (object instanceof Number) {
            return this.a(new Date(((Number)object).longValue()), stringBuffer, fieldPosition);
        }
        throw new IllegalArgumentException("Cannot format given Object (" + object.getClass().getName() + ") as a Date");
    }

    public abstract StringBuffer a(n var1, StringBuffer var2, FieldPosition var3);

    public StringBuffer a(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        this.d.a(date);
        return this.a(this.d, stringBuffer, fieldPosition);
    }

    public final String a(Date date) {
        return this.a(date, new StringBuffer(64), new FieldPosition(0)).toString();
    }

    public Date a(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = this.a(string, parsePosition);
        if (parsePosition.getIndex() == 0) {
            throw new ParseException("Unparseable date: \"" + string + "\"", parsePosition.getErrorIndex());
        }
        return date;
    }

    public abstract void a(String var1, n var2, ParsePosition var3);

    public Date a(String string, ParsePosition parsePosition) {
        Date date = null;
        int n2 = parsePosition.getIndex();
        dj dj2 = this.d.k();
        this.d.i();
        this.a(string, this.d, parsePosition);
        if (parsePosition.getIndex() != n2) {
            try {
                date = this.d.g();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                parsePosition.setIndex(n2);
                parsePosition.setErrorIndex(n2);
            }
        }
        this.d.b(dj2);
        return date;
    }

    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.a(string, parsePosition);
    }

    public static final cu a() {
        return cu.b(-1, 2, dn.a(dr.b));
    }

    public static final cu a(int n2) {
        return cu.b(-1, n2, dn.a(dr.b));
    }

    public static final cu a(int n2, Locale locale) {
        return cu.b(-1, n2, dn.a(locale));
    }

    public static final cu a(int n2, dn dn2) {
        return cu.b(-1, n2, dn2);
    }

    public static final cu b() {
        return cu.b(2, -1, dn.a(dr.b));
    }

    public static final cu b(int n2) {
        return cu.b(n2, -1, dn.a(dr.b));
    }

    public static final cu b(int n2, Locale locale) {
        return cu.b(n2, -1, dn.a(locale));
    }

    public static final cu b(int n2, dn dn2) {
        return cu.b(n2, -1, dn2);
    }

    public static final cu c() {
        return cu.b(2, 2, dn.a(dr.b));
    }

    public static final cu a(int n2, int n3) {
        return cu.b(n2, n3, dn.a(dr.b));
    }

    public static final cu a(int n2, int n3, Locale locale) {
        return cu.b(n2, n3, dn.a(locale));
    }

    public static final cu a(int n2, int n3, dn dn2) {
        return cu.b(n2, n3, dn2);
    }

    public static final cu d() {
        return cu.a(3, 3);
    }

    public static Locale[] e() {
        return bc.f();
    }

    public static dn[] f() {
        return bc.e();
    }

    public void a(n n2) {
        this.d = n2;
    }

    public n g() {
        return this.d;
    }

    public void a(gq gq2) {
        this.e = gq2;
        this.e.f(true);
    }

    public gq h() {
        return this.e;
    }

    public void a(dj dj2) {
        this.d.b(dj2);
    }

    public dj i() {
        return this.d.k();
    }

    public void a(boolean bl2) {
        this.d.a(bl2);
    }

    public boolean j() {
        return this.d.l();
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cu cu2 = (cu)object;
        return this.d.a(cu2.d) && this.e.equals(cu2.e);
    }

    public Object clone() {
        cu cu2 = (cu)super.clone();
        cu2.d = (n)this.d.clone();
        cu2.e = (gq)this.e.clone();
        return cu2;
    }

    private static cu b(int n2, int n3, dn dn2) {
        if (n3 != -1 && (n3 & 0x80) > 0 || n2 != -1 && (n2 & 0x80) > 0) {
            ek ek2 = new ek(n3, n2, dn2);
            return ek2;
        }
        if (n3 < -1 || n3 > 3) {
            throw new IllegalArgumentException("Illegal time style " + n3);
        }
        if (n2 < -1 || n2 > 3) {
            throw new IllegalArgumentException("Illegal date style " + n2);
        }
        try {
            n n4 = com.ibm.icu.util.n.a(dn2);
            cu cu2 = n4.a(n2, n3, dn2);
            cu2.a(n4.a(dn.x), n4.a(dn.w));
            return cu2;
        }
        catch (MissingResourceException missingResourceException) {
            return new iz("M/d/yy h:mm a");
        }
    }

    protected cu() {
    }

    public static final cu a(n n2, int n3, Locale locale) {
        return cu.a(n2, n3, -1, dn.a(locale));
    }

    public static final cu a(n n2, int n3, dn dn2) {
        return cu.a(n2, n3, -1, dn2);
    }

    public static final cu b(n n2, int n3, Locale locale) {
        return cu.a(n2, -1, n3, dn.a(locale));
    }

    public static final cu b(n n2, int n3, dn dn2) {
        return cu.a(n2, -1, n3, dn2);
    }

    public static final cu a(n n2, int n3, int n4, Locale locale) {
        return n2.a(n3, n4, dn.a(locale));
    }

    public static final cu a(n n2, int n3, int n4, dn dn2) {
        return n2.a(n3, n4, dn2);
    }

    public static final cu a(n n2, Locale locale) {
        return cu.a(n2, 3, 3, dn.a(locale));
    }

    public static final cu a(n n2, dn dn2) {
        return cu.a(n2, 3, 3, dn2);
    }

    public static final cu b(n n2) {
        return cu.a(n2, dn.a(dr.b));
    }

    public static final cu a(n n2, int n3) {
        return cu.a(n2, n3, dn.a(dr.b));
    }

    public static final cu b(n n2, int n3) {
        return cu.b(n2, n3, dn.a(dr.b));
    }

    public static final cu a(n n2, int n3, int n4) {
        return cu.a(n2, n3, n4, dn.a(dr.b));
    }

    public static final cu b(String string) {
        return cu.a(string, dn.a(dr.b));
    }

    public static final cu a(String string, Locale locale) {
        return cu.a(string, dn.a(locale));
    }

    public static final cu a(String string, dn dn2) {
        dd dd2 = dd.a(dn2);
        String string2 = dd2.b(string);
        return new iz(string2, dn2);
    }

    public static final cu a(n n2, String string, Locale locale) {
        return cu.a(n2, string, dn.a(locale));
    }

    public static final cu a(n n2, String string, dn dn2) {
        dd dd2 = dd.a(dn2);
        String string2 = dd2.b(string);
        iz iz2 = new iz(string2, dn2);
        iz2.a(n2);
        return iz2;
    }
}

