/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum k {
    a("\u001b["),
    b("m"),
    c(";"),
    d("0"),
    e("1"),
    f("2"),
    g("3"),
    h("5"),
    i("7"),
    j("8"),
    k("30"),
    l("30"),
    m("31"),
    n("31"),
    o("32"),
    p("32"),
    q("33"),
    r("33"),
    s("34"),
    t("34"),
    u("35"),
    v("35"),
    w("36"),
    x("36"),
    y("37"),
    z("37"),
    A("39"),
    B("39"),
    C("40"),
    D("41"),
    E("42"),
    F("43"),
    G("44"),
    H("45"),
    I("46"),
    J("47");

    private static final String K = "\\s*";
    private final String L;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k() {
        void var3_1;
        this.L = var3_1;
    }

    public static String a() {
        return a.b() + b.b();
    }

    private static String a(String string) {
        return K + string + K;
    }

    public String b() {
        return this.L;
    }

    public static Map a(String string, String[] arrstring) {
        return org.apache.logging.log4j.core.i.k.a(string.split(org.apache.logging.log4j.core.i.k.a(",")), arrstring);
    }

    public static Map a(String[] arrstring, String[] arrstring2) {
        Object[] arrobject = arrstring2 != null ? (String[])arrstring2.clone() : new String[0];
        Arrays.sort(arrobject);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : arrstring) {
            String[] arrstring3 = string.split(org.apache.logging.log4j.core.i.k.a("="));
            if (arrstring3.length <= 1) continue;
            String string2 = arrstring3[0].toUpperCase(Locale.ENGLISH);
            String string3 = arrstring3[1];
            boolean bl2 = Arrays.binarySearch(arrobject, string2) < 0;
            hashMap.put(string2, bl2 ? org.apache.logging.log4j.core.i.k.a(string3.split("\\s")) : string3);
        }
        return hashMap;
    }

    public static String a(String ... arrstring) {
        if (arrstring == null) {
            return org.apache.logging.log4j.core.i.k.a();
        }
        StringBuilder stringBuilder = new StringBuilder(a.b());
        boolean bl2 = true;
        for (String string : arrstring) {
            try {
                k k2 = org.apache.logging.log4j.core.i.k.valueOf(string.trim().toUpperCase(Locale.ENGLISH));
                if (!bl2) {
                    stringBuilder.append(c.b());
                }
                bl2 = false;
                stringBuilder.append(k2.b());
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        stringBuilder.append(b.b());
        return stringBuilder.toString();
    }
}

