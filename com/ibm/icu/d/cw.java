/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.a.jd;
import com.ibm.icu.a.r;
import com.ibm.icu.a.s;
import com.ibm.icu.d.cx;
import com.ibm.icu.d.kl;
import com.ibm.icu.d.ks;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.du;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import com.ibm.icu.util.n;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class cw
implements Serializable,
Cloneable {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    static final int k = 0;
    static final int l = 1;
    static final int m = 2;
    static final int n = 3;
    static final int o = 4;
    static final int p = 5;
    static final int q = 6;
    static final int r = 7;
    String[] s = null;
    String[] t = null;
    String[] u = null;
    String[] v = null;
    String[] w = null;
    String[] x = null;
    String[] y = null;
    String[] z = null;
    String[] A = null;
    String[] B = null;
    String[] C = null;
    String[] D = null;
    String[] E = null;
    String[] F = null;
    String[] G = null;
    String[] H = null;
    String[] I = null;
    String[] J = null;
    String[] K = null;
    String[] L = null;
    String[] M = null;
    String[] N = null;
    String[] O = null;
    String[] P = null;
    private String[][] a = null;
    static final String Q = "GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXx";
    String R = null;
    private static final long b = -5987973545549424702L;
    private static final String[][] U = new String[][]{{"GregorianCalendar", "gregorian"}, {"JapaneseCalendar", "japanese"}, {"BuddhistCalendar", "buddhist"}, {"TaiwanCalendar", "roc"}, {"PersianCalendar", "persian"}, {"IslamicCalendar", "islamic"}, {"HebrewCalendar", "hebrew"}, {"ChineseCalendar", "chinese"}, {"IndianCalendar", "indian"}, {"CopticCalendar", "coptic"}, {"EthiopicCalendar", "ethiopic"}};
    private static final Map V = new HashMap();
    Map S = null;
    static final int T = 3600000;
    private static aj W;
    private dn X;
    private dn Y;
    private dn Z;

    public cw() {
        this(dn.a(dr.b));
    }

    public cw(Locale locale) {
        this(dn.a(locale));
    }

    public cw(dn dn2) {
        this.a(dn2, com.ibm.icu.a.s.a(dn2));
    }

    public static cw a() {
        return new cw();
    }

    public static cw a(Locale locale) {
        return new cw(locale);
    }

    public static cw a(dn dn2) {
        return new cw(dn2);
    }

    public static Locale[] b() {
        return bc.f();
    }

    public static dn[] c() {
        return bc.e();
    }

    public String[] d() {
        return this.h(this.s);
    }

    public void a(String[] arrstring) {
        this.s = this.h(arrstring);
    }

    public String[] e() {
        return this.h(this.t);
    }

    public void b(String[] arrstring) {
        this.t = this.h(arrstring);
    }

    public String[] f() {
        return this.h(this.v);
    }

    public String[] a(int n2, int n3) {
        String[] arrstring = null;
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 1: {
                        arrstring = this.v;
                        break block0;
                    }
                    case 0: 
                    case 3: {
                        arrstring = this.w;
                        break block0;
                    }
                    case 2: {
                        arrstring = this.x;
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 1: {
                        arrstring = this.y;
                        break block0;
                    }
                    case 0: 
                    case 3: {
                        arrstring = this.z;
                        break block0;
                    }
                    case 2: {
                        arrstring = this.A;
                    }
                }
            }
        }
        return this.h(arrstring);
    }

    public void c(String[] arrstring) {
        this.v = this.h(arrstring);
    }

    public void a(String[] arrstring, int n2, int n3) {
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 1: {
                        this.v = this.h(arrstring);
                        break block0;
                    }
                    case 0: {
                        this.w = this.h(arrstring);
                        break block0;
                    }
                    case 2: {
                        this.x = this.h(arrstring);
                        break block0;
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 1: {
                        this.y = this.h(arrstring);
                        break block0;
                    }
                    case 0: {
                        this.z = this.h(arrstring);
                        break block0;
                    }
                    case 2: {
                        this.A = this.h(arrstring);
                        break block0;
                    }
                }
            }
        }
    }

    public String[] g() {
        return this.h(this.w);
    }

    public void d(String[] arrstring) {
        this.w = this.h(arrstring);
    }

    public String[] h() {
        return this.h(this.B);
    }

    public String[] b(int n2, int n3) {
        String[] arrstring = null;
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 1: {
                        arrstring = this.B;
                        break block0;
                    }
                    case 0: {
                        arrstring = this.C;
                        break block0;
                    }
                    case 3: {
                        arrstring = this.D != null ? this.D : this.C;
                        break block0;
                    }
                    case 2: {
                        arrstring = this.E;
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 1: {
                        arrstring = this.F;
                        break block0;
                    }
                    case 0: {
                        arrstring = this.G;
                        break block0;
                    }
                    case 3: {
                        arrstring = this.H != null ? this.H : this.G;
                        break block0;
                    }
                    case 2: {
                        arrstring = this.I;
                    }
                }
            }
        }
        return this.h(arrstring);
    }

    public void b(String[] arrstring, int n2, int n3) {
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 1: {
                        this.B = this.h(arrstring);
                        break block0;
                    }
                    case 0: {
                        this.C = this.h(arrstring);
                        break block0;
                    }
                    case 3: {
                        this.D = this.h(arrstring);
                        break block0;
                    }
                    case 2: {
                        this.E = this.h(arrstring);
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 1: {
                        this.F = this.h(arrstring);
                        break block0;
                    }
                    case 0: {
                        this.G = this.h(arrstring);
                        break block0;
                    }
                    case 3: {
                        this.H = this.h(arrstring);
                        break block0;
                    }
                    case 2: {
                        this.I = this.h(arrstring);
                    }
                }
            }
        }
    }

    public void e(String[] arrstring) {
        this.B = this.h(arrstring);
    }

    public String[] i() {
        return this.h(this.C);
    }

    public void f(String[] arrstring) {
        this.C = this.h(arrstring);
    }

    public String[] c(int n2, int n3) {
        String[] arrstring = null;
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 1: {
                        arrstring = this.L;
                        break block0;
                    }
                    case 0: 
                    case 3: {
                        arrstring = this.K;
                        break block0;
                    }
                    case 2: {
                        arrstring = null;
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 1: {
                        arrstring = this.N;
                        break block0;
                    }
                    case 0: 
                    case 3: {
                        arrstring = this.M;
                        break block0;
                    }
                    case 2: {
                        arrstring = null;
                    }
                }
            }
        }
        return this.h(arrstring);
    }

    public void c(String[] arrstring, int n2, int n3) {
        block0 : switch (n2) {
            case 0: {
                switch (n3) {
                    case 1: {
                        this.L = this.h(arrstring);
                        break block0;
                    }
                    case 0: {
                        this.K = this.h(arrstring);
                        break block0;
                    }
                    case 2: {
                        break block0;
                    }
                }
                break;
            }
            case 1: {
                switch (n3) {
                    case 1: {
                        this.N = this.h(arrstring);
                        break block0;
                    }
                    case 0: {
                        this.M = this.h(arrstring);
                        break block0;
                    }
                    case 2: {
                        break block0;
                    }
                }
            }
        }
    }

    public String[] j() {
        return this.h(this.J);
    }

    public void g(String[] arrstring) {
        this.J = this.h(arrstring);
    }

    public String[][] k() {
        if (this.a != null) {
            return this.b(this.a);
        }
        String[] arrstring = dj.o();
        kl kl2 = kl.a(this.Y);
        long l2 = System.currentTimeMillis();
        String[][] arrstring2 = new String[arrstring.length][5];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string = dj.f(arrstring[i2]);
            if (string == null) {
                string = arrstring[i2];
            }
            arrstring2[i2][0] = arrstring[i2];
            arrstring2[i2][1] = kl2.a(string, ks.b, l2);
            arrstring2[i2][2] = kl2.a(string, ks.e, l2);
            arrstring2[i2][3] = kl2.a(string, ks.c, l2);
            arrstring2[i2][4] = kl2.a(string, ks.f, l2);
        }
        this.a = arrstring2;
        return this.a;
    }

    public void a(String[][] arrstring) {
        this.a = this.b(arrstring);
    }

    public String l() {
        return this.R;
    }

    public void a(String string) {
        this.R = string;
    }

    public Object clone() {
        try {
            cw cw2 = (cw)super.clone();
            return cw2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
    }

    public int hashCode() {
        return this.X.toString().hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cw cw2 = (cw)object;
        return jd.a(this.s, (Object)cw2.s) && jd.a(this.t, (Object)cw2.t) && jd.a(this.v, (Object)cw2.v) && jd.a(this.w, (Object)cw2.w) && jd.a(this.x, (Object)cw2.x) && jd.a(this.y, (Object)cw2.y) && jd.a(this.z, (Object)cw2.z) && jd.a(this.A, (Object)cw2.A) && jd.a(this.B, (Object)cw2.B) && jd.a(this.C, (Object)cw2.C) && jd.a(this.D, (Object)cw2.D) && jd.a(this.E, (Object)cw2.E) && jd.a(this.F, (Object)cw2.F) && jd.a(this.G, (Object)cw2.G) && jd.a(this.H, (Object)cw2.H) && jd.a(this.I, (Object)cw2.I) && jd.a(this.J, (Object)cw2.J) && cw.a(this.a, cw2.a) && this.X.v().equals(cw2.X.v()) && jd.a((Object)this.R, (Object)cw2.R);
    }

    protected void a(dn dn2, String string) {
        String string2 = dn2.k() + "+" + string;
        cw cw2 = (cw)W.a(string2);
        if (cw2 == null) {
            r r2 = new r(dn2, string);
            this.a(dn2, r2);
            if (this.getClass().getName().equals("com.ibm.icu.text.DateFormatSymbols")) {
                cw2 = (cw)this.clone();
                W.a(string2, cw2);
            }
        } else {
            this.a(cw2);
        }
    }

    void a(cw cw2) {
        this.s = cw2.s;
        this.t = cw2.t;
        this.u = cw2.u;
        this.v = cw2.v;
        this.w = cw2.w;
        this.x = cw2.x;
        this.y = cw2.y;
        this.z = cw2.z;
        this.A = cw2.A;
        this.B = cw2.B;
        this.C = cw2.C;
        this.D = cw2.D;
        this.E = cw2.E;
        this.F = cw2.F;
        this.G = cw2.G;
        this.H = cw2.H;
        this.I = cw2.I;
        this.J = cw2.J;
        this.K = cw2.K;
        this.L = cw2.L;
        this.M = cw2.M;
        this.N = cw2.N;
        this.O = cw2.O;
        this.P = cw2.P;
        this.a = cw2.a;
        this.R = cw2.R;
        this.S = cw2.S;
        this.Z = cw2.Z;
        this.Y = cw2.Y;
        this.X = cw2.X;
    }

    protected void a(dn dn2, r r2) {
        this.s = r2.c("abbreviated");
        this.t = r2.c("wide");
        this.u = r2.c("narrow");
        this.v = r2.b("monthNames", "wide");
        this.w = r2.b("monthNames", "abbreviated");
        this.x = r2.b("monthNames", "narrow");
        this.y = r2.b("monthNames", "stand-alone", "wide");
        this.z = r2.b("monthNames", "stand-alone", "abbreviated");
        this.A = r2.b("monthNames", "stand-alone", "narrow");
        String[] arrstring = r2.b("dayNames", "wide");
        this.B = new String[8];
        this.B[0] = "";
        System.arraycopy(arrstring, 0, this.B, 1, arrstring.length);
        String[] arrstring2 = r2.b("dayNames", "abbreviated");
        this.C = new String[8];
        this.C[0] = "";
        System.arraycopy(arrstring2, 0, this.C, 1, arrstring2.length);
        String[] arrstring3 = r2.b("dayNames", "short");
        this.D = new String[8];
        this.D[0] = "";
        System.arraycopy(arrstring3, 0, this.D, 1, arrstring3.length);
        String[] arrstring4 = null;
        try {
            arrstring4 = r2.b("dayNames", "narrow");
        }
        catch (MissingResourceException missingResourceException) {
            try {
                arrstring4 = r2.b("dayNames", "stand-alone", "narrow");
            }
            catch (MissingResourceException missingResourceException2) {
                arrstring4 = r2.b("dayNames", "abbreviated");
            }
        }
        this.E = new String[8];
        this.E[0] = "";
        System.arraycopy(arrstring4, 0, this.E, 1, arrstring4.length);
        String[] arrstring5 = null;
        arrstring5 = r2.b("dayNames", "stand-alone", "wide");
        this.F = new String[8];
        this.F[0] = "";
        System.arraycopy(arrstring5, 0, this.F, 1, arrstring5.length);
        String[] arrstring6 = null;
        arrstring6 = r2.b("dayNames", "stand-alone", "abbreviated");
        this.G = new String[8];
        this.G[0] = "";
        System.arraycopy(arrstring6, 0, this.G, 1, arrstring6.length);
        String[] arrstring7 = null;
        arrstring7 = r2.b("dayNames", "stand-alone", "short");
        this.H = new String[8];
        this.H[0] = "";
        System.arraycopy(arrstring7, 0, this.H, 1, arrstring7.length);
        String[] arrstring8 = null;
        arrstring8 = r2.b("dayNames", "stand-alone", "narrow");
        this.I = new String[8];
        this.I[0] = "";
        System.arraycopy(arrstring8, 0, this.I, 1, arrstring8.length);
        this.J = r2.b("AmPmMarkers");
        this.L = r2.b("quarters", "wide");
        this.K = r2.b("quarters", "abbreviated");
        this.N = r2.b("quarters", "stand-alone", "wide");
        this.M = r2.b("quarters", "stand-alone", "abbreviated");
        bc bc2 = null;
        try {
            bc2 = r2.a("monthPatterns");
        }
        catch (MissingResourceException missingResourceException) {
            bc2 = null;
        }
        if (bc2 != null) {
            this.O = new String[7];
            this.O[0] = r2.a("monthPatterns", "wide").l("leap").A();
            this.O[1] = r2.a("monthPatterns", "abbreviated").l("leap").A();
            this.O[2] = r2.a("monthPatterns", "narrow").l("leap").A();
            this.O[3] = r2.a("monthPatterns", "stand-alone", "wide").l("leap").A();
            this.O[4] = r2.a("monthPatterns", "stand-alone", "abbreviated").l("leap").A();
            this.O[5] = r2.a("monthPatterns", "stand-alone", "narrow").l("leap").A();
            this.O[6] = r2.a("monthPatterns", "numeric", "all").l("leap").A();
        }
        bc bc3 = null;
        try {
            bc3 = r2.a("cyclicNameSets");
        }
        catch (MissingResourceException missingResourceException) {
            bc3 = null;
        }
        if (bc3 != null) {
            this.P = r2.a("cyclicNameSets", "years", "format", "abbreviated").u();
        }
        this.X = dn2;
        bc bc4 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        this.R = Q;
        dn dn3 = bc4.i();
        this.a(dn3, dn3);
        this.S = new HashMap();
        boolean[] arrbl = new boolean[]{false, false};
        cx[] arrcx = cx.values();
        for (Object object2 : arrcx) {
            this.S.put(object2, arrbl);
        }
        Object object = null;
        try {
            object = bc4.b("contextTransforms");
        }
        catch (MissingResourceException missingResourceException) {
            object = null;
        }
        if (object != null) {
            dy dy2 = ((dv)object).D();
            while (dy2.d()) {
                String string;
                cx cx2;
                Object object2;
                dv dv2 = dy2.a();
                object2 = dv2.z();
                if (((cx)object2).length < 2 || (cx2 = (cx)((Object)V.get(string = dv2.k()))) == null) continue;
                boolean[] arrbl2 = new boolean[]{object2[0] != false, object2[1] != false};
                this.S.put(cx2, arrbl2);
            }
        }
    }

    private static final boolean a(Object[][] arrobject, Object[][] arrobject2) {
        if (arrobject == arrobject2) {
            return true;
        }
        if (arrobject == null || arrobject2 == null) {
            return false;
        }
        if (arrobject.length != arrobject2.length) {
            return false;
        }
        boolean bl2 = true;
        for (int i2 = 0; i2 < arrobject.length && (bl2 = jd.a(arrobject[i2], (Object)arrobject2[i2])); ++i2) {
        }
        return bl2;
    }

    private final String[] h(String[] arrstring) {
        return (String[])arrstring.clone();
    }

    private final String[][] b(String[][] arrstring) {
        String[][] arrstring2 = new String[arrstring.length][];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring2[i2] = this.h(arrstring[i2]);
        }
        return arrstring2;
    }

    public cw(n n2, Locale locale) {
        this.a(dn.a(locale), n2.b());
    }

    public cw(n n2, dn dn2) {
        this.a(dn2, n2.b());
    }

    public cw(Class class_, Locale locale) {
        this(class_, dn.a(locale));
    }

    public cw(Class class_, dn dn2) {
        String string = class_.getName();
        int n2 = string.lastIndexOf(46);
        String string2 = string.substring(n2 + 1);
        String string3 = null;
        for (String[] arrstring : U) {
            if (!arrstring[0].equals(string2)) continue;
            string3 = arrstring[1];
            break;
        }
        if (string3 == null) {
            string3 = string2.replaceAll("Calendar", "").toLowerCase(Locale.ENGLISH);
        }
        this.a(dn2, string3);
    }

    public cw(ResourceBundle resourceBundle, Locale locale) {
        this(resourceBundle, dn.a(locale));
    }

    public cw(ResourceBundle resourceBundle, dn dn2) {
        this.a(dn2, new r((bc)resourceBundle, com.ibm.icu.a.s.a(dn2)));
    }

    public static ResourceBundle a(Class class_, Locale locale) {
        return null;
    }

    public static ResourceBundle a(Class class_, dn dn2) {
        return null;
    }

    public static ResourceBundle a(n n2, Locale locale) {
        return null;
    }

    public static ResourceBundle a(n n2, dn dn2) {
        return null;
    }

    public final dn a(du du2) {
        return du2 == dn.w ? this.Z : this.Y;
    }

    final void a(dn dn2, dn dn3) {
        if (dn2 == null != (dn3 == null)) {
            throw new IllegalArgumentException();
        }
        this.Y = dn2;
        this.Z = dn3;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    static {
        V.put("month-format-except-narrow", cx.b);
        V.put("month-standalone-except-narrow", cx.c);
        V.put("month-narrow", cx.d);
        V.put("day-format-except-narrow", cx.e);
        V.put("day-standalone-except-narrow", cx.f);
        V.put("day-narrow", cx.g);
        V.put("era-name", cx.h);
        V.put("era-abbr", cx.i);
        V.put("era-narrow", cx.j);
        V.put("zone-long", cx.k);
        V.put("zone-short", cx.l);
        V.put("metazone-long", cx.m);
        V.put("metazone-short", cx.n);
        W = new ew();
    }
}

