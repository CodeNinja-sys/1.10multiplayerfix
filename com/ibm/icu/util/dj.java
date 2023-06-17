/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.af;
import com.ibm.icu.a.ak;
import com.ibm.icu.a.cp;
import com.ibm.icu.a.dz;
import com.ibm.icu.a.fj;
import com.ibm.icu.a.je;
import com.ibm.icu.d.kc;
import com.ibm.icu.d.ki;
import com.ibm.icu.d.kj;
import com.ibm.icu.d.kl;
import com.ibm.icu.d.ks;
import com.ibm.icu.util.az;
import com.ibm.icu.util.cd;
import com.ibm.icu.util.cq;
import com.ibm.icu.util.dk;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Logger;

public abstract class dj
implements az,
Serializable,
Cloneable {
    private static final Logger a = Logger.getLogger("com.ibm.icu.util.TimeZone");
    private static final long b = -744942128318337471L;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 7;
    public static final String u = "Etc/Unknown";
    static final String v = "Etc/GMT";
    public static final dj w = new cq(0, "Etc/Unknown").g();
    public static final dj x = new cq(0, "Etc/GMT").g();
    private String c;
    private static dj d = null;
    private static String e = null;
    private static int f = 0;
    private static final String g = "com.ibm.icu.util.TimeZone.DefaultTimeZoneType";
    private static final String h = "ICU";
    private static final String i = "JDK";

    public dj() {
    }

    protected dj(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.c = string;
    }

    public abstract int a(int var1, int var2, int var3, int var4, int var5, int var6);

    public int c(long l2) {
        int[] arrn = new int[2];
        this.a(l2, false, arrn);
        return arrn[0] + arrn[1];
    }

    public void a(long l2, boolean bl2, int[] arrn) {
        arrn[0] = this.a();
        if (!bl2) {
            l2 += (long)arrn[0];
        }
        int[] arrn2 = new int[6];
        int n2 = 0;
        while (true) {
            af.b(l2, arrn2);
            arrn[1] = this.a(1, arrn2[0], arrn2[1], arrn2[2], arrn2[3], arrn2[5]) - arrn[0];
            if (n2 != 0 || !bl2 || arrn[1] == 0) break;
            l2 -= (long)arrn[1];
            ++n2;
        }
    }

    public abstract void a(int var1);

    public abstract int a();

    public String l() {
        return this.c;
    }

    public void a_(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen TimeZone instance.");
        }
        this.c = string;
    }

    public final String m() {
        return this.a(3, false, dn.a(dr.a));
    }

    public final String a(Locale locale) {
        return this.a(3, false, dn.a(locale));
    }

    public final String a(dn dn2) {
        return this.a(3, false, dn2);
    }

    public final String a(boolean bl2, int n2) {
        return this.a(bl2, n2, dn.a(dr.a));
    }

    public String a(boolean bl2, int n2, Locale locale) {
        return this.a(bl2, n2, dn.a(locale));
    }

    public String a(boolean bl2, int n2, dn dn2) {
        if (n2 < 0 || n2 > 7) {
            throw new IllegalArgumentException("Illegal style: " + n2);
        }
        return this.a(n2, bl2, dn2);
    }

    private String a(int n2, boolean bl2, dn dn2) {
        if (dn2 == null) {
            throw new NullPointerException("locale is null");
        }
        String string = null;
        if (n2 == 7 || n2 == 3 || n2 == 2) {
            kc kc2 = kc.a(dn2);
            long l2 = System.currentTimeMillis();
            cd cd2 = new cd((Object)kj.a);
            switch (n2) {
                case 7: {
                    string = kc2.a(ki.a, this, l2, cd2);
                    break;
                }
                case 3: {
                    string = kc2.a(ki.b, this, l2, cd2);
                    break;
                }
                case 2: {
                    string = kc2.a(ki.c, this, l2, cd2);
                }
            }
            if (bl2 && cd2.a == kj.b || !bl2 && cd2.a == kj.c) {
                int n3 = bl2 ? this.a() + this.d() : this.a();
                string = n2 == 2 ? kc2.b(n3) : kc2.a(n3);
            }
        } else if (n2 == 5 || n2 == 4) {
            kc kc3 = kc.a(dn2);
            int n4 = bl2 && this.b() ? this.a() + this.d() : this.a();
            switch (n2) {
                case 5: {
                    string = kc3.a(n4);
                    break;
                }
                case 4: {
                    string = kc3.a(n4, false, false, false);
                }
            }
        } else {
            assert (n2 == 1 || n2 == 0 || n2 == 6);
            long l3 = System.currentTimeMillis();
            kl kl2 = kl.a(dn2);
            ks ks2 = null;
            switch (n2) {
                case 1: {
                    ks2 = bl2 ? ks.c : ks.b;
                    break;
                }
                case 0: 
                case 6: {
                    ks2 = bl2 ? ks.f : ks.e;
                }
            }
            string = kl2.a(je.a(this), ks2, l3);
            if (string == null) {
                kc kc4 = kc.a(dn2);
                int n5 = bl2 && this.b() ? this.a() + this.d() : this.a();
                String string2 = string = n2 == 1 ? kc4.a(n5) : kc4.b(n5);
            }
        }
        assert (string != null);
        return string;
    }

    public int d() {
        if (this.b()) {
            return 3600000;
        }
        return 0;
    }

    public abstract boolean b();

    public boolean c() {
        return this.b() || this.a(new Date());
    }

    public abstract boolean a(Date var1);

    public static dj b(String string) {
        return dj.a(string, f, false);
    }

    public static dj c(String string) {
        return dj.a(string, f, true);
    }

    public static dj a(String string, int n2) {
        return dj.a(string, n2, false);
    }

    private static synchronized dj a(String string, int n2, boolean bl2) {
        dj dj2;
        if (n2 == 1) {
            dj2 = cp.a(string);
            if (dj2 != null) {
                return bl2 ? dj2.g() : dj2;
            }
        } else {
            if (string == null) {
                throw new NullPointerException();
            }
            dj2 = je.e(string);
        }
        if (dj2 == null) {
            dj2 = je.f(string);
        }
        if (dj2 == null) {
            a.fine("\"" + string + "\" is a bogus id so timezone is falling back to Etc/Unknown(GMT).");
            dj2 = w;
        }
        return bl2 ? dj2 : dj2.h();
    }

    public static synchronized void d(int n2) {
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException("Invalid timezone type");
        }
        f = n2;
    }

    public static int n() {
        return f;
    }

    public static Set a(dk dk2, String string, Integer n2) {
        return je.a(dk2, string, n2);
    }

    public static String[] e(int n2) {
        Set set = dj.a(dk.a, null, n2);
        return set.toArray(new String[0]);
    }

    public static String[] d(String string) {
        Set set = dj.a(dk.a, string, null);
        return set.toArray(new String[0]);
    }

    public static String[] o() {
        Set set = dj.a(dk.a, null, null);
        return set.toArray(new String[0]);
    }

    public static int e(String string) {
        return je.a(string);
    }

    public static String b(String string, int n2) {
        return je.a(string, n2);
    }

    public static synchronized dj p() {
        if (d == null) {
            if (f == 1) {
                d = new cp();
            } else {
                TimeZone timeZone = TimeZone.getDefault();
                d = dj.c(timeZone.getID());
            }
        }
        return d.h();
    }

    public static synchronized void b(dj dj2) {
        d = dj2;
        TimeZone timeZone = null;
        if (d instanceof cp) {
            timeZone = ((cp)d).e();
        } else if (dj2 != null) {
            String string;
            if (dj2 instanceof dz && !(string = dj2.l()).equals((timeZone = TimeZone.getTimeZone(string)).getID())) {
                timeZone = null;
            }
            if (timeZone == null) {
                timeZone = fj.a(dj2);
            }
        }
        TimeZone.setDefault(timeZone);
    }

    public boolean a(dj dj2) {
        return dj2 != null && this.a() == dj2.a() && this.b() == dj2.b();
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.h();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.c.equals(((dj)object).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public static synchronized String q() {
        if (e == null) {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "zoneinfo64");
            e = dv2.getString("TZVersion");
        }
        return e;
    }

    public static String f(String string) {
        return dj.a(string, null);
    }

    public static String a(String string, boolean[] arrbl) {
        String string2 = null;
        boolean bl2 = false;
        if (string != null && string.length() != 0) {
            if (string.equals("Etc/Unknown")) {
                string2 = "Etc/Unknown";
                bl2 = false;
            } else {
                string2 = je.b(string);
                if (string2 != null) {
                    bl2 = true;
                } else {
                    string2 = je.g(string);
                }
            }
        }
        if (arrbl != null) {
            arrbl[0] = bl2;
        }
        return string2;
    }

    public static String g(String string) {
        String string2 = null;
        if (!string.equals("Etc/Unknown")) {
            string2 = je.c(string);
        }
        if (string2 == null) {
            throw new IllegalArgumentException("Unknown system zone id: " + string);
        }
        return string2;
    }

    public boolean f() {
        return false;
    }

    public dj g() {
        throw new UnsupportedOperationException("Needs to be implemented by the subclass.");
    }

    public dj h() {
        try {
            dj dj2 = (dj)super.clone();
            return dj2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }

    static {
        String string = ak.a("com.ibm.icu.util.TimeZone.DefaultTimeZoneType", "ICU");
        if (string.equalsIgnoreCase("JDK")) {
            f = 1;
        }
    }
}

