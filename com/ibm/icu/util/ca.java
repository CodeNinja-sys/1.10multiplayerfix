/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.by;
import com.ibm.icu.util.bz;
import com.ibm.icu.util.dn;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class ca {
    private final Map a = new LinkedHashMap();

    private ca() {
    }

    public by a() {
        return this.a(false);
    }

    public by a(boolean bl2) {
        Set set;
        TreeMap treeMap = new TreeMap(by.a());
        for (Object object : this.a.keySet()) {
            Double object2 = (Double)this.a.get(object);
            set = (Set)treeMap.get(object2);
            if (set == null) {
                set = new LinkedHashSet();
                treeMap.put(object2, set);
            }
            set.add(object);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            set = (Double)entry.getKey();
            for (dn dn2 : (Set)entry.getValue()) {
                linkedHashMap.put(dn2, bl2 ? set : by.b());
            }
        }
        return new by(Collections.unmodifiableMap(linkedHashMap), null);
    }

    public ca a(by by2) {
        for (dn dn2 : by.b(by2).keySet()) {
            this.a(dn2, (Double)by.b(by2).get(dn2));
        }
        return this;
    }

    public ca a(dn dn2) {
        return this.a(dn2, by.b());
    }

    public ca a(dn ... arrdn) {
        for (dn dn2 : arrdn) {
            this.a(dn2, by.b());
        }
        return this;
    }

    public ca a(dn dn2, double d2) {
        if (this.a.containsKey(dn2)) {
            this.a.remove(dn2);
        }
        if (d2 <= 0.0) {
            return this;
        }
        if (d2 > by.b()) {
            d2 = by.b();
        }
        this.a.put(dn2, d2);
        return this;
    }

    public ca a(String string) {
        String[] arrstring = by.c().split(string.trim());
        Matcher matcher = by.d().matcher("");
        for (String string2 : arrstring) {
            if (matcher.reset(string2).matches()) {
                dn dn2 = new dn(matcher.group(1));
                double d2 = Double.parseDouble(matcher.group(2));
                if (!(d2 >= 0.0) || !(d2 <= by.b())) {
                    throw new IllegalArgumentException("Illegal weight, must be 0..1: " + d2);
                }
                this.a(dn2, d2);
                continue;
            }
            if (string2.length() == 0) continue;
            this.a(new dn(string2));
        }
        return this;
    }

    /* synthetic */ ca(bz bz2) {
        this();
    }
}

