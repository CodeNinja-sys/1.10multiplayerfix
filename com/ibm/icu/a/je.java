/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.aj;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.dz;
import com.ibm.icu.a.ew;
import com.ibm.icu.a.jg;
import com.ibm.icu.a.jh;
import com.ibm.icu.d.gq;
import com.ibm.icu.util.cd;
import com.ibm.icu.util.cq;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dk;
import com.ibm.icu.util.dv;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeSet;

public final class je {
    private static final boolean b = false;
    private static final String c = "zoneinfo64";
    private static final String d = "Regions";
    private static final String e = "Zones";
    private static final String f = "Names";
    private static final String g = "GMT";
    private static final String h = "GMT";
    private static final String i = "001";
    private static SoftReference j;
    private static SoftReference k;
    private static SoftReference l;
    private static String[] m;
    private static aj n;
    private static aj o;
    private static aj p;
    private static final jh q;
    private static final int r = 23;
    private static final int s = 59;
    private static final int t = 59;
    private static final jg u;

    private static synchronized Set a() {
        Set set = null;
        if (j != null) {
            set = (Set)j.get();
        }
        if (set == null) {
            String[] arrstring;
            TreeSet<String> treeSet = new TreeSet<String>();
            for (String string : arrstring = je.d()) {
                if (string.equals("Etc/Unknown")) continue;
                treeSet.add(string);
            }
            set = Collections.unmodifiableSet(treeSet);
            j = new SoftReference(set);
        }
        return set;
    }

    private static synchronized Set b() {
        Set set = null;
        if (k != null) {
            set = (Set)k.get();
        }
        if (set == null) {
            String[] arrstring;
            TreeSet<String> treeSet = new TreeSet<String>();
            for (String string : arrstring = je.d()) {
                String string2;
                if (string.equals("Etc/Unknown") || !string.equals(string2 = je.b(string))) continue;
                treeSet.add(string);
            }
            set = Collections.unmodifiableSet(treeSet);
            k = new SoftReference(set);
        }
        return set;
    }

    private static synchronized Set c() {
        Set set = null;
        if (l != null) {
            set = (Set)l.get();
        }
        if (set == null) {
            String[] arrstring;
            TreeSet<String> treeSet = new TreeSet<String>();
            for (String string : arrstring = je.d()) {
                String string2;
                String string3;
                if (string.equals("Etc/Unknown") || !string.equals(string3 = je.b(string)) || (string2 = je.c(string)) == null || string2.equals(i)) continue;
                treeSet.add(string);
            }
            set = Collections.unmodifiableSet(treeSet);
            l = new SoftReference(set);
        }
        return set;
    }

    public static Set a(dk dk2, String string, Integer n2) {
        Set set = null;
        switch (dk2) {
            case a: {
                set = je.a();
                break;
            }
            case b: {
                set = je.b();
                break;
            }
            case c: {
                set = je.c();
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown SystemTimeZoneType");
            }
        }
        if (string == null && n2 == null) {
            return set;
        }
        if (string != null) {
            string = string.toUpperCase(Locale.ENGLISH);
        }
        TreeSet<String> treeSet = new TreeSet<String>();
        for (String string2 : set) {
            Object object;
            if (string != null && !string.equals(object = je.c(string2)) || n2 != null && ((object = je.e(string2)) == null || !n2.equals(((dj)object).a()))) continue;
            treeSet.add(string2);
        }
        if (treeSet.isEmpty()) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public static synchronized int a(String string) {
        int n2 = 0;
        dv dv2 = je.a(null, string);
        if (dv2 != null) {
            try {
                dv dv3 = dv2.l("links");
                int[] arrn = dv3.z();
                n2 = arrn.length;
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
        }
        return n2;
    }

    public static synchronized String a(String string, int n2) {
        dv dv2;
        Object object = "";
        if (n2 >= 0 && (dv2 = je.a(null, string)) != null) {
            Object object2;
            int n3 = -1;
            try {
                object2 = dv2.l("links");
                int[] arrn = ((dv)object2).z();
                if (n2 < arrn.length) {
                    n3 = arrn[n2];
                }
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (n3 >= 0 && (object2 = je.b(n3)) != null) {
                object = object2;
            }
        }
        return object;
    }

    private static synchronized String[] d() {
        if (m == null) {
            try {
                dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", c, bc.n);
                dv dv3 = dv2.l(f);
                m = dv3.u();
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
        }
        if (m == null) {
            m = new String[0];
        }
        return m;
    }

    private static String b(int n2) {
        String[] arrstring;
        if (n2 >= 0 && n2 < (arrstring = je.d()).length) {
            return arrstring[n2];
        }
        return null;
    }

    private static int i(String string) {
        int n2 = -1;
        String[] arrstring = je.d();
        if (arrstring.length > 0) {
            int n3;
            int n4 = 0;
            int n5 = arrstring.length;
            int n6 = Integer.MAX_VALUE;
            while (n6 != (n3 = (n4 + n5) / 2)) {
                n6 = n3;
                int n7 = string.compareTo(arrstring[n3]);
                if (n7 == 0) {
                    n2 = n3;
                    break;
                }
                if (n7 < 0) {
                    n5 = n3;
                    continue;
                }
                n4 = n3;
            }
        }
        return n2;
    }

    public static String a(dj dj2) {
        if (dj2 instanceof dz) {
            return ((dz)dj2).e();
        }
        return je.b(dj2.l());
    }

    public static String b(String string) {
        String string2 = (String)n.a(string);
        if (string2 == null) {
            string2 = je.j(string);
            if (string2 == null) {
                try {
                    int n2 = je.i(string);
                    if (n2 >= 0) {
                        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", c, bc.n);
                        dv dv3 = dv2.l(e);
                        dv dv4 = dv3.k(n2);
                        if (dv4.l() == 7) {
                            string = je.b(dv4.x());
                            string2 = je.j(string);
                        }
                        if (string2 == null) {
                            string2 = string;
                        }
                    }
                }
                catch (MissingResourceException missingResourceException) {
                    // empty catch block
                }
            }
            if (string2 != null) {
                n.a(string, string2);
            }
        }
        return string2;
    }

    private static String j(String string) {
        String string2 = null;
        String string3 = string.replace('/', ':');
        try {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "keyTypeData", bc.n);
            dv dv3 = dv2.l("typeMap");
            dv dv4 = dv3.l("timezone");
            try {
                dv4.l(string3);
                string2 = string;
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (string2 == null) {
                dv dv5 = dv2.l("typeAlias");
                dv dv6 = dv5.l("timezone");
                string2 = dv6.getString(string3);
            }
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        return string2;
    }

    public static String c(String string) {
        int n2;
        String string2 = (String)o.a(string);
        if (string2 == null && (n2 = je.i(string)) >= 0) {
            try {
                dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", c, bc.n);
                dv dv3 = dv2.l(d);
                if (n2 < dv3.w()) {
                    string2 = dv3.j(n2);
                }
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (string2 != null) {
                o.a(string, string2);
            }
        }
        return string2;
    }

    public static String d(String string) {
        String string2 = je.c(string);
        if (string2 != null && string2.equals(i)) {
            string2 = null;
        }
        return string2;
    }

    public static String a(String string, cd cd2) {
        Object object;
        cd2.a = Boolean.FALSE;
        String string2 = je.c(string);
        if (string2 != null && string2.equals(i)) {
            return null;
        }
        Boolean bl2 = (Boolean)p.a(string);
        if (bl2 == null) {
            object = dj.a(dk.c, string2, null);
            assert (object.size() >= 1);
            bl2 = object.size() <= 1;
            p.a(string, bl2);
        }
        if (bl2.booleanValue()) {
            cd2.a = Boolean.TRUE;
        } else {
            try {
                object = dv.b("com/ibm/icu/impl/data/icudt51b", "metaZones");
                dv dv2 = ((dv)object).l("primaryZones");
                String string3 = dv2.getString(string2);
                if (string.equals(string3)) {
                    cd2.a = Boolean.TRUE;
                } else {
                    String string4 = je.b(string);
                    if (string4 != null && string4.equals(string3)) {
                        cd2.a = Boolean.TRUE;
                    }
                }
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
        }
        return string2;
    }

    public static dv a(dv dv2, String string) {
        dv dv3 = null;
        int n2 = je.i(string);
        if (n2 >= 0) {
            try {
                dv dv4;
                dv dv5;
                if (dv2 == null) {
                    dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", c, bc.n);
                }
                if ((dv5 = (dv4 = dv2.l(e)).k(n2)).l() == 7) {
                    dv5 = dv4.k(dv5.x());
                }
                dv3 = dv5;
            }
            catch (MissingResourceException missingResourceException) {
                dv3 = null;
            }
        }
        return dv3;
    }

    public static dj e(String string) {
        return (dj)q.a((Object)string, (Object)string);
    }

    public static dj f(String string) {
        int[] arrn = new int[4];
        if (je.a(string, arrn)) {
            Integer n2 = arrn[0] * (arrn[1] | arrn[2] << 5 | arrn[3] << 11);
            return (dj)u.a((Object)n2, (Object)arrn);
        }
        return null;
    }

    public static String g(String string) {
        int[] arrn = new int[4];
        if (je.a(string, arrn)) {
            return je.a(arrn[1], arrn[2], arrn[3], arrn[0] < 0);
        }
        return null;
    }

    static boolean a(String string, int[] arrn) {
        gq gq2 = null;
        if (string != null && string.length() > "GMT".length() && string.toUpperCase(Locale.ENGLISH).startsWith("GMT")) {
            ParsePosition parsePosition = new ParsePosition("GMT".length());
            int n2 = 1;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (string.charAt(parsePosition.getIndex()) == '-') {
                n2 = -1;
            } else if (string.charAt(parsePosition.getIndex()) != '+') {
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            gq2 = gq.G();
            gq2.f(true);
            int n6 = parsePosition.getIndex();
            Number number = gq2.a(string, parsePosition);
            if (parsePosition.getIndex() == n6) {
                return false;
            }
            n3 = number.intValue();
            if (parsePosition.getIndex() < string.length()) {
                if (parsePosition.getIndex() - n6 > 2 || string.charAt(parsePosition.getIndex()) != ':') {
                    return false;
                }
                parsePosition.setIndex(parsePosition.getIndex() + 1);
                int n7 = parsePosition.getIndex();
                number = gq2.a(string, parsePosition);
                if (parsePosition.getIndex() - n7 != 2) {
                    return false;
                }
                n4 = number.intValue();
                if (parsePosition.getIndex() < string.length()) {
                    if (string.charAt(parsePosition.getIndex()) != ':') {
                        return false;
                    }
                    parsePosition.setIndex(parsePosition.getIndex() + 1);
                    n7 = parsePosition.getIndex();
                    number = gq2.a(string, parsePosition);
                    if (parsePosition.getIndex() != string.length() || parsePosition.getIndex() - n7 != 2) {
                        return false;
                    }
                    n5 = number.intValue();
                }
            } else {
                int n8 = parsePosition.getIndex() - n6;
                if (n8 <= 0 || 6 < n8) {
                    return false;
                }
                switch (n8) {
                    case 1: 
                    case 2: {
                        break;
                    }
                    case 3: 
                    case 4: {
                        n4 = n3 % 100;
                        n3 /= 100;
                        break;
                    }
                    case 5: 
                    case 6: {
                        n5 = n3 % 100;
                        n4 = n3 / 100 % 100;
                        n3 /= 10000;
                    }
                }
            }
            if (n3 <= 23 && n4 <= 59 && n5 <= 59) {
                if (arrn != null) {
                    if (arrn.length >= 1) {
                        arrn[0] = n2;
                    }
                    if (arrn.length >= 2) {
                        arrn[1] = n3;
                    }
                    if (arrn.length >= 3) {
                        arrn[2] = n4;
                    }
                    if (arrn.length >= 4) {
                        arrn[3] = n5;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static dj a(int n2) {
        boolean bl2 = false;
        int n3 = n2;
        if (n2 < 0) {
            bl2 = true;
            n3 = -n2;
        }
        int n4 = (n3 /= 1000) % 60;
        int n5 = (n3 /= 60) % 60;
        int n6 = n3 / 60;
        String string = je.a(n6, n5, n4, bl2);
        return new cq(n2, string);
    }

    static String a(int n2, int n3, int n4, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder("GMT");
        if (n2 != 0 || n3 != 0) {
            if (bl2) {
                stringBuilder.append('-');
            } else {
                stringBuilder.append('+');
            }
            if (n2 < 10) {
                stringBuilder.append('0');
            }
            stringBuilder.append(n2);
            stringBuilder.append(':');
            if (n3 < 10) {
                stringBuilder.append('0');
            }
            stringBuilder.append(n3);
            if (n4 != 0) {
                stringBuilder.append(':');
                if (n4 < 10) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(n4);
            }
        }
        return stringBuilder.toString();
    }

    public static String b(dj dj2) {
        String string = null;
        if (dj2 instanceof dz) {
            string = ((dz)dj2).e();
        }
        if ((string = je.b(dj2.l())) == null) {
            return null;
        }
        return je.k(string);
    }

    public static String h(String string) {
        String string2 = je.b(string);
        if (string2 == null) {
            return null;
        }
        return je.k(string2);
    }

    private static String k(String string) {
        String string2 = null;
        String string3 = string.replace('/', ':');
        try {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "keyTypeData", bc.n);
            dv dv3 = dv2.l("typeMap");
            dv dv4 = dv3.l("timezone");
            string2 = dv4.getString(string3);
        }
        catch (MissingResourceException missingResourceException) {
            // empty catch block
        }
        return string2;
    }

    static {
        m = null;
        n = new ew();
        o = new ew();
        p = new ew();
        q = new jh(null);
        u = new jg(null);
    }
}

