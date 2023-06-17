/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.a.c.a.aa;
import org.apache.commons.a.c.a.ac;
import org.apache.commons.a.c.a.ad;
import org.apache.commons.a.c.a.ae;
import org.apache.commons.a.c.a.af;
import org.apache.commons.a.c.a.e;
import org.apache.commons.a.c.a.h;
import org.apache.commons.a.c.a.j;
import org.apache.commons.a.c.a.q;
import org.apache.commons.a.c.a.r;
import org.apache.commons.a.c.a.s;
import org.apache.commons.a.c.a.t;
import org.apache.commons.a.c.a.u;
import org.apache.commons.a.c.a.v;
import org.apache.commons.a.c.a.w;
import org.apache.commons.a.c.a.x;
import org.apache.commons.a.c.a.y;
import org.apache.commons.a.c.a.z;

public class p {
    public static final ae a = new q();
    public static final String b = "ALL";
    private static final String c = "\"";
    private static final String d = "#include";
    private static final Map e = new EnumMap(j.class);
    private final ae f;
    private final String g;
    private final ac h;
    private final ae i;

    private static boolean b(CharSequence charSequence, char c2) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (charSequence.charAt(i2) != c2) continue;
            return true;
        }
        return false;
    }

    private static String c(j j2, af af2, String string) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", j2.a(), af2.a(), string);
    }

    private static Scanner d(j j2, af af2, String string) {
        String string2 = p.c(j2, af2, string);
        InputStream inputStream = e.class.getClassLoader().getResourceAsStream(string2);
        if (inputStream == null) {
            throw new IllegalArgumentException("Unable to load resource: " + string2);
        }
        return new Scanner(inputStream, "UTF-8");
    }

    private static Scanner a(String string) {
        String string2 = String.format("org/apache/commons/codec/language/bm/%s.txt", string);
        InputStream inputStream = e.class.getClassLoader().getResourceAsStream(string2);
        if (inputStream == null) {
            throw new IllegalArgumentException("Unable to load resource: " + string2);
        }
        return new Scanner(inputStream, "UTF-8");
    }

    private static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int n2 = charSequence.length() - 1;
        for (int i2 = charSequence2.length() - 1; i2 >= 0; --i2) {
            if (charSequence.charAt(n2) != charSequence2.charAt(i2)) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static List a(j j2, af af2, h h2) {
        Map map = p.b(j2, af2, h2);
        ArrayList arrayList = new ArrayList();
        for (List list : map.values()) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static List a(j j2, af af2, String string) {
        return p.a(j2, af2, org.apache.commons.a.c.a.h.a(new HashSet<String>(Arrays.asList(string))));
    }

    public static Map b(j j2, af af2, h h2) {
        return h2.c() ? p.b(j2, af2, h2.a()) : p.b(j2, af2, "any");
    }

    public static Map b(j j2, af af2, String string) {
        Map map = (Map)((Map)((Map)e.get((Object)j2)).get((Object)af2)).get(string);
        if (map == null) {
            throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", j2.a(), af2.a(), string));
        }
        return map;
    }

    private static aa b(String string) {
        int n2 = string.indexOf("[");
        if (n2 >= 0) {
            if (!string.endsWith("]")) {
                throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
            }
            String string2 = string.substring(0, n2);
            String string3 = string.substring(n2 + 1, string.length() - 1);
            HashSet<String> hashSet = new HashSet<String>(Arrays.asList(string3.split("[+]")));
            return new aa(string2, org.apache.commons.a.c.a.h.a(hashSet));
        }
        return new aa(string, org.apache.commons.a.c.a.e.c);
    }

    private static ac c(String string) {
        if (string.startsWith("(")) {
            if (!string.endsWith(")")) {
                throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
            }
            ArrayList<aa> arrayList = new ArrayList<aa>();
            String string2 = string.substring(1, string.length() - 1);
            for (String string3 : string2.split("[|]")) {
                arrayList.add(p.b(string3));
            }
            if (string2.startsWith("|") || string2.endsWith("|")) {
                arrayList.add(new aa("", org.apache.commons.a.c.a.e.c));
            }
            return new ad(arrayList);
        }
        return p.b(string);
    }

    private static Map a(Scanner scanner, String string) {
        HashMap<String, ArrayList<s>> hashMap = new HashMap<String, ArrayList<s>>();
        int n2 = 0;
        boolean bl2 = false;
        while (scanner.hasNextLine()) {
            Object object;
            String string2;
            ++n2;
            String string3 = string2 = scanner.nextLine();
            if (bl2) {
                if (!string3.endsWith("*/")) continue;
                bl2 = false;
                continue;
            }
            if (string3.startsWith("/*")) {
                bl2 = true;
                continue;
            }
            int n3 = string3.indexOf("//");
            if (n3 >= 0) {
                string3 = string3.substring(0, n3);
            }
            if ((string3 = string3.trim()).length() == 0) continue;
            if (string3.startsWith(d)) {
                object = string3.substring(d.length()).trim();
                if (((String)object).contains(" ")) {
                    throw new IllegalArgumentException("Malformed import statement '" + string2 + "' in " + string);
                }
                hashMap.putAll(p.a(p.a((String)object), string + "->" + (String)object));
                continue;
            }
            object = string3.split("\\s+");
            if (((String[])object).length != 4) {
                throw new IllegalArgumentException("Malformed rule statement split into " + ((Object)object).length + " parts: " + string2 + " in " + string);
            }
            try {
                String string4 = p.e((String)object[0]);
                String string5 = p.e((String)object[1]);
                String string6 = p.e((String)object[2]);
                ac ac2 = p.c(p.e((String)object[3]));
                int n4 = n2;
                s s2 = new s(string4, string5, string6, ac2, n4, string);
                String string7 = s2.g.substring(0, 1);
                ArrayList<s> arrayList = (ArrayList<s>)hashMap.get(string7);
                if (arrayList == null) {
                    arrayList = new ArrayList<s>();
                    hashMap.put(string7, arrayList);
                }
                arrayList.add(s2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new IllegalStateException("Problem parsing line '" + n2 + "' in " + string, illegalArgumentException);
            }
        }
        return hashMap;
    }

    private static ae d(String string) {
        boolean bl2;
        boolean bl3 = string.startsWith("^");
        String string2 = string.substring(bl3 ? 1 : 0, (bl2 = string.endsWith("$")) ? string.length() - 1 : string.length());
        boolean bl4 = string2.contains("[");
        if (!bl4) {
            if (bl3 && bl2) {
                if (string2.length() == 0) {
                    return new t();
                }
                return new u(string2);
            }
            if ((bl3 || bl2) && string2.length() == 0) {
                return a;
            }
            if (bl3) {
                return new v(string2);
            }
            if (bl2) {
                return new w(string2);
            }
        } else {
            String string3;
            boolean bl5 = string2.startsWith("[");
            boolean bl6 = string2.endsWith("]");
            if (bl5 && bl6 && !(string3 = string2.substring(1, string2.length() - 1)).contains("[")) {
                boolean bl7;
                boolean bl8 = string3.startsWith("^");
                if (bl8) {
                    string3 = string3.substring(1);
                }
                String string4 = string3;
                boolean bl9 = bl7 = !bl8;
                if (bl3 && bl2) {
                    return new x(string4, bl7);
                }
                if (bl3) {
                    return new y(string4, bl7);
                }
                if (bl2) {
                    return new z(string4, bl7);
                }
            }
        }
        return new r(string);
    }

    private static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence2.length(); ++i2) {
            if (charSequence.charAt(i2) == charSequence2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    private static String e(String string) {
        if (string.startsWith(c)) {
            string = string.substring(1);
        }
        if (string.endsWith(c)) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    public p(String string, String string2, String string3, ac ac2) {
        this.g = string;
        this.f = p.d(string2 + "$");
        this.i = p.d("^" + string3);
        this.h = ac2;
    }

    public ae a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public ac c() {
        return this.h;
    }

    public ae d() {
        return this.i;
    }

    public boolean a(CharSequence charSequence, int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int n3 = this.g.length();
        int n4 = n2 + n3;
        if (n4 > charSequence.length()) {
            return false;
        }
        if (!charSequence.subSequence(n2, n4).equals(this.g)) {
            return false;
        }
        if (!this.i.a(charSequence.subSequence(n4, charSequence.length()))) {
            return false;
        }
        return this.f.a(charSequence.subSequence(0, n2));
    }

    static /* synthetic */ boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return p.d(charSequence, charSequence2);
    }

    static /* synthetic */ boolean b(CharSequence charSequence, CharSequence charSequence2) {
        return p.c(charSequence, charSequence2);
    }

    static /* synthetic */ boolean a(CharSequence charSequence, char c2) {
        return p.b(charSequence, c2);
    }

    static {
        for (j j2 : j.values()) {
            EnumMap enumMap = new EnumMap(af.class);
            for (af af2 : af.values()) {
                HashMap<String, Map> hashMap = new HashMap<String, Map>();
                e e2 = org.apache.commons.a.c.a.e.a(j2);
                for (String string : e2.a()) {
                    try {
                        hashMap.put(string, p.a(p.d(j2, af2, string), p.c(j2, af2, string)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw new IllegalStateException("Problem processing " + p.c(j2, af2, string), illegalStateException);
                    }
                }
                if (!af2.equals((Object)af.c)) {
                    hashMap.put("common", p.a(p.d(j2, af2, "common"), p.c(j2, af2, "common")));
                }
                enumMap.put(af2, Collections.unmodifiableMap(hashMap));
            }
            e.put(j2, Collections.unmodifiableMap(enumMap));
        }
    }
}

