/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j;

import java.util.Locale;

public enum b {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(Integer.MAX_VALUE);

    private final int i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b() {
        void var3_1;
        this.i = var3_1;
    }

    public static b a(String string) {
        return org.apache.logging.log4j.b.a(string, f);
    }

    public static b a(String string, b b2) {
        if (string == null) {
            return b2;
        }
        String string2 = string.toUpperCase(Locale.ENGLISH);
        for (b b3 : org.apache.logging.log4j.b.values()) {
            if (!b3.name().equals(string2)) continue;
            return b3;
        }
        return b2;
    }

    public boolean a(b b2) {
        return this.i <= b2.i;
    }

    public boolean a(int n2) {
        return this.i <= n2;
    }

    public boolean b(b b2) {
        return this.i <= b2.i;
    }

    public boolean b(int n2) {
        return this.i <= n2;
    }

    public int a() {
        return this.i;
    }
}

