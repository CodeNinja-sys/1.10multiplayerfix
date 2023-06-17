/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ab;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.a.w;
import com.ibm.icu.a.y;
import com.ibm.icu.d.gz;
import com.ibm.icu.util.aj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.du;
import com.ibm.icu.util.dv;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ChoiceFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;

public class dp
implements Serializable,
Cloneable {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private String[] d;
    private String[] e;
    private char f;
    private char[] g;
    private char h;
    private char i;
    private char j;
    private char k;
    private char l;
    private char m;
    private char n;
    private String o;
    private String p;
    private char q;
    private String r;
    private String s;
    private char t;
    private char u;
    private char v;
    private String w;
    private char x;
    private char y;
    private Locale z;
    private dn A;
    private static final long B = 5772796243397350300L;
    private static final int C = 6;
    private int D = 6;
    private static final com.ibm.icu.a.aj E = new ew();
    private String F = null;
    private dn G;
    private dn H;
    private transient aj I;

    public dp() {
        this.b(dn.a(dr.b));
    }

    public dp(Locale locale) {
        this.b(dn.a(locale));
    }

    public dp(dn dn2) {
        this.b(dn2);
    }

    public static dp a() {
        return new dp();
    }

    public static dp a(Locale locale) {
        return new dp(locale);
    }

    public static dp a(dn dn2) {
        return new dp(dn2);
    }

    public static Locale[] b() {
        return bc.f();
    }

    public static dn[] c() {
        return bc.e();
    }

    public char d() {
        if (this.g != null) {
            return this.g[0];
        }
        return this.f;
    }

    public char[] e() {
        if (this.g != null) {
            return (char[])this.g.clone();
        }
        char[] arrc = new char[10];
        for (int i2 = 0; i2 < 10; ++i2) {
            arrc[i2] = (char)(this.f + i2);
        }
        return arrc;
    }

    char[] f() {
        if (this.g != null) {
            return this.g;
        }
        char[] arrc = new char[10];
        for (int i2 = 0; i2 < 10; ++i2) {
            arrc[i2] = (char)(this.f + i2);
        }
        return arrc;
    }

    public void a(char c2) {
        if (this.g != null) {
            this.g[0] = c2;
            if (Character.digit(c2, 10) == 0) {
                for (int i2 = 1; i2 < 10; ++i2) {
                    this.g[i2] = (char)(c2 + i2);
                }
            }
        } else {
            this.f = c2;
        }
    }

    public char g() {
        return this.m;
    }

    public void b(char c2) {
        this.m = c2;
    }

    public char h() {
        return this.h;
    }

    public void c(char c2) {
        this.h = c2;
    }

    public char i() {
        return this.i;
    }

    public void d(char c2) {
        this.i = c2;
    }

    public char j() {
        return this.j;
    }

    public void e(char c2) {
        this.j = c2;
    }

    public char k() {
        return this.k;
    }

    public void f(char c2) {
        this.k = c2;
    }

    public char l() {
        return this.l;
    }

    public void g(char c2) {
        this.l = c2;
    }

    public char m() {
        return this.n;
    }

    public void h(char c2) {
        this.n = c2;
    }

    public String n() {
        return this.o;
    }

    public void a(String string) {
        this.o = string;
    }

    public String o() {
        return this.p;
    }

    public void b(String string) {
        this.p = string;
    }

    public char p() {
        return this.q;
    }

    public void i(char c2) {
        this.q = c2;
    }

    public String q() {
        return this.r;
    }

    public void c(String string) {
        this.r = string;
    }

    public String r() {
        return this.s;
    }

    public void d(String string) {
        this.s = string;
    }

    public aj s() {
        return this.I;
    }

    public void a(aj aj2) {
        if (aj2 == null) {
            throw new NullPointerException();
        }
        this.I = aj2;
        this.s = aj2.d();
        this.r = aj2.b(this.z);
    }

    public char t() {
        return this.t;
    }

    public char u() {
        return this.u;
    }

    String v() {
        return this.F;
    }

    public void j(char c2) {
        this.t = c2;
    }

    public void k(char c2) {
        this.u = c2;
    }

    public String w() {
        return this.w;
    }

    public void e(String string) {
        this.w = string;
    }

    public char x() {
        return this.y;
    }

    public void l(char c2) {
        this.y = c2;
    }

    public char y() {
        return this.x;
    }

    public void m(char c2) {
        this.x = c2;
    }

    public String a(int n2, boolean bl2) {
        if (n2 < 0 || n2 > 2) {
            throw new IllegalArgumentException("unknown currency spacing: " + n2);
        }
        if (bl2) {
            return this.d[n2];
        }
        return this.e[n2];
    }

    public void a(int n2, boolean bl2, String string) {
        if (n2 < 0 || n2 > 2) {
            throw new IllegalArgumentException("unknown currency spacing: " + n2);
        }
        if (bl2) {
            this.d[n2] = string;
        } else {
            this.e[n2] = string;
        }
    }

    public Locale z() {
        return this.z;
    }

    public dn A() {
        return this.A;
    }

    public Object clone() {
        try {
            return (dp)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object object) {
        int n2;
        if (!(object instanceof dp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        dp dp2 = (dp)object;
        for (n2 = 0; n2 <= 2; ++n2) {
            if (!this.d[n2].equals(dp2.d[n2])) {
                return false;
            }
            if (this.e[n2].equals(dp2.e[n2])) continue;
            return false;
        }
        if (dp2.g == null) {
            for (n2 = 0; n2 < 10; ++n2) {
                if (this.g[n2] == dp2.f + n2) continue;
                return false;
            }
        } else if (!Arrays.equals(this.g, dp2.g)) {
            return false;
        }
        return this.h == dp2.h && this.i == dp2.i && this.k == dp2.k && this.j == dp2.j && this.l == dp2.l && this.q == dp2.q && this.n == dp2.n && this.o.equals(dp2.o) && this.p.equals(dp2.p) && this.r.equals(dp2.r) && this.s.equals(dp2.s) && this.x == dp2.x && this.y == dp2.y && this.w.equals(dp2.w) && this.t == dp2.t && this.u == dp2.u;
    }

    public int hashCode() {
        int n2 = this.g[0];
        n2 = n2 * 37 + this.h;
        n2 = n2 * 37 + this.i;
        return n2;
    }

    private void b(dn dn2) {
        Object object;
        Object[] arrobject;
        String string;
        Object object2;
        bc bc2;
        String string2;
        String[][] arrstring;
        this.z = dn2.a();
        this.A = dn2;
        gz gz2 = gz.a(dn2);
        this.g = new char[10];
        if (gz2 != null && gz2.c() == 10 && !gz2.f() && gz.b(gz2.d())) {
            arrstring = gz2.d();
            this.g[0] = arrstring.charAt(0);
            this.g[1] = arrstring.charAt(1);
            this.g[2] = arrstring.charAt(2);
            this.g[3] = arrstring.charAt(3);
            this.g[4] = arrstring.charAt(4);
            this.g[5] = arrstring.charAt(5);
            this.g[6] = arrstring.charAt(6);
            this.g[7] = arrstring.charAt(7);
            this.g[8] = arrstring.charAt(8);
            this.g[9] = arrstring.charAt(9);
            string2 = gz2.e();
        } else {
            this.g[0] = 48;
            this.g[1] = 49;
            this.g[2] = 50;
            this.g[3] = 51;
            this.g[4] = 52;
            this.g[5] = 53;
            this.g[6] = 54;
            this.g[7] = 55;
            this.g[8] = 56;
            this.g[9] = 57;
            string2 = "latn";
        }
        arrstring = (String[][])E.a(dn2);
        if (arrstring == null) {
            arrstring = new String[1][];
            bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
            boolean bl2 = string2.equals("latn");
            object2 = "NumberElements/" + string2 + "/symbols/";
            string = "NumberElements/latn/symbols/";
            arrobject = new String[]{"decimal", "group", "list", "percentSign", "minusSign", "plusSign", "exponential", "perMille", "infinity", "nan", "currencyDecimal", "currencyGroup"};
            object = new String[]{".", ",", ";", "%", "-", "+", "E", "\u2030", "\u221e", "NaN", null, null};
            String[] arrstring2 = new String[arrobject.length];
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                try {
                    arrstring2[i2] = bc2.f((String)object2 + arrobject[i2]);
                    continue;
                }
                catch (MissingResourceException missingResourceException) {
                    if (!bl2) {
                        try {
                            arrstring2[i2] = bc2.f(string + arrobject[i2]);
                        }
                        catch (MissingResourceException missingResourceException2) {
                            arrstring2[i2] = object[i2];
                        }
                        continue;
                    }
                    arrstring2[i2] = object[i2];
                }
            }
            arrstring[0] = arrstring2;
            E.a(dn2, arrstring);
        }
        String[] arrstring3 = arrstring[0];
        bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        dn dn3 = bc2.i();
        this.a(dn3, dn3);
        this.i = arrstring3[0].charAt(0);
        this.h = arrstring3[1].charAt(0);
        this.n = arrstring3[2].charAt(0);
        this.k = arrstring3[3].charAt(0);
        this.q = arrstring3[4].charAt(0);
        this.y = arrstring3[5].charAt(0);
        this.w = arrstring3[6];
        this.j = arrstring3[7].charAt(0);
        this.o = arrstring3[8];
        this.p = arrstring3[9];
        this.t = arrstring3[10] != null ? arrstring3[10].charAt(0) : this.i;
        this.u = arrstring3[11] != null ? arrstring3[11].charAt(0) : this.h;
        this.l = (char)35;
        this.x = (char)42;
        this.m = (char)64;
        object2 = com.ibm.icu.a.w.a.a(dn2, true);
        string = null;
        this.I = aj.a(dn2);
        if (this.I != null) {
            this.s = this.I.d();
            arrobject = new boolean[1];
            string = this.I.a(dn2, 0, (boolean[])arrobject);
            this.r = arrobject[0] != false ? new ChoiceFormat(string).format(2.0) : string;
            object = ((y)object2).a(this.s);
            if (object != null) {
                this.F = object.a;
                this.t = object.b;
                this.u = object.c;
            }
        } else {
            this.s = "XXX";
            this.r = "\u00a4";
        }
        this.d = new String[3];
        this.e = new String[3];
        this.a(((y)object2).b());
    }

    private void a(ab ab2) {
        this.d[0] = ab2.a;
        this.d[1] = ab2.b;
        this.d[2] = ab2.c;
        this.e[0] = ab2.d;
        this.e[1] = ab2.e;
        this.e[2] = ab2.f;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.D < 1) {
            this.t = this.i;
            this.v = (char)69;
        }
        if (this.D < 2) {
            this.x = (char)42;
            this.y = (char)43;
            this.w = String.valueOf(this.v);
        }
        if (this.D < 3) {
            this.z = Locale.getDefault();
        }
        if (this.D < 4) {
            this.A = dn.a(this.z);
        }
        if (this.D < 5) {
            this.u = this.h;
        }
        if (this.D < 6) {
            if (this.d == null) {
                this.d = new String[3];
            }
            if (this.e == null) {
                this.e = new String[3];
            }
            this.a(ab.g);
        }
        this.D = 6;
        this.I = aj.a(this.s);
    }

    public final dn a(du du2) {
        return du2 == dn.w ? this.H : this.G;
    }

    final void a(dn dn2, dn dn3) {
        if (dn2 == null != (dn3 == null)) {
            throw new IllegalArgumentException();
        }
        this.G = dn2;
        this.H = dn3;
    }
}

