/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum k {
    a(0),
    b(-1);

    private final byte c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k() {
        void var3_1;
        this.c = var3_1;
    }

    public static k a(byte by2) {
        return k.b(by2);
    }

    public static k b(byte by2) {
        for (k k2 : k.values()) {
            if (k2.c != by2) continue;
            return k2;
        }
        return b;
    }

    public byte a() {
        return this.c;
    }
}

