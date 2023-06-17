/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum v {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7),
    i(8),
    j(-1);

    private final byte k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private v() {
        void var3_1;
        this.k = var3_1;
    }

    public static v a(byte by2) {
        return v.b(by2);
    }

    public static v b(byte by2) {
        for (v v2 : v.values()) {
            if (v2.k != by2) continue;
            return v2;
        }
        return j;
    }

    public byte a() {
        return this.k;
    }
}

