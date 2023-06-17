/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.ar;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.a.fd;
import com.ibm.icu.a.fi;
import com.ibm.icu.d.cn;
import com.ibm.icu.d.cp;
import com.ibm.icu.d.cq;
import com.ibm.icu.d.cr;
import com.ibm.icu.util.al;
import com.ibm.icu.util.am;
import com.ibm.icu.util.an;
import com.ibm.icu.util.cc;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;

public class aj
extends cc
implements Serializable {
    private static final long d = -5839973855554750484L;
    private static final boolean e = ar.b("currency");
    private static com.ibm.icu.a.aj f = new ew();
    private String g;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static an h;
    private static final String i = "EUR";
    private static final com.ibm.icu.a.aj j;
    private static final dn k;
    private static final String[] l;
    private static final int[] m;
    private static SoftReference n;
    private static SoftReference o;

    private static an j() {
        if (h == null) {
            try {
                Class<?> class_ = Class.forName("com.ibm.icu.util.ap");
                h = (an)class_.newInstance();
            }
            catch (Exception exception) {
                if (e) {
                    exception.printStackTrace();
                }
                throw new RuntimeException(exception.getMessage());
            }
        }
        return h;
    }

    public static aj a(Locale locale) {
        return aj.a(dn.a(locale));
    }

    public static aj a(dn dn2) {
        String string = dn2.j("currency");
        if (string != null) {
            return aj.a(string);
        }
        if (h == null) {
            return aj.b(dn2);
        }
        return h.a(dn2);
    }

    public static String[] a(dn dn2, Date date) {
        cr cr2 = cr.a(date).c(dn2.h());
        List list = aj.a(cr2);
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(new String[list.size()]);
    }

    public static Set a() {
        cp cp2 = cp.a();
        List list = cp2.b(cr.a());
        HashSet<aj> hashSet = new HashSet<aj>(list.size());
        for (String string : list) {
            hashSet.add(new aj(string));
        }
        return hashSet;
    }

    static aj b(dn dn2) {
        String string = dn2.i();
        if ("EURO".equals(string)) {
            return new aj(i);
        }
        String string2 = (String)j.a(dn2);
        if (string2 == null) {
            String string3 = dn2.h();
            cp cp2 = cp.a();
            List list = cp2.b(cr.a(string3));
            if (list.size() > 0) {
                string2 = (String)list.get(0);
                boolean bl2 = "PREEURO".equals(string);
                if (bl2 && i.equals(string2)) {
                    if (list.size() < 2) {
                        return null;
                    }
                    string2 = (String)list.get(1);
                }
            } else {
                return null;
            }
            j.a(dn2, string2);
        }
        return new aj(string2);
    }

    public static aj a(String string) {
        if (string == null) {
            throw new NullPointerException("The input currency code is null.");
        }
        if (!aj.b(string)) {
            throw new IllegalArgumentException("The input currency code is not 3-letter alphabetic code.");
        }
        return new aj(string.toUpperCase(Locale.ENGLISH));
    }

    private static boolean b(String string) {
        if (string.length() != 3) {
            return false;
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= 'A' && (c2 <= 'Z' || c2 >= 'a') && c2 <= 'z') continue;
            return false;
        }
        return true;
    }

    public static Object a(aj aj2, dn dn2) {
        return aj.j().a(aj2, dn2);
    }

    public static boolean a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("registryKey must not be null");
        }
        if (h == null) {
            return false;
        }
        return h.a(object);
    }

    public static Locale[] b() {
        if (h == null) {
            return bc.f();
        }
        return h.b();
    }

    public static dn[] c() {
        if (h == null) {
            return bc.e();
        }
        return h.a();
    }

    public static final String[] a(String string, dn dn2, boolean bl2) {
        List list;
        Object object;
        if (!"currency".equals(string)) {
            return l;
        }
        if (!bl2) {
            return aj.k().toArray(new String[0]);
        }
        String string2 = dn2.h();
        if (string2.length() == 0) {
            if (k.equals(dn2)) {
                return l;
            }
            object = dn.j(dn2);
            string2 = ((dn)object).h();
        }
        if ((list = aj.a((cr)(object = cr.b().c(string2)))).size() == 0) {
            return l;
        }
        return list.toArray(new String[list.size()]);
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        try {
            aj aj2 = (aj)object;
            return this.g.equals(aj2.g);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public String d() {
        return this.g;
    }

    public int e() {
        int n2 = 0;
        try {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "currencyNumericCodes", bc.n);
            dv dv3 = dv2.l("codeMap");
            dv dv4 = dv3.l(this.g);
            n2 = dv4.x();
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        return n2;
    }

    public String f() {
        return this.c(dn.a(dr.a));
    }

    public String b(Locale locale) {
        return this.c(dn.a(locale));
    }

    public String c(dn dn2) {
        return this.a(dn2, 0, new boolean[1]);
    }

    public String a(Locale locale, int n2, boolean[] arrbl) {
        return this.a(dn.a(locale), n2, arrbl);
    }

    public String a(dn dn2, int n2, boolean[] arrbl) {
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException("bad name style: " + n2);
        }
        if (arrbl != null) {
            arrbl[0] = false;
        }
        cn cn2 = cn.a(dn2);
        return n2 == 0 ? cn2.c(this.g) : cn2.b(this.g);
    }

    public String a(Locale locale, int n2, String string, boolean[] arrbl) {
        return this.a(dn.a(locale), n2, string, arrbl);
    }

    public String a(dn dn2, int n2, String string, boolean[] arrbl) {
        if (n2 != 2) {
            return this.a(dn2, n2, arrbl);
        }
        if (arrbl != null) {
            arrbl[0] = false;
        }
        cn cn2 = cn.a(dn2);
        return cn2.a(this.g, string);
    }

    public String g() {
        return this.a(Locale.getDefault(), 1, null);
    }

    public String c(Locale locale) {
        return this.a(locale, 1, null);
    }

    public static String a(dn dn2, String string, int n2, ParsePosition parsePosition) {
        String string2;
        Object object;
        ArrayList<fd> arrayList = (ArrayList<fd>)f.a(dn2);
        if (arrayList == null) {
            fd fd2 = new fd(true);
            object = new fd(false);
            arrayList = new ArrayList<fd>();
            arrayList.add((fd)object);
            arrayList.add(fd2);
            aj.a(dn2, arrayList);
            f.a(dn2, arrayList);
        }
        int n3 = 0;
        object = null;
        fd fd3 = (fd)arrayList.get(1);
        al al2 = new al(null);
        fd3.a((CharSequence)string, parsePosition.getIndex(), (fi)al2);
        List list = al2.a();
        if (list != null && list.size() != 0) {
            for (Object object2 : list) {
                Object object3 = am.a((am)object2);
                string2 = am.b((am)object2);
                if (string2.length() <= n3) continue;
                n3 = string2.length();
                object = object3;
            }
        }
        if (n2 != 1) {
            fd fd4 = (fd)arrayList.get(0);
            al2 = new al(null);
            fd4.a((CharSequence)string, parsePosition.getIndex(), (fi)al2);
            list = al2.a();
            if (list != null && list.size() != 0) {
                for (Object object3 : list) {
                    string2 = am.a((am)object3);
                    String string3 = am.b((am)object3);
                    if (string3.length() <= n3) continue;
                    n3 = string3.length();
                    object = string2;
                }
            }
        }
        int n4 = parsePosition.getIndex();
        parsePosition.setIndex(n4 + n3);
        return object;
    }

    private static void a(dn dn2, List list) {
        String string;
        String string2;
        fd fd2 = (fd)list.get(0);
        fd fd3 = (fd)list.get(1);
        cn cn2 = cn.a(dn2);
        for (Map.Entry entry : cn2.c().entrySet()) {
            string2 = (String)entry.getKey();
            string = (String)entry.getValue();
            fd2.a((CharSequence)string2, new am(string, string2));
        }
        for (Map.Entry entry : cn2.d().entrySet()) {
            string2 = (String)entry.getKey();
            string = (String)entry.getValue();
            fd3.a((CharSequence)string2, new am(string, string2));
        }
    }

    public int h() {
        cp cp2 = cp.a();
        cq cq2 = cp2.a(this.g);
        return cq2.a;
    }

    public double i() {
        cp cp2 = cp.a();
        cq cq2 = cp2.a(this.g);
        int n2 = cq2.b;
        if (n2 == 0) {
            return 0.0;
        }
        int n3 = cq2.a;
        if (n3 < 0 || n3 >= m.length) {
            return 0.0;
        }
        return (double)n2 / (double)m[n3];
    }

    public String toString() {
        return this.g;
    }

    protected aj(String string) {
        this.g = string;
    }

    private static synchronized List k() {
        List list;
        List list2 = list = n == null ? null : (List)n.get();
        if (list == null) {
            cr cr2 = cr.a();
            list = Collections.unmodifiableList(aj.a(cr2));
            n = new SoftReference(list);
        }
        return list;
    }

    private static synchronized Set l() {
        Set set;
        Set set2 = set = o == null ? null : (Set)o.get();
        if (set == null) {
            cp cp2 = cp.a();
            set = Collections.unmodifiableSet(new HashSet(cp2.b(cr.a())));
            o = new SoftReference(set);
        }
        return set;
    }

    public static boolean a(String string, Date date, Date date2) {
        if (!aj.b(string)) {
            return false;
        }
        if (date != null && date2 != null && date.after(date2)) {
            throw new IllegalArgumentException("To is before from");
        }
        string = string.toUpperCase(Locale.ENGLISH);
        boolean bl2 = aj.l().contains(string);
        if (!bl2) {
            return false;
        }
        if (date == null && date2 == null) {
            return true;
        }
        cp cp2 = cp.a();
        List list = cp2.b(cr.a(date, date2).d(string));
        return list.contains(string);
    }

    private static List a(cr cr2) {
        cp cp2 = cp.a();
        return cp2.b(cr2.d());
    }

    static {
        j = new ew();
        k = new dn("und");
        l = new String[0];
        m = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    }
}

