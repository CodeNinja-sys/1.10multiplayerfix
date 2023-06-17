/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.c.b;
import com.ibm.icu.a.c.c;
import com.ibm.icu.a.c.g;
import com.ibm.icu.a.c.l;
import com.ibm.icu.a.c.p;
import com.ibm.icu.a.c.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k {
    private static final boolean e = false;
    public static final String a = "-";
    public static final String b = "x";
    public static String c;
    public static final String d = "lvariant";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private List j = Collections.emptyList();
    private List k = Collections.emptyList();
    private List l = Collections.emptyList();
    private static final Map m;

    private k() {
    }

    public static k a(String string, p p2) {
        if (p2 == null) {
            p2 = new p();
        } else {
            p2.a();
        }
        String[] arrstring = (String[])m.get(new b(string));
        q q2 = arrstring != null ? new q(arrstring[1], a) : new q(string, a);
        k k2 = new k();
        if (k2.a(q2, p2)) {
            k2.b(q2, p2);
            k2.c(q2, p2);
            k2.d(q2, p2);
            k2.e(q2, p2);
            k2.f(q2, p2);
        }
        k2.g(q2, p2);
        if (!q2.e() && !p2.b()) {
            String string2 = q2.b();
            p2.b = q2.c();
            p2.c = string2.length() == 0 ? "Empty subtag" : "Invalid subtag: " + string2;
        }
        return k2;
    }

    private boolean a(q q2, p p2) {
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        String string = q2.b();
        if (com.ibm.icu.a.c.k.a(string)) {
            bl2 = true;
            this.f = string;
            p2.a = q2.d();
            q2.f();
        }
        return bl2;
    }

    private boolean b(q q2, p p2) {
        String string;
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        while (!q2.e() && com.ibm.icu.a.c.k.b(string = q2.b())) {
            bl2 = true;
            if (this.j.isEmpty()) {
                this.j = new ArrayList(3);
            }
            this.j.add(string);
            p2.a = q2.d();
            q2.f();
            if (this.j.size() != 3) continue;
            break;
        }
        return bl2;
    }

    private boolean c(q q2, p p2) {
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        String string = q2.b();
        if (com.ibm.icu.a.c.k.c(string)) {
            bl2 = true;
            this.g = string;
            p2.a = q2.d();
            q2.f();
        }
        return bl2;
    }

    private boolean d(q q2, p p2) {
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        String string = q2.b();
        if (com.ibm.icu.a.c.k.d(string)) {
            bl2 = true;
            this.h = string;
            p2.a = q2.d();
            q2.f();
        }
        return bl2;
    }

    private boolean e(q q2, p p2) {
        String string;
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        while (!q2.e() && com.ibm.icu.a.c.k.e(string = q2.b())) {
            bl2 = true;
            if (this.k.isEmpty()) {
                this.k = new ArrayList(3);
            }
            this.k.add(string);
            p2.a = q2.d();
            q2.f();
        }
        return bl2;
    }

    private boolean f(q q2, p p2) {
        String string;
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        while (!q2.e() && com.ibm.icu.a.c.k.f(string = q2.b())) {
            int n2 = q2.c();
            String string2 = string;
            StringBuilder stringBuilder = new StringBuilder(string2);
            q2.f();
            while (!q2.e() && com.ibm.icu.a.c.k.g(string = q2.b())) {
                stringBuilder.append(a).append(string);
                p2.a = q2.d();
                q2.f();
            }
            if (p2.a <= n2) {
                p2.b = n2;
                p2.c = "Incomplete extension '" + string2 + "'";
                break;
            }
            if (this.l.size() == 0) {
                this.l = new ArrayList(4);
            }
            this.l.add(stringBuilder.toString());
            bl2 = true;
        }
        return bl2;
    }

    private boolean g(q q2, p p2) {
        if (q2.e() || p2.b()) {
            return false;
        }
        boolean bl2 = false;
        String string = q2.b();
        if (com.ibm.icu.a.c.k.h(string)) {
            int n2 = q2.c();
            StringBuilder stringBuilder = new StringBuilder(string);
            q2.f();
            while (!q2.e() && com.ibm.icu.a.c.k.i(string = q2.b())) {
                stringBuilder.append(a).append(string);
                p2.a = q2.d();
                q2.f();
            }
            if (p2.a <= n2) {
                p2.b = n2;
                p2.c = "Incomplete privateuse";
            } else {
                this.i = stringBuilder.toString();
                bl2 = true;
            }
        }
        return bl2;
    }

    public static k a(c c2, l l2) {
        Object object;
        Object object2;
        Object object3;
        ArrayList<String> arrayList;
        k k2 = new k();
        String string = c2.a();
        String string2 = c2.b();
        String string3 = c2.c();
        String string4 = c2.d();
        boolean bl2 = false;
        String string5 = null;
        if (string.length() > 0 && com.ibm.icu.a.c.k.a(string)) {
            if (string.equals("iw")) {
                string = "he";
            } else if (string.equals("ji")) {
                string = "yi";
            } else if (string.equals("in")) {
                string = "id";
            }
            k2.f = string;
        }
        if (string2.length() > 0 && com.ibm.icu.a.c.k.c(string2)) {
            k2.g = com.ibm.icu.a.c.k.l(string2);
            bl2 = true;
        }
        if (string3.length() > 0 && com.ibm.icu.a.c.k.d(string3)) {
            k2.h = com.ibm.icu.a.c.k.m(string3);
            bl2 = true;
        }
        if (string4.length() > 0) {
            arrayList = null;
            object3 = new q(string4, "_");
            while (!((q)object3).e() && com.ibm.icu.a.c.k.e((String)(object2 = ((q)object3).b()))) {
                if (arrayList == null) {
                    arrayList = new ArrayList<String>();
                }
                arrayList.add(com.ibm.icu.a.c.k.n((String)object2));
                ((q)object3).f();
            }
            if (arrayList != null) {
                k2.k = arrayList;
                bl2 = true;
            }
            if (!((q)object3).e()) {
                object2 = new StringBuilder();
                while (!((q)object3).e() && com.ibm.icu.a.c.k.i((String)(object = ((q)object3).b()))) {
                    if (((StringBuilder)object2).length() > 0) {
                        ((StringBuilder)object2).append(a);
                    }
                    object = com.ibm.icu.a.c.a.a((String)object);
                    ((StringBuilder)object2).append((String)object);
                    ((q)object3).f();
                }
                if (((StringBuilder)object2).length() > 0) {
                    string5 = ((StringBuilder)object2).toString();
                }
            }
        }
        arrayList = null;
        object3 = null;
        object2 = l2.a();
        object = object2.iterator();
        while (object.hasNext()) {
            Character c3 = (Character)object.next();
            g g2 = l2.a(c3);
            if (com.ibm.icu.a.c.k.b(c3.charValue())) {
                object3 = g2.b();
                continue;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(c3.toString() + a + g2.b());
        }
        if (arrayList != null) {
            k2.l = arrayList;
            bl2 = true;
        }
        if (string5 != null) {
            object3 = object3 == null ? "lvariant-" + string5 : (String)object3 + a + d + a + string5.replace("_", a);
        }
        if (object3 != null) {
            k2.i = object3;
        }
        if (k2.f.length() == 0 && (bl2 || object3 == null)) {
            k2.f = c;
        }
        return k2;
    }

    public String a() {
        return this.f;
    }

    public List b() {
        return Collections.unmodifiableList(this.j);
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.h;
    }

    public List e() {
        return Collections.unmodifiableList(this.k);
    }

    public List f() {
        return Collections.unmodifiableList(this.l);
    }

    public String g() {
        return this.i;
    }

    public static boolean a(String string) {
        return string.length() >= 2 && string.length() <= 8 && com.ibm.icu.a.c.a.d(string);
    }

    public static boolean b(String string) {
        return string.length() == 3 && com.ibm.icu.a.c.a.d(string);
    }

    public static boolean c(String string) {
        return string.length() == 4 && com.ibm.icu.a.c.a.d(string);
    }

    public static boolean d(String string) {
        return string.length() == 2 && com.ibm.icu.a.c.a.d(string) || string.length() == 3 && com.ibm.icu.a.c.a.e(string);
    }

    public static boolean e(String string) {
        int n2 = string.length();
        if (n2 >= 5 && n2 <= 8) {
            return com.ibm.icu.a.c.a.f(string);
        }
        if (n2 == 4) {
            return com.ibm.icu.a.c.a.d(string.charAt(0)) && com.ibm.icu.a.c.a.e(string.charAt(1)) && com.ibm.icu.a.c.a.e(string.charAt(2)) && com.ibm.icu.a.c.a.e(string.charAt(3));
        }
        return false;
    }

    public static boolean f(String string) {
        return string.length() == 1 && com.ibm.icu.a.c.a.d(string) && !com.ibm.icu.a.c.a.a(b, string);
    }

    public static boolean a(char c2) {
        return com.ibm.icu.a.c.k.f(String.valueOf(c2));
    }

    public static boolean g(String string) {
        return string.length() >= 2 && string.length() <= 8 && com.ibm.icu.a.c.a.f(string);
    }

    public static boolean h(String string) {
        return string.length() == 1 && com.ibm.icu.a.c.a.a(b, string);
    }

    public static boolean b(char c2) {
        return com.ibm.icu.a.c.a.a(b, String.valueOf(c2));
    }

    public static boolean i(String string) {
        return string.length() >= 1 && string.length() <= 8 && com.ibm.icu.a.c.a.f(string);
    }

    public static String j(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String k(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String l(String string) {
        return com.ibm.icu.a.c.a.c(string);
    }

    public static String m(String string) {
        return com.ibm.icu.a.c.a.b(string);
    }

    public static String n(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String o(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String p(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String q(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String r(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public static String s(String string) {
        return com.ibm.icu.a.c.a.a(string);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f.length() > 0) {
            stringBuilder.append(this.f);
            for (String string : this.j) {
                stringBuilder.append(a).append(string);
            }
            if (this.g.length() > 0) {
                stringBuilder.append(a).append(this.g);
            }
            if (this.h.length() > 0) {
                stringBuilder.append(a).append(this.h);
            }
            for (String string : this.j) {
                stringBuilder.append(a).append(string);
            }
            for (String string : this.l) {
                stringBuilder.append(a).append(string);
            }
        }
        if (this.i.length() > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(a);
            }
            stringBuilder.append(this.i);
        }
        return stringBuilder.toString();
    }

    static {
        String[][] arrarrstring;
        c = "und";
        m = new HashMap();
        for (String[] arrstring : arrarrstring = new String[][]{{"art-lojban", "jbo"}, {"cel-gaulish", "xtg-x-cel-gaulish"}, {"en-GB-oed", "en-GB-x-oed"}, {"i-ami", "ami"}, {"i-bnn", "bnn"}, {"i-default", "en-x-i-default"}, {"i-enochian", "und-x-i-enochian"}, {"i-hak", "hak"}, {"i-klingon", "tlh"}, {"i-lux", "lb"}, {"i-mingo", "see-x-i-mingo"}, {"i-navajo", "nv"}, {"i-pwn", "pwn"}, {"i-tao", "tao"}, {"i-tay", "tay"}, {"i-tsu", "tsu"}, {"no-bok", "nb"}, {"no-nyn", "nn"}, {"sgn-BE-FR", "sfb"}, {"sgn-BE-NL", "vgt"}, {"sgn-CH-DE", "sgg"}, {"zh-guoyu", "cmn"}, {"zh-hakka", "hak"}, {"zh-min", "nan-x-zh-min"}, {"zh-min-nan", "nan"}, {"zh-xiang", "hsn"}}) {
            m.put(new b(arrstring[0]), arrstring);
        }
    }
}

