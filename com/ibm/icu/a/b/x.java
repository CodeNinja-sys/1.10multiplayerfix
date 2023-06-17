/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

public final class x {
    final String a;
    final byte b;
    public static final x c = new x("year", 0);
    public static final x d = new x("month", 1);
    public static final x e = new x("week", 2);
    public static final x f = new x("day", 3);
    public static final x g = new x("hour", 4);
    public static final x h = new x("minute", 5);
    public static final x i = new x("second", 6);
    public static final x j = new x("millisecond", 7);
    static final x[] k = new x[]{c, d, e, f, g, h, i, j};
    static final long[] l = new long[]{31557600000L, 2630880000L, 604800000L, 86400000L, 3600000L, 60000L, 1000L, 1L};

    private x(String string, int n2) {
        this.a = string;
        this.b = (byte)n2;
    }

    public String toString() {
        return this.a;
    }

    public x a() {
        return this.b == 0 ? null : k[this.b - 1];
    }

    public x b() {
        return this.b == k.length - 1 ? null : k[this.b + 1];
    }

    public int c() {
        return this.b;
    }
}

