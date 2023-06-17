/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum aj {
    a(4),
    b(5),
    c(-1);

    private final byte d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aj() {
        void var3_1;
        this.d = var3_1;
    }

    public static aj a(byte by2) {
        return aj.b(by2);
    }

    public static aj b(byte by2) {
        for (aj aj2 : aj.values()) {
            if (aj2.d != by2) continue;
            return aj2;
        }
        return c;
    }

    public byte a() {
        return this.d;
    }
}

