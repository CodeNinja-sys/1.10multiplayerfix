/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

public enum ao {
    a(1),
    b(-1);

    private final byte c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ao() {
        void var3_1;
        this.c = var3_1;
    }

    public static ao a(byte by2) {
        return ao.b(by2);
    }

    public static ao b(byte by2) {
        for (ao ao2 : ao.values()) {
            if (ao2.c != by2) continue;
            return ao2;
        }
        return b;
    }

    public byte a() {
        return this.c;
    }
}

