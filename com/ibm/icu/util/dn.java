/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.c.a;
import com.ibm.icu.a.c.c;
import com.ibm.icu.a.c.g;
import com.ibm.icu.a.c.h;
import com.ibm.icu.a.c.k;
import com.ibm.icu.a.c.l;
import com.ibm.icu.a.c.o;
import com.ibm.icu.a.c.r;
import com.ibm.icu.a.cb;
import com.ibm.icu.a.dd;
import com.ibm.icu.a.df;
import com.ibm.icu.a.dg;
import com.ibm.icu.a.ew;
import com.ibm.icu.d.el;
import com.ibm.icu.d.em;
import com.ibm.icu.util.do;
import com.ibm.icu.util.dp;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.ds;
import com.ibm.icu.util.du;
import com.ibm.icu.util.dv;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;

public final class dn
implements Serializable {
    private static final long A = 3715177670352309217L;
    public static final dn a = new dn("en", Locale.ENGLISH);
    public static final dn b = new dn("fr", Locale.FRENCH);
    public static final dn c = new dn("de", Locale.GERMAN);
    public static final dn d = new dn("it", Locale.ITALIAN);
    public static final dn e = new dn("ja", Locale.JAPANESE);
    public static final dn f = new dn("ko", Locale.KOREAN);
    public static final dn g = new dn("zh", Locale.CHINESE);
    public static final dn h = new dn("zh_Hans", Locale.CHINESE);
    public static final dn i = new dn("zh_Hant", Locale.CHINESE);
    public static final dn j = new dn("fr_FR", Locale.FRANCE);
    public static final dn k = new dn("de_DE", Locale.GERMANY);
    public static final dn l = new dn("it_IT", Locale.ITALY);
    public static final dn m = new dn("ja_JP", Locale.JAPAN);
    public static final dn n = new dn("ko_KR", Locale.KOREA);
    public static final dn o;
    public static final dn p;
    public static final dn q;
    public static final dn r;
    public static final dn s;
    public static final dn t;
    public static final dn u;
    private static final String B = "";
    private static final char C = '_';
    private static final Locale D;
    private static final String E = "attribute";
    public static final dn v;
    private static final ew F;
    private volatile transient Locale G;
    private String H;
    private volatile transient c I;
    private volatile transient l J;
    private static String[][] K;
    private static String[][] L;
    private static aj M;
    private static Locale N;
    private static dn O;
    private static Locale[] P;
    private static dn[] Q;
    public static du w;
    public static du x;
    private static final String R = "und";
    private static final String S = "Zzzz";
    private static final String T = "ZZ";
    public static final char y = 'x';
    public static final char z = 'u';

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void D() {
        Class<dn> class_;
        String[][] arrarrstring;
        if (K == null) {
            arrarrstring = new String[][]{{"C", "en_US_POSIX", null, null}, {"art_LOJBAN", "jbo", null, null}, {"az_AZ_CYRL", "az_Cyrl_AZ", null, null}, {"az_AZ_LATN", "az_Latn_AZ", null, null}, {"ca_ES_PREEURO", "ca_ES", "currency", "ESP"}, {"cel_GAULISH", "cel__GAULISH", null, null}, {"de_1901", "de__1901", null, null}, {"de_1906", "de__1906", null, null}, {"de__PHONEBOOK", "de", "collation", "phonebook"}, {"de_AT_PREEURO", "de_AT", "currency", "ATS"}, {"de_DE_PREEURO", "de_DE", "currency", "DEM"}, {"de_LU_PREEURO", "de_LU", "currency", "EUR"}, {"el_GR_PREEURO", "el_GR", "currency", "GRD"}, {"en_BOONT", "en__BOONT", null, null}, {"en_SCOUSE", "en__SCOUSE", null, null}, {"en_BE_PREEURO", "en_BE", "currency", "BEF"}, {"en_IE_PREEURO", "en_IE", "currency", "IEP"}, {"es__TRADITIONAL", "es", "collation", "traditional"}, {"es_ES_PREEURO", "es_ES", "currency", "ESP"}, {"eu_ES_PREEURO", "eu_ES", "currency", "ESP"}, {"fi_FI_PREEURO", "fi_FI", "currency", "FIM"}, {"fr_BE_PREEURO", "fr_BE", "currency", "BEF"}, {"fr_FR_PREEURO", "fr_FR", "currency", "FRF"}, {"fr_LU_PREEURO", "fr_LU", "currency", "LUF"}, {"ga_IE_PREEURO", "ga_IE", "currency", "IEP"}, {"gl_ES_PREEURO", "gl_ES", "currency", "ESP"}, {"hi__DIRECT", "hi", "collation", "direct"}, {"it_IT_PREEURO", "it_IT", "currency", "ITL"}, {"ja_JP_TRADITIONAL", "ja_JP", "calendar", "japanese"}, {"nl_BE_PREEURO", "nl_BE", "currency", "BEF"}, {"nl_NL_PREEURO", "nl_NL", "currency", "NLG"}, {"pt_PT_PREEURO", "pt_PT", "currency", "PTE"}, {"sl_ROZAJ", "sl__ROZAJ", null, null}, {"sr_SP_CYRL", "sr_Cyrl_RS", null, null}, {"sr_SP_LATN", "sr_Latn_RS", null, null}, {"sr_YU_CYRILLIC", "sr_Cyrl_RS", null, null}, {"th_TH_TRADITIONAL", "th_TH", "calendar", "buddhist"}, {"uz_UZ_CYRILLIC", "uz_Cyrl_UZ", null, null}, {"uz_UZ_CYRL", "uz_Cyrl_UZ", null, null}, {"uz_UZ_LATN", "uz_Latn_UZ", null, null}, {"zh_CHS", "zh_Hans", null, null}, {"zh_CHT", "zh_Hant", null, null}, {"zh_GAN", "zh__GAN", null, null}, {"zh_GUOYU", "zh", null, null}, {"zh_HAKKA", "zh__HAKKA", null, null}, {"zh_MIN", "zh__MIN", null, null}, {"zh_MIN_NAN", "zh__MINNAN", null, null}, {"zh_WUU", "zh__WUU", null, null}, {"zh_XIANG", "zh__XIANG", null, null}, {"zh_YUE", "zh__YUE", null, null}};
            class_ = dn.class;
            // MONITORENTER : com.ibm.icu.util.dn.class
            if (K == null) {
                K = arrarrstring;
            }
            // MONITOREXIT : class_
        }
        if (L != null) return;
        arrarrstring = new String[][]{{"EURO", "currency", "EUR"}, {"PINYIN", "collation", "pinyin"}, {"STROKE", "collation", "stroke"}};
        class_ = dn.class;
        // MONITORENTER : com.ibm.icu.util.dn.class
        if (L == null) {
            L = arrarrstring;
        }
        // MONITOREXIT : class_
    }

    private dn(String string, Locale locale) {
        this.H = string;
        this.G = locale;
    }

    private dn(Locale locale) {
        this.H = dn.h(dn.a(locale).toString());
        this.G = locale;
    }

    public static dn a(Locale locale) {
        if (locale == null) {
            return null;
        }
        dn dn2 = (dn)F.a(locale);
        if (dn2 == null) {
            dn2 = ds.a(locale);
            F.a(locale, dn2);
        }
        return dn2;
    }

    public dn(String string) {
        this.H = dn.h(string);
    }

    public dn(String string, String string2) {
        this(string, string2, null);
    }

    public dn(String string, String string2, String string3) {
        this.H = dn.h(dn.b(string, string2, string3, B));
    }

    public static dn a(String string) {
        return new dn(dn.k(string), (Locale)null);
    }

    private static String b(String string, String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null && string.length() > 0) {
            stringBuilder.append(string);
        }
        if (string2 != null && string2.length() > 0) {
            stringBuilder.append('_');
            stringBuilder.append(string2);
        }
        if (string3 != null && string3.length() > 0) {
            stringBuilder.append('_');
            stringBuilder.append(string3);
        }
        if (string4 != null && string4.length() > 0) {
            if (string3 == null || string3.length() == 0) {
                stringBuilder.append('_');
            }
            stringBuilder.append('_');
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    public Locale a() {
        if (this.G == null) {
            this.G = ds.a(this);
        }
        return this.G;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static dn b() {
        Class<dn> class_ = dn.class;
        synchronized (dn.class) {
            if (O == null) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return v;
            }
            Locale locale = Locale.getDefault();
            if (!N.equals(locale)) {
                N = locale;
                O = dn.a(locale);
                if (!ds.a()) {
                    for (dr dr2 : dr.values()) {
                        int n2 = dr2.ordinal();
                        dn.P[n2] = locale;
                        dn.Q[n2] = dn.a(locale);
                    }
                }
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return O;
        }
    }

    public static synchronized void a(dn dn2) {
        N = dn2.a();
        Locale.setDefault(N);
        O = dn2;
        for (dr dr2 : dr.values()) {
            dn.a(dr2, dn2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static dn a(dr dr2) {
        Class<dn> class_ = dn.class;
        synchronized (dn.class) {
            int n2 = dr2.ordinal();
            if (Q[n2] == null) {
                // ** MonitorExit[var1_1] (shouldn't be in output)
                return v;
            }
            if (ds.a()) {
                Locale locale = ds.a(dr2);
                if (!P[n2].equals(locale)) {
                    dn.P[n2] = locale;
                    dn.Q[n2] = dn.a(locale);
                }
            } else {
                Locale locale = Locale.getDefault();
                if (!N.equals(locale)) {
                    N = locale;
                    O = dn.a(locale);
                    for (dr dr3 : dr.values()) {
                        int n3 = dr3.ordinal();
                        dn.P[n3] = locale;
                        dn.Q[n3] = dn.a(locale);
                    }
                }
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return Q[n2];
        }
    }

    public static synchronized void a(dr dr2, dn dn2) {
        Locale locale = dn2.a();
        int n2 = dr2.ordinal();
        dn.Q[n2] = dn2;
        dn.P[n2] = locale;
        ds.a(dr2, locale);
    }

    public Object clone() {
        return this;
    }

    public int hashCode() {
        return this.H.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof dn) {
            return this.H.equals(((dn)object).H);
        }
        return false;
    }

    public static dn[] c() {
        return bc.e();
    }

    public static String[] d() {
        return df.a();
    }

    public static String[] e() {
        return df.b();
    }

    public String f() {
        return dn.b(this.H);
    }

    public static String b(String string) {
        return new dd(string).a();
    }

    public String g() {
        return dn.c(this.H);
    }

    public static String c(String string) {
        return new dd(string).b();
    }

    public String h() {
        return dn.d(this.H);
    }

    public static String d(String string) {
        return new dd(string).c();
    }

    public String i() {
        return dn.e(this.H);
    }

    public static String e(String string) {
        return new dd(string).d();
    }

    public static String f(String string) {
        return dn.s(dn.h(string));
    }

    public dn j() {
        if (this.H.length() == 0 || this.H.charAt(0) == '@') {
            return null;
        }
        return new dn(dn.s(this.H), (Locale)null);
    }

    private static String s(String string) {
        int n2;
        int n3 = string.indexOf(64);
        if (n3 == -1) {
            n3 = string.length();
        }
        if ((n2 = string.lastIndexOf(95, n3)) == -1) {
            n2 = 0;
        } else {
            while (n2 > 0 && string.charAt(n2 - 1) == '_') {
                --n2;
            }
        }
        return string.substring(0, n2) + string.substring(n3);
    }

    public String k() {
        return dn.g(this.H);
    }

    public static String g(String string) {
        if (string.indexOf(64) == -1) {
            return string;
        }
        return new dd(string).g();
    }

    public String l() {
        return this.H;
    }

    private static int t(String string) {
        int n2;
        int n3 = n2 = string.length();
        boolean bl2 = true;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (string.charAt(i2) != '_' && string.charAt(i2) != '-') {
                if (bl2) {
                    bl2 = false;
                    n4 = 0;
                }
                ++n4;
                continue;
            }
            if (n4 != 0 && n4 < n3) {
                n3 = n4;
            }
            bl2 = true;
        }
        return n3;
    }

    public static String h(String string) {
        String string2;
        String string3;
        if (string != null && !string.contains("@") && dn.t(string) == 1) {
            string3 = dn.q(string).l();
            if (string3.length() == 0) {
                string3 = string;
            }
        } else {
            string3 = string;
        }
        if ((string2 = (String)M.a(string3)) == null) {
            string2 = new dd(string3).h();
            M.a(string3, string2);
        }
        return string2;
    }

    public String toString() {
        return this.H;
    }

    public Iterator m() {
        return dn.i(this.H);
    }

    public static Iterator i(String string) {
        return new dd(string).j();
    }

    public String j(String string) {
        return dn.a(this.H, string);
    }

    public static String a(String string, String string2) {
        return new dd(string).b(string2);
    }

    public static String k(String string) {
        String[] arrstring;
        int n2;
        dd dd2 = new dd(string, true);
        String string2 = dd2.g();
        boolean bl2 = false;
        if (string.equals(B)) {
            return B;
        }
        dn.D();
        for (n2 = 0; n2 < L.length; ++n2) {
            arrstring = L[n2];
            int n3 = string2.lastIndexOf("_" + arrstring[0]);
            if (n3 <= -1) continue;
            bl2 = true;
            if ((string2 = string2.substring(0, n3)).endsWith("_")) {
                string2 = string2.substring(0, --n3);
            }
            dd2.a(string2);
            dd2.a(arrstring[1], arrstring[2]);
            break;
        }
        for (n2 = 0; n2 < K.length; ++n2) {
            if (!K[n2][0].equals(string2)) continue;
            bl2 = true;
            arrstring = K[n2];
            dd2.a(arrstring[1]);
            if (arrstring[2] == null) break;
            dd2.a(arrstring[2], arrstring[3]);
            break;
        }
        if (!bl2 && dd2.a().equals("nb") && dd2.d().equals("NY")) {
            dd2.a(dn.b("nn", dd2.b(), dd2.c(), null));
        }
        return dd2.h();
    }

    public dn b(String string, String string2) {
        return new dn(dn.a(this.H, string, string2), (Locale)null);
    }

    public static String a(String string, String string2, String string3) {
        dd dd2 = new dd(string);
        dd2.b(string2, string3);
        return dd2.h();
    }

    public String n() {
        return dn.l(this.H);
    }

    public static String l(String string) {
        return df.b(dn.b(string));
    }

    public String o() {
        return dn.m(this.H);
    }

    public static String m(String string) {
        return df.a(dn.d(string));
    }

    public String p() {
        return dn.a(this, dn.a(dr.a), false);
    }

    public String b(dn dn2) {
        return dn.a(this, dn2, false);
    }

    public static String c(String string, String string2) {
        return dn.a(new dn(string), new dn(string2), false);
    }

    public static String a(String string, dn dn2) {
        return dn.a(new dn(string), dn2, false);
    }

    public String q() {
        return dn.a(this, dn.a(dr.a), true);
    }

    public String c(dn dn2) {
        return dn.a(this, dn2, true);
    }

    public static String d(String string, String string2) {
        return dn.a(new dn(string), new dn(string2), true);
    }

    public static String b(String string, dn dn2) {
        return dn.a(new dn(string), dn2, true);
    }

    private static String a(dn dn2, dn dn3, boolean bl2) {
        String string = bl2 ? dn2.k() : dn2.f();
        return el.b(dn3).b(string);
    }

    public String r() {
        return dn.a(this, dn.a(dr.a));
    }

    public String s() {
        return dn.b(this, dn.a(dr.a));
    }

    public String d(dn dn2) {
        return dn.a(this, dn2);
    }

    public String e(dn dn2) {
        return dn.b(this, dn2);
    }

    public static String e(String string, String string2) {
        return dn.a(new dn(string), new dn(string2));
    }

    public static String f(String string, String string2) {
        return dn.b(new dn(string), new dn(string2));
    }

    public static String c(String string, dn dn2) {
        return dn.a(new dn(string), dn2);
    }

    public static String d(String string, dn dn2) {
        return dn.b(new dn(string), dn2);
    }

    private static String a(dn dn2, dn dn3) {
        return el.b(dn3).c(dn2.g());
    }

    private static String b(dn dn2, dn dn3) {
        return el.b(dn3).d(dn2.g());
    }

    public String t() {
        return dn.c(this, dn.a(dr.a));
    }

    public String f(dn dn2) {
        return dn.c(this, dn2);
    }

    public static String g(String string, String string2) {
        return dn.c(new dn(string), new dn(string2));
    }

    public static String e(String string, dn dn2) {
        return dn.c(new dn(string), dn2);
    }

    private static String c(dn dn2, dn dn3) {
        return el.b(dn3).e(dn2.h());
    }

    public String u() {
        return dn.d(this, dn.a(dr.a));
    }

    public String g(dn dn2) {
        return dn.d(this, dn2);
    }

    public static String h(String string, String string2) {
        return dn.d(new dn(string), new dn(string2));
    }

    public static String f(String string, dn dn2) {
        return dn.d(new dn(string), dn2);
    }

    private static String d(dn dn2, dn dn3) {
        return el.b(dn3).f(dn2.i());
    }

    public static String n(String string) {
        return dn.k(string, dn.a(dr.a));
    }

    public static String i(String string, String string2) {
        return dn.k(string, new dn(string2));
    }

    public static String g(String string, dn dn2) {
        return dn.k(string, dn2);
    }

    private static String k(String string, dn dn2) {
        return el.b(dn2).g(string);
    }

    public String o(String string) {
        return dn.a(this, string, dn.a(dr.a));
    }

    public String h(String string, dn dn2) {
        return dn.a(this, string, dn2);
    }

    public static String b(String string, String string2, String string3) {
        return dn.a(new dn(string), string2, new dn(string3));
    }

    public static String a(String string, String string2, dn dn2) {
        return dn.a(new dn(string), string2, dn2);
    }

    private static String a(dn dn2, String string, dn dn3) {
        string = com.ibm.icu.a.c.a.a(string.trim());
        String string2 = dn2.j(string);
        return el.b(dn3).a(string, string2);
    }

    public String v() {
        return dn.e(this, dn.a(dr.a));
    }

    public String h(dn dn2) {
        return dn.e(this, dn2);
    }

    public static String j(String string, String string2) {
        return dn.e(new dn(string), new dn(string2));
    }

    public static String i(String string, dn dn2) {
        return dn.e(new dn(string), dn2);
    }

    private static String e(dn dn2, dn dn3) {
        return el.b(dn3).a(dn2);
    }

    public String w() {
        return dn.f(this, dn.a(dr.a));
    }

    public String i(dn dn2) {
        return dn.f(this, dn2);
    }

    public static String k(String string, String string2) {
        return dn.f(new dn(string), new dn(string2));
    }

    public static String j(String string, dn dn2) {
        return dn.f(new dn(string), dn2);
    }

    private static String f(dn dn2, dn dn3) {
        return el.b(dn3, em.b).a(dn2);
    }

    public String x() {
        return cb.a("com/ibm/icu/impl/data/icudt51b", this, "layout", "characters");
    }

    public String y() {
        return cb.a("com/ibm/icu/impl/data/icudt51b", this, "layout", "lines");
    }

    public static dn a(String string, dn[] arrdn, boolean[] arrbl) {
        if (string == null) {
            throw new NullPointerException();
        }
        dn[] arrdn2 = null;
        try {
            arrdn2 = dn.a(string, true);
        }
        catch (ParseException parseException) {
            arrdn2 = null;
        }
        if (arrdn2 == null) {
            return null;
        }
        return dn.a(arrdn2, arrdn, arrbl);
    }

    public static dn a(dn[] arrdn, dn[] arrdn2, boolean[] arrbl) {
        if (arrbl != null) {
            arrbl[0] = true;
        }
        for (int i2 = 0; i2 < arrdn.length; ++i2) {
            dn dn2 = arrdn[i2];
            boolean[] arrbl2 = arrbl;
            do {
                Serializable serializable;
                for (int i3 = 0; i3 < arrdn2.length; ++i3) {
                    if (arrdn2[i3].equals(dn2)) {
                        if (arrbl2 != null) {
                            arrbl2[0] = false;
                        }
                        return arrdn2[i3];
                    }
                    if (dn2.g().length() != 0 || arrdn2[i3].g().length() <= 0 || !arrdn2[i3].f().equals(dn2.f()) || !arrdn2[i3].h().equals(dn2.h()) || !arrdn2[i3].i().equals(dn2.i()) || ((dn)(serializable = dn.k(arrdn2[i3]))).g().length() != 0) continue;
                    if (arrbl2 != null) {
                        arrbl2[0] = false;
                    }
                    return dn2;
                }
                serializable = dn2.a();
                Locale locale = dg.a((Locale)serializable);
                dn2 = locale != null ? new dn(locale) : null;
                arrbl2 = null;
            } while (dn2 != null);
        }
        return null;
    }

    public static dn a(String string, boolean[] arrbl) {
        return dn.a(string, dn.c(), arrbl);
    }

    public static dn a(dn[] arrdn, boolean[] arrbl) {
        return dn.a(arrdn, dn.c(), arrbl);
    }

    static dn[] a(String string, boolean bl2) {
        int n2;
        TreeMap<dp, dn> treeMap = new TreeMap<dp, dn>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int n3 = 0;
        string = string + ",";
        boolean bl3 = false;
        boolean bl4 = false;
        for (n2 = 0; n2 < string.length(); ++n2) {
            boolean bl5 = false;
            char c2 = string.charAt(n2);
            switch (n3) {
                case 0: {
                    if ('A' <= c2 && c2 <= 'Z' || 'a' <= c2 && c2 <= 'z') {
                        stringBuilder.append(c2);
                        n3 = 1;
                        bl3 = false;
                        break;
                    }
                    if (c2 == '*') {
                        stringBuilder.append(c2);
                        n3 = 2;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') break;
                    n3 = -1;
                    break;
                }
                case 1: {
                    if ('A' <= c2 && c2 <= 'Z' || 'a' <= c2 && c2 <= 'z') {
                        stringBuilder.append(c2);
                        break;
                    }
                    if (c2 == '-') {
                        bl3 = true;
                        stringBuilder.append(c2);
                        break;
                    }
                    if (c2 == '_') {
                        if (bl2) {
                            bl3 = true;
                            stringBuilder.append(c2);
                            break;
                        }
                        n3 = -1;
                        break;
                    }
                    if ('0' <= c2 && c2 <= '9') {
                        if (bl3) {
                            stringBuilder.append(c2);
                            break;
                        }
                        n3 = -1;
                        break;
                    }
                    if (c2 == ',') {
                        bl5 = true;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') {
                        n3 = 3;
                        break;
                    }
                    if (c2 == ';') {
                        n3 = 4;
                        break;
                    }
                    n3 = -1;
                    break;
                }
                case 2: {
                    if (c2 == ',') {
                        bl5 = true;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') {
                        n3 = 3;
                        break;
                    }
                    if (c2 == ';') {
                        n3 = 4;
                        break;
                    }
                    n3 = -1;
                    break;
                }
                case 3: {
                    if (c2 == ',') {
                        bl5 = true;
                        break;
                    }
                    if (c2 == ';') {
                        n3 = 4;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') break;
                    n3 = -1;
                    break;
                }
                case 4: {
                    if (c2 == 'q') {
                        n3 = 5;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') break;
                    n3 = -1;
                    break;
                }
                case 5: {
                    if (c2 == '=') {
                        n3 = 6;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') break;
                    n3 = -1;
                    break;
                }
                case 6: {
                    if (c2 == '0') {
                        bl4 = false;
                        stringBuilder2.append(c2);
                        n3 = 7;
                        break;
                    }
                    if (c2 == '1') {
                        stringBuilder2.append(c2);
                        n3 = 7;
                        break;
                    }
                    if (c2 == '.') {
                        if (bl2) {
                            stringBuilder2.append(c2);
                            n3 = 8;
                            break;
                        }
                        n3 = -1;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') break;
                    n3 = -1;
                    break;
                }
                case 7: {
                    if (c2 == '.') {
                        stringBuilder2.append(c2);
                        n3 = 8;
                        break;
                    }
                    if (c2 == ',') {
                        bl5 = true;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') {
                        n3 = 10;
                        break;
                    }
                    n3 = -1;
                    break;
                }
                case 8: {
                    if ('0' <= c2 || c2 <= '9') {
                        if (bl4 && c2 != '0' && !bl2) {
                            n3 = -1;
                            break;
                        }
                        stringBuilder2.append(c2);
                        n3 = 9;
                        break;
                    }
                    n3 = -1;
                    break;
                }
                case 9: {
                    if ('0' <= c2 && c2 <= '9') {
                        if (bl4 && c2 != '0') {
                            n3 = -1;
                            break;
                        }
                        stringBuilder2.append(c2);
                        break;
                    }
                    if (c2 == ',') {
                        bl5 = true;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') {
                        n3 = 10;
                        break;
                    }
                    n3 = -1;
                    break;
                }
                case 10: {
                    if (c2 == ',') {
                        bl5 = true;
                        break;
                    }
                    if (c2 == ' ' || c2 == '\t') break;
                    n3 = -1;
                }
            }
            if (n3 == -1) {
                throw new ParseException("Invalid Accept-Language", n2);
            }
            if (!bl5) continue;
            double d2 = 1.0;
            if (stringBuilder2.length() != 0) {
                try {
                    d2 = Double.parseDouble(stringBuilder2.toString());
                }
                catch (NumberFormatException numberFormatException) {
                    d2 = 1.0;
                }
                if (d2 > 1.0) {
                    d2 = 1.0;
                }
            }
            if (stringBuilder.charAt(0) != '*') {
                int n4 = treeMap.size();
                dp dp2 = new dp(d2, n4);
                treeMap.put(dp2, new dn(dn.k(stringBuilder.toString())));
            }
            stringBuilder.setLength(0);
            stringBuilder2.setLength(0);
            n3 = 0;
        }
        if (n3 != 0) {
            throw new ParseException("Invalid AcceptlLanguage", n2);
        }
        dn[] arrdn = treeMap.values().toArray(new dn[treeMap.size()]);
        return arrdn;
    }

    public static dn j(dn dn2) {
        String string;
        String[] arrstring = new String[3];
        String string2 = null;
        int n2 = dn.a(dn2.H, arrstring);
        if (n2 < dn2.H.length()) {
            string2 = dn2.H.substring(n2);
        }
        return (string = dn.c(arrstring[0], arrstring[1], arrstring[2], string2)) == null ? dn2 : new dn(string);
    }

    public static dn k(dn dn2) {
        String string;
        String[] arrstring = new String[3];
        int n2 = dn.a(dn2.H, arrstring);
        String string2 = arrstring[0];
        String string3 = arrstring[1];
        String string4 = arrstring[2];
        String string5 = null;
        if (n2 < dn2.H.length()) {
            string5 = dn2.H.substring(n2);
        }
        if (dn.u(string = dn.c(string2, string3, string4, null))) {
            return dn2;
        }
        String string6 = dn.c(string2, null, null, null);
        if (string6.equals(string)) {
            String string7 = dn.a(string2, null, null, string5);
            return new dn(string7);
        }
        if (string4.length() != 0 && (string6 = dn.c(string2, null, string4, null)).equals(string)) {
            String string8 = dn.a(string2, null, string4, string5);
            return new dn(string8);
        }
        if (string4.length() != 0 && string3.length() != 0 && (string6 = dn.c(string2, string3, null, null)).equals(string)) {
            String string9 = dn.a(string2, string3, null, string5);
            return new dn(string9);
        }
        return dn2;
    }

    private static boolean u(String string) {
        return string == null || string.length() == 0;
    }

    private static void a(String string, StringBuilder stringBuilder) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('_');
        }
        stringBuilder.append(string);
    }

    private static String a(String string, String string2, String string3, String string4, String string5) {
        String string6;
        dd dd2 = null;
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        if (!dn.u(string)) {
            dn.a(string, stringBuilder);
        } else if (dn.u(string5)) {
            dn.a(R, stringBuilder);
        } else {
            dd2 = new dd(string5);
            string6 = dd2.a();
            dn.a(!dn.u(string6) ? string6 : R, stringBuilder);
        }
        if (!dn.u(string2)) {
            dn.a(string2, stringBuilder);
        } else if (!dn.u(string5)) {
            if (dd2 == null) {
                dd2 = new dd(string5);
            }
            if (!dn.u(string6 = dd2.b())) {
                dn.a(string6, stringBuilder);
            }
        }
        if (!dn.u(string3)) {
            dn.a(string3, stringBuilder);
            bl2 = true;
        } else if (!dn.u(string5)) {
            if (dd2 == null) {
                dd2 = new dd(string5);
            }
            if (!dn.u(string6 = dd2.c())) {
                dn.a(string6, stringBuilder);
                bl2 = true;
            }
        }
        if (string4 != null && string4.length() > 1) {
            int n2 = 0;
            if (string4.charAt(0) == '_') {
                if (string4.charAt(1) == '_') {
                    n2 = 2;
                }
            } else {
                n2 = 1;
            }
            if (bl2) {
                if (n2 == 2) {
                    stringBuilder.append(string4.substring(1));
                } else {
                    stringBuilder.append(string4);
                }
            } else {
                if (n2 == 1) {
                    stringBuilder.append('_');
                }
                stringBuilder.append(string4);
            }
        }
        return stringBuilder.toString();
    }

    static String a(String string, String string2, String string3, String string4) {
        return dn.a(string, string2, string3, string4, null);
    }

    private static int a(String string, String[] arrstring) {
        dd dd2 = new dd(string);
        String string2 = dd2.a();
        String string3 = dd2.b();
        String string4 = dd2.c();
        arrstring[0] = dn.u(string2) ? R : string2;
        arrstring[1] = string3.equals(S) ? B : string3;
        arrstring[2] = string4.equals(T) ? B : string4;
        String string5 = dd2.d();
        if (!dn.u(string5)) {
            int n2 = string.indexOf(string5);
            return n2 > 0 ? n2 - 1 : n2;
        }
        int n3 = string.indexOf(64);
        return n3 == -1 ? string.length() : n3;
    }

    private static String v(String string) {
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "likelySubtags");
        try {
            return dv2.getString(string);
        }
        catch (MissingResourceException missingResourceException) {
            return null;
        }
    }

    private static String c(String string, String string2, String string3, String string4) {
        String string5;
        String string6;
        if (!dn.u(string2) && !dn.u(string3) && (string6 = dn.v(string5 = dn.a(string, string2, string3, null))) != null) {
            return dn.a(null, null, null, string4, string6);
        }
        if (!dn.u(string2) && (string6 = dn.v(string5 = dn.a(string, string2, null, null))) != null) {
            return dn.a(null, null, string3, string4, string6);
        }
        if (!dn.u(string3) && (string6 = dn.v(string5 = dn.a(string, null, string3, null))) != null) {
            return dn.a(null, string2, null, string4, string6);
        }
        string5 = dn.a(string, null, null, null);
        string6 = dn.v(string5);
        if (string6 != null) {
            return dn.a(null, string2, string3, string4, string6);
        }
        return null;
    }

    public String a(char c2) {
        if (!com.ibm.icu.a.c.l.a(c2)) {
            throw new IllegalArgumentException("Invalid extension key: " + c2);
        }
        return this.F().b(Character.valueOf(c2));
    }

    public Set z() {
        return this.F().a();
    }

    public Set A() {
        return this.F().b();
    }

    public String p(String string) {
        if (!com.ibm.icu.a.c.l.b(string)) {
            throw new IllegalArgumentException("Invalid Unicode locale key: " + string);
        }
        return this.F().a(string);
    }

    public Set B() {
        return this.F().c();
    }

    public String C() {
        Object object;
        c c2 = this.E();
        l l2 = this.F();
        if (c2.d().equalsIgnoreCase("POSIX")) {
            c2 = com.ibm.icu.a.c.c.a(c2.a(), c2.b(), c2.c(), B);
            if (l2.a("va") == null) {
                object = new h();
                try {
                    ((h)object).a(com.ibm.icu.a.c.c.b, l2);
                    ((h)object).a("va", "posix");
                    l2 = ((h)object).d();
                }
                catch (o o2) {
                    throw new RuntimeException(o2);
                }
            }
        }
        object = com.ibm.icu.a.c.k.a(c2, l2);
        StringBuilder stringBuilder = new StringBuilder();
        String string = ((k)object).a();
        if (string.length() > 0) {
            stringBuilder.append(com.ibm.icu.a.c.k.j(string));
        }
        if ((string = ((k)object).c()).length() > 0) {
            stringBuilder.append("-");
            stringBuilder.append(com.ibm.icu.a.c.k.l(string));
        }
        if ((string = ((k)object).d()).length() > 0) {
            stringBuilder.append("-");
            stringBuilder.append(com.ibm.icu.a.c.k.m(string));
        }
        List list = ((k)object).e();
        for (String string2 : list) {
            stringBuilder.append("-");
            stringBuilder.append(com.ibm.icu.a.c.k.n(string2));
        }
        list = ((k)object).f();
        for (String string2 : list) {
            stringBuilder.append("-");
            stringBuilder.append(com.ibm.icu.a.c.k.o(string2));
        }
        string = ((k)object).g();
        if (string.length() > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("-");
            }
            stringBuilder.append("x").append("-");
            stringBuilder.append(com.ibm.icu.a.c.k.r(string));
        }
        return stringBuilder.toString();
    }

    public static dn q(String string) {
        k k2 = com.ibm.icu.a.c.k.a(string, null);
        h h2 = new h();
        h2.a(k2);
        return dn.b(h2.c(), h2.d());
    }

    private static dn b(c c2, l l2) {
        String string = dn.b(c2.a(), c2.b(), c2.c(), c2.d());
        Set set = l2.a();
        if (!set.isEmpty()) {
            Object object;
            Object object2;
            TreeMap<String, String> treeMap = new TreeMap<String, String>();
            for (Object object3 : set) {
                g g2 = l2.a((Character)object3);
                if (g2 instanceof r) {
                    String string2;
                    Object object4;
                    CharSequence charSequence;
                    object2 = (r)g2;
                    object = ((r)object2).e();
                    Object object5 = object.iterator();
                    while (object5.hasNext()) {
                        charSequence = (String)object5.next();
                        object4 = ((r)object2).a((String)charSequence);
                        string2 = dn.x((String)charSequence);
                        String string3 = dn.n(string2, (String)(((String)object4).length() == 0 ? "yes" : object4));
                        if (string2.equals("va") && string3.equals("posix") && c2.d().length() == 0) {
                            string = string + "_POSIX";
                            continue;
                        }
                        treeMap.put(string2, string3);
                    }
                    object5 = ((r)object2).d();
                    if (object5.size() <= 0) continue;
                    charSequence = new StringBuilder();
                    object4 = object5.iterator();
                    while (object4.hasNext()) {
                        string2 = (String)object4.next();
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append('-');
                        }
                        ((StringBuilder)charSequence).append(string2);
                    }
                    treeMap.put(E, ((StringBuilder)charSequence).toString());
                    continue;
                }
                treeMap.put(String.valueOf(object3), g2.b());
            }
            if (!treeMap.isEmpty()) {
                Object object3;
                StringBuilder stringBuilder = new StringBuilder(string);
                stringBuilder.append("@");
                object3 = treeMap.entrySet();
                boolean bl2 = false;
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object = (Map.Entry)object2.next();
                    if (bl2) {
                        stringBuilder.append(";");
                    } else {
                        bl2 = true;
                    }
                    stringBuilder.append((String)object.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)object.getValue());
                }
                string = stringBuilder.toString();
            }
        }
        return new dn(string);
    }

    private c E() {
        if (this.I == null) {
            String string = this.f();
            if (this.equals(v)) {
                string = B;
            }
            this.I = com.ibm.icu.a.c.c.a(string, this.g(), this.h(), this.i());
        }
        return this.I;
    }

    private l F() {
        if (this.J == null) {
            Iterator iterator = this.m();
            if (iterator == null) {
                this.J = com.ibm.icu.a.c.l.a;
            } else {
                h h2 = new h();
                while (iterator.hasNext()) {
                    Object object;
                    String string = (String)iterator.next();
                    if (string.equals(E)) {
                        for (String string2 : object = this.j(string).split("[-_]")) {
                            try {
                                h2.e(string2);
                            }
                            catch (o o2) {
                                // empty catch block
                            }
                        }
                        continue;
                    }
                    if (string.length() >= 2) {
                        object = dn.w(string);
                        String string3 = dn.m(string, this.j(string));
                        if (object == null || string3 == null) continue;
                        try {
                            h2.a((String)object, string3);
                        }
                        catch (o o3) {}
                        continue;
                    }
                    if (string.length() != 1 || string.charAt(0) == 'u') continue;
                    try {
                        h2.a(string.charAt(0), this.j(string).replace("_", "-"));
                    }
                    catch (o o4) {
                    }
                }
                this.J = h2.d();
            }
        }
        return this.J;
    }

    private static String w(String string) {
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "keyTypeData", bc.n);
        dv dv3 = dv2.l("keyMap");
        string = com.ibm.icu.a.c.a.a(string);
        String string2 = null;
        try {
            string2 = dv3.getString(string);
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        if (string2 == null) {
            if (string.length() == 2 && com.ibm.icu.a.c.k.g(string)) {
                return string;
            }
            return null;
        }
        return string2;
    }

    private static String x(String string) {
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "keyTypeData", bc.n);
        dv dv3 = dv2.l("keyMap");
        string = com.ibm.icu.a.c.a.a(string);
        String string2 = null;
        for (int i2 = 0; i2 < dv3.w(); ++i2) {
            dv dv4 = dv3.k(i2);
            if (!string.equals(dv4.A())) continue;
            string2 = dv4.k();
            break;
        }
        if (string2 == null) {
            return string;
        }
        return string2;
    }

    private static String m(String string, String string2) {
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "keyTypeData", bc.n);
        dv dv3 = dv2.l("typeMap");
        string = com.ibm.icu.a.c.a.a(string);
        dv dv4 = null;
        String string3 = null;
        String string4 = string.equals("timezone") ? string2.replace('/', ':') : string2;
        try {
            dv4 = dv3.l(string);
            string3 = dv4.getString(string4);
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        if (string3 == null && dv4 != null) {
            dv dv5 = dv2.l("typeAlias");
            try {
                dv dv6 = dv5.l(string);
                string4 = dv6.getString(string4);
                string3 = dv4.getString(string4.replace('/', ':'));
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
        }
        if (string3 == null) {
            int n2 = string2.length();
            if (n2 >= 3 && n2 <= 8 && com.ibm.icu.a.c.k.g(string2)) {
                return string2;
            }
            return null;
        }
        return string3;
    }

    private static String n(String string, String string2) {
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "keyTypeData", bc.n);
        dv dv3 = dv2.l("typeMap");
        string = com.ibm.icu.a.c.a.a(string);
        string2 = com.ibm.icu.a.c.a.a(string2);
        String string3 = null;
        try {
            dv dv4 = dv3.l(string);
            for (int i2 = 0; i2 < dv4.w(); ++i2) {
                dv dv5 = dv4.k(i2);
                if (!string2.equals(dv5.A())) continue;
                string3 = dv5.k();
                if (string.equals("timezone")) {
                    string3 = string3.replace(':', '/');
                }
                break;
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        if (string3 == null) {
            return string2;
        }
        return string3;
    }

    static /* synthetic */ c l(dn dn2) {
        return dn2.E();
    }

    static /* synthetic */ l m(dn dn2) {
        return dn2.F();
    }

    static /* synthetic */ dn a(c c2, l l2) {
        return dn.b(c2, l2);
    }

    static /* synthetic */ String r(String string) {
        return dn.x(string);
    }

    static /* synthetic */ String l(String string, String string2) {
        return dn.n(string, string2);
    }

    /* synthetic */ dn(String string, Locale locale, do do_) {
        this(string, locale);
    }

    static {
        p = o = new dn("zh_Hans_CN", Locale.CHINA);
        q = new dn("zh_Hant_TW", Locale.TAIWAN);
        r = new dn("en_GB", Locale.UK);
        s = new dn("en_US", Locale.US);
        t = new dn("en_CA", Locale.CANADA);
        u = new dn("fr_CA", Locale.CANADA_FRENCH);
        D = new Locale(B, B);
        v = new dn(B, D);
        F = new ew();
        M = new ew();
        N = Locale.getDefault();
        P = new Locale[dr.values().length];
        Q = new dn[dr.values().length];
        O = dn.a(N);
        if (ds.a()) {
            for (dr dr3 : dr.values()) {
                int n3 = dr3.ordinal();
                dn.P[n3] = ds.a(dr3);
                dn.Q[n3] = dn.a(P[n3]);
            }
        } else {
            String object;
            if (ds.b(N) && (object = ds.a("user.script")) != null && com.ibm.icu.a.c.k.c(object)) {
                c c2 = O.E();
                c c3 = com.ibm.icu.a.c.c.a(c2.a(), object, c2.c(), c2.d());
                O = dn.b(c3, O.F());
            }
            for (dr dr2 : dr.values()) {
                int n2 = dr2.ordinal();
                dn.P[n2] = N;
                dn.Q[n2] = O;
            }
        }
        w = new du(null);
        x = new du(null);
    }
}

