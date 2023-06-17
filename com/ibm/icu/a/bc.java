/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.am;
import com.ibm.icu.a.ar;
import com.ibm.icu.a.bd;
import com.ibm.icu.a.bf;
import com.ibm.icu.a.bg;
import com.ibm.icu.a.bo;
import com.ibm.icu.a.bp;
import com.ibm.icu.a.d;
import com.ibm.icu.a.ew;
import com.ibm.icu.a.jd;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import com.ibm.icu.util.dy;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.StringTokenizer;

public class bc
extends dv {
    protected static final String a = "com/ibm/icu/impl/";
    public static final String b = "data/icudt51b";
    public static final String c = "com/ibm/icu/impl/data/icudt51b";
    public static final String d = "com/ibm/icu/impl/data/icudt51b/coll";
    public static final String e = "/brkitr";
    public static final String f = "com/ibm/icu/impl/data/icudt51b/brkitr";
    public static final String g = "com/ibm/icu/impl/data/icudt51b/rbnf";
    public static final String h = "com/ibm/icu/impl/data/icudt51b/translit";
    public static final String i = "com/ibm/icu/impl/data/icudt51b/lang";
    public static final String j = "com/ibm/icu/impl/data/icudt51b/curr";
    public static final String k = "com/ibm/icu/impl/data/icudt51b/region";
    public static final String l = "com/ibm/icu/impl/data/icudt51b/zone";
    private static final String I = "\u2205\u2205\u2205";
    protected String m;
    public static final ClassLoader n;
    protected static final String o = "InstalledLocales";
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    private int Q = -1;
    private static final String R = "res_index";
    private static final String S = "default";
    private static final String T = "fullLocaleNames.lst";
    private static final boolean U;
    private static d V;
    protected String t;
    protected String u;
    protected dn v;
    protected ClassLoader w;
    protected bp x;
    protected String y;
    protected int z;
    public static final int A = -1;
    public static final int B = 3;
    public static final int C = 4;
    public static final int D = 5;
    public static final int E = 6;
    public static final int F = 9;
    private static final int[] W;
    private static final char X = '/';
    private static final String Y = "/";
    private static final String Z = "ICUDATA";
    private static final char aa = '-';
    private static final String ab = "LOCALE";
    protected aj G;
    private static final int ac = 64;

    public void a(int n2) {
        this.Q = n2;
    }

    public int a() {
        return this.Q;
    }

    public void a(String string) {
        String string2 = this.g();
        if (string2.equals("root")) {
            this.a(2);
        } else if (string2.equals(string)) {
            this.a(4);
        } else {
            this.a(1);
        }
    }

    public String b() {
        return this.m;
    }

    public static final dn a(String string, ClassLoader classLoader, String string2, String string3, dn dn2, boolean[] arrbl, boolean bl2) {
        Object object;
        String string4 = dn2.j(string3);
        String string5 = dn2.k();
        String string6 = null;
        dn dn3 = new dn(string5);
        dn dn4 = null;
        boolean bl3 = false;
        dn dn5 = null;
        int n2 = 0;
        int n3 = 0;
        if (string4 == null || string4.length() == 0 || string4.equals(S)) {
            string4 = "";
            bl3 = true;
        }
        bc bc2 = null;
        bc2 = (bc)dv.a(string, dn3);
        if (arrbl != null) {
            arrbl[0] = false;
            object = bc.o(string, classLoader).a();
            for (int i2 = 0; i2 < ((dn[])object).length; ++i2) {
                if (!dn3.equals(object[i2])) continue;
                arrbl[0] = true;
                break;
            }
        }
        do {
            try {
                object = (dn[])bc2.l(string2);
                string6 = ((ResourceBundle)object).getString(S);
                if (bl3) {
                    string4 = string6;
                    bl3 = false;
                }
                dn4 = bc2.i();
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (dn4 != null) continue;
            bc2 = (bc)bc2.j();
            ++n2;
        } while (bc2 != null && dn4 == null);
        dn3 = new dn(string5);
        bc2 = (bc)dv.a(string, dn3);
        do {
            try {
                object = (bc)bc2.l(string2);
                ((dv)object).l(string4);
                dn5 = ((bc)object).i();
                if (dn5 != null && n3 > n2) {
                    string6 = ((ResourceBundle)object).getString(S);
                    dn4 = bc2.i();
                    n2 = n3;
                }
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (dn5 != null) continue;
            bc2 = (bc)bc2.j();
            ++n3;
        } while (bc2 != null && dn5 == null);
        if (dn5 == null && string6 != null && !string6.equals(string4)) {
            string4 = string6;
            dn3 = new dn(string5);
            bc2 = (bc)dv.a(string, dn3);
            n3 = 0;
            do {
                try {
                    object = (bc)bc2.l(string2);
                    dv dv2 = ((dv)object).l(string4);
                    dn5 = bc2.i();
                    if (!dn5.toString().equals(dv2.getLocale().toString())) {
                        dn5 = null;
                    }
                    if (dn5 != null && n3 > n2) {
                        string6 = ((ResourceBundle)object).getString(S);
                        dn4 = bc2.i();
                        n2 = n3;
                    }
                }
                catch (MissingResourceException missingResourceException) {
                    // empty catch block
                }
                if (dn5 != null) continue;
                bc2 = (bc)bc2.j();
                ++n3;
            } while (bc2 != null && dn5 == null);
        }
        if (dn5 == null) {
            throw new MissingResourceException("Could not find locale containing requested or default keyword.", string, string3 + "=" + string4);
        }
        if (bl2 && string6.equals(string4) && n3 <= n2) {
            return dn5;
        }
        return new dn(dn5.toString() + "@" + string3 + "=" + string4);
    }

    public static final String[] a(String string, String string2) {
        HashSet<String> hashSet = new HashSet<String>();
        dn[] arrdn = bc.i(string, n);
        for (int i2 = 0; i2 < arrdn.length; ++i2) {
            try {
                dv dv2 = dv.a(string, arrdn[i2]);
                bc bc2 = (bc)dv2.getObject(string2);
                Enumeration enumeration = bc2.getKeys();
                while (enumeration.hasMoreElements()) {
                    String string3 = (String)enumeration.nextElement();
                    if (S.equals(string3)) continue;
                    hashSet.add(string3);
                }
                continue;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return hashSet.toArray(new String[0]);
    }

    public bc b(String string) {
        bc bc2 = null;
        bc bc3 = this;
        bc2 = bc.a(string, bc3, null);
        if (bc2 == null) {
            throw new MissingResourceException("Can't find resource for bundle " + this.getClass().getName() + ", key " + this.l(), string, this.k());
        }
        if (bc2.l() == 0 && bc2.A().equals(I)) {
            throw new MissingResourceException("Encountered NO_INHERITANCE_MARKER", string, this.k());
        }
        return bc2;
    }

    public bc b(int n2) {
        return (bc)this.a(n2, null, (dv)this);
    }

    public bc c(String string) {
        if (this instanceof bo) {
            return (bc)this.b(string, null, this);
        }
        return null;
    }

    public bc c(int n2) {
        return (bc)super.h(n2);
    }

    public bc d(String string) {
        return (bc)super.j(string);
    }

    public bc e(String string) {
        return bc.a(string, this, null);
    }

    public String f(String string) {
        return this.b(string).A();
    }

    public static Set a(String string, ClassLoader classLoader) {
        return bc.o(string, classLoader).c();
    }

    public static Set c() {
        return bc.b(c, n);
    }

    public static Set b(String string, ClassLoader classLoader) {
        return bc.o(string, classLoader).d();
    }

    public static Set d() {
        return bc.a(c, n);
    }

    public static final dn[] c(String string, ClassLoader classLoader) {
        return bc.o(string, classLoader).a();
    }

    public static final dn[] e() {
        return bc.c(c, n);
    }

    public static final Locale[] d(String string, ClassLoader classLoader) {
        return bc.o(string, classLoader).b();
    }

    public static final Locale[] f() {
        return bc.o(c, n).b();
    }

    public static final Locale[] a(dn[] arrdn) {
        ArrayList<Locale> arrayList = new ArrayList<Locale>(arrdn.length);
        HashSet<Locale> hashSet = new HashSet<Locale>();
        for (int i2 = 0; i2 < arrdn.length; ++i2) {
            Locale locale = arrdn[i2].a();
            if (hashSet.contains(locale)) continue;
            arrayList.add(locale);
            hashSet.add(locale);
        }
        return arrayList.toArray(new Locale[arrayList.size()]);
    }

    public Locale getLocale() {
        return this.i().a();
    }

    private static final dn[] i(String string, ClassLoader classLoader) {
        bc bc2 = (bc)dv.d(string, R, classLoader, true);
        bc2 = (bc)bc2.l(o);
        int n2 = bc2.w();
        int n3 = 0;
        dn[] arrdn = new dn[n2];
        dy dy2 = bc2.D();
        dy2.c();
        while (dy2.d()) {
            String string2 = dy2.a().k();
            if (string2.equals("root")) {
                arrdn[n3++] = dn.v;
                continue;
            }
            arrdn[n3++] = new dn(string2);
        }
        bc2 = null;
        return arrdn;
    }

    private static final Locale[] j(String string, ClassLoader classLoader) {
        dn[] arrdn = bc.o(string, classLoader).a();
        return bc.a(arrdn);
    }

    private static final String[] k(String string, ClassLoader classLoader) {
        bc bc2 = (bc)dv.d(string, R, classLoader, true);
        bc2 = (bc)bc2.l(o);
        int n2 = bc2.w();
        int n3 = 0;
        String[] arrstring = new String[n2];
        dy dy2 = bc2.D();
        dy2.c();
        while (dy2.d()) {
            String string2 = dy2.a().k();
            if (string2.equals("root")) {
                arrstring[n3++] = dn.v.toString();
                continue;
            }
            arrstring[n3++] = string2;
        }
        bc2 = null;
        return arrstring;
    }

    private static final List l(String string, ClassLoader classLoader) {
        List list = (List)AccessController.doPrivileged(new bd(string, classLoader));
        return list;
    }

    private static Set m(String string, ClassLoader classLoader) {
        List list = bc.l(string, classLoader);
        if (list == null) {
            String string2;
            Set set;
            if (U) {
                System.out.println("createFullLocaleNameArray returned null");
            }
            if (!(set = bc.n(string, classLoader)).contains(string2 = dn.v.toString())) {
                HashSet<String> hashSet = new HashSet<String>(set);
                hashSet.add(string2);
                set = Collections.unmodifiableSet(hashSet);
            }
            return set;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return Collections.unmodifiableSet(hashSet);
    }

    private static Set n(String string, ClassLoader classLoader) {
        try {
            String[] arrstring = bc.k(string, classLoader);
            HashSet<String> hashSet = new HashSet<String>();
            hashSet.addAll(Arrays.asList(arrstring));
            return Collections.unmodifiableSet(hashSet);
        }
        catch (MissingResourceException missingResourceException) {
            if (U) {
                System.out.println("couldn't find index for bundleName: " + string);
                Thread.dumpStack();
            }
            return Collections.emptySet();
        }
    }

    private static bg o(String string, ClassLoader classLoader) {
        return (bg)V.a(string, classLoader);
    }

    protected static final bc a(String string, dv dv2, dv dv3) {
        String string2;
        bc bc2 = null;
        if (dv3 == null) {
            dv3 = dv2;
        }
        String string3 = string2 = ((bc)dv2).m.length() > 0 ? ((bc)dv2).m : "";
        for (bc bc3 = (bc)dv2; bc3 != null; bc3 = (bc)bc3.j()) {
            if (string.indexOf(47) == -1) {
                bc2 = (bc)bc3.b(string, null, dv3);
                if (bc2 != null) {
                    break;
                }
            } else {
                String string4;
                bc bc4 = bc3;
                StringTokenizer stringTokenizer = new StringTokenizer(string, Y);
                while (stringTokenizer.hasMoreTokens() && (bc2 = bc.a(string4 = stringTokenizer.nextToken(), bc4, dv3)) != null) {
                    bc4 = bc2;
                }
                if (bc2 != null) break;
            }
            string = string2.length() > 0 ? string2 + Y + string : string;
            string2 = "";
        }
        if (bc2 != null) {
            bc2.a(((bc)dv3).g());
        }
        return bc2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bc) {
            bc bc2 = (bc)object;
            if (this.h().equals(bc2.h()) && this.g().equals(bc2.g())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public static dv a(String string, String string2, ClassLoader classLoader, boolean bl2) {
        dv dv2 = bc.b(string, string2, classLoader, bl2);
        if (dv2 == null) {
            throw new MissingResourceException("Could not find the bundle " + string + Y + string2 + ".res", "", "");
        }
        return dv2;
    }

    protected static synchronized dv b(String string, String string2, ClassLoader classLoader, boolean bl2) {
        dn dn2 = dn.b();
        String string3 = string2;
        if (string3.indexOf(64) >= 0) {
            string3 = dn.g(string2);
        }
        String string4 = bp.a(string, string3);
        bc bc2 = (bc)bc.a(classLoader, string4, dn2);
        String string5 = string.indexOf(46) == -1 ? "root" : "";
        String string6 = dn2.k();
        if (string3.equals("")) {
            string3 = string5;
        }
        if (U) {
            System.out.println("Creating " + string4 + " currently b is " + bc2);
        }
        if (bc2 == null) {
            bc2 = bc.a(string, string3, classLoader);
            if (U) {
                System.out.println("The bundle created is: " + bc2 + " and disableFallback=" + bl2 + " and bundle.getNoFallback=" + (bc2 != null && bc2.E()));
            }
            if (bl2 || bc2 != null && bc2.E()) {
                return bc.a(classLoader, string4, dn2, bc2);
            }
            if (bc2 == null) {
                int n2 = string3.lastIndexOf(95);
                if (n2 != -1) {
                    String string7 = string3.substring(0, n2);
                    bc2 = (bc)bc.b(string, string7, classLoader, bl2);
                    if (bc2 != null && bc2.i().l().equals(string7)) {
                        bc2.a(1);
                    }
                } else if (string6.indexOf(string3) == -1) {
                    bc2 = (bc)bc.b(string, string6, classLoader, bl2);
                    if (bc2 != null) {
                        bc2.a(3);
                    }
                } else if (string5.length() != 0 && (bc2 = bc.a(string, string5, classLoader)) != null) {
                    bc2.a(2);
                }
            } else {
                dv dv2 = null;
                string3 = bc2.g();
                int n3 = string3.lastIndexOf(95);
                if ((bc2 = (bc)bc.a(classLoader, string4, dn2, bc2)).g("%%Parent") != -1) {
                    String string8 = bc2.getString("%%Parent");
                    dv2 = bc.b(string, string8, classLoader, bl2);
                } else if (n3 != -1) {
                    dv2 = bc.b(string, string3.substring(0, n3), classLoader, bl2);
                } else if (!string3.equals(string5)) {
                    dv2 = bc.b(string, string5, classLoader, true);
                }
                if (!bc2.equals(dv2)) {
                    bc2.setParent(dv2);
                }
            }
        }
        return bc2;
    }

    dv a(String string, HashMap hashMap, dv dv2) {
        bc bc2 = (bc)this.b(string, hashMap, dv2);
        if (bc2 == null) {
            bc2 = (bc)this.j();
            if (bc2 != null) {
                bc2 = (bc)bc2.a(string, hashMap, dv2);
            }
            if (bc2 == null) {
                String string2 = bp.a(this.h(), this.g());
                throw new MissingResourceException("Can't find resource for bundle " + string2 + ", key " + string, this.getClass().getName(), string);
            }
        }
        bc2.a(((bc)dv2).g());
        return bc2;
    }

    public static bc a(String string, String string2, ClassLoader classLoader) {
        bp bp2 = bp.a(string, string2, classLoader);
        if (bp2 == null) {
            return null;
        }
        return bc.a(bp2, string, string2, classLoader);
    }

    protected String g() {
        return this.t;
    }

    protected String h() {
        return this.u;
    }

    public dn i() {
        return this.v;
    }

    public dv j() {
        return (dv)this.parent;
    }

    protected void setParent(ResourceBundle resourceBundle) {
        this.parent = resourceBundle;
    }

    public String k() {
        return this.y;
    }

    public int l() {
        return W[bp.a(this.z)];
    }

    private boolean E() {
        return this.x.c();
    }

    private static bc a(bp bp2, String string, String string2, ClassLoader classLoader) {
        int n2 = bp2.b();
        if (W[bp.a(n2)] != 2) {
            throw new IllegalStateException("Invalid format error");
        }
        bo bo2 = new bo(bp2, null, "", n2, null);
        bo2.u = string;
        bo2.t = string2;
        bo2.v = new dn(string2);
        bo2.w = classLoader;
        dv dv2 = ((bc)bo2).a("%%ALIAS", null, bo2, null, null);
        if (dv2 != null) {
            return (bc)dv.b(string, dv2.A());
        }
        return bo2;
    }

    protected bc(bp bp2, String string, String string2, int n2, bc bc2) {
        this.x = bp2;
        this.y = string;
        this.m = string2;
        this.z = n2;
        if (bc2 != null) {
            this.u = bc2.u;
            this.t = bc2.t;
            this.v = bc2.v;
            this.w = bc2.w;
            this.parent = bc2.parent;
        }
    }

    private String i(int n2) {
        String string = this.x.f(n2);
        return string != null ? string : "";
    }

    protected bc a(String string, String string2, int n2, HashMap hashMap, dv dv2) {
        String string3;
        int n3;
        ClassLoader classLoader = this.w;
        String string4 = null;
        String string5 = null;
        String string6 = this.i(n2);
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
        }
        if (hashMap.get(string6) != null) {
            throw new IllegalArgumentException("Circular references in the resource bundles");
        }
        hashMap.put(string6, "");
        if (string6.indexOf(47) == 0) {
            int n4;
            n3 = string6.indexOf(47, 1);
            int n5 = string6.indexOf(47, n3 + 1);
            string3 = string6.substring(1, n3);
            if (n5 < 0) {
                string4 = string6.substring(n3 + 1);
                string5 = string2;
            } else {
                string4 = string6.substring(n3 + 1, n5);
                string5 = string6.substring(n5 + 1, string6.length());
            }
            if (string3.equals(Z)) {
                string3 = c;
                classLoader = n;
            } else if (string3.indexOf(Z) > -1 && (n4 = string3.indexOf(45)) > -1) {
                string3 = "com/ibm/icu/impl/data/icudt51b/" + string3.substring(n4 + 1, string3.length());
                classLoader = n;
            }
        } else {
            n3 = string6.indexOf(47);
            if (n3 != -1) {
                string4 = string6.substring(0, n3);
                string5 = string6.substring(n3 + 1);
            } else {
                string4 = string6;
                string5 = string2;
            }
            string3 = this.u;
        }
        bc bc2 = null;
        bc bc3 = null;
        if (string3.equals(ab)) {
            string3 = this.u;
            string5 = string6.substring(ab.length() + 2, string6.length());
            string4 = ((bc)dv2).g();
            bc2 = (bc)bc.a(string3, string4, classLoader, false);
            if (bc2 != null) {
                bc3 = bc.a(string5, bc2, null);
            }
        } else {
            String string7;
            bc2 = string4 == null ? (bc)bc.a(string3, "", classLoader, false) : (bc)bc.a(string3, string4, classLoader, false);
            StringTokenizer stringTokenizer = new StringTokenizer(string5, Y);
            bc bc4 = bc2;
            while (stringTokenizer.hasMoreTokens() && (bc3 = (bc)bc4.a(string7 = stringTokenizer.nextToken(), hashMap, dv2)) != null) {
                bc4 = bc3;
            }
        }
        if (bc3 == null) {
            throw new MissingResourceException(this.t, this.u, string);
        }
        return bc3;
    }

    protected void m() {
        this.G = new ew(1, Math.max(this.w() * 2, 64));
    }

    protected dv b(String string, HashMap hashMap, dv dv2) {
        boolean[] arrbl;
        int[] arrn;
        dv dv3 = null;
        if (this.G != null) {
            dv3 = (dv)this.G.a(string);
        }
        if (dv3 == null && (dv3 = this.a(string, hashMap, dv2, arrn = new int[1], arrbl = new boolean[1])) != null && this.G != null && !arrbl[0]) {
            this.G.a(string, dv3);
            this.G.a(arrn[0], dv3);
        }
        return dv3;
    }

    protected dv a(int n2, HashMap hashMap, dv dv2) {
        boolean[] arrbl;
        dv dv3 = null;
        Integer n3 = null;
        if (this.G != null) {
            n3 = n2;
            dv3 = (dv)this.G.a(n3);
        }
        if (dv3 == null && (dv3 = this.a(n2, hashMap, dv2, arrbl = new boolean[1])) != null && this.G != null && !arrbl[0]) {
            this.G.a(dv3.k(), dv3);
            this.G.a(n3, dv3);
        }
        return dv3;
    }

    protected dv a(String string, HashMap hashMap, dv dv2, int[] arrn, boolean[] arrbl) {
        return null;
    }

    protected dv a(int n2, HashMap hashMap, dv dv2, boolean[] arrbl) {
        return null;
    }

    protected int g(String string) {
        return -1;
    }

    protected int d(int n2) {
        return -1;
    }

    public boolean e(int n2) {
        return bp.a(this.d(n2)) == 3;
    }

    public boolean n() {
        return bp.a(this.z) == 3;
    }

    public boolean h(String string) {
        return bp.a(this.g(string)) == 3;
    }

    public String f(int n2) {
        return this.i(this.d(n2));
    }

    public String o() {
        return this.i(this.z);
    }

    public String i(String string) {
        return this.i(this.g(string));
    }

    protected String g(int n2) {
        return null;
    }

    public Enumeration p() {
        if (!bp.d(this.z)) {
            return this.getKeys();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = this.w();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = this.g(i2);
            arrayList.add(string);
        }
        return Collections.enumeration(arrayList);
    }

    protected Enumeration q() {
        return Collections.enumeration(this.handleKeySet());
    }

    protected boolean r() {
        return this.m.length() == 0;
    }

    public /* synthetic */ dv h(int n2) {
        return this.c(n2);
    }

    public /* synthetic */ dv j(String string) {
        return this.d(string);
    }

    static /* synthetic */ boolean s() {
        return U;
    }

    static /* synthetic */ dn[] e(String string, ClassLoader classLoader) {
        return bc.i(string, classLoader);
    }

    static /* synthetic */ Locale[] f(String string, ClassLoader classLoader) {
        return bc.j(string, classLoader);
    }

    static /* synthetic */ Set g(String string, ClassLoader classLoader) {
        return bc.n(string, classLoader);
    }

    static /* synthetic */ Set h(String string, ClassLoader classLoader) {
        return bc.m(string, classLoader);
    }

    static {
        ClassLoader classLoader = am.class.getClassLoader();
        if (classLoader == null) {
            classLoader = jd.a();
        }
        n = classLoader;
        U = ar.b("localedata");
        V = new bf();
        W = new int[]{0, 1, 2, 3, 2, 2, 0, 7, 8, 8, -1, -1, -1, -1, 14, -1};
    }
}

