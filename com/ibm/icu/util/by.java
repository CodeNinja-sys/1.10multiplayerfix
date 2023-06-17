/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bz;
import com.ibm.icu.util.ca;
import com.ibm.icu.util.dn;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class by
implements Iterable {
    private static final double a = 0.0;
    private static final Double b = 1.0;
    private static final Pattern c = Pattern.compile("\\s*,\\s*");
    private static final Pattern d = Pattern.compile("\\s*(\\S*)\\s*;\\s*q\\s*=\\s*(\\S*)");
    private final Map e;
    private static Comparator f = new bz();

    public static ca a(dn dn2) {
        return new ca(null).a(dn2);
    }

    public static ca a(dn dn2, double d2) {
        return new ca(null).a(dn2, d2);
    }

    public static ca a(by by2) {
        return new ca(null).a(by2);
    }

    public static ca a(String string) {
        return new ca(null).a(string);
    }

    public Double b(dn dn2) {
        return (Double)this.e.get(dn2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (dn dn2 : this.e.keySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(dn2);
            double d2 = (Double)this.e.get(dn2);
            if (d2 == b) continue;
            stringBuilder.append(";q=").append(d2);
        }
        return stringBuilder.toString();
    }

    public Iterator iterator() {
        return this.e.keySet().iterator();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        try {
            by by2 = (by)object;
            return ((Object)this.e).equals(by2.e);
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
    }

    public int hashCode() {
        return ((Object)this.e).hashCode();
    }

    private by(Map map) {
        this.e = map;
    }

    static /* synthetic */ Comparator a() {
        return f;
    }

    static /* synthetic */ Double b() {
        return b;
    }

    /* synthetic */ by(Map map, bz bz2) {
        this(map);
    }

    static /* synthetic */ Map b(by by2) {
        return by2.e;
    }

    static /* synthetic */ Pattern c() {
        return c;
    }

    static /* synthetic */ Pattern d() {
        return d;
    }
}

