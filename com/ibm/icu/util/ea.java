/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.c.a;
import com.ibm.icu.util.eb;

public final class ea {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    public static final int s = 7;
    public static final int t = 8;
    public static final int u = 9;
    public static final int v = 10;
    public static final int w = 11;
    private static final long x = 1L;
    private static final long y = 10L;
    private static final long z = 10000L;
    private static final long A = 10000000L;
    private static final long B = 600000000L;
    private static final long C = 36000000000L;
    private static final long D = 864000000000L;
    private static final eb[] E = new eb[]{new eb(10000L, 621355968000000000L, -9223372036854774999L, 9223372036854774999L, -984472800485477L, 860201606885477L), new eb(10000000L, 621355968000000000L, Long.MIN_VALUE, Long.MAX_VALUE, -984472800485L, 860201606885L), new eb(10000L, 621355968000000000L, -9223372036854774999L, 9223372036854774999L, -984472800485477L, 860201606885477L), new eb(1L, 504911232000000000L, -8718460804854775808L, Long.MAX_VALUE, Long.MIN_VALUE, 8718460804854775807L), new eb(1L, 0L, Long.MIN_VALUE, Long.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE), new eb(10000000L, 600527520000000000L, Long.MIN_VALUE, Long.MAX_VALUE, -982389955685L, 862284451685L), new eb(10000000L, 631139040000000000L, Long.MIN_VALUE, Long.MAX_VALUE, -985451107685L, 859223299685L), new eb(864000000000L, 599265216000000000L, Long.MIN_VALUE, Long.MAX_VALUE, -11368793L, 9981605L), new eb(864000000000L, 599265216000000000L, Long.MIN_VALUE, Long.MAX_VALUE, -11368793L, 9981605L), new eb(10L, 621355968000000000L, -9223372036854775804L, 0x7FFFFFFFFFFFFFFCL, -984472800485477580L, 860201606885477580L)};

    private ea() {
    }

    public static long a(long l2, int n2) {
        eb eb2 = ea.f(l2, n2);
        return (l2 + eb2.b) * eb2.a;
    }

    public static a a(double d2, int n2) {
        eb eb2 = ea.a(n2);
        a a2 = new a(String.valueOf(d2));
        a a3 = new a(eb2.a);
        a a4 = new a(eb2.b);
        return a2.a(a4).g(a3);
    }

    public static a b(long l2, int n2) {
        eb eb2 = ea.a(n2);
        a a2 = new a(l2);
        a a3 = new a(eb2.a);
        a a4 = new a(eb2.b);
        return a2.a(a4).g(a3);
    }

    public static a a(a a2, int n2) {
        eb eb2 = ea.a(n2);
        a a3 = new a(eb2.a);
        a a4 = new a(eb2.b);
        return a2.a(a4).g(a3);
    }

    public static long c(long l2, int n2) {
        eb eb2 = ea.e(l2, n2);
        if (l2 < 0L) {
            if (l2 < eb2.j) {
                return (l2 + eb2.i) / eb2.a - eb2.g;
            }
            return (l2 - eb2.i) / eb2.a - eb2.b;
        }
        if (l2 > eb2.k) {
            return (l2 - eb2.i) / eb2.a - eb2.h;
        }
        return (l2 + eb2.i) / eb2.a - eb2.b;
    }

    public static a d(long l2, int n2) {
        eb eb2 = ea.a(n2);
        a a2 = new a(l2);
        a a3 = new a(eb2.a);
        a a4 = new a(eb2.b);
        return a2.a(a3, 4).j(a4);
    }

    public static a b(a a2, int n2) {
        eb eb2 = ea.a(n2);
        a a3 = new a(eb2.a);
        a a4 = new a(eb2.b);
        return a2.a(a3, 4).j(a4);
    }

    private static eb a(int n2) {
        if (n2 < 0 || n2 >= 10) {
            throw new IllegalArgumentException("scale out of range: " + n2);
        }
        return E[n2];
    }

    public static long a(int n2, int n3) {
        eb eb2 = ea.a(n2);
        switch (n3) {
            case 0: {
                return eb2.a;
            }
            case 1: {
                return eb2.b;
            }
            case 2: {
                return eb2.c;
            }
            case 3: {
                return eb2.d;
            }
            case 4: {
                return eb2.e;
            }
            case 5: {
                return eb2.f;
            }
            case 6: {
                return eb2.g;
            }
            case 7: {
                return eb2.h;
            }
            case 8: {
                return eb2.i;
            }
            case 9: {
                return eb2.j;
            }
            case 10: {
                return eb2.k;
            }
        }
        throw new IllegalArgumentException("value out of range: " + n3);
    }

    private static eb e(long l2, int n2) {
        eb eb2 = ea.a(n2);
        if (l2 >= eb2.e && l2 <= eb2.f) {
            return eb2;
        }
        throw new IllegalArgumentException("universalTime out of range:" + l2);
    }

    private static eb f(long l2, int n2) {
        eb eb2 = ea.a(n2);
        if (l2 >= eb2.c && l2 <= eb2.d) {
            return eb2;
        }
        throw new IllegalArgumentException("otherTime out of range:" + l2);
    }

    public static a c(a a2, int n2) {
        eb eb2 = ea.a(n2);
        a a3 = new a(eb2.a);
        a a4 = new a(eb2.b);
        return a2.a(a3, 1).j(a4);
    }
}

