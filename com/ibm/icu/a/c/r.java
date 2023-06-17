/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.c.g;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class r
extends g {
    public static final char b = 'u';
    private static final SortedSet e = new TreeSet();
    private static final SortedMap f = new TreeMap();
    private SortedSet g = e;
    private SortedMap h = f;
    public static final r c = new r();
    public static final r d;

    private r() {
        super('u');
    }

    r(SortedSet sortedSet, SortedMap sortedMap) {
        this();
        if (sortedSet != null && sortedSet.size() > 0) {
            this.g = sortedSet;
        }
        if (sortedMap != null && sortedMap.size() > 0) {
            this.h = sortedMap;
        }
        if (this.g.size() > 0 || this.h.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String object : this.g) {
                stringBuilder.append("-").append(object);
            }
            for (Map.Entry entry : this.h.entrySet()) {
                String string = (String)entry.getKey();
                String string2 = (String)entry.getValue();
                stringBuilder.append("-").append(string);
                if (string2.length() <= 0) continue;
                stringBuilder.append("-").append(string2);
            }
            this.a = stringBuilder.substring(1);
        }
    }

    public Set d() {
        return Collections.unmodifiableSet(this.g);
    }

    public Set e() {
        return Collections.unmodifiableSet(this.h.keySet());
    }

    public String a(String string) {
        return (String)this.h.get(string);
    }

    public static boolean a(char c2) {
        return 'u' == com.ibm.icu.a.c.a.b(c2);
    }

    public static boolean b(String string) {
        return string.length() >= 3 && string.length() <= 8 && com.ibm.icu.a.c.a.f(string);
    }

    public static boolean c(String string) {
        return string.length() == 2 && com.ibm.icu.a.c.a.f(string);
    }

    public static boolean d(String string) {
        return string.length() >= 3 && string.length() <= 8 && com.ibm.icu.a.c.a.f(string);
    }

    static {
        r.c.h = new TreeMap();
        r.c.h.put("ca", "japanese");
        r.c.a = "ca-japanese";
        d = new r();
        r.d.h = new TreeMap();
        r.d.h.put("nu", "thai");
        r.d.a = "nu-thai";
    }
}

