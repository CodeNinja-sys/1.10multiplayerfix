/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.eq;
import com.ibm.icu.a.er;
import com.ibm.icu.util.bu;
import com.ibm.icu.util.by;
import com.ibm.icu.util.dn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class bs {
    private static final boolean c = false;
    private static final double d = 0.5;
    private final dn e;
    Map a = new LinkedHashMap();
    bu b;
    private static bu f = bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(bu.a(new bu().a("no", "nb", 100, "The language no is normally taken as nb in content; we might alias this for lookup."), "nn", "nb", 96), "nn", "no", 96).a("da", "no", 90, "Danish and norwegian are reasonably close."), "da", "nb", 90).a("hr", "br", 96, "Serbo-croatian variants are all very close."), "sh", "br", 96), "sr", "br", 96), "sh", "hr", 96), "sr", "hr", 96), "sh", "sr", 96).a("sr-Latn", "sr-Cyrl", 90, "Most serbs can read either script."), "*-Hans", "*-Hant", 85, true, "Readers of simplified can read traditional much better than reverse.").a("*-Hant", "*-Hans", 75, true).a("en-*-US", "en-*-CA", 98, "US is different than others, and Canadian is inbetween."), "en-*-US", "en-*-*", 97), "en-*-CA", "en-*-*", 98), "en-*-*", "en-*-*", 99).a("es-*-ES", "es-*-ES", 100, "Latin American Spanishes are closer to each other. Approximate by having es-ES be further from everything else."), "es-*-ES", "es-*-*", 93).a("*", "*", 1, "[Default value -- must be at end!] Normally there is no comprehension of different languages.").a("*-*", "*-*", 20, "[Default value -- must be at end!] Normally there is little comprehension of different scripts.").a("*-*-*", "*-*-*", 96, "[Default value -- must be at end!] Normally there are small differences across regions.").b();
    private static HashMap g = new HashMap();

    public bs(by by2) {
        this(by2, f);
    }

    public bs(String string) {
        this(by.a(string).a());
    }

    public bs(by by2, bu bu2) {
        this.b = bu2;
        for (dn dn2 : by2) {
            this.a(dn2, by2.b(dn2));
        }
        Iterator iterator = by2.iterator();
        this.e = iterator.hasNext() ? (dn)iterator.next() : null;
    }

    public double a(dn dn2, dn dn3, dn dn4, dn dn5) {
        return this.b.a(dn2, dn3, dn4, dn5);
    }

    public dn a(dn dn2) {
        String string = dn2.f();
        String string2 = (String)g.get(string);
        String string3 = dn2.g();
        String string4 = (String)g.get(string3);
        String string5 = dn2.h();
        String string6 = (String)g.get(string5);
        if (string2 != null || string4 != null || string6 != null) {
            return new dn(string2 == null ? string : string2, string4 == null ? string3 : string4, string6 == null ? string5 : string6);
        }
        return dn2;
    }

    public dn a(by by2) {
        double d2 = 0.0;
        dn dn2 = null;
        for (dn dn3 : by2) {
            er er2 = this.c(dn3);
            double d3 = (Double)er2.b() * by2.b(dn3);
            if (!(d3 > d2)) continue;
            d2 = d3;
            dn2 = (dn)er2.a();
        }
        if (d2 < 0.5) {
            dn2 = this.e;
        }
        return dn2;
    }

    public dn a(String string) {
        return this.a(by.a(string).a());
    }

    public dn b(dn dn2) {
        return (dn)this.c(dn2).a();
    }

    public String toString() {
        return "{" + this.e + ", " + this.a + "}";
    }

    private er c(dn dn2) {
        dn2 = this.a(dn2);
        dn dn3 = this.d(dn2);
        double d2 = 0.0;
        dn dn4 = null;
        for (dn dn5 : this.a.keySet()) {
            er er2;
            double d3 = this.a(dn2, dn3, dn5, (dn)(er2 = (er)this.a.get(dn5)).a());
            double d4 = d3 * (Double)er2.b();
            if (!(d4 > d2)) continue;
            d2 = d4;
            dn4 = dn5;
        }
        if (d2 < 0.5) {
            dn4 = this.e;
        }
        return er.a(dn4, d2);
    }

    private void a(dn dn2, Double d2) {
        dn2 = this.a(dn2);
        er er2 = eq.a(this.d(dn2), d2);
        this.a.put(dn2, er2);
    }

    private dn d(dn dn2) {
        dn dn3 = dn.j(dn2);
        if (dn3 == null || dn3.equals(dn2)) {
            String string = dn2.f();
            String string2 = dn2.g();
            String string3 = dn2.h();
            return new dn((string.length() == 0 ? "und" : string) + "_" + (string2.length() == 0 ? "Zzzz" : string2) + "_" + (string3.length() == 0 ? "ZZ" : string3));
        }
        return dn3;
    }

    static {
        g.put("iw", "he");
        g.put("mo", "ro");
        g.put("tl", "fil");
    }
}

