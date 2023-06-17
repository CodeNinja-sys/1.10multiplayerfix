/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum a {
    a(1),
    b(3),
    c(4),
    d(-1);

    private final byte e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a() {
        void var3_1;
        this.e = var3_1;
    }

    public static a a(byte by2) {
        return io.netty.c.a.j.a.b(by2);
    }

    public static a b(byte by2) {
        for (a a2 : io.netty.c.a.j.a.values()) {
            if (a2.e != by2) continue;
            return a2;
        }
        return d;
    }

    public byte a() {
        return this.e;
    }
}

